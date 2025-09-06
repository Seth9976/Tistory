package hg;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;

public final class g extends Lambda implements Function1 {
    public final int w;
    public final KSerializer x;
    public final KSerializer y;

    public g(KSerializer kSerializer0, KSerializer kSerializer1, int v) {
        this.w = v;
        this.x = kSerializer0;
        this.y = kSerializer1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((ClassSerialDescriptorBuilder)object0), "$this$buildClassSerialDescriptor");
            ClassSerialDescriptorBuilder.element$default(((ClassSerialDescriptorBuilder)object0), "first", this.x.getDescriptor(), null, false, 12, null);
            ClassSerialDescriptorBuilder.element$default(((ClassSerialDescriptorBuilder)object0), "second", this.y.getDescriptor(), null, false, 12, null);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(((ClassSerialDescriptorBuilder)object0), "$this$buildSerialDescriptor");
        ClassSerialDescriptorBuilder.element$default(((ClassSerialDescriptorBuilder)object0), "key", this.x.getDescriptor(), null, false, 12, null);
        ClassSerialDescriptorBuilder.element$default(((ClassSerialDescriptorBuilder)object0), "value", this.y.getDescriptor(), null, false, 12, null);
        return Unit.INSTANCE;
    }
}

