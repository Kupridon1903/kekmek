import java.util.Calendar;
import java.util.Date;

public class GitTestClass {

    private String fName;
    private String lName;
    private Date birthDate;

    GitTestClass(){

    }

    GitTestClass(Date birthDate){
        this.birthDate = birthDate;
    }

    public void setBirthDate (Date birthDate){
        this.birthDate = birthDate;
    }

    public void getBirthDate (){
        System.out.println(birthDate);
    }
}
