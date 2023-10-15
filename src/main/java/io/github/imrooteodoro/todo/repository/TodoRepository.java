package io.github.imrooteodoro.todo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import io.github.imrooteodoro.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
	
}