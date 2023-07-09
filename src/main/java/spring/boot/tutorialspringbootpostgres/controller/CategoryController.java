package spring.boot.tutorialspringbootpostgres.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.tutorialspringbootpostgres.model.Category;
import spring.boot.tutorialspringbootpostgres.service.CategoryService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class CategoryController {

    @Autowired
    private CategoryService employeeService;

    @GetMapping("/employees")
    public List<Category> findAll() {
        return employeeService.findAll();
    }

    @PostMapping("/employees")
    public Category save(@RequestBody Category employee) {
        return employeeService.save(employee);
    }

    @GetMapping("/employees/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
        return employeeService.findById(id);
	}

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Category> delete(@PathVariable Long id) {
        return employeeService.delete(id);
	}

    @PutMapping("/employees/{id}")
    public ResponseEntity<Category> update(@PathVariable Long id, @RequestBody Category employee) {
        return employeeService.update(id, employee);
    }
}
