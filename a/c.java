package a;

import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind.LONG;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class c implements KSerializer {
    public static final c a;
    public static final SerialDescriptor b;

    static {
        c.a = new c();
        c.b = SerialDescriptorsKt.PrimitiveSerialDescriptor("IntSize", LONG.INSTANCE);
    }

    @Override  // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder0) {
        Intrinsics.checkNotNullParameter(decoder0, "decoder");
        long v = decoder0.decodeLong();
        return IntSize.box-impl(IntSizeKt.IntSize(((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL))));
    }

    @Override  // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return c.b;
    }

    @Override  // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder0, Object object0) {
        long v = ((IntSize)object0).unbox-impl();
        Intrinsics.checkNotNullParameter(encoder0, "encoder");
        encoder0.encodeLong(((long)IntSize.getWidth-impl(v)) << 0x20 | ((long)IntSize.getHeight-impl(v)) & 0xFFFFFFFFL);
    }
}

