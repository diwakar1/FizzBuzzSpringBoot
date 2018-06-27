package com.example.fizzbuzz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class HomeController {


    @GetMapping("/")
    public String getFizzBuzz(Model model){
     model.addAttribute( "fizzbuzz",new FizzBuzz());
     return "fizzbuzz";

    }
    @PostMapping("/process")
    public String processFizzBuzz(@Valid @ModelAttribute("fizzbuzz") FizzBuzz fizzbuzz, BindingResult
                                  result, Model model){
        if(result.hasErrors()){

            return "fizzbuzz";
        }
        ArrayList<String>resul = fizzbuzz.show(fizzbuzz.getStartNumber(),
                fizzbuzz.getEndNumber());

        model.addAttribute("show",resul);
        return "resultshow";

    }

}
