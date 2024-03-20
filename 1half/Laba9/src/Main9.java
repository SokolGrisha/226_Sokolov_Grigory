import java.io.*;
import java.util.ArrayList;

public class Main9 {
    public static void main(String[] args){
        String glist = "аоуэиыеёяю";
        String slist = "йцкнгшщзхфвпрлджбтмсч";
        ArrayList<String> file = fileRead();
        System.out.println(file.toString());
        ArrayList<Integer> Glas = new ArrayList<>();
        ArrayList<Integer> Sogl = new ArrayList<>();
        for(int i=0;i<file.size();i++){
            Glas.add(0);
            Sogl.add(0);
            System.out.println(file.get(i).length());
            for(int j=0;j<file.get(i).length();j++){
                System.out.println(glist.indexOf(Character.toString((Character.toLowerCase(file.get(i).charAt(j))))));
                System.out.println(Character.toString((Character.toLowerCase(file.get(i).charAt(j)))));
                if(glist.indexOf((Character.toLowerCase(file.get(i).charAt(j))))!=-1){
                    Glas.set(i,Glas.get(i)+1);
                }
                if(slist.indexOf((Character.toLowerCase(file.get(i).charAt(j))))!=-1){
                    Sogl.set(i,Glas.get(i)+1);
                }
            }
        }
        System.out.println(Glas);
        System.out.println(Sogl);
        System.out.println("Summs:");

        int intSum = 0;
        for(int i = 0;i<Glas.size();i++){
            intSum+=Glas.get(i);
        }
        System.out.println(intSum);

        int intSum2 = 0;
        for(int i = 0;i<Sogl.size();i++){
            intSum2+=Sogl.get(i);
        }
        System.out.println(intSum2);

        fileWrite("\n"+intSum+" "+intSum2);
    }
    public static void fileWrite(String wrt){
        try {
            File file = new File("./Laba9/src/Text.txt");
            //for(String fileNames : file.list()) System.out.println(fileNames);

            OutputStreamWriter reader =new OutputStreamWriter(new FileOutputStream(file, true));
            //FileReader reader = new FileReader("./Laba9/src/Text.txt","");


            for(int i=0;i<wrt.length();i++){
                reader.append(wrt.charAt(i));
            }
            reader.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Not Found");
        }
        catch (Exception ex){
            System.out.println("Eror");
        }
    }
    public static ArrayList<String> fileRead(){

        ArrayList<String> List = new ArrayList<>();

        try {
            File file = new File("./Laba9/src");
            for(String fileNames : file.list()) System.out.println(fileNames);

            InputStreamReader reader =new InputStreamReader(new FileInputStream("./Laba9/src/Text.txt"),  "Cp1251");
            //FileReader reader = new FileReader("./Laba9/src/Text.txt","");

            System.out.println(reader.getEncoding());
            int sym;
            List.add("");
            int i = 0;
            while ((sym=reader.read())!=-1){
                if(sym==10||sym==13){
                    i=i+1;
                    List.add("");
                }
                else {
                    List.set(i,List.get(i)+(char)sym);
                }
            }
            reader.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Not Found");
        }
        catch (Exception ex){
            System.out.println("Eror");
        }
        System.out.println(List.size());
        return List;
    }
}
