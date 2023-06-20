package com.pcwk.ehr.NotMember;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NotMemberDAOImpl implements NotMemberDAO {

    private final JdbcTemplate jdbcTemplate;

    public NotMemberDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(NotMemberVO notMember) {
        String sql = "INSERT INTO not_member (mbti, nickname, gender, ani) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, notMember.getMbti(), notMember.getNickname(), notMember.getGender(), notMember.getAni());
    }
}
