package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UInt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\t\u001A\u00020\u00062\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\u000E\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\nH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u001A\u0010\u0014\u001A\u00020\u000F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Lkotlinx/serialization/internal/UIntSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/UInt;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize-Qn1smSk", "(Lkotlinx/serialization/encoding/Encoder;I)V", "serialize", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize-OGnWXxg", "(Lkotlinx/serialization/encoding/Decoder;)I", "deserialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@PublishedApi
public final class UIntSerializer implements KSerializer {
    @NotNull
    public static final UIntSerializer INSTANCE;
    public static final SerialDescriptor a;

    static {
        UIntSerializer.INSTANCE = new UIntSerializer();  // 初始化器: Ljava/lang/Object;-><init>()V
        UIntSerializer.a = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlin.UInt", BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE));
    }

    @Override  // kotlinx.serialization.DeserializationStrategy
    public Object deserialize(Decoder decoder0) {
        return UInt.box-impl(this.deserialize-OGnWXxg(decoder0));
    }

    public int deserialize-OGnWXxg(@NotNull Decoder decoder0) {
        Intrinsics.checkNotNullParameter(decoder0, "decoder");
        return UInt.constructor-impl(decoder0.decodeInline(this.getDescriptor()).decodeInt());
    }

    @Override  // kotlinx.serialization.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return UIntSerializer.a;
    }

    @Override  // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder0, Object object0) {
        this.serialize-Qn1smSk(encoder0, ((UInt)object0).unbox-impl());
    }

    public void serialize-Qn1smSk(@NotNull Encoder encoder0, int v) {
        Intrinsics.checkNotNullParameter(encoder0, "encoder");
        encoder0.encodeInline(this.getDescriptor()).encodeInt(v);
    }
}

