package lab6.test;

import lab6.model.Wood;
import lab6.store.WoodDirectory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestStoreObject {
    public static void main(){
        WoodDirectory wd = new WoodDirectory();
        wd.add(new Wood(4,"Дуб",1f));
          File f = new File("wd.testObject");
        try{
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(wd);
            oos.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
}
