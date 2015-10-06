package examples.example1;

import domain.Role;
import domain.User;

import java.util.Optional;

import static java.lang.System.out;


public class OptionalDemo {
	
	public static Optional<User> getUserById(int id) {
		if (id == 1) {
			return Optional.of(new User("admin", Role.Admin));
		} else {
			return Optional.empty();
		}
	}
	
	public static void main(String[] args) {
		Optional<User> optUser1 = getUserById(1);
		Optional<User> optUser2 = getUserById(2);
		
		optUser1.map(u -> u.getLogin()).ifPresent(out::println);
		optUser2.map(u -> u.getLogin()).ifPresent(out::println);
	}
}
