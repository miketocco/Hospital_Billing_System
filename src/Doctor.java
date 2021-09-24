
public class Doctor extends Person {
    // attributes
    private String speciality;

    // constructors
    Doctor(){
        super();
        speciality = "no speciality";
    }
    Doctor(String f, String l, String s){
        super(f,l);
        speciality = s;
    }

    // set
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    // get info
    public String getDocInfo(){
        return (this.getName() + " " + speciality);
    }

    // clone
    @Override
    public Object clone() {
        Doctor docClone = new Doctor(this.getFirstName(), this.getLastName(), speciality);
        return docClone;
    }
}
