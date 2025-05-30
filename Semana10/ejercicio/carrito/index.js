let datos = {
    1 : {
        'nombre': 'Zapatillas deportivas Merrell Alpine 83 para hombre',
        'precio': 180.23,
        'ruta': 'https://i.ebayimg.com/images/g/AEYAAOSwEf5nOca9/s-l500.webp'
    },
    2 : {
        'nombre': 'Zuecos Crocs Baya para adultos',
        'precio': 128.70,
        'ruta': 'https://i.ebayimg.com/images/g/zVcAAeSwmh9oL032/s-l500.webp'
    },
    3 : {
        'nombre': 'Merrel Hombres camaleon 8 Elastizados Senderismo Zapatos',
        'precio': 253.80,
        'ruta': 'https://i.ebayimg.com/images/g/IqYAAOSwK4Bm13yM/s-l500.webp'
    },
    4 : {
        'nombre': 'Zapatos Merrel Hydro Silde 2 para hombre',
        'precio': 88.28,
        'ruta': 'https://i.ebayimg.com/images/g/IqYAAOSwK4Bm13yM/s-l500.webp'
    },
    5 : {
        'nombre': 'Zapatos informales unisex Converse x Naruto Shippuden Weapon Itachi para hombre A14835C',
        'precio': 563.41,
        'ruta': 'https://i.ebayimg.com/images/g/~38AAOSwAJFoLaMv/s-l500.webp'
    },
    6 : {
        'nombre': 'Zapatos unisex Converse X Naruto Shipudden Chuck Taylor All Star',
        'precio': 378.77,
        'ruta': 'https://i.ebayimg.com/images/g/heMAAOSw2ddoLaSo/s-l500.webp'
    }
}


const añadirZapato = (nombre, precio, ruta) => {
    let objeto = {
        'nombre': nombre,
        'precio': precio,
        'ruta': ruta
    }
    datos.push(objeto)
}

const container = $('.container')
for (let indice in datos) {
    container.append(
        `
        <div class="elemento">
            <img class="imagen-zapato" src="${datos[indice]['ruta']}">
            <h1 class="nombre-zapato">${datos[indice]['nombre']}</h1>
            <p class="precio-zapato">S/${datos[indice]['precio']}</p>
        </div>
        `
    )
}

const elementos = $('.elemento')
elementos.each((i, e) => {
    let elemento = $(e)
    elemento.click( () => {
        alert("Producto añadido al carrito de compras!")
    })
})

