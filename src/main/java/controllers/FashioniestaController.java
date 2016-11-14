package controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
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
	public String addProducts(@Valid @ModelAttribute(value="products") Products p,BindingResult result,HttpServletRequest request){
		if(result.hasErrors())
			return "Product";
		if(p.getId()==0){
			this.psi.addProducts(p);
		}else {
			this.psi.updateProducts(p);
		}
		
MultipartFile image=p.getProductImage();
byte[]bytes;
		if(image !=null && !image.isEmpty()){
		/*Path path=Paths.get("C:/Users/JAYA/Desktop/eclipse/workspace28/7.11/fashioniesta/src/main/webapp/resources/images/" +p.getId()+".jpg");*/
			/*Path path=Paths.get("/resources/images/" +p.getId()+".jpg");
							try {
								File file=new File(path.toString());
								if(!file.exists()){
									//file.createNewFile();
									image.transferTo(file);
									System.out.println("image added");
								}
								
							} catch (IllegalStateException e) {
								// TODO Auto-generated catch block
								
								e.printStackTrace();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}*/
			try
			{
				bytes=p.getProductImage().getBytes();
				psi.addProducts(p);
				System.out.println("DATA INSERTED");
				
				
				String path=request.getSession().getServletContext().getRealPath("/resources/images/"+p.getId()+".jpg");
				System.out.println("Path="+path);
				System.out.println("File Name="+p.getProductImage().getOriginalFilename());
				File f=new File(path);
				BufferedOutputStream bs=new BufferedOutputStream(new FileOutputStream(f));
				bs.write(bytes);
				bs.close();
				System.out.println("Image Uploaded");
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
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
	
	 
