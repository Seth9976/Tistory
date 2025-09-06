package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\t\u001A\u00020\u00062\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\u000E\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\nH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u001A\u0010\u0014\u001A\u00020\u000F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Lkotlinx/serialization/internal/UByteSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/UByte;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize-EK-6454", "(Lkotlinx/serialization/encoding/Encoder;B)V", "serialize", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize-Wa3L5BU", "(Lkotlinx/serialization/encoding/Decoder;)B", "deserialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@PublishedApi
public final class UByteSerializer implements KSerializer {
    @NotNull
    public static final UByteSerializer INSTANCE;
    public static final SerialDescriptor a;

    static {
        UByteSerializer.INSTANCE = new UByteSerializer();  // 初始化器: Ljava/lang/Object;-><init>()V
        UByteSerializer.a = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlin.UByte", BuiltinSerializersKt.serializer(ByteCompanionObject.INSTANCE));
    }

    @Override  // kotlinx.serialization.DeserializationStrategy
    public Object deserialize(Decoder decoder0) {
        return UByte.box-impl(this.deserialize-Wa3L5BU(decoder0));
    }

    public byte deserialize-Wa3L5BU(@NotNull Decoder decoder0) {
        Intrinsics.checkNotNullParameter(decoder0, "decoder");
        return UByte.constructor-impl(decoder0.decodeInline(this.getDescriptor()).decodeByte());
    }

    @Override  // kotlinx.serialization.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return UByteSerializer.a;
    }

    @Override  // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder0, Object object0) {
        this.serialize-EK-6454(encoder0, ((UByte)object0).unbox-impl());
    }

    public void serialize-EK-6454(@NotNull Encoder encoder0, byte b) {
        Intrinsics.checkNotNullParameter(encoder0, "encoder");
        encoder0.encodeInline(this.getDescriptor()).encodeByte(b);
    }
}

