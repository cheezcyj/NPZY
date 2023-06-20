package com.pcwk.ehr.NotMember;

import java.sql.SQLException;

import com.pcwk.ehr.anno.domain.AnnoVO;

public interface NotMemberService {
		
    void saveUserInfo(String mbti, String nickname, String gender, String zodiac);
		
}
