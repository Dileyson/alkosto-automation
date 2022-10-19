# language: es
Característica: Add to car
  Como usuario web
  Quiero agregar productos al carro de compras
  Para comprar

  Escenario: agregar 4 productos al carito y de 4 categorias distintas
    Cuando "Rodolfo" quiere comprar un articulo de las categorias "Celulares", "Computadores", "TV"  y "Llantas y Motos"
    Entonces debe ver 4 articulos en el carrito

  Escenario: Comprar un Iphone 13
    Cuando "Rodolfo" quiere comprar un "iPhone 13"
    Entonces debe ver en el carrito de comprar "iPhone 13"
