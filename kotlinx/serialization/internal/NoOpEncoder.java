package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\u0007\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\r\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0010\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001AJ\u0017\u0010\u001C\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u001BH\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ\u0017\u0010\u001F\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u001EH\u0016¢\u0006\u0004\b\u001F\u0010 J\u0017\u0010\"\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001F\u0010\'\u001A\u00020\u00042\u0006\u0010%\u001A\u00020$2\u0006\u0010&\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\'\u0010(R\u001A\u0010.\u001A\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lkotlinx/serialization/internal/NoOpEncoder;", "Lkotlinx/serialization/encoding/AbstractEncoder;", "", "value", "", "encodeValue", "(Ljava/lang/Object;)V", "encodeNull", "()V", "", "encodeBoolean", "(Z)V", "", "encodeByte", "(B)V", "", "encodeShort", "(S)V", "", "encodeInt", "(I)V", "", "encodeLong", "(J)V", "", "encodeFloat", "(F)V", "", "encodeDouble", "(D)V", "", "encodeChar", "(C)V", "", "encodeString", "(Ljava/lang/String;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "enumDescriptor", "index", "encodeEnum", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "Lkotlinx/serialization/modules/SerializersModule;", "a", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class NoOpEncoder extends AbstractEncoder {
    @NotNull
    public static final NoOpEncoder INSTANCE;
    public static final SerializersModule a;

    static {
        NoOpEncoder.INSTANCE = new NoOpEncoder();  // 初始化器: Lkotlinx/serialization/encoding/AbstractEncoder;-><init>()V
        NoOpEncoder.a = SerializersModuleBuildersKt.EmptySerializersModule();
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder
    public void encodeBoolean(boolean z) {
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder
    public void encodeByte(byte b) {
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder
    public void encodeChar(char c) {
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder
    public void encodeDouble(double f) {
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder
    public void encodeEnum(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "enumDescriptor");
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder
    public void encodeFloat(float f) {
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder
    public void encodeInt(int v) {
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder
    public void encodeLong(long v) {
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder
    public void encodeNull() {
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder
    public void encodeShort(short v) {
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder
    public void encodeString(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
    }

    @Override  // kotlinx.serialization.encoding.AbstractEncoder
    public void encodeValue(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "value");
    }

    @Override  // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    @NotNull
    public SerializersModule getSerializersModule() {
        return NoOpEncoder.a;
    }
}

