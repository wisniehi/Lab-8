import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

Public clas GuessingGame implements Action listener {
  JLabel enterGuess, tooHigh, tooLow, lastGuess;
  JTextField typeGuess;

  int num;
  Random numb = new Random();
  int randomInt = r.nextInt
  int guess = Integer.parseInt(userGuess.getText());

  GuessingGame() {
    	JFrame frame = new JFrame("The Guessing Game!");
	frame.setLayout(new FlowLayout());
	frame.setSize(240,120);

  JButton guessButton = new JButton("Guess");
	JButton playAgainButton = new JButton("Guess Again!");
  guess.addActionListener(this);
  frame.add(guess);
  frame.setVisible(true);

  Random numb = new Random();
  int numb = r.nextInt(99)+1;

  JTextField typeGuess = new JTextField;
  typeGuess.setSize(10);

  }
  public void actionPerformed(ActionEvent ae){
  if (ae.getActionCommand().equals("Guess"));{
    enterGuess.setText("Guess Entered" +);
    
  }
  else if 
    (ae.getActionCommand(). equals("playAgain")){
      lastGuess.setTime("Last Guess until play again!" +);
    }
    else{

    }
    }
  }





