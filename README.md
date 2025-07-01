# 🎟️ Ticket Booking System Using Multithreading (Java)

This is a simple multithreaded Java project that simulates a real-life ticket booking system. Multiple users (threads) try to book tickets concurrently, and synchronization ensures thread safety.

---

## 💡 Project Features

- Multiple users (threads) booking tickets simultaneously
- Thread-safe booking using `synchronized`
- Simulation of real-world concurrency
- Java `Thread` class used for parallel execution

---

## 🧱 Project Structure

TicketBookingSystem/
│
├── TicketCounter.java // Manages available tickets and booking logic
├── TicketBookingThread.java // Represents each user trying to book tickets
└── Main.java // Starts and manages all booking threads

yaml
Copy
Edit

---

## 🚀 How It Works

- `TicketCounter` keeps track of available tickets.
- Each `TicketBookingThread` tries to book a certain number of tickets.
- The `bookTicket()` method is synchronized to prevent race conditions.

---

## 📦 Technologies Used

- Java 8+
- Multithreading (Core Java)
- Eclipse IDE / VS Code
- Git & GitHub

---

## 🛠️ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/DarshanBK812/Ticket-Booking-System-Using-Multithreading.git
Open the project in any Java IDE (e.g., Eclipse, IntelliJ)

Run Main.java

🧪 Sample Output
scss
Copy
Edit
Alice is booking 4 ticket(s)...
Alice successfully booked 4 ticket(s).
Remaining tickets: 6
Bob is booking 5 ticket(s)...
Bob successfully booked 5 ticket(s).
Remaining tickets: 1
Charlie failed to book. Not enough tickets available.
📌 Author
👤 Darshan B K

🔗 LinkedIn

📜 License
This project is for educational purposes only.

yaml
Copy
Edit

---

### ✅ How to Add This to Your Repo:

1. Create a new file in your project root:

```bash
touch README.md
Paste the above content inside the file.

Then push it:

bash
Copy
Edit
git add README.md
git commit -m "Added project README"
git push origin main
