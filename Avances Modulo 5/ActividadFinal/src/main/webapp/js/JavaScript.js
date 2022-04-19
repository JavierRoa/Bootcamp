$(document).ready(function(){
    //Validación del formulario
    $("#formulario").validate({
        //Asignación de formatos de entrada válida y errónea
        errorClass: "error fail-alert",
        validClass: "valid success-alert",
        submitHandler: function(form) {
            // Almacenamiento de los valores del formulario
            let valorRut = $("#rut").val();
            let valorNombre = $("#nombre").val();
            let valorTel = $("#tel").val();
            let valorDireccion = $("#direccion").val();
            let valorComuna = $("#comuna").val();
            let valorRegion = $("#region").val();
            let valorTipoElec = $("#tipoElec").val();
            let valorFecha = $("#fecha").val();
            let valorFechaAct = $("#fechaAct").val();
            let valorEstado = $("#estado").val();
            let valorUsuario = $("#usuario").val();
            let valorClave = $("#clave").val();
            if (confirm(mensaje)) {
                //Reseteo de los campos del formulario
                form.reset();
            }
        },
        rules: {
			rut: {
				required: true,
				pattern: "^(\\d{7}-(\\d|[K-k])|\\d{8}-(\\d|[K-k]))$",
			},
            nombre: {
                //Obligatorio, solo letras, mínimo 3 caracteres, máximo 30 caracteres
                required: true,
                pattern: "[a-zA-ZàáâäãåąčćęèéêëėįìíîïłńòóôöõøùúûüųūÿýżźñçčšžÀÁÂÄÃÅĄĆČĖĘÈÉÊËÌÍÎÏĮŁŃÒÓÔÖÕØÙÚÛÜŲŪŸÝŻŹÑßÇŒÆČŠŽ∂ð]{1,48}",
                minlength: 3,
                maxlength: 30,
            },
            tel: {
                //Obligatorio, 9 dígitos
                required: true,
                pattern: "[0-9]{1,9}",
                minlength:9,
                maxlength:9,
            },
            direccion: {
                //Obligatiorio, solo letras, números o espacios, mínimo 3 caracteres, máximo 80 caracteres
                required: true,
                pattern: "^[\.a-zA-Z0-9 ]*$",
                minlength: 3,
                maxlength: 80,
            },
            comuna: {
                //Obligatorio
                required: true,
                pattern:"[a-zA-Z]{3,50}",
            },
            region: {
                //Obligatorio
                required: true,
            },
            tipoElec: {
                //Obligatorio
                required: true,
            },
            fecha: {
                //Obligatorio
                required: true,
            },
            fechaAct: {
                //Obligatorio
                required: true,
            },
            usuario: {
				required: true,
			},
			clave: {
				required: true,
			},
        },
        messages: {
            //Definición de mensajes de error personalizados, dependiendo de los requisitos previamente establecidos
            rut: {
				required: "Este campo es obligatorio",
				pattern: "Este campo sólo recibe dígitos y guión (-)",
			},
            nombre: {
                required: "Este campo es obligatorio",
                pattern: "El campo solo puede contener letras",
                minlength: "Este campo debe tener al menos 3 caracteres",
                maxlength: "Este campo admite máximo 30 caracteres",
            },
            tel: {
                required: "Este campo es obligatorio",
                pattern: "Formato incorrecto",
                minlength: "Formato de teléfono no válido",
                maxlength: "Formato de teléfono no válido",
            },
            direccion: {
                required: "Este campo es obligatorio",
                pattern: "Este campo solo puede contener letras, espacios y números",
                minlength: "Este campo debe tener al menos 3 caracteres",
                maxlength: "Este campo admite máximo 80 caracteres",
            },
            comuna: {
                required: "Este campo es obligatorio",
                pattern: "Debe usar entre 3 y 50 caracteres, y solo letras",
            },
            region: {
                required: "Este campo es obligatorio",
            },
            tipoElec: {
                required: "Este campo es obligatorio",
            },
            fecha: {
                required: "Este campo es obligatorio",
            },
            fechaAct: {
                required: "Este campo es obligatorio",
            },
            usuario: {
				required: "Este campo es obligatorio",
			},
			clave: {
				required: "Este campo es obligatorio",
			},
        },
    });
});