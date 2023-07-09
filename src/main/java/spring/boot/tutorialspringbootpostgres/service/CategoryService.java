package spring.boot.tutorialspringbootpostgres.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import spring.boot.tutorialspringbootpostgres.exception.ResourceNotFoundException;
import spring.boot.tutorialspringbootpostgres.model.Category;
import spring.boot.tutorialspringbootpostgres.repository.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository employeeRepository;

    public List<Category> findAll() {
        return employeeRepository.findAll();
    }

    public Category save(Category employee) {
        return employeeRepository.save(employee);
    }

    public ResponseEntity<Category> findById(Long id) {
        Category employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
        return ResponseEntity.ok(employee);
    }

    public ResponseEntity<Category> delete(Long id) {
        Category employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
        employeeRepository.delete(employee);
        return ResponseEntity.ok(employee);
    }

    public ResponseEntity<Category> update(Long id, Category employee) {
        Category result = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
        
        result.setFirstName(employee.getFirstName());
        result.setLastName(employee.getLastName());
        result.setEmailId(employee.getEmailId());
        employeeRepository.save(result);

        return ResponseEntity.ok(result);
    }
}
