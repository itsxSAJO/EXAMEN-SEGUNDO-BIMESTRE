package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfiguration {
    private static Properties slConfig = null;
    //OutputStream configOutput = null;
    public static boolean slLoad(String slPathConfigFile){
        try{
            if (slConfig == null)   
                slConfig = new Properties();
            InputStream slConfigInput = new FileInputStream(slPathConfigFile);
            slConfig.load(slConfigInput);

            System.out.println(">> (ok) AppConfiguration.load()");
            return true;
        }  
        catch (IOException e) {  //FileNotFoundException
            System.out.println(">> (error) AppConfiguration.load() "+ e.getMessage());
        }
        return false;
    }

    //getProperty of 
    public static String getDBName(){
        if (slConfig != null)  
            return slConfig.getProperty(APP.GLOBAL.DB_NAME);  
        else
            System.out.println(">> (issue) AppConfiguration.getDB_NAME(), llamar primero a AppConfiguration.load() y agregar DB_NAME en CONFIG ");
        return "";
    }
    public static String getDBPathConnection(){
        //"jdbc:sqlite:data\\TinderPet.db"
        if (slConfig != null && slConfig.containsKey(APP.GLOBAL.DB_PATH)){
            String dbName  = getDBName();
            String dbPath  = slConfig.getProperty(APP.GLOBAL.DB_PATH); 
            dbPath =  "jdbc:sqlite:" + dbPath.replace('/', '\\') + "\\\\" + dbName;
            return dbPath;  
        }
        else
            System.out.println(">> (issue) AppConfiguration.DB_PATH(), llamar primero a AppConfiguration.load() y agregar DB_PATH en CONFIG ");
        return "";
    }

    // public static void setPropertyValue(String property, String value){
    //     try{
    //         configOutput = new FileOutputStream("data/slConfig.properties");
    //         slConfig.setProperty(property, value);
    //     } catch(Exception e){
    //         JOptionPane.showMessageDialog(null, "Error guardando configuraci�n\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    //     }
    // }
    

}
