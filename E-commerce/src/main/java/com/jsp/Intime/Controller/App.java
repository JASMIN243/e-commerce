package com.jsp.Intime.Controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsp.Intime.Entity.Cart;
import com.jsp.Intime.Entity.Homeproduct;
import com.jsp.Intime.Entity.OrderDetails;
import com.jsp.Intime.Entity.User;
import com.jsp.Intime.Repository.CartRepository;
import com.jsp.Intime.Repository.HomeProductsRepository;


@Controller
public class App {

	@Autowired
		private HomeProductsRepository repo;
		@Autowired
		private CartRepository cartrepo;
		@RequestMapping("/home")
		public String  displayMain(Model model) {
			List<Homeproduct> ls=repo.findAll();
			model.addAttribute("products", ls);
			return "Home";
		}
		
		@RequestMapping("/add")
		public String addCart(Integer path,HttpServletRequest req) {
			HttpSession s2=req.getSession();
			
					
			String data =(String)  s2.getAttribute("login");
			if(data!=null) {
				boolean sData = Boolean.parseBoolean(data);
				if(sData) {
			
			try {
				Homeproduct  hp =repo.findById(path).get();
				Cart c = new Cart();
				c.setId(hp. getId());
				c.setCompanyname(hp.getCompanyname());
				c.setFilepath(hp.getFilepath());
				c.setPrice(hp.getPrice());
				c.setTypeofcloth(hp.getTypeofcloth());
				c.setUser((User) s2.getAttribute("user"));
				cartrepo.save(c);
			     return "redirect:/home";
			}
		
	    catch(Exception e) {
		
		
	}
		}
	}
			return "Login";
		}
		
		@GetMapping("/displayCarts")
		public String displayCart(HttpServletRequest req ,Model model) {
			HttpSession s2=req.getSession();
			String data =(String)  s2.getAttribute("login");
			if(data!=null) {
				     boolean sData = Boolean.parseBoolean(data);
				     System.out.println(sData);
				      if(sData) {
					       User u =(User) s2.getAttribute("user");
					      List<Cart> list = cartrepo.findByUser(u);
					        model.addAttribute("carts", list);
					       return "Cart";
				      }
			
			          else 
			          {
				       return "Login";
			          }
		       }
			else
			{
				return "Login";
			}
		}
		
		
		@RequestMapping("/deleteCart")
		public String deleteItem(Integer id, HttpServletRequest req) {
			HttpSession s3= req.getSession();
			User user =(User) s3.getAttribute("user");
			cartrepo.deleteByIdAndUser(id,user);
			return "redirect:/displayCarts";
			
			
		}
		
		
		@RequestMapping("/checkInfo")
		public String checkLogin(HttpServletRequest req,Model model) {
			HttpSession  s4 = req.getSession();
			String data =(String) s4.getAttribute("login");
			boolean check = Boolean.parseBoolean(data);
			if(check)
			{
				User u  =(User)s4.getAttribute("user");
				model.addAttribute("presentuser",u);
				return "ProfileInfo";
			}
			else {
				return "Login";
			}
			
		}
		@RequestMapping("/logout")
		public  String logout(HttpServletRequest req) {
			HttpSession s5 =req.getSession();
			s5.setAttribute("login","false");
			return "redirect/home";
			
		}
		@RequestMapping("/place")
		public String order(Integer id,Model model) {
			Cart c =cartrepo.findById(id).get();
			model.addAttribute("orderCart",c);
			return "OrderConfirmation";
		}
		@RequestMapping("/pay")
		public String payment(OrderDetails details,Model model)
		{
			model.addAttribute("details", details);
			return "Payment";
		}
		
		@RequestMapping("/payCheck")
		public String paymentChecking(OrderDetails completeDetails) {
			System.out.println(completeDetails);
			return "Order placed...@@";
		}

}
