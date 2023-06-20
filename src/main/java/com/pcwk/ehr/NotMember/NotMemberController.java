package com.pcwk.ehr.NotMember;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NotMemberController {

    private final NotMemberService notMemberService;

    public NotMemberController(NotMemberService notMemberService) {
        this.notMemberService = notMemberService;
    }

    @GetMapping("/")
    public String showForm() {
        return "input-form";
    }

    @PostMapping("/submit")
    public String submitForm(
            @RequestParam("mbti") String mbti,
            @RequestParam("nickname") String nickname,
            @RequestParam("gender") String gender,
            @RequestParam("zodiac") String zodiac,
            Model model
    ) {
        notMemberService.saveUserInfo(mbti, nickname, gender, zodiac);

        model.addAttribute("mbti", mbti);
        model.addAttribute("nickname", nickname);
        model.addAttribute("gender", gender);
        model.addAttribute("zodiac", zodiac);

        return "result-page";
    }
}
