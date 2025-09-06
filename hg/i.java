package hg;

import fg.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.StructureKind.OBJECT;
import kotlinx.serialization.internal.ObjectSerializer;

public final class i extends Lambda implements Function0 {
    public final String w;
    public final ObjectSerializer x;

    public i(String s, ObjectSerializer objectSerializer0) {
        this.w = s;
        this.x = objectSerializer0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        c c0 = new c(this.x, 4);
        return SerialDescriptorsKt.buildSerialDescriptor(this.w, OBJECT.INSTANCE, new SerialDescriptor[0], c0);
    }
}

