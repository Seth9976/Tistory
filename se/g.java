package se;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.l;
import kotlin.collections.w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;

public final class g extends Lambda implements Function0 {
    public final int w;
    public final LazyJavaClassMemberScope x;

    public g(LazyJavaClassMemberScope lazyJavaClassMemberScope0, int v) {
        this.w = v;
        this.x = lazyJavaClassMemberScope0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                Iterable iterable0 = this.x.n.getFields();
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: iterable0) {
                    if(((JavaField)object0).isEnumEntry()) {
                        arrayList0.add(object0);
                    }
                }
                LinkedHashMap linkedHashMap0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(l.collectionSizeOrDefault(arrayList0, 10)), 16));
                for(Object object1: arrayList0) {
                    linkedHashMap0.put(((JavaField)object1).getName(), object1);
                }
                return linkedHashMap0;
            }
            case 1: {
                return CollectionsKt___CollectionsKt.toSet(this.x.n.getInnerClassNames());
            }
            default: {
                return g0.plus(this.x.getFunctionNames(), this.x.getVariableNames());
            }
        }
    }
}

