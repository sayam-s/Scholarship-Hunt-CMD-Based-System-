/*

This project is the product of our collective brain cells—burnt out, revived, and burnt again.
 It’s built on countless cups of chai, late-night debugging marathons, and moments of existential dread.
  Crafted with the blood, sweat, tears (and a fair bit of yelling at our Visual Studios and Notepad :| ), 
  this codebase is not just a project—it’s a piece of our souls. 
  From sleepless nights to ‘Ho gya!', 'Allah Mian tera Shukkar!' moments,
   it reflects the hard work and chaotic genius of the four of us: Laiba, Sayam, Neha and Zurrehma.

*/


import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
import java.io.*;


	public class Main{
		
		static Scanner sc = new Scanner(System.in);
		static Scanner in = new Scanner(System.in);
		static Scanner input = new Scanner(System.in);

		public static void main(String[] args)throws Exception{
			
			ArchiveScholarship();
			ReadStudents();
			ReadScholarships();		
			Menu();
		
		}//main

//--------------------------------------------------------------------------------Menus-----------------------------------------------------------------------------------

		public static void Menu()throws Exception{
			
			boolean condition = true;
			while(condition){
				
				System.out.println("\n\n\n");
				System.out.println("""
			            \u001B[37m _____      _           _                _     _       
			            / ____|    | |         | |              | |   (_)      
			           | (___   ___| |__   ___ | | __ _ _ __ ___| |__  _ _ __  
			            \\___ \\ / __| '_ \\ / _ \\| |/ _` | '__/ __| '_ \\| | '_ \\ \u001B[35m
			            ____) | (__| | | | (_) | | (_| | |  \\__ \\ | | | | |_) |
			      \u001B[37m_\u001B[35m    |_____/ \\___|_| |_|\\___/|_|\\__,_|_|  |___/_| |_|_| .__/ 
			     \u001B[37m| |  | |           | |                                 | |    
			     | |__| |_   _ _ __ | |_                                |_|    
			     |  __  | | | | '_ \\| __|\u001B[35m                                      
			     | |  | | |_| | | | | |_                                       
			     |_|  |_|\\__,_|_| |_|\\__|                                      
		                                                                  
				""" + "\u001B[0m" + "\n\n");
	
				System.out.println("\t\t\u001B[35mWELCOME TO SCHOLARSHIP HUNT!");
				
				System.out.println("\n\n\tChoose Your Role:\u001B[0m");
				
				System.out.println("\n\n\n\t\t1. ADMIN\n\t\t2. APPLICANT\n\t\t3. I DON'T WANNA BE HERE!!! :(");
			
				System.out.print("\n\n\tPress from (1 - 3): ");
				char c = in.next().charAt(0);
				while(c != '1' && c != '2' && c != '3'){
					System.out.print("\t\u001B[31mPress Again: \u001B[0m");
					c = in.next().charAt(0);
				}//while
				
				if(c == '1'){
					AdminVerification();
				}//if
				else if(c == '2'){
					ApplicantVerification();
				}//else-if
				else{
					condition = false;
					System.out.println("\n\tExiting Program!\n\n");
				}//else

			}//while	
			

		}//method
		
		public static void AdminVerification() throws Exception{
					
			System.out.println("\n\n\n\n\n\n\n\n\n\n\u001B[37m             _                 _       ");
			System.out.println("            | |               (_)      ");
			System.out.println("            | |     ___   __ _ _ _ __  ");
			System.out.println("            | |    / _ \\ / _` | | '_ \\ \u001B[35m");
			System.out.println("            | |___| (_) | (_| | | | | |");
			System.out.println("            |______\\___/ \\__, |_|_| |_|");
			System.out.println("                          __/ |        ");
			System.out.println("                         |___/         \u001B[0m");
			
			System.out.print("\n\n\n\t\u001B[35mEnter Username: \u001B[0m");
			String username = in.next();
			System.out.print("\n\t\u001B[35mEnter password: \u001B[0m");
			String password = input.nextLine().trim();
			
			File file = new File("Admin.txt");
			Scanner scanner = new Scanner(file);

			String Username = scanner.nextLine().trim();
			String Password = scanner.nextLine().trim();
			
			scanner.close();

			if(!username.equals(Username) || !password.equals(Password)){
				if(!username.equals(Username)){
					System.out.println("\u001B[31m\n\tWrong Username!\u001B[0m");
				}//if
				if(!password.equals(Password)){
					System.out.println("\u001B[31m\n\tWrong Password!\u001B[0m");
				}//if
			}//if
			else{
				System.out.print("\n\n\n\n\n\n");
				AdminMenu();
			}//else
			
			
		}//method
		
		public static void AdminMenu() throws Exception, FileNotFoundException, IOException{
			
			boolean condition = true;
			while(condition){
			
				System.out.println("""
			            \u001B[37m _____      _           _                _     _       
			            / ____|    | |         | |              | |   (_)      
			           | (___   ___| |__   ___ | | __ _ _ __ ___| |__  _ _ __  
			            \\___ \\ / __| '_ \\ / _ \\| |/ _` | '__/ __| '_ \\| | '_ \\ \u001B[35m
			            ____) | (__| | | | (_) | | (_| | |  \\__ \\ | | | | |_) |
			      \u001B[37m_\u001B[35m    |_____/ \\___|_| |_|\\___/|_|\\__,_|_|  |___/_| |_|_| .__/ 
			     \u001B[37m| |  | |           | |                                 | |    
			     | |__| |_   _ _ __ | |_                                |_|    
			     |  __  | | | | '_ \\| __|\u001B[35m                                      
			     | |  | | |_| | | | | |_                                       
			     |_|  |_|\\__,_|_| |_|\\__|                                      
		                                                                  
				""" + "\u001B[0m" + "\n\n");
	
				System.out.println("\t\t\u001B[35mWELCOME TO \u001B[1mADMIN PANEL\u001B[0m\u001B[35m!\u001B[0m");

				System.out.println("\u001B[35m\n\tChoose from (1 - 7) : \n\u001B[0m");
				System.out.println("\t 1. Register Scholarship");
				System.out.println("\t 2. View Registered Students");
				System.out.println("\t 3. View Unregistered Students");
				System.out.println("\t 4. View Registered Scholarships");
				System.out.println("\t 5. Update Registered Scholarships");
				System.out.println("\t 6. View Applicants List for Scholarships");
				System.out.println("\t 7. Back to Main Page\n");
	
				System.out.print("\tPress from (1-7): ");
				String str = in.next();
				while(!(str.equals("1") || str.equals("2") || str.equals("3") || str.equals("4") || str.equals("5") || str.equals("6") || str.equals("7"))){
						System.out.print("\t\u001B[31mInvalid Entry! Choose Again: \u001B[0m ");
						str = in.next();
				}//while
				
				if(str.equals("1")){
					RegisterScholarship();
					ArchiveScholarship();
				}//if
				else if(str.equals("2")){
					ViewRegisteredStudents();
				}//else-if
				else if(str.equals("3")){
					ViewUnregisteredStudents();
				}//else-if
				else if(str.equals("4")){
					ViewAllScholarships();
				}//else-if
				else if(str.equals("5")){
					ViewAllScholarships();
					System.out.println("\n\n");
					UpdateScholarship();
				}//else-if
				else if(str.equals("6")){
					ViewAllApplicants();
				}//else-if
				else if(str.equals("7")){
					condition = false;
					System.out.println("\n\tReturning to Main Menu...\n\n\n\n");
				}//else
			
			}//while
			
		}//method
		
		public static void ApplicantVerification() throws Exception{
			
			System.out.println("\n\n\tChoose From the Options Below.");
			System.out.println("\n\n\t 1. I'm new here!");
			System.out.println("\t 2. Already A Member!");
			System.out.println("\t 3. Woops! Don't Wanna be here!");
			System.out.print("\n\tChoose: ");
			char ch = in.next().charAt(0);
			while(ch != '1' && ch != '2' && ch != '3'){
				System.out.print("\n\t\u001B[31mChoose Again !\u001B[0m");
				ch = in.next().charAt(0);
			}//while
			if(ch == '1'){
				RegisterStudent();
				return;
			}//if
			else if(ch == '2'){
		
				System.out.println("\n\n\n\n\n\n\n\n\n\n\u001B[37m             _                 _       ");
				System.out.println("            | |               (_)      ");
				System.out.println("            | |     ___   __ _ _ _ __  ");
				System.out.println("            | |    / _ \\ / _` | | '_ \\ \u001B[35m");
				System.out.println("            | |___| (_) | (_| | | | | |");
				System.out.println("            |______\\___/ \\__, |_|_| |_|");
				System.out.println("                          __/ |        ");
				System.out.println("                         |___/         \u001B[0m");
				
				System.out.print("\n\n\n\t\u001B[35mEnter Username: \u001B[0m");
				String username = in.next();
				System.out.print("\n\t\u001B[35mEnter CNIC (XXXXX-XXXXXXX-X): \u001B[0m");
				String cnic = input.nextLine().trim();
				
				File folder = new File("Registered Students");
				File file = new File(folder, cnic + ".txt");

				if(file.exists()){
					ApplicantMenu();
				}//if
				else{

					System.out.println("\u001B[31m\n\tWrong CNIC! You Have not been Registered OR You have entered incorrect information!\u001B[0m");
					System.out.println("\n\n\t 1. Do you wanna try Again?");
					System.out.println("\t 2. Register Yourself!");
					System.out.println("\t 3. Back to Main.. :(");
					System.out.print("\n\tChoose from (1 - 3): ");
					char a = in.next().charAt(0);
					while(a != '1' && a != '2' && a != '3'){
						System.out.print("\n\t\u001B[31mChoose Again! \u001B[0m");
						a = in.next().charAt(0);
					}//while
					
					if(a == '1'){
						System.out.println("\n\n\n\n\n\n\n\n");
						ApplicantVerification();
						return;
					}//if
					else if(a == '2'){
						RegisterStudent();
						return;
					}//else-if
					else{
						return;
					}//else

				}//else

			}//else if

			else{
				return;	
			}//else

		}//method

		public static void ApplicantMenu() throws Exception, IOException{
			
			boolean condition = true;
			while(condition){
			
				System.out.println("""
			            \u001B[37m _____      _           _                _     _       
			            / ____|    | |         | |              | |   (_)      
			           | (___   ___| |__   ___ | | __ _ _ __ ___| |__  _ _ __  
			            \\___ \\ / __| '_ \\ / _ \\| |/ _` | '__/ __| '_ \\| | '_ \\ \u001B[35m
			            ____) | (__| | | | (_) | | (_| | |  \\__ \\ | | | | |_) |
			      \u001B[37m_\u001B[35m    |_____/ \\___|_| |_|\\___/|_|\\__,_|_|  |___/_| |_|_| .__/ 
			     \u001B[37m| |  | |           | |                                 | |    
			     | |__| |_   _ _ __ | |_                                |_|    
			     |  __  | | | | '_ \\| __|\u001B[35m                                      
			     | |  | | |_| | | | | |_                                       
			     |_|  |_|\\__,_|_| |_|\\__|                                      
		                                                                  
				""" + "\u001B[0m" + "\n\n");
	
				System.out.println("\t\t\u001B[35mWelcome to Student Panel!\u001B[0m");

				in.nextLine();

				System.out.println("\u001B[35m\n\tChoose from (1 - 4) : \n\u001B[0m");
				System.out.println("\t 1. Unregister Student");
				System.out.println("\t 2. Submit Application Form");
				System.out.println("\t 3. Update Student Information");
				System.out.println("\t 4. Exit\n");
	
				System.out.print("\tPress (1-4): ");
				String str = in.next();
				while(!(str.equals("1") || str.equals("2") || str.equals("3") || str.equals("4"))){
						System.out.print("\t\u001B[31mInvalid Entry! Choose Again:\u001B[0m ");
						str = in.next();
				}//while
				
				if(str.equals("1")){
					UnregisterStudent();
				}//else-if
				else if(str.equals("2")){
					ApplyStudent();
				}//else-if
				else if(str.equals("3")){
					UpdateStudent();
				}//else-if
				else if(str.equals("4")){
					condition = false;
					System.out.println("\tGoing Back to Main Page!\n");
				}//else

			}//while
			
		}//method


//---------------------------------------------------------------------Student Registration Methods-----------------------------------------------------------------------
		
			public static void RegisterStudent()throws Exception{
				
				if(!Affirmation())
				return;
				
				Student s = StoreStudentData();
				StudentRegistry(s);

			}//method
			
			public static Student StoreStudentData() throws Exception{
		
			String fname, lname, email, cnic, phoneNo, dob, religion, nationality, degree, major, dept, institute;
			char gender, maritalStatus, disable, ch;
			int semester;
			boolean married, disabled;
			System.out.println("\n\n\t\t\t\t\u001B[35m┌----------------------------------------------------------------┐");
			System.out.println("\t\t\t\t|\t\t\t\u001B[0mSTUDENT REGISTRATION\t\t\t \u001B[35m|");
			System.out.println("\t\t\t\t└----------------------------------------------------------------┘\u001B[0m\n\n");
			
			System.out.println("\n\t\u001B[35m┌-----------------------┐");
			System.out.println("\t|\u001B[0m\tSTUDENT\t\t\u001B[35m|");
			System.out.println("\t└-----------------------┘\u001B[0m\n\n");
			System.out.println("\n\tFILL IN THE FOLLOWING FIELDS.");

			System.out.print("\n\n\t\tFirst Name: ");
			fname = in.next();
			while(!WordChecker(fname)){
				System.out.print("\t\t\u001B[31mEnter First Name Again:\u001B[0m ");
				fname = in.next();
			}//while

			System.out.print("\n\t\tLast Name: ");
			lname = in.next();
			while(!WordChecker(lname)){
				System.out.print("\t\t\u001B[31mEnter Last Name Again:\u001B[0m ");
				lname = in.next();
			}//while
			
			System.out.print("\n\t\tEmail: ");
			email = in.next();
			while(email == null || email.equals("") || !email.matches("^[\\w-.]+@[\\w-]+\\.[a-zA-Z]{2,}$")){
				System.out.print("\t\t\u001B[31mEnter Email Again:\u001B[0m ");
				email = in.next();
			}//while
			
			System.out.print("\n\t\tCNIC (XXXXX-XXXXXXX-X): ");
			cnic = in.next();
			File folder = new File("Registered Students");
			if(!folder.exists()){
				folder.mkdir();
			}//if
			File file = new File(folder, cnic + ".txt");
			while(cnic == null || cnic.equals("") || !cnic.matches("^\\d{5}-\\d{7}-\\d{1}$") || file.exists()){
				/*The third condition for validation is a regex, its a formula basically used for patterns in text*/
				/*In the condition above, ^ means start of string, \\d means the digit, {n} means the number of digits,
				 - reprsents the dashes in between, $ means end of string.*/
				if(cnic == null || cnic.equals("") || !cnic.matches("^\\d{5}-\\d{7}-\\d{1}$")){
					System.out.print("\t\t\u001B[31mWrong Format! Enter CNIC Again (XXXXX-XXXXXXX-X):\u001B[0m ");
					cnic = in.next();
				}//if
				else if(file.exists()){
					System.out.print("\t\t\u001B[31mCNIC Already Registered! Enter CNIC Again (XXXXX-XXXXXXX-X):\u001B[0m ");
					cnic = in.next();
				}//else-if
				file = new File(folder, cnic + ".txt");
			}//while
			
			System.out.print("\n\t\tPhone Number: ");
			phoneNo = in.next();
			while(phoneNo == null || phoneNo.equals("") || !phoneNo.matches("^[\\d+-]+$")){
				System.out.print("\t\t\u001B[31mEnter Phone Number Again:\u001B[0m ");
				phoneNo = in.next();
			}//while
			
			System.out.println("\n\t\tGender: \n");
			System.out.println("\t\t1. Male");
			System.out.println("\t\t2. Female");
			System.out.println("\t\t3. Third Gender / Transgender");	
			System.out.print("\n\t\tChoose Gender: ");
			gender = in.next().charAt(0);
			while(gender != '1' && gender != '2' && gender != '3'){
				System.out.print("\t\t\u001B[31mChoose Gender Again:\u001B[0m ");
				gender = in.next().charAt(0);
			}//while
			switch(gender){
				case '1': 
						gender = 'M'; //male
						break; 
				case '2': 
						gender = 'F'; //female
						break;
				case '3':
						gender = 'T'; //trans
						break;
				default: 
						gender = 'N'; //none
						break;
			}//switch
			
			System.out.print("\n\t\tDate of Birth (YYYY-MM-DD): ");
			dob = in.next();
			while(dob == null || dob.equals("") || !dob.matches("^\\d{4}-\\d{2}-\\d{2}$")){
				System.out.print("\t\t\u001B[31mEnter Date of Birth Again (YYYY-MM-DD):\u001B[0m ");
				dob = in.next();
			}//while
			
			System.out.print("\n\t\tReligion: ");
			religion = in.next();
			while(!WordChecker(religion)){
				System.out.print("\t\t\u001B[31mEnter Religion Again:\u001B[0m ");
				religion = in.next();
			}//while

			System.out.print("\n\t\tNationality: ");
			nationality = in.next();
			while(!WordChecker(nationality)){
				System.out.print("\t\t\u001B[31mEnter Nationality Again:\u001B[0m ");
				nationality = in.next();
			}//while
			
			System.out.println("\n\t\tMarital Status: \n");
			System.out.println("\t\t1. Married");
			System.out.println("\t\t2. Single");	
			in.nextLine();
			System.out.print("\n\t\tChoose Marital Status: ");
			maritalStatus = in.next().charAt(0);
			while(maritalStatus != '1' && maritalStatus != '2'){
				System.out.print("\t\t\u001B[31mChoose Marital Status Again:\u001B[0m ");
				maritalStatus = in.next().charAt(0);
			}//while
			switch(maritalStatus){
				case '1': 
						married = true;
						break; 
				case '2': 
				default: 
						married = false;
						break;
			}//switch

			System.out.println("\n\t\tAre you a person with a disability? \n");
			System.out.println("\t\t1. Yes");
			System.out.println("\t\t2. No");	
			System.out.print("\n\t\tChoose: ");
			disable = in.next().charAt(0);
			while(disable != '1' && disable != '2'){
				System.out.print("\t\t\u001B[31mChoose Again:\u001B[0m ");
				disable = in.next().charAt(0);
			}//while
			switch(disable){
				case '1': 
						disabled = true;
						break; 
				case '2': 
				default: 
						disabled = false;
						break;
			}//switch
			
			System.out.println("\n\t\tCurrent Degree: \n");
			System.out.println("\t\t1. Bachelors");
			System.out.println("\t\t2. Masters");	
			System.out.println("\t\t3. Ph.D.");	
			System.out.print("\n\t\tChoose Current Degree: ");
			ch = in.next().charAt(0);
			while(ch != '1' && ch != '2' && ch != '3'){
				System.out.print("\t\t\u001B[31mChoose Degree Again:\u001B[0m ");
				ch = in.next().charAt(0);
			}//while
			switch(ch){
				case '1': 
						degree = "Bachelors";
						break; 
				case '2':
						degree = "Masters"; 
						break;
				case '3':
						degree = "Ph.D.";
						break;
				default: 
						degree = "Bachelors";
						break;
			}//switch
			
			System.out.print("\n\n\t\tMajor: ");
			major = input.nextLine();
			while(!StringChecker(major)){
				System.out.print("\t\t\u001B[31mEnter Major Again:\u001B[0m ");
				major = input.nextLine();
			}//while
			
			System.out.print("\n\n\t\tDepartment: ");
			dept = input.nextLine();
			while(!StringChecker(dept)){
				System.out.print("\t\t\u001B[31mEnter Department Again:\u001B[0m ");
				dept = input.nextLine();
			}//while
			
			System.out.print("\n\t\tCurrent Semester (1-8): ");
			semester = sc.nextInt();
			while(semester < 1 || semester > 8){
				System.out.print("\t\t\u001B[31mEnter Semester Again:\u001B[0m ");
				semester = sc.nextInt();
			}//while
			
			System.out.print("\n\n\t\tCurrent Institute: ");
			institute = input.nextLine();
			while(!StringChecker(institute)){
				System.out.print("\t\t\u001B[31mEnter Institute Again:\u001B[0m ");
				institute = input.nextLine();
			}//while
			
			System.out.println("\n\n\n\t\u001B[35m┌-------------------------┐");
			System.out.println("\t|\u001B[0m\t GUARDIAN         \u001B[35m|");
			System.out.println("\t└-------------------------┘\u001B[0m\n\n");
			System.out.println("\n\tFILL IN THE FOLLOWING FIELDS FOR GUARDIAN 01.");
			
			Guardian g1 = StoreGuardianData();
			
			System.out.println("\n\n\n\t\u001B[35m┌-------------------------┐");
			System.out.println("\t|\u001B[0m\t GUARDIAN         \u001B[35m|");
			System.out.println("\t└-------------------------┘\u001B[0m\n\n");
			System.out.println("\n\tFILL IN THE FOLLOWING FIELDS FOR GUARDIAN 02.");
			
			Guardian g2 = StoreGuardianData();

			System.out.println("\n\n\n\t\u001B[35m┌-------------------------┐");
			System.out.println("\t|\u001B[0m\t  ADDRESS         \u001B[35m|");
			System.out.println("\t└-------------------------┘\u001B[0m\n\n");
			System.out.println("\n\tFILL IN THE FOLLOWING FIELDS FOR TEMPORARY ADDRESS.");
			
			Address a1 = StoreAddressData();
			
			System.out.println("\n\n\n\t\u001B[35m┌-------------------------┐");
			System.out.println("\t|\u001B[0m\t  ADDRESS         \u001B[35m|");
			System.out.println("\t└-------------------------┘\u001B[0m\n\n");
			System.out.println("\n\tFILL IN THE FOLLOWING FIELDS FOR PERMANENT ADDRESS.");
			
			Address a2 = StoreAddressData();

			System.out.println("\n\n\n\t\u001B[35m┌---------------------------------┐");
			System.out.println("\t|\u001B[0m\t  ACADEMIC RECORD         \u001B[35m|");
			System.out.println("\t└---------------------------------┘\u001B[0m\n\n");
			System.out.println("\n\tFILL IN THE FOLLOWING FIELDS FOR ACADEMIC RECORD.");
		
			AcademicRecord ar = StoreAcademicData();
			
			Student s = new Student(fname, lname, email, cnic, phoneNo, gender, dob, religion, nationality, married, disabled, degree, dept, major, semester, 			institute, a1, a2, g1, g2, ar);

			System.out.println("\n\n\n\n\n\n");			

			return s;
			
		}//method
			
		public static Guardian StoreGuardianData(){
		
			String fname, lname, email, cnic, phoneNo, relation, occupation;
			char gender;
			double monthlyIncome, annualIncome;
			
			in.nextLine();

			System.out.print("\n\n\t\tFirst Name: ");
			fname = in.next();
			while(!WordChecker(fname)){
				System.out.print("\t\t\u001B[31mEnter First Name Again:\u001B[0m ");
				fname = in.next();
			}//while

			System.out.print("\n\t\tLast Name: ");
			lname = in.next();
			while(!WordChecker(lname)){
				System.out.print("\t\t\u001B[31mEnter Last Name Again:\u001B[0m ");
				lname = in.next();
			}//while
			
			System.out.print("\n\t\tEmail: ");
			email = in.next();
			while(email == null || email.equals("") || !email.matches("^[\\w-.]+@[\\w-]+\\.[a-zA-Z]{2,}$")){
				System.out.print("\t\t\u001B[31mEnter Email Again:\u001B[0m ");
				email = in.next();
			}//while
			
			System.out.print("\n\t\tCNIC (XXXXX-XXXXXXX-X): ");
			cnic = in.next();
			while(cnic == null || cnic.equals("") || !cnic.matches("^\\d{5}-\\d{7}-\\d{1}$")){
				/*The third condition for validation is a regex, its a formula basically used for patterns in text*/
				/*In the condition above, ^ means start of string, \\d means the digit, {n} means the number of digits,
				 - reprsents the dashes in between, $ means end of string.*/
				System.out.print("\t\t\u001B[31mEnter CNIC Again (XXXXX-XXXXXXX-X):\u001B[0m ");
				cnic = in.next();
			}//while
			
			System.out.print("\n\t\tPhone Number: ");
			phoneNo = in.next();
			while(phoneNo == null || phoneNo.equals("") || !phoneNo.matches("^[\\d+-]+$")){
				System.out.print("\t\t\u001B[31mEnter Phone Number Again:\u001B[0m ");
				phoneNo = in.next();
			}//while
			
			System.out.println("\n\t\tGender: \n");
			System.out.println("\t\t1. Male");
			System.out.println("\t\t2. Female");
			System.out.println("\t\t3. Third Gender / Transgender");	
			System.out.print("\n\t\tChoose Gender: ");
			gender = in.next().charAt(0);
			while(gender != '1' && gender != '2' && gender != '3'){
				System.out.print("\t\t\u001B[31mChoose Gender Again:\u001B[0m ");
				gender = in.next().charAt(0);
			}//while
			switch(gender){
				case '1': 
						gender = 'M'; //male
						break; 
				case '2': 
						gender = 'F'; //female
						break;
				case '3':
						gender = 'T'; //trans
						break;
				default: 
						gender = 'N'; //none
						break;
			}//switch

			System.out.print("\n\n\t\tRelation: ");
			relation = in.next();
			while(!WordChecker(relation)){
				System.out.print("\t\t\u001B[31mEnter Relation Again:\u001B[0m ");
				relation = in.next();
			}//while
			
			System.out.print("\n\t\tOccupation: ");
			occupation = input.nextLine();
			while(!StringChecker(occupation)){
				System.out.print("\t\t\u001B[31mEnter Occupation Again:\u001B[0m ");
				occupation = input.nextLine();
			}//while

			System.out.print("\n\n\t\tMonthly Income: ");
			monthlyIncome = sc.nextDouble();
			while(monthlyIncome < 0){
				System.out.print("\t\t\u001B[31mEnter Monthly Income Again:\u001B[0m ");
				monthlyIncome = sc.nextDouble();
			}//while			
						
			System.out.print("\n\n\t\tAnnual Income: ");
			annualIncome = sc.nextDouble();
			while(annualIncome < 0){
				System.out.print("\t\t\u001B[31mEnter Annual Income Again:\u001B[0m ");
				annualIncome = sc.nextDouble();
			}//while

			Guardian g = new Guardian(fname, lname, email, cnic, phoneNo, gender, relation, occupation, monthlyIncome, annualIncome);
			
			return g;
			
		}//method
		
		public static Address StoreAddressData(){
		
			String state, province, district, city, street, postalCode;
			int houseNo;
			
			System.out.print("\n\t\tState: ");
			state = input.nextLine();
			while(!StringChecker(state)){
				System.out.print("\t\t\u001B[31mEnter State Again:\u001B[0m ");
				state = input.nextLine();
			}//while

			System.out.print("\n\t\tProvince: ");
			province = input.nextLine();
			while(!StringChecker(province)){
				System.out.print("\t\t\u001B[31mEnter Province Again:\u001B[0m ");
				province = input.nextLine();
			}//while

			System.out.print("\n\t\tDistrict: ");
			district = input.nextLine();
			while(!StringChecker(district)){
				System.out.print("\t\t\u001B[31mEnter District Again:\u001B[0m ");
				district = input.nextLine();
			}//while

			System.out.print("\n\t\tCity: ");
			city = input.nextLine();
			while(!StringChecker(city)){
				System.out.print("\t\t\u001B[31mEnter City Again:\u001B[0m ");
				city = input.nextLine();
			}//while
			
			System.out.print("\n\t\tStreet Address: ");
			street = input.nextLine();
			while(street == null || street.equals("")){
				System.out.print("\t\t\u001B[31mEnter Street Address Again:\u001B[0m ");
				street = input.nextLine();
			}//while

			System.out.print("\n\t\tHouse No.: ");
			houseNo = sc.nextInt();
			while(houseNo < 0){
				System.out.print("\t\t\u001B[31mEnter House No. Again:\u001B[0m ");
				houseNo = sc.nextInt();
			}//while

			System.out.print("\n\t\tPostal Code: ");
			postalCode = in.next();
			while(!postalCode.matches("^\\d+$")){
				System.out.print("\t\t\u001B[31mEnter Postal Code Again:\u001B[0m ");
				postalCode = in.next();
			}//while

			Address a = new Address(state, province, district, city, street, houseNo, postalCode);
			
			return a;
			
		}//method
		
		public static AcademicRecord StoreAcademicData(){
			
			String middle, high, college, uni;
			int middleEnd, highEnd, collegeEnd, uniEnd, noOfDegrees;
			double totalHigh, totalCollege, obtHigh, obtCollege, gpa;
			String[] degrees;
			
			System.out.print("\n\t\tMiddle School: ");
			middle = input.nextLine();
			while(!StringChecker(middle)){
				System.out.print("\t\t\u001B[31mEnter Middle School Name Again:\u001B[0m ");
				middle = input.nextLine();
			}//while

			System.out.print("\n\t\tHigh School: ");
			high = input.nextLine();
			while(!StringChecker(high)){
				System.out.print("\t\t\u001B[31mEnter High School Name Again:\u001B[0m ");
				high = input.nextLine();
			}//while

			System.out.print("\n\t\tCollege: ");
			college = input.nextLine();
			while(!StringChecker(college)){
				System.out.print("\t\t\u001B[31mEnter College Name Again:\u001B[0m ");
				college = input.nextLine();
			}//while

			System.out.print("\n\t\tUniversity: ");
			uni = input.nextLine();
			while(!StringChecker(uni)){
				System.out.print("\t\t\u001B[31mEnter University Name Again:\u001B[0m ");
				uni = input.nextLine();
			}//while

			System.out.print("\n\n\t\tMiddle School End Year: ");
			middleEnd = sc.nextInt();
			while(middleEnd < 0){
				System.out.print("\t\t\u001B[31mEnter Middle School End Year Again:\u001B[0m ");
				middleEnd = sc.nextInt();
			}//while

			System.out.print("\n\n\t\tHigh School End Year: ");
			highEnd = sc.nextInt();
			while(highEnd < 0){
				System.out.print("\t\t\u001B[31mEnter High School End Year Again:\u001B[0m ");
				highEnd = sc.nextInt();
			}//while

			System.out.print("\n\n\t\tCollege End year: ");
			collegeEnd = sc.nextInt();
			while(collegeEnd < 0){
				System.out.print("\t\t\u001B[31mEnter College End Year Again:\u001B[0m ");
				collegeEnd = sc.nextInt();
			}//while

			System.out.print("\n\n\t\tUniverity End Year: ");
			uniEnd = sc.nextInt();
			while(uniEnd < 0){
				System.out.print("\t\t\u001B[31mEnter University End Year Again:\u001B[0m ");
				uniEnd = sc.nextInt();
			}//while

			System.out.print("\n\n\t\tTotal Marks (High School) : ");
			totalHigh = sc.nextDouble();
			while(totalHigh < 0){
				System.out.print("\t\t\u001B[31mEnter Total Marks Again:\u001B[0m ");
				totalHigh = sc.nextDouble();
			}//while

			System.out.print("\n\n\t\tObtained Marks (High School) : ");
			obtHigh = sc.nextDouble();
			while(obtHigh < 0 || obtHigh > totalHigh){
				System.out.print("\t\t\u001B[31mEnter Obtained Marks Again:\u001B[0m ");
				obtHigh = sc.nextDouble();
			}//while

			System.out.print("\n\n\t\tTotal Marks (College) : ");
			totalCollege = sc.nextDouble();
			while(totalCollege < 0){
				System.out.print("\t\t\u001B[31mEnter Total Marks Again:\u001B[0m ");
				totalCollege = sc.nextDouble();
			}//while

			System.out.print("\n\n\t\tObtained Marks (College) : ");
			obtCollege = sc.nextDouble();
			while(obtCollege < 0 || obtCollege > totalCollege){
				System.out.print("\t\t\u001B[31mEnter Obtained Marks Again:\u001B[0m ");
				obtCollege = sc.nextDouble();
			}//while

			System.out.print("\n\n\t\tRecent GPA : ");
			gpa = sc.nextDouble();
			while(gpa < 0.0 || gpa > 4.0){
				System.out.print("\t\t\u001B[31mEnter GPA Again:\u001B[0m ");
				gpa = sc.nextDouble();
			}//while

			System.out.print("\n\n\t\tTotal No. Of Degrees: ");
			noOfDegrees = sc.nextInt();
			while(noOfDegrees < 0){
				System.out.print("\t\t\u001B[31mEnter No. Of Degrees Again:\u001B[0m ");
				noOfDegrees = sc.nextInt();
			}//while
			
			degrees = new String[noOfDegrees];
			
			for(int i = 0; i < noOfDegrees; i++){
				System.out.print("\n\t\tDegree " + (i+1) + ": ");
				degrees[i] = input.nextLine();
				while(!StringChecker(degrees[i])){
					System.out.print("\t\t\u001B[31mEnter Degree " + (i+1) + ":\u001B[0m ");
					degrees[i] = input.nextLine();
				}//while
			}//for
			
			AcademicRecord a = new AcademicRecord(middle, high, college, uni, middleEnd, highEnd, collegeEnd, uniEnd, totalHigh, totalCollege, obtHigh, obtCollege, gpa, noOfDegrees, degrees);
			
			return a;		
		}//method

		public static void StudentRegistry(Student s)throws IOException{
			
			File folder = new File("Registered Students"); 
			if(!folder.exists()){
				folder.mkdir(); // creates a folder named "Registered Students"
			}//if

			String _file = s.getCnic() + ".txt";
			File file = new File(folder, _file);

			FileWriter file_writer = new FileWriter(file, false);
			file_writer.write(s.PRINT());
			file_writer.close();
			
		}//method


//------------------------------------------------------------------Student Unregistration Method--------------------------------------------------------------------


		public static void UnregisterStudent(){
		
			if(!Affirmation())
				return;
						
			System.out.println("\n\n\n\t\u001B[35m┌--------------------------------------┐");
			System.out.println("\t|\u001B[0m\t STUDENT UNREGISTERATION       \u001B[35m|");
			System.out.println("\t└--------------------------------------┘\u001B[0m\n\n");
			System.out.print("\n\n\n\t\tEnter Student's Name: ");
			String name = input.nextLine();
			while(!StringChecker(name)){
				System.out.print("\t\t\u001B[31mEnter Name Again:\u001B[0m ");
				name = input.nextLine();
			}//while
			System.out.print("\n\t\tEnter Student's CNIC (XXXXX-XXXXXXX-X) : ");
			String cnic = in.next();
			while(cnic == null || cnic.equals("") || !cnic.matches("^\\d{5}-\\d{7}-\\d{1}$")){
				System.out.print("\t\t\u001B[31mEnter CNIC Again (XXXXX-XXXXXXX-X):\u001B[0m ");
				cnic = in.next();
			}//while

			char ch;
			System.out.println("\n\t\tAre You Sure You Want To Unregister \""+ name +"\" : ");
			System.out.println("\t\t1. Yes");
			System.out.println("\t\t2. Go Back");
			System.out.print("\t\tChoose 1 or 2: ");
			ch = sc.next().charAt(0);
			while(ch != '1' && ch != '2'){
				System.out.print("\t\t\u001B[31mChoose Again:\u001B[0m ");
				ch = sc.next().charAt(0);
			}//while
			if(ch == '1'){
				File sourceFolder = new File("Registered Students");

				if(sourceFolder.exists()){
					
					String _file = cnic + ".txt";
					File sourceFile = new File(sourceFolder, _file); //
					File destinationFolder = new File("Unregistered Students");
					if(!destinationFolder.exists()){
						destinationFolder.mkdir();
					}//if
					
					File movedFile = new File(destinationFolder, _file);
					boolean result = sourceFile.renameTo(movedFile);

					if(result){
						Student std = null;
						int index = -1;
						for(int i = 0; i < Data.RegisteredStudents.size(); i++){
							Student s = Data.RegisteredStudents.get(i);
							if(s.getCnic().equals(cnic)){
								std = s;
								index = i;
								i = Data.RegisteredStudents.size();
							}//if
						}//for

						Data.RegisteredStudents.remove(index);
						Data.UnregisteredStudents.add(std);
						System.out.println("\n\t\tStudent has been unregistered successfully.");
					}//if
					else{
						System.out.println("\n\t\tCould Not Unregister " + name);
					}//else
					
				}//if
				else{
					System.out.println("\n\t\tError Occurred! Unregistration Unsuccessful! There Are NO Students Registered Yet!");
				}//else
				
			}//if
			
		}//method

//-------------------------------------------------------------Update Registered Students-------------------------------------------------------------------


		public static void UpdateStudent() throws IOException {

			Scanner Input = new Scanner(System.in);

			// asking user if wants to update any field
			System.out.println("\n\t\tDo you want to update your details?");
			System.out.println("\t\t\t1. \u001B[32mYes\u001B[0m");
			System.out.println("\t\t\t2. \u001B[31mNo\u001B[0m");
			System.out.print("\n\t\tEnter 1 or 2: ");
			int ans = Input.nextInt();
			Input.nextLine();

			// validation for yes or no
			while (ans != 1 && ans != 2) {
			System.out.print("\t\t\u001B[31mEnter 1 or 2:\u001B[0m ");
			ans = Input.nextInt();
			Input.nextLine();
			}

			// if says yes
			if (ans == 1) {
			File file;
			String cnic;

			// putting true as it will break if file is found else will ask for cnic again, so better to put right in first try
			while (true) {
				System.out.print("\t\tEnter your CNIC: ");
				cnic = Input.nextLine();

				// cnic validation
				while (cnic == null || cnic.equals("") || !cnic.matches("^\\d{5}-\\d{7}-\\d{1}$")) {
				System.out.print("\t\t\u001B[31mEnter CNIC Again (XXXXX-XXXXXXX-X):\u001B[0m ");
				cnic = Input.nextLine();
				}

				// putting txt with cnic and finding that file
				File folder = new File("Registered Students");
				String _file = cnic + ".txt";
				file = new File(folder, _file);

				if (file.exists()) {
				System.out.println("\n\t\t\u001B[30mFile found.\u001B[0m");
				break;
				} else {
				System.out.println("\t\t\u001B[31mFile not found. Try again.\u001B[0m");
				}
			}

			// bufferReader to read file
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String[] lines = new String[70]; // increased size just in case
			int count = 0;
			String line;

			// counting lines
			while ((line = reader.readLine()) != null) {
				lines[count] = line;
				count++;
			}
			reader.close();

			boolean keepUpdating = true;

			// until student says no
			while (keepUpdating) {
				// showing all fields
				System.out.println("\n\t\tChoose line number you want to update:");
				for (int i = 0; i < count; i++) {
				System.out.println("\t" + (i + 1) + " - " + lines[i]); // taking from array
				}

				System.out.print("\n\n\t\tEnter line number to update: ");
				int choice = Input.nextInt();
				Input.nextLine();

				// validation on choice num, cause we dont trust our student
				if (choice >= 1 && choice <= count) {

				// so im asking what value to update this line with
				System.out.print("\t\tEnter new value for line " + choice + ": ");
				String newValue = Input.nextLine();

				// putting value on that choice number, choice -1 cause of index as it starts from 0
				lines[choice - 1] = newValue;
				System.out.println("\n\t\t\u001B[32mUpdated successfully!\u001B[0m");
				} 
				else {
				System.out.println("\n\t\t\u001B[31mInvalid choice.\u001B[0m");
				}

				System.out.println("\t\tDo you want to update another line?");
				System.out.println("\t\t\t1. \u001B[32mYes\u001B[0m");
				System.out.println("\t\t\t2. \u001B[31mNo\u001B[0m");
				System.out.print("\n\t\tEnter 1 or 2: ");
				int again = Input.nextInt();
				Input.nextLine();

				if (again != 1) {
				keepUpdating = false;
				}
			}

			// replacing my old file with new file , containing updated values
			PrintWriter writer = new PrintWriter(new FileWriter(file));
			for (int i = 0; i < count; i++) {
				writer.println(lines[i]);
			}
			writer.flush();
			writer.close();

			System.out.println("\n\n\t\t\u001B[34mAll updates saved\u001B[0m\n\n\n\n\n\n\n\n\n");
			} else {
			System.out.println("\t\tNo changes made!\n\n\n\n\n\n\n\n\n");
			}
		}

//-------------------------------------------------------------------View Registered Students--------------------------------------------------------------------

		public static void ViewRegisteredStudents() throws FileNotFoundException{
			
			if(!Affirmation())
			return;
			
			File folder = new File("Registered Students");
			if(!folder.exists()) 
				folder.mkdir(); //DELETE THIS LATER
			if(folder.exists() && folder.isDirectory()){
				File[] files = folder.listFiles();
				if(files != null){
					System.out.println("\n\n\t\t\t\t\u001B[35m┌-----------------------------------------------------------------┐");
					System.out.println("\t\t\t\t|\t\t\t\u001B[0mREGISTERED STUDENTS\t\t\t  \u001B[35m|");
					System.out.println("\t\t\t\t└-----------------------------------------------------------------┘\u001B[0m\n\n");
					System.out.printf("\n\t\t " + "%-11s %-16s %-26s %-21s %-21s\n", "First Name", "Last Name", "Email", "CNIC", "Phone");							System.out.print("\u001B[35m");
					System.out.print("\n\t\t");
					for(int i = 1; i <= 95; i++){
						System.out.print("-");
					}//for
					System.out.println("\u001B[0m\n");
					for(File file : files){
						if(file.isFile() && !file.getName().equals("desktop.ini") && file.getName().endsWith(".txt")){
							Scanner scan = new Scanner(file);

							String fname, lname, email, cnic, phoneNo;

							fname = scan.nextLine();
							lname = scan.nextLine();
							email = scan.nextLine();
							cnic = scan.nextLine();
							phoneNo = scan.nextLine();
							
							System.out.printf("\n\t\t" + "%-11s %-12s %-30s %-21s %-21s\n", fname, lname, email, cnic, phoneNo);
							
							scan.close();

						}//if
					}//for
				}//if
				else{
					System.out.println("\n\t\tNo Students Registered Yet!");
					System.out.println("\n\n\n\n");
				}//else
				System.out.println("\n\n\n\n");
			}//if
			else{
				System.out.println("\n\t\tNo Students Registered Yet!");
				System.out.println("\n\n\n\n");
			}//else
			
		}//method

//--------------------------------------------------------------View Unregistered Students-----------------------------------------------------------------


		public static void ViewUnregisteredStudents() throws FileNotFoundException{
			
			if(!Affirmation())
			return;
			
			File folder = new File("Unregistered Students");
			if(!folder.exists()) 
				folder.mkdir(); //DELETE THIS LATER
			if(folder.exists() && folder.isDirectory()){
				File[] files = folder.listFiles();
				if(files != null){
					System.out.println("\n\n\t\t\t\t\u001B[35m┌----------------------------------------------------------------┐");
					System.out.println("\t\t\t\t|\t\t\t\u001B[0mUNREGISTERED STUDENTS\t\t\t \u001B[35m|");
					System.out.println("\t\t\t\t└----------------------------------------------------------------┘\u001B[0m\n\n");
					System.out.printf("\n\t\t " + "%-11s %-16s %-26s %-21s %-21s\n", "First Name", "Last Name", "Email", "CNIC", "Phone");							System.out.print("\u001B[35m");
					System.out.print("\n\t\t");
					for(int i = 1; i <= 95; i++){
						System.out.print("-");
					}//for
					System.out.println("\u001B[0m\n");
					for(File file : files){
						if(file.isFile() && !file.getName().equals("desktop.ini") && file.getName().endsWith(".txt")){
							Scanner scan = new Scanner(file);

							String fname, lname, email, cnic, phoneNo;

							fname = scan.nextLine();
							lname = scan.nextLine();
							email = scan.nextLine();
							cnic = scan.nextLine();
							phoneNo = scan.nextLine();
							
							System.out.printf("\n\t\t" + "%-11s %-12s %-30s %-21s %-21s\n", fname, lname, email, cnic, phoneNo);
							
							scan.close();
							
						}//if
					}//for
				}//if
				else{
					System.out.println("\n\t\tNo Students Unregistered Yet!");
					System.out.println("\n\n\n\n");
				}//else
				System.out.println("\n\n\n\n");
			}//if
			else{
				System.out.println("\n\t\tNo Students Unregistered Yet!");
				System.out.println("\n\n\n\n");
			}//else
			
		}//method

//--------------------------------------------------------------------------Read Methods--------------------------------------------------------------------------

		public static void ReadStudents()throws Exception{
			
			ReadRegisteredStudents();
			ReadUnregisteredStudents();
		
		}//method
		
		public static void ReadRegisteredStudents() throws Exception{
			
			File folder = new File("Registered Students");

			if(folder.exists() && folder.isDirectory()){
				File[] files = folder.listFiles();
				if(files != null){
					for(File file : files){
						if(file.isFile() && file.getName().endsWith(".txt") && !file.getName().equals("desktop.ini")){
							
							Student s;
							
							Scanner scan = new Scanner(file);
							
							String sfname = scan.nextLine();
							String slname = scan.nextLine();
							String semail = scan.nextLine();
							String scnic = scan.nextLine();
							String sphoneNo = scan.nextLine();
							char sgender = scan.nextLine().charAt(0);
							String sdob = scan.nextLine();
							String sreligion = scan.nextLine();
							String snationality = scan.nextLine();
							boolean smarried = Boolean.parseBoolean(scan.nextLine());
							boolean sdisabled = Boolean.parseBoolean(scan.nextLine());
							String sdegree = scan.nextLine();
							String sdept = scan.nextLine();
							String smajor = scan.nextLine();
							int ssemester = Integer.parseInt(scan.nextLine());
							String sinstitute = scan.nextLine();

							String a1state = scan.nextLine();
							String a1province = scan.nextLine();
							String a1district = scan.nextLine();
							String a1city = scan.nextLine();
							String a1street = scan.nextLine();
							int a1houseNo = Integer.parseInt(scan.nextLine());
							String a1postalCode = scan.nextLine();

							String a2state = scan.nextLine();
							String a2province = scan.nextLine();
							String a2district = scan.nextLine();
							String a2city = scan.nextLine();
							String a2street = scan.nextLine();
							int a2houseNo = Integer.parseInt(scan.nextLine());
							String a2postalCode = scan.nextLine();

							String g1fname = scan.nextLine();
							String g1lname = scan.nextLine();
							String g1email = scan.nextLine();
							String g1cnic = scan.nextLine();
							String g1phoneNo = scan.nextLine();
							char g1gender = scan.nextLine().charAt(0);
							String g1relation = scan.nextLine();
							String g1occupation = scan.nextLine();
							double g1monthlyIncome = Double.parseDouble(scan.nextLine());
							double g1annualIncome = Double.parseDouble(scan.nextLine());

							String g2fname = scan.nextLine();
							String g2lname = scan.nextLine();
							String g2email = scan.nextLine();
							String g2cnic = scan.nextLine();
							String g2phoneNo = scan.nextLine();
							char g2gender = scan.nextLine().charAt(0);
							String g2relation = scan.nextLine();
							String g2occupation = scan.nextLine();
							double g2monthlyIncome = Double.parseDouble(scan.nextLine());
							double g2annualIncome = Double.parseDouble(scan.nextLine());

							String middle = scan.nextLine();
							String high = scan.nextLine();
							String college = scan.nextLine();
							String uni = scan.nextLine();
							int middleEnd = Integer.parseInt(scan.nextLine());
							int highEnd = Integer.parseInt(scan.nextLine());
							int collegeEnd = Integer.parseInt(scan.nextLine());
							int uniEnd = Integer.parseInt(scan.nextLine());
							double totalHigh = Double.parseDouble(scan.nextLine());
							double totalCollege = Double.parseDouble(scan.nextLine());
							double obtHigh = Double.parseDouble(scan.nextLine());
							double obtCollege = Double.parseDouble(scan.nextLine());
							double gpa = Double.parseDouble(scan.nextLine());
							int noOfDegrees = Integer.parseInt(scan.nextLine());
							String[] degrees = new String[noOfDegrees];
							for(int i = 0; i < noOfDegrees; i++){
								degrees[i] = scan.nextLine();
							}//for

							s = new Student(sfname, slname, semail, scnic, sphoneNo, sgender, sdob, sreligion, snationality, smarried, sdisabled, sdegree, sdept, smajor, ssemester, sinstitute, new Address(a1state, a1province, a1district, a1city, a1street, a1houseNo, a1postalCode), new Address(a2state, a2province, a2district, a2city, a2street, a2houseNo, a2postalCode), new Guardian(g1fname, g1lname, g1email, g1cnic, g1phoneNo, g1gender, g1relation, g1occupation, g1monthlyIncome, g1annualIncome), new Guardian(g2fname, g2lname, g2email, g2cnic, g2phoneNo, g2gender, g2relation, g2occupation, g2monthlyIncome, g2annualIncome), new AcademicRecord(middle, high, college, uni, middleEnd, highEnd, collegeEnd, uniEnd, totalHigh, totalCollege, obtHigh, obtCollege, gpa, noOfDegrees, degrees));
		
							scan.close();
							
							Data.RegisteredStudents.add(s);
						}//if
					}//for
				}//if
				else{
					System.out.println("\n\t\t\u001B[30mNo Students Registered Yet!\u001B[0m");
				}//else
				
			}//if
			else{
				System.out.println("\n\t\t\u001B[30mNo Students Registered Yet!\u001B[0m");
			}//else

			
		}//method
			
		public static void ReadUnregisteredStudents() throws Exception{
			
			File folder = new File("Unregistered Students");

			if(folder.exists() && folder.isDirectory()){
				File[] files = folder.listFiles();
				if(files != null){
					for(File file : files){
						if(file.isFile() && file.getName().endsWith(".txt") && !file.getName().equals("desktop.ini")){
							
							Student s;
							
							Scanner scan = new Scanner(file);
							
							String sfname = scan.nextLine();
							String slname = scan.nextLine();
							String semail = scan.nextLine();
							String scnic = scan.nextLine();
							String sphoneNo = scan.nextLine();
							char sgender = scan.nextLine().charAt(0);
							String sdob = scan.nextLine();
							String sreligion = scan.nextLine();
							String snationality = scan.nextLine();
							boolean smarried = Boolean.parseBoolean(scan.nextLine());
							boolean sdisabled = Boolean.parseBoolean(scan.nextLine());
							String sdegree = scan.nextLine();
							String sdept = scan.nextLine();
							String smajor = scan.nextLine();
							int ssemester = Integer.parseInt(scan.nextLine());
							String sinstitute = scan.nextLine();

							String a1state = scan.nextLine();
							String a1province = scan.nextLine();
							String a1district = scan.nextLine();
							String a1city = scan.nextLine();
							String a1street = scan.nextLine();
							int a1houseNo = Integer.parseInt(scan.nextLine());
							String a1postalCode = scan.nextLine();

							String a2state = scan.nextLine();
							String a2province = scan.nextLine();
							String a2district = scan.nextLine();
							String a2city = scan.nextLine();
							String a2street = scan.nextLine();
							int a2houseNo = Integer.parseInt(scan.nextLine());
							String a2postalCode = scan.nextLine();

							String g1fname = scan.nextLine();
							String g1lname = scan.nextLine();
							String g1email = scan.nextLine();
							String g1cnic = scan.nextLine();
							String g1phoneNo = scan.nextLine();
							char g1gender = scan.nextLine().charAt(0);
							String g1relation = scan.nextLine();
							String g1occupation = scan.nextLine();
							double g1monthlyIncome = Double.parseDouble(scan.nextLine());
							double g1annualIncome = Double.parseDouble(scan.nextLine());

							String g2fname = scan.nextLine();
							String g2lname = scan.nextLine();
							String g2email = scan.nextLine();
							String g2cnic = scan.nextLine();
							String g2phoneNo = scan.nextLine();
							char g2gender = scan.nextLine().charAt(0);
							String g2relation = scan.nextLine();
							String g2occupation = scan.nextLine();
							double g2monthlyIncome = Double.parseDouble(scan.nextLine());
							double g2annualIncome = Double.parseDouble(scan.nextLine());

							String middle = scan.nextLine();
							String high = scan.nextLine();
							String college = scan.nextLine();
							String uni = scan.nextLine();
							int middleEnd = Integer.parseInt(scan.nextLine());
							int highEnd = Integer.parseInt(scan.nextLine());
							int collegeEnd = Integer.parseInt(scan.nextLine());
							int uniEnd = Integer.parseInt(scan.nextLine());
							double totalHigh = Double.parseDouble(scan.nextLine());
							double totalCollege = Double.parseDouble(scan.nextLine());
							double obtHigh = Double.parseDouble(scan.nextLine());
							double obtCollege = Double.parseDouble(scan.nextLine());
							double gpa = Double.parseDouble(scan.nextLine());
							int noOfDegrees = Integer.parseInt(scan.nextLine());
							String[] degrees = new String[noOfDegrees];
							for(int i = 0; i < noOfDegrees; i++){
								degrees[i] = scan.nextLine();
							}//for

							s = new Student(sfname, slname, semail, scnic, sphoneNo, sgender, sdob, sreligion, snationality, smarried, sdisabled, sdegree, sdept, smajor, ssemester, sinstitute, new Address(a1state, a1province, a1district, a1city, a1street, a1houseNo, a1postalCode), new Address(a2state, a2province, a2district, a2city, a2street, a2houseNo, a2postalCode), new Guardian(g1fname, g1lname, g1email, g1cnic, g1phoneNo, g1gender, g1relation, g1occupation, g1monthlyIncome, g1annualIncome), new Guardian(g2fname, g2lname, g2email, g2cnic, g2phoneNo, g2gender, g2relation, g2occupation, g2monthlyIncome, g2annualIncome), new AcademicRecord(middle, high, college, uni, middleEnd, highEnd, collegeEnd, uniEnd, totalHigh, totalCollege, obtHigh, obtCollege, gpa, noOfDegrees, degrees));
		
							scan.close();
							
							Data.UnregisteredStudents.add(s);
						}//if
					}//for
				}//if
				else{
					System.out.println("\n\t\t\u001B[30mNo Students Unregistered Yet!\u001B[0m");
				}//else
				
			}//if
			else{
				System.out.println("\n\t\t\u001B[30mNo Students Unregistered Yet!\u001B[0m");
			}//else
			
		}//method

		public static void ReadScholarships()throws Exception{
		
			ReadRegisteredScholarships();
			ReadArchivedScholarships();
			
		}//method
		

		public static void ReadRegisteredScholarships()throws Exception{
			
			File folder = new File("Registered Scholarships");

			if(folder.exists() && folder.isDirectory()){
				File[] files = folder.listFiles();
				if(files != null){
					for(File file : files){
						if(file.isFile() && file.getName().endsWith(".txt") && !file.getName().equals("desktop.ini")){
							
							Scholarship s = null;
							
							Scanner scan = new Scanner(file);
							
							if(file.getName().contains("Disability")){
								
								String name = scan.nextLine();
								double amount = Double.parseDouble(scan.nextLine());
								String deadline = scan.nextLine();
								String disabilityType = scan.nextLine();
								double minGPA = Double.parseDouble(scan.nextLine());

								s = new DisabilityBased(name, amount, deadline, disabilityType, minGPA);


							}//if
							else if(file.getName().contains("Sport")){

								String name = scan.nextLine();
								double amount = Double.parseDouble(scan.nextLine());
								String deadline = scan.nextLine();
								String sportType = scan.nextLine();
								String eligibilityLevel = scan.nextLine();
								double minGPA = Double.parseDouble(scan.nextLine());

								s = new SportBased(name, amount, deadline, sportType, eligibilityLevel, minGPA);

							}//else-if
							else if(file.getName().contains("Merit")){
								
								String name = scan.nextLine();
								double amount = Double.parseDouble(scan.nextLine());
								String deadline = scan.nextLine();
								double minGPA = Double.parseDouble(scan.nextLine());

								s = new MeritBased(name, amount, deadline, minGPA);
								
							}//else-if
							else if(file.getName().contains("Need")){
								
								String name = scan.nextLine();
								double amount = Double.parseDouble(scan.nextLine());
								String deadline = scan.nextLine();
								double minGPA = Double.parseDouble(scan.nextLine());
								double familyIncomeLimit = Double.parseDouble(scan.nextLine());

								s = new NeedBased(name, amount, deadline, minGPA, familyIncomeLimit);
								
							}//if

							scan.close();
							
							if(s != null){
								Data.RegisteredScholarships.add(s);
							}//if
						}//if
					}//for
				}//if
				else{
					System.out.println("\n\t\t\u001B[30mNo Scholarships Registered Yet!\u001B[0m");
				}//else
				
			}//if
			else{
				System.out.println("\n\t\t\u001B[30mNo Scholarships Registered Yet!\u001B[0m");
			}//else

			
		}//method

		
		public static void ReadArchivedScholarships()throws Exception{
			
			File folder = new File("Archived Scholarships");

			if(folder.exists() && folder.isDirectory()){
				File[] files = folder.listFiles();
				if(files != null){
					for(File file : files){
						if(file.isFile() && file.getName().endsWith(".txt") && !file.getName().equals("desktop.ini")){
							
							Scholarship s = null;
							
							Scanner scan = new Scanner(file);
							
							if(file.getName().contains("Disability")){
								
								String name = scan.nextLine();
								double amount = Double.parseDouble(scan.nextLine());
								String deadline = scan.nextLine();
								String disabilityType = scan.nextLine();
								double minGPA = Double.parseDouble(scan.nextLine());

								s = new DisabilityBased(name, amount, deadline, disabilityType, minGPA);

							}//if
							else if(file.getName().contains("Sport")){

								String name = scan.nextLine();
								double amount = Double.parseDouble(scan.nextLine());
								String deadline = scan.nextLine();
								String sportType = scan.nextLine();
								String eligibilityLevel = scan.nextLine();
								double minGPA = Double.parseDouble(scan.nextLine());

								s = new SportBased(name, amount, deadline, sportType, eligibilityLevel, minGPA);

							}//else-if
							else if(file.getName().contains("Merit")){
								
								String name = scan.nextLine();
								double amount = Double.parseDouble(scan.nextLine());
								String deadline = scan.nextLine();
								double minGPA = Double.parseDouble(scan.nextLine());

								s = new MeritBased(name, amount, deadline, minGPA);
								
							}//else-if
							else if(file.getName().contains("Need")){
								
								String name = scan.nextLine();
								double amount = Double.parseDouble(scan.nextLine());
								String deadline = scan.nextLine();
								double minGPA = Double.parseDouble(scan.nextLine());
								double familyIncomeLimit = Double.parseDouble(scan.nextLine());

								s = new NeedBased(name, amount, deadline, minGPA, familyIncomeLimit);
								
							}//if

							scan.close();
							
							if(s != null){
								Data.ArchivedScholarships.add(s);
							}//if
						}//if
					}//for
				}//if
				else{
					System.out.println("\n\t\t\u001B[30mNo Scholarships Archived Yet!\u001B[0m");
				}//else
				
			}//if
			else{
				System.out.println("\n\t\t\u001B[30mNo Scholarships Archived Yet!\u001B[0m");
			}//else

			
		}//method


//-----------------------------------------------------------------Scholarship Registration-------------------------------------------------------------------

		public static void RegisterScholarship() throws Exception{
			
			System.out.println("\n\n\t\t\t\t\u001B[35m┌------------------------------------------------------------------------┐");
			System.out.println("\t\t\t\t|\u001B[0m\t\t\tSCHOLARSHIP REGISTRATION\t\t\t \u001B[35m|");
			System.out.println("\t\t\t\t└------------------------------------------------------------------------┘\u001B[0m\n\n");
			in.nextLine();
			System.out.println("\n\t\tChoose from the Options Below:");
			System.out.println("\n\t\t1. Merit-Based Scholarship");
			System.out.println("\t\t2. Sports-Based Scholarship");
			System.out.println("\t\t3. Disability-Based Scholarship");
			System.out.println("\t\t4. Need-Based Scholarship");
			System.out.println("\t\t5. Back");
			System.out.print("\n\t\tPress from 1-5:	");
			char ch = in.next().charAt(0);
			while((ch != '1') && (ch != '2') && (ch != '3') && (ch != '4') && (ch != '5')){
				System.out.print("\t\t\u001B[31mEnter Again:\u001B[0m ");
				ch = in.next().charAt(0);
			}//while
			Scholarship s;
			if(ch == '1'){
				s = RegisterMeritBased();
				ScholarshipRegistry(s);
				Data.RegisteredScholarships.add(s);
				System.out.print("\n\n\n\n");
			}//if
			else if(ch == '2'){
				s = RegisterSportBased();
				ScholarshipRegistry(s);
				Data.RegisteredScholarships.add(s);
				System.out.print("\n\n\n\n");
			}//else-if
			else if(ch == '3'){
				s = RegisterDisabilityBased();
				ScholarshipRegistry(s);
				Data.RegisteredScholarships.add(s);
				System.out.print("\n\n\n\n");
			}//else-if
			else if(ch == '4'){
				s = RegisterNeedBased();
				ScholarshipRegistry(s);
				Data.RegisteredScholarships.add(s);
				System.out.print("\n\n\n\n");
			}//else-if
			else 
				return;
			
		}//method
		
		public static Scholarship RegisterDisabilityBased(){
			
			System.out.println("\n\t\u001B[35m┌-----------------------------------------┐");
			System.out.println("\t|\u001B[0m\tDISABILITY-BASED SCHOLARSHIP   \t  \u001B[35m|");
			System.out.println("\t└-----------------------------------------┘\u001B[0m\n\n");
			System.out.println("\n\tFILL IN THE FOLLOWING FIELDS.");
			
			String name, deadline, disabilityType;
			double amount, disabilityPercent, minGPA;

			System.out.print("\n\n\t\tScholarship Name: ");
			name = input.nextLine();
			while(!StringChecker(name)){
				System.out.print("\t\t\u001B[31mEnter Scholarship Name Again:\u001B[0m ");
				name = input.nextLine();
			}//while

			System.out.print("\n\t\tAmount: ");
			amount = sc.nextDouble();
			while(amount < 0.0 || amount == 0.0){
				System.out.print("\t\t\u001B[31mEnter Amount Again:\u001B[0m ");
				amount = sc.nextDouble();
			}//while
			
			System.out.print("\n\t\tScholarship Deadline (YYYY-MM-DD): ");
			deadline = in.next();
			while(deadline == null || deadline.equals("") || !deadline.matches("^\\d{4}-\\d{2}-\\d{2}$")){
				System.out.print("\t\t\u001B[31mEnter Date Again:\u001B[0m ");
				deadline = in.next();
			}//while

			System.out.print("\n\n\t\tDisability Type: ");
			disabilityType = input.nextLine();
			while(!StringChecker(disabilityType)){
				System.out.print("\t\t\u001B[31mEnter Disability Type Again:\u001B[0m ");
				disabilityType = input.nextLine();
			}//while

			System.out.print("\n\t\tMinimum GPA: ");
			minGPA = sc.nextDouble();
			while(minGPA < 0.0 || minGPA == 0.0){
				System.out.print("\t\t\u001B[31mEnter Minimum GPA Again:\u001B[0m ");
				minGPA = sc.nextDouble();
			}//while
			
			Scholarship d = new DisabilityBased(name, amount, deadline, disabilityType, minGPA);
			
			return d;
			
		}//method
		
		public static Scholarship RegisterSportBased(){
			
			System.out.println("\n\t\u001B[35m┌-----------------------------------------┐");
			System.out.println("\t|\u001B[0m\t   SPORTS-BASED SCHOLARSHIP   \t  \u001B[35m|");
			System.out.println("\t└-----------------------------------------┘\u001B[0m\n\n");
			System.out.println("\n\tFILL IN THE FOLLOWING FIELDS.");
			
			String name, deadline, sportType, eligibilityLevel;
			double amount, minGPA;

			System.out.print("\n\n\t\tScholarship Name: ");
			name = input.nextLine();
			while(!StringChecker(name)){
				System.out.print("\t\t\u001B[31mEnter Scholarship Name Again:\u001B[0m ");
				name = input.nextLine();
			}//while

			System.out.print("\n\t\tAmount: ");
			amount = sc.nextDouble();
			while(amount < 0.0 || amount == 0.0){
				System.out.print("\t\t\u001B[31mEnter Amount Again:\u001B[0m ");
				amount = sc.nextDouble();
			}//while
			
			System.out.print("\n\t\tScholarship Deadline (YYYY-MM-DD): ");
			deadline = in.next();
			while(deadline == null || deadline.equals("") || !deadline.matches("^\\d{4}-\\d{2}-\\d{2}$")){
				System.out.print("\t\t\u001B[31mEnter Date Again:\u001B[0m ");
				deadline = in.next();
			}//while

			System.out.print("\n\n\t\tSport Type: ");
			sportType = input.nextLine();
			while(!StringChecker(sportType)){
				System.out.print("\t\t\u001B[31mEnter Sport Type Again:\u001B[0m ");
				sportType = input.nextLine();
			}//while
			
			System.out.print("\n\n\t\tEligibility Level: ");
			eligibilityLevel = input.nextLine();
			while(!StringChecker(eligibilityLevel)){
				System.out.print("\t\t\u001B[31mEnter Eligibility Level Again:\u001B[0m ");
				eligibilityLevel = input.nextLine();
			}//while

			System.out.print("\n\t\tMinimum GPA: ");
			minGPA = sc.nextDouble();
			while(minGPA < 0.0 || minGPA == 0.0){
				System.out.print("\t\t\u001B[31mEnter Minimum GPA Again:\u001B[0m ");
				minGPA = sc.nextDouble();
			}//while
			
			Scholarship s = new SportBased(name, amount, deadline, sportType, eligibilityLevel, minGPA);
			
			return s; 
			
		}//method
	
		public static Scholarship RegisterMeritBased(){
			
			System.out.println("\n\t\u001B[35m┌-----------------------------------------┐");
			System.out.println("\t|\t\u001B[0m   MERIT-BASED SCHOLARSHIP   \t  \u001B[35m|");
			System.out.println("\t└-----------------------------------------┘\u001B[0m\n\n");
			System.out.println("\n\tFILL IN THE FOLLOWING FIELDS.");
			
			String name, deadline;
			double amount, minGPA;

			System.out.print("\n\n\t\tScholarship Name: ");
			name = input.nextLine();
			while(!StringChecker(name)){
				System.out.print("\t\t\u001B[31mEnter Scholarship Name Again:\u001B[0m ");
				name = input.nextLine();
			}//while

			System.out.print("\n\t\tAmount: ");
			amount = sc.nextDouble();
			while(amount < 0.0 || amount == 0.0){
				System.out.print("\t\t\u001B[31mEnter Amount Again:\u001B[0m ");
				amount = sc.nextDouble();
			}//while
			
			System.out.print("\n\t\tScholarship Deadline (YYYY-MM-DD): ");
			deadline = in.next();
			while(deadline == null || deadline.equals("") || !deadline.matches("^\\d{4}-\\d{2}-\\d{2}$")){
				System.out.print("\t\t\u001B[31mEnter Date Again:\u001B[0m ");
				deadline = in.next();
			}//while

			System.out.print("\n\t\tMinimum GPA: ");
			minGPA = sc.nextDouble();
			while(minGPA < 0.0 || minGPA == 0.0){
				System.out.print("\t\t\u001B[31mEnter Minimum GPA Again:\u001B[0m ");
				minGPA = sc.nextDouble();
			}//while
			
			Scholarship m = new MeritBased(name, amount, deadline, minGPA);
			
			return m;

		}//method
	
		public static Scholarship RegisterNeedBased(){
		
			System.out.println("\n\t\u001B[35m┌-----------------------------------------┐");
			System.out.println("\t|\u001B[0m\t    NEED-BASED SCHOLARSHIP   \t  \u001B[35m|");
			System.out.println("\t└-----------------------------------------┘\u001B[0m\n\n");
			System.out.println("\n\tFILL IN THE FOLLOWING FIELDS.");

			String name, deadline;
			double amount, minGPA, familyIncomeLimit;

			System.out.print("\n\n\t\tScholarship Name: ");
			name = input.nextLine();
			while(!StringChecker(name)){
				System.out.print("\t\t\u001B[31mEnter Scholarship Name Again:\u001B[0m ");
				name = input.nextLine();
			}//while

			System.out.print("\n\t\tAmount: ");
			amount = sc.nextDouble();
			while(amount < 0.0 || amount == 0.0){
				System.out.print("\t\t\u001B[31mEnter Amount Again:\u001B[0m ");
				amount = sc.nextDouble();
			}//while
			
			System.out.print("\n\t\tScholarship Deadline (YYYY-MM-DD): ");
			deadline = in.next();
			while(deadline == null || deadline.equals("") || !deadline.matches("^\\d{4}-\\d{2}-\\d{2}$")){
				System.out.print("\t\t\u001B[31mEnter Date Again:\u001B[0m ");
				deadline = in.next();
			}//while

			System.out.print("\n\t\tMinimum GPA: ");
			minGPA = sc.nextDouble();
			while(minGPA < 0.0 || minGPA == 0.0){
				System.out.print("\t\t\u001B[31mEnter Minimum GPA Again:\u001B[0m ");
				minGPA = sc.nextDouble();
			}//while

			System.out.print("\n\t\tFamily Income Limit: ");
			familyIncomeLimit = sc.nextDouble();
			while(familyIncomeLimit < 0.0 || familyIncomeLimit == 0.0){
				System.out.print("\t\t\u001B[31mEnter Family Income Limit Again:\u001B[0m ");
				familyIncomeLimit = sc.nextDouble();
			}//while
			
			Scholarship n = new NeedBased(name, amount, deadline, familyIncomeLimit, minGPA);
			
			return n; 
			

		}//method
		
		public static void ScholarshipRegistry(Scholarship s)throws Exception{

			File folder = new File("Registered Scholarships"); 
			if(!folder.exists()){
				folder.mkdir(); // creates a folder named "Registered Scholarships"
			}//if
			
			File file = null;
			
			if(s instanceof MeritBased){
	
				String _file = "MeritBased_" + s.getName() + ".txt";
				file = new File(folder, _file);
	
			}//if
			else if(s instanceof DisabilityBased){
	
				String _file = "DisabilityBased_" + s.getName() + ".txt";
				file = new File(folder, _file);

			}//else-if
			else if(s instanceof SportBased){
	
				String _file = "SportBased_" + s.getName() + ".txt";
				file = new File(folder, _file);
	
			}//else-if
			else if(s instanceof NeedBased){
				
				String _file = "NeedBased_" + s.getName() + ".txt";
				file = new File(folder, _file);

			}//else-if
			
			FileWriter file_writer = new FileWriter(file, false);
			file_writer.write(s.PRINT());
			file_writer.close();
			
		}//method

//--------------------------------------------------------------------View Available Scholarships--------------------------------------------------------

		public static void ViewAllScholarships() throws IOException{

			//make a folder that has all files of schoalrship
			File folder = new File("Registered Scholarships");

			if(!folder.exists()){
			System.out.println("\n\t\t~ Folder 'scholarships' not found!");
			return;
			}

			//to read or work with files with listFiles , its a method of file and reads all the content of file too
			File[] files = folder.listFiles();

			if(files == null || files.length == 0){
			System.out.println("\n\t\tNo scholarships available yet");
			return;
			}

			System.out.println("\n\t\tList of Available Scholarships:\n\n");

			for(File file : files){
			if(file.isFile() && file.getName().endsWith(".txt")){

				//cause storing names
				String fileName = file.getName();
				if(fileName.contains("MeritBased")){
				System.out.println("\n\t\u001B[32m~ Merit-Based Scholarship\u001B[0m\n");
				} 
				else if(fileName.contains("SportBased")){
				System.out.println("\n\t\u001B[34m~ Sports Scholarship\u001B[0m\n");
				} 
				else if(fileName.contains("NeedBased")){
				System.out.println("\n\t\u001B[33m~ Need-Based Scholarship\u001B[0m\n");
				} 
				else if(fileName.contains("DisabilityBased")){
				System.out.println("\n\t\u001B[35m~ Disability-Based Scholarship\u001B[0m\n");
				}

				//again same thing, counting lines 
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String line;
				while ((line = reader.readLine()) != null) {
				System.out.println("\t\t" + line);
				}
				reader.close();

				System.out.println();
			}
			}

			System.out.println("\n\n\t\u001B[35mAll Scholarships Displayed\u001B[0m\n\n\n\n");
		}

//--------------------------------------------------------------------Update Scholarship--------------------------------------------------------------------


		public static void UpdateScholarship() throws Exception {

		Scanner Input = new Scanner(System.in);

		//ask admin for name
		System.out.print("\n\t\tEnter Scholarship name or keyword(case-sensitive): ");
		File folder = new File("Registered Scholarships");
		String keyword = Input.nextLine(); //lowercase mai convert ho rha

		File[] files = folder.listFiles();
		File file = null;

		//searchingfile
		for(File f : files){
			if(f.getName().contains(keyword) && f.getName().endsWith(".txt")){
				file = f;
				break;
			}//if
		}//for

		//if wrong name enetred , or doesnt exist, ask again
		while(file == null || !file.exists()){
			System.out.println("\n\t\t\u001B[31mFile not found. Try again.\u001B[0m");
			System.out.print("\n\t\tEnter scholarship name or keyword: ");
			keyword = Input.nextLine().toLowerCase();

			for(File f : files){
				if (f.getName().toLowerCase().contains(keyword) && f.getName().endsWith(".txt")) {
					file = f;
					break;
				}//if
			}//for
		}//while

		//again same thing, counting lines 
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String[] lines = new String[10]; //limit set for lines
		int count = 0;
		String line;
		while((line = reader.readLine()) != null){
			lines[count++] = line;
		}
		reader.close();

		boolean updating = true;
		while(updating){
			//showing all fields with numbers
			System.out.println("\n\t\tLines:\n");
			for(int i = 0; i < count; i++){
				System.out.println("\t\t" + (i + 1) + " - " + lines[i]);
			}

			//asking which field
			System.out.print("\n\t\tSelect line number to update (1 to " + count + "): ");
			int choice = Input.nextInt();
			Input.nextLine(); //resetting the buffer

			if(choice >= 1 && choice <= count){
				//so im asking what value to update this line with
				System.out.print("\n\t\tEnter new value for line " + choice + ": ");
				String newValue = Input.nextLine();

				//putting value on that choice number, choice -1 cause of index as it starts from 0
				lines[choice - 1] = newValue;
				System.out.println("\n\t\t\u001B[32mUpdated successfully!\u001B[0m");
			}	
		else{
			System.out.println("\n\t\t\u001B[31mInvalid choice.\u001B[0m");
		}

		//ask if wants to update more
		System.out.print("\n\n\t\tUpdate another line? (yes/no): ");
		String again = Input.nextLine().toLowerCase(); //incase enters in caps
		updating = again.equals("yes");
		}

		//replacing my old file with new file , containing updated values
		PrintWriter writer = new PrintWriter(new FileWriter(file));
		for(int i = 0; i < count; i++){
			writer.println(lines[i]);
		}
		writer.flush();
		writer.close();

		System.out.println("\n\t\t\u001B[34mAll updates saved to file\u001B[0m\n\n\n\n");

		}

//-------------------------------------------------------------------Archive Scholarsip--------------------------------------------------------------------


		public static void ArchiveScholarship() throws Exception{
			
			File oldFolder = new File("Registered Scholarships");
			File newFolder = new File("Archived Scholarships");

			if(!oldFolder.exists()){
			System.out.println("\n\t\tNo scholarship folder found");
			return;
			}

			if(!newFolder.exists()){
			newFolder.mkdir();
			}

			File[] files = oldFolder.listFiles();
			if(files == null || files.length == 0){
			System.out.println("\n\t\tNo scholarships found");
			return;
			}

			LocalDate today = LocalDate.now();

			for(File file : files){
			if(file.isFile() && file.getName().endsWith(".txt")){
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String line;
				int lineNumber = 1;
				String dateStr = null;

				while((line = reader.readLine()) != null){
				if(lineNumber == 3){ // deadline is always on line 3
					dateStr = line.trim();
					break;
				}
				lineNumber++;
				}

				reader.close();

				if(dateStr != null){
				String[] parts = dateStr.split("-");

				int year = Integer.parseInt(parts[0]);
				int month = Integer.parseInt(parts[1]);
				int day = Integer.parseInt(parts[2]);

				LocalDate deadline = LocalDate.of(year, month, day);

				if(deadline.isBefore(today)){
					File movedFile = new File(newFolder, file.getName());
					boolean moved = file.renameTo(movedFile);
					if(moved){
					System.out.println("\u001B[30mArchived: " + file.getName() + "\u001B[0m");
					} 
					else{
					System.out.println("\u001B[30mCould not archive: " + file.getName() + "\u001B[0m");
					}
				}
				}
			}
			}

			
		}

//-------------------------------------------------------------------View All Applicants-------------------------------------------------------------------


		public static void ViewAllApplicants() throws IOException{

			Scanner Input = new Scanner(System.in);
			File file = new File("Applications.txt");

			if(!file.exists()){
				System.out.println("\n\t\tNo applicants found. File not present.");
				return;
			}

			System.out.println("\n\n\t\tStudents who applied for Scholarship:\n");

			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			while((line = reader.readLine()) != null){
				if(line.trim().isEmpty()){
					System.out.println();
				}
				else{
					System.out.println("\t\t" + line);
				}
			}

			reader.close();

			System.out.println("\n\n\t\t\u001B[34mAll applicants shown\u001B[0m");
			System.out.print("\n\t\tDo you want to see detailed info of a student? (\u001B[32m yes \u001B[0m/\u001B[31m no \u001B[0m): ");
			String choice = Input.nextLine().toLowerCase();

			if(choice.equals("yes")){
				System.out.print("\n\t\tEnter CNIC of the student: ");
				String cnic = Input.nextLine();

				//cnic validation
				while(cnic == null || cnic.equals("") || !cnic.matches("^\\d{5}-\\d{7}-\\d{1}$")){
					System.out.print("\t\t\u001B[31mEnter CNIC Again (XXXXX-XXXXXXX-X):\u001B[0m ");
					cnic = Input.next();
				}

				File folder = new File("Registered Students");
				String fileName = cnic + ".txt";
				File file2 = new File(folder, fileName);

				if(file2.exists()){
					System.out.println("\n\t\t\u001B[32m Full Student Profile:\u001B[0m\n");
					BufferedReader dets = new BufferedReader(new FileReader(file2));
					String detailLine;
					while((detailLine = dets.readLine()) != null){
						System.out.println("\t\t" + detailLine);
					}
					dets.close();
				} 
				else{
					System.out.println("\n\t\tNo detailed record found for CNIC: " + cnic + "\n\n\n\n");
				}
			} 
			else{
				System.out.println("\n\t\tExiting view. \n\n\n\n");
			}
		}

//----------------------------------------------------------------------Apply Student---------------------------------------------------------------------

		public static void ApplyStudent() throws Exception{

			Scanner Sc = new Scanner(System.in);

			String cnic = "";
			System.out.print("\n\t\tEnter your CNIC: ");
			cnic = Sc.next();
		
			// CNIC input with validation
			while(cnic == null || cnic.equals("") || !cnic.matches("^\\d{5}-\\d{7}-\\d{1}$")){
				System.out.print("\t\t\u001B[31mEnter CNIC Again (XXXXX-XXXXXXX-X):\u001B[0m ");
				cnic = Sc.next();
			}//while
			Sc.nextLine() ;

			boolean found = false;
			String _file = cnic + ".txt";
			File folder = new File("Registered Students");
			File file = new File(folder, _file);
			if(file.exists()){
				System.out.println("\u001B[30mFile found.\u001B[0m");
				found = true ;
			} //if
			else{
				System.out.println("\n\t\t\u001B[31mFile not found.\u001B[0m");
			}//else
			
			
			if(!found) {
				System.out.println("\n\t\t\u001B[31mCNIC is incorrect or is not registered!\u001B[0m.");
				return;
			}//if
			else if(found){

				boolean applying = true;
				String Scholarship = null;
				while(applying){

					ViewAllScholarships() ;
					System.out.println("\n\t\t\u001B[34mEnter the name of Scholarship which you want to apply for : \u001B[0m") ;
					String SchName = Sc.nextLine(); //validation

					File folder2 = new File("Registered Scholarships");
					File[] files = folder2.listFiles();
					File file2 = null;

					//searchingfile
					for(File f : files){
						if(f != null && f.getName().contains(SchName) && f.getName().endsWith(".txt")){
							file2 = f;
							Scholarship = file2.getName();
							break;
						}//if
					}//for

					//if wrong name enetred , or doesnt exist, ask again
					while(file2 == null || !file2.exists()){
						System.out.println("\n\t\t\u001B[31mFile not found. Try again.\u001B[0m");
						System.out.print("\n\t\tEnter Scholarship name or keyword: ");
						SchName = Sc.nextLine();

						for(File f : files){
							if (f != null && f.getName().contains(SchName) && f.getName().endsWith(".txt")) {
								file2 = f;
								Scholarship = file2.getName();
								break;
							}//if
						}//for
					}//while
					String fileName = file.getName();
					//Storing applied students in a file
					PrintWriter writer = new PrintWriter(new FileWriter("Applications.txt",true));
					writer.println(LocalDate.now()+"\nProcessing\n" + fileName + "\n" + Scholarship + "\n");
					//writer.flush();
					writer.close();


					System.out.println("\n\t\t\u001B[34mYou have successfully applied for a Scholarship\u001B[0m");
					

					System.out.print("\n\t\tDo you want to apply for another Scholarship? (yes/no): ");
					String again = Sc.nextLine().toLowerCase(); //incase enters in caps
					applying = again.equals("yes");
				}//while
			}
		}


//----------------------------------------------------------------Other Methods--------------------------------------------------------------------------

		
		public static boolean WordChecker(String str){
			if(str != null && !str.equals("") && str.matches("^[a-zA-Z]+$")){
				/*The third condition for validation is a regex, its a formula basically used for patterns in text*/
				/*In the condition above, ^ means start of string, [a-zA-Z] means the domain, + means more than one character, $ means end 				of string.*/
				return true; 
			}//if
			return false;
		}//method

		public static boolean StringChecker(String str){
			if(str != null && !str.equals("") && str.matches("^[a-zA-Z ]+$")){
				return true; 
			}//if
			return false;
		}//method

		public static boolean Affirmation(){
			
			System.out.println("\n\t\tDo You Wanna Move Forward?");
			System.out.println("\t\t1. Yes");
			System.out.println("\t\t2. Go Back");
			System.out.print("\n\t\tChoose: ");
			char ch = sc.next().charAt(0);
			while(ch != '1' && ch != '2'){
				System.out.println("\t\t\u001B[31mChoose Again: \u001B[0m");
				ch = sc.next().charAt(0);
			}//while
			switch(ch){
				case '1':
						System.out.println("\n\n\n\n");
						return true;
				case '2':
				default:
						System.out.println("\n\n\n\n");
						return false;
			}//switch
			
		}//method

	}//class

//--------------------------------------------------------------------------Data----------------------------------------------------------------------------
		
	class Data{
		
		static ArrayList<Student> RegisteredStudents = new ArrayList<Student>();
		static ArrayList<Student> UnregisteredStudents = new ArrayList<Student>();
		static ArrayList<Scholarship> RegisteredScholarships = new ArrayList<Scholarship>();
		static ArrayList<Scholarship> ArchivedScholarships = new ArrayList<Scholarship>();
		
	}//class
/*
	\u001B[31m = Red
	\u001B[35m = Purple
	\u001B[37m = White
	\u001B[0m = Reset
*/
