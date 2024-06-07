
fun fullName(firstName: String, lastName: String){ // without return keyword
    println(firstName + " " + lastName)
}

fun allName(firstName: String, lastName: String): String{ // with return keyword
    return(firstName + " " + lastName)
}
fun main() {

    println("Hello, World!")

    var name = "Jennifer"
    var fname = "Jeff"
    var x = 9;
    var y = 10;
    var surname = "Jesse"

    fullName(name, surname);
    var names = allName(name, fname);
    println(names)

    println(name + " " + name.length)
    println("My surname is $surname and my name is $name");

    if (20 > 18){
        println("20 is greater than 18");
    }

    if (x > y) {
        println("$x is a larger number compared to $y");
    } else if (x < y){
        println("$y is a larger number compared to $x")
    } else {
        println("$x and $y are equal")
    }


    var cars = arrayOf("Jeep", "Benz", "Toyota", "Mazda");

    println(cars.size)
    println(cars[0])

    if ("Benz" in cars){
        println("Car selected is available")
    } else{
        println("Car not available... make another selection")
    }

    cars[0] = "Volvo";

    for (x in cars){
        println(x)
    }

    for (nums in 5..15){
        println(nums)
    }




}
//fun firstAndLastName(firstName , lastName){
//    println(firstName + " " + lastName)
//}