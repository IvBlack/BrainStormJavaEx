package com.IVdev.Arrayz

/*
Rewritten to Kotlin.
*/
object ArrayAverageVal {
    @JvmStatic
    fun main(args: Array<String>) {
        val nums = intArrayOf(20, 30, 25, 35, -16, 60, -100)
        var sum = 0
        for (i in nums.indices) {
            sum = sum + nums[i]
        }
        val average = (sum / nums.size).toDouble()
        println("Average value of the elements is: $average")
    }
}