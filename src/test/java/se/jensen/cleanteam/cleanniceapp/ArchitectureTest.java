package se.jensen.cleanteam.cleanniceapp;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

public class ArchitectureTest {

  @Test
  void verifyModularArchitecture() {
    ApplicationModules modules = ApplicationModules.of(CleanNiceAppApplication.class);

    modules.verify();
  }

}
