package jsp05.cuong.models;

public class Users {
	public int userId, password, cmnd;
	public String fullName;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getCmnd() {
		return cmnd;
	}
	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Users(int userId, int password, int cmnd, String fullName) {
		super();
		this.userId = userId;
		this.password = password;
		this.cmnd = cmnd;
		this.fullName = fullName;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", password=" + password + ", cmnd=" + cmnd + ", fullName=" + fullName + "]";
	}

}
