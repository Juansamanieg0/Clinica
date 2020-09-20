import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Driver {
	
	static ArrayList<Patient> patientslist=new ArrayList<>();
	static ArrayList<Doctors> doctorslist=new ArrayList<>();
	static ArrayList<Appointment> appointmentlist=new ArrayList<>();
	
	public static void writeToPatientFile() throws IOException {
		FileWriter fw=new FileWriter("patient.txt");
		
		for(int i=0;i<patientslist.size();++i) {
			fw.write(patientslist.get(i).getName()+","+patientslist.get(i).getId()+","+patientslist.get(i).getPassword()+","+
					patientslist.get(i).getAddress()+","+patientslist.get(i).getPhone_number()+","+patientslist.get(i).getDisease()+"\n");
		}
		fw.close();
          
	}
	public static  Doctors getDoctor(String id) {
		for(int i=0;i<doctorslist.size();++i) {
			if(doctorslist.get(i).getId().equals(id)) {
				return doctorslist.get(i);
			}
		}
		return null;
	}
	public static  Patient getPatient(String id) {
		for(int i=0;i<patientslist.size();++i) {
			if(patientslist.get(i).getId().equals(id)) {
				return patientslist.get(i);
			}
		}
		return null;
	}
	
	public static boolean authenticate(String id,String password) {
		for(int i=0;i<patientslist.size();++i) {
			if(patientslist.get(i).getId().equals(id) && patientslist.get(i).getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	public static void readFromPatientFile() throws IOException {
		
			BufferedReader reader;
	
				reader = new BufferedReader(new FileReader(
						"patient.txt"));
				
				String line = reader.readLine();
				if(line!=null) {
					if(!line.equals("")) {
						String data[]= line.split(",");
						Patient p=new Patient(data[0], data[1], data[2], data[3], data[4], data[5]);
						
						patientslist.add(p);
						
					}
				}
				
          
	}
	public static void writeToDoctorsFile() throws IOException {
		FileWriter fw=new FileWriter("doctor.txt");
		
		for(int i=0;i<doctorslist.size();++i) {
			fw.write(doctorslist.get(i).getName()+","+doctorslist.get(i).getId()+","+doctorslist.get(i).getPhone_number()+","+
					doctorslist.get(i).getFees()+"\n");
		}
          
		fw.close();
	}
	
	public static void readFromDoctorFile() throws IOException {
		
		BufferedReader reader;

			reader = new BufferedReader(new FileReader(
					"doctor.txt"));
			
			String line = reader.readLine();
			
			if(line!=null) {
				if(!line.equals("")   ) {
					String data[]= line.split(",");
					Doctors d=new Doctors(data[0], data[1], data[2], Integer.parseInt(data[3]));
					
					doctorslist.add(d);
					
				}
			}
			
}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		readFromDoctorFile();
		readFromPatientFile();
		
		while (true) {
			
			
		
		
		System.out.println("Enter 1 to Register Doctor");
		System.out.println("Enter 2 to Register Patient");
		System.out.println("Enter 3 to login to patient portal");
		
		System.out.println("Enter 4 to exit");

		
		
	
		
		Scanner sc=new Scanner(System.in);
		
		String choice=sc.nextLine();
		
		if(choice.equals("4")) {
			writeToDoctorsFile();
			writeToPatientFile();
			break;
		}
		
		else if(choice.equals("1")) {
			Doctors d=new Doctors();
			d.input();
			doctorslist.add(d);
		}
		else if (choice.equals("2")) {
			Patient p=new Patient();
			p.input();
			patientslist.add(p);
			
		}
		else if (choice.equals("3")) {
			System.out.println("Enter id");
			String id=sc.nextLine();
			System.out.println("Enter password");
			String password=sc.nextLine();
			
			if(authenticate(id, password)) {
				System.out.print("Successfully logged in \n\n");
				while(true) {
				
				System.out.print("Enter d to see registered doctors list\n");
				System.out.print("Enter a to make appointment\n");
				System.out.print("Enter l to list  appointments made\n");
				System.out.print("Enter h to logout\n");
				
				choice=sc.nextLine();
				
				if(choice.equals("d")) {
					System.out.print("Doctors registered :\n");
					for(int i=0;i<doctorslist.size();++i) {
						System.out.print(doctorslist.get(i).toString());
					}
				}
				else if(choice.equals("a")) {
					System.out.print("Enter doctor id :");
					String did=sc.nextLine();
					
					
					System.out.print("Enter date :");
					int date=sc.nextInt();
					sc.nextLine();
					System.out.print("Enter month :");
					int month=sc.nextInt();
					sc.nextLine();
					System.out.print("Enter year :");
					int year=sc.nextInt();
					sc.nextLine();
					System.out.print("Enter hour :");
					int hours=sc.nextInt();
					sc.nextLine();
					System.out.print("Enter minutes :");
					int minutes=sc.nextInt();
					sc.nextLine();
					
					Date d=new Date();
					d.setDate(date);
					d.setMonth(month);
					d.setYear(year);
					d.setHours(hours);
					d.setMinutes(minutes);
					
					
					Doctors doc=getDoctor(did);
					if(doc==null) {
						System.out.print("Dpctor with this id not found\n");
					}
					else {
						Appointment a=new Appointment(d, doc, getPatient(id));
						appointmentlist.add(a);
						System.out.print("Appointment made");
					}
					
					
				}
				else if(choice.equals("l")) {
					for(int i=0;i<appointmentlist.size();++i) {
						System.out.println(appointmentlist.get(i).toString());
					}
				}
				else if(choice.equals("h")) {
					System.out.print("logged out");
					break;
				}
				
				
			}
			}
			

		}
		

	}

	}
}
