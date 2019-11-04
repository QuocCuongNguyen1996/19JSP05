package jsp05.cuong.models;

public class Category {
	public int categoryId, detailId;
	public String nameCategory, NameDetail;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getDetailId() {
		return detailId;
	}

	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}

	public String getNameCategory() {
		return nameCategory;
	}

	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}

	public String getNameDetail() {
		return NameDetail;
	}

	public void setNameDetail(String nameDetail) {
		NameDetail = nameDetail;
	}

	public Category(int categoryId, String nameCategory, int detailId, String nameDetail) {
		super();
		this.categoryId = categoryId;
		this.detailId = detailId;
		this.nameCategory = nameCategory;
		NameDetail = nameDetail;
	}

	public Category() {

	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", detailId=" + detailId + ", nameCategory=" + nameCategory
				+ ", NameDetail=" + NameDetail + "]";
	}

}
