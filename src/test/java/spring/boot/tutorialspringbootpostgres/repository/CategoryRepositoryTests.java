package spring.boot.tutorialspringbootpostgres.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.boot.tutorialspringbootpostgres.model.Category;

@SpringBootTest
public class CategoryRepositoryTests {

    @Autowired
    private CategoryRepository employeeRepository;

    @Test
    public void create() {
        Category e1 = new Category();
        e1.setEmailId("teste 3");
        e1.setFirstName("teste 3");
        e1.setLastName("teste 3");

        employeeRepository.save(e1);
    }
}
