def b16394(curYear: Int): Int = {
    val establish: Int = 1946
    curYear - establish
}

@main def run(): Unit = {
    assert(b16394(2018) == 72, "Test failed for b16394(2018)")
    println("b16394(2018) returns " + b16394(2018))
}