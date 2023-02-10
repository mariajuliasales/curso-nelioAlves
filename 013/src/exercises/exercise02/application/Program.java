package exercises.exercise02.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import exercises.exercise02.entities.Comment;
import exercises.exercise02.entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand",
				"I'm going to visit this wonderful country!", 12);

		Comment comment01 = new Comment("Have a nice trip");
		Comment comment02 = new Comment("Wow that's awesome!");
		p1.addComment(comment01);
		p1.addComment(comment02);

		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow!", 5);
		Comment comment03 = new Comment("Good night");
		Comment comment04 = new Comment("May the Force be with you");
		p2.addComment(comment03);
		p2.addComment(comment04);

		System.out.println(p1);
		System.out.println();
		System.out.println(p2);
	}

}
