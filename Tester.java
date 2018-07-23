package com.siri.facebook;

import java.util.*;

public class Tester {
	public static void main(String[] args) {
		Reader readfile = new Reader();
		try {
			List<String> content = readfile.readTheFile("C:\\Users\\bhara\\Desktop", "test1.csv");
			List<Fbuser> userList = new ArrayList<Fbuser>();
			boolean first = true;
			for (String line : content) {
				if (first) {
					first = false;
				} else {
					Fbuser user1 = new Fbuser();
					String[] split = line.split(",");

					user1.setFBID(Integer.parseInt(split[0]));
					user1.setFBemail(split[1]);
					user1.setFBpassword(split[2]);
					user1.setFname(split[3]);
					user1.setLname(split[4]);
					user1.setAddress1(split[5]);
					user1.setAddress2(split[6]);
					user1.setCity(split[7]);
					user1.setState(split[8]);
					user1.setZip(Integer.parseInt(split[9]));
					user1.setLikecount(Integer.parseInt(split[10]));
					user1.setSharecount(Integer.parseInt(split[11]));
					userList.add(user1);

				}

			}

			userList.forEach(item -> System.out.println(item));

			System.out.println("Sorting by number of Likes: \n ");
			Collections.sort(userList);
			userList.forEach(item -> System.out.println(item));

			Sharecompare s1 = new Sharecompare();
			System.out.println("sorting by number of shares  :  \n ");
			Collections.sort(userList, s1);
			userList.forEach(item -> System.out.println(item));

			Long t = userList.stream().map(Fbuser -> Fbuser.getState()).filter(Fbuser -> Fbuser.startsWith("T"))
					.count();
			System.out.println("number of users in Texas :" + t);

			Long n = userList.stream().map(Fbuser -> Fbuser.getState()).filter(Fbuser -> Fbuser.startsWith("N"))
					.count();
			System.out.println("number of users in Newjersey :" + n);

			Long l = userList.stream().map(Fbuser -> Fbuser.getState()).filter(Fbuser -> Fbuser.startsWith("L"))
					.count();
			System.out.println("number of users in Lousiana :" + l);

			Long m = userList.stream().map(Fbuser -> Fbuser.getState()).filter(Fbuser -> Fbuser.startsWith("M"))
					.count();
			System.out.println("number of users in Maine :" + m);

			Long city1 = userList.stream().map(Fbuser -> Fbuser.getCity()).filter(Fbuser -> Fbuser.endsWith("1"))
					.count();
			System.out.println("number of users in city1 :" + city1);

			Long city2 = userList.stream().map(Fbuser -> Fbuser.getCity()).filter(Fbuser -> Fbuser.endsWith("2"))
					.count();
			System.out.println("number of users in city2 :" + city2);

			Long city3 = userList.stream().map(Fbuser -> Fbuser.getCity()).filter(Fbuser -> Fbuser.endsWith("3"))
					.count();
			System.out.println("number of users in city3 :" + city3);

			Long city4 = userList.stream().map(Fbuser -> Fbuser.getCity()).filter(Fbuser -> Fbuser.endsWith("4"))
					.count();
			System.out.println("number of users in city4 :" + city4);

			Long city5 = userList.stream().map(Fbuser -> Fbuser.getCity()).filter(Fbuser -> Fbuser.endsWith("5"))
					.count();
			System.out.println("number of users in city5 :" + city5);

			Long city6 = userList.stream().map(Fbuser -> Fbuser.getCity()).filter(Fbuser -> Fbuser.endsWith("6"))
					.count();
			System.out.println("number of users in city6 :" + city6);

			Long city7 = userList.stream().map(Fbuser -> Fbuser.getCity()).filter(Fbuser -> Fbuser.endsWith("7"))
					.count();
			System.out.println("number of users in city7 :" + city7);

			Long city8 = userList.stream().map(Fbuser -> Fbuser.getCity()).filter(Fbuser -> Fbuser.endsWith("8"))
					.count();
			System.out.println("number of users in city8 :" + city8);

			System.out.println("users by Newjersey state  : \n ");
			userList.stream().filter(Fbuser -> Fbuser.getState().startsWith("N"))
					.forEach(item -> System.out.println(item));
			System.out.println("users by Texas state  : \n ");
			userList.stream().filter(Fbuser -> Fbuser.getState().startsWith("T"))
					.forEach(item -> System.out.println(item));
			System.out.println("users by Lousiana state  : \n ");
			userList.stream().filter(Fbuser -> Fbuser.getState().startsWith("L"))
					.forEach(item -> System.out.println(item));
			System.out.println("users by Maine state  : \n ");
			userList.stream().filter(Fbuser -> Fbuser.getState().startsWith("M"))
					.forEach(item -> System.out.println(item));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Integer convertToInt(String input) {
		if (input != null) {
			input = input.trim();
		}
		return Integer.parseInt(input);
	}
}
