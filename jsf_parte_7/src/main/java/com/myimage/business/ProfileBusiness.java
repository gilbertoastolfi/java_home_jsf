package com.myimage.business;

import com.myimage.dao.ProfileDao;
import com.myimage.dao.utils.DAOFactory;
import com.myimage.model.Profile;
 
public class ProfileBusiness {
 
    private ProfileDao profileDao;
     
     
    public ProfileBusiness() {
        super();
        setProfileDao(DAOFactory.createProfile());
    }    
     
    private void setProfileDao(ProfileDao profileDao) {
        this.profileDao = profileDao;
    }
 
    public void save(Profile Profile){
        profileDao.save(Profile);
    }    
}