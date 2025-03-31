// https://www.acmicpc.net/problem/1010

/**

M개에서 N개를 고르는 경우의 수
DP를 활용하면 되는 문제


 */
fun main() {
    val t = readln().toInt() // 테스트 케이스 수
    val dp = Array(31) { IntArray(31) }

    // 조합 테이블 초기화
    for (i in 0..30) {
        dp[i][0] = 1
        dp[i][i] = 1
        for (j in 1 until i) {
            dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j]
        }
    }

    // 입력 처리
    repeat(t) {
        val (n, m) = readln().split(" ").map { it.toInt() }
        println(dp[m][n])
    }
}



class Solution {

    fun test() {

        val left = BooleanArray(3)
        val right = BooleanArray(5)

        left.forEach { leftSide ->

            right

        }

    }


    /*

    0번째 -> 0번째
    1번 -> 1번
    2번 -> 2번
    3번 -> 3번
    4번 -> 4번

    4번 -> 5번

    3번 -> 4번
    4번 -> 5번



     */

    fun again(left: BooleanArray, right: BooleanArray, leftIndex: Int, rightIndex: Int) {
        if (rightIndex >= right.size) {
            return
        } else {
            if (!right[rightIndex]) {
//                again()
            }
        }

    }

}