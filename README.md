# 🚗 Vehicle Rental Management System

A Java-based desktop application developed to simplify and manage vehicle rental operations efficiently. The system allows administrators to manage vehicles, customers, bookings, and rental transactions through a user-friendly interface while ensuring accurate data management using a MySQL database.

## 📌 Key Features
 
- 🔐 **User Login Authentication** — Secure access to the system
- 🚘 **Vehicle Management** — Add, update, delete, and search vehicle records
- 👤 **Customer Management** — Maintain and manage customer records
- 📋 **Vehicle Booking & Rental Management** — Handle rental bookings efficiently
- 🔄 **Rental Return Management** — Process and track vehicle returns
- 💰 **Payment Management** — Manage rental payments and transactions
- 🔍 **Search and Filter Functionality** — Quickly locate vehicles, customers, and records
- 🗃️ **CRUD Operations** — Full Create, Read, Update, and Delete support across modules
- 🗄️ **Database Integration** — Persistent and reliable data storage
- 🖥️ **User-Friendly Desktop Interface** — Clean and simple Java Swing GUI

## 🛠️ Technologies Used

- Java
- Java Swing
- JDBC
- MySQL
- NetBeans IDE

## 🗄️ Database

- MySQL Database
- JDBC Connectivity

## 📂 Project Structure

```
Vehicle-Rental-Management-System/
├── build/classes/     # Compiled class files
├── nbproject/         # NetBeans project configuration
├── src/                # Java source code (Models, Views, Controllers)
├── build.xml           # Ant build script
└── manifest.mf          # Application manifest file
```
## 🚀 Getting Started
 
### Prerequisites
 
Make sure you have the following installed:
 
- [Java Development Kit (JDK 8+)](https://www.oracle.com/java/technologies/downloads/)
- [Apache NetBeans IDE](https://netbeans.apache.org/download/index.html)
- [MySQL Server](https://dev.mysql.com/downloads/) *(if the project uses a database)*
### Installation
 
1. **Clone the repository**
```bash
   git clone https://github.com/KDHSandeepani/Vehicle-Rental-Management-System.git
```
 
2. **Open the project**
   - Launch NetBeans IDE
   - Go to `File → Open Project`
   - Select the cloned `Vehicle-Rental-Management-System` folder
3. **Configure the database**
   - Create a database (e.g. `vehicle_rental_db`) in MySQL
   - Import the provided SQL script (if available) or set up the required tables
   - Update the database connection credentials in the source code (usually in a `DBConnection` or `DatabaseUtil` class)
4. **Build and Run**
   - Right-click the project in NetBeans → `Clean and Build`
   - Then click `Run Project` (▶) or press `F6`
---
 
## 👩‍💻 Author
 
**K.D.H. Sandeepani**
🔗 [GitHub Profile](https://github.com/KDHSandeepani)
