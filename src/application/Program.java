package application;

import java.time.LocalDate;

import modal.dao.DaoFactory;
import modal.dao.SellerDao;
import modal.entities.Department;
import modal.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");

		Seller seller = new Seller(21, "Bob", "Bob@gmail.com", LocalDate.now(), 3000.0, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);

		
		
	}

}
