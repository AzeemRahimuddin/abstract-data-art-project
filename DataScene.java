import org.code.theater.*;
import java.util.Arrays;


public class DataScene extends Scene {

// Instance variables to store building data
private String [] Name;
private String [] Country;
private int [] Height;
private int [] Year;
private int [] Floors;
private String [] textColor;
 
// Constructor to initialize all the building data arrays
public DataScene (String[] Name, String[] Country, int[] Height, int[] Year, int[] Floors, String[] Color){
this.Name  = Name;
this.Country = Country;
this.Height = Height;
this.Year = Year;
this.Floors = Floors;
this.textColor = Color;
}


/*
* Displays the three tallest buildings with random text colors.
* This method iterates through the list of buildings and for each iteration:
* Chooses a random color from `textColor` array to display the building's name.
* Displays the building's image and name.
*  Plays an elevator ding sound for each building.
*/
public void show3TallestBuildings(){
  
  for (int x = 0; x < 3; x++){

if ( x == 0 ){
    int randomColorIndex = (int)(Math.random() * textColor.length);
    setTextColor(textColor[randomColorIndex]);
    setTextHeight(16);
   
   // Display the title and building images
    drawText("3 Tallest Buildings in the World in a random Text Color",3,20);
    drawImage("Burj-Khalifa.png",65,30,250);
    drawText("Burj Khalifa", 130, 370);
    playSound("119448__lmbubec__elevator-ding.wav");
    pause(5);
    drawImage("blankscreen.png",0,0,900);
}

   else if ( x == 1 ){
    int randomColorIndex = (int)(Math.random() * textColor.length);
    setTextColor(textColor[randomColorIndex]);
    setTextHeight(16);
    drawText("3 Tallest Buildings in the World in a random Text Color",3,20);
    drawImage("Shanghai-Tower.png",65,30,200);
    drawText("Shanghai Tower", 110, 370);
    pause(3);
    drawImage("blankscreen.png",0,0,900);
}
  else {
    int randomColorIndex = (int)(Math.random() * textColor.length);
    setTextColor(textColor[randomColorIndex]);
    setTextHeight(16);
    drawText("3 Tallest Buildings in the World in a random Text Color",3,20);
    drawImage("Clock-Tower.png",65,30,200);
    drawText(" Abraj Al-Bait Clock Tower", 70, 370);
    pause(3);
    drawImage("blankscreen.png",0,0,900);

 }
    
  }

  }

 /*
* Displays buildings located in China with more than 100 floors.
* This method uses an array `Temp` to mark which buildings in the top 10 list
* have more than 100 floors and are located in China. It then displays
* these buildings with their images and names.
 */
public void showBuildingsChina100floors(){

int [] Temp = new int [10];
String message1;
String message2;

// Initialize Temp array with 100 to mark building positions meeting conditions
 for (int i = 0; i<10; i++){
    Temp[i] = 100;  
    }

// Mark buildings in China with more than 100 floors
for (int j = 0; j<10; j++){
    if ((Floors[j]>100) && "China".equals(Country[j])){
    Temp[j] = j;  
    }
}
 
for (int k = 0; k<10; k++){
  if (Temp [k] <100){

  if ( k == 0) message1 = "Burj-Khalifa.png";
  else if ( k == 1) message1 = "Shanghai-Tower.png";
  else if ( k == 2) message1 = "Clock-Tower.png";
  else if ( k == 3) message1 = "Ping-An-Finance-Center.png";
  else if ( k == 4) message1 = "Lotte-Word-Tower.png";
  else if ( k == 5) message1 = "One-world-Trade-Center.png";
  else if ( k == 6) message1 = "Guangzhou-CTF-Finance-Center.png";
  else if ( k == 7) message1 = "Tianjin-CTF-Finance-Center.png";
  else if ( k == 8) message1 = "China-Zun.png";
  else if ( k == 9) message1 = "Taipei-101.png";
  else message1 = "";

  message2 = Name [k];

    setTextColor ("red");
    setTextHeight(16);
    drawText("These are the buildings in China that have over 100 floors",3,20);
    drawImage(message1,65,30,180);
    drawText(message2, 120, 390);
    playSound("710557__kevp888__cd_vie_008fx_gong_2.wav");
    pause(5);
    drawImage("blankscreen.png",0,0,900);
}
  
}  
}


/*
* Displays the building with the maximum and minimum number of floors from the top 10 list.
* This method calculates the maximum and minimum floors and their corresponding buildings.
* It then displays the images and names of these buildings with appropriate text.
*/
public void showMaxMinFloorsBuilding(){
int maximum = 0;
int Temp1 = 0;
int minimum = 200;
String message1;
String message2;  


// maximum floors calculation
for ( int z = 0; z<10; z++){
  int maxFloor = Math.max(Floors[z],maximum);
  if ( Floors[z] > maximum){
    maximum = maxFloor;
    Temp1 = z;
  } 
}

  if ( Temp1 == 0) message1 = "Burj-Khalifa.png";
  else if ( Temp1 == 1) message1 = "Shanghai-Tower.png";
  else if ( Temp1 == 2) message1 = "Clock-Tower.png";
  else if ( Temp1 == 3) message1 = "Ping-An-Finance-Center.png";
  else if ( Temp1 == 4) message1 = "Lotte-Word-Tower.png";
  else if ( Temp1 == 5) message1 = "One-world-Trade-Center.png";
  else if ( Temp1 == 6) message1 = "Guangzhou-CTF-Finance-Center.png";
  else if ( Temp1 == 7) message1 = "Tianjin-CTF-Finance-Center.png";
  else if ( Temp1 == 8) message1 = "China-Zun.png";
  else if ( Temp1 == 9) message1 = "Taipei-101.png";
  else message1 = "";
 
   message2 = Name [Temp1];
 
    setTextColor ("purple");
    setTextHeight(18);
    drawText("This is the building with the maximum number",12,20);
    drawText(" of floors from the top 10 list",80,45);
    drawText("The maximum floors: " + maximum,3,80);
    drawImage(message1,65,90,220);
    drawText(message2, 120, 390);
    pause(6);
    drawImage("blankscreen.png",0,0,900);



  // minimum floors calculation
for ( int z = 0; z<10; z++){
  int minFloor = Math.min(Floors[z],minimum);
  if ( Floors[z] < minimum){
    minimum = minFloor;
    Temp1 = z;
  } 
} 

   if ( Temp1 == 0) message1 = "Burj-Khalifa.png";
  else if ( Temp1 == 1) message1 = "Shanghai-Tower.png";
  else if ( Temp1 == 2) message1 = "Clock-Tower.png";
  else if ( Temp1 == 3) message1 = "Ping-An-Finance-Center.png";
  else if ( Temp1 == 4) message1 = "Lotte-Word-Tower.png";
  else if ( Temp1 == 5) message1 = "One-world-Trade-Center.png";
  else if ( Temp1 == 6) message1 = "Guangzhou-CTF-Finance-Center.png";
  else if ( Temp1 == 7) message1 = "Tianjin-CTF-Finance-Center.png";
  else if ( Temp1 == 8) message1 = "China-Zun.png";
  else if ( Temp1 == 9) message1 = "Taipei-101.png";
  else message1 = "";
 
   message2 = Name [Temp1];
 
    setTextColor ("green");
    setTextHeight(18);
    drawText("This is the building with the minimum number",12,20);
    drawText(" of floors from the top 10 list",80,45);
    drawText("The minimum floors: " + minimum,3,80);
    drawImage(message1,65,90,220);
    drawText(message2, 60, 390);

}

  
  
} // end of entire data scene
