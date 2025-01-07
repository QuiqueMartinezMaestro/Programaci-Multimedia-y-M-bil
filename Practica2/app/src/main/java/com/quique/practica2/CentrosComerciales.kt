package com.quique.practica2

object CentrosComerciales {
    val lista = listOf(
        CentroComercial(
            id = 1,
            nombre = "  GRAN TURIA",
            direccion = "PLAZA DE EUROPA, S/N, 46950 XIRIVELLA, VALENCIA",
            numeroTiendas = 75,
            tiendas = listOf(
                Tienda("ZARA", "ROPA PARA HOMBRES, MUJERES Y NIÑOS"),
                Tienda("H&M", "MODA Y ACCESORIOS"),
                Tienda("JUQUETILANDIA", "JUGUETES PARA NIÑOS Y NIÑAS"),
                Tienda("GAME", "VIDEOJUEGOS Y MUCHO MÁS"),
                Tienda("EL CORTE INGLÉS", "COMPRAS PARA TODA LA FAMILIA"),
                Tienda("DECATHLON", "ARTÍCULOS DEPORTIVOS"),
                Tienda("C&A", "ROPA Y CALZADO PARA TODA LA FAMILIA"),
                Tienda("SEPHORA", "COSMÉTICOS Y PRODUCTOS DE BELLEZA"),
                Tienda("STRADIVARIUS", "MODA PARA MUJERES"),
                Tienda("BERSHKA", "ROPA JOVEN Y MODERNA"),
                Tienda("SFERA", "ROPA Y ACCESORIOS PARA TODA LA FAMILIA"),
                Tienda("SUPERDRY", "ROPA Y ACCESORIOS DE ESTILO URBANO"),
                Tienda("MASSIMO DUTTI", "MODA ELEGANTE Y SOFISTICADA"),
                Tienda("LACOSTE", "ROPA Y ACCESORIOS DE LUJO"),
                Tienda("CALZEDONIA", "MEDIAS, CALCETINES Y LENCERÍA"),
                Tienda("TEZENIS", "LENCERÍA Y ROPA CÓMODA"),
                Tienda("MANGO", "MODA FEMENINA"),
                Tienda("PULL & BEAR", "ROPA CASUAL")
            )
        ),
        CentroComercial(
            id = 2,
            nombre = "  EL SALER",
            direccion = "AVENIDA DEL PROFESSOR LÓPEZ PIÑERO, 16, VALENCIA",
            numeroTiendas = 130,
            tiendas = listOf(
                Tienda("PRIMARK", "ROPA Y ACCESORIOS ECONÓMICOS"),
                Tienda("FNAC", "LIBROS, MÚSICA Y TECNOLOGÍA"),
                Tienda("STRADIVARIUS", "MODA PARA MUJERES"),
                Tienda("GAME", "VIDEOJUEGOS Y ACCESORIOS"),
                Tienda("PULL & BEAR", "MODA CASUAL"),
                Tienda("LUSH", "COSMÉTICOS NATURALES"),
                Tienda("MANGO", "MODA FEMENINA"),
                Tienda("APPLE STORE", "TECNOLOGÍA Y ACCESORIOS"),
                Tienda("NIKE", "ROPA Y CALZADO DEPORTIVO"),
                Tienda("ADIDAS", "ROPA Y CALZADO DEPORTIVO"),
                Tienda("KIKO MILANO", "COSMÉTICOS Y MAQUILLAJE"),
                Tienda("C&A", "ROPA Y CALZADO PARA TODA LA FAMILIA"),
                Tienda("SKECHERS", "CALZADO CÓMODO"),
                Tienda("BERSHKA", "MODA JOVEN Y MODERNA"),
                Tienda("H&M HOME", "DECORACIÓN DEL HOGAR"),
                Tienda("CARREFOUR", "SUPERMERCADO Y ARTÍCULOS VARIOS"),
                Tienda("EL GANSO", "MODA ESPAÑOLA DE CALIDAD"),
                Tienda("LACOSTE", "ROPA Y ACCESORIOS DE LUJO")
            )
        ),
        CentroComercial(
            id = 3,
            nombre = "  BONAIRE",
            direccion = "CARRER DEL QUART, 46960 ALDAIA, VALENCIA",
            numeroTiendas = 200,
            tiendas = listOf(
                Tienda("NIKE", "ROPA Y CALZADO DEPORTIVO"),
                Tienda("LEROY MERLIN", "MATERIAL PARA EL HOGAR"),
                Tienda("PULL & BEAR", "ROPA CASUAL"),
                Tienda("CARREFOUR", "SUPERMERCADO"),
                Tienda("ADIDAS", "ROPA Y CALZADO DEPORTIVO"),
                Tienda("MEDIAMARKT", "ELECTRODOMÉSTICOS Y TECNOLOGÍA"),
                Tienda("C&A", "ROPA Y CALZADO PARA TODA LA FAMILIA"),
                Tienda("SUPERDRY", "ROPA JUVENIL Y DEPORTIVA"),
                Tienda("H&M", "ROPA Y ACCESORIOS ECONÓMICOS"),
                Tienda("BERSHKA", "MODA JOVEN Y MODERNA"),
                Tienda("STRADIVARIUS", "MODA PARA MUJERES"),
                Tienda("CALZEDONIA", "MEDIAS Y LENCERÍA"),
                Tienda("TEZENIS", "LENCERÍA Y ROPA CÓMODA"),
                Tienda("EL CORTE INGLÉS", "COMPRAS PARA TODA LA FAMILIA"),
                Tienda("SFERA", "ROPA Y ACCESORIOS"),
                Tienda("LEVI'S", "JEANS Y ROPA CASUAL DE MARCA"),
                Tienda("MANGO", "MODA FEMENINA"),
                Tienda("ZARA HOME", "DECORACIÓN DEL HOGAR"),
                Tienda("TIFFANY & CO.", "JOYERÍA Y LUJO")
            )
        ),
        CentroComercial(
            id = 4,
            nombre = "  AQUA",
            direccion = "C/ DE MENORCA, 19, CAMINS AL GRAU, 46023 VALENCIA",
            numeroTiendas = 90,
            tiendas = listOf(
                Tienda("BERSHKA", "MODA JOVEN"),
                Tienda("CINESA", "CINE Y ENTRETENIMIENTO"),
                Tienda("TIGER", "ACCESORIOS Y DECORACIÓN"),
                Tienda("MANGO", "MODA FEMENINA"),
                Tienda("DESIGUAL", "MODA Y ACCESORIOS COLORIDOS"),
                Tienda("STRADIVARIUS", "MODA FEMENINA"),
                Tienda("KIKO MILANO", "COSMÉTICOS Y MAQUILLAJE"),
                Tienda("BRICOR", "FERRETERÍA Y BRICOLAJE"),
                Tienda("CARREFOUR", "SUPERMERCADO Y ARTÍCULOS VARIOS"),
                Tienda("ADIDAS", "ROPA Y CALZADO DEPORTIVO"),
                Tienda("NIKE", "ROPA Y CALZADO DEPORTIVO"),
                Tienda("CALVIN KLEIN", "ROPA Y ACCESORIOS DE LUJO"),
                Tienda("GUESS", "MODA ELEGANTE Y ACCESORIOS"),
                Tienda("PULL & BEAR", "ROPA CASUAL"),
                Tienda("H&M", "ROPA Y ACCESORIOS ECONÓMICOS"),
                Tienda("MANGO", "MODA FEMENINA"),
                Tienda("BONAQUA", "AGUA MINERAL Y BEBIDAS SALUDABLES"),
                Tienda("REEBOK", "ROPA Y CALZADO DEPORTIVO"),
                Tienda("VANS", "CALZADO Y ROPA DE ESTILO SKATER"),
                Tienda("C&A", "ROPA Y CALZADO PARA TODA LA FAMILIA")
            )
        )
    )
}
