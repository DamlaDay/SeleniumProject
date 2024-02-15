package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


    public class ConfigReader {

        public static String read(String key) throws IOException {
            FileInputStream fis=new FileInputStream(Constants.CONFIG_FILE_PATH);
            Properties properties=new Properties();
            properties.load(fis);
            return properties.getProperty(key);
        }

        public static String read(String key,String path) throws IOException {
            FileInputStream fis=new FileInputStream(path);
            Properties properties=new Properties();
            properties.load(fis);
            return properties.getProperty(key);
        }



       /* //###FROM JAVA CLASS READ METHODS EXAMPLE###
            public static String read(String key) throws IOException {
        return read(key,Constants.CONFIG_FILE_PATH);
    }
*/



    }



