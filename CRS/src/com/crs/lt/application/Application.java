package com.crs.lt.application;

import java.util.Scanner;

import com.crs.lt.bean.Student;
import com.crs.lt.business.StudentInterface;
import com.crs.lt.business.StudentOperation;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		getMenu();
	}
		public static void getMenu(){
		Scanner sc= new Scanner(System.in);
		int operation;
		System.out.println("CRS Application Menu:");
		System.out.println("1. CRS Admin Menu");
		System.out.println("2. CRS Student Menu");
		System.out.println("3. CRS Professor Menu");
		System.out.println("4. Exit");
		operation = sc.nextInt();
		
		switch(operation){
		case 1:
			getAdminMenu();
			break;
		case 2:
			getStudentMenu();
			break;
		case 3:
			getProfessoMenu();
			break;
		case 4:
			return;
		default:
			System.out.println("Invalid Option");
		}
	}
		
		public static void getProfessoMenu() {
			// TODO Auto-generated method stub
			
		}
		
		public static void getStudentMenu(){
			CRSStudentMenu studentMenu = new CRSStudentMenu();	
			studentMenu.studentMenu();
			
			CRSCourse studentMenu = new CRSStudentMenu();	
			studentMenu.studentMenu();
			
		}
		
		
		public static void getAdminMenu() {
			// TODO Auto-generated method stub
			
		}


}
