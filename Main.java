package sample;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.sun.corba.se.impl.orbutil.graph.Graph;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.LightBase;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import static com.jfoenix.controls.JFXButton.ButtonType.RAISED;
import static javafx.geometry.Pos.CENTER;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        int width = 900;
        int height = 700;
        int middleX = 382;//(900 - 136(button width))/2
        double buttonWidth = 136;
        double buttonHeight = 70;
        primaryStage.setTitle("Learning Java");

        //Scene 1 (introduction)
        Pane layout = new Pane();
        Scene scene1 = new Scene(layout, width, height);
        Label label1 = new Label("  Hello, in this course, you will be  learning the basics of JAVA!");
        label1.setFont(Font.font("System Bold", 30));
        label1.setAlignment(CENTER);
        JFXButton button1 = new JFXButton();
        button1.setText("Next");
        button1.setButtonType(RAISED);
        button1.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 18;");
        button1.setMinSize(136, 70);
        button1.setLayoutX(383);
        button1.setLayoutY(548);
        button1.setFont(Font.font("System Bold", 30));
        ImageView javaLogo = new ImageView(new Image(getClass().getResourceAsStream("/images/Java_programming_language_logo.svg.png"),255, 255, true, true));
        javaLogo.setLayoutY(179);
        javaLogo.setLayoutX(385);
        ImageView mgmn = new ImageView(new Image(getClass().getResourceAsStream("/images/20042-7-megaman-hd-thumb.png"), 228, 235, true, true));
        mgmn.setLayoutX(616);
        mgmn.setLayoutY(289);
        layout.getChildren().addAll(button1, label1, javaLogo, mgmn);
        primaryStage.setScene(scene1);

        //Scene 2 (syntax)
        Pane layout2 = new Pane();
        Scene scene2 = new Scene(layout2, width, height);
        Label println = new Label("System.out.println();");
        println.setFont(Font.font("System Bold", 22));
        println.setStyle("-fx-text-fill: #ff1904");
        println.setLayoutY(84);
        println.setLayoutX(580);
        Label sm = new Label(";");
        sm.setFont(Font.font("System Bold", 48));
        sm.setStyle("-fx-text-fill: #ff1904");
        sm.setLayoutX(854);
        sm.setLayoutY(12);
        Label label2 = new Label("Here is the basic Syntax. \n " +
                "In the programming language Java, at the end of almost every line, there will be a   \n" +
                "Obviously there are exceptions but we will cover those later\n" +
                "In java, to display something, you write                      \n" +
                "Inside the parentheses goes what you want to display in between quotation marks");
        label2.setTextAlignment(TextAlignment.CENTER);
        label2.setFont(Font.font("System Bold", 22));
        JFXButton button2 = new JFXButton();
        button2.setText("Next");
        button2.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 18");
        button2.setFont(Font.font("System Bold", 30));
        button2.setMinSize(136, 70);
        button2.setLayoutX(398);
        button2.setLayoutY(531);
        button2.setButtonType(RAISED);
        ImageView semicolonImage = new ImageView(new Image(getClass().getResourceAsStream("/images/semicolonoscopy.png"), 266, 417, true, true));
        semicolonImage.setLayoutX(326);
        semicolonImage.setLayoutY(212);
        layout2.getChildren().addAll(label2, button2, semicolonImage, println, sm);

        //Scene 3 (quiz on syntax)
        Pane layout3 = new Pane();
        Scene scene3 = new Scene(layout3, width, height);
        Label label3 = new Label("Select which of these symbols almost every line in Java finish in?");
        label3.setFont(Font.font("System Bold", 24));
        JFXButton correctButton = new JFXButton();
        correctButton.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 18");
        correctButton.setLayoutX(416);
        correctButton.setLayoutY(206);
        correctButton.setFont(Font.font("System Bold", 39));
        correctButton.setButtonType(RAISED);
        correctButton.setText(";");
        JFXButton wrongButton = new JFXButton();
        wrongButton.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 18");
        wrongButton.setLayoutX(416);
        wrongButton.setLayoutY(342);
        wrongButton.setButtonType(RAISED);
        wrongButton.setFont(Font.font("System Bold", 38));
        wrongButton.setText("*");
        JFXButton button3 = new JFXButton();
        button3.setText("Next");
        button3.setButtonType(RAISED);
        button3.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 18");
        button3.setMinSize(136, 70);
        button3.setTranslateY(401);
        button3.setTranslateX(middleX);
        button3.setFont(Font.font("System Bold", 30));
        ImageView qRobot = new ImageView(new Image(getClass().getResourceAsStream("/images/robot-image.png"),207, 214, true, true));
        ImageView qMark = new ImageView(new Image(getClass().getResourceAsStream("/images/question-mark-hi.png"),96, 79, true, true));
        qRobot.setLayoutX(680);
        qRobot.setLayoutY(413);
        qMark.setLayoutX(779);
        qMark.setLayoutY(360);
        JFXButton backButton1 = new JFXButton();
        backButton1.setText("Back");
        backButton1.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 18");
        backButton1.setLayoutX(middleX);
        backButton1.setLayoutY(490);
        backButton1.setMinSize(buttonWidth, buttonHeight);
        backButton1.setFont(Font.font("System Bold", 40));
        correctButton.setOnAction(event -> {
            label3.setText("You are correct!");
            label3.setFont(Font.font("System Bold", 40));
            ImageView confetti1 = new ImageView(new Image(getClass().getResourceAsStream("/images/confetti-clipart-animated-gif-8.gif"),260, 260, true, true));
            confetti1.setLayoutX(332);
            layout3.getChildren().addAll(button3, confetti1);
            layout3.getChildren().removeAll(wrongButton, correctButton, backButton1, qMark, qRobot);
        });
        wrongButton.setOnAction(event -> {
            label3.setText("You are wrong");
            layout3.getChildren().addAll(backButton1);
        });
        layout3.getChildren().addAll(label3, correctButton, wrongButton, qRobot, qMark, backButton1);

        //Scene 4 (variables)
        Pane layout4 = new Pane();
        Scene scene4 = new Scene(layout4, width, height);
        JFXButton button4 = new JFXButton();
        button4.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 18");
        button4.setButtonType(RAISED);
        button4.setLayoutX(388);
        button4.setLayoutY(422);
        button4.setMinSize(136, 70);
        button4.setFont(Font.font("System Bold", 30));
        button4.setText("Next");
        Label intL = new Label("int");
        intL.setStyle("-fx-text-fill: #ff1904");
        intL.setFont(Font.font("System Bold", 16));
        intL.setLayoutX(3);
        intL.setLayoutY(85);
        Label doubleL = new Label("double");
        doubleL.setFont(Font.font("System Bold", 16));
        doubleL.setStyle("-fx-text-fill: #ff1904");
        doubleL.setLayoutX(3);
        doubleL.setLayoutY(106);
        Label charL = new Label("char");
        charL.setStyle("-fx-text-fill: #ff1904");
        charL.setFont(Font.font("System Bold", 16));
        charL.setLayoutX(3);
        charL.setLayoutY(127);
        Label stringL = new Label("String");
        stringL.setFont(Font.font("System Bold", 16));
        stringL.setStyle("-fx-text-fill: #ff1904");
        stringL.setLayoutX(3);
        stringL.setLayoutY(147);
        Label varDeclareL = new Label("typeOfVariable nameOfVariable = valueOfVariable;");
        varDeclareL.setStyle("-fx-text-fill: #ff1904");
        varDeclareL.setFont(Font.font("System Bold", 16));
        varDeclareL.setLayoutY(209);
        varDeclareL.setLayoutX(319);
        Label boolL = new Label("boolean");
        boolL.setStyle("-fx-text-fill: #ff1904");
        boolL.setFont(Font.font("System Bold", 16));
        boolL.setLayoutX(3);
        boolL.setLayoutY(189);
        Label label4 = new Label("In Java, just like in math, there are variables. \n" +
                "These variables are hold different values.\n" +
                "In java, there are many types of variables but in this course, we'll only need 5.\n" +
                "These 6 are:\n" +
                "     , which holds a whole negative or positive number, example = 10\n" +
                "            , which can hold a negative or positive number with many decimals, example = 13.5657\n" +
                "        , which holds a character or a symbol like 'A'. When declaring a char, the value must be in between 'single quotes'\n" +
                "            , holds a collection of characters to make a word like a name or a small sentence.\n" +
                "When declaring a String, the value must be between \"double quotes\"\n" +
                "              , which holds one of two values, true or false\n" +
                "To create a variable in Java, the format is \n" +
                "To display a variable, you write System.out.println(nameOfVariable)\n" +
                "The name of the variable SHOULD NOT go in quotation marks, or it will print the name of the variable and not the value.\n");
        ImageView megaman2 = new ImageView(new Image(getClass().getResourceAsStream("/images/MegaMan.png"), 284, 256, true, true));
        megaman2.setLayoutX(673);
        megaman2.setLayoutY(409);
        label4.setFont(Font.font("System Bold", 16));
        label4.setLineSpacing(1);
        layout4.getChildren().addAll(label4, button4, intL, doubleL, charL, stringL, varDeclareL, boolL, megaman2);

        //Scene 5(quiz on variables)
        Pane layout5 = new Pane();
        Scene scene5 = new Scene(layout5, width, height);
        JFXButton backButton2 = new JFXButton();
        backButton2.setText("Back");
        backButton2.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 18");
        backButton2.setButtonType(RAISED);
        backButton2.setLayoutX(middleX);
        backButton2.setMinSize(buttonWidth, buttonHeight);
        backButton2.setLayoutY(595);
        backButton2.setFont(Font.font("System Bold", 30));
        backButton2.setMinSize(buttonWidth, buttonHeight);
        JFXButton button5 = new JFXButton();
        button5.setText("Next");
        button5.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 18");
        button5.setButtonType(RAISED);
        button5.setMinSize(buttonWidth, buttonHeight);
        button5.setFont(Font.font("System Bold", 30));
        button5.setLayoutX(middleX);
        button5.setMinSize(buttonWidth, buttonHeight);
        JFXTextField IntQuiz = new JFXTextField();
        IntQuiz.setPromptText("Integer Variable");
        IntQuiz.setMinSize(235, 45);
        IntQuiz.setLayoutX(336);
        IntQuiz.setLayoutY(264);
        IntQuiz.setFocusColor(Color.valueOf("#ff1904"));
        IntQuiz.setUnFocusColor(Color.valueOf("#901004"));
        String intAnswerC = "int anInteger = 10;".replaceAll("\\s", "");
        JFXTextField StringQuiz = new JFXTextField();
        StringQuiz.setPromptText("String Variable");
        StringQuiz.setMinSize(235, 45);
        StringQuiz.setFocusColor(Color.valueOf("#ff1904"));
        StringQuiz.setUnFocusColor(Color.valueOf("#901004"));
        StringQuiz.setLayoutX(336);
        StringQuiz.setLayoutY(393);
        String stringAnswerC = "String aString = \"This is a String\";".replaceAll("\\s", "");
        JFXButton checkButton = new JFXButton();
        checkButton.setButtonType(RAISED);
        checkButton.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 18");
        checkButton.setFont(Font.font("System Bold", 30));
        checkButton.setText("Check");
        checkButton.setMinSize(buttonWidth, buttonHeight);
        checkButton.setLayoutX(middleX);
        checkButton.setLayoutY(492);
        Label label5 = new Label("Now its time for a quiz!\n" +
                "In the text area below create a variable of type String called               with the value\n" +
                "Create another variable of type int named                  with value \n" +
                "If you are having trouble click the 'Back' button");
        label5.setFont(Font.font("System Bold", 17));
        Label hint1 = new Label("Don't forget the ';'");
        hint1.setFont(Font.font("System Bold", 17));
        hint1.setStyle("-fx-text-fill: #ff1904");
        hint1.setLayoutY(95);
        Label aString = new Label("'aString'");
        aString.setStyle("-fx-text-fill: #ff1904");
        aString.setLayoutX(482);
        aString.setLayoutY(22);
        Label stringValue = new Label("\"This is a String\"");
        stringValue.setFont(Font.font("System Bold", 17));
        stringValue.setStyle("-fx-text-fill: #ff1904");
        stringValue.setLayoutX(663);
        stringValue.setLayoutY(22);
        Label anIntger = new Label("anInteger");
        anIntger.setFont(Font.font("System Bold", 17));
        anIntger.setStyle("-fx-text-fill: #ff1904");
        anIntger.setLayoutX(337);
        anIntger.setLayoutY(44.5);
        Label ten = new Label("10");
        ten.setStyle("-fx-text-fill: #ff1904");
        ten.setFont(Font.font("System Bold", 17));
        ten.setLayoutY(44.5);
        ten.setLayoutX(503);
        aString.setFont(Font.font("System Bold", 17));
        checkButton.setOnAction(event -> {
            String answerS = StringQuiz.getText().replaceAll("\\s", "");
            String answerI = IntQuiz.getText().replaceAll("\\s", "");
            if(answerI.equals(intAnswerC) && answerS.equals(stringAnswerC)){//if answer is correct
                label5.setText("You are correct! You may move on!");
                label5.setFont(Font.font("System Bold", 40));
                layout5.getChildren().removeAll(backButton2, checkButton, ten, anIntger, aString, stringValue, hint1, StringQuiz, IntQuiz);
                ImageView confetti2 = new ImageView(new Image(getClass().getResourceAsStream("/images/confetti-cannon-gif-karla.gif"), 500, 500, true, true));
                confetti2.setScaleX(-1);
                confetti2.setLayoutY(5);
                ImageView confetti1 = new ImageView(new Image(getClass().getResourceAsStream("/images/confetti-cannon-gif-karla.gif"), 500, 500, true, true));
                layout5.getChildren().addAll(button5, confetti2, confetti1);
                confetti1.setLayoutX(400);
                button5.setLayoutY(375);
            }else if(answerI.equals("") && answerS.equals("")){//if answers are blank
                label5.setText("Enter your answer in the text fields");
                layout5.getChildren().removeAll(ten, anIntger, aString, stringValue);
            }else if(!answerI.equals(intAnswerC) && !answerS.equals(stringAnswerC)){//if answers are wrong
                label5.setText("You are wrong, go back and try again");
                layout5.getChildren().addAll(backButton2);
                layout5.getChildren().removeAll(ten, anIntger, aString, stringValue);
            }else if((!answerI.equals(intAnswerC) && (answerS.equals(stringAnswerC))) || (answerI.equals(intAnswerC) && !answerS.equals(stringAnswerC))){//if one answer is wrong and the other is correct
                label5.setText("You have one of your answers correct! Go back and try again");
                layout5.getChildren().removeAll(ten, anIntger, aString, stringValue, hint1);
                layout5.getChildren().addAll(backButton2);
            }
        });
        layout5.getChildren().addAll(label5, backButton2, IntQuiz, StringQuiz, checkButton, hint1, aString, stringValue, anIntger, ten);

        //Scene 6 (operators)
        Pane layout6 = new Pane();
        Scene scene6 = new Scene(layout6, width, height);
        JFXButton button6 = new JFXButton();
        button6.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 18");
        button6.setFont(Font.font("System Bold", 30));
        button6.setButtonType(RAISED);
        button6.setText("Next");
        button6.setLayoutX(middleX);
        button6.setLayoutY(360);
        button6.setMinSize(buttonWidth, buttonHeight);
        Label addFormat = new Label("variable += number or variable");
        addFormat.setStyle("-fx-text-fill: #ff1904");
        addFormat.setFont(Font.font("System Bold", 17.5));
        addFormat.setLayoutY(21);
        addFormat.setLayoutX(288);
        Label add3 = new Label("variable name += 3");
        add3.setStyle("-fx-text-fill: #ff1904");
        add3.setFont(Font.font("System Bold", 17.5));
        add3.setLayoutX(203);
        add3.setLayoutY(63);
        Label minus = new Label("-");
        minus.setStyle("-fx-text-fill: #ff1904");
        minus.setFont(Font.font("System Bold",25));
        minus.setLayoutY(80);
        minus.setLayoutX(610);
        Label multiply = new Label("*");
        multiply.setStyle("-fx-text-fill: #ff1904");
        multiply.setLayoutY(80);
        multiply.setLayoutX(835);
        multiply.setFont(Font.font("System Bold", 25));
        Label greaterThan = new Label("greater(>)");
        greaterThan.setStyle("-fx-text-fill: #ff1904");
        greaterThan.setFont(Font.font("System Bold", 17.5));
        greaterThan.setLayoutX(282);
        greaterThan.setLayoutY(105);
        Label less = new Label("less than(<)");
        less.setStyle("-fx-text-fill: #ff1904");
        less.setLayoutY(105);
        less.setLayoutX(394);
        less.setFont(Font.font("System Bold", 17.5));
        Label oddDivision = new Label("oddVariable /= 2");
        oddDivision.setStyle("-fx-text-fill: #ff1904");
        oddDivision.setLayoutX(293);
        oddDivision.setLayoutY(126);
        oddDivision.setFont(Font.font("System Bold", 17.5));
        Label doub = new Label("double");
        doub.setStyle("-fx-text-fill: #ff1904");
        doub.setFont(Font.font("System Bold", 17.5));
        doub.setLayoutY(147.5);
        doub.setLayoutX(335);
        Label label6 = new Label("In Java, you can also do simple or complex math problems.\n" +
                "For addition, it would look like this: \n " +
                "Imagine I have a have a variable with a value of 10 and I want to add 3.\n" +
                "I would do that by doing                                 , and 13 is now the value of that variable\n" +
                "Same thing goes for any other simple operation, like subtraction, which is    or multiplication which is \n" +
                "You can also check if a number is                   or                      another number\n" +
                "Division is a special case, if you do                             , it would only give you the number, but not the decimal.\n" +
                "So the variable would have to be of type             for you to get the decimal.");
        label6.setFont(Font.font("System Bold", 17.5));
        ImageView mathBot = new ImageView(new Image(getClass().getResourceAsStream("/images/robotmath.png"), 295, 375, true, true));
        ImageView mathIcon = new ImageView(new Image(getClass().getResourceAsStream("/images/icon.png"), 218, 194, true, true));
        mathBot.setLayoutX(50);
        mathBot.setLayoutY(250);
        mathIcon.setLayoutX(635);
        mathIcon.setLayoutY(195);
        layout6.getChildren().addAll(label6, button6, addFormat, add3, minus, multiply, greaterThan, less, oddDivision, doub, mathBot, mathIcon);

        //scene 7 (quiz on operators)
        Pane layout7 = new Pane();
        Scene scene7 = new Scene(layout7, width, height);
        JFXButton button7 = new JFXButton("Next");
        button7.setMinSize(buttonWidth, buttonHeight);
        button7.setFont(Font.font("System Bold", 40));
        button7.setButtonType(RAISED);
        button7.setLayoutX(middleX);
        button7.setLayoutY(425);
        button7.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 18");
        JFXButton wrongButton2 = new JFXButton("++3");
        wrongButton2.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 18");
        wrongButton2.setButtonType(RAISED);
        wrongButton2.setFont(Font.font("System Bold", 35));
        wrongButton2.setLayoutX(438);
        wrongButton2.setLayoutY(133);
        JFXButton wrongButton3 = new JFXButton("=+3");
        wrongButton3.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 18");
        wrongButton3.setButtonType(RAISED);
        wrongButton3.setFont(Font.font("System Bold", 35));
        wrongButton3.setLayoutX(438);
        wrongButton3.setLayoutY(256);
        JFXButton rightButton = new JFXButton("+=3");
        rightButton.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 18");
        rightButton.setButtonType(RAISED);
        rightButton.setFont(Font.font("System Bold",35));
        rightButton.setLayoutX(438);
        rightButton.setLayoutY(378);
        JFXButton backButton3 = new JFXButton("Back");
        backButton3.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 18");
        backButton3.setButtonType(RAISED);
        backButton3.setFont(Font.font("System Bold", 35));
        backButton3.setMinSize(buttonWidth, buttonHeight);
        backButton3.setLayoutX(435);
        backButton3.setLayoutY(498);
        ImageView blueBot = new ImageView(new Image(getClass().getResourceAsStream("/images/101481.png"), 320, 409, true, true));
        blueBot.setLayoutY(100);
        Label intl2 = new Label("int");
        intl2.setFont(Font.font("System Bold", 25));
        intl2.setStyle("-fx-text-fill: #ff1904");
        intl2.setLayoutX(629);
        Label aNumber = new Label("aNumber");
        aNumber.setFont(Font.font("System Bold", 25));
        aNumber.setStyle("-fx-text-fill: #ff1904");
        aNumber.setLayoutX(420);
        Label aNumber2 = new Label("aNumber");
        aNumber2.setFont(Font.font("System Bold", 25));
        aNumber2.setStyle("-fx-text-fill: #ff1904");
        aNumber2.setLayoutY(60);
        aNumber2.setLayoutX(106);
        Label val = new Label("5");
        val.setFont(Font.font("System Bold", 25));
        val.setStyle("-fx-text-fill: #ff1904");
        val.setLayoutX(783);
        val.setLayoutY(1);
        Label eight = new Label("8");
        eight.setFont(Font.font("System Bold", 25));
        eight.setStyle("-fx-text-fill: #ff1904");
        eight.setLayoutY(60);
        eight.setLayoutX(538);
        Label label7 = new Label("Lets say we have a variable named                  of type      with value  \n" +
                "We want to make it 8.\n" +
                "After the                , what do we put to make it   ?");
        label7.setFont(Font.font("System Bold", 25));
        wrongButton2.setOnAction(event -> {
            label7.setText("Incorrect. Go back and try again");
            layout7.getChildren().addAll(backButton3);
        });
        wrongButton3.setOnAction(event -> {
            label7.setText("Incorrect. Go back and try again");
            layout7.getChildren().addAll(backButton3);
            layout7.getChildren().removeAll(aNumber, intl2, aNumber2, val, eight);
        });
        rightButton.setOnAction(event -> {//correct to adding 3
            backButton3.setLayoutX(middleX+5);
            Label greaterL = new Label("greater");
            greaterL.setLayoutY(60);
            greaterL.setLayoutX(642);
            greaterL.setStyle("-fx-text-fill: #ff1904");
            greaterL.setFont(Font.font("System Bold", 25));
            label7.setText("You are correct!\n" +
                    "In the text filed below,\n" +
                    "write the symbol we would use to check if a number is              than another");
            layout7.getChildren().removeAll(aNumber, aNumber2, intl2, val, eight);
            JFXTextField greaterField = new JFXTextField();
            greaterField.setMinSize(235, 45);
            greaterField.setUnFocusColor(Color.valueOf("#901004"));
            greaterField.setFocusColor(Color.valueOf("#ff1904"));
            greaterField.setLayoutX(395);
            greaterField.setLayoutY(320);
            greaterField.setPromptText("Symbol");
            String greater = ">";
            JFXButton cButton = new JFXButton("Check");
            cButton.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 18");
            cButton.setFont(Font.font("System Bold", 35));
            cButton.setButtonType(RAISED);
            cButton.setLayoutY(400);
            cButton.setLayoutX(middleX);
            cButton.setMinSize(buttonWidth, buttonHeight);
            cButton.setOnAction(event1 -> {
                String greaterAnswer = greaterField.getText().replaceAll("\\s", "");
                if (greaterAnswer.equals(greater)){
                    ImageView confetti3 = new ImageView(new Image(getClass().getResourceAsStream("/images/ParallelGratefulDipper-max-1mb.gif"), 250, 250, true, true));
                    confetti3.setLayoutY(140);
                    confetti3.setLayoutX(325);
                    label7.setText("Correct! Go to the next part!");
                    label7.setFont(Font.font("System Bold", 40));
                    layout7.getChildren().addAll(button7, confetti3);
                    layout7.getChildren().removeAll(greaterField, cButton, backButton3, blueBot, greaterL);
                }else if(!greaterAnswer.equals(greater)){
                    label7.setText("Incorrect. Go back or try again");
                    label7.setFont(Font.font("System Bold", 40));
                    layout7.getChildren().removeAll(greaterL);
                }
            });
            layout7.getChildren().addAll(greaterField, cButton, greaterL);
            layout7.getChildren().removeAll(wrongButton2, wrongButton3, rightButton);
        });
        layout7.getChildren().addAll(label7, wrongButton2, wrongButton3, rightButton, backButton3, blueBot, aNumber, intl2, aNumber2, val, eight);

        //Scene 8 (if statements)
        Pane layout8 = new Pane();
        Scene scene8 = new Scene(layout8, width, height);
        JFXButton button8 = new JFXButton("Next");
        button8.setMinSize(buttonWidth, buttonHeight);
        button8.setFont(Font.font("System Bold", 35));
        button8.setButtonType(RAISED);
        button8.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 18");
        button8.setLayoutX(100);
        button8.setLayoutY(500);
        Label ifFormat = new Label("if(condition met or to be met){code tha executes when or if condition is met}");
        ifFormat.setFont(Font.font("System Bold", 22));
        ifFormat.setStyle("-fx-text-fill: #ff1904");
        ifFormat.setLayoutY(95);
        Label ifExample = new Label("if(it is raining){bring umbrella}.");
        ifExample.setFont(Font.font("System Bold", 22));
        ifExample.setStyle("-fx-text-fill: #ff1904");
        ifExample.setLayoutY(126);
        ifExample.setLayoutX(135);
        Label ifGameExample = new Label("if(health == 10){");
        ifGameExample.setFont(Font.font("System Bold", 22));
        ifGameExample.setStyle("-fx-text-fill: #ff1904");
        ifGameExample.setLayoutY(233);
        Label ifGameExample2 = new Label("   health += 90;");
        ifGameExample2.setFont(Font.font("System Bold", 22));
        ifGameExample2.setStyle("-fx-text-fill: #ff1904");
        ifGameExample2.setLayoutY(256);
        Label ifGameExample3 = new Label("}");
        ifGameExample3.setStyle("-fx-text-fill: #ff1904");
        ifGameExample3.setFont(Font.font("System Bold", 22));
        ifGameExample3.setLayoutY(279);
        Label label8 = new Label("In programming, there are things called conditionals,\n" +
                "which are pieces of code that only execute if a certain condition is met.\n" +
                "The syntax for Java for conditionals, also called 'if statements' goes:\n" +
                "\n" +
                "For example: \n" +
                "If statements are one of the exceptions where the first 'if' line doesn't end with a ';'\n" +
                "but the lines inside the curly brackets do\n" +
                "An actual example of an if statement used in a game would be:\n\n");
        label8.setFont(Font.font("System Bold", 22));
        ImageView ifImage = new ImageView(new Image(getClass().getResourceAsStream("/images/if-statement-syntax.png"), 600, 400, true, true));
        ifImage.setLayoutY(320);
        ifImage.setLayoutX(340);
        layout8.getChildren().addAll(label8, button8, ifFormat, ifExample, ifGameExample, ifGameExample2, ifGameExample3, ifImage);

        //scene 9 if statement quiz
        Pane layout9 = new Pane();
        Scene scene9 = new Scene(layout9, width, height);
        JFXButton button9 = new JFXButton("Next");
        button9.setButtonType(RAISED);
        button9.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 18");
        button9.setFont(Font.font("System Bold", 35));
        button9.setMinSize(buttonWidth, buttonHeight);
        button9.setLayoutY(450);
        button9.setLayoutX(middleX);
        JFXButton noButton = new JFXButton("No");
        noButton.setFont(Font.font("System Bold", 35));
        noButton.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 18");
        noButton.setButtonType(RAISED);
        noButton.setLayoutX(middleX);
        noButton.setLayoutY(300);
        noButton.setMinSize(buttonWidth, buttonHeight);
        JFXButton yesButton = new JFXButton("Yes");
        yesButton.setButtonType(RAISED);
        yesButton.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 18");
        yesButton.setFont(Font.font("System Bold", 35));
        yesButton.setLayoutX(middleX);
        yesButton.setLayoutY(400);
        yesButton.setMinSize(buttonWidth, buttonHeight);
        JFXButton backButton4 = new JFXButton("Back");
        backButton4.setFont(Font.font("System Bold", 35));
        backButton4.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 18");
        backButton4.setButtonType(RAISED);
        backButton4.setMinSize(buttonWidth, buttonHeight);
        backButton4.setLayoutX(middleX);
        backButton4.setLayoutY(500);
        Label ifStatement = new Label("if statement");
        ifStatement.setFont(Font.font("System Bold", 25));
        ifStatement.setStyle("-fx-text-fill: #ff1904");
        ifStatement.setLayoutY(30);
        ifStatement.setLayoutX(398);
        ImageView confusedBot = new ImageView(new Image(getClass().getResourceAsStream("/images/confused.gif"), 150, 450, true, true));
        confusedBot.setLayoutX(50);
        confusedBot.setLayoutY(100);
        Label first = new Label("first");
        first.setFont(Font.font("System Bold", 25));
        first.setStyle("-fx-text-fill: #ff1904");
        first.setLayoutX(241);
        first.setLayoutY(30);
        Label label9 = new Label("To move on to the next part, answer the following correctly.\n" +
                "Does the end of the        line of an                     end in a semicolon(;)?");
        label9.setFont(Font.font("System Bold", 25));
        noButton.setOnAction(event -> {//correct
            layout9.getChildren().removeAll(noButton, yesButton, first);
            Label parentheses = new Label("parentheses ()");
            parentheses.setStyle("-fx-text-fill: #ff1904");
            parentheses.setFont(Font.font("System Bold", 25));
            parentheses.setLayoutX(425);
            label9.setText("Correct! Now, what goes inside the                          of an if statement?\n" +
                    "If you're stuck, you can always go back!");
            JFXButton conditionButton = new JFXButton("The condition that has to be met");
            conditionButton.setButtonType(RAISED);
            conditionButton.setFont(Font.font("System Bold", 22));
            conditionButton.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
            conditionButton.setLayoutY(200);
            conditionButton.setLayoutX(263);
            JFXButton todoButton = new JFXButton("What has to be done when or if condition is met");
            todoButton.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
            todoButton.setFont(Font.font("System Bold", 22));
            todoButton.setButtonType(RAISED);
            todoButton.setLayoutY(300);
            todoButton.setLayoutX(214);
            JFXButton afterButton = new JFXButton("What has to be done after if statement is done");
            afterButton.setButtonType(RAISED);
            afterButton.setFont(Font.font("System Bold", 22));
            afterButton.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
            afterButton.setLayoutY(400);
            afterButton.setLayoutX(218);

            conditionButton.setOnAction(event1 -> {//if correct for what goes in parentheses is pressed
                Label curly = new Label("curly brackets {}?");
                curly.setFont(Font.font("System Bold", 25));
                curly.setStyle("-fx-text-fill: #ff1904");
                curly.setLayoutX(418);
                label9.setText("Correct! Now, what goes inside the");
                layout9.getChildren().removeAll(parentheses, first);
                JFXButton conditionButton1 = new JFXButton("The condition that has to be met");
                conditionButton1.setButtonType(RAISED);
                conditionButton1.setFont(Font.font("System Bold", 22));
                conditionButton1.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
                conditionButton1.setLayoutY(200);
                conditionButton1.setLayoutX(263);
                JFXButton todoButton1 = new JFXButton("What has to be done when or if condition is met");
                todoButton1.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
                todoButton1.setFont(Font.font("System Bold", 22));
                todoButton1.setButtonType(RAISED);
                todoButton1.setLayoutY(300);
                todoButton1.setLayoutX(214);
                JFXButton afterButton1 = new JFXButton("What has to be done after if statement is done");
                afterButton1.setButtonType(RAISED);
                afterButton1.setFont(Font.font("System Bold", 22));
                afterButton1.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
                afterButton1.setLayoutY(400);
                afterButton1.setLayoutX(218);
                layout9.getChildren().removeAll(conditionButton, todoButton, afterButton);
                layout9.getChildren().addAll(conditionButton1, todoButton1, afterButton1, curly);

                conditionButton1.setOnAction(event2 -> {//if wrong button is pressed for in curly brackets
                    label9.setText("Incorrect. Go back or try again");
                    layout9.getChildren().addAll(backButton4);
                    layout9.getChildren().removeAll(curly);
                });
                todoButton1.setOnAction(event2 -> {//if correct button for what goes in curly brackets is pressed
                    ImageView confetti3 = new ImageView(new Image(getClass().getResourceAsStream("/images/200w.gif"), 300, 350, true, true));
                    confetti3.setLayoutY(50);
                    confetti3.setLayoutX(300);
                    label9.setText("Correct again!");
                    label9.setFont(Font.font(45));
                    layout9.getChildren().addAll(button9, confetti3);
                    layout9.getChildren().removeAll(conditionButton1, todoButton1, afterButton1, curly, backButton4, confusedBot);
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
            layout9.getChildren().addAll(conditionButton, todoButton, afterButton, parentheses);
            layout9.getChildren().removeAll(ifStatement);
        });
        yesButton.setOnAction(event -> label9.setText("Incorrect! Go back or try again"));
        layout9.getChildren().addAll(noButton, yesButton, label9, backButton4, ifStatement, confusedBot, first);

        //scene 10, arrays
        Pane layout10 = new Pane();
        Scene scene10 = new Scene(layout10, width, height);
        JFXButton button10 = new JFXButton("Next");
        button10.setMinSize(buttonWidth, buttonHeight);
        button10.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
        button10.setFont(Font.font("System Bold", 35));
        button10.setLayoutX(middleX);
        button10.setLayoutY(550);
        ImageView hatCollection = new ImageView(new Image(getClass().getResourceAsStream("/images/hats-collection.png"), 250, 250, true, true));
        hatCollection.setLayoutX(333);
        hatCollection.setLayoutY(266);
        Label collections = new Label("collections");
        collections.setStyle("-fx-text-fill: #ff1904");
        collections.setFont(Font.font("System Bold", 17));
        collections.setLayoutX(320);
        Label arrays = new Label("Arrays");
        arrays.setStyle("-fx-text-fill: #ff1904");
        arrays.setFont(Font.font("System Bold", 17));
        arrays.setLayoutX(610);
        arrays.setLayoutY(21.3);
        Label arrayLists = new Label("ArrayLists");
        arrayLists.setStyle("-fx-text-fill: #ff1904");
        arrayLists.setFont(Font.font("System Bold", 17));
        arrayLists.setLayoutX(710);
        arrayLists.setLayoutY(21.3);
        Label elements = new Label("Elements.");
        elements.setStyle("-fx-text-fill: #ff1904");
        elements.setFont(Font.font("System Bold", 17));
        elements.setLayoutY(66);
        elements.setLayoutX(262);
        Label defineArray = new Label("variableType[] nameOfArray = {Elements of array};");
        defineArray.setStyle("-fx-text-fill: #ff1904");
        defineArray.setFont(Font.font("System Bold", 17));
        defineArray.setLayoutY(108);
        Label squareBracketsL = new Label("[]");
        squareBracketsL.setStyle("-fx-text-fill: #ff1904");
        squareBracketsL.setFont(Font.font("System Bold", 17));
        squareBracketsL.setLayoutY(130);
        squareBracketsL.setLayoutX(162);
        Label arrayExample = new Label("int[] arrayName = {3, 5, 6, 8, 9, 11};");
        arrayExample.setStyle("-fx-text-fill: #ff1904");
        arrayExample.setFont(Font.font("System Bold", 17));
        arrayExample.setLayoutX(230);
        arrayExample.setLayoutY(153);
        Label printElement = new Label("System.out.println(arrayName[0]);");
        printElement.setStyle("-fx-text-fill: #ff1904");
        printElement.setFont(Font.font("System Bold", 17));
        printElement.setLayoutY(197);
        Label zeroNotOne = new Label("0, not 1.");
        zeroNotOne.setStyle("-fx-text-fill: #ff1904");
        zeroNotOne.setFont(Font.font("System Bold", 17));
        zeroNotOne.setLayoutY(220);
        zeroNotOne.setLayoutX(443);
        Label index = new Label("index(the number assigned to each element)");
        index.setStyle("-fx-text-fill: #ff1904");
        index.setFont(Font.font("System Bold", 17));
        index.setLayoutX(356);
        index.setLayoutY(242);
        Label label10 = new Label("In programming, there are things called                   , which are, well, collections of a thing.\n" +
                "In Java, there are multiple types of collections, but the main ones are called              and \n" +
                "Arrays are containers that hold a fixed number of a single type of variable.\n" +
                "The things in an Array are called\n" +
                "To define an Array:\n" +
                "\n" +
                "the square brackets    is what makes this an Array.\n" +
                "Lets say you have this array:\n" +
                "The array has 6 elements. Lets say you want to display the first element. To do that, you would have to write\n" +
                "                                                           Why?\n" +
                "In programming, unlike real life, we count starting from \n" +
                "So the third element in an Array would be of                                                                             would be 2.");
        label10.setFont(Font.font("System Bold", 17));
        layout10.getChildren().addAll(button10, label10, hatCollection, collections, arrays, arrayLists, elements,
                defineArray, squareBracketsL, arrayExample, printElement, zeroNotOne, index);

        //scene 11 quiz on arrays
        Pane layout11 = new Pane();
        Scene scene11 = new Scene(layout11, width, height);
        JFXButton button11 = new JFXButton("Next");
        button11.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
        button11.setFont(Font.font("System Bold", 27));
        button11.setLayoutY(450);
        button11.setLayoutX(middleX);
        button11.setButtonType(RAISED);
        button11.setMinSize(buttonWidth, buttonHeight);
        JFXButton backButton5 = new JFXButton("Back");
        backButton5.setFont(Font.font("System Bold", 35));
        backButton5.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
        backButton5.setLayoutX(middleX+5);
        backButton5.setLayoutY(550);
        backButton5.setMinSize(buttonWidth, buttonHeight);
        backButton5.setButtonType(RAISED);
        Label hint = new Label("hint: println();");
        hint.setFont(Font.font("System Bold", 27));
        hint.setStyle("-fx-text-fill: #ff1904");
        hint.setLayoutY(140);
        Label arrayQuizArray = new Label("int[] oddNumbers = {1, 3, 5, 7, 9, 11, 13, 15};");
        arrayQuizArray.setStyle("-fx-text-fill: #ff1904");
        arrayQuizArray.setFont(Font.font("System Bold", 27));
        arrayQuizArray.setLayoutY(37);
        Label label11 = new Label("We have this Array:\n" +
                "\n" +
                "in the text field below, write the line to display 7\n" +
                "If you are having trouble, you can always go back");
        label11.setFont(Font.font("System Bold", 27));
        JFXTextField arrayField = new JFXTextField();
        arrayField.setFont(Font.font("System Bold", 21));
        arrayField.setPromptText("Write your answer here");
        arrayField.setFocusColor(Color.valueOf("#ff1904"));
        arrayField.setUnFocusColor(Color.valueOf("#901004"));
        arrayField.setMinSize(400, 50);
        arrayField.setLayoutX(250);
        arrayField.setLayoutY(365);
        JFXButton checkIndexArray = new JFXButton("Check");
        checkIndexArray.setButtonType(RAISED);
        checkIndexArray.setMinSize(136, 70);
        checkIndexArray.setLayoutY(450);
        checkIndexArray.setLayoutX(middleX);
        checkIndexArray.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
        checkIndexArray.setFont(Font.font("System Bold", 35));
        checkIndexArray.setOnAction(event -> {
            String displayElement = arrayField.getText().replaceAll("\\s", "");
            String correctAnswer = "System.out.println(oddNumbers[3]);".replaceAll("\\s", "");
            if (displayElement.equals(correctAnswer)){//if calling index was correct
                layout11.getChildren().removeAll(checkIndexArray, arrayField, hint, arrayField, checkIndexArray, arrayQuizArray);
                label11.setText("Correct! You are on a roll!\n" +
                        "Suppose we want to make an array.\n" +
                        "Which of these goes right next to the variable type?");
                JFXButton squareBrackets = new JFXButton("[]");
                squareBrackets.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
                squareBrackets.setFont(Font.font("System Bold", 27));
                squareBrackets.setLayoutX(425);
                squareBrackets.setLayoutY(250);
                squareBrackets.setButtonType(RAISED);
                JFXButton asterisk = new JFXButton("**");
                asterisk.setLayoutX(425);
                asterisk.setLayoutY(350);
                asterisk.setButtonType(RAISED);
                asterisk.setFont(Font.font("System Bold", 27));
                asterisk.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
                JFXButton forwardSlash = new JFXButton("/ /");
                forwardSlash.setLayoutY(450);
                forwardSlash.setLayoutX(425);
                forwardSlash.setButtonType(RAISED);
                forwardSlash.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
                forwardSlash.setFont(Font.font("System Bold", 27));

                squareBrackets.setOnAction(event1 -> {//if square brackets is pressed(correct)
                    layout11.getChildren().removeAll(squareBrackets, asterisk, forwardSlash);
                    label11.setText("Wow! Correct again!\n" +
                            "Suppose we have an array, where the last \n" +
                            "How many elements does this array have?\n" +
                            "\n");
                    Label QuizHint = new Label("Remember: array indexes start at 0");
                    QuizHint.setStyle("-fx-text-fill: #ff1904");
                    QuizHint.setFont(Font.font("System Bold", 27));
                    QuizHint.setLayoutY(110);
                    Label q = new Label("index(not element) is 5.");
                    q.setStyle("-fx-text-fill: #ff1904");
                    q.setFont(Font.font("System Bold", 27));
                    q.setLayoutX(543);
                    q.setLayoutY(50);
                    JFXButton fiveButton = new JFXButton("5");
                    fiveButton.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
                    fiveButton.setFont(Font.font("System Bold", 27));
                    fiveButton.setLayoutX(425);
                    fiveButton.setLayoutY(250);
                    fiveButton.setButtonType(RAISED);
                    JFXButton fourButton = new JFXButton("4");
                    fourButton.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
                    fourButton.setFont(Font.font("System Bold", 27));
                    fourButton.setLayoutX(425);
                    fourButton.setLayoutY(350);
                    fourButton.setButtonType(RAISED);
                    JFXButton sixButton = new JFXButton("6");
                    sixButton.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
                    sixButton.setFont(Font.font("System Bold", 27));
                    sixButton.setLayoutY(450);
                    sixButton.setLayoutX(425);
                    sixButton.setButtonType(RAISED);
                    layout11.getChildren().addAll(fiveButton, fourButton, sixButton, q, QuizHint);

                    fiveButton.setOnAction(event2 -> {//wrong
                        label11.setText("You are incorrect. Go back or try again");
                        layout11.getChildren().addAll(backButton5);
                    });
                    fourButton.setOnAction(event2 -> {//wrong
                        label11.setText("You are incorrect. Go back or try again");
                        layout11.getChildren().addAll(backButton5);
                    });
                    sixButton.setOnAction(event2 -> {//right
                        ImageView confetti3 = new ImageView(new Image(getClass().getResourceAsStream("/images/confetti-clipart-animated-gif-8.gif"), 250, 250, true, true));
                        confetti3.setLayoutY(100);
                        confetti3.setLayoutX(325);
                        label11.setText("Wow! Right again!");
                        layout11.getChildren().addAll(button11, confetti3);
                        layout11.getChildren().removeAll(fiveButton, sixButton, fourButton, backButton5, q, QuizHint);
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
        layout11.getChildren().addAll(label11, arrayField, checkIndexArray, backButton5, hint, arrayQuizArray);

        //Scene 12 on arraylists
        Pane layout12 = new Pane();
        Scene scene12 = new Scene(layout12, width, height);
        JFXButton button12 = new JFXButton("Next");
        button12.setButtonType(RAISED);
        button12.setFont(Font.font("System Bold", 17));
        button12.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
        button12.setLayoutX(middleX);
        button12.setLayoutY(500);
        button12.setFont(Font.font("System Bold", 35));
        Label arraylists = new Label("arraylists");
        arraylists.setFont(Font.font("System Bold", 16));
        arraylists.setStyle("-fx-text-fill: #ff1904");
        arraylists.setLayoutX(240);
        Label collection2 = new Label("collection.");
        collection2.setFont(Font.font("System Bold", 16));
        collection2.setStyle("-fx-text-fill: #ff1904");
        collection2.setLayoutX(520);
        Label editList = new Label("edit ArrayLists");
        editList.setStyle("-fx-text-fill: #ff1904");
        editList.setLayoutY(20);
        editList.setLayoutX(488);
        editList.setFont(Font.font("System Bold", 16));
        Label addElements = new Label("add elements");
        addElements.setStyle("-fx-text-fill: #ff1904");
        addElements.setLayoutY(20);
        addElements.setLayoutX(632);
        addElements.setFont(Font.font("System Bold", 16));
        Label remElements = new Label("remove elements");
        remElements.setStyle("-fx-text-fill: #ff1904");
        remElements.setLayoutX(15);
        remElements.setLayoutY(40);
        remElements.setFont(Font.font("System Bold", 16));
        Label defineListL = new Label("ArrayList <type> name = new ArrayList<>();");
        defineListL.setStyle("-fx-text-fill: #ff1904");
        defineListL.setFont(Font.font("System Bold", 16));
        defineListL.setLayoutY(80);
        Label type = new Label("type");
        type.setStyle("-fx-text-fill: #ff1904");
        type.setFont(Font.font("System Bold", 16));
        type.setLayoutY(100);
        type.setLayoutX(30);
        Label varType = new Label("variable type");
        varType.setStyle("-fx-text-fill: #ff1904");
        varType.setFont(Font.font("System Bold", 16));
        varType.setLayoutY(100);
        varType.setLayoutX(370);
        Label int2 = new Label("int");
        int2.setStyle("-fx-text-fill: #ff1904");
        int2.setFont(Font.font("System Bold", 16));
        int2.setLayoutX(386);
        int2.setLayoutY(120);
        Label char2 = new Label("char");
        char2.setLayoutX(433);
        char2.setLayoutY(120);
        char2.setStyle("-fx-text-fill: #ff1904");
        char2.setFont(Font.font("System Bold", 17));
        Label listWithType = new Label("ArrayList<Integer>name = new ArrayList<>();");
        listWithType.setStyle("-fx-text-fill: #ff1904");
        listWithType.setFont(Font.font("System Bold", 16));
        listWithType.setLayoutY(160);
        Label Character = new Label("Character");
        Character.setStyle("-fx-text-fill: #ff1904");
        Character.setFont(Font.font("System Bold", 16));
        Character.setLayoutY(180);
        Character.setLayoutX(337);
        Label ourList = new Label("ourList");
        ourList.setStyle("-fx-text-fill: #ff1904");
        ourList.setFont(Font.font("System Bold", 16));
        ourList.setLayoutY(220);
        ourList.setLayoutX(310);
        Label integer = new Label("Integer");
        integer.setStyle("-fx-text-fill: #ff1904");
        integer.setFont(Font.font("System Bold", 16));
        integer.setLayoutY(220);
        integer.setLayoutX(427);
        Label addSyntax = new Label("arrayListName.add(whatever you want to add(depends on the type));");
        addSyntax.setStyle("-fx-text-fill: #ff1904");
        addSyntax.setFont(Font.font("System Bold", 16));
        addSyntax.setLayoutY(200);
        addSyntax.setLayoutX(368.5);
        Label addExample = new Label("ourList.add(5);");
        addExample.setStyle("-fx-text-fill: #ff1904");
        addExample.setFont(Font.font("System Bold", 16));
        addExample.setLayoutY(240);
        Label removeExample = new Label("arrayListName.remove(indexNumber);");
        removeExample.setStyle("-fx-text-fill: #ff1904");
        removeExample.setFont(Font.font("System Bold", 16));
        removeExample.setLayoutY(260);
        removeExample.setLayoutX(173);
        Label printListElement = new Label("System.out.println(name.get(indexOfElement));");
        printListElement.setStyle("-fx-text-fill: #ff1904");
        printListElement.setFont(Font.font("System Bold", 16));
        printListElement.setLayoutY(300);
        printListElement.setLayoutX(425);
        Label label12 = new Label("In Java, there are things called                  . These are another type of \n" +
                "The difference between these and normal arrays, is that you can                         , i.e.\n" +
                "or \n" +
                "To define an arrayList:\n" +
                "\n" +
                "The        that goes in the triangles is basically the \n" +
                "But in arraylists, you cant put the regular types like       or \n" +
                "For example, if we wanted to make an arraylist of type 'int', it would look like this:\n" +
                "\n" +
                "For an arraylist of type char, you would write                   inside the triangles.\n" +
                "To put or add elements to an arraylist, the line is: \n" +
                "For example, if we had an arraylist called              of type             , to add an element to the list, we would do:\n" +
                "                         Which then adds 5 to our list.\n" +
                "To remove an element: \n" +
                "Remember indexes start at 0\n" +
                "To 'print' or display an element of an arraylist, the line is:");
        label12.setFont(Font.font("System Bold", 16));
        layout12.getChildren().addAll(label12, button12, arraylists, collection2, editList, addElements, remElements,
        defineListL, type, varType, int2, char2, listWithType, Character, ourList, integer, addSyntax, addExample, removeExample, printListElement);

        //Scene 13, quiz on arraylists
        Pane layout13 = new Pane();
        Scene scene13 = new Scene(layout13, width, height);
        JFXButton backButton6 = new JFXButton("Back");
        backButton6.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
        backButton6.setFont(Font.font("System Bold", 35));
        backButton6.setMinSize(buttonWidth, buttonHeight);
        backButton6.setLayoutX(middleX);
        backButton6.setLayoutY(500);
        JFXButton button13 = new JFXButton("Next");
        button13.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
        button13.setFont(Font.font("System Bold", 35));
        button13.setMinSize(buttonWidth, buttonHeight);
        button13.setLayoutX(middleX);
        button13.setLayoutY(400);
        Label list = new Label("Arraylist <String> ourList = new ArrayList<>();");
        list.setFont(Font.font("System Bold", 23));
        list.setStyle("-fx-text-fill: #ff1904");
        list.setLayoutY(25);
        list.setLayoutX(230);
        Label hello = new Label("\"Hello\"");
        hello.setStyle("-fx-text-fill: #ff1904");
        hello.setFont(Font.font("System Bold", 23));
        hello.setLayoutX(710);
        hello.setLayoutY(55.5);
        Label label13 = new Label("Time for another quiz! This one will be about the arraylists.\n" +
                "We have this arraylist: \n" +
                "Right now, the arraylist is empty, but we want to add a String that says: \n" +
                "In the text field below, write the line to add this string to the list\n" +
                "Remember, if you are stuck you can always go back.");
        label13.setFont(Font.font("System Bold", 21));
        JFXTextField listAdd = new JFXTextField();
        listAdd.setPromptText("Write your line here");
        listAdd.setPrefWidth(265);
        listAdd.setPrefHeight(45);
        listAdd.setFocusColor(Color.valueOf("#ff1904"));
        listAdd.setUnFocusColor(Color.valueOf("#901004"));
        listAdd.setLayoutY(300);
        listAdd.setLayoutX(317.5);
        listAdd.setFont(Font.font("System Bold", 21));
        String addCorrect = "ourList.add(\"Hello\");".replaceAll("\\s", "");
        JFXButton checkButton1 = new JFXButton("Check");
        checkButton1.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
        checkButton1.setFont(Font.font("System Bold", 35));
        checkButton1.setLayoutX(middleX-5);
        checkButton1.setLayoutY(400);
        checkButton1.setOnAction(event -> {//when check button is pressed
            String addAnswer = listAdd.getText().replaceAll("\\s", "");
            if (addAnswer.equals(addCorrect)){//if adding element is correct
                Label third = new Label("THIRD");
                third.setFont(Font.font("System Bold", 21));
                third.setStyle("-fx-text-fill: #ff1904");
                third.setLayoutX(593);
                third.setLayoutY(55);
                layout13.getChildren().removeAll(listAdd, checkButton1, list, hello);
                label13.setText("Correct! Now that we have an element in the arraylist,\n" +
                        "suppose we added 3 more elements(making a total of 4) to the list.\n" +
                        "In the text fields below, write the line that would display the             element in the list.\n" +
                        "Remember indexes start at 0\n" +
                        "The name of our arraylist is:");
                JFXTextField listCall = new JFXTextField();
                listCall.setFocusColor(Color.valueOf("#ff1904"));
                listCall.setUnFocusColor(Color.valueOf("#901004"));
                listCall.setPrefWidth(245);
                listCall.setPrefHeight(45);
                listCall.setPromptText("Call element here");
                listCall.setLayoutX(327.5);
                listCall.setLayoutY(300);
                String listCallCorrect = "System.out.println(ourList.get(2));";
                Label name = new Label("ourList");
                name.setStyle("-fx-text-fill: #ff1904");
                name.setFont(Font.font("System Bold",21));
                name.setLayoutY(108);
                name.setLayoutX(275);
                JFXButton checkButton2 = new JFXButton("Check");
                checkButton2.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
                checkButton2.setFont(Font.font("System Bold", 35));
                checkButton2.setLayoutY(400);
                checkButton2.setLayoutX(middleX-5);
                layout13.getChildren().addAll(listCall, checkButton2, third, name);
                checkButton2.setOnAction(event1 -> {//if second check button is pressed
                    String listCallAnswer = listCall.getText().replaceAll("\\s", "");
                    if (listCallAnswer.equals(listCallCorrect)){//if calling element from list is correct
                        layout13.getChildren().removeAll(listCall, checkButton2, third, name);
                        label13.setText("You are right again! Which of the symbols below is used to define an arraylist?");
                        JFXButton diamondButton = new JFXButton("<>");
                        diamondButton.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
                        diamondButton.setFont(Font.font("System Bold", 25));
                        diamondButton.setLayoutX(420);
                        diamondButton.setLayoutY(200);
                        JFXButton squareButton = new JFXButton("[]");
                        squareButton.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
                        squareButton.setFont(Font.font("System Bold", 25));
                        squareButton.setLayoutY(300);
                        squareButton.setLayoutX(425);
                        JFXButton slashButton = new JFXButton("//");
                        slashButton.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
                        slashButton.setFont(Font.font("System Bold", 25));
                        slashButton.setLayoutX(425);
                        slashButton.setLayoutY(400);
                        diamondButton.setOnAction(event2 -> {//if diamond button is pressed(correct)
                            Label alist = new Label("arraylist");
                            alist.setStyle("-fx-text-fill: #ff1904");
                            alist.setLayoutX(335);
                            alist.setLayoutY(27);
                            alist.setFont(Font.font("System Bold", 21));
                            Label name2 = new Label("intList");
                            name2.setStyle("-fx-text-fill: #ff1904");
                            name2.setFont(Font.font("System Bold", 21));
                            name2.setLayoutY(27);
                            name2.setLayoutX(500);
                            Label numero = new Label("integer");
                            numero.setStyle("-fx-text-fill: #ff1904");
                            numero.setFont(Font.font("System Bold", 21));
                            numero.setLayoutY(27);
                            numero.setLayoutX(640);
                            label13.setText("Home Run!\n" +
                                    "Now, in the field below, define an                named            of type");
                            layout13.getChildren().removeAll(squareButton, diamondButton, slashButton);
                            JFXTextField defineList = new JFXTextField();
                            defineList.setPromptText("Define your list here");
                            defineList.setFocusColor(Color.valueOf("#ff1904"));
                            defineList.setUnFocusColor(Color.valueOf("#901004"));
                            defineList.setFont(Font.font("System Bold", 19));
                            defineList.setPrefWidth(450);
                            defineList.setLayoutY(300);
                            defineList.setLayoutX(225);
                            JFXButton checkButton3 = new JFXButton("Check");
                            checkButton3.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
                            checkButton3.setFont(Font.font("System Bold", 35));
                            checkButton3.setMinSize(buttonWidth, buttonHeight);
                            checkButton3.setLayoutY(400);
                            checkButton3.setLayoutX(middleX);
                            String defineListCorrect = "ArrayList <Integer> intList = new ArrayList<>();".replaceAll("\\s", "");
                            checkButton3.setOnAction(event3 -> {//if check button 3 is pressed
                            String defineAnswer = defineList.getText().replaceAll("\\s", "");
                                if(defineAnswer.equals(defineListCorrect)){//if defining arraylist is correct
                                    layout13.getChildren().removeAll(checkButton3, defineList, numero, name2, alist);
                                    label13.setText("You have correctly defined an ArrayList! You move on the the last part!");
                                    ImageView confett = new ImageView(new Image(getClass().getResourceAsStream("/images/confetti-cannon-gif-karla.gif"), 450, 450, true, true));
                                    ImageView confett2 = new ImageView(new Image(getClass().getResourceAsStream("/images/confetti-cannon-gif-karla.gif"), 450, 450, true, true));
                                    confett.setLayoutX(450);
                                    confett.setLayoutY(30);
                                    confett2.setLayoutY(30);
                                    confett2.setLayoutX(10);
                                    confett2.setScaleX(-1);
                                    layout13.getChildren().addAll(button13, confett, confett2);
                                }else if(!defineAnswer.equals(defineListCorrect)){//if defining arraylist is incorrect
                                    label13.setText("Incorrect. Try again");

                                }else if(defineAnswer.equals("")){//if defining arraylist is incorrect
                                    label13.setText("Your answer is empty. Write your answer in the textfield.");
                                }
                            });
                            layout13.getChildren().addAll(defineList, checkButton3, numero, name2, alist);
                        });
                        squareButton.setOnAction(event2 -> {//if square brackets button is pressed(incorrect)
                            label13.setText("Incorrect. Remember, this is to define an array. Try again");
                        });
                        slashButton.setOnAction(event2 -> {//if slash button is pressed(incorrect)
                            label13.setText("Incorrect. Try again.");

                        });
                        layout13.getChildren().addAll(diamondButton, squareButton, slashButton);
                    }else if(!listCallAnswer.equals(listCallCorrect)){//if calling element from list is incorrect
                        label13.setText("Incorrect. Go back or try again");
                        layout13.getChildren().removeAll(name, third);
                    }else if(listCallAnswer.equals("")){//if calling element from list is empty
                        label13.setText("Your answer is empty, enter your answer in the textfield.");
                    }
                });
            }else if(!addAnswer.equals(addCorrect)){//if adding element is incorrect
                label13.setText("Incorrect. Go back or Try again");
            }else if(addAnswer.equals("")){//if adding element is incorrect
                label13.setText("The text field is empty, enter your answer before pressing check");
            }
        });
        layout13.getChildren().addAll(label13, backButton6, listAdd, checkButton1, list, hello);

        //Scene 14 for loop
        Pane layout14 = new Pane();
        Scene scene14 = new Scene(layout14, width, height);
        Label label14 = new Label();
        Button button14 = new Button("Next");
        button14.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
        button14.setMinSize(buttonWidth, buttonHeight);
        button14.setFont(Font.font("System Bold", 35));
        button14.setLayoutX(middleX);
        button14.setLayoutY(500);
        Label loop = new Label("loop");
        loop.setFont(Font.font("System Bold", 17));
        loop.setStyle("-fx-text-fill: #ff1904");
        loop.setLayoutX(370);
        Label over = new Label("over and over");
        over.setFont(Font.font("System Bold", 17));
        over.setStyle("-fx-text-fill: #ff1904");
        over.setLayoutX(308);
        over.setLayoutY(22);
        Label forLoop = new Label("for loop");
        forLoop.setFont(Font.font("System Bold", 17));
        forLoop.setStyle("-fx-text-fill: #ff1904");
        forLoop.setLayoutX(100);
        forLoop.setLayoutY(66);
        Label forLoopSyntax1 = new Label("for(initialization, condition, increment/decrement){(notice how there's no semicolon here like in 'if statements'");
        forLoopSyntax1.setFont(Font.font("System Bold", 17));
        forLoopSyntax1.setStyle("-fx-text-fill: #ff1904");
        forLoopSyntax1.setLayoutY(102);
        Label forLoopSyntax2 = new Label("     something to do");
        forLoopSyntax2.setFont(Font.font("System Bold", 17));
        forLoopSyntax2.setStyle("-fx-text-fill: #ff1904");
        forLoopSyntax2.setLayoutY(126);
        Label forLoopSyntax3 = new Label("}");
        forLoopSyntax3.setFont(Font.font("System Bold", 17));
        forLoopSyntax3.setStyle("-fx-text-fill: #ff1904");
        forLoopSyntax3.setLayoutY(148);
        Label arrayForLoop = new Label("int[] ourArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};");
        arrayForLoop.setFont(Font.font("System Bold", 17));
        arrayForLoop.setStyle("-fx-text-fill: #ff1904");
        arrayForLoop.setLayoutY(198);
        arrayForLoop.setLayoutX(443);
        Label printArray1 = new Label("for(int i = 0; i<ourArray.length; i++){");
        printArray1.setFont(Font.font("System Bold", 17));
        printArray1.setStyle("-fx-text-fill: #ff1904");
        printArray1.setLayoutY(244);
        Label printArray2 = new Label("    System.out.println(ourArray[i]);");
        printArray2.setFont(Font.font("System Bold", 17));
        printArray2.setStyle("-fx-text-fill: #ff1904");
        printArray2.setLayoutY(272);
        Label printArray3 = new Label("}");
        printArray3.setFont(Font.font("System Bold", 17));
        printArray3.setStyle("-fx-text-fill: #ff1904");
        printArray3.setLayoutY(292);
        Label iL = new Label("i");
        iL.setFont(Font.font("System Bold", 17));
        iL.setStyle("-fx-text-fill: #ff1904");
        iL.setLayoutY(308);
        iL.setLayoutX(408);
        Label plusPlus = new Label("++");
        plusPlus.setFont(Font.font("System Bold", 17));
        plusPlus.setStyle("-fx-text-fill: #ff1904");
        plusPlus.setLayoutY(350);
        plusPlus.setLayoutX(600);
        Label ex = new Label("index 1, 2, 3...");
        ex.setFont(Font.font("System Bold", 17));
        ex.setStyle("-fx-text-fill: #ff1904");
        ex.setLayoutY(397);
        ex.setLayoutX(325);
        label14.setText("In programming, a very important concept is a \n" +
                "Loops are pieces of code that execute                        again until a certain condition is met.\n" +
                "In Java, there are many types of loops, but we will only be looking at 2.\n" +
                "The first is a             , a loop that repeats itself a certain number of times.\n" +
                "The syntax for a For Loop is:\n" +
                "\n" +
                "\n" +
                "\n" +
                "These loops are mostly used for displaying multiple elements of an array or an arraylist.\n" +
                "Lets say we have an array of integers with 10 elements, \n" +
                "The most common way to print these elements out would be:\n" +
                "\n" +
                "\n" +
                "\n" +
                "The first part of this loop creates a variable named   and makes it equal to 0.\n" +
                "The second part says do this while 'i' is smaller than the length of our array\n" +
                "The third part of this increments 'i' by 1 each time the code loops over. The       will increase a variable by 1.\n" +
                "Inside the parentheses we are displaying or printing the elements of index 'i',\n" +
                "which means it will print the elements of ");
        label14.setFont(Font.font("System Bold", 17));
        layout14.getChildren().addAll(label14, button14, loop, over, forLoop, forLoopSyntax1, forLoopSyntax2, forLoopSyntax3,
        arrayForLoop, printArray1, printArray2, printArray3, iL, plusPlus, ex);

        //Scene 15 while loops
        Pane layout15 = new Pane();
        Scene scene15 = new Scene(layout15, width, height);
        Label label15 = new Label();
        JFXButton button15 = new JFXButton("Next");
        button15.setFont(Font.font("System Bold", 35));
        button15.setButtonType(RAISED);
        button15.setMinSize(buttonWidth, buttonHeight);
        button15.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
        button15.setLayoutX(middleX);
        button15.setLayoutY(400);
        JFXButton backButton7 = new JFXButton("Back");
        backButton7.setFont(Font.font("System Bold", 35));
        backButton7.setButtonType(RAISED);
        backButton7.setMinSize(buttonWidth, buttonHeight);
        backButton7.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
        backButton7.setLayoutY(500);
        backButton7.setLayoutX(middleX);

        Label whileLoop = new Label("while loop");
        whileLoop.setFont(Font.font("System Bold", 20));
        whileLoop.setStyle("-fx-text-fill: #ff1904");
        whileLoop.setLayoutY(100);
        Label declaration = new Label("int num = 10;");
        declaration.setFont(Font.font("System Bold", 20));
        declaration.setStyle("-fx-text-fill: #ff1904");
        declaration.setLayoutY(120);
        Label whileExample = new Label("while(num<20){");
        whileExample.setFont(Font.font("System Bold", 20));
        whileExample.setStyle("-fx-text-fill: #ff1904");
        whileExample.setLayoutY(140);
        Label whileExample2 = new Label("   System.out.println(num);");
        whileExample2.setFont(Font.font("System Bold", 20));
        whileExample2.setStyle("-fx-text-fill: #ff1904");
        whileExample2.setLayoutY(160);
        Label whileExample3 = new Label("   num++;");
        whileExample3.setFont(Font.font("System Bold", 20));
        whileExample3.setStyle("-fx-text-fill: #ff1904");
        whileExample3.setLayoutY(180);
        Label whileExample4 = new Label("}");
        whileExample4.setFont(Font.font("System Bold", 20));
        whileExample4.setStyle("-fx-text-fill: #ff1904");
        whileExample4.setLayoutY(200);
        Label trueOrFalse = new Label("true or false");
        trueOrFalse.setFont(Font.font("System Bold", 20));
        trueOrFalse.setStyle("-fx-text-fill: #ff1904");
        trueOrFalse.setLayoutY(26);
        trueOrFalse.setLayoutX(763);
        Label not = new Label("NOT");
        not.setFont(Font.font("System Bold", 20));
        not.setStyle("-fx-text-fill: #ff1904");
        not.setLayoutY(52);
        not.setLayoutX(222);
        label15.setText("The second type and one of the most common type of loop is a 'while loop'\n" +
                "This loop is as simple as it seems, a loop that does something while something is \n" +
                "Keep in mind, this does         mean only booleans work in while loops.\n" +
                "an example of a while loop could be:\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "This basically says that while our number that is equal to 10 is smaller than 20,\n" +
                "print out our number and increment it by 1.\n" +
                "These are the basics of loops, a very important concept in programming");
        label15.setFont(Font.font("System Bold", 20));
        layout15.getChildren().addAll(button15, label15, backButton7, whileLoop, declaration, whileExample, whileExample2, whileExample3, whileExample4, not, trueOrFalse);

        //Scene 16 quiz on loops
        Pane layout16 = new Pane();
        Scene scene16 = new Scene(layout16, width, height);
        Label label16 = new Label();
        JFXButton trueButton = new JFXButton("True");
        trueButton.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
        trueButton.setFont(Font.font("System Bold", 35));
        trueButton.setButtonType(RAISED);
        trueButton.setMinSize(buttonWidth, buttonHeight);
        trueButton.setLayoutY(350);
        trueButton.setLayoutX(middleX);
        JFXButton falseButton = new JFXButton("False");
        falseButton.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
        falseButton.setFont(Font.font("System Bold", 35));
        falseButton.setButtonType(RAISED);
        falseButton.setMinSize(buttonWidth, buttonHeight);
        falseButton.setLayoutY(450);
        falseButton.setLayoutX(middleX);
        JFXButton backButton8 = new JFXButton("Back");
        backButton8.setButtonType(RAISED);
        backButton8.setMinSize(buttonWidth, buttonHeight);
        backButton8.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
        backButton8.setFont(Font.font("System Bold", 35));
        backButton8.setLayoutX(middleX);
        backButton8.setLayoutY(550);
        JFXButton chButton = new JFXButton("Check");
        chButton.setButtonType(RAISED);
        chButton.setFont(Font.font("System Bold", 35));
        chButton.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
        chButton.setMinSize(buttonWidth, buttonHeight);
        chButton.setLayoutY(450);
        chButton.setLayoutX(middleX);
        String loopCorrect = "FOR LOOP".replaceAll("\\s", "");
        JFXButton button16 = new JFXButton("Next");
        button16.setButtonType(RAISED);
        button16.setMinSize(buttonWidth, buttonHeight);
        button16.setStyle("-fx-background-color: #0270ee; -fx-text-fill: white; -fx-background-radius: 17");
        button16.setFont(Font.font("System Bold", 35));
        button16.setLayoutY(350);
        button16.setLayoutX(middleX);
        Label FOR = new Label("FOR");
        FOR.setFont(Font.font("System Bold", 24));
        FOR.setStyle("-fx-text-fill: #ff1904");
        FOR.setLayoutX(150);
        FOR.setLayoutY(28);
        label16.setText("Time for another quiz! This one is about loops.\n" +
                "True or False: A       loop does something while something is true or false");
        label16.setFont(Font.font("System Bold", 24));
        trueButton.setOnAction(event -> {//wrong to true or false
            label16.setText("Incorrect. Go back or try again");
        });
        falseButton.setOnAction(event -> {//right to true or false
            layout16.getChildren().removeAll(falseButton, trueButton, FOR);
            label16.setText("Correct! Earlier, we had an array and we used a loop to print out each element of the array.\n" +
                    "What type of loop was it? Type your answer in the text field");
            label16.setFont(Font.font(21));
            JFXTextField loopField = new JFXTextField();
            loopField.setPrefWidth(225);
            loopField.setPrefHeight(45);
            loopField.setPromptText("Type of loop(include 'loop')");
            //todo: make this scene look good, more gifs and images, sound
            chButton.setOnAction(event1 -> {
                String loopAnswer = loopField.getText().toUpperCase().replaceAll("\\s", "");
                if (loopAnswer.equals(loopCorrect)){//if they said for loop
                    label16.setText("Correct! Which of these is correct to the next question?\n" +
                            "What is a loop");
                    Button wrongButton1 = new Button("A statement that only executes mathematical computations");
                    Button wrongButton4 = new Button("A statement that only executes if a condition is met");
                    Button rightButton1 = new Button("A statement that repeats itself over and over again");
                    wrongButton1.setOnAction(event2 -> {//if wrong button is pressed(loops)
                        label16.setText("Wrong. Go back or try again");
                    });
                    wrongButton4.setOnAction(event2 -> {//if other wrong button is pressed(loops)
                        label16.setText("Wrong. Go back or try again");
                    });
                    rightButton1.setOnAction(event2 -> {//if right button is pressed(loops)
                        label16.setText("Correct!");
                        layout16.getChildren().removeAll(wrongButton1, wrongButton4, rightButton1);
                        layout16.getChildren().addAll(button16);
                    });

                    layout16.getChildren().addAll(wrongButton1, wrongButton4, rightButton1);
                }else if(!loopAnswer.equals(loopCorrect)){//if they didn't say for loop
                    label16.setText("Incorrect. Try again");
                }else if(loopAnswer.equals("")){//if answer is empty
                    label16.setText("Your answer was empty. Enter your answer in the text field");
                }
            });
            layout16.getChildren().addAll(loopField, chButton);
        });
        layout16.getChildren().addAll(trueButton, falseButton, label16, backButton8, FOR);

        //Scene 17 goodbye
        Pane layout17 = new Pane();
        Scene scene17 = new Scene(layout17, width, height);
        Label label17 = new Label();
        label17.setText("Well, you know know the basics of Java! Congratulations!\n" +
                "Programming is not an easy thing to do, Hopefully this gave you an idea of what its like.\n" +
                "We hope you enjoyed this or found it helpful.\n" +
                "Thank you for downloading and using this game.\n" +
                "See you next time!");

        //all next/back button actions
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
        backButton6.setOnAction(event -> primaryStage.setScene(scene12));//goes back to scene on arraylists
        button13.setOnAction(event -> primaryStage.setScene(scene14));//goes to scene on for loops
        button14.setOnAction(event -> primaryStage.setScene(scene15));//goes to scene on while loops
        button15.setOnAction(event -> primaryStage.setScene(scene16));//goes to quiz on loops
        backButton7.setOnAction(event -> primaryStage.setScene(scene14));//goes back to for loops
        backButton8.setOnAction(event -> primaryStage.setScene(scene15));//goes back to scene on while loops
        button16.setOnAction(event -> primaryStage.setScene(scene17));//goes to goodbye scene

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
