package com.cts.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.entity.UserData;



// JPA Repository to interacts with database
@Repository
public interface UserDAO extends JpaRepository<UserData, String> {

}
