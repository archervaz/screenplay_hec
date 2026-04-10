## Información General 📋

| N°  | Item              |        Detalle |
|:---:|:------------------|---------------:|
|  1  | Java              |                |
|  2  | Gradle            |                |
|  3  | Navegador         |  Google Chrome |
|  4  | Sistema Operativo | Windows 11 Pro |
|  5  | Rama principal    |           main<br/> |

## Pre requisitos para ejecutar 📋

- Java: version 1.8 o superior (variables de entorno configuradas).
- Entorno de desarrollo: Eclipse IDE o IntelliJ IDEA
- Gradle version 7.0 o superior (variables de entorno configuradas).
- Plugin de Cucumber para Java
- Gherkin Plugin

## Ejecutar pruebas 🔨

La herramienta de compilacion de codigo y administrador de dependencias para este proyecto es **Gradle**, asi que pare
ejecutar las pruebas use el siguiente comando en la raiz del proyecto.

``` shell 
gradle clean test aggregate -i
```

Si desea ejecutar algun Runner especifico puede usar el siguiente comando, por ejemplo, para un corredor de pruebas de
un Login.

``` shell 
gradle clean test --tests "EjemploRunner"
```


## Ver los informes 👀

El comando proporcionado anteriormente para la ejecuciin de las pruebas, generará un informe de prueba de Serenity **index.html**
en el directorio **target/site/serenity**. Adicionalmente, puede encontrar evidencias generadas por Cucumber en la ruta **target/serenity-reports**, 
los archivos generados son:

- **rerun.txt**: Archivo de texto con la informaciin de la linea donde fallo el caso para su revision.
- **serenity-html-report.html**: Reporte generado con el resultado de cada uno de los pasos del feature incluido en las
  pruebas.
- **serenity-summary.html**: Este reporte es un resumen gerencial sobre los resultados de la ejecucion, si desea
  obtenerlo ejecute el siguiente comando despues de la ejecución de las pruebas:
  ``` gradle reports```

## Construido con 🛠

La automatización fue desarrollada con:

- BDD - Estrategia de desarrollo de pruebas
- Screenplay - Patron de diseno de pruebas
- Gradle - Administrador de dependencias del proyecto
- Selenium Web Driver - Herramienta para interaccionar con navegadores web
- Cucumber - Software que apoya el BDD
- Serenity BDD - Libreria de codigo abierto para escribir pruebas de aceptacion automatizadas
- Gherkin - Lenguaje DSL de lectura empresarial (lenguaje especifico de dominio)

## Versionamiento 📌

Se usa Git para el control de versiones. 🔀

## Copyright
