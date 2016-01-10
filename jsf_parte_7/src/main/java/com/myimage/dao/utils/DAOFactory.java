package com.myimage.dao.utils;

import com.myimage.dao.ProfileDao;
import com.myimage.dao.ProfileDaoImpl;
import com.myimage.dao.UserDao;
import com.myimage.dao.UserImpl;
 
public class DAOFactory {
 
    public static ProfileDao createProfile(){
        ProfileDaoImpl profileDaoImpl = new ProfileDaoImpl();
        profileDaoImpl.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
        return profileDaoImpl;
    }
    
    public static UserDao createUser(){
        UserImpl userImpl = new UserImpl();
        userImpl.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
        return userImpl;
    }
}