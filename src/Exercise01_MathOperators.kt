fun main(){
    // Task 1
    println(1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9)
    // a.
    println((1 + 2) * 3 + 4 * 5 + 6 * (7 + 8) * 9)
    // b.
    println(13530.0 / 1.23)
    // Task 2
    val scoreLeve1 = 79
    val scoreLevel2 = 92
    val scoreLevel3 = 86

    val totalScore = scoreLeve1 + scoreLevel2 + scoreLevel3
    val averageScore = totalScore / 3
    println(totalScore)
    println(averageScore)

    // Task 3
    val boostMultiplier = 4
    val scoreBoost = totalScore * boostMultiplier
    val finalBoostedScore = totalScore + scoreBoost

    println(scoreBoost)
    println(finalBoostedScore)


}