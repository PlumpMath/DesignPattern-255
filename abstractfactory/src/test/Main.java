package test;

import instance.Dao.RoleDao;
import instance.Dao.UserDao;
import instance.bean.Role;
import instance.bean.User;
import instance.factory.daoFactory;
import instance.utils.DBUtils4Mysql;
import instance.utils.ServiceLoadDao;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        DBUtils4Mysql.getInstance().getConnection();

        UserDao udao = daoFactory.getInstance().createDao(ServiceLoadDao.getUserDao(), UserDao.class );
        RoleDao rdao = daoFactory.getInstance().createDao(ServiceLoadDao.getRoleDao(), RoleDao.class );

        udao.add(new User());
        rdao.select(new Role());
    }
}
