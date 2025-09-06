package q4;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ContextAwareKt;
import r0.a;

public final class b extends Lambda implements Function0 {
    public final int w;
    public final KSerializer x;

    public b(KSerializer kSerializer0, int v) {
        this.w = v;
        this.x = kSerializer0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w == 0) {
            throw new IllegalArgumentException("Cannot generate NavArguments for polymorphic serializer " + this.x + ". Arguments can only be generated from concrete classes or objects.");
        }
        StringBuilder stringBuilder0 = new StringBuilder("Cannot generate route pattern from polymorphic class ");
        KClass kClass0 = ContextAwareKt.getCapturedKClass(this.x.getDescriptor());
        throw new IllegalArgumentException(a.o(stringBuilder0, (kClass0 == null ? null : kClass0.getSimpleName()), ". Routes can only be generated from concrete classes or objects."));
    }
}

