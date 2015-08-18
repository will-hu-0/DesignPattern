package InterceptingFilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by will on 8/18/15.
 */
public class FilterChain {
    private List<IFilter> filters = new ArrayList<>();
    private Target target;

    public void addFilter(IFilter filter) {
        filters.add(filter);
    }

    public void execute(String request) {
        for( IFilter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
