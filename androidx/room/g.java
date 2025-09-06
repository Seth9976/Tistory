package androidx.room;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class g extends Lambda implements Function1 {
    public final ObjectRef w;

    public g(ObjectRef ref$ObjectRef0) {
        this.w = ref$ObjectRef0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((List)object0), "it");
        d d0 = d.d.build(((List)object0));
        ObjectRef ref$ObjectRef0 = this.w;
        d d1 = (d)ref$ObjectRef0.element;
        d0.getClass();
        Intrinsics.checkNotNullParameter(d1, "other");
        if((Intrinsics.compare(d0.c, d1.c) == 0 ? Intrinsics.compare(d0.b, d1.b) : Intrinsics.compare(d0.c, d1.c)) < 0) {
            ref$ObjectRef0.element = d0;
        }
        return Unit.INSTANCE;
    }
}

