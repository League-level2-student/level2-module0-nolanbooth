package arrays;

import java.util.Random;
import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Random rand = new Random();
		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		int[] turns = new int[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot("batman");
			 robots[i].miniaturize();
			robots[i].setX((i * 150) + 150);
			robots[i].setY(500);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.

		for (int i = 0; i < robots.length; i++) {
			robots[i].setSpeed(50);
		}

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		int i = 0;
		boolean atTheTop = false;
		while (atTheTop == false) {

			for (i = 0; i < robots.length; i++) {
				robots[i].move(1);
				robots[i].turn(1);
				turns[i] += 1;
				if (robots[i].getY() <= 0) {
					atTheTop = true;
					System.out.println("At the top!!");
					System.out.println("Robot " + (i + 1) + " is the winner!");

				}

				if (atTheTop == true) {
					i = 5;
				}
			}
		}
		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.
//ok I did
		/* 9. make the robots race around a circular track.
		 * 
		 *  Hello, my name is nolan, a student in level 2, and I am bored. I know I should be trying to fix a problem, but I don't feel like it. 
		Maybe i will write random things here. I have been doing a lot of nitro type lately, and it is fun to type random words at a decently high speed, without anything annoying correcting me. 
		I think arrays are interesting and a little bit confusing, because I am new to them. Maybe in the future I will come back and read this. Or maybe I will be a master coder in the future and
		shake my head about how stupid I was to not understand arrays. Maybe I will be like Mr Mike Johnson next door, teaching a bunch of kids the basics of java coding. why does java  correct
		move into micromove? it doesn't make any sense and I don't know how to use it, and I don't think anyone really ever uses it. Also just for your information, future me, in this time I still
		had migraines and currently I am worried I might get one. I hope that you don't have migraines anymore, and that dad doesn't have them either. They are really annoying. My last migraine was
		15 days ago, right after I changed for PE, which was my first period. two weeks before that, I had another migraine right after history (period 3, PE is period 1, in case you forgot), and I 
		had to get a covid test. Anyways, I should get back to coding. The bats move so slowly around the circle, it is very boring. I think I completed the assignment.
		
		*/
	}
}
