import java.util.ArrayList;

public class Aufgabe{                        //Datentyp zur besseren Verwaltung der Übungen

 private  String exc_Name;
 private  String exc_Beschreibung;
 private  ArrayList<String> exc_Klasse = new ArrayList<String>();
 private  ArrayList<String> exc_Test = new ArrayList<String>();

 public Aufgabe(String name,String beschreibung){
 exc_Name=name;
 exc_Beschreibung=beschreibung;
 }

 public String getName(){
 return exc_Name;
 }

 public String getBeschreibung(){
 return exc_Beschreibung;
 }

 public ArrayList getKlasse(){
 return exc_Klasse;
 }

 public ArrayList getTest(){
 return exc_Test;
 }

 public void generateKlasse(String line_geruest){
 exc_Klasse.add(line_geruest);
 }

 public void generateTest(String line_geruest){
 exc_Test.add(line_geruest);
 }


}
