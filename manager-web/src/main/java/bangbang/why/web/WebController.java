package bangbang.why.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/manager")
public class WebController {

    @RequestMapping("/index")
    public ModelAndView index(){
        System.out.println("manager index");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("param", "param");
        modelAndView.setViewName("manager");
        return modelAndView;
    }
}
