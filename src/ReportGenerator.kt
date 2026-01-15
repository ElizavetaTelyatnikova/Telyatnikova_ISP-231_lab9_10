interface ReportGenerator {
    fun generateReport(): String
}

fun main() {
    val reportGenerator: List<ReportGenerator> = listOf(
        Employee("Telyatnikova Elizaveta Petrovna","Manager",20000,30),
        DevelopmentDepartment(),
    )
    for (i in reportGenerator){
        println(i.generateReport())
        println()
    }
}