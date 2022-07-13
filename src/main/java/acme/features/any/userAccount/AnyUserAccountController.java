package acme.features.any.userAccount;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import acme.framework.controllers.AbstractController;
import acme.framework.entities.UserAccount;
import acme.framework.roles.Any;


@Controller
public class AnyUserAccountController extends AbstractController<Any, UserAccount>{

	
	
		@Autowired
		protected AnyUserAccountListEnableService userAccountlistEnableService;
		
		@Autowired
		protected AnyUserAccountShowService 	  userAccountshowService;
		
		
		
		@PostConstruct
		protected void initialise() {
			super.addCommand("list-enabled-user-accounts","list", this.userAccountlistEnableService);
			super.addCommand("show", this.userAccountshowService);
		}
}
