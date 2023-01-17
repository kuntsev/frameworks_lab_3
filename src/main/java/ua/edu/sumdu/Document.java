/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ua.edu.sumdu;

import java.util.LinkedList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;



/**
 *
 * @author kuntsev
 */
//@Component
public class Document {
    private int id;
    private static int nextid=0;
    List<Subject> scores;
    
    public Document(){
        
    }
    
    public Document(String sub1, String sub2, String sub3){
        this.id=nextid++;
        this.scores =new LinkedList<> ();
        
        ApplicationContext factory= new ClassPathXmlApplicationContext("/SpringXMLConfig.xml");
        Subject subj1= (Subject) factory.getBean("Subject");

        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource ("C:\Users\kuntsev\Documents\NetBeansProjects\mavenproject1\src\main\resources\SpringXMLConfig.xml"));
    /*
         ApplicationContext context= new ClassPathXmlApplicationContext("SpringHelloWorld.xml");
        Spring3HelloWorld myBean= (Spring3HelloWorld) context.getBean("Spring3HelloWorldBean");
        myBean.sayHello();
    }
        */
        
        
        //Subject subj1=(Subject)factory.getBean("Subject");
        subj1.setName(sub1);
        subj1.setScore((int)(Math.random()*(100-60)));
        scores.add(subj1);
        Subject subj2=(Subject)factory.getBean("Subject");
        subj2.setName(sub2);
        subj2.setScore((int)(Math.random()*(100-60)));
        scores.add(subj2);
        Subject subj3=(Subject)factory.getBean("Subject");
        subj3.setName(sub3);
        subj3.setScore((int)(Math.random()*(100-60)));
        scores.add(subj3);
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id) {
        this.id=id;
    }
    @Override
    public String toString(){
        String out="";
        for (Subject sub:scores){
            out+=sub.isPass()+" "+sub.getName()+":"+sub.getScore()+";";
        }
        return out;
    }
}
