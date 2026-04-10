package com.bonbonite.tasks;

import com.bonbonite.interactions.Esperar; // Importa la nueva clase
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.annotations.Step;
import org.apache.commons.lang3.RandomStringUtils;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static com.bonbonite.userinterfaces.HomeUI.*;

public class UserCreation implements Task {

    @Override
    @Step("{0} realiza el registro de un nuevo usuario con datos aleatorios")
    public <T extends Actor> void performAs(T actor) {

        String cedula = "1" + RandomStringUtils.randomNumeric(9);
        String nombre = RandomStringUtils.randomAlphabetic(8).toLowerCase();
        String apellido = RandomStringUtils.randomAlphabetic(8).toLowerCase();
        String email = nombre + RandomStringUtils.randomNumeric(2) + "@hotmail.com";
        String password = RandomStringUtils.randomNumeric(8) + "A" + "b" + "*";

        actor.attemptsTo(
                Click.on(BTN_MI_CUENTA),
                WaitUntil.the(REGISTER_LINK, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(REGISTER_LINK),

                Enter.theValue(cedula).into(CAMPO_NUMERO_CEDULA),
                Enter.theValue(nombre).into(CAMPO_NOMBRES),
                Enter.theValue(apellido).into(CAMPO_APELLIDOS),
                Enter.theValue(email).into(CAMPO_EMAIL),
                Enter.theValue(password).into(CAMPO_CONTRASEÑA),
                Enter.theValue(password).into(CAMPO_COMFIRMAR_CONTRASEÑA),

                WaitUntil.the(CHECK_INFO_, isVisible()),
                Esperar.por(1000),
                Click.on(CHECK_INFO_),

                WaitUntil.the(CHECK_AUTORIZACIÓN, isVisible()),
                Esperar.por(1000),
                Click.on(CHECK_AUTORIZACIÓN),

                Esperar.por(1000),
                Click.on(BOTON_REGISTRARME)
        );
    }

    public static UserCreation withRandomData() {
        return instrumented(UserCreation.class);
    }
}