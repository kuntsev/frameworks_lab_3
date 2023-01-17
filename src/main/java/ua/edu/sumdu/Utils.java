
package ua.edu.sumdu;
import java.util.*;
import java.util.regex.Pattern;  
/**
 *
 * @author kuntsev
 */
public class Utils {
    
    public static String calculatePopularDomain(LinkedList<Student> studs) throws EmailException{
        Map<String,Integer> mails=new HashMap<String,Integer>();
        String tempDomain="";
        String popularDomain="";
        int count=0;
        for (Student st:studs) {
            if (Utils.patternMatches (st.getEmail())) {
                tempDomain = Utils.getEmailDomain(st.getEmail());
                if (mails.containsKey (tempDomain)) {
                    count = mails.get(tempDomain) +1;
                }
                else {
                    count=1;
                }
                mails.put(tempDomain, count);
            }            
            else {
                throw new EmailException();
            }
        }
        
        Set<String> keys= mails.keySet ();
        int max=0;
        for (String current:keys) {
            if (max < mails.get(current)) {
            max = mails.get (current);
            popularDomain = current;
            }
        }
    return popularDomain;
    }
    
    
    public static double calculateMeanAge(LinkedList<Student> studs) {
        double tempAge=0;
        int count=0;
        for(Student st: studs){
            int age=Integer.parseInt(st.getAge());
            if (age>0) {
                tempAge+=age;
                count++;
            }
        }
        if(count==0) {return -1;}
        return tempAge/count;
}
    
    public static double calculateMaxAge(LinkedList<Student> studs) {
        List<Integer> age = new ArrayList<Integer>();
        for(Student st: studs){
            age.add(Integer.parseInt(st.getAge()));
            }
        return Collections.max(age);
    }
    
        public static double calculateMinAge(LinkedList<Student> studs) {
        List<Integer> age = new ArrayList<Integer>();
        for(Student st: studs){
            age.add(Integer.parseInt(st.getAge()));
            }
        return Collections.min(age);
    }
    
    
    public static boolean patternMatches (String emailAddress) {
        String regexPattern="^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$";
    return Pattern.compile(regexPattern).matcher(emailAddress).matches();
    }
    
     public static boolean sumduPatternMatches (String emailAddress) {
        String regexPattern="^[a-zA-Z0-9_.+-]+@sumdu.edu.ua";
    return Pattern.compile(regexPattern).matcher(emailAddress).matches();
    }
       
    
    public static String getEmailDomain(String someEmail) {
    return someEmail.substring(someEmail.indexOf("@") + 1);
    }
    public static double calculateSumduDomain(LinkedList<Student> studs) throws EmailException{
    int count=0;
    
        for (Student st:studs) {
            if (
                    Utils.getEmailDomain(st.getEmail()).equals("sumdu.edu.ua")
                    ) {
            count++;
            System.out.println(Utils.getEmailDomain(st.getEmail()));
            System.out.println(count);
            }
        }
    return count;
    }
}
    

