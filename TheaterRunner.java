import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {


 // Read data from text files and convert them into arrays
  String [] NameArray = FileReader.toStringArray("Name.txt");
  String [] CountryArray = FileReader.toStringArray("Country.txt");
  int [] HeightArray = FileReader.toIntArray("Height.txt");
  int [] YearOpenedArray = FileReader.toIntArray("Year_Opened.txt");
  int [] FloorsArray = FileReader.toIntArray("Floors.txt");
  String [] colorArray = { "blue", "green", "purple", "orange", "red"};



  // Create a new DataScene object using the read data
  DataScene myDataScene = new DataScene(NameArray,CountryArray,HeightArray, YearOpenedArray, FloorsArray,colorArray);


 // Display the three tallest buildings with random text colors
myDataScene.show3TallestBuildings();

// Display buildings in China with over 100 floors
myDataScene.showBuildingsChina100floors();

// Display the building with the maximum and minimum number of floors
myDataScene.showMaxMinFloorsBuilding();

// Play all scenes using the Theater class
Theater.playScenes(myDataScene);








    
    
  }
}
