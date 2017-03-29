package instance.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
            FileInputStream in = new FileInputStream("DBConfig.properties");
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

    public static void getConnection(){
        System.out.println("获取数据库连接。。。");
        System.out.println("数据库："+database);
        System.out.println("用户名："+username+" 密码："+password);
    }
}
