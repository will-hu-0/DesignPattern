package org.example.InterceptingFilterPattern;

/**
 * Created by will on 8/18/15.
 */
public class FilterManager {
    FilterChain filterChain;

    public FilterManager (Target target) {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(IFilter filter) {
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request) {
        filterChain.execute(request);
    }
}
