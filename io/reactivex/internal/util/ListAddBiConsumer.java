package io.reactivex.internal.util;

import io.reactivex.functions.BiFunction;
import java.util.List;

public enum ListAddBiConsumer implements BiFunction {
    INSTANCE;

    @Override  // io.reactivex.functions.BiFunction
    public Object apply(Object object0, Object object1) throws Exception {
        return this.apply(((List)object0), object1);
    }

    public List apply(List list0, Object object0) throws Exception {
        list0.add(object0);
        return list0;
    }

    public static BiFunction instance() {
        return ListAddBiConsumer.INSTANCE;
    }
}

