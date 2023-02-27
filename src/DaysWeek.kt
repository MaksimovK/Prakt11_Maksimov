enum class DaysWeek {
    Monday{
          override fun DayName() = "Понедельник"
          override val numberdays = 1
          override fun DaysOfJob() = true
          override fun ChenNeChet() = false
          },
    Tuesday{
        override fun DayName() = "Вторник"
        override val numberdays = 2
        override fun DaysOfJob() = true
        override fun ChenNeChet() = true
           },
    Wednesday{
        override fun DayName() = "Среда"
        override val numberdays = 3
        override fun DaysOfJob() = true
        override fun ChenNeChet() = false
             },
    Thursday{
        override fun DayName() = "Четверг"
        override val numberdays = 4
        override fun DaysOfJob() = true
        override fun ChenNeChet() = true
            },
    Friday{
        override fun DayName() = "Пятница"
        override val numberdays = 5
        override fun DaysOfJob() = true
        override fun ChenNeChet() = false
          },
    Saturday{
        override fun DayName() = "Суббота"
        override val numberdays = 6
        override fun DaysOfJob() = false
        override fun ChenNeChet() = true
            },
    Sunday{
        override fun DayName() = "Воскресенье"
        override val numberdays = 7
        override fun DaysOfJob() = false
        override fun ChenNeChet() = false
    };

    open fun DayName() = "Понедельник, Вторник, Среда, Четверг, Пятница, Суббота, Воскресенье"
    open val numberdays = 0
    abstract fun DaysOfJob(): Boolean
    abstract fun ChenNeChet(): Boolean

}
