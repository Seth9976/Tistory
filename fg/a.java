package fg;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind.CONTEXTUAL;

public final class a extends Lambda implements Function1 {
    public final PolymorphicSerializer w;

    public a(PolymorphicSerializer polymorphicSerializer0) {
        this.w = polymorphicSerializer0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ClassSerialDescriptorBuilder)object0), "$this$buildSerialDescriptor");
        ClassSerialDescriptorBuilder.element$default(((ClassSerialDescriptorBuilder)object0), "type", BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE).getDescriptor(), null, false, 12, null);
        ClassSerialDescriptorBuilder.element$default(((ClassSerialDescriptorBuilder)object0), "value", SerialDescriptorsKt.buildSerialDescriptor$default(("kotlinx.serialization.Polymorphic<" + this.w.getBaseClass().getSimpleName() + '>'), CONTEXTUAL.INSTANCE, new SerialDescriptor[0], null, 8, null), null, false, 12, null);
        ((ClassSerialDescriptorBuilder)object0).setAnnotations(PolymorphicSerializer.access$get_annotations$p(this.w));
        return Unit.INSTANCE;
    }
}

