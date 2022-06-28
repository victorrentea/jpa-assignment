package victor.training.jpa;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.transaction.annotation.Transactional;
import victor.training.jpa.entity.Teacher;
import victor.training.jpa.util.TestDBConnectionInitializer;

import javax.persistence.EntityManager;
import java.io.IOException;
import java.sql.SQLException;

@SpringBootApplication
@Slf4j
public class JpaApplication {
	@Autowired
	private EntityManager entityManager;

	@EventListener(ContextRefreshedEvent.class)
	@Transactional
	public void onApplicationEvent() throws IOException, SQLException {
		insertHere();
		log.debug(">>>>>>>>>> App started ok! Congrats🎉 <<<<<<<<<<<<");
		log.debug(">>> Now have a look at the generated schema by connecting to the db <<<");
	}

	private void insertHere() {
		// TODO when ready with the model, try to insert several entities of each type here, eg by:
//		Teacher teacher1 = new Teacher().setName("John");
//		entityManager.persist(teacher1);
	}


	public static void main(String[] args) {
		new SpringApplicationBuilder(JpaApplication.class)
				.listeners(new TestDBConnectionInitializer())
				.run(args);
	}
}
