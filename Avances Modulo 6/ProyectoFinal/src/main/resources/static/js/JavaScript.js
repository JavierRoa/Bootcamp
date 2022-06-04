
let url = "localhost:8181/libros"
$.get(url,function(respuesta) {

    respuesta.forEach(function(item) {
        console.log(item)
    })

    $("#libros").text()
}, "json");