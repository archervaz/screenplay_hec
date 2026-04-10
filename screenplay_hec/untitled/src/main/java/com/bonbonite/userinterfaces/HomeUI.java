package com.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI {

    public static final Target BTN_RECHAZAR_COOKIES = Target.the("botón rechazar cookies")
            .located(By.id("cookiescript_reject"));

    public static final Target BTN_LUPA = Target.the("lupa de búsqueda")
            .locatedBy("#search-btn svg");



    public static final Target BTN_MI_CUENTA = Target.the("botón mi cuenta")
            .located(By.cssSelector("#toggle-account-menu a"));

    public static final Target REGISTER_LINK = Target.the("enlace de registro")
            .located(By.cssSelector("#customer_login #show_register"));

    public static final Target CAMPO_NUMERO_CEDULA = Target.the("campo cédula")
            .located(By.cssSelector("#form-register #reg_username"));

    public static final Target CAMPO_NOMBRES = Target.the("campo de nombres")
            .located(By.cssSelector("#form-register #first_name"));

    public static final Target CAMPO_APELLIDOS = Target.the("campo de apellidos ")
            .located(By.cssSelector("#form-register #last_name"));

    public static final Target CAMPO_EMAIL = Target.the("campo de email")
            .located(By.cssSelector("#form-register #reg_email"));

    public static final Target CAMPO_CONTRASEÑA = Target.the("campo de contraseña ")
            .located(By.cssSelector("#form-register #reg_password"));

    public static final Target CAMPO_COMFIRMAR_CONTRASEÑA = Target.the("campo de confirmar contraseña ")
            .located(By.cssSelector("#form-register #reg_password2"));

    // CORREGIDO: Añadí el ID correspondiente (newsletter)
    public static final Target CHECK_INFO_ = Target.the("check de información")
            .located(By.cssSelector("#form-register #newsletter_authorization"));

    public static final Target CHECK_AUTORIZACIÓN = Target.the("check de autorización ")
            .located(By.cssSelector("#form-register #privacy_policy_reg"));

    public static final Target BOTON_REGISTRARME = Target.the("botón de registrarme ")
            .located(By.cssSelector("#form-register button[name='register']"));

    public static final Target TEXTO_CONFIRMACIÓN_USUARIO = Target.the("texto de confirmación")
            .locatedBy("//h4[contains(text(), 'ningún pedido')]");
}