package instance.utils;

import instance.Dao.UserDao;
import instance.bean.User;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author zmz
 */
public class ServiceLoadDao {
    private static final String UserDao;
    private static final String RoleDao;
    private static final boolean flag;

    static{
        Properties prop = new Properties();
        try {
            InputStream in = ServiceLoadDao.class.getClassLoader().getResourceAsStream("ServiceLoadDao.properties");
            prop.load(in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(prop.isEmpty()){
            flag = false;
            UserDao = ""; //default UserDao
            RoleDao = ""; //default RoleDao
        }else {
            flag = true;
            UserDao = prop.getProperty("userdao");
            RoleDao = prop.getProperty("roledao");
        }
    }

    public static String getUserDao(){
        if(!flag) throw new RuntimeException();
        return UserDao;
    }

    public static String getRoleDao(){
        if(!flag) throw new RuntimeException();
        return RoleDao;
    }

}
