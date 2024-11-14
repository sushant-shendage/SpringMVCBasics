package springBasic.pack1;

 
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
 

@Controller
public class MyController {
	@GetMapping("/hi")
public String getHi() {
	return "home1.jsp";
}
	
	@GetMapping("/sum1")
	public void register1( @RequestParam int n1,@RequestParam int n2,HttpServletResponse resp) throws IOException {
		PrintWriter pw=resp.getWriter();
		int result=n1+n2;
		
		pw.print("<h1>"+result+"</h1>");
		 
	}
}
