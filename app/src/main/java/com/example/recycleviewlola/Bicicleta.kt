package com.example.recycleviewlola

data class Bicicleta(
        var modelo: String,
        var empresa:String,
        var año:Int,
        val imagen:String,
        var precio:Int)


fun getBiciletas():MutableList<Bicicleta>{
    var ListaBicicletas:MutableList<Bicicleta> = ArrayList()
    ListaBicicletas.add(Bicicleta("RC_6_0","BH",2020,"https://www.mountainbike.es/uploads/static/mountainbike/upload/images/gallery/5e30193f0de6944a203495a0/5e301d380ee694a40634955c-compra-ideal-del-ano-2020.jpg",1499))
    ListaBicicletas.add(Bicicleta("B-PRO-M940-29'","B-PRO",2020,"https://www.mountainbike.es/uploads/static/mountainbike/upload/images/gallery/5e30193f0de6944a203495a0/5e301d380ce6946c138b46b0-compra-ideal-del-ano-2020.jpg",449))
    ListaBicicletas.add(Bicicleta("CONOR WRC Special SX","CONOR",2019,"https://www.mountainbike.es/uploads/static/mountainbike/upload/images/gallery/5e30193f0de6944a203495a0/5e301d380ce6946c138b46b0-compra-ideal-del-ano-2020.jpg",1339))
    ListaBicicletas.add(Bicicleta("GT AVALANCHE EXPERT 29","GT",2019,"https://www.mountainbike.es/uploads/static/mountainbike/upload/images/gallery/5ced005e0ee6948365349677/5ced007c0ee694c165349584-las-26-bicis-con-mejor-relacion-calidad-precio-2019.jpg",999))
    ListaBicicletas.add(Bicicleta("Maverick X01 RSV","Orbea",2018,"https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1583535344-juliana-maverick-x01-rsv-1583535332.jpg?crop=1xw:1xh;center,top&resize=400%3A%2A",746900))
    ListaBicicletas.add(Bicicleta("Marin Hawk Hill 1","Martin",2018,"https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1583535595-marin-hawk-hill-grid-1583535591.jpg?crop=1xw:1xh;center,top&resize=400%3A%2A",1499,))
    ListaBicicletas.add(Bicicleta("Orange Crush 27.5","Orange bikes",2017,"https://img.redbull.com/images/c_crop,x_71,y_0,h_750,w_1125/c_fill,w_730,h_487/q_auto,f_auto/redbullcom/2018/11/22/e2db40fd-bce9-4dd3-99c6-4a7adec1da62/orange-crush-pro-27-5",2400))


    return ListaBicicletas
}