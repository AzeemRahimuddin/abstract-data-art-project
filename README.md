# Unit 4 - Abstract Art Project

## Introduction

Data visualizations are powerful tools to present information and convey patterns and relationships. Sometimes visualizations are charts or graphs, and other times they are more abstract pieces of art. Your goal is to create a visual representation relating at least two categories from your dataset that engages your viewer and encourages them to learn more about your chosen topic.

## Requirements

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data visualization program:

- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that will make up your visualization.
- **Implement one or more algorithms** – Implement one or more algorithms that use two-way or multi-selection statements with compound Boolean expressions to analyze the data.
- **Use methods in the Math class** – Use one or more methods in the Math class in your program, such as to perform calculations on the values in your dataset and display the results, choose random values from the dataset, or display images or shapes at random locations.
- **Create a visualization** – Create an image or animation that conveys the story of the data by illustrating the patterns or relationships in the data.
  Note: This may be abstract! Others do not necessarily need to know what the story or pattern is right away, but you do need to be able to explain it to them.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## Dataset



Dataset: https://docs.google.com/spreadsheets/d/1yj789eJ7RUO9KOecByva2xUrxjGLLewU7g4Ah_MUmGk/edit?usp=sharing

- Name (String) - Name of the building.
- City (String) - The city that the building is located in.
- Country (String) - The country that the building is located.
- Height (int) - The height of the building in feet.
- Floors (int) - The number of floors the building has.
- Year Opened (int) - The year the building was opened.

## UML Diagram


![Unit 4 -  UML Diagram](https://github.com/user-attachments/assets/356b485a-94d3-4c6c-bae6-790a9654e327)


## Video Demo


https://github.com/user-attachments/assets/74c1a8cc-f2ec-49ce-a0c2-ec406dfafd4d


## Description

This project is a data visualization project that I created to show people information about the worlds tallest buildings. The user story is about showing information aboiut the words tallest buildingss to better understand their height, location and amount of floors they have. I used many one-dimensional arrays to store details about the buildings such as their name, countries, heights, years of opening and floor counts. These arrays are filled with data from the text files using the FileReader method. This method is important because it can store and organize the data. I also included many algorithms that analyze the data and find the 3 tallest buildings, filtering buildings in China with more than 100 floors and identifying buildings with the maximum and minimum number of floors. These algorithms contained selection statements and methods like Math.max() and Math.min() for comparison.
