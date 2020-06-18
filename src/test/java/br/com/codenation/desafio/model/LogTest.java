package br.com.codenation.desafio.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class LogTest {
	
	private static Validator validator;
	
	@BeforeAll
	public static void setUp() {
	    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	    validator = factory.getValidator();
	}

	@Test
	public void logIsNotValid() {
		Log log = Log.builder()
				.build();
<<<<<<< Updated upstream:src/test/java/br/com/codenation/desafio/model/LogsTest.java

=======
		
>>>>>>> Stashed changes:src/test/java/br/com/codenation/desafio/model/LogTest.java
        Set<ConstraintViolation<Log>> constraintViolations = validator
        		.validate(log);

        assertEquals(5, constraintViolations.size());
	}
	
	@Test
	public void logTitleIsNotValid() {
		User user = User.builder()
				.email("jonh.doe@gmail.com")
				.nome("Jonh Doe")
				.password("123456")
				.build();
				
		Log log = Log.builder()
<<<<<<< Updated upstream:src/test/java/br/com/codenation/desafio/model/LogsTest.java
				.title("s")
				.lastOccurrence(LocalDateTime.now())
				.origin("service api 127.0.0.1:8080")
				.description("NullPointer Exception")
=======
				.title("t")
				.description("description description")
				.datetime(LocalDateTime.now())
				.environment(Environment.TEST)
				.source("source error: service api 127.0.0.1:8080")
				.level(Level.DEBUG)
>>>>>>> Stashed changes:src/test/java/br/com/codenation/desafio/model/LogTest.java
				.user(user)
				.build();
		
        Set<ConstraintViolation<Log>> constraintViolations = validator
        		.validate(log);
        
        assertEquals(1, constraintViolations.size());
	}
<<<<<<< Updated upstream:src/test/java/br/com/codenation/desafio/model/LogsTest.java

=======
	
	@Test
	public void logLogIsNotValid() {
		User user = User.builder()
				.email("jonh.doe@gmail.com")
				.nome("Jonh Doe")
				.password("123456")
				.build();
				
		Log log = Log.builder()
				.title("some error in test environment")
				.description("s")
				.datetime(LocalDateTime.now())
				.environment(Environment.TEST)
				.source("service api 127.0.0.1:8080")
				.level(Level.DEBUG)
				.user(user)
				.build();
		
        Set<ConstraintViolation<Log>> constraintViolations = validator
        		.validate(log);
        
        assertEquals(1, constraintViolations.size());
	}
	
	@Test
	public void logDatetimeIsNotValid() {
		User user = User.builder()
				.email("jonh.doe@gmail.com")
				.nome("Jonh Doe")
				.password("123456")
				.build();
				
		Log log = Log.builder()
				.title("some error in test environment")
				.description("description of the error stack trace")
				.datetime(null)
				.environment(Environment.TEST)
				.source("service api 127.0.0.1:8080")
				.level(Level.DEBUG)
				.user(user)
				.build();
		
        Set<ConstraintViolation<Log>> constraintViolations = validator
        		.validate(log);
        
        assertEquals(1, constraintViolations.size());
	}
	
>>>>>>> Stashed changes:src/test/java/br/com/codenation/desafio/model/LogTest.java
	@Test
	public void logOriginIsNotValid() {
		User user = User.builder()
				.email("jonh.doe@gmail.com")
				.nome("Jonh Doe")
				.password("123456")
				.build();
<<<<<<< Updated upstream:src/test/java/br/com/codenation/desafio/model/LogsTest.java

		Log log = Log.builder()
				.title("some error in test environment")
				.lastOccurrence(LocalDateTime.now())
				.description("some description error")
				.origin(null)
				.user(user)
				.build();

		Set<ConstraintViolation<Log>> constraintViolations = validator
				.validate(log);

		assertEquals(1, constraintViolations.size());
=======
				
		Log log = Log.builder()
				.title("some error in test environment")
				.description("description of the error stack trace")
				.datetime(LocalDateTime.now())
				.environment(null)
				.source("service api 127.0.0.1:8080")
				.level(Level.DEBUG)
				.user(user)
				.build();
		
        Set<ConstraintViolation<Log>> constraintViolations = validator
        		.validate(log);
        
        assertEquals(1, constraintViolations.size());
>>>>>>> Stashed changes:src/test/java/br/com/codenation/desafio/model/LogTest.java
	}

	@Test
	public void logLastOccurrenceIsNotValid() {
		User user = User.builder()
				.email("jonh.doe@gmail.com")
				.nome("Jonh Doe")
				.password("123456")
				.build();
				
		Log log = Log.builder()
				.title("some error in test environment")
<<<<<<< Updated upstream:src/test/java/br/com/codenation/desafio/model/LogsTest.java
				.lastOccurrence(null)
				.description("some description error")
				.origin("128.168.0.3")
=======
				.description("description of the error stack trace")
				.datetime(LocalDateTime.now())
				.environment(Environment.TEST)
				.source("s")
				.level(Level.DEBUG)
>>>>>>> Stashed changes:src/test/java/br/com/codenation/desafio/model/LogTest.java
				.user(user)
				.build();
		
        Set<ConstraintViolation<Log>> constraintViolations = validator
        		.validate(log);
        
        assertEquals(1, constraintViolations.size());
	}
	
	@Test
	public void logDescriptionIsNotValid() {
		User user = User.builder()
				.email("jonh.doe@gmail.com")
				.nome("Jonh Doe")
				.password("123456")
				.build();
<<<<<<< Updated upstream:src/test/java/br/com/codenation/desafio/model/LogsTest.java

		Log log = Log.builder()
				.title("some error in test environment")
				.lastOccurrence(LocalDateTime.now())
				.description(null)
				.origin("128.168.0.3")
=======
				
		Log log = Log.builder()
				.title("some error in test environment")
				.description("description of the error stack trace")
				.datetime(LocalDateTime.now())
				.environment(Environment.TEST)
				.source("service api 127.0.0.1:8080")
				.level(null)
>>>>>>> Stashed changes:src/test/java/br/com/codenation/desafio/model/LogTest.java
				.user(user)
				.build();
		
        Set<ConstraintViolation<Log>> constraintViolations = validator
        		.validate(log);
        
        assertEquals(1, constraintViolations.size());
	}
	
	@Test
<<<<<<< Updated upstream:src/test/java/br/com/codenation/desafio/model/LogsTest.java
	public void logLUserIsNotValid() {
		Log log = Log.builder()
				.title("some error in test environment")
				.lastOccurrence(LocalDateTime.now())
				.description("some description error")
				.origin("128.168.0.3")
=======
	public void logLUserIsNotValid() {				
		Log log = Log.builder()
				.title("some error in test environment")
				.description("description of the error stack trace")
				.datetime(LocalDateTime.now())
				.environment(Environment.TEST)
				.source("service api 127.0.0.1:8080")
				.level(Level.DEBUG)
>>>>>>> Stashed changes:src/test/java/br/com/codenation/desafio/model/LogTest.java
				.user(null)
				.build();
		
        Set<ConstraintViolation<Log>> constraintViolations = validator
        		.validate(log);
        
        assertEquals(1, constraintViolations.size());

	}

}