fun main () {
    val inteiro = 1;
    val numeroGrande = 31564561351;
    val inteiro2: Int = 2;
    val numeroGrande2: Long = 65415351;
    val texto = "César";
    val ehMaior = true;
    val decimalMenor: Float = 2.0f;
    val decimalMenor2 = 2.0f;
    val decimalMaior = 2.51531351351;

    val pets = listOf("Cachorro", "Gato", "Tartaruga", "Hamster");

    val petsMutavel = mutableListOf("Cachorro", "Gato", "Tartaruga", "Hamster");

    println(pets.first());
    println(pets[2]);

    val numero = 2;

    when {
        numero < 3 -> println("Menor que 3")
        numero > 3 -> println("Maior que 3")
        else -> println("Caiu no else")
    }


    for (num in 1..10 step 2) {
        println(num)
    }

    petsMutavel.forEach { pet ->
        println(pet)
    }

    var x = 0
    while (x < 2) {
        println(x)
        x++
    }
}