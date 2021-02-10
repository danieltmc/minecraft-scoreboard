package org.burkecommunitychurch.minecraftscoreboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.burkecommunitychurch.minecraft-scoreboard"})
public class MinecraftScoreboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinecraftScoreboardApplication.class, args);
	}

}
