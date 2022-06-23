package utils;

import java.beans.Encoder;
import java.beans.Expression;
import java.beans.PersistenceDelegate;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.time.LocalDate;

public class Ser {

	public static void save(String fileName, Object object) {
		try {
			saveXML(fileName, object);
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("error");
		}
		
	}
	
	public static Object load(String path) {
		Object serial = null;
		try {
			serial = loadXML(path);
		} catch (ClassNotFoundException e) {
			System.out.println("Class not compatible");
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("File not found");
			//e.printStackTrace();
		}
		return serial;
	}
	
	public static void saveXML(String fileName, Object object) throws IOException {
		fileName += ".xml";
		FileOutputStream fileOut = new FileOutputStream(fileName);
		XMLEncoder out = new XMLEncoder(fileOut);
		out.setPersistenceDelegate(LocalDate.class,
                new PersistenceDelegate() {
                    @Override
                    protected Expression instantiate(Object localDate, Encoder encdr) {
                        return new Expression(localDate,
                                LocalDate.class,
                                "parse",
                                new Object[]{localDate.toString()});
                    }
                });
		out.writeObject(object);
		out.close();
		fileOut.close();
	}
	
	public static Object loadXML(String path) throws IOException, ClassNotFoundException {
		Object serial = null;
		FileInputStream fileIn = new FileInputStream(path);
		XMLDecoder in = new XMLDecoder(fileIn);
		
		serial = (Object) in.readObject();
		in.close();
		fileIn.close();
		return serial;
	}
	
}
