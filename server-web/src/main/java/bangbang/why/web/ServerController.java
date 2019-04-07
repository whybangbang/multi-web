package bangbang.why.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/server")
@RestController
public class ServerController {

    @RequestMapping("/index")
    public String index(){
        return "server index...";
    }
}
