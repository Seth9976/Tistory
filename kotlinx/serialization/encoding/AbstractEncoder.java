package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.NoOpEncoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\b\'\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00A2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u0010\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH\u0016J\u001E\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\t\u001A\u00020\nJ\u0010\u0010\u000E\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\u000FH\u0016J\u001E\u0010\u0010\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\t\u001A\u00020\u000FJ\u0010\u0010\u0011\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\u0012H\u0016J\u001E\u0010\u0013\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\t\u001A\u00020\u0012J\u0010\u0010\u0014\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\u0015H\u0016J\u001E\u0010\u0016\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\t\u001A\u00020\u0015J\u0018\u0010\u0017\u001A\u00020\n2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\rH\u0016J\u0018\u0010\u0018\u001A\u00020\b2\u0006\u0010\u0019\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\rH\u0016J\u0010\u0010\u001A\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\u001BH\u0016J\u001E\u0010\u001C\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\t\u001A\u00020\u001BJ\u0010\u0010\u001D\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u0016\u0010\u001E\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\rJ\u0010\u0010\u001F\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\rH\u0016J\u001E\u0010 \u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\t\u001A\u00020\rJ\u0010\u0010!\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\"H\u0016J\u001E\u0010#\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\t\u001A\u00020\"J\b\u0010$\u001A\u00020\bH\u0016J?\u0010%\u001A\u00020\b\"\b\b\u0000\u0010&*\u00020\'2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\r2\f\u0010(\u001A\b\u0012\u0004\u0012\u0002H&0)2\b\u0010\t\u001A\u0004\u0018\u0001H&H\u0016\u00A2\u0006\u0002\u0010*J9\u0010+\u001A\u00020\b\"\u0004\b\u0000\u0010&2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\r2\f\u0010(\u001A\b\u0012\u0004\u0012\u0002H&0)2\u0006\u0010\t\u001A\u0002H&H\u0016\u00A2\u0006\u0002\u0010*J\u0010\u0010,\u001A\u00020\b2\u0006\u0010\t\u001A\u00020-H\u0016J\u001E\u0010.\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\t\u001A\u00020-J\u0010\u0010/\u001A\u00020\b2\u0006\u0010\t\u001A\u000200H\u0016J\u001E\u00101\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\t\u001A\u000200J\u0010\u00102\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\'H\u0016J\u0010\u00103\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u0006H\u0016\u00A8\u00064"}, d2 = {"Lkotlinx/serialization/encoding/AbstractEncoder;", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "()V", "beginStructure", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "encodeBoolean", "", "value", "", "encodeBooleanElement", "index", "", "encodeByte", "", "encodeByteElement", "encodeChar", "", "encodeCharElement", "encodeDouble", "", "encodeDoubleElement", "encodeElement", "encodeEnum", "enumDescriptor", "encodeFloat", "", "encodeFloatElement", "encodeInline", "encodeInlineElement", "encodeInt", "encodeIntElement", "encodeLong", "", "encodeLongElement", "encodeNull", "encodeNullableSerializableElement", "T", "", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "encodeSerializableElement", "encodeShort", "", "encodeShortElement", "encodeString", "", "encodeStringElement", "encodeValue", "endStructure", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@ExperimentalSerializationApi
public abstract class AbstractEncoder implements CompositeEncoder, Encoder {
    @Override  // kotlinx.serialization.encoding.Encoder
    @NotNull
    public CompositeEncoder beginCollection(@NotNull SerialDescriptor serialDescriptor0, int v) {
        return DefaultImpls.beginCollection(this, serialDescriptor0, v);
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    @NotNull
    public CompositeEncoder beginStructure(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this;
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    public void encodeBoolean(boolean z) {
        this.encodeValue(Boolean.valueOf(z));
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeBooleanElement(@NotNull SerialDescriptor serialDescriptor0, int v, boolean z) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        if(this.encodeElement(serialDescriptor0, v)) {
            this.encodeBoolean(z);
        }
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    public void encodeByte(byte b) {
        this.encodeValue(b);
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeByteElement(@NotNull SerialDescriptor serialDescriptor0, int v, byte b) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        if(this.encodeElement(serialDescriptor0, v)) {
            this.encodeByte(b);
        }
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    public void encodeChar(char c) {
        this.encodeValue(Character.valueOf(c));
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeCharElement(@NotNull SerialDescriptor serialDescriptor0, int v, char c) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        if(this.encodeElement(serialDescriptor0, v)) {
            this.encodeChar(c);
        }
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    public void encodeDouble(double f) {
        this.encodeValue(f);
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeDoubleElement(@NotNull SerialDescriptor serialDescriptor0, int v, double f) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        if(this.encodeElement(serialDescriptor0, v)) {
            this.encodeDouble(f);
        }
    }

    public boolean encodeElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return true;
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    public void encodeEnum(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "enumDescriptor");
        this.encodeValue(v);
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    public void encodeFloat(float f) {
        this.encodeValue(f);
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeFloatElement(@NotNull SerialDescriptor serialDescriptor0, int v, float f) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        if(this.encodeElement(serialDescriptor0, v)) {
            this.encodeFloat(f);
        }
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    @NotNull
    public Encoder encodeInline(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this;
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    @NotNull
    public final Encoder encodeInlineElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.encodeElement(serialDescriptor0, v) ? this.encodeInline(serialDescriptor0.getElementDescriptor(v)) : NoOpEncoder.INSTANCE;
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    public void encodeInt(int v) {
        this.encodeValue(v);
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeIntElement(@NotNull SerialDescriptor serialDescriptor0, int v, int v1) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        if(this.encodeElement(serialDescriptor0, v)) {
            this.encodeInt(v1);
        }
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    public void encodeLong(long v) {
        this.encodeValue(v);
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeLongElement(@NotNull SerialDescriptor serialDescriptor0, int v, long v1) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        if(this.encodeElement(serialDescriptor0, v)) {
            this.encodeLong(v1);
        }
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    @ExperimentalSerializationApi
    public void encodeNotNullMark() {
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        throw new SerializationException("\'null\' is not supported by default");
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    public void encodeNullableSerializableElement(@NotNull SerialDescriptor serialDescriptor0, int v, @NotNull SerializationStrategy serializationStrategy0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(serializationStrategy0, "serializer");
        if(this.encodeElement(serialDescriptor0, v)) {
            this.encodeNullableSerializableValue(serializationStrategy0, object0);
        }
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    @ExperimentalSerializationApi
    public void encodeNullableSerializableValue(@NotNull SerializationStrategy serializationStrategy0, @Nullable Object object0) {
        DefaultImpls.encodeNullableSerializableValue(this, serializationStrategy0, object0);
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    public void encodeSerializableElement(@NotNull SerialDescriptor serialDescriptor0, int v, @NotNull SerializationStrategy serializationStrategy0, Object object0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(serializationStrategy0, "serializer");
        if(this.encodeElement(serialDescriptor0, v)) {
            this.encodeSerializableValue(serializationStrategy0, object0);
        }
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    public void encodeSerializableValue(@NotNull SerializationStrategy serializationStrategy0, Object object0) {
        DefaultImpls.encodeSerializableValue(this, serializationStrategy0, object0);
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    public void encodeShort(short v) {
        this.encodeValue(v);
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeShortElement(@NotNull SerialDescriptor serialDescriptor0, int v, short v1) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        if(this.encodeElement(serialDescriptor0, v)) {
            this.encodeShort(v1);
        }
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    public void encodeString(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        this.encodeValue(s);
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeStringElement(@NotNull SerialDescriptor serialDescriptor0, int v, @NotNull String s) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(s, "value");
        if(this.encodeElement(serialDescriptor0, v)) {
            this.encodeString(s);
        }
    }

    public void encodeValue(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "value");
        throw new SerializationException("Non-serializable " + Reflection.getOrCreateKotlinClass(object0.getClass()) + " is not supported by " + Reflection.getOrCreateKotlinClass(this.getClass()) + " encoder");
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    public void endStructure(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    @ExperimentalSerializationApi
    public boolean shouldEncodeElementDefault(@NotNull SerialDescriptor serialDescriptor0, int v) {
        return kotlinx.serialization.encoding.CompositeEncoder.DefaultImpls.shouldEncodeElementDefault(this, serialDescriptor0, v);
    }
}

