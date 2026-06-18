package Utilities;

import java.io.*;
import java.util.Properties;

public class ConfigFileReader {

private Properties properties;
private final String propertyFilePath="src//test//resources//Configurations//config.properties";

public ConfigFileReader(){
    BufferedReader reader;
    try{
        reader=new BufferedReader(new FileReader(propertyFilePath));
        properties = new Properties();
        try{
            properties.load(reader);
            reader.close();
            }catch (IOException e){
            e.printStackTrace();
            }

        }catch (FileNotFoundException exception){
        System.out.println(
                "Configuration.properties not found at: " + propertyFilePath + "\n" + exception.toString());
        throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }
    public String getApplicationUrl() {
        String url = properties.getProperty("url");
        if (url != null)
            return url;
        else
            throw new RuntimeException(
                    "Application Url not specified in the Configuration.properties file for the Key:url");
    }
}
