import com.aor.numbers.DivisibleByFilter
import spock.lang.Specification

class DivideByTest extends Specification{
    def "Divide by"(){
        def divibleByFilter = new DivisibleByFilter(2)

        expect:
            divibleByFilter.accept(3) == false
            divibleByFilter.accept(10) == true
    }
}
