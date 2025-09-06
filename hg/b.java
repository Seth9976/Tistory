package hg;

import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.ClassValueCache.get..inlined.getOrSet.1;
import kotlinx.serialization.internal.SerializerCache;

public final class b implements SerializerCache {
    public final Function1 a;
    public final c b;

    public b(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "compute");
        super();
        this.a = function10;
        this.b = new c();
    }

    @Override  // kotlinx.serialization.internal.SerializerCache
    public final KSerializer get(KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "key");
        Class class0 = JvmClassMappingKt.getJavaClass(kClass0);
        Object object0 = this.b.get(class0);
        Intrinsics.checkNotNullExpressionValue(object0, "get(...)");
        Object object1 = ((h)object0).a.get();
        if(object1 == null) {
            object1 = ((h)object0).a(new ClassValueCache.get..inlined.getOrSet.1(this, kClass0));
        }
        return ((a)object1).a;
    }
}

