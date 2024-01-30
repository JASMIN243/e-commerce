package com.jsp.Intime.Repository;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.Intime.Entity.Cart;
import com.jsp.Intime.Entity.User;

public interface CartRepository extends  JpaRepository <Cart,Integer>{
	public  List<Cart> findByUser(User user);	
	@Transactional
	public void deleteByIdAndUser(Integer id,User user);

}
