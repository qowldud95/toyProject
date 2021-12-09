package project.demo.controller;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import project.demo.dto.IdPwGetDto;
import project.demo.service.MemberLoginServiceImple;


@Log4j2
@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class MainController {

    private final MemberLoginServiceImple ml;

    @GetMapping
    public String mainPage(){
        return "main.html";
    }
    @GetMapping("login")
    public String loginPage(@ModelAttribute("member") IdPwGetDto idPwGetDto){
        return "login.html";
    }
    @PostMapping("login")
    public String loginInfo(@Validated @ModelAttribute("member") IdPwGetDto idPwGetDto, BindingResult bindingResult){
        log.info("idPwGetDto ={}",idPwGetDto);
        if(bindingResult.hasErrors()) {
            return "login";
        }
        boolean idSamePw = ml.idSamePw(idPwGetDto);
        if(!idSamePw) {
            return "login";
        }
        return "main.html";
    }


}
