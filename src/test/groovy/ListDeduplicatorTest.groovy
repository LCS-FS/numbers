import com.aor.numbers.GenericListFilter
import com.aor.numbers.GenericListSorter
import com.aor.numbers.ListDeduplicator
import org.mockito.Mock
import spock.lang.Specification

class ListDeduplicatorTest extends Specification{
    private def list, expected

    def "setup"(){
        list = Arrays.asList(1, 2, 4, 2, 5)
        expected = Arrays.asList(1, 2, 4, 5)
    }

    def "deduplicate groovy"(){
        def sorter = Mock(GenericListSorter)
        sorter.sort(list) >> Arrays.asList(1, 2, 2, 4, 5)

        def deduplicator = new ListDeduplicator(sorter)
        expect:
            deduplicator.deduplicate(list) == expected
    }
}
