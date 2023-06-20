package com.pcwk.ehr.NotMember;
import org.springframework.stereotype.Service;

@Service
public class NotMemberServiceImpl implements NotMemberService {

    private final NotMemberDAO notMemberDAO;

    public NotMemberServiceImpl(NotMemberDAO notMemberDAO) {
        this.notMemberDAO = notMemberDAO;
    }

    @Override
    public void saveUserInfo(String mbti, String nickname, String gender, String zodiac) {
        NotMemberVO notMember = new NotMemberVO();
        notMember.setMbti(mbti);
        notMember.setNickname(nickname);
        notMember.setGender(gender);
        notMember.setZodiac(zodiac);

        notMemberDAO.save(notMember);
    }
}








