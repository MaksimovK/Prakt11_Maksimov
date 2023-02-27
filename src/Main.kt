fun main(){
    println(ColorType.values().asList())
    println(DaysWeek.values().asList())

    val Monday = DaysWeek.Monday
    println(Monday.DayName())
    println(Monday.numberdays)
    if(Monday.ChenNeChet()) println("Четный")
    else println("Нечетный")

    if(Monday.DaysOfJob()) println("Иди работай!")
    else println("Спи дальше!")

    val Tuesday = DaysWeek.Tuesday
    println(Tuesday.DayName())
    println(Tuesday.numberdays)
    if(Tuesday.ChenNeChet()) println("Четный")
    else println("Нечетный")

    if(Tuesday.DaysOfJob()) println("Иди работай!")
    else println("Спи дальше!")

    val Wednesday = DaysWeek.Wednesday
    println(Wednesday.DayName())
    println(Wednesday.numberdays)
    if(Wednesday.ChenNeChet()) println("Четный")
    else println("Нечетный")

    if(Wednesday.DaysOfJob()) println("Иди работай!")
    else println("Спи дальше!")

    val Thursday = DaysWeek.Thursday
    println(Thursday.DayName())
    println(Thursday.numberdays)
    if(Thursday.ChenNeChet()) println("Четный")
    else println("Нечетный")

    if(Thursday.DaysOfJob()) println("Иди работай!")
    else println("Спи дальше!")

    val Friday = DaysWeek.Friday
    println(Friday.DayName())
    println(Friday.numberdays)
    if(Friday.ChenNeChet()) println("Четный")
    else println("Нечетный")

    if(Friday.DaysOfJob()) println("Иди работай!")
    else println("Спи дальше!")

    val Saturday = DaysWeek.Saturday
    println(Saturday.DayName())
    println(Saturday.numberdays)
    if(Saturday.ChenNeChet()) println("Четный")
    else println("Нечетный")

    if(Saturday.DaysOfJob()) println("Иди работай!")
    else println("Спи дальше!")

    val Sunday = DaysWeek.Sunday
    println(Sunday.DayName())
    println(Sunday.numberdays)
    if(Sunday.ChenNeChet()) println("Четный")
    else println("Нечетный")

    if(Sunday.DaysOfJob()) println("Иди работай!")
    else println("Спи дальше!")

    val Red = ColorType.RED
    println("\n${Red.colorName()}")
    println(Red.rgb)
    if(Red.Raduga()) println("Является цветом радуги")
    else println("Не является цветом радуги")

    if(Red.NumberColor() % 2 == 0)  println("Желтый")


    val Green = ColorType.GREEN
    println(Green.colorName())
    println(Green.rgb)
    if(Green.Raduga()) println("Является цветом радуги")
    else println("Не является цветом радуги")
    if(Green.NumberColor() % 2 == 0)  println("Желтый")

    val Blue = ColorType.BLUE
    println(Blue.colorName())
    println(Blue.rgb)
    if(Blue.Raduga()) println("Является цветом радуги")
    else println("Не является цветом радуги")
    if(Blue.NumberColor() % 2 == 0) println("Желтый")


    val White = ColorType.WHITE
    println(White.colorName())
    println(White.rgb)
    if(White.Raduga()) println("Является цветом радуги")
    else println("Не является цветом радуги")
    if(White.NumberColor() % 2 == 0) println("Желтый")
}