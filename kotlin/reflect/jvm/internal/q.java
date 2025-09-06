package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

public final class q extends Lambda implements Function0 {
    public final Data w;

    public q(Data kClassImpl$Data0) {
        this.w = kClassImpl$Data0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Collection collection0 = this.w.getDescriptor().getSealedSubclasses();
        Intrinsics.checkNotNullExpressionValue(collection0, "descriptor.sealedSubclasses");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: collection0) {
            Intrinsics.checkNotNull(((ClassDescriptor)object0), "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class class0 = UtilKt.toJavaClass(((ClassDescriptor)object0));
            KClassImpl kClassImpl0 = class0 == null ? null : new KClassImpl(class0);
            if(kClassImpl0 != null) {
                arrayList0.add(kClassImpl0);
            }
        }
        return arrayList0;
    }
}

