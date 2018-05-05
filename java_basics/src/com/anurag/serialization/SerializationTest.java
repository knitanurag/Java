package com.anurag.serialization;

public class SerializationTest {
	public static void main(String[] args) {
		String fileName = "employee.ser";
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Anurag");
		emp.setSalary(5000);
		System.out.println("Before Serialize " + emp);
		try {
			SerializeUtil.serialize(emp, fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Employee empNew = null;
		try {
			empNew = (Employee) SerializeUtil.deserialize(fileName);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("After Serialize " + empNew);

	}
}
