package com.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchUI {
    public static final Target INPUT_BUSQUEDA = Target.the("campo de texto búsqueda")
            .located(By.id("s"));
    public static final Target BTN_BUSCAR = Target.the("botón buscar")
            .located(By.id("searchsubmit"));
}