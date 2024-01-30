package com.jsp.Intime.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.Intime.Entity.Cart;
import com.jsp.Intime.Entity.User;
import com.jsp.Intime.Repository.UserRepository;

@Controller
public class UserController {
	@Autowired
	private UserRepository urepo;
	@GetMapping("/alluser")
	public List<User> getUsers(Model model){
		return urepo.findAll();
	}
	@RequestMapping("/users")
	public String addUser(User user) {
		urepo. save(user);
		return "Login";
	}
	@GetMapping("/user")
	public ModelAndView  testUser(String mobile, String password , HttpServletRequest request ) {
		ModelAndView  mv = new ModelAndView("Login");
		
		try {
			User u = urepo.findById(mobile).get();
			if(u.getUserPassword().equals(password)) {
				HttpSession s3 =request.getSession();
				s3.setAttribute(password, u);
				mv.addObject("status","true");
			}
			else {
				mv.addObject("status","false");
			}
			return mv;
		}
	 catch(Exception e) {
		 mv.addObject("status","false");
		 return mv;
	 }
	}
	
}
	
		
	
		
		

	
	
	


