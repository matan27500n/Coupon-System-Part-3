package com.johnbryce.app.util;

import java.util.List;
import org.springframework.stereotype.Component;
import com.johnbryce.app.beans.Company;
import com.johnbryce.app.beans.Coupon;
import com.johnbryce.app.beans.Customer;

@Component
public class PrintUtils {

	public void printCompaniesWithOutCoupon(List<Company> companies) {
		System.out.printf("%5s %10s %20s %20s", "CompanyID", "Name", "Email", "Password");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------");
		for (Company company : companies) {
			System.out.format("%5s %15s %25s %10s", company.getId(), company.getName(), company.getEmail(),
					company.getPassword());
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println();
	}

	public void printCompanies(List<Coupon> coupons, List<Company> companies) {
		for (int i = 0; i < companies.size(); i++) {
			for (int j = 0; j < coupons.size(); j++) {
				if (companies.get(i).getId() == coupons.get(j).getCompanyID()) {
					List<Coupon> tmp = companies.get(i).getCoupons();
					tmp.add(coupons.get(j));
					companies.get(i).setCoupons(tmp);
				}
			}
		}
		System.out.printf("%5s %10s %20s %20s %20s", "CompanyID", "Name", "Email", "Password", "Coupons");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------");
		for (Company company : companies) {
			System.out.format("%5s %15s %25s %10s %15s", company.getId(), company.getName(), company.getEmail(),
					company.getPassword(), company.getCoupons());
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println();
	}

	public void printOneCompany(Company company) {
		System.out.printf("%5s %10s %20s %20s %20s", "CompanyID", "Name", "Email", "Password", "Coupons");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.format("%5s %15s %25s %15s %10s", company.getId(), company.getName(), company.getEmail(),
				company.getPassword(), company.getCoupons());
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println();
	}

	public void printOneCompanyWithOutCoupon(Company company) {
		System.out.printf("%5s %10s %20s %20s", "CompanyID", "Name", "Email", "Password");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.format("%5s %15s %25s %15s", company.getId(), company.getName(), company.getEmail(),
				company.getPassword());
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println();
	}

	public void printCustomers(List<Customer> customers) {
		System.out.printf("%5s %10s %10s %15s %17s %17s", "customerID", "firstName", "lastName", "email", "password",
				"Coupons");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------");
		for (Customer customer : customers) {
			System.out.format("%5s %10s %13s %20s %17s %17s", customer.getId(), customer.getFirst_name(),
					customer.getLast_name(), customer.getEmail(), customer.getPassword(), customer.getCoupons());
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println();
	}

	public void printCustomersWithOutCoupon(List<Customer> customers) {
		System.out.printf("%5s %10s %10s %15s %17s", "customerID", "firstName", "lastName", "email", "password");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------");
		for (Customer customer : customers) {
			System.out.format("%5s %10s %13s %20s %17s", customer.getId(), customer.getFirst_name(),
					customer.getLast_name(), customer.getEmail(), customer.getPassword());
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println();
	}

	public void printOneCustomer(Customer customer) {
		System.out.printf("%5s %10s %10s %15s %17s %17s", "customerID", "firstName", "lastName", "email", "password",
				"Coupons");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.format("%5s %10s %13s %20s %17s %17s", customer.getId(), customer.getFirst_name(),
				customer.getLast_name(), customer.getEmail(), customer.getPassword(), customer.getCoupons());
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println();
	}

	public void printOneCustomerWithOutCoupon(Customer customer) {
		System.out.printf("%5s %10s %10s %15s %17s", "customerID", "firstName", "lastName", "email", "password");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.format("%5s %10s %13s %20s %17s", customer.getId(), customer.getFirst_name(),
				customer.getLast_name(), customer.getEmail(), customer.getPassword());
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println();
	}

	public void printCoupons(List<Coupon> coupons) {
		System.out.printf("%5s %5s %5s %5s %15s %22s %20s %17s %7s %10s", "couponID", "companyID", "categoryID",
				"title", "description", "startDate", "endDate", "amount", "price", "image");
		System.out.println();
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------");
		for (Coupon coupon : coupons) {
			System.out.format("%5s %5s %15s %5s %25s %22s %22s %5s %7s %15s", coupon.getId(), coupon.getCompanyID(),
					coupon.getCategoryID(), coupon.getTitle(), coupon.getDescription(), coupon.getStart_date(),
					coupon.getEnd_date(), coupon.getAmount(), coupon.getPrice(), coupon.getImage());
			System.out.println();
		}
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
	}

	public void printOneCoupon(Coupon coupon) {
		System.out.printf("%5s %5s %5s %5s %15s %22s %20s %17s %7s %10s", "couponID", "companyID", "categoryID",
				"title", "description", "startDate", "endDate", "amount", "price", "image");
		System.out.println();
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.format("%5s %5s %15s %5s %25s %22s %22s %5s %7s %15s", coupon.getId(), coupon.getCompanyID(),
				coupon.getCategoryID(), coupon.getTitle(), coupon.getDescription(), coupon.getStart_date(),
				coupon.getEnd_date(), coupon.getAmount(), coupon.getPrice(), coupon.getImage());
		System.out.println();
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
	}

	public void seperateLines(String name) {
		System.out.println();
		for (int i = 0; i < 80; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println("--------------------------------- " + name + "-----------------------------");
		for (int i = 0; i < 80; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println();
	}
}
