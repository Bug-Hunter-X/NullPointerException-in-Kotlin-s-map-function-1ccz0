fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    // Correct usage of map with null handling
    val nullableList = listOf(1, 2, null, 4, 5)
    val nullableResult = nullableList.mapNotNull { it?.times(2) }
    println(nullableResult) // Output: [2, 4, 8, 10]

    //Alternative solution using let
    val nullableResult2 = nullableList.map { it?.let { it * 2 } }
    println(nullableResult2) // Output: [2, 4, null, 8, 10]
}