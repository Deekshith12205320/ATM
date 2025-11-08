# 💳 ATM Management System (Java Project)

### 🧾 Overview  
The **ATM Management System** is a simple console-based Java project that simulates the basic operations of an Automated Teller Machine.  
It allows users to **create new accounts**, **login**, **deposit and withdraw money**, and **check account balances**.  
All account data is stored in a text file (`accounts.txt`) using **Java File Handling**, making the information **persistent** even after the program closes.

---

### ⚙️ Key Features  
- 🧍‍♂️ Create a new bank account  
- 🔑 Login using your account number  
- 💰 Deposit money into your account  
- 💸 Withdraw money with balance validation  
- 📊 Check your current account balance  
- 💾 Permanent data storage using text files  
- ⚠️ Error handling for invalid or negative inputs  

---

### 🧠 Technologies Used  
- **Programming Language:** Java  
- **Core Concepts:**  
  - File Handling (`File`, `FileWriter`, `PrintWriter`, `Scanner`)  
  - Loops and Conditional Statements  
  - Exception Handling (`try-catch`)  
  - User Input via `Scanner`  
  - Basic Functions and Switch Statements  

---

### 🏗️ Project Structure  
**Files Included:**
- `atm.java` → Main program source code  
- `accounts.txt` → Data file automatically created for storing account information  
- `README.md` → Project documentation  

---

### 📘 How It Works  
1. The program starts by displaying a welcome screen.  
2. It asks the user to enter an **account number**.  
3. If the account exists, the user is logged in and can access their balance.  
4. If not, the program offers to **create a new account**.  
   - The user enters a **new account number**.  
   - Then enters the **initial deposit amount**.  
5. Once logged in, the following menu options are available:  
   - **1. Withdraw** → Withdraw an amount if sufficient balance is available.  
   - **2. Deposit** → Deposit money into the account.  
   - **3. Check Balance** → Display the current account balance.  
   - **4. Exit** → Exit the program safely.  
6. All updates are saved in the `accounts.txt` file automatically.  

---

### 💾 Data Storage Format  
Each account is stored on a new line in the file `accounts.txt` in the following format:

**Format:**
AccountNumber Balance

**Example:**
12345 5000  
67890 12000

---

### 🧩 Example Output  
========== Welcome to ATM ==========  
Enter your Account Number: 1111  
Account not found!  
Do you want to create a new account? (y/n): y  
Create your new Account Number: 12345  
Enter your initial deposit: 5000  
Account created successfully!  
Your Account Number: 12345  
Your Current Balance: ₹5000  

1. Withdraw  
2. Deposit  
3. Check Balance  
4. Exit  
Choose an option: 2  
Enter amount to deposit: 2000  
Amount deposited successfully!  
Balance: ₹7000  

---

### 📚 Learning Concepts Covered  
- Input handling using `Scanner`  
- Persistent data management using **File Handling**  
- Use of **loops**, **conditions**, and **switch statements**  
- Exception handling (`try-catch`)  
- Modular design using methods for validation and file updates  

---

### 🚀 How to Run  
1. Save the project file as `atm.java`  
2. Open your terminal or command prompt  
3. Compile the code:  
   `javac atm.java`  
4. Run the program:  
   `java atm`  
5. The program will automatically create a file named `accounts.txt` to store all account data.

---

### 🌱 Future Enhancements  
- Add 4-digit PIN authentication for each account  
- Auto-generate unique account numbers  
- Add user names and account details  
- Include a transaction history feature  
- Upgrade to database storage (e.g., MySQL)  

---

### 👨‍💻 Author  
**Deekshith G C**  
📍 Punjab, India  
💼 Aspiring Software Developer | Java & Full-Stack Enthusiast  

---

## 🏁 Summary  
This project demonstrates the **practical use of Java fundamentals and file handling** in a real-world scenario.  
It is simple, efficient, and a great addition to your portfolio — showing your ability to manage **data persistence, logic design, and structured programming** in Java.
