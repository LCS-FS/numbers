import com.aor.numbers.ListSorter
import spock.lang.Specification

class ListSorterTest extends Specification{
    private List list, expected

    def "setup"(){
        list = Arrays.asList(3, 2, 6, 1, 4, 5, 7)
        expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7)
    }

    def "sort groovy"(){
        def sorter = new ListSorter()
        expect:
            sorter.sort(list) == expected
    }
}
