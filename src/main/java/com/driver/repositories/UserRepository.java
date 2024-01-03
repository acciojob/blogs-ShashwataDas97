package com.driver.repositories;
import com.driver.models.Blog;
import com.driver.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends CrudRepository < User, Integer > {

}