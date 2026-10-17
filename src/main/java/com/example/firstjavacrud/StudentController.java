package com.example.firstjavacrud;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
@RestController
@RequestMapping("/students")
public class StudentController {
 private final StudentRepository repository;
 public StudentController(StudentRepository repository) { this.repository = repository; }
 @GetMapping public List<Student> all() { return repository.findAll(); }
 @PostMapping @ResponseStatus(HttpStatus.CREATED)
 public Student create(@RequestBody Student student) { student.setId(null); return repository.save(student); }
 @PutMapping("/{id}") public Student update(@PathVariable Long id, @RequestBody Student student) {
  Student existing = repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Student not found"));
  existing.setName(student.getName()); existing.setEmail(student.getEmail());
  return repository.save(existing);
 }
 @DeleteMapping("/{id}") @ResponseStatus(HttpStatus.NO_CONTENT)
 public void delete(@PathVariable Long id) {
  if (!repository.existsById(id)) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Student not found");
  repository.deleteById(id);
 }
 @GetMapping("/welcome") public String welcome() { return "Welcome to our Java CRUD application!"; }
}
