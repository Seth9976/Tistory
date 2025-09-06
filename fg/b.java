package fg;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.PolymorphicKind.OPEN;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;

public final class b extends Lambda implements Function0 {
    public final PolymorphicSerializer w;

    public b(PolymorphicSerializer polymorphicSerializer0) {
        this.w = polymorphicSerializer0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        a a0 = new a(this.w);
        return ContextAwareKt.withContext(SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.Polymorphic", OPEN.INSTANCE, new SerialDescriptor[0], a0), this.w.getBaseClass());
    }
}

