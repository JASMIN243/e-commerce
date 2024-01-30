package com.jsp.Intime.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.Intime.Entity.Cart;
import com.jsp.Intime.Entity.User;
@Repository
public interface UserRepository  extends JpaRepository<User,  String>
{

}
