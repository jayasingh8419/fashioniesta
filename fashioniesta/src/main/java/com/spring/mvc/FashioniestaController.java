/*package com.spring.mvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import models.Book;
import models.Products;
import models.User;
import service.BookService;
import service.service;


@Controller
public class FashioniestaController {
	
	@Autowired
	private service ps;
	private BookService bookService;
	private BookService bookServices;
	
	
	
	
	@Autowired
	public FashioniestaController(service ps) {
		// TODO Auto-generated constructor stub
		this.ps=ps;
	}

		@RequestMapping("/")
	public ModelAndView helloWorld(){
		return new ModelAndView("welcome","message","Hello World");
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

	@RequestMapping("/datatable")
	public ModelAndView loadDatatable()
	
	{
		ModelAndView mv=new ModelAndView("DataTable");
		List<Products> plist=new ArrayList<Products>();
		
		plist=ps.getAll();
		//pdi.addProduct();
		//pdi.viewProducts();
		
		//plist=pdi.viewProducts();
		
		//Products p=new Products();
		//p=(Products)plist.get(0);
		
		//System.out.println(p.getName());
		mv.addObject("listofProducts", plist);
		return mv;
		//return "DataTable";
	}
	
	
	 @RequestMapping(value = "/register",method = RequestMethod.GET)
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
	 
	 @RequestMapping(value = "/Register",method = RequestMethod.GET)
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
			
	 }
	    
		@RequestMapping("/register")
		public String RegisterController(Map<String, Object> model) {
		 
			//ModelandView model=new Model();
		    //@RequestMapping(method = RequestMethod.GET)
		    //public String viewRegistration(Map<String, Object> model) {
		        User userForm = new User();    
		        model.put("userForm", userForm);
		         
		        List<String> professionList = new ArrayList<String>();
		        professionList.add("Developer");
		        professionList.add("Designer");
		        professionList.add("IT Manager");
		        model.put("professionList", professionList);
		         
		        return "Registration";
		    }
		     
		    @RequestMapping(value ="/Register",method = RequestMethod.GET)
		    public String processRegistration(@ModelAttribute("userForm") User user,
		            Map<String, Object> model) {
		         
		    	
		    	 @RequestMapping(value = "/Register", method = RequestMethod.GET)
		    	    public String success(Map<String, Object> model)
		    	    {
		    	         return "RegistrationSuccess";
		    	    }
		        // implement your own registration logic here...
		         
		        // for testing purpose:
		        System.out.println("username: " + user.getUsername());
		        System.out.println("password: " + user.getPassword());
		        System.out.println("email: " + user.getEmail());
		        System.out.println("birth date: " + user.getBirthDate());
		        System.out.println("profession: " + user.getProfession());
		         
		        return "RegistrationSuccess";
		    }
		    
		    public BookService getBookService() {
		    	return bookService;
		    }

		    public void setBookService(BookService bookService) {
		    	this.bookService = bookService;
		    }
		    
		    @RequestMapping("/getAllBooks")
		    public ModelAndView getAllProducts(){
		    	List<Book> books = bookService.getAllBooks();
		    	return new ModelAndView("booksList","books",books);
		    }

}

*/







package com.spring.mvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import models.Products;
import models.User;
import service.service;


@Controller
public class FashioniestaController {
	
	@Autowired
	private service ps;
	
	/*@Autowired
	public FashioniestaController(service ps) {
		// TODO Auto-generated constructor stub
		this.ps=ps;
	}*/

		/*@RequestMapping("/")
	public ModelAndView helloWorld(){
		return new ModelAndView("welcome","message","Hello World");
		}*/
	
	@RequestMapping("/")
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

	@RequestMapping("/datatable")
	public ModelAndView loadDatatable()
	
	{
		ModelAndView mv=new ModelAndView("DataTable");
		List<Products> plist=new ArrayList<Products>();
		
		plist=ps.getAll();
		//pdi.addProduct();
		//pdi.viewProducts();
		
		//plist=pdi.viewProducts();
		
		//Products p=new Products();
		//p=(Products)plist.get(0);
		
		//System.out.println(p.getName());
		mv.addObject("listofProducts", plist);
		return mv;
		//return "DataTable";
	}
	
    @RequestMapping(value = "/register",method = RequestMethod.GET)
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
    
	/*@RequestMapping("/register")
	public String RegisterController(Map<String, Object> model) {
	 
		//ModelandView model=new Model();
	    //@RequestMapping(method = RequestMethod.GET)
	    //public String viewRegistration(Map<String, Object> model) {
	        User userForm = new User();    
	        model.put("userForm", userForm);
	         
	        List<String> professionList = new ArrayList<String>();
	        professionList.add("Developer");
	        professionList.add("Designer");
	        professionList.add("IT Manager");
	        model.put("professionList", professionList);
	         
	        return "Registration";
	    }
	     */
	  /*  @RequestMapping(value = "/register",method = RequestMethod.GET)
	    public String viewRegistration(Map<method = RequestMethod.POST)
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
	    }*/
    
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
	}
	}
