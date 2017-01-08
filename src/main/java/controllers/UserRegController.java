package controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Models.Authorities;
import Models.Users;
import Services.UserService;
import Services.UserServiceImpl;
@Controller
public class UserRegController {
	
	@Autowired
	private UserServiceImpl userService;
	
	/*public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}*/
	
	
	/*@RequestMapping("/login")
	public String login(){
						
						if(error!=null)
							Models.addAttribute("error", "Invalid UserNmae Or Password");
						
						if(logout !=null)
							Models.addAttribute("logout", "You Have Successfully Logged Out");
						
						return "login";
						
			}*/
	
	@RequestMapping("/login")
	public String login(@RequestParam(value="error",required=false) String error,@RequestParam(value="logout",required=false) String logout,Model model,HttpSession session,HttpServletRequest request){
						
						if(error!=null)
							model.addAttribute("error", "Invalid UserName Or Password");
						
						if(logout !=null)
							model.addAttribute("logout", "You Have Successfully Logged Out");
						
						
						return "login";
	}
	
	
	
	
	@RequestMapping("/registration")
	public ModelAndView registrationForm(){
		
		Authorities a=new Authorities();
		Users user=new Users();
		
		a.setAuthoritiesId(user.getUserId());
		
 
		
		return new ModelAndView("UserRegistration","user",user);
	}
	
	@ModelAttribute("customer")
	public Users createUsers()
	{
		return new Users();
	}
	
	@RequestMapping(value="/registration",method=RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute(value="user") Users user,BindingResult result, Model Models){
		
						if(result.hasErrors())
							return "UserRegistration";
						
						List<Users> userList=userService.getAllUsers();
						
						for(Users u :userList){
							
							
							
							if(user.getUsername().equals(u.getUsername())){
								
								Models.addAttribute("DuplicateUName", "<span style=\"color:red\">"+"UserName Already Exists"+"</span>");
								return"UserRegistration";
							}
							
					
							
						}
						
						userService.addUsers(user);
						Models.addAttribute("registrationSuccess", "Registered Successfully. Login using username and password");
						return "login";
	}

	
	

}
