package pl.wojcik.jakub.spring_tutorial;

import pl.wojcik.jakub.spring_tutorial.api.Logger;
import pl.wojcik.jakub.spring_tutorial.api.UsersRepository;
import pl.wojcik.jakub.spring_tutorial.domain.User;
import pl.wojcik.jakub.spring_tutorial.implementations.LoggerImpl;
import pl.wojcik.jakub.spring_tutorial.implementations.UsersRepositoryImpl;

public class Main {

	public static void main(String[] args) {
		Logger logger = new LoggerImpl();
		UsersRepository usersRepository = new UsersRepositoryImpl();
		usersRepository.setLogger(logger);
		
		User user = usersRepository.createUser("Kuba");

	}

}
