package io.github.hogwartsschoolofmagic.index;

import static java.lang.System.nanoTime;
import static org.springframework.boot.SpringApplication.run;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * A class to run the entire spring application. To run, just use the command -
 * {@code mvn spring-boot:run}.
 *
 * @author Vladislav [SmithyVL] Kuznetsov.
 * @since 1.0.0.
 */
@Slf4j
@SpringBootApplication
public class IndexApp {
  /**
   * The Main method that launches the Spring context of the application - and outputs the duration
   * of the launch to the log.
   *
   * @param args launch arguments.
   */
  public static void main(String[] args) {
    var startTime = nanoTime();
    run(IndexApp.class, args);
    log.info("IndexApplication started for {} ms!", nanoTime() - startTime);
  }
}