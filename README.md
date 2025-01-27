# Quiz Application

A simple Java-based console application that lets users take a quiz by answering multiple-choice questions. The application evaluates the answers and displays the user's final score at the end.

---

## Features

- Console-based interface.
- Multiple-choice questions.
- Real-time feedback on correct and incorrect answers.
- Final score displayed at the end.
- Easy to extend with more questions.

---

## Folder Structure

```
QuizApplication/
|
|-- src/
|   |-- Main.java        # Entry point of the application
|   |-- Quiz.java        # Manages the quiz logic
|   |-- Question.java    # Represents individual quiz questions
|
|-- README.md            # Documentation file
```

---

## Requirements

- Java Development Kit (JDK) 8 or higher.
- A terminal or command prompt to run the application.

---

## How to Run

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/quiz-application.git
   cd quiz-application
   ```

2. **Compile the Java Files:**
   ```bash
   javac src/*.java -d out
   ```

3. **Run the Application:**
   ```bash
   java -cp out Main
   ```

---

## How to Add Questions

1. Open the `Quiz.java` file.
2. Add more questions to the `loadQuestions()` method using the following format:
   ```java
   questions.add(new Question(
       "Question text here",
       "CorrectAnswer",
       "OptionA",
       "OptionB",
       "OptionC",
       "OptionD"
   ));
   ```

---

## Example Output

```
Welcome to the Quiz!
--------------------

What is the capital of France?
A. Paris
B. London
C. Berlin
D. Madrid
Your answer: A
Correct!

What is 5 + 3?
A. 6
B. 7
C. 8
D. 9
Your answer: C
Correct!

Which planet is known as the Red Planet?
A. Earth
B. Mars
C. Jupiter
D. Saturn
Your answer: D
Wrong! The correct answer was: B

Quiz finished!
Your final score is: 2/3
```

---

## Future Enhancements

- Add a graphical user interface (GUI) using JavaFX or Swing.
- Save user scores to a file or database.
- Implement timed quizzes.
- Add more types of questions, like True/False or Fill in the Blanks.

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## Contributing

Contributions are welcome! If you have any suggestions or want to add new features, feel free to open an issue or submit a pull request.

