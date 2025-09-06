package fe;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.CacheByClass;

public final class b extends CacheByClass {
    public final Function1 a;
    public final ConcurrentHashMap b;

    public b(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "compute");
        super();
        this.a = function10;
        this.b = new ConcurrentHashMap();
    }

    @Override  // kotlin.reflect.jvm.internal.CacheByClass
    public final void clear() {
        this.b.clear();
    }

    @Override  // kotlin.reflect.jvm.internal.CacheByClass
    public final Object get(Class class0) {
        Intrinsics.checkNotNullParameter(class0, "key");
        ConcurrentHashMap concurrentHashMap0 = this.b;
        Object object0 = concurrentHashMap0.get(class0);
        if(object0 == null) {
            object0 = this.a.invoke(class0);
            Object object1 = concurrentHashMap0.putIfAbsent(class0, object0);
            return object1 == null ? object0 : object1;
        }
        return object0;
    }
}

