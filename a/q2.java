package a;

import androidx.compose.ui.text.style.TextAlign;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind.INT;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class q2 implements KSerializer {
    public static final q2 a;
    public static final SerialDescriptor b;

    static {
        q2.a = new q2();
        q2.b = SerialDescriptorsKt.PrimitiveSerialDescriptor("TextAlign", INT.INSTANCE);
    }

    @Override  // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder0) {
        Intrinsics.checkNotNullParameter(decoder0, "decoder");
        return TextAlign.box-impl(((TextAlign)TextAlign.Companion.values().get(decoder0.decodeInt())).unbox-impl());
    }

    @Override  // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return q2.b;
    }

    @Override  // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder0, Object object0) {
        int v = ((TextAlign)object0).unbox-impl();
        Intrinsics.checkNotNullParameter(encoder0, "encoder");
        encoder0.encodeInt(TextAlign.Companion.values().indexOf(TextAlign.box-impl(v)));
    }
}

