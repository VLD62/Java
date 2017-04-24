package com.XML.replacer;
import java.io.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
            File inputXML = new File("template.xml");
            BufferedReader br = null;
            String newString = "";
            StringBuilder strNew = new StringBuilder();
            try {

                FileReader reader = new FileReader(inputXML);
                String search = "koza";
                String search2 = "benzin";


                br = new BufferedReader(reader);
                while ((newString = br.readLine()) != null){
                    newString = newString.replaceAll(search, "kon");
                    newString = newString.replaceAll(search2, "bira");
                    strNew.append(newString);
                }

            } catch ( IOException  e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } // calls it
            finally
            {
                try {
                    br.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }


            System.out.println(strNew.toString());
            File file = new File("file.txt");
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(strNew.toString());
            } catch (IOException e) {
            }

        }

}
