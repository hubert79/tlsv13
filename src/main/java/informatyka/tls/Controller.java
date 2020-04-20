package informatyka.tls;

import org.springframework.web.bind.annotation.GetMapping;
@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String show(){
        return "index";
    }
}
