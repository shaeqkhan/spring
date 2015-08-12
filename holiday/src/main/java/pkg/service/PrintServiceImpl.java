package pkg.service;

import pkg.schema.beans.HolidayRequest;

public class PrintServiceImpl implements PrintService {

	public void printObject(HolidayRequest request) {
		
		System.out.println("---------------request.getHoliday().getStartDate() : " + request.getHoliday().getStartDate().toString());
		System.out.println("---------------request.getHoliday().getEndDate().toString() : " + request.getHoliday().getEndDate().toString());
		System.out.println("---------------request.getEmployee().getFirstName() : " + request.getEmployee().getFirstName());
		System.out.println("---------------request.getEmployee().getLastName() : " + request.getEmployee().getLastName());
		System.out.println("---------------request.getEmployee().getNumber() : " + request.getEmployee().getNumber().toString());

	}

}
