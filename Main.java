package com.kojiohara;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        int width = 900;
        int height = 700;
        primaryStage.setTitle("Learning Java");

        //Scene 1 (introduction)
        VBox layout = new VBox();
        Scene scene1 = new Scene(layout, width, height);
        Label label1 = new Label("Hello, in this course, you will be  learning the basics of JAVA!");
        Button button1 = new Button();
        button1.setText("Next");
        button1.setMinSize(50, 35);
        layout.getChildren().addAll(button1, label1);
        primaryStage.setScene(scene1);

        //Scene 2 (syntax)
        VBox layout2 = new VBox();
        Scene scene2 = new Scene(layout2, width, height);
        Label label2 = new Label("Here is the basic Syntax. \n " +
                "In the programming language Java, at the end of almost every line, there will be a ';'\n" +
                "Obviously there are exceptions but we will cover those later\n" +
                "In java, to display something, you write System.out.println()\n" +
                "Inside the parentheses goes what you want to display in between quotation marks");
        Button button2 = new Button();
        button2.setText("Next");
        layout2.getChildren().addAll(label2, button2);

        //Scene 3 (quiz on syntax)
        VBox layout3 = new VBox();
        Scene scene3 = new Scene(layout3, width, height);
        Label label3 = new Label("Select which of these symbols almost every line in Java finish in?");
        Button correctButton = new Button();
        Button wrongButton = new Button();
        correctButton.setText(";");
        wrongButton.setText("*");
        Button button3 = new Button();
        button3.setText("Next");
        Button backButton1 = new Button();
        backButton1.setText("Back");
        correctButton.setOnAction(event -> {
            label3.setText("You are correct");
            layout3.getChildren().addAll(button3);
            layout3.getChildren().removeAll(wrongButton, correctButton);
        });
        wrongButton.setOnAction(event -> {
            label3.setText("You are wrong");
            layout3.getChildren().addAll(backButton1);
        });


        layout3.getChildren().addAll(label3, correctButton, wrongButton);

        //Scene 4 (variables)
        VBox layout4 = new VBox();
        Scene scene4 = new Scene(layout4, width, height);
        Button button4 = new Button();
        button4.setText("Next");
        Label label4 = new Label("In Java, just like in math, there are variables. \n" +
                "These variables are hold different values\n" +
                "In java, there are many types of variables but in this course, we'll only need 5.\n" +
                "These 6 are:\n" +
                "int, which holds a whole negative or positive number, example = 10\n" +
                "double, which can hold a negative or positive number with many decimals, example = 13.5657\n" +
                "char, which holds a character or a symbol like 'A'. When declaring a char, the value must be in between single quotes: ''\n" +
                "String, holds a collection of characters to make a word like a name or a small sentence. When declaring a String, the value must be between double quotes\n" +
                "To create a variable in Java, the format is 'typeOfVariable nameOfVariable = valueOfVariable'\n" +
                "To display a variable, you write System.out.println(nameOfVariable)\n" +
                "The name of the variable SHOULD NOT go in quotation marks, or it will print the name of the variable and not the value");

        layout4.getChildren().addAll(label4, button4);

        //Scene 5(quiz on variables)
        VBox layout5 = new VBox();
        Scene scene5 = new Scene(layout5, width, height);
        Button backButton2 = new Button();
        backButton2.setText("Back");
        Button button5 = new Button();
        button5.setText("Next");
        TextField IntQuiz = new TextField();
        IntQuiz.setPromptText("Integer Variable");
        String intAnswerC = "int anInteger = 10;";
        TextField StringQuiz = new TextField();
        StringQuiz.setPromptText("String Variable");
        String stringAnswerC = "String aString = \"This is a String\";";
        StringQuiz.setPrefWidth(400);
        IntQuiz.setPrefWidth(400);
        Button checkButton = new Button();
        checkButton.setText("Check");
        Label label5 = new Label("Now its time for a quiz!\n" +
                "In the text area below create a variable of type String called 'aString' with the value \"This is a String\";\n" +
                "Create another variable of type int named 'anInteger' with value 10\n" +
                "If you are having trouble click the 'Back' button");
        checkButton.setOnAction(event -> {
            String answerS = StringQuiz.getText().trim();
            String answerI = IntQuiz.getText().trim();
            if(answerI.equals(intAnswerC) && answerS.equals(stringAnswerC)){//if answer is correct
                label5.setText("You are correct! You may move on!");
                layout5.getChildren().addAll(button5);
                layout5.getChildren().removeAll(checkButton);
            }else if(answerI.equals("") && answerS.equals("")){//if answers are blank
                label5.setText("Enter your answer in the text fields");
            }else if(!answerI.equals(intAnswerC) && !answerS.equals(stringAnswerC)){//if answers are wrong
                label5.setText("You are wrong, go back and try again");
                layout5.getChildren().addAll(backButton2);
            }else if((!answerI.equals(intAnswerC) && (answerS.equals(stringAnswerC))) || (answerI.equals(intAnswerC) && !answerS.equals(stringAnswerC))){//if one answer is wrong and the other is correct
                label5.setText("You have one of your answeres correct! Go back and try again");
                layout5.getChildren().addAll(backButton2);
            }
        });
        layout5.getChildren().addAll(label5, backButton2, IntQuiz, StringQuiz, checkButton);

        //Scene 6 (operators)
        VBox layout6 = new VBox();
        Scene scene6 = new Scene(layout6, width, height);
        Button button6 = new Button();
        button6.setText("Next");
        Label label6 = new Label("In Java, you can also do simple or complex math problems.\n" +
                "For addition, it would look like this: variable += number or variable.\n " +
                "Imagine I have a have a variable with a value of 10 and I want to add 3.\n" +
                "I would do that by doing 'variable name += 3', and 13 is now the value of that variable\n" +
                "Same thing goes for any other simple operation, like subtraction, which is '-' or multiplication which is '*'\n" +
                "You can also check if a number is greater(>) or less than(<) another number\n" +
                "Division is a special case, if you do oddVariable/=2, it would only give you the number, but not the decimal.\n" +
                "So the variable would have to be of type double for you to get the decimal.");
        layout6.getChildren().addAll(label6, button6);

        //scene 7 (quiz on operators)
        VBox layout7 = new VBox();
        Scene scene7 = new Scene(layout7, width, height);
        Button button7 = new Button("Next");
        Button wrongButton2 = new Button("++3");
        Button wrongButton3 = new Button("=+3");
        Button rightButton = new Button("+=3");
        Button backButton3 = new Button();
        TextField operatorTextField = new TextField();
        operatorTextField.setPromptText("Operator");
        Label label7 = new Label("Lets say we have a variable named 'aNumber' of type 'int' with value 5.\n" +
                "We want to make it 8. After the 'aNumber' what do we put to make it 8?");
        wrongButton2.setOnAction(event -> {
            label7.setText("Incorrect. Go back and try again");
            layout7.getChildren().addAll(backButton3);
        });
        wrongButton3.setOnAction(event -> {
            label7.setText("Incorrect. Go back and try again");
            layout7.getChildren().addAll(backButton3);
        });
        rightButton.setOnAction(event -> {
            label7.setText("You are correct!");
            layout7.getChildren().addAll(button7);
        });

        layout7.getChildren().addAll(label7, wrongButton2, wrongButton3, rightButton);

        //Scene 8 (if statements)
        VBox layout8 = new VBox();
        Scene scene8 = new Scene(layout8, width, height);
        Button button8 = new Button("Next");
        Label label8 = new Label("In programming, there are things called conditionals, which are pieces of code that only execute if a certain condition is met.\n" +
                "The syntax for Java for conditionals, also called 'if statements' goes: 'if(condition met or to be met){code tha executes when condition is met}'\n" +
                "For example: if(it is raining){bring umbrella}.\n" +
                "If statements are one of the exceptions where the first 'if' line doesn't end with a semi-colon, but the lines inside the curly brackets do\n" +
                "An actual example of an if statement used in a game would be:\n" +
                "if(health == 10){\n" +
                "health += 90;\n" +
                "}");
        layout8.getChildren().addAll(label8, button8);

        VBox layout9 = new VBox();
        Scene scene9 = new Scene(layout9, width, height);
        Button button9 = new Button("Next");
        Button noButton = new Button("No");
        Button yesButton = new Button("Yes");
        Button backButton4 = new Button("Back");
        Label label9 = new Label("To move on to the next part, answer the following correctly.\n" +
                "Does the end of the first line of an 'if statement' end in a semicolon(;)?");
        //todo: if statement corrections
        noButton.setOnAction(event -> {//correct
            label9.setText("Correct! Now, what goes inside the parentheses () of an if statement?\n" +
                    "If you're stuck, you can always go back!");
            Button conditionButton = new Button("The condition that has to be met");
            Button todoButton = new Button("What has to be done when or if condition is met");
            Button afterButton = new Button("What has to be done after if statement is done");

            conditionButton.setOnAction(event1 -> {//if correct for what goes in parentheses is pressed
                label9.setText("Correct! Now, what goes inside the curly brackets?'{}'");
                Button conditionButton1 = new Button("The condition that has to be met");
                Button todoButton1 = new Button("What has to be done when or if condition is met");
                Button afterButton1 = new Button("What has to be done after if statement is done");
                layout9.getChildren().removeAll(conditionButton, todoButton, afterButton);
                layout9.getChildren().addAll(conditionButton1, todoButton1, afterButton1);

                conditionButton1.setOnAction(event2 -> {//if wrong button is pressed for in curly brackets
                    label9.setText("Incorrect. Go back or try again");
                    layout9.getChildren().addAll(backButton4);
                });
                todoButton1.setOnAction(event2 -> {//if correct button for what goes in curly brackets is pressed
                    label9.setText("Correct again!");
                    layout9.getChildren().addAll(button9);
                });
                afterButton1.setOnAction(event2 -> {//if wrong button2 for what goes in curly brackets is pressed
                    label9.setText("Incorrect. Go back or try again");
                    layout9.getChildren().addAll(backButton4);
                });
            });
            todoButton.setOnAction(event1 -> {//if wrong button for what goes in parentheses
                label9.setText("Incorrect. Go back or try again");
                layout9.getChildren().addAll(backButton4);
            });
            afterButton.setOnAction(event1 -> {//if wrong button2 for what goes in parentheses is pressed
                label9.setText("Incorrect. Go back or try again");
                layout9.getChildren().addAll(backButton4);
            });

            layout9.getChildren().addAll(conditionButton, todoButton, afterButton);
        });
        yesButton.setOnAction(event -> {
            label9.setText("Incorrect! Go back or try again");
        });

        layout9.getChildren().addAll(noButton, yesButton, label9, backButton4);

        //scene 10, arrays
        VBox layout10 = new VBox();
        Scene scene10 = new Scene(layout10, width, height);
        Button button10 = new Button("Next");
        Label label10 = new Label("In programming, there are things called collections, which are exactly what they sound like, collections of a thing.\n" +
                "In Java, there are multiple types of collections, but the main ones are called 'Arrays' and 'ArrayLists'.\n" +
                "Arrays are containers that hold a fixed number of a single type of variable. The things in an array are called Elements\n" +
                "to define an Array:\n" +
                "variableType[] nameOfArray = {Elements of array};\n" +
                "the square brackets '[]' is what makes this an Array.\n" +
                "Lets say you have this array: int[] arrayName = {3, 5, 6, 8, 9, 11};\n" +
                "The array has 6 elements. Lets say you want to display the first element. To do that, you would have to write\n" +
                "System.out.println(arrayName[0]); Why?\n" +
                "In programming, unlike real life, we count starting from 0, not 1.\n" +
                "So the third element in an Array would be of index(a number assigned to each element) would be 2.");
        layout10.getChildren().addAll(button10, label10);

        //scene 11, quiz on arrays
        VBox layout11 = new VBox();
        Scene scene11 = new Scene(layout11, width, height);
        Button button11 = new Button("Next");
        Button backButton5 = new Button("Back");
        Label label11 = new Label("We have this Array:\n" +
                "int[] oddNumbers = {1, 3, 5, 7, 9, 11, 13, 15};\n" +
                "in the text field below, write the line to display 7\n" +
                "(hint: println();\n" +
                "If you are having trouble, you can always go back");
        TextField arrayField = new TextField();
        arrayField.setPromptText("Write your answer here");
        Button checkIndexArray = new Button("Check");
        checkIndexArray.setOnAction(event -> {
            String displayElement = arrayField.getText().trim();
            String correctAnswer = "System.out.println(oddNumbers[3]);".trim();
            if (displayElement.equals(correctAnswer)){//if calling index was correct
                label11.setText("Correct! You are on a roll!\n" +
                        "Suppose we want to make an array.\n" +
                        "Which of these goes right next to the variable type?");
                Button squareBrackets = new Button("[]");
                Button asterisk = new Button("**");
                Button forwardSlash = new Button("/ /");

                squareBrackets.setOnAction(event1 -> {//if square brackets is pressed(correct)
                    label11.setText("Wow! Correct again! Suppose we have an array, where the last index(not element) is 5. \n" +
                            "How many elements does this array have?\n" +
                            "Remember: array indexes start at 0");
                    Button fiveButton = new Button("5");
                    Button fourButton = new Button("4");
                    Button sixButton = new Button("6");
                    layout11.getChildren().addAll(fiveButton, fourButton, sixButton);

                    fiveButton.setOnAction(event2 -> {//wrong
                        label11.setText("You are incorrect. Go back or try again");
                        layout11.getChildren().addAll(backButton5);
                    });
                    fourButton.setOnAction(event2 -> {//wrong
                        label11.setText("You are incorrect. Go back or try again");
                        layout11.getChildren().addAll(backButton5);
                    });
                    sixButton.setOnAction(event2 -> {//right
                        label11.setText("Wow! Right again!");
                        layout11.getChildren().addAll(button11);
                    });
                });
                asterisk.setOnAction(event1 -> {//if asterisks are pressed(incorrect)
                    label11.setText("You are wrong. Try again or go back");
                });
                forwardSlash.setOnAction(event1 -> {//if forward slashes are pressed(incorrect)
                    label11.setText("You are wrong. Try again or go back");
                });

                layout11.getChildren().addAll(squareBrackets, asterisk, forwardSlash);
            }else{//if calling index was wrong
                label11.setText("Incorrect. Go back and try again.");
                layout11.getChildren().addAll(backButton5);
            }
        });
        layout11.getChildren().addAll(label11, arrayField, checkIndexArray, backButton5);

        //Scene 12 on arraylists
        VBox layout12 = new VBox();
        Scene scene12 = new Scene(layout12, width, height);
        Button button12 = new Button("Next");
        Label label12 = new Label("In Java, there are things called arraylists. These are another type of collections.\n" +
                "The difference between these and normal arrays, is that you can edit arraylists, i.e. add elements or remove elements.\n" +
                "To define an arrayList:\n" +
                "ArrayList <type> name = new ArrayList<>();\n" +
                "The 'type' that goes in the triangles is basically the variable type.\n" +
                "But in arraylists, you cant put the regular types like 'int' or 'char'.\n" +
                "For example, if we wanted to make an arraylist of type 'int', it would look like this:\n" +
                "ArrayList<Integer>name = new ArrayList<>();\n" +
                "For an arraylist of type char, you would write 'Character' inside the triangles.\n" +
                "To put or add elements to an arraylist, the line is: arrayListName.add(whatever you want ot add(depends on the type))\n" +
                "For example, if we had an arraylist called ourList of type Integer, to add an element to the list, we would do:\n" +
                "ourList.add(5); Which then adds 5 to our list.\n" +
                "To remove an element: arrayListName.remove(indexNumber);\n" +
                "Remember indexes start at 0");
        layout12.getChildren().addAll(label12, button12);

        VBox layout13 = new VBox();
        Scene scene13 = new Scene(layout13, width, height);
        Label label13 = new Label("Time for another quiz! This one will be about the arraylists.\n" +
                "");


        //all the button actions
        button1.setOnAction(event -> primaryStage.setScene(scene2));//goes to scene 2 (syntax)
        button2.setOnAction(event -> primaryStage.setScene(scene3));//goes to scene 3 (quiz on syntax)
        backButton1.setOnAction(event -> primaryStage.setScene(scene2));//goes back to scene 2(syntax)
        button3.setOnAction(event -> primaryStage.setScene(scene4));//goes to scene 4(variables)
        button4.setOnAction(event -> primaryStage.setScene(scene5));//goes to quiz on variables
        backButton2.setOnAction(event -> primaryStage.setScene(scene4));//goes back to variables
        button5.setOnAction(event -> primaryStage.setScene(scene6));//goes to operators scene
        button6.setOnAction(event -> primaryStage.setScene(scene7));//goes to quiz on operators
        backButton3.setOnAction(event -> primaryStage.setScene(scene6));//goes back to operators
        button7.setOnAction(event -> primaryStage.setScene(scene8));//goes to if statements
        button8.setOnAction(event -> primaryStage.setScene(scene9));//goes to quiz on if statements
        backButton4.setOnAction(event -> primaryStage.setScene(scene8));//goes back to if statement scene
        button9.setOnAction(event -> primaryStage.setScene(scene10));//goes to array scene
        button10.setOnAction(event -> primaryStage.setScene(scene11));//goes to quiz on arrays
        backButton5.setOnAction(event -> primaryStage.setScene(scene10));//goes back to scene on arrays
        button11.setOnAction(event -> primaryStage.setScene(scene12));//goes to scene on arraylists
        button12.setOnAction(event -> primaryStage.setScene(scene13));//goes to arraylist quiz scene

        /*TODO:
        * Arrays and other data structures
        * loops
        * loops quiz
        */

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
