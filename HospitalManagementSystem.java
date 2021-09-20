package amigo;
import java.util.*;
class Doctor{
	//declaration
	String name;
	String qualification;
	String experience;
	String salary;
	
	public Doctor(String drname,String quali,String expi,String sal)
	{
		name =drname;
		qualification=quali;
		experience=expi;
		salary=sal;
	}
	
	 public String toString() {
		 return " "+name+" ,"+qualification+" ,"+experience+" ,"+salary;
	 }
}
class Patient{
	//declaration
	String namep ;
	String age;
	String Illness;
	String bloodgroup;

    public Patient(String ptname,String ag,String ill,String bg)
    {
	namep= ptname;
	age=ag;
	Illness=ill;
	bloodgroup=bg;
    }
    public String toString() {
    	return" "+namep+" ,"+age+" ,"+Illness+ " ,"+bloodgroup;
    }
}
public class HospitalManagementSystem {
	static ArrayList<Patient> pt =new ArrayList<Patient>();
	static ArrayList<Doctor> dr =new ArrayList<Doctor>();


	public static void main(String[] args) {
        System.out.println("********************************************");
        System.out.println("*       WELCOME TO SRUJAN HOSPITAL         *");
        System.out.println("********************************************");
        System.out.println("Enter Choice\n");
        System.out.println("1.Add Doctor");

        System.out.println("2.Add pt");

        System.out.println("3.Show Staf");

        System.out.println("4.Show pt");

        System.out.println("5.Discharge patients");
        while(true) {
        	@SuppressWarnings("resource")
			Scanner ch = new Scanner(System.in);
        	int x=ch.nextInt();
        	
        	switch(x)
        	{
        	
        	case 1:
        		Scanner setd = new Scanner(System.in);
                System.out.println("Enter  information of doctor");
                
                System.out.println("Enter  name of a doctor");
                String tempname =setd.nextLine();
                
                System.out.println("Enter Qualifications");
                String tempqal=setd.nextLine()
;
                System.out.println("Enter  experience");
                String tempex =setd.nextLine();
                
                System.out.println("Enter salary given to doctor");
                String temsal =setd.nextLine();
                
                dr.add(new Doctor(tempname,tempqal,tempex,temsal));
                System.out.println("*------------------------------------------*");
                
                break;
        	case 2:
        		Scanner setp = new Scanner(System.in);
                System.out.println("Enter  information of patient");
                
                System.out.println("Enter  name of a patient");
                String tempnamep =setp.nextLine();
                
                System.out.println("Enter age");
                String tempag=setp.nextLine()
;
                System.out.println("Enter  illness");
                String tempill =setp.nextLine();
                
                System.out.println("Blood Group");
                String tempbg =setp.nextLine();
                
                pt.add(new Patient(tempnamep,tempag,tempill,tempbg));
                System.out.println("*------------------------------------------*");
                
                break;
        	case 3:
        		System.out.println("NAME  QUALIFICATION   EXPERIENCE   SALARY");
        		for(int j=0;j<dr.size();j++)
        		{
        			System.out.println(dr.get(j));
        		}
        		break;	
        	case 4:
        		System.out.println("NAME  AGE   ILLNESS   BLOODGROUP");
        		for(int k=0;k<pt.size();k++)
        		{
        			System.out.println(pt.get(k));
        		}
        		break;
        	case 5:
        		System.out.println("Discharging  patient soon");
        		break;
        		
        	default:
        			System.out.println("Wrong Choice");

        	}
        }

	}

}
