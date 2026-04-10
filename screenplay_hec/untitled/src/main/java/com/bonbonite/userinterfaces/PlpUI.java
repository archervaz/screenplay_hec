package com.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PlpUI {
    public static final Target LABEL_FILTROS = Target.the("texto de filtros")
            .located(By.id("filters-text"));
}