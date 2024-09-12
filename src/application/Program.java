package application;

import modal.dao.DaoFactory;
import modal.dao.SellerDao;
import modal.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		
		
	}

}
