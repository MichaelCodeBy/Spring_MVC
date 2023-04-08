package by.michael.springcourse.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
   /* public String helloPage(HttpServletRequest request) {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
*/
    public String helloPage(@RequestParam(value= "name", required = false) String name,
                            @RequestParam (value = "surname", required = false) String surname,
                            Model model) {

        //System.out.println("hello, "+name + " "+surname);

model.addAttribute( "message","hello, "+name + " "+surname);

        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }
}