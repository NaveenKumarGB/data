package com.zensar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.zensar.bean.Address;
import com.zensar.bean.BankAccount;
import com.zensar.bean.Employee;
import com.zensar.bean.Skill;

public class App {

	public static void loadTesting() {
// write code here to load employee object
		Address address = new Address();
		address.setCityName("Banglore");
		address.setPincode("56112");

		BankAccount account = new BankAccount();
		account.setAccountId("1077257240164765");

		Skill skill = new Skill();
		skill.setSkilllevel(3);
		skill.setSkillName("java");

		Employee employee = new Employee();
		employee.setName("Naveen");
		employee.setBasicSalary(28000.00);
		employee.setAddress(address);
		employee.setBankAccount(account);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAIntro");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

	public static void insertTesting() {

	}

	public static void main(String[] args) {

		loadTesting();
	}
}