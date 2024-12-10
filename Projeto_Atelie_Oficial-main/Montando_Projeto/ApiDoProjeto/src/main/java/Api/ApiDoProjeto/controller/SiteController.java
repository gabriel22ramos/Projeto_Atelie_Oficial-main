package Api.ApiDoProjeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SiteController {

    @GetMapping
    public String carregarPaginaIndex() {
        return "homepage";
    }

    @GetMapping("/login")
    public String carregaPaginaLogin() {
        return "autenticacao/login";
    }

 

    
    // @GetMapping("/logout")
    // public String logout() {
    //     return "logout";
    // }

}