package application;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import modal.dao.DaoFactory;
import modal.dao.SellerDao;
import modal.entities.Department;
import modal.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("=== TEST 2: seller findByDepartment =====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TEST 3: seller findAll =====");
		list = sellerDao.findAll();
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		/*System.out.println("=== TEST 4: seller Insert =====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(0), 400.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! new id = " + newSeller.getId());*/
		
		System.out.println("=== TEST 5: seller Update =====");
		seller = sellerDao.findById(1);
		seller.setName("Martha waine");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println("=== TEST 6: seller Delete =====");
		System.out.println("Enter id for delete test: ");
		Integer idDelete = sc.nextInt();
		sellerDao.deleteById(idDelete);
		System.out.println("Delete completed!");
		
		sc.close();
	}

}
