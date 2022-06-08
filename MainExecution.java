
public class MainExecution {

	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		
		String codes[] = service.getEmployeeCodes();
		String city[] = service.getEmployeeCity();
		

		System.out.println("-------");
		   for (int i = 0; i < codes.length; i++) {
	            System.out.println(codes[i] + " : " + city[i]);

	        }

		
	
	}//end main

	

}

//Question 1
		//Following is the new requirement from Client
		// Print employee id with their respective job location 
		// for example
		// 101 : Delhi 
		// 102 : Mumbai 
		// and so on

