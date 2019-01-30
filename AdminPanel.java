package TestTaskBlackList;
import java.util.Scanner;
import java.util.ArrayList;

public class AdminPanel {
    /*
    Via this panel we can create add or remove information to BlackList
    about out users. Or we can change information about them.
    */
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Person> blackList ; //for people 
    
    public AdminPanel(){
        blackList = new ArrayList<>();        
    }
    
    public void logic(){
        while (true){
        System.out.println("What do you want to do with BlackList? "
                + "\nPress 1 if you want to add person. "
                + "\nPress 2 if you want to change persone's phons," //now we can change only PnoneNumber
                + "\nPress 3 if you want to add remove person."
                + "\nPress 4 if you want to add remove person.");
        int youPressButton = scanner.nextInt();
        if (youPressButton == 1) addPersonToBlacList();
        if (youPressButton == 2) changePhoneNumber() ;
        if (youPressButton == 3) remuvePersonFromBlacList() ;
        if (youPressButton == 4) return;
        }
    }
    
    public void addPersonToBlacList(){
        System.out.println("Please, write Name and PhoneNumber of this person");
        String writeName;
        String writePhoneNumber;
        
        while (true) {
            System.out.println("Write Name");
            writeName = scanner.next();
            break;
        }

        while (true) {
            System.out.println("Write PhoneNumber");
            writePhoneNumber = scanner.next();
            break;
        }
            Person person = new Person (writePhoneNumber, writeName);
            blackList.add(person);
            System.out.println("Congretulate! You sacsesful added person to BlackList!");   
            info();
    }
    
    
    public void changePhoneNumber(){
        System.out.println("Please, write Name and PhoneNumber of person, whose "
                + "information you want to change!");
        String writeName;
        String writePhoneNumber;
        String writeNewPhoneNumber;
        
        while (true) {
            System.out.println("Write Name");
            writeName = scanner.next();
            break;
        }

        while (true) {
            System.out.println("Write currentPhoneNumber");
            writePhoneNumber = scanner.next();
            break;
        }
        
        while (true) {
            System.out.println("Write writeNewPhoneNumber");
            writeNewPhoneNumber = scanner.next();
            break;
        }
        
        Person temporarPerson;
        for (int i = 0 ; i <blackList.size(); i++ ){
            temporarPerson = blackList.get(i);
            System.out.println("temporarPerson.getName() = " + temporarPerson.getName());
            System.out.println("temporarPerson.getPhoneNumber() = " + temporarPerson.getPhoneNumber());
            if (temporarPerson != null && temporarPerson.getName().equals(writeName) && temporarPerson.getPhoneNumber().equals(writePhoneNumber)){
                temporarPerson.setPhoneNumber(writeNewPhoneNumber);
                System.out.println("You sacsesfuli change number for person!");
                break;
            }
            else System.out.println("Information about your person was not found. Try one more time!");

        }
    }
      
    
    public void remuvePersonFromBlacList(){
        System.out.println("Please, write Name and PhoneNumber of person, whose "
                + "information you want to remuve!");
        String writeName;
        String writePhoneNumber;
        
        while (true) {
            System.out.println("Write Name");
            writeName = scanner.next();
            break;
        }

        while (true) {
            System.out.println("Write PhoneNumber");
            writePhoneNumber = scanner.next();
            break;
        }
        
        Person temporarPerson;
        for (int i = 0 ; i <blackList.size(); i++ ){
            temporarPerson = blackList.get(i);
            if (temporarPerson != null && temporarPerson.getName().equals(writeName) && temporarPerson.getPhoneNumber().equals(writePhoneNumber)){
                blackList.remove(i);
                System.out.println("You sacsesfuli delated information about person!");
                break;
            } 
            else System.out.println("Information about your person was not found. Try one more time!");
        }            
    }
   
    
    public void info(){
    Person temporarPerson;
        for (int i = 0 ; i <blackList.size(); i++ ){
            temporarPerson = blackList.get(i);
            System.out.println("-------------");
            System.out.println("i = " + i);
            System.out.println("temporarPerson.getName() = " + temporarPerson.getName());
            System.out.println("temporarPerson.getPhoneNumber() = " + temporarPerson.getPhoneNumber());
                        System.out.println("-------------");
            }     
    }
}
