package com.pcwk.ehr.NotMember;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NotMemberController {

    private final NotMemberService notMemberService;

    public NotMemberController(NotMemberService notMemberService) {
        this.notMemberService = notMemberService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showForm() {
        return "input-form";
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String submitForm(
            @RequestParam("mbti") String mbti,
            @RequestParam("nickname") String nickname,
            @RequestParam("gender") String gender,
            @RequestParam("ani") String ani,
            Model model
    ) {
        notMemberService.saveUserInfo(mbti, nickname, gender, "ani");

        model.addAttribute("mbti", mbti);
        model.addAttribute("nickname", nickname);
        model.addAttribute("gender", gender);
        model.addAttribute("ani", "ani");

        return "result-page";
    }
}
