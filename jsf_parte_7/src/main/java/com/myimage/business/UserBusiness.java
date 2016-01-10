package com.myimage.business;
 
import com.myimage.dao.UserDao;
import com.myimage.dao.utils.DAOFactory;
 
public class UserBusiness {
 
    private UserDao userDao;      
     
    public UserBusiness() {
        super();
        setUserDao(DAOFactory.createUser());
    }
     
    public boolean existsValidation(String validation) {
        return userDao.existsValidation(validation);
    }
 
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }     
}