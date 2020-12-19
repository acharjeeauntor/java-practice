package com.oopconcept;

public class Employee extends Manager{
	
	int superValue=2;
	
	
	public void showSuperConcept() {
		System.out.println(superValue);
		System.out.println(super.superValue);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		emp.salary = 12000;
		emp.showSuperConcept();
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



///////////////////Final/////////////


//  1. IF we make any method as final then we cannot override that method
// 2. IF we declare any class as final then we cannot override that class





















