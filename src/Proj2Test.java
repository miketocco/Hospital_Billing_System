import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Proj2Test {
    public static void main (String[] args) throws FileNotFoundException {
        // create dates
        DateClass dob = new DateClass(10,13,1994);
        DateClass ad = new DateClass(8,4,2021);
        DateClass d = new DateClass(9,5,2022);

        // create doctor
        Doctor doctor = new Doctor("Joe", "Tocco", "Surgery");

        // create patient
        Patient patient = new Patient("Michael", "Tocco", 1234, dob, doctor, ad, d);

        // create bill
        Bill bill = new Bill(1234, 100, 100, 100);

        // display info to screen
        System.out.println(patient.getPatientInfo());
        System.out.println("\n" + bill.getBillInfo());

        // make file
        String fileName = patient.getFirstName() + patient.getLastName();
        File file = new File(fileName + ".txt");
        PrintWriter output = new PrintWriter(file);

        // write data to file
        output.println(patient.getPatientInfo());
        output.println("\n" + bill.getBillInfo());

        // close file
        output.close();
    }
}
