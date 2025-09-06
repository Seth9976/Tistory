package io.reactivex.internal.util;

import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class SorterFunction implements Function {
    public final Comparator a;

    public SorterFunction(Comparator comparator0) {
        this.a = comparator0;
    }

    @Override  // io.reactivex.functions.Function
    public Object apply(Object object0) throws Exception {
        return this.apply(((List)object0));
    }

    public List apply(List list0) throws Exception {
        Collections.sort(list0, this.a);
        return list0;
    }
}

