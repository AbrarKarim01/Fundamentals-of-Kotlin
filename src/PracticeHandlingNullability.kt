data class Students (val id: Int, val fullName: String, val grade: Double)


val students = listOf <Students>(

    Students(223, "John", 140.0),
    Students(548, "Mark", 120.0),
    Students(342, "Natali", 150.0),
    Students(781, "Sara", 130.0)
)

fun getStudentById(id:Int): Students{
    return students.find { it.id==id } !!
}

fun searchInStudents(name: String): Students?{
    return students.find { it.fullName.lowercase()==name.lowercase() }
}


fun main() {

    println("Please, Enter the student's ID:")
    val id = readln().toInt()
    println( getStudentById(id))
    println("Please, Enter the student's name:")
    val name= readln()
    println(searchInStudents(name)?:"the student is not found")
}

