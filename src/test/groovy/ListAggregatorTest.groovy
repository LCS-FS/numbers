import com.aor.numbers.GenericListDeduplicator
import com.aor.numbers.ListAggregator
import spock.lang.Specification

class ListAggregatorTest extends Specification {
    private def list

    def "setup"(){
        list = Arrays.asList(1, 2, 4, 2, 5)
    }

    def "sum groovy"(){
        def aggregator = new ListAggregator()
        expect:
            aggregator.sum(list) == 14
    }

    def "max groovy"(){
        def aggregator = new ListAggregator()
        expect:
            aggregator.max(list) == 5
    }

    def "min groovy"(){
        def aggregator = new ListAggregator()
        expect:
        aggregator.min(list) == 1
    }

    def "distinct groovy"(){
        def aggregator = new ListAggregator()
        def deduplicator = Mock(GenericListDeduplicator)
        deduplicator.deduplicate(list) >> Arrays.asList(1, 2, 4)

        expect:
        aggregator.distinct(list) == 4
    }
}
