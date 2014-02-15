package hello;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Hello {

	final String world = "Hello World!!";
	private String name;
	
	public Hello() {}
	
	public String getWorld() {
		
		return world;
		
	} // end getWorld()
	
	public String getName() {
		
		return name;
		
	}
	
	public void setName(String user_name) {
		
		this.name = user_name;
		
	}
	
} // end class Hello
