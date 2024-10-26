import kotlin.math.sqrt
import kotlin.math.pow

// Класс для представления точки на плоскости
data class Point(val x: Double, val y: Double) {
    // Метод для вычисления расстояния до другой точки
    fun distanceTo(other: Point): Double {
        return sqrt((other.x - this.x).pow(2) + (other.y - this.y).pow(2))
    }
}

fun main() {
    // Ввод координат первой точки
    println("Введите координаты первой точки:")
    print("Координата X1: ")
    val x1 = readLine()!!.toDouble()
    print("Координата Y1: ")
    val y1 = readLine()!!.toDouble()

    // Ввод координат второй точки
    println("Введите координаты второй точки:")
    print("Координата X2: ")
    val x2 = readLine()!!.toDouble()
    print("Координата Y2: ")
    val y2 = readLine()!!.toDouble()

    // Создание объектов точек
    val point1 = Point(x1, y1)
    val point2 = Point(x2, y2)

    // Вычисление расстояния между точками
    val distance = point1.distanceTo(point2)

    // Вывод результата
    println("Расстояние между точками P1(${point1.x}, ${point1.y}) и P2(${point2.x}, ${point2.y}) равно $distance")
}
