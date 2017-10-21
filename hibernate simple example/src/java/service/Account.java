/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import org.hibernate.Transaction;
import org.hibernate.Session;
import model.Empid;
//import Util.NewHibernateUtil;
import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion.User;
import static org.apache.log4j.BasicConfigurator.configure;
import org.hibernate.Query;
import util.sess;
import org.hibernate.Session;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.*;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;
/**
 *
 * @author niraniral
 */
public class Account {

    public String addAccount(Empid em) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    
    String message=null;
        Session s=null;
        try
        {
           
            //Session s=(Session) new Configuration();
            //configure().
            //s=(Session) new Configuration();
            //configure().buildSessionFactory().openSession();
            
           Configuration cfg = new Configuration();
           cfg.configure("hibernate.cfg.xml");
           //Sessionfactory Factory= cfg.buildSessionFactory();
           s=sess.getSessionFactory().openSession();
           
            Transaction tr=s.getTransaction();
           tr.begin();
          s.save(em);
          tr.commit();
                message="Saved Data";  
           return message; 
        }
        catch (Exception e)
        {
            return (e.getMessage());
        }
        finally 
                {
                    s.close();
                }
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
