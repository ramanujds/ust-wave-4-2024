package com.ust.webapp.repository;


import com.ust.webapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task,Integer> {


   // @Query(value = "select * from todos where title=:title",nativeQuery = true)
    @Query(value = "from Task where title = :title")
    Task findByTitle(String title);


    List<Task> findByTitleStartsWith(String title);

}
