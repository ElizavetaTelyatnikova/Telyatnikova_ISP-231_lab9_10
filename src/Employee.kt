class Employee(
    fullName: String,
    position: String,
    salary: Int,
    yearsOfExperience: Int
): ReportGenerator {
    var currentTask: Task? = null
    var fullName: String = fullName
        get() = field
    var position: String = position
        get() = field
    var salary: Int = salary
        get() = field
        set(value) {
            if (value < 0) {
                println("Вы ввели отрицательное число, которое невозможно, значение стало 0")
                field = 0
            }else{
                field = value
            }
        }
    var yearsOfExperience: Int = yearsOfExperience
        get() = field
        set(value) {
            if (value > 50){
                field = 50
            }else{
                field = value
            }
        }

    override fun generateReport(): String {
        return "=== Данные о сотруднике ===\n ФИО: $fullName\n Должность: $position\n Зарплата: $salary\n Опыт работы: $yearsOfExperience"
    }
    fun assignTask(newTask: Task){
        val c = currentTask
        if (c != null && !c.isCompleted){
            println("Сотрудник уже занят задачей ${c.title}")
        }else{
            currentTask = newTask
            println("Задача ${newTask.title} назначена")
        }
    }
}
fun main() {
    val employee = Employee("Telyatnikova Elizaveta Petrovna","Manager",20000,30)
    val task1 = Task("Homework","Do some works",Priority.medium)
    val task2 = Task("Play computer games","Play CS, Dota 2",Priority.low)
    println("Данные сотрудника:")
    println("ФИО: ${employee.fullName}")
    println("Должность: ${employee.position}")
    println("Зарплата: ${employee.salary}")
    println("Опыт работы: ${employee.yearsOfExperience}")
    println()
    println("Проверка с некорректными данными")
    employee.salary = -2000
    employee.yearsOfExperience = 70
    println("Зарплата: ${employee.salary}")
    println("Опыт работы: ${employee.yearsOfExperience}")
    println()
    val developmentDepartment = DevelopmentDepartment()
    println(developmentDepartment.generateReport())
    println()
    employee.assignTask(task1)
    employee.assignTask(task2)
}