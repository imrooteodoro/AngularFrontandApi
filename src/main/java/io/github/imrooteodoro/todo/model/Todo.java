package io.github.imrooteodoro.todo.model;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Todo {
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getDone() {
		return done;
	}

	public void setDone(Boolean done) {
		this.done = done;
	}

	public LocalDateTime getDoneDate() {
		return doneDate;
	}

	public void setDoneDate(LocalDateTime doneDate) {
		this.doneDate = doneDate;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String description;
	
	@Column
	private Boolean done;
	
	@Column
	@JsonFormat(pattern = "dd/MM/yyy HH:mm")
	private LocalDateTime doneDate;
	
	@Column
	@JsonFormat(pattern = "dd/MM/yyy HH:mm")
	private LocalDateTime createdDate;

	public LocalDateTime getcreatedDate() {
		this.createdDate = LocalDateTime.now();
		return createdDate;
	}

	public void setcreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
		createdDate = LocalDateTime.now();
	}
	

	
	

}
