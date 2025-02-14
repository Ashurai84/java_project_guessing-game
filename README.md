# Number Guessing Game in Java

## Overview
This project is a simple **Number Guessing Game** written in Java. It allows the user to guess a randomly generated number between **1 and 100**. The program provides hints to the user, indicating whether their guess is too high or too low. The game continues in a loop until the user correctly guesses the number.

## How It Works
1. The program generates a **random number** between 1 and 100.
2. It then prompts the user to guess the number.
3. If the user's guess is **correct**, the program prints a success message and exits.
4. If the guess is **too high**, the program informs the user.
5. If the guess is **too low**, the program informs the user.
6. The loop continues until the correct number is guessed.
7. Once the game ends, the program reveals the correct number.

## Code Explanation
- **Random Number Generation:**
  - The random number is generated using `Math.random()`.
  - `MyNumber = (int) (Math.random() * 100);` ensures a number between **0 to 99**, which is then interpreted as **1 to 100**.

- **User Input Handling:**
  - The `Scanner` class is used to take user input.
  - `sc.nextInt();` is used to read an integer from the user.

- **Decision Making:**
  - `if` condition checks if the user's guess matches the random number.
  - `else if` checks if the guess is higher.
  - `else` assumes the guess is lower.

- **Looping:**
  - A `do-while` loop is used to keep prompting the user until the correct guess is made.
  - The loop runs indefinitely until the correct number is guessed.

## Sample Output
```
Guess my number between 1 to 100
50
Your number is too big.
Guess my number between 1 to 100
25
Your number is too small.
Guess my number between 1 to 100
37
WHOOO you GUESSED IT RIGHT buddy!
```

## How to Run
1. Install Java Development Kit (JDK) if not already installed.
2. Save the file as `Project_1.java`.
3. Open a terminal/command prompt and navigate to the file location.
4. Compile the program using:
   ```sh
   javac Project_1.java
   ```
5. Run the program using:
   ```sh
   java Project_1
   ```

## Possible Improvements
- Add **limited attempts** to make the game more challenging.
- Allow the user to **play multiple rounds** without restarting the program.
- Implement an **easy, medium, hard** difficulty setting that changes the number range.
- Improve **user input validation** to handle non-integer inputs.

## Conclusion
This project is a great starting point for understanding user input handling, loops, and conditionals in Java. It provides an interactive experience while reinforcing core Java concepts.

---
Happy Coding! 🚀
