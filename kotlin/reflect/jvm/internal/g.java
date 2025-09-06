package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;

public final class g extends Lambda implements Function0 {
    public final KClassImpl w;

    public g(KClassImpl kClassImpl0) {
        this.w = kClassImpl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KClassImpl kClassImpl0 = this.w;
        Iterable iterable0 = kClassImpl0.getConstructorDescriptors();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(new KFunctionImpl(kClassImpl0, ((ConstructorDescriptor)object0)));
        }
        return arrayList0;
    }
}

