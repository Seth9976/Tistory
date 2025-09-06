package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

public final class v extends Lambda implements Function0 {
    public final Data w;
    public final KClassImpl x;

    public v(Data kClassImpl$Data0, KClassImpl kClassImpl0) {
        this.w = kClassImpl$Data0;
        this.x = kClassImpl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list0 = this.w.getDescriptor().getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(list0, "descriptor.declaredTypeParameters");
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            Intrinsics.checkNotNullExpressionValue(((TypeParameterDescriptor)object0), "descriptor");
            arrayList0.add(new KTypeParameterImpl(this.x, ((TypeParameterDescriptor)object0)));
        }
        return arrayList0;
    }
}

