import com.aor.numbers.PositiveFilter
import spock.lang.Specification

class PositiveFilterTest extends Specification{
    private int number1, number2, number3

    def "setup"(){
        number1 = 10
        number2 = -10
        number3 = 0
    }

    def "pos filter test groovy"(){
        PositiveFilter positiveFilter = new PositiveFilter()
        expect:
            positiveFilter.accept(number1) == true
            positiveFilter.accept(number2) == false
            positiveFilter.accept(number3) == false
    }
}
