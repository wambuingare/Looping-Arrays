fun main(){
    println(multiplication(arrayOf(10,2,5,4)))
    println(sumIntegers(arrayOf(44,2.2,0.56,true,'y',"nancy")))
    var w=createVowels(arrayOf('a','e','i','o','u'))
    println(w)

}
fun multiplication(product: Array<Int>):Int{
    var v=1
    product.forEach {x->
        v*=x
    }
    return v
}
fun sumIntegers(mixedArr: Array<Any>):Double{
    var sum=0.0
    mixedArr.forEach { nums ->
        if (nums is Float|| nums is Double || nums is Int)
            sum+=nums.toString().toDouble()
    }
    return sum
}
fun createVowels(vowels:Array<Char>):Int{
    var w=0
    vowels.forEach { vowel ->
        if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
            w++
        }
    }
    return w
}