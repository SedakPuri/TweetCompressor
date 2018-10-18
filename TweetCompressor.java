import java.util.Scanner;
import java.util.Random;

public class TweetCompressor {

	public static void main(String[] args) {
		//Creating Objects
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();
		
		//User Input
		System.out.println("Enter the tweet you want to shorten");
		String tweet = keyboard.nextLine();
		keyboard.close();
		
		while(tweet.length() > 280)
		{
			int currentChar = rng.nextInt(tweet.length());
			tweet = tweet.substring(0, currentChar) + tweet.substring(currentChar + 1, tweet.length());
		}
		
		// Output
		System.out.println("Shortened tweet: " + tweet);
	}
}
