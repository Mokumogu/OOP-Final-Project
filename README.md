**I.PROJECT OVERVIEW**


  The Motorcycle Rental Management System is a Java-based console application designed to streamline the process of renting motorcycles. It features a user-friendly interface that allows users to log in, register, rent motorcycles, and return them with ease. The system includes a user authentication module where new users can register, and existing users can securely log in. Motorcycle inventory is managed dynamically, tracking the availability of various motorcycle types such as Honda, Yamaha, and Suzuki. Users can rent motorcycles by specifying the type and rental duration, with the system validating inputs to ensure smooth operation. Upon return, the inventory is updated automatically. The application starts with a user agreement, ensuring customers understand the terms and conditions. Rentals and returns are tracked using in-memory data structures like HashMap, which store user details, active rentals, and inventory data. To improve usability, the system provides error handling for invalid inputs, duplicate usernames, and attempts to return non-rented motorcycles. Future enhancements include implementing password hashing for better security, adding data persistence through databases or file storage, and expanding features such as fine calculations, rental costing, and rental history tracking. With its simple and efficient design, the system is ideal for small to medium-scale motorcycle rental businesses looking for a lightweight and functional solution.



**II. APPLICATION OF OBJECT-ORIENTED-PROGRAMMING**

The application of Object-Oriented Programming (OOP) lies in its ability to model complex systems using concepts like objects, classes, inheritance, polymorphism, encapsulation, and abstraction. OOP is widely used in software development to create modular, reusable, and maintainable code. By organizing data and behavior into objects, OOP allows developers to represent real-world entities and their interactions, making it easier to understand and manage large codebases. For example, in a banking application, objects like "Account," "Customer," and "Transaction" can encapsulate specific attributes and behaviors, streamlining development and reducing redundancy. OOP is applied in a variety of domains, including game development, mobile and web applications, simulations, and enterprise software. Its modular design enables developers to reuse existing code through inheritance, customize behavior through polymorphism, and protect sensitive data using encapsulation. Additionally, OOP facilitates collaboration in large development teams, as objects and classes can be easily shared and extended without affecting the entire system. This makes OOP a cornerstone of modern programming practices for developing scalable, efficient, and robust applications.


**III. ALIGNMENT WITH THE SUSTAINABLE DEVELOPMENT GOAL**

The motorcycle rental service project aligns with the United Nations Sustainable Development Goals (SDGs) by promoting responsible consumption, sustainable urban mobility, and environmental sustainability. Specifically, it contributes to SDG 11: Sustainable Cities and Communities by providing an affordable and accessible transportation solution that reduces the need for personal vehicle ownership, helping to alleviate traffic congestion and lower carbon emissions. By encouraging shared mobility, the project also supports SDG 12: Responsible Consumption and Production, fostering more efficient use of resources, including fuel and road infrastructure.

Additionally, the emphasis on user responsibility, such as adherence to traffic regulations and timely returns, cultivates community awareness and promotes safety. If the rental service is integrated with electric or fuel-efficient motorcycles in the future, it could further align with SDG 13: Climate Action by reducing greenhouse gas emissions and supporting the transition to cleaner energy solutions. Overall, the project embodies the principles of sustainable innovation, balancing economic opportunity with environmental stewardship and social responsibility.


**IV. INTRODUCTION TO RUNNING THE PROGRAM**

To run the motorcycle rental service program, follow these steps:

Set Up Your Development Environment:
Ensure you have Java Development Kit (JDK) installed on your system. Use an Integrated Development Environment (IDE) like IntelliJ IDEA, Eclipse, or any text editor with Java support to compile and run the program.

Compile the Program:
Save the provided code into a file named Main.java. Open your terminal or IDE, navigate to the directory containing the file, and compile the program by running the command:

bash
Copy code
javac Main.java
Run the Program:
After compilation, execute the program by running:

bash
Copy code
java Main
User Agreement:
The program starts by displaying a User Agreement that outlines the terms of service. Make sure to read this section carefully before proceeding.

Login or Register:
The program requires you to log in or register. If you're a returning user, enter your credentials to log in. If you're new, register by creating a unique username and password.

Program Navigation:
After logging in, the main menu provides three options:

Rent a Motorcycle: View available motorcycles, select the type, and specify the rental duration in hours.
Return a Motorcycle: If you have an active rental, return the motorcycle, which updates the system inventory.
Exit: Close the program.
Interactivity:
The program accepts user inputs to perform actions. Follow the on-screen prompts to navigate through the functionalities. Input validation ensures proper handling of any invalid entries.

By following these steps, you can easily use the motorcycle rental system to rent and return motorcycles while managing your account seamlessly.











