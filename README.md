## OOP - Jets Application

# Overview

This program simulates an airfield, where a series of aircraft are stored and users are able to see various specifications such as model type, speed in miles per hour (mph), range in miles, price in US Dollars ($USD), and flight time remaining.  The user is able to interact with the program through a menu, allowing various actions built around the aircraft stored within the program at startup, and additional aircraft entered by the user.  

# Technologies Used

-Java
-Scanner
-Conditionals
-Looping
-Data Abstraction
-Data Polymorphism
-Data Inheritance
-Data Encapsulation

# How to Run

Upon starting, the program will load five pre-selected aircraft from a .txt file and populate them into a simulated "airfield."  The user is presented with a menu of nine numbered choices: 1) List Fleet, 2) Fly All Jets, 3) View Fastest Jet, 4) View Jet with the Longest Range, 5) Load All Cargo Jets, 6) Dogfight, 7) Add a Jet to the Fleet, 8) Remove a Jet from the Fleet, and 9) Quit.  Listing the fleet will display all five aircraft loaded into the airport at startup, along with their model, speed, range, and price.  Flying all jets will display the same information, in addition to the flight time of each aircraft in minutes based on the range and speed.  Viewing the fastest jet will display the specifications of the jet with the highest speed.  Viewing the jet with the longest range will display the specifications of the aircraft with the longest range in miles.  Loading all cargo jets will call all cargo aircraft in the program and display a message specific to that role type.  Likewise, choosing the Dogfight option will call all fighter jets in the program and display a message specific to that role type.  Choosing to add a jet to the fleet will prompt the user to enter the model, speed, range, and price of an aircraft they wish to load to the airfield.  Choosing to remove a jet will display all aircraft model types in a numbered menu, where the user can decide which to delete from the program.  Choosing to add or remove an aircraft will be reflected in the List Fleet option, should the user wish to display all jets in the system.  Lastly, choosing quit will exit the program.  

# Lessons Learned

This project presented several challenges for me as a coder of only three weeks.  First, the passage of information between classes proved a significant task, especially when passing-by-value the list of jets and airfield contents.  Second, the overall layout of the program took a decent amount of time to decide.  On this point, it became apparent how important a UML diagram can be to facilitate better organization of planning and executing program design--and will surely be even more apparent with more complex programs.  Finally, I encountered what I think was a glitch while compiling and running my program during the development of the "Add a Jet to the Fleet" and "Remove a Jet from the Fleet" portions of the code.  For reasons still unknown, when I ran the program and chose numbered options from the menu, I was required to press "return" two times--instead of one--for my selection to be executed.  After troubleshooting this for a while to no avail, a simple reboot of Eclipse solved the problem.  
