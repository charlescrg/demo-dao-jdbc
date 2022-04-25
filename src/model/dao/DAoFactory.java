package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DAoFactory {
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}

}
