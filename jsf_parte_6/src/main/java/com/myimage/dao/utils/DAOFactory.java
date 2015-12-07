package com.myimage.dao.utils;

import com.myimage.dao.ProfileDao;
import com.myimage.dao.ProfileDaoImpl;
 
public class DAOFactory {
 
    public static ProfileDao createProfile(){
        ProfileDaoImpl profileDaoImpl = new ProfileDaoImpl();
        profileDaoImpl.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
        return profileDaoImpl;
    }
}