package com.balita.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.balita.model.Employee;
import com.balita.model.Person;

public class EmployeeItemProcessor implements ItemProcessor<Person, Employee> {
	
	private static Logger logger = LoggerFactory.getLogger(EmployeeItemProcessor.class);

	@Override
	public Employee process(Person person) throws Exception {
		Employee employee = new Employee();
		employee.setFullname(person.getFirstname() + " " + person.getLastname());
		logger.info("{} transformer en {}", person, employee);
		return employee;
	}

}
