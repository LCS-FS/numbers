import com.aor.numbers.DivisibleByFilter
import spock.lang.Specification

class DivideByTest extends Specification{
    def "Divide by"(){
        def divideByFilter = new DivisibleByFilter(2)

        expect:
            divideByFilter.accept(3) == false
            divideByFilter.accept(10) == true
    }
}
