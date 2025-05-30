const operaciones = {
    '+': function (a, b) {return a + b},
    '-': function (a, b) {return a -b},
    'x': function (a, b) {return a * b},
    '÷': function (a, b) {
        if (b === 0) {
            alert("Infinito")
            return ''
        }
        return a / b
    }
}

const display = document.getElementById('display')
const botones_numero = document.querySelectorAll('.boton-number')
const botones_operaciones = document.querySelectorAll('.boton-operacion')
const boton_igual = document.getElementById('boton-igual')
const boton_limpiar = document.getElementById('boton-limpiar')
const LONGITUDMAXIMA = 18
let operacion = null
let numero_anterior = null

botones_numero.forEach((e) => {
    e.addEventListener('click', () => {
        cadena = display.textContent
        if (cadena.length > LONGITUDMAXIMA) {
            return
        }
        let caracter = e.textContent;
        display.textContent = cadena + caracter
    })
})

botones_operaciones.forEach((e) => {
    e.addEventListener('click', () => {
        operacion = e.textContent;
        numero_anterior = display.textContent;
        display.textContent = ""
    })
})

boton_limpiar.addEventListener('click', () => {
    let string = display.textContent

    if (string !== "") {
        display.textContent = ""

        return
    }

    if (numero_anterior !== null && operacion != null) {
        numero_anterior = null
        operacion = null
        return
    }
})

boton_igual.addEventListener('click', () => {
    let resultado
    if (numero_anterior === null && operacion === null) {
        return
    }

    let numero_actual = display.textContent
    numero_anterior = parseFloat(numero_anterior)
    numero_actual = parseFloat(numero_actual)
    resultado = operaciones[operacion](numero_anterior, numero_actual)

    numero_anterior = null
    operacion = null
    display.textContent = resultado.toString()
    verificarLongitud()
})

const verificarLongitud = () => {
    cadena = display.textContent
    if (cadena.lenght > LONGITUDMAXIMA) {
        cadena = cadena.slice(0, 8)
    }
    display.textContent = cadena
}

//TO DO validar la division entre 0