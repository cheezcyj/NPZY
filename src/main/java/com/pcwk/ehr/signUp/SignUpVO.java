package com.pcwk.ehr.signUp;

public class SignUpVO {
	

	private String   id;	     // 회원 아이디
	private String   password;   // 비밀번호
	private String   nickname;   // 닉네임	
	private int	     ani;  	     // 띠 
	private int      mbti;       // mbti
	private String   gender;     // 성별
	
	
	
	public SignUpVO() {

	}
	
	public SignUpVO(String id, String password, String nickname, int ani, int mbti, String gender) {
		super();
		this.id = id;
		this.password = password;
		this.nickname = nickname;
		this.ani = ani;
		this.mbti = mbti;
		this.gender = gender;
	}

	
	public String getId() {
		return id;
	}

	
	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public int getAni() {
		return ani;
	}


	public void setAni(int ani) {
		this.ani = ani;
	}


	public int getMbti() {
		return mbti;
	}


	public void setMbti(int mbti) {
		this.mbti = mbti;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "SignUpVO [id=" + id + ", password=" + password + ", nickname=" + nickname + ", ani=" + ani + ", mbti="
				+ mbti + ", gender=" + gender + "]";
	}
	
}	