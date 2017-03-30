package instance.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author zmz
 */
public class DBUtils4Mysql {

    private static String database;
    private static String username;
    private static String password;

    static{
        try {
            InputStream in = DBUtils4Mysql.class.getClassLoader().getResourceAsStream("DBConfig.properties");
            Properties prop = new Properties();
            prop.load(in);

            database = prop.getProperty("database");
            username = prop.getProperty("username");
            password = prop.getProperty("password");

        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static volatile DBUtils4Mysql instancce;
    private DBUtils4Mysql(){}

    public static DBUtils4Mysql getInstance(){
        if(null==instancce){
            synchronized (DBUtils4Mysql.class){
                if(null==instancce){
                    instancce = new DBUtils4Mysql();
                }
            }
        }
        return instancce;
    }

    public void getConnection(){
        System.out.println("获取数据库连接。。。");
        System.out.println("数据库："+database);
        System.out.println("用户名："+username+" 密码："+password);
    }
}
