package com.pcwk.ehr.NotMember;
import org.springframework.stereotype.Service;

@Service
public class NotMemberServiceImpl implements NotMemberService {

    private final NotMemberDAO notMemberDAO;

    public NotMemberServiceImpl(NotMemberDAO notMemberDAO) {
        this.notMemberDAO = notMemberDAO;
    }

    public void saveUserInfo(String mbti, String nickname, String gender, String ani) {
        NotMemberVO notMember = new NotMemberVO();
        notMember.setMbti(mbti);
        notMember.setNickname(nickname);
        notMember.setGender(gender);
        notMember.setAni(ani);

        notMemberDAO.save(notMember);
    }
}








