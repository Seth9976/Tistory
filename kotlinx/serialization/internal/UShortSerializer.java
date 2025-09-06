package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\t\u001A\u00020\u00062\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\u000E\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\nH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u001A\u0010\u0014\u001A\u00020\u000F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Lkotlinx/serialization/internal/UShortSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/UShort;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize-i8woANY", "(Lkotlinx/serialization/encoding/Encoder;S)V", "serialize", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize-BwKQO78", "(Lkotlinx/serialization/encoding/Decoder;)S", "deserialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@PublishedApi
public final class UShortSerializer implements KSerializer {
    @NotNull
    public static final UShortSerializer INSTANCE;
    public static final SerialDescriptor a;

    static {
        UShortSerializer.INSTANCE = new UShortSerializer();  // 初始化器: Ljava/lang/Object;-><init>()V
        UShortSerializer.a = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlin.UShort", BuiltinSerializersKt.serializer(ShortCompanionObject.INSTANCE));
    }

    @Override  // kotlinx.serialization.DeserializationStrategy
    public Object deserialize(Decoder decoder0) {
        return UShort.box-impl(this.deserialize-BwKQO78(decoder0));
    }

    public short deserialize-BwKQO78(@NotNull Decoder decoder0) {
        Intrinsics.checkNotNullParameter(decoder0, "decoder");
        return UShort.constructor-impl(decoder0.decodeInline(this.getDescriptor()).decodeShort());
    }

    @Override  // kotlinx.serialization.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return UShortSerializer.a;
    }

    @Override  // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder0, Object object0) {
        this.serialize-i8woANY(encoder0, ((UShort)object0).unbox-impl());
    }

    public void serialize-i8woANY(@NotNull Encoder encoder0, short v) {
        Intrinsics.checkNotNullParameter(encoder0, "encoder");
        encoder0.encodeInline(this.getDescriptor()).encodeShort(v);
    }
}

