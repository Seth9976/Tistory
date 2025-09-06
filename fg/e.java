package fg;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.descriptors.PolymorphicKind.SEALED;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;

public final class e extends Lambda implements Function0 {
    public final String w;
    public final SealedClassSerializer x;

    public e(String s, SealedClassSerializer sealedClassSerializer0) {
        this.w = s;
        this.x = sealedClassSerializer0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        d d0 = new d(this.x);
        return SerialDescriptorsKt.buildSerialDescriptor(this.w, SEALED.INSTANCE, new SerialDescriptor[0], d0);
    }
}

