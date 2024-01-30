package com.jsp.Intime.Controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsp.Intime.Entity.Cart;
import com.jsp.Intime.Entity.User;
import com.jsp.Intime.Entity.WomenProducts;
import com.jsp.Intime.Repository.CartRepository;
import com.jsp.Intime.Repository.WomenRepository;
@Controller
public class WomenController {
	@Autowired
	private WomenRepository womenRepo;
	@Autowired
	private CartRepository cartrepo;
	@RequestMapping("/women")
	public String displayWomen(Model model) {
		List<WomenProducts> ls = womenRepo.findAll();
		model.addAttribute("womenProducts",ls);
		return "Women";
		
	}
	
	@RequestMapping("/womenadd")
	public String addCart(Integer path,HttpServletRequest req) {
		HttpSession s2=req.getSession();
		String data =(String)  s2.getAttribute("login");
		if(data!=null) {
			boolean sData = Boolean.parseBoolean(data);
			if(sData) {
		
		try {
			WomenProducts  wp =womenRepo.findById(path).get();
			Cart c = new Cart();
			c.setId(wp.getId());
			c.setCompanyname(wp.getCompanyName());
			c.setPrice(wp.getPrice());
			c.setFilepath(wp.getFilePath());
			c.setTypeofcloth(wp.getTypeOfCloth());
			c.setUser((User) s2.getAttribute("user"));
			cartrepo.save(c);
		     return "redirect:/women";
		}
	
    catch(Exception e) {
	
	
}
	}
}
		return "Login";

}
}
