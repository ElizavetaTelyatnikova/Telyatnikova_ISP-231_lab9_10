class Employee(
    fullName: String,
    position: String,
    salary: Int,
    yearsOfExperience: Int
) {
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
}
fun main() {
    val employee = Employee("Telyatnikova Elizaveta Petrovna","Manager",20000,30)
    println("Данные сотрудника:")
    println("ФИО: ${employee.fullName}")
    println("Должность: ${employee.position}")
    println("Зарплата: ${employee.salary}")
    println("Опыт работы: ${employee.yearsOfExperience}")
    println()
    println("Проверка с неккоректными данными")
    employee.salary = -2000
    employee.yearsOfExperience = 70
    println("Зарплата: ${employee.salary}")
    println("Опыт работы: ${employee.yearsOfExperience}")
}