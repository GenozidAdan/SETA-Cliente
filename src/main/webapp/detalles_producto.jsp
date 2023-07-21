<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>  
    <title>Detalles producto</title>
  <!-- Google Web Fonts -->
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;500;600;700&display=swap" rel="stylesheet">
  <!-- Icon Font Stylesheet -->
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

  <!-- Customized Bootstrap Stylesheet -->
  <link href="recursos/recursos_detalleproducto/css/bootstrap.min.css" rel="stylesheet">

  <link href="recursos/recursos_detalleproducto/css/style.css" rel="stylesheet">
  <!-- Icons Fontawesome -->
  <script src="https://kit.fontawesome.com/092eb14ce6.js" crossorigin="anonymous"></script>

  <link href="recursos/recursos_detalleproducto/css/styles.css" rel="stylesheet">
  <link rel="stylesheet" href="recursos/recursos_index/nav/nav_styles.css">
 
</head>
<body>
<nav class="navcorregido">
  <div class="navbarizq">
    <img href="index.jsp" src="recursos/recursos_index/nav/logo.png" alt="Logo" class="logonavcorre">
    <a href="index.jsp" class="navbar-linkk bbigger-font">Telarañas Creativas</a>
    <a href="tienda.jsp" class="navbar-linkk">Tienda</a>
    <a class="navbar-linkk" href="editarInfo.jsp"><i class="fas fa-shopping-cart" style="color: #000000;"></i></a>
    <a class="navbar-linkk" href="editarInfo.jsp"><i class="fas fa-gear" style="color: #000000;"></i></a>
    <a class="navbar-linkk" href="login_cliente.jsp"><i class="fas fa-user" style="color: #000000;"></i></a>
  </div>
</nav>
<section class="py-5">
  <div class="container px-4 px-lg-5 my-5">
    <div class="row gx-4 gx-lg-4 align-items-center">
      <div class="col-sm-5">
        <div class="img-container">
          <img class="d-block w-100" src="recursos/recursos_detalleproducto/PRESENTACION/PELUCHE/peluche1.jpg">
        </div>
      </div>
      <br>
      <div class="col-md-6 product-info">
        <div class="small mb-1"></div>
        <h1 class="display-5 fw-bolder product-title">Peluches</h1>
        <p class="lead product-description">Elefante tejído a crochet</p>
        <p class="product-description">
         ¡Conoce a nuestro adorable peluche de elefante tejido a crochet! Este entrañable compañero es el 
         resultado de horas de cuidadoso trabajo a mano por nuestros talentosos artesanos. Cada detalle 
         está meticulosamente tejido para capturar la dulzura y ternura de un elefante real. Suave y 
         reconfortante al tacto, este peluche es perfecto para abrazar y llevar consuelo a los más pequeños. 
         Su diseño encantador y colores vibrantes lo hacen un regalo encantador para niños y amantes de los 
         peluches. Lleva a casa esta maravilla artesanal que seguro se convertirá en el favorito de todos.</p>
        <div class="fs-5 mb-5 product-price">
          <span>249.99</span>        
        </div>
        <div class="d-flex flex-wrap">
          <input class="form-control text-center me-3 product-quantity" id="inputQuantity" type="number" value="1" />
          <div class="product-buttons">
            <button class="btn btn-outline-primary me-2" type="button">
              <i class="bi-cart-fill me-1"></i>
              Agregar al carrito
            </button>
           
          </div>
        </div>
      </div>
    </div>


      <div class="row mt-4">
        <div class="col-sm-2 col-6">
          <img class="d-block w-100" src="recursos/recursos_detalleproducto/PRESENTACION/PELUCHE/peluche2.jpg">
        </div>
          
        <div class="col-sm-2 col-6">
          <img class="d-block w-100" src="recursos/recursos_detalleproducto/PRESENTACION/PELUCHE/peluche3.jpeg">
        </div>           
      </div>
        

    <div class="mt-4 product-comments">
      <h3>Comentarios:</h3>
      <textarea class="form-control" rows="4" placeholder="Queremos saber tu opinión. Escríbela aquí."></textarea>
      <button class="btn btn-outline-success mt-3" type="button">Enviar</button>
    </div>
  </div>
</section>


</body>
</html>
