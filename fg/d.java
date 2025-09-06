package fg;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind.CONTEXTUAL;

public final class d extends Lambda implements Function1 {
    public final SealedClassSerializer w;

    public d(SealedClassSerializer sealedClassSerializer0) {
        this.w = sealedClassSerializer0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ClassSerialDescriptorBuilder)object0), "$this$buildSerialDescriptor");
        ClassSerialDescriptorBuilder.element$default(((ClassSerialDescriptorBuilder)object0), "type", BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE).getDescriptor(), null, false, 12, null);
        c c0 = new c(this.w, 0);
        ClassSerialDescriptorBuilder.element$default(((ClassSerialDescriptorBuilder)object0), "value", SerialDescriptorsKt.buildSerialDescriptor(("kotlinx.serialization.Sealed<" + this.w.getBaseClass().getSimpleName() + '>'), CONTEXTUAL.INSTANCE, new SerialDescriptor[0], c0), null, false, 12, null);
        ((ClassSerialDescriptorBuilder)object0).setAnnotations(SealedClassSerializer.access$get_annotations$p(this.w));
        return Unit.INSTANCE;
    }
}

