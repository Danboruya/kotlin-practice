package excise01

fun main() {
    val data0 = arrayOf<Int>(1, 2, 3, 4, 10, 5)
    val data1 = arrayOf<Int>(4, 2, 5, 6, 13, 54, 23, 2)
    val data2 = arrayOf<Int>(-1, 32, -23, -52, 0, 22)

    val sortedData0 = sort(data0)
    val sortedData1 = sort(data1)
    val sortedData2 = sort(data2)

    printArray(sortedData0)
    printArray(sortedData1)
    printArray(sortedData2)
}

fun printArray(array: Array<Int>) {
    print("{")
    for (i in array.indices) {
        if (i < (array.size - 1)) {
            print(array[i].toString() + ", ")
        } else {
            print(array[i])
        }
    }
    println("}")
}

fun sort(data: Array<Int>) : Array<Int> {
    var tmp : Int = 0
    for (i in data.indices) {
        for (j in data.indices) {
            if (data[i] < data[j]) {
                tmp = data[i]
                data[i] = data[j]
                data[j] = tmp
            }
        }
    }
    return data
}