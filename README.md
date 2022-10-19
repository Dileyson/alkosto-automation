# serenitybdd-web-seed
Un proyecto base para automatización web usando serenityBDD, gradle y scraenplay 

En el archivo serenity.properties, cambiar la propiedad webdriver.chrome.driver a:
```
- Sistema operativo mac: webdriver.chrome.driver = /ruta/chromedriver
- Sistema operativo windows: webdriver.chrome.driver = /ruta/chromedriver.exe
```


Las pruebas se corren con el comando `gradle test aggregate`.
La documentación viva será generada en `target/site/serenity/index.html`
