package spring.boot.tutorialspringbootpostgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.boot.tutorialspringbootpostgres.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
