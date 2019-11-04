package jsp05.cuong.models;

public class News {
	public int newsId, categoryId, userId;
	public String content, title;
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public News(int newsId, int categoryId, int userId, String content, String title) {
		super();
		this.newsId = newsId;
		this.categoryId = categoryId;
		this.userId = userId;
		this.content = content;
		this.title = title;
	}
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", categoryId=" + categoryId + ", userId=" + userId + ", content=" + content
				+ ", title=" + title + "]";
	}

}
