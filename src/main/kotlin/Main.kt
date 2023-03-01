fun main() {
    var person= Human("Ann",20,75)
        person.eat(15)
    person.speak("I am Ann")
    person.birthday(34)
    person.age
    println(person.age)
    var user= data("Ann","Anyango","annmwangombe@gmail.com",67675675,453421)
    println(user.email)
    println(user.firstName)






}
class Human( var name:String,var age:Int,var weight:Int){



fun eat(foodWeight:Int) {
    println("I am eating $foodWeight kgs of food")
    weight += foodWeight
    println(weight)
}
fun speak(speech:String){
    println(speech)
}
    fun birthday(age1: Int){
        age+=23



    }
}
class data(var firstName:String, var secondName:String, var email:String, var phoneNumber: Int,var passward:Int){

}

//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
// attributes










//1. Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
 //eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eatenCreate a class called Human with these attributes: name, age, weight. It has
//the following functions:
//2. speak(speech: String) :Prints the string passed to it
//3. birthday( ) :Increments the human’s age by 1