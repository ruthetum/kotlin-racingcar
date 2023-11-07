package racingcar.view

import racingcar.domain.Car
import racingcar.domain.Cars

class ResultView {

    companion object {
        private const val POSITION_SYMBOL = "-"

        fun printResultStart() {
            println("\n실행 결과")
        }

        fun printResult(cars: Cars) {
            for (car in cars.getCars()) {
                println(concatCarNameAndPosition(car))
            }
            println()
        }

        private fun concatCarNameAndPosition(car: Car): String {
            val msg = StringBuilder()
            msg.append(car.name.name)
            msg.append(" : ")
            msg.append(POSITION_SYMBOL.repeat(car.position.position))
            return msg.toString()
        }

        fun printWinners(car: Cars) {
            val winnerNames = car.getWinners().map { it.name.name }
            println("${winnerNames.joinToString()}가 최종 우승했습니다.")
        }
    }
}
