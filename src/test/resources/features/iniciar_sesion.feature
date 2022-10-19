# language: es
Característica: Iniciar sesion
  Como usuario web
  Quiero iniciar sesion
  Para validar mis datos personales

 Esquema del escenario: Iniciar sesion
    Cuando "Rodolfo" quiere iniciar sesion
      | <correo> | <nombre> | <apellido> | <celular> |
   Entonces debe ver su informacion personal
   Ejemplos:
     | correo              | nombre   | apellido   | celular    |
     | pruebanequi05@gmail.com | Dileyson | Echeverria | 3124565667 |