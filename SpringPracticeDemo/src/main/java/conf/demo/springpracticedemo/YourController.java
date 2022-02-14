package conf.demo.springpracticedemo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class YourController
{
    @GetMapping("/myweb")
    public String homepage()
    {
        return "index";
    }
}