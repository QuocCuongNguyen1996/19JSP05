package jsp05.cuong.connect;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Vector;

import jsp05.cuong.models.Category;

public class ConnectCategory extends Connect {

	public Vector<Category> layToanBoCategory() {
		Vector<Category> v = new Vector<Category>();
		try {
			myStatement = myConnect.createStatement();
			String sql = "SELECT * FROM Category";
			myResultset = myStatement.executeQuery(sql);
			while (myResultset.next()) {
				int categoryId = myResultset.getInt(1);
				String nameCategory = myResultset.getString(2);
				int detailId = myResultset.getInt(3);
				String nameDetail = myResultset.getString(4);
				Category catete = new Category(categoryId, nameCategory, detailId, nameDetail);
				v.add(catete);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return v;
	}

	public ArrayList<Category> timCategoryTheoId(int idCategory) {
		ArrayList<Category> dsCategory = new ArrayList<Category>();
		try {
			String sqll = "select * from Category where CategoryID=?";
			PreparedStatement preStatement = myConnect.prepareStatement(sqll);
			preStatement.setInt(1, idCategory);
			myResultset = preStatement.executeQuery();
			while (myResultset.next()) {
				Category catta = new Category();
				catta.setCategoryId(myResultset.getInt(1));
				catta.setNameCategory(myResultset.getString(2));
				catta.setDetailId(myResultset.getInt(3));
				catta.setNameDetail(myResultset.getString(4));
				dsCategory.add(catta);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return dsCategory;
	}

	public void themCategory(String nameCategory, int detailId, String nameDetail) {
		try {
			String sqlll = "Insert into Category(NameCategory,DetailID,NameDetail) values(?,?,?)";
			PreparedStatement pre = myConnect.prepareStatement(sqlll);
			pre.setString(1, nameCategory);
			pre.setInt(2, detailId);
			pre.setString(3, nameDetail);
			int rc = pre.executeUpdate();
			myConnect.close();
			if (rc != 1)
				throw new RuntimeException("Fail insert new Category!!!");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void capNhatCategory(int categoryId, String nameCategory, int detailId, String nameDetail) {
		try {
			String sqllll = "Update Category set NameCategory=?,DetailID=?,NameDetail=? where CategoryID=? ";
			PreparedStatement preS = myConnect.prepareStatement(sqllll);
			preS.setString(1, nameCategory);
			preS.setInt(2, detailId);
			preS.setString(3, nameDetail);
			preS.setInt(4, categoryId);
			int rcc = preS.executeUpdate();
			myConnect.close();
			if (rcc < 1)
				throw new RuntimeException("Fail update Category!!!");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void xoaCategory() {

	}

}
