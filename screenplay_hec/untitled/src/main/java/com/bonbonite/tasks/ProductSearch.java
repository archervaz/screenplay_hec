package com.bonbonite.tasks;

import com.bonbonite.userinterfaces.HomeUI;
import com.bonbonite.userinterfaces.SearchUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProductSearch implements Task {
    private final String producto;

    public ProductSearch(String producto) {
        this.producto = producto;
    }

    public static ProductSearch conNombre(String producto) {
        return instrumented(ProductSearch.class, producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(HomeUI.BTN_RECHAZAR_COOKIES.resolveFor(actor).isVisible())
                        .andIfSo(Click.on(HomeUI.BTN_RECHAZAR_COOKIES)),
                Click.on(HomeUI.BTN_LUPA),
                Enter.theValue(producto).into(SearchUI.INPUT_BUSQUEDA),
                Click.on(SearchUI.BTN_BUSCAR)
        );
    }
}