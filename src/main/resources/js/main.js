
var air = (function () {
    return {
        mostrar: function () {
            var city = $("#city").val();
            console.log(city);
            var valores;
            var info;
            $.get('/aeropuerto/' + city, function (data) {
                console.log(data);
                info = JSON.stringify(data.data, null, '\t');
                valores = JSON.parse(data);
                console.log(valores.coord);
                $("#getResult2").empty();
                $("#getResult2").append("<pre>" + "Longitud: "+valores.coord.lon + "\n" + "Latitud: "+valores.coord.lat + "</pre>");
                //$("#getResult2").append("<pre>" + "Descripcion Aeropuerto: "+valores.airport[0].description + "\n" +"Description Main: "+ valores.airport[0].main + "</pre>");
                //$("#getResult2").append("<pre>" + "Nemocico: "+ valores.sys.country + "\n" + "Sunrise: "+valores.sys.sunrise + "</pre>");
            });

        },

    }
})();





