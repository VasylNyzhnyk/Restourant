package welcome;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Welcome {

        @GetMapping("/welcome")
        public String welcome(@RequestParam(name="name", required=false, defaultValue="Welcome to our restourant")
                                               String name, Model model) {
            model.addAttribute("name", name);
            return "welcome";
        }



    }

