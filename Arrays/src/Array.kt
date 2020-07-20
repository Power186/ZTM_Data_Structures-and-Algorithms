fun main() {
    // Reverse a String from user input
    print("Input a string: ")
    val input = readLine()
    println(input?.let { reverse(it) })

    // Merge Two Sorted Arrays without function
    val arr1 = arrayListOf(0, 3, 4, 31)
    val arr2 = arrayListOf(4, 6, 30)
    arr1.addAll(arr2)
    println(arr1.sorted())

    // Merge Two Sorted Arrays with function
    val arr3 = arrayListOf(1, 2, 3, 4, 5)
    val arr4 = arrayListOf(6, 7, 8, 9, 10)
    println(mergeSortedArrays(arr3, arr4))
}

// Reverse a String
fun reverse(sentence: String): String {
    return sentence.reversed()
}

// Merge Two Sorted Arrays 
fun mergeSortedArrays(arr1: ArrayList<Int>, arr2: ArrayList<Int>): List<Int> {
    arr1.addAll(arr2)
    return arr1.sorted()
}