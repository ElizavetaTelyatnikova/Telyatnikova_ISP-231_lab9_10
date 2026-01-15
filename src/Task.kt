enum class Priority{
    low,medium,high
}
data class Task(
    val title: String,
    val description: String,
    val priority: Priority,
    val isCompleted: Boolean = false
)
