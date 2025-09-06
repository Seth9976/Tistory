package a;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind.LONG;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class m2 implements KSerializer {
    public static final m2 a;
    public static final SerialDescriptor b;

    static {
        m2.a = new m2();
        m2.b = SerialDescriptorsKt.PrimitiveSerialDescriptor("Offset", LONG.INSTANCE);
    }

    @Override  // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder0) {
        Intrinsics.checkNotNullParameter(decoder0, "decoder");
        long v = decoder0.decodeLong();
        return Offset.box-impl(OffsetKt.Offset(Float.intBitsToFloat(((int)(v >> 0x20))), Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)))));
    }

    @Override  // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return m2.b;
    }

    @Override  // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder0, Object object0) {
        long v = ((Offset)object0).unbox-impl();
        Intrinsics.checkNotNullParameter(encoder0, "encoder");
        encoder0.encodeLong(((long)Float.floatToRawIntBits(Offset.getX-impl(v))) << 0x20 | ((long)Float.floatToRawIntBits(Offset.getY-impl(v))) & 0xFFFFFFFFL);
    }
}

