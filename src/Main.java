import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date kek = new Date();
        GitTestClass gitTest = new GitTestClass(kek);
        System.out.println("Ура, заработало!");
        gitTest.getBirthDate();
    }
}
