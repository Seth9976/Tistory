package a;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind.LONG;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class p2 implements KSerializer {
    public static final p2 a;
    public static final SerialDescriptor b;

    static {
        p2.a = new p2();
        p2.b = SerialDescriptorsKt.PrimitiveSerialDescriptor("Size", LONG.INSTANCE);
    }

    @Override  // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder0) {
        Intrinsics.checkNotNullParameter(decoder0, "decoder");
        long v = decoder0.decodeLong();
        return Size.box-impl(SizeKt.Size(Float.intBitsToFloat(((int)(v >> 0x20))), Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)))));
    }

    @Override  // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return p2.b;
    }

    @Override  // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder0, Object object0) {
        long v = ((Size)object0).unbox-impl();
        Intrinsics.checkNotNullParameter(encoder0, "encoder");
        encoder0.encodeLong(((long)Float.floatToRawIntBits(Size.getWidth-impl(v))) << 0x20 | ((long)Float.floatToRawIntBits(Size.getHeight-impl(v))) & 0xFFFFFFFFL);
    }
}

