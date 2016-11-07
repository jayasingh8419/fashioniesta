package controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Models.Products;
//import Services.productservices;
import Services.ProductServicesImpl;
import daoimpl.ProductsDAOImpl;
@Controller
public class FashioniestaController {
	
	
	@Autowired
	private ProductServicesImpl psi;


	@ModelAttribute("products")
	public Products create()
	{
		return new Products();
	}
	
	@RequestMapping(value="/products", method= RequestMethod.GET)
	public String listProducts(Model Models){
	Models.addAttribute("products", new Products());
	Models.addAttribute("listofProducts",this.psi.listofProducts());
	return "Product";
	}
	@RequestMapping(value="/products/add",method=RequestMethod.POST)
	public String addProducts(@ModelAttribute("products") Products p){
		if(p.getId()==0){
			this.psi.addProducts(p);
		}else {
			this.psi.updateProducts(p);
		}
		return "redirect:/stock";
	}
	
	@RequestMapping("/remove/{id}")
	public String removeProducts(@PathVariable("id")int id){
		this.psi.removeProducts(id);
		return "redirect:/stock";
	}
	
	@RequestMapping("/edit/{id}")
	public String updateProducts(@PathVariable("id") int id,Model Models){
		Models.addAttribute("products",this.psi.getProductsById(id));
		Models.addAttribute("listProducts",this.psi.listofProducts());
		return "redirect:/stock";
	}
	
	@RequestMapping("/stock")
	public ModelAndView loadStock()
	{
		ModelAndView mv=new ModelAndView("Product");
		List<Products> plist=new ArrayList<Products>();
	    plist= psi.getAll();
		mv.addObject("listofProducts", plist);
		return mv;
		}
	
	@RequestMapping("/datatable")
	public ModelAndView loadDatatable()
	{
		ModelAndView mv=new ModelAndView("ProductDetailsUser");
		List<Products> plist=new ArrayList<Products>();
	    plist= psi.getAll();
		mv.addObject("listofProducts", plist);
		return mv;
		}
	

	
	public String loadProducts(){
		return "redirect:/Product";
	}
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String loadIndex()
	{
		return "index";
	}
	
	@RequestMapping("aboutus")
	public String loadAboutus()
	{
			return "Aboutus";
	}
	
	@RequestMapping("contactus")
	public String loadContactus()
	{
			return "Contactus";
	}
	@RequestMapping("returnback")
	public String loadHome()
	{
			return "index";
	}


}
	
	 
