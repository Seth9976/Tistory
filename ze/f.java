package ze;

import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;

public final class f implements Function2 {
    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return new Pair(((CallableDescriptor)object0), ((CallableDescriptor)object1));
    }
}

