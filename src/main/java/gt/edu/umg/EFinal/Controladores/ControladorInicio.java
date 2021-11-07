/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.EFinal.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author anner
 */
@Controller
public class ControladorInicio {

    @GetMapping("/")
    public String inicio() {
        return "index";
    }

    

    @GetMapping("/usuario")
    public String usuario() {
        return "usuario";
    }


}
