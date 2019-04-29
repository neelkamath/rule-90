package com.neelkamath.rule90

import kotlin.random.Random

/** Returns [size] randomly initialized cells for the Rule 90 cellular automaton. */
private fun initRule90(size: Int): List<Int> = List(size) { if (Random.nextBoolean()) 1 else 0 }

/** Pretty prints [cells]. */
private fun printCells(cells: List<Int>) = println(cells.joinToString(""))

/** Returns the next state of the Rule 90 cellular automaton [cells]. */
private fun genRule90(cells: List<Int>): List<Int> {
    val nextState = mutableListOf<Int>()
    for (i in cells.indices) {
        val left = if (i == 0) 0 else cells[i - 1]
        val right = if (i == cells.size - 1) 0 else cells[i + 1]
        nextState.add(left xor right)
    }
    return nextState
}

fun main(args: Array<String>) {
    if (args.size != 1 || args[0].toIntOrNull() == null || args[0].toInt() < 2) {
        println("Run the program with one argument denoting the number of cells which is an integer greater than 1.")
        return
    }
    var config = initRule90(args[0].toInt())
    while (true) {
        printCells(config)
        config = genRule90(config)
    }
}
