package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\'\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00A2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\b\u0010\u0007\u001A\u00020\bH\u0016J\u0016\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u000BJ\b\u0010\f\u001A\u00020\rH\u0016J\u0016\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u000BJ\b\u0010\u000F\u001A\u00020\u0010H\u0016J\u0016\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u000BJ\b\u0010\u0012\u001A\u00020\u0013H\u0016J\u0016\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u000BJ\u0010\u0010\u0015\u001A\u00020\u000B2\u0006\u0010\u0016\u001A\u00020\u0006H\u0016J\b\u0010\u0017\u001A\u00020\u0018H\u0016J\u0016\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u000BJ\u0010\u0010\u001A\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u0018\u0010\u001B\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u000BH\u0016J\b\u0010\u001C\u001A\u00020\u000BH\u0016J\u0016\u0010\u001D\u001A\u00020\u000B2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u000BJ\b\u0010\u001E\u001A\u00020\u001FH\u0016J\u0016\u0010 \u001A\u00020\u001F2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u000BJ\b\u0010!\u001A\u00020\bH\u0016J\n\u0010\"\u001A\u0004\u0018\u00010#H\u0016JA\u0010$\u001A\u0004\u0018\u0001H%\"\b\b\u0000\u0010%*\u00020&2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u000B2\u000E\u0010\'\u001A\n\u0012\u0006\u0012\u0004\u0018\u0001H%0(2\b\u0010)\u001A\u0004\u0018\u0001H%\u00A2\u0006\u0002\u0010*J;\u0010+\u001A\u0002H%\"\u0004\b\u0000\u0010%2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u000B2\f\u0010\'\u001A\b\u0012\u0004\u0012\u0002H%0(2\b\u0010)\u001A\u0004\u0018\u0001H%H\u0016\u00A2\u0006\u0002\u0010*J-\u0010,\u001A\u0002H%\"\u0004\b\u0000\u0010%2\f\u0010\'\u001A\b\u0012\u0004\u0012\u0002H%0(2\n\b\u0002\u0010)\u001A\u0004\u0018\u0001H%H\u0016\u00A2\u0006\u0002\u0010-J\b\u0010.\u001A\u00020/H\u0016J\u0016\u00100\u001A\u00020/2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u000BJ\b\u00101\u001A\u000202H\u0016J\u0016\u00103\u001A\u0002022\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u000BJ\b\u00104\u001A\u00020&H\u0016J\u0010\u00105\u001A\u0002062\u0006\u0010\u0005\u001A\u00020\u0006H\u0016\u00A8\u00067"}, d2 = {"Lkotlinx/serialization/encoding/AbstractDecoder;", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "()V", "beginStructure", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "decodeBoolean", "", "decodeBooleanElement", "index", "", "decodeByte", "", "decodeByteElement", "decodeChar", "", "decodeCharElement", "decodeDouble", "", "decodeDoubleElement", "decodeEnum", "enumDescriptor", "decodeFloat", "", "decodeFloatElement", "decodeInline", "decodeInlineElement", "decodeInt", "decodeIntElement", "decodeLong", "", "decodeLongElement", "decodeNotNullMark", "decodeNull", "", "decodeNullableSerializableElement", "T", "", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "previousValue", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "decodeSerializableElement", "decodeSerializableValue", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "decodeShort", "", "decodeShortElement", "decodeString", "", "decodeStringElement", "decodeValue", "endStructure", "", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAbstractDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractDecoder.kt\nkotlinx/serialization/encoding/AbstractDecoder\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,81:1\n270#2,2:82\n*S KotlinDebug\n*F\n+ 1 AbstractDecoder.kt\nkotlinx/serialization/encoding/AbstractDecoder\n*L\n77#1:82,2\n*E\n"})
@ExperimentalSerializationApi
public abstract class AbstractDecoder implements CompositeDecoder, Decoder {
    @Override  // kotlinx.serialization.encoding.Decoder
    @NotNull
    public CompositeDecoder beginStructure(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this;
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    public boolean decodeBoolean() {
        Object object0 = this.decodeValue();
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean)object0).booleanValue();
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public final boolean decodeBooleanElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.decodeBoolean();
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    public byte decodeByte() {
        Object object0 = this.decodeValue();
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Byte");
        return (byte)(((Byte)object0));
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public final byte decodeByteElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.decodeByte();
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    public char decodeChar() {
        Object object0 = this.decodeValue();
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Char");
        return ((Character)object0).charValue();
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public final char decodeCharElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.decodeChar();
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeCollectionSize(@NotNull SerialDescriptor serialDescriptor0) {
        return DefaultImpls.decodeCollectionSize(this, serialDescriptor0);
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    public double decodeDouble() {
        Object object0 = this.decodeValue();
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Double");
        return (double)(((Double)object0));
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public final double decodeDoubleElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.decodeDouble();
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    public int decodeEnum(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "enumDescriptor");
        Object object0 = this.decodeValue();
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Int");
        return (int)(((Integer)object0));
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    public float decodeFloat() {
        Object object0 = this.decodeValue();
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Float");
        return (float)(((Float)object0));
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public final float decodeFloatElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.decodeFloat();
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    @NotNull
    public Decoder decodeInline(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this;
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    @NotNull
    public Decoder decodeInlineElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.decodeInline(serialDescriptor0.getElementDescriptor(v));
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        Object object0 = this.decodeValue();
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Int");
        return (int)(((Integer)object0));
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeIntElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.decodeInt();
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    public long decodeLong() {
        Object object0 = this.decodeValue();
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Long");
        return (long)(((Long)object0));
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public final long decodeLongElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.decodeLong();
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return true;
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    @Nullable
    public Void decodeNull() {
        return null;
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    @Nullable
    public final Object decodeNullableSerializableElement(@NotNull SerialDescriptor serialDescriptor0, int v, @NotNull DeserializationStrategy deserializationStrategy0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        return !deserializationStrategy0.getDescriptor().isNullable() && !this.decodeNotNullMark() ? this.decodeNull() : this.decodeSerializableValue(deserializationStrategy0, object0);
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    @ExperimentalSerializationApi
    @Nullable
    public Object decodeNullableSerializableValue(@NotNull DeserializationStrategy deserializationStrategy0) {
        return kotlinx.serialization.encoding.Decoder.DefaultImpls.decodeNullableSerializableValue(this, deserializationStrategy0);
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    @ExperimentalSerializationApi
    public boolean decodeSequentially() {
        return false;
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public Object decodeSerializableElement(@NotNull SerialDescriptor serialDescriptor0, int v, @NotNull DeserializationStrategy deserializationStrategy0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        return this.decodeSerializableValue(deserializationStrategy0, object0);
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    public Object decodeSerializableValue(@NotNull DeserializationStrategy deserializationStrategy0) {
        return kotlinx.serialization.encoding.Decoder.DefaultImpls.decodeSerializableValue(this, deserializationStrategy0);
    }

    public Object decodeSerializableValue(@NotNull DeserializationStrategy deserializationStrategy0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        return this.decodeSerializableValue(deserializationStrategy0);
    }

    public static Object decodeSerializableValue$default(AbstractDecoder abstractDecoder0, DeserializationStrategy deserializationStrategy0, Object object0, int v, Object object1) {
        if(object1 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableValue");
        }
        if((v & 2) != 0) {
            object0 = null;
        }
        return abstractDecoder0.decodeSerializableValue(deserializationStrategy0, object0);
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    public short decodeShort() {
        Object object0 = this.decodeValue();
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Short");
        return (short)(((Short)object0));
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public final short decodeShortElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.decodeShort();
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    @NotNull
    public String decodeString() {
        Object object0 = this.decodeValue();
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.String");
        return (String)object0;
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    @NotNull
    public final String decodeStringElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.decodeString();
    }

    @NotNull
    public Object decodeValue() {
        throw new SerializationException(Reflection.getOrCreateKotlinClass(this.getClass()) + " can\'t retrieve untyped values");
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
    }
}

