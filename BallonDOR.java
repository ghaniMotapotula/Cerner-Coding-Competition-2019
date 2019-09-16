
//cerner_2^5_2019
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BallonDOR {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Map<Integer, String> stats = new HashMap<>();
		List<Integer> noTropiesList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
			System.out.println("Name of the player" + i);
			String player1 = in.nextLine();
			System.out.println("No of tropies won in 2018/2019");
			int noTropies = in.nextInt();
			in.nextLine();
			noTropiesList.add(noTropies);
			stats.put(noTropies, player1);

		}
        in.close();
		System.out.println("2019 Ballon d or goes to " + stats.get(Collections.max(noTropiesList)).toUpperCase());
	}

}
