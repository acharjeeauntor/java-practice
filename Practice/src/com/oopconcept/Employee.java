package com.oopconcept;

public class Employee extends Manager{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		emp.salary = 12000;
		System.out.println("Employee Salary:"+emp.salary);
		
		Name managerName = new Name("Auntor","Acharja");
		Manager man = new Manager(100000,managerName);
		System.out.println("Manager Salary:"+man.salary+"Manager Name: "+man.name.first+" "+man.name.last);

	}

}



// single inheritance
	//employee extends Manager     [parent: Manager  , Child:employee ]

// Hierarchical inheritance
	//employee extends Manager		 [parent: Manager  , Child:employee, branchManager]
	//branchManager extends Manager

// Multilevel inheritance
	//bike extends vehicle			[parent: vehicle-bike  , Child:cycle]
	//cycle extends bike