package TestTaskBlackList;

public class Person {
    // We can add here any fields(any parameters).
    private String name;
    private String phoneNumber;

    public Person(String phoneNumber, String name) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }    

}
