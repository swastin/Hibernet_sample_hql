package com.letsblog.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.letsdevlope.models.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Author author=new Author();
        Blog blog=new Blog();
        Skills skill=new Skills();
        Tags tag=new Tags();
        User user=new User();
        Configuration cfg = new Configuration().configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        author.getBlogs().add(blog);
        session.save(author);
        session.save(blog);
        session.save(tag);
        session.save(user);
        session.save(skill);
        tx.commit();
        session.close();
    }
}
