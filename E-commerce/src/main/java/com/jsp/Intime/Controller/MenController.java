package com.jsp.Intime.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsp.Intime.Entity.Cart;
import com.jsp.Intime.Entity.Homeproduct;
import com.jsp.Intime.Entity.MenProducts;
import com.jsp.Intime.Entity.User;
import com.jsp.Intime.Repository.CartRepository;
import com.jsp.Intime.Repository.MenRepository;
@Controller
public class MenController{
	@Autowired
	private MenRepository menRepo;
	@Autowired
	private CartRepository cartrepo;
	@RequestMapping("/men")
	public String displayMen(Model model) {
		List<MenProducts> ls = menRepo.findAll();
		model.addAttribute("menProducts",ls);
		return "Men";
		
	}
	
	@RequestMapping("/menadd")
	public String addCart(Integer path,HttpServletRequest req) {
		HttpSession s2=req.getSession();
		String data =(String)  s2.getAttribute("login");
		if(data!=null) {
			boolean sData = Boolean.parseBoolean(data);
			if(sData) {
		
		try {
			MenProducts  mp =menRepo.findById(path).get();
			Cart c = new Cart();
			c.setId(mp.getId());
			c.setCompanyname(mp.getCompanyName());
			c.setPrice(mp.getPrice());
			c.setFilepath(mp.getFilePath());
			c.setTypeofcloth(mp.getTypeOfCloth());
			c.setUser((User) s2.getAttribute("user"));
			cartrepo.save(c);
		     return "redirect:/men";
		}
	
    catch(Exception e) {
	
	
}
	}
}
		return "Login";

}
}
