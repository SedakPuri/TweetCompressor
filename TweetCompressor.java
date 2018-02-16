import java.util.Scanner;
import java.util.Random;
import java.lang.String;

public class TweetCompressor {

	public static void main(String[] args) {
		//Creating Objects
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();
		
		//User Input
		System.out.println("Enter the tweet you want to shorten");
		String tweet = keyboard.nextLine();
		keyboard.close();
		
		//Output
		System.out.println("Shortened tweet: ");
		
		if (tweet.length() > 140) {
			int lengthOver = tweet.length() - 140;
			for (int i = 1; i < lengthOver + 1; i++) {
				int value = randomNumber.nextInt(27);
				if (value > 0 && value <= 1) {
					tweet.replaceAll("a", " ");
						if (i == lengthOver) {
							System.out.println(tweet);
							break;
						}
				} else if (value > 1 && value <= 2) {
					tweet.replaceAll("b", " ");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				} else if (value > 2 && value <= 3) {
					tweet.replaceAll("c", " ");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				} else if (value > 3 && value <= 4) {
					tweet.replaceAll("d", " ");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				} else if (value > 4 && value <= 5) {
					tweet.replaceAll("e", " ");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				} else if (value > 5 && value <= 6) {
					tweet.replaceAll("f", " ");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				} else if (value > 6 && value <= 7) {
					tweet.replaceAll("g", "");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				} else if (value > 7 && value <= 8) {
					tweet.replaceAll("h", "");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				} else if (value > 8 && value <= 9) {
					tweet.replaceAll("i", "");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				} else if (value > 9 && value <= 10) {
					tweet.replaceAll("j", "");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				} else if (value > 10 && value <= 11) {
					tweet.replaceAll("k", "");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				} else if (value > 11 && value <= 12) {
					tweet.replaceAll("l", "");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				} else if (value > 12 && value <= 13) {
					tweet.replaceAll("m", "");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				} else if (value > 13 && value <= 14) {
					tweet.replaceAll("n", "");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				} else if (value > 14 && value <= 15) {
					tweet.replaceAll("o", "");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				} else if (value > 15 && value <= 16) {
					tweet.replaceAll("p", "");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				} else if (value > 16 && value <= 17) {
					tweet.replaceAll("q", "");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				} else if (value > 17 && value <= 18) {
					tweet.replaceAll("r", "");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				} else if (value > 18 && value <= 19) {
					tweet.replaceAll("s", "");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				} else if (value > 19 && value <= 20) {
					tweet.replaceAll("t", "");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				} else if (value > 20 && value <= 21) {
					tweet.replaceAll("u", "");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				} else if (value > 21 && value <= 22) {
					tweet.replaceAll("v", "");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				} else if (value > 22 && value <= 23) {
					tweet.replaceAll("w", "");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				} else if (value > 23 && value <= 24) {
					tweet.replaceAll("x", "");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				} else if (value > 24 && value <= 25) {
					tweet.replaceAll("y", "");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				} else if (value > 25 && value <= 26) {
					tweet.replaceAll("z", "");
					if (i == lengthOver) {
						System.out.println(tweet);
						break;
					}
				}
			}
		} else {
			System.out.println(tweet);
		}
	}
}
