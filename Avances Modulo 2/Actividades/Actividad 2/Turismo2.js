document.querySelector("form").addEventListener("submit", function(e){
e.preventDefault();
    if(document.querySelector("form").checkValidity()) {
    alert("Sus datos han sido enviados con éxito")
    document.querySelector("form").reset()
    }
});