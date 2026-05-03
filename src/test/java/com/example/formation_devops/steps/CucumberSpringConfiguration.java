package com.example.formation_devops.steps;

import com.example.formation_devops.FormationDevopsApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = FormationDevopsApplication.class)
public class CucumberSpringConfiguration {
}
