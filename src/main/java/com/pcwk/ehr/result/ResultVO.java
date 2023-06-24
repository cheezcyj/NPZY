package com.pcwk.ehr.result;

public class ResultVO {
	
	
	private String id;
	private String nick;
	private String mbtiSrc;
	private String aniSrc;
	private int luck_ty;
	private String luck;
	
	
	public ResultVO () {}


	public ResultVO(String id, String nick, String mbtiSrc, String aniSrc, int luck_ty, String luck) {
		super();
		this.id = id;
		this.nick = nick;
		this.mbtiSrc = mbtiSrc;
		this.aniSrc = aniSrc;
		this.luck_ty = luck_ty;
		this.luck = luck;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNick() {
		return nick;
	}


	public void setNick(String nick) {
		this.nick = nick;
	}


	public String getMbtiSrc() {
		return mbtiSrc;
	}


	public void setMbtiSrc(String mbtiSrc) {
		this.mbtiSrc = mbtiSrc;
	}


	public String getAniSrc() {
		return aniSrc;
	}


	public void setAniSrc(String aniSrc) {
		this.aniSrc = aniSrc;
	}


	public int getLuck_ty() {
		return luck_ty;
	}


	public void setLuck_ty(int luck_ty) {
		this.luck_ty = luck_ty;
	}


	public String getLuck() {
		return luck;
	}


	public void setLuck(String luck) {
		this.luck = luck;
	}


	@Override
	public String toString() {
		return "ResultVO [nick=" + nick + ", mbtiSrc=" + mbtiSrc + ", aniSrc=" + aniSrc + ", luck_ty=" + luck_ty
				+ ", luck=" + luck + "]";
	}



	
	
	




}
