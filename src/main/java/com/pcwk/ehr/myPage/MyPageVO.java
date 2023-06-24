package com.pcwk.ehr.myPage;

public class MyPageVO {
//	private String Id;// 회원id
//	private String nickName;// 이름
//	private String passwd;// 비번
//	private int mbti;

	private  String Id;
	
	private String nickName;


	public MyPageVO() {
	}


	@java.lang.Override
	public java.lang.String toString() {
		return "MyPageVO{" +
				"Id='" + Id + '\'' +
				", nickName='" + nickName + '\'' +
				'}';
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
}
