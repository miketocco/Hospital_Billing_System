public class Person {
    // attributes
    private String firstName;
    private String lastName;

    // constructors
    Person(){
        firstName = "No first name";
        lastName = "No last name";
    }
    Person(String f, String l){
        firstName = f;
        lastName = l;
    }

    // set
    public void setName(String f, String l){
        firstName = f;
        lastName = l;
    }
    // get
    public String getName(){
        return (firstName + " " + lastName);
    }
    // get first name and get last name
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}
