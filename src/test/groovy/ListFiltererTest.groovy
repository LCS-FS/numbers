import com.aor.numbers.GenericListFilter
import com.aor.numbers.ListFilterer
import spock.lang.Specification

class ListFiltererTest extends Specification{
    private List list
    def "setup"(){
        list = Arrays.asList(1,-2, 4, 3, 10, -5)
    }

    def "filter groovy"(){
        def filter = Mock(GenericListFilter)
        filter.accept(1) >> true
        filter.accept(-2) >> false
        filter.accept(4) >> true
        filter.accept(3) >> true
        filter.accept(10) >> true
        filter.accept(-5) >> false

        def listFilterer = new ListFilterer(filter)

        expect:
            listFilterer.filter(list)
    }
}
