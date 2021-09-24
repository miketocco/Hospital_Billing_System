public class Patient extends Person {
    // attributes
    private int ID;
    private DateClass DOB;
    private Doctor atndPhy;
    private DateClass admitted;
    private DateClass discharged;

    Patient(){
        super();
        ID = 0;
        DOB = null;
        atndPhy = null;
        admitted = null;
        discharged = null;
    }
    Patient(String f, String l, int id, DateClass dob, Doctor phy, DateClass ad, DateClass d){
        super(f,l);
        ID = id;
        DOB = (DateClass)dob.clone();
        atndPhy = (Doctor)phy.clone();
        admitted = (DateClass)ad.clone();
        discharged = (DateClass)d.clone();
    }

    // set
    public void setInfo(int id, DateClass dob, Doctor phy, DateClass ad, DateClass d){
        ID = id;
        DOB = (DateClass) dob.clone();
        admitted = (DateClass) ad.clone();
        discharged = (DateClass) d.clone();
        atndPhy = (Doctor) d.clone();
    }

    // get info
    public String getPatientInfo(){
        return(
                "Patient: " + this.getName() + "\n" +
                "Attending Physician: " + atndPhy.getName() + "\n" +
                "Admitted: " + admitted.getDate() + "\n" +
                "Discharged: " + discharged.getDate()
                );
    }
}
