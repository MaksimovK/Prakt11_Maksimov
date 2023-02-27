enum class ColorType {
    RED {
        override fun colorName() = "Красный"
        override val rgb = "0xFF0000"
        override fun Raduga() = true
        override fun NumberColor() = 1
        },
    GREEN{
        override fun colorName() = "Зеленый"
        override val rgb = "0x00FF00"
        override fun Raduga() = true
        override fun NumberColor() = 2
         },
    WHITE{
        override fun colorName() = "Белый"
        override val rgb = "0xFFFFFF"
        override fun Raduga() = false
        override fun NumberColor() = 3
         },
    BLUE {
        override fun colorName() = "Синий"
        override val rgb = "0x0000FF"
        override fun Raduga() = true
        override fun NumberColor() = 4
    };

    abstract fun colorName(): String
    abstract val rgb: String
    abstract fun Raduga(): Boolean
    abstract fun NumberColor(): Int
}