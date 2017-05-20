package com.letsdevlope.Blog;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.letsdevlope.models.*;
public class App 
{
    public static void main( String[] args )
    {
    /*	@SuppressWarnings("deprecation")
		Date dt=new Date("19/05/1995");
    	Date dt1=new Date();
    	//BigInteger bi=new BigInteger("8908972684") ;
       
        skill.setSkillName("java");
        skill.setSkillCreated(dt1);
        
        Tag tag=new Tag();
        user.setUserName("swastin");
        user.setUserEmail("swastin95.sahoo@gmail.com");
        user.setUserPassword("12345");
        user.setUserGender("male");
        user.setUserDateofbirth(dt);
        user.setUserPhonenumber("8908972684");
        user.setUserRole("user");
        user.setUserCreated(dt1);
        user.getComments().add(cmt);
        user.getSkills().add(skill);*/
    	
    	 User user=new User();
         Blog blog=new Blog();
         Comment cmt=new Comment();
         Skill skill=new Skill();
        Configuration cfg = new Configuration().configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        
        
        session.save(user);
        session.save(blog);
        session.save(cmt);
        session.save(skill);
        tx.commit();
        session.close();
        
    }
}
