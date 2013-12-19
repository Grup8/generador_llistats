package partXicu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public  class InterficieTONTA {

    public static void main(String[] args) {

        InterficieTONTA obj = new InterficieTONTA();
        String csvFile1 = "fitxer_dades.csv";
        obj.entregaLlista(csvFile1);

    }

    public static ArrayList<Alumne> entregaLlista(String f1) {

        String csvFile = f1;
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",\"";
        ArrayList<Alumne> llistatA = new ArrayList<Alumne>();

        try {

            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {

                String[] country = line.split(cvsSplitBy);
                if (!country[0].contains("#")) {
                    //System.out.println(Arrays.toString(country));

                    if (country.length >= 4) {

                        country[1] = country[1].replace("\"", "");
                        country[2] = country[2].replace("\"", "");
                        country[3] = country[3].replace("\"", "");

                        Alumne a1 = new Alumne(country[0], tallarNom(country[1])[1], tallarNom(country[1])[0], country[2], tallarMateries(country[3]));
                        llistatA.add(a1);
                    }
                }
            }
            //System.out.println(llistatA.toString());
                   
           
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Done");
        return llistatA;
    }

    public static String[] tallarNom(String cadenaNomCog) throws Exception {
        String[] splits = cadenaNomCog.split(",");
        return (splits);
    }

    public static ArrayList<String> tallarMateries(String cadenaMateries)
            throws Exception {

        ArrayList<String> arrayL2 = new ArrayList<String>();
        String[] splits = cadenaMateries.split(",");
        int a = 0;
        for (int i = 0; i < (splits.length); i++) {
            arrayL2.add(splits[a]);
            a++;
        }
        // arrayL2.add(splits[0]);
        // arrayL2.add(splits[1]);
        return (arrayL2);

    }
}
