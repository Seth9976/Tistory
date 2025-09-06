package a;

import androidx.compose.ui.graphics.Color;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind.LONG;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class a implements KSerializer {
    public static final a a;
    public static final SerialDescriptor b;

    static {
        a.a = new a();
        a.b = SerialDescriptorsKt.PrimitiveSerialDescriptor("Color", LONG.INSTANCE);
    }

    @Override  // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder0) {
        Intrinsics.checkNotNullParameter(decoder0, "decoder");
        return Color.box-impl(Color.constructor-impl(ULong.constructor-impl(decoder0.decodeLong())));
    }

    @Override  // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return a.b;
    }

    @Override  // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder0, Object object0) {
        long v = ((Color)object0).unbox-impl();
        Intrinsics.checkNotNullParameter(encoder0, "encoder");
        encoder0.encodeLong(v);
    }
}

