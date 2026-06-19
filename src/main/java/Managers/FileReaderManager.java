package Managers;

import Utilities.ConfigFileReader;

public class FileReaderManager {

    public static FileReaderManager fileReaderManager=new FileReaderManager();
    public static ConfigFileReader configFileReader;

    private FileReaderManager(){

    }

    public static FileReaderManager getInstance(){
        return fileReaderManager;
    }

    public ConfigFileReader getConfigFileReader(){
        return(configFileReader==null?new ConfigFileReader():configFileReader);
    }
}
