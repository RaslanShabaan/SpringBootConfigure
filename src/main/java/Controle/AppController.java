package Controle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {


@RequestMapping("/hellow")
    public String hell()
{

    return "000000000000000000000000";
}
}
