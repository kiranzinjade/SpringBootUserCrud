package com.web.cjc.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.cjc.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>  {

	User findByUname(String uname);
    User findByUid(Long uid);
}
