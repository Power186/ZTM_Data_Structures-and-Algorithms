fun main() {
    // empty key value pairs O(1)
    val hashTable = hashMapOf<String, Int>()

    // adding key value pairs to empty hashtable
    hashTable["grapes"] = 10000
    hashTable["apples"] = 54
    println(hashTable)

    // add another key value pair
    hashTable["oranges"] = 2
    println(hashTable)

    // looking up and printing keys and values
    println(hashTable.keys)
    println(hashTable.values)


    // Google Question
    // Given an array = 2,5,1,2,3,5,1,2,4
    // return reoccurring numbers

    val arr1 = arrayListOf(2,5,3,2,3,5,1,2,4)

    // Solution
    if (firstRecurringCharacter(arr1)) {
        println(arr1.distinctBy { arr1[it] })
    } else {
        println("Undefined")
    }
}

fun firstRecurringCharacter(input: ArrayList<Int>): Boolean {
    return input.size != hashSetOf(input).size
}