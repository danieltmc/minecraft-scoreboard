package org.burkecommunitychurch.minecraftscoreboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication(scanBasePackages = {"org.burkecommunitychurch.minecraft-scoreboard"})
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class MinecraftScoreboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinecraftScoreboardApplication.class, args);
	}

}
