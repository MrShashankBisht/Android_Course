package org.example

fun main() {
//    val temp = "sha"
//    var temp2 = 10
//
//    temp2 = 20
//
//    // define type of any variable
//    val image: Int = 10
//    var ele: String = "sha"
//
//    printNameOnly("shashank", "sha")
//
//    // hashmap, Set, and ArrayList
//
//    var map = mutableMapOf<String, Any>()
//    map["name"] = "Shashank"
//    map["age"] = 23
//
//    map.map { it ->
//        println(it.value)
//    }
//
//    val set = mutableSetOf<Int>()
//    set.add(10)
//    set.add(10)
//    set.add(10)
//    set.add(10)
//
//    set.map {
//        println("print $it")
//    }

    data class Pixel(val red: Int, val green: Int, val blue: Int)

//    val pixelArray: Array<Pixel> = Array(10) { Pixel(
//        (0..255).random(),
//        (0..255).random(),
//        (0..255).random())
//    }
//
//    for(i in 0..9){
//        print(pixelArray[i]) // this will print "Pixel(red=..., green=..., blue=...)"
//    }


    val pixArray: Array<Array<Int?>> = Array (10) {
        Array (10) {
            0
        }
    }

    for (i in 0 until 10) {
        for(j in 0 until 10) {
            print(pixArray[i][j])
        }
        println()
    }
}



fun printNameOnly(name: String, partString: String) {
    val isContains = name.contains(partString)
    println(isContains)
}