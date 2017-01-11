package com.spring.controlller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.Products;
import com.spring.services.ProductsService;

@Controller
public class FashioniestaController {
	
	@Autowired(required = true)
	public ProductsService productsService;
	
	
	
	public ProductsService getProductsService() {
		return productsService;
	}
	
	public void setProductsService(ProductsService productsService) {
		this.productsService = productsService;
	}

	@RequestMapping(value = "/aboutUs", method = RequestMethod.GET)
	public String aboutUs() {
	    return "aboutUs";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home(){
		return "home";
	}
	
	
	@RequestMapping("/login")
	public String login(@RequestParam(value="error",required=false) String error,@RequestParam(value="logout",required=false) String logout,Model model){
						
						if(error!=null)
							model.addAttribute("error", "Invalid UserNmae Or Password");
						
						if(logout !=null)
							model.addAttribute("logout", "You Have Successfully Logged Out");
						
						//session=request.getSession();
						//session.setAttribute("username", new Users().getUsername());
						
						return "login";
	}
	

	
/*@RequestMapping("/getProductsById/{id}")
	
	public ModelAndView getBookByIsbn(@PathVariable(value="id") int id){
		
		Products p=(Products) productsService.getProductsById(id);
		//System.out.println("InSide & Before Redirect");
		return new ModelAndView("productPage" , "productObj" , p);
		
	}*/



	
	
	

	

	
}
