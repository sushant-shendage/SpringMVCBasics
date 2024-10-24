package springBasic.pack1;

 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	@GetMapping("/hi")
public String getHi() {
	return "home1.jsp";
}
}
