package org.debugtutorial.util;

import org.debugtutorial.domain.Employee;
import org.debugtutorial.domain.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DataUtilTest {
	@Test
	@DisplayName("Validate person list has items")
	void validatePresenseOfItemInPersonList() {
		List<Person> personList= DataUtil.getPersonData();
		assertTrue(personList.size()>0,"person list has items");

	}

	@Test
	@DisplayName("Validate employee list has 4 items")
	void validateE() {
		List<Employee> employeeList= DataUtil.getEmployeeData();
		assertEquals(4,employeeList.size(),"employee list has 4 items");

	}
}
