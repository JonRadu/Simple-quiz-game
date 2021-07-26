//
//import java.io.BufferedReader;
//import java.io.FileReader;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author RADU-IOANCIOBANU
// */
//public class Intrebari {
//    public String[] splitter;
//    public String intrebare;
//    public String rasp1;
//    public String rasp2;
//    public String rasp3;
//    public String rasp4;
//    Intrebare1 text = new Intrebare1();
//    public void SetIntrebari(){
//        String numeFisier = "C:\\Temp\\intrebari_raspunsuri.txt";
//    int counter = 0;
//    String linie = null;
//    FileReader fileReader = null;
//
//    try {
//        fileReader = new FileReader(numeFisier);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        
//        while((linie = bufferedReader.readLine()) != null) {
//            counter++;
//            if(counter == 1)
//            {
//                splitter = linie.split(";");
//                intrebare = splitter[0];
//                rasp1 = splitter[1];
//                rasp2 = splitter[2];
//                rasp3 = splitter[3];
//                rasp4 = splitter[4];
//                
//            }
//        }   
//
//    }
//    catch (Exception e){
//     System.err.println("Error: " + e.getMessage());
//    }
//    }
//public static void main(String[] args) {
//}
//}
