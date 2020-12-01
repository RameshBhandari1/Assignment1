fun main(){
    val dictionary = mapOf<String,String>(
            "intelligence" to "the ability to acquire and apply knowledge and skills",
            "crazy" to "mad, especially as manifested in wild or aggressive behaviour",
            "beautiful" to "pleasing the senses or mind aesthetically",
            "bad" to "of poor quality or a low standard",
            "poor" to "lacking sufficient money to live at a standard considered comfortable or normal in a society",
            "feel" to "be aware of (a person or object) through touching or being touched",
            "hang" to "suspend or be suspended from above with the lower part dangling free"
    )

    println("Please Enter a word:")
    val word = readLine()!!
    println("Meaning of word $word is: ${dictionary[word]}")
}