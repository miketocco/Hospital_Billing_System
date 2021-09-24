public class Bill {
    // attributes
    private int patientID;
    private double pharmacyCharges;
    private double doctorsFee;
    private double roomCharges;

    // constructors
    Bill(){
        patientID = 0;
        pharmacyCharges = 0;
        doctorsFee = 0;
        roomCharges = 0;
    }
    Bill(int id, double p, double d, double r){
        patientID = id;
        pharmacyCharges = p;
        doctorsFee = d;
        roomCharges = r;
    }

    // set
    public void setBill(int id, double p, double d, double r){
        patientID = id;
        pharmacyCharges = p;
        doctorsFee = d;
        roomCharges = r;
    }

    // get total bill amount
    public double getBillTotal(){
        return (pharmacyCharges + doctorsFee + roomCharges);
    }

    // get bill information
    public String getBillInfo(){
        return (
                "Bill: " + "\n" +
                "Patient ID: " + patientID + "\n" +
                "Pharmacy Charges: $" + pharmacyCharges + "\n" +
                "Doctor Fee: $" + doctorsFee +  "\n" +
                "Room Charges: $" + roomCharges + "\n" +
                "-------------------------------"+ "\n" +
                "Total: $" + this.getBillTotal()
                );
    }
}
