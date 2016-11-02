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
	
	
	
	/*@RequestMapping(value = "/register",method = RequestMethod.GET)
    public String viewRegistration(Map<String, Object> model) {
        User userForm = new User();    
        model.put("userForm", userForm);
         
        List<String> professionList = new ArrayList<String>();
        professionList.add("Developer");
        professionList.add("Designer");
        professionList.add("IT Manager");
        model.put("professionList", professionList);
         
        return "Registration";
    }
	
	 @RequestMapping(value = "/register",method = RequestMethod.POST)
		public String processRegistration(@ModelAttribute("userForm") User user, 
				Map<String, Object> model) {
			
			// implement your own registration logic here...
			
			// for testing purpose:
			System.out.println("username: " + user.getUsername());
			System.out.println("password: " + user.getPassword());
			System.out.println("email: " + user.getEmail());
			System.out.println("birth date: " + user.getBirthDate());
			System.out.println("profession: " + user.getProfession());
			
			return "RegistrationSuccess";
	
	*/
	
	@RequestMapping("/login")
	public String login(@RequestParam(value="error",required=false) String error,
			@RequestParam(value="logout",required=false) String logout, 
			Model Models){
			if(error!=null)
				Models.addAttribute("error","Invalid username and password");
		
		if(logout!=null)
			Models.addAttribute("logout","You have logged out successfully");
		return "login";
	}

	
	/*@Autowired(required=false)
	private ProductServicesImpl ps;
	
	
	
	@Qualifier(value="ps")
	public void setproductservicesImpl(ProductServicesImpl ps){
		this.ps=ps;
	}
	*/
	
	@Autowired
	/*@Qualifier("psi")*/
	private ProductServicesImpl psi;

	
	
	/*public void setPsi(ProductServicesImpl psi) {
		this.psi = psi;
	}*/

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
	//ProductsDAOImpl pdi;
	
	/*@Autowired
	public HomeController(ProductsDAOImpl pdi) {
		// TODO Auto-generated constructor stub
		
		this.pdi=pdi;
	}*/
	
	
	@RequestMapping("/stock")
	public ModelAndView loadDatatable()
	{
		ModelAndView mv=new ModelAndView("Product");
		List<Products> plist=new ArrayList<Products>();
	    plist= psi.getAll();
		
		//ProductsDAOImpl pdi=new ProductsDAOImpl();
		//pdi.addProduct();
		//pdi.viewProducts();
		
		//plist=pdi.viewProducts();
		
		//Products p=new Products();
		//p=(Products)plist.get(0);
		
		//System.out.println(p.getName());
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
	
	 





















