$(document).ready(function() {
    
    $("#survey-form").validate({
        errorClass: "error fail-alert",
        validClass: "valid success-alert",
        submitHandler: function(form) {
            if (confirm("Sus datos han sido registrados con éxito")) {

// Aquí debería ir form.submit, pero usé reset debido a que no se envía la información a ningún lugar //

                form.reset();
            }
        },

        rules: {
            name: {
                required: true,
                pattern: "[a-zA-ZàáâäãåąčćęèéêëėįìíîïłńòóôöõøùúûüųūÿýżźñçčšžÀÁÂÄÃÅĄĆČĖĘÈÉÊËÌÍÎÏĮŁŃÒÓÔÖÕØÙÚÛÜŲŪŸÝŻŹÑßÇŒÆČŠŽ∂ð ,.'-]{1,48}",
                minlength: 3,
                maxlength: 35,
            },

            age: {
                required: true,
                number: true,
                min: 18,
                max: 75
            },

            address: {
                required: true,
                pattern: "^[\.a-zA-Z0-9 ]*$",
                minlength: 3,
                maxlength: 30,
            },

            weight: {
                required: true,
                number: true,
                min: 50,
                max: 120
            },

            allergy: {
                required: true
            },

            allergy2: {
                required: true
            },

            areaTxt: {
                required: {
                    depends: function() {
                        return $("input[name=allergy2]:checked").val() == "yes";
                    }
                }
            }
        },

        messages: {
            name: {
                required: "Este campo es obligatorio",
                pattern: "El texto ingresado no debe contener símbolos o números",
                minlength: "El texto ingresado debe tener mínimo 3 caracteres",
                maxlength: "El texto ingresado debe tener máximo 35 caracteres",
                
            },

            age: {
                required: "Este campo es obligatorio",
                pattern: "El texto ingresado no debe contener símbolos",
                min: "Debe ser mayor de edad",
                max: "Nuestras actividades pueden poner en riesgo su salud",
            },

            address: {
                required: "Este campo es obligatorio",
                pattern: "El texto ingresado no debe contener símbolos",
                minlength: "El texto ingresado debe tener mínimo 3 caracteres",
                maxlength: "El texto ingresado debe tener máximo 35 caracteres",
            },

            weight: {
                required: "Este campo es obligatorio",
                number: "Este campo solo admite valores numéricos",
                min: "Nuestros implementos no están capacitados para garantizar su seguridad",
                max: "Nuestros implementos no están capacitados para garantizar su seguridad"
            },

            allergy: {
                required: "Este campo es obligatorio!"
            },

            allergy2: {
                required: "Este campo es obligatorio!",
            },

            areaTxt: {
                required: "Indique los medicamentos a los que es alérgico/a"
            }
        }
    });
  });