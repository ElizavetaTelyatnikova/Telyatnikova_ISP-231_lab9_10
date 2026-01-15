enum class Priority{
    low,medium,high
}
data class Task(
    val title: String,
    val description: String,
    val priority: Priority,
    val isCompleted: Boolean = false
)
fun main() {
    val task = Task("Homework","Do some works",Priority.medium,true)
    val task1 = Task("Homework","Do some works",Priority.medium,true)
    val task2 = Task("Play computer games","Play CS, Dota 2",Priority.low)
    println("toString")
    println(task.toString())
    println(task1.toString())
    println(task2.toString())
    println("equals")
    println(task.equals(task1))
    println(task.equals(task2))
    println(task.equals(task))
    println(task1.equals(task1))
    println(task1.equals(task2))
    println(task1.equals(task))
    println(task2.equals(task1))
    println(task2.equals(task2))
    println(task2.equals(task))
    println("hashCode")
    println(task.hashCode())
    println(task1.hashCode())
    println(task2.hashCode())
    println("Copy")
    println(task.copy(priority = Priority.low))
    println(task1.copy(isCompleted = false))
    println(task2.copy(priority = Priority.high))
}
