class Player(val name: String, val surName: String) {

    var totalScore: Double = 0.0
    var personalBestScore: Double = 0.0
    fun fullName(): String{
        val fullName = "$name $surName"
    return fullName
    }
}

class Scores(){

    fun checkScore(best: Double,current: Double): Double{
    if (best < current){

        return current
    }
        return best

    }
}

fun main(){

    val P1 = Player("Nicola", "Tesla")
    val P2 = Player("Thomas", "Edison")

    val scoring = Scores()
    var lvlScore: Double = 0.0

    // Level 1
    lvlScore = 12.0
    P1.totalScore += lvlScore// use the combined operator (+=) to add the lvlScore to totalScore
    // supply the parameters for the checkBest function by accessing the Player properties
    P1.personalBestScore = scoring.checkScore(P1.personalBestScore,lvlScore)

    lvlScore = 34.0
    P2.totalScore += lvlScore
    P2.personalBestScore = scoring.checkScore(P2.personalBestScore,lvlScore)

    // Level 2
    lvlScore = 56.0 // insert simulated values for level score
    P1.totalScore += lvlScore // use the combined operator (+=) to add the lvlScore to totalScore
    // supply the parameters for the checkBest function by accessing the Player properties
    P1.personalBestScore = scoring.checkScore(P1.personalBestScore,lvlScore)

    lvlScore = 78.0 // insert simulated values for level score
    P2.totalScore += lvlScore
    P2.personalBestScore = scoring.checkScore(P2.personalBestScore,lvlScore)

    // Level 3
    lvlScore = 99.0 // insert simulated values for level score
    P1.totalScore += lvlScore // use the combined operator (+=) to add the lvlScore to totalScore
    // supply the parameters for the checkBest function by accessing the Player properties
    P1.personalBestScore = scoring.checkScore(P1.personalBestScore,lvlScore)

    lvlScore = 10.0
    P2.totalScore += lvlScore
    P2.personalBestScore = scoring.checkScore(P2.personalBestScore,lvlScore)

    // conditional check using an if statement to determine the winner
    if(P1.totalScore > P2.totalScore) {
    // access the Player properties to construct the String to print
        println("The winner is "+ P1.fullName() +  " with a Score of  "+P1.totalScore)
        println("Personal Best Score is = " +P1.personalBestScore)
    }
    else {
        println("The winner is "+ P2.fullName() + " with a Score of "+P2.totalScore)
        println("Personal Best Score is = " +P2.personalBestScore)
    }

}
