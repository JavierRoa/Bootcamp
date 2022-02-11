var mayoriaEdad = 0
var masPeso = 0
var promedioAge = 0

const datos = [{"Name":"Gabriel","Age":30,"Weight":105,"Health":"Healthy","Allergies":"No"},
    {"Name":"Uma","Age":40,"Weight":88,"Health":"Healthy","Allergies":"No"},
    {"Name":"Daphne","Age":17,"Weight":57,"Health":"Healthy","Allergies":"Yes"},
    {"Name":"Meredith","Age":49,"Weight":50,"Health":"Unhealthy","Allergies":"No"},
    {"Name":"Martin","Age":41,"Weight":94,"Health":"Healthy","Allergies":"No"},
    {"Name":"Breanna","Age":39,"Weight":64,"Health":"Healthy","Allergies":"No"},
    {"Name":"Wallace","Age":28,"Weight":51,"Health":"Unhealthy","Allergies":"Yes"},
    {"Name":"Zena","Age":48,"Weight":105,"Health":"Unhealthy","Allergies":"Yes"},
    {"Name":"Lydia","Age":38,"Weight":58,"Health":"Unhealthy","Allergies":"No"},
    {"Name":"Elton","Age":34,"Weight":94,"Health":"Healthy","Allergies":"Yes"}];

    
for (let i = 0; i < datos.length; i++) {
    if (datos[i].Age >= 18) {mayoriaEdad++};
    if (datos[i].Weight > 90) {masPeso++};
    if (datos[i].Age >= 0) { promedioAge=promedioAge+datos[i].Age};
}

promedioAge = promedioAge/(datos.length);

    function compare( a, b ) {
         if (a.Name < b.Name){
              return -1;
         }
         if (a.Name > b.Name){
              return 1;
         }
         return 0;
    }

console.log("Lista desordenada", datos);
    
datos.sort(compare);

console.log("lista ordenada", datos)
console.log("Mayores de edad", mayoriaEdad)
console.log("Más de 90 kilos", masPeso)
console.log("Promedio de edades", promedioAge)