package application;

import java.time.LocalDate;

import modal.entities.Department;
import modal.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");

		Seller seller = new Seller(21, "Bob", "Bob@gmail.com", LocalDate.now(), 3000.0, obj);
		
		System.out.println(seller);

		
		
	}

}
