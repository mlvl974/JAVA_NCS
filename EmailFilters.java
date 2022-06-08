public class EmailFilters {

	static String emails[] = {

			"ramesh@gmail.com", "rakesh@outlook.com", "lokesh@linkedin.com", "mahesh@gmail.com", "ganesh@gmail.com",
			"rajesh@outlook.com" };

	public static void main(String[] args) {
		
		
		
//		int count = 0;

		int gmail = 0;
		int outlook = 0;
		int linkedin = 0; 
		
		for (String email : emails) {
			email.split("@");

			if (email.endsWith("gmail.com")) {
				//count++;
				gmail++;

			}

			else if (email.endsWith("outlook.com")) {
				//count++;
				outlook++;

			} else if (email.endsWith("linkedin.com")) {
				//count++;
				linkedin++;

			}
		}
		System.out.println("Gmail- " + gmail + " Outlook- " + outlook + " Linkin- " + linkedin);
	}

}


/*
 * Write the code to count the number of users in particular 			domain
 * for example 
 * gmail has 3 users
 * outlook has 2 users
 * linkedin has 1 user
 *  
 * HINT : use endsWith() of String class
 * */
