
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.*;
import ua.edu.sumdu.EmailException;
import ua.edu.sumdu.Student;
import ua.edu.sumdu.Utils;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kuntsev
 */
public class StatsCalculatorTest {
  
    static List <Student> studs;

@BeforeAll
public static void setupData() {
    studs=new LinkedList<Student>();
    studs.add(new Student ("Test1","Test1", "18", "test1@test.com","test","test"));
    studs.add(new Student ("Test2","Test2", "19", "test2@test.com","test","test"));
    studs.add(new Student ("Test3","Test3", "28", "test2@test.com","test","test"));
}
@Test
public void getEmailDomainTest () {
String result=Utils.getEmailDomain( "test@gmail.com");
    Assertions.assertEquals(result, "gmail.com");
}


/*@Test
public void whenExceptionThrown_thenExpectationSatisfied() throws EmailException {
    studs.add(new Student("Exception", "Exception", "-1", "email", "test",  "test"));
        Assertions.assertThrows(EmailException.class, () -> {
            Utils.calculatePopularDomain((LinkedList<Student>) studs);
            });
        
studs.remove(3);
}*/


@Test
public void patternMatchesTest() {
String emailAddress = "username@domain.com";
    Assertions.assertTrue(Utils.patternMatches(emailAddress));  
}


@Test
public void calculatePopularDomainTest() throws EmailException{
String result=Utils.calculatePopularDomain((LinkedList<Student>) studs);
    Assertions.assertEquals("test.ua", result);
}


@Test
public void calculateMeanAgeTest () {
double result=Utils.calculateMeanAge((LinkedList<Student>) studs);
    Assertions.assertEquals(21, result);
} 
}
