package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder.DefaultImpls;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b<\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\u0007\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u001B\u0010\t\u001A\u00028\u0000*\u00020\u00062\u0006\u0010\b\u001A\u00020\u0007H$\u00A2\u0006\u0004\b\t\u0010\nJ\u001F\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00028\u00002\u0006\u0010\r\u001A\u00020\fH\u0014\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00028\u0000H\u0014\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00028\u0000H\u0014\u00A2\u0006\u0004\b\u0013\u0010\u0012J\u001F\u0010\u0014\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00028\u00002\u0006\u0010\r\u001A\u00020\u0007H\u0014\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001F\u0010\u0017\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00028\u00002\u0006\u0010\r\u001A\u00020\u0016H\u0014\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u001F\u0010\u001A\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00028\u00002\u0006\u0010\r\u001A\u00020\u0019H\u0014\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u001F\u0010\u001D\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00028\u00002\u0006\u0010\r\u001A\u00020\u001CH\u0014\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u001F\u0010 \u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00028\u00002\u0006\u0010\r\u001A\u00020\u001FH\u0014\u00A2\u0006\u0004\b \u0010!J\u001F\u0010#\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00028\u00002\u0006\u0010\r\u001A\u00020\"H\u0014\u00A2\u0006\u0004\b#\u0010$J\u001F\u0010&\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00028\u00002\u0006\u0010\r\u001A\u00020%H\u0014\u00A2\u0006\u0004\b&\u0010\'J\u001F\u0010)\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00028\u00002\u0006\u0010\r\u001A\u00020(H\u0014\u00A2\u0006\u0004\b)\u0010*J\u001F\u0010,\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00028\u00002\u0006\u0010\r\u001A\u00020+H\u0014\u00A2\u0006\u0004\b,\u0010-J\'\u00100\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00028\u00002\u0006\u0010.\u001A\u00020\u00062\u0006\u0010/\u001A\u00020\u0007H\u0014\u00A2\u0006\u0004\b0\u00101J\u001F\u00103\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00028\u00002\u0006\u00102\u001A\u00020\u0006H\u0014\u00A2\u0006\u0004\b3\u00104J\u0017\u00106\u001A\u00020\u00022\u0006\u00105\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b6\u00107J\u000F\u00108\u001A\u00020\u000EH\u0016\u00A2\u0006\u0004\b8\u0010\u0005J\u000F\u00109\u001A\u00020\u000EH\u0016\u00A2\u0006\u0004\b9\u0010\u0005J\u0015\u0010:\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020%\u00A2\u0006\u0004\b:\u0010;J\u0015\u0010<\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\u0016\u00A2\u0006\u0004\b<\u0010=J\u0015\u0010>\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\u0019\u00A2\u0006\u0004\b>\u0010?J\u0015\u0010@\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\u0007\u00A2\u0006\u0004\b@\u0010AJ\u0015\u0010B\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\u001C\u00A2\u0006\u0004\bB\u0010CJ\u0015\u0010D\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\u001F\u00A2\u0006\u0004\bD\u0010EJ\u0015\u0010F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\"\u00A2\u0006\u0004\bF\u0010GJ\u0015\u0010H\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020(\u00A2\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020+\u00A2\u0006\u0004\bJ\u0010KJ\u001D\u0010L\u001A\u00020\u000E2\u0006\u0010.\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001A\u00020\u00032\u0006\u00105\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\bN\u0010OJ\u0015\u0010P\u001A\u00020\u000E2\u0006\u00105\u001A\u00020\u0006\u00A2\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001A\u00020\u000E2\u0006\u00105\u001A\u00020\u0006H\u0014\u00A2\u0006\u0004\bR\u0010QJ%\u0010S\u001A\u00020\u000E2\u0006\u00105\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020%\u00A2\u0006\u0004\bS\u0010TJ%\u0010U\u001A\u00020\u000E2\u0006\u00105\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020\u0016\u00A2\u0006\u0004\bU\u0010VJ%\u0010W\u001A\u00020\u000E2\u0006\u00105\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020\u0019\u00A2\u0006\u0004\bW\u0010XJ%\u0010Y\u001A\u00020\u000E2\u0006\u00105\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020\u0007\u00A2\u0006\u0004\bY\u0010ZJ%\u0010[\u001A\u00020\u000E2\u0006\u00105\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020\u001C\u00A2\u0006\u0004\b[\u0010\\J%\u0010]\u001A\u00020\u000E2\u0006\u00105\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020\u001F\u00A2\u0006\u0004\b]\u0010^J%\u0010_\u001A\u00020\u000E2\u0006\u00105\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020\"\u00A2\u0006\u0004\b_\u0010`J%\u0010a\u001A\u00020\u000E2\u0006\u00105\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020(\u00A2\u0006\u0004\ba\u0010bJ%\u0010c\u001A\u00020\u000E2\u0006\u00105\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020+\u00A2\u0006\u0004\bc\u0010dJ\u001D\u0010e\u001A\u00020\u00022\u0006\u00105\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\be\u0010fJ;\u0010j\u001A\u00020\u000E\"\u0004\b\u0001\u0010g2\u0006\u00105\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00072\f\u0010i\u001A\b\u0012\u0004\u0012\u00028\u00010h2\u0006\u0010\r\u001A\u00028\u0001H\u0016\u00A2\u0006\u0004\bj\u0010kJA\u0010l\u001A\u00020\u000E\"\b\b\u0001\u0010g*\u00020\f2\u0006\u00105\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00072\f\u0010i\u001A\b\u0012\u0004\u0012\u00028\u00010h2\b\u0010\r\u001A\u0004\u0018\u00018\u0001H\u0016\u00A2\u0006\u0004\bl\u0010kJ\u0017\u0010n\u001A\u00020\u000E2\u0006\u0010m\u001A\u00028\u0000H\u0004\u00A2\u0006\u0004\bn\u0010\u0012J\u000F\u0010o\u001A\u00028\u0000H\u0004\u00A2\u0006\u0004\bo\u0010pR\u0014\u0010t\u001A\u00020q8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\br\u0010sR\u0014\u0010v\u001A\u00028\u00008DX\u0084\u0004\u00A2\u0006\u0006\u001A\u0004\bu\u0010pR\u0016\u0010x\u001A\u0004\u0018\u00018\u00008DX\u0084\u0004\u00A2\u0006\u0006\u001A\u0004\bw\u0010p\u00A8\u0006y"}, d2 = {"Lkotlinx/serialization/internal/TaggedEncoder;", "Tag", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "<init>", "()V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "getTag", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/Object;", "tag", "", "value", "", "encodeTaggedValue", "(Ljava/lang/Object;Ljava/lang/Object;)V", "encodeTaggedNonNullMark", "(Ljava/lang/Object;)V", "encodeTaggedNull", "encodeTaggedInt", "(Ljava/lang/Object;I)V", "", "encodeTaggedByte", "(Ljava/lang/Object;B)V", "", "encodeTaggedShort", "(Ljava/lang/Object;S)V", "", "encodeTaggedLong", "(Ljava/lang/Object;J)V", "", "encodeTaggedFloat", "(Ljava/lang/Object;F)V", "", "encodeTaggedDouble", "(Ljava/lang/Object;D)V", "", "encodeTaggedBoolean", "(Ljava/lang/Object;Z)V", "", "encodeTaggedChar", "(Ljava/lang/Object;C)V", "", "encodeTaggedString", "(Ljava/lang/Object;Ljava/lang/String;)V", "enumDescriptor", "ordinal", "encodeTaggedEnum", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "inlineDescriptor", "encodeTaggedInline", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "descriptor", "encodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "encodeNotNullMark", "encodeNull", "encodeBoolean", "(Z)V", "encodeByte", "(B)V", "encodeShort", "(S)V", "encodeInt", "(I)V", "encodeLong", "(J)V", "encodeFloat", "(F)V", "encodeDouble", "(D)V", "encodeChar", "(C)V", "encodeString", "(Ljava/lang/String;)V", "encodeEnum", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeEncoder;", "endStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "endEncode", "encodeBooleanElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V", "encodeByteElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IB)V", "encodeShortElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IS)V", "encodeIntElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V", "encodeLongElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IJ)V", "encodeFloatElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IF)V", "encodeDoubleElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ID)V", "encodeCharElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;IC)V", "encodeStringElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V", "encodeInlineElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Encoder;", "T", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "encodeSerializableElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "encodeNullableSerializableElement", "name", "pushTag", "popTag", "()Ljava/lang/Object;", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "getCurrentTag", "currentTag", "getCurrentTagOrNull", "currentTagOrNull", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTagged.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tagged.kt\nkotlinx/serialization/internal/TaggedEncoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,335:1\n1#2:336\n*E\n"})
@InternalSerializationApi
public abstract class TaggedEncoder implements CompositeEncoder, Encoder {
    public final ArrayList a;

    public TaggedEncoder() {
        this.a = new ArrayList();
    }

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
    public final void encodeBoolean(boolean z) {
        this.encodeTaggedBoolean(this.popTag(), z);
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeBooleanElement(@NotNull SerialDescriptor serialDescriptor0, int v, boolean z) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        this.encodeTaggedBoolean(this.getTag(serialDescriptor0, v), z);
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    public final void encodeByte(byte b) {
        this.encodeTaggedByte(this.popTag(), b);
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeByteElement(@NotNull SerialDescriptor serialDescriptor0, int v, byte b) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        this.encodeTaggedByte(this.getTag(serialDescriptor0, v), b);
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    public final void encodeChar(char c) {
        this.encodeTaggedChar(this.popTag(), c);
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeCharElement(@NotNull SerialDescriptor serialDescriptor0, int v, char c) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        this.encodeTaggedChar(this.getTag(serialDescriptor0, v), c);
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    public final void encodeDouble(double f) {
        this.encodeTaggedDouble(this.popTag(), f);
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeDoubleElement(@NotNull SerialDescriptor serialDescriptor0, int v, double f) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        this.encodeTaggedDouble(this.getTag(serialDescriptor0, v), f);
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    public final void encodeEnum(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "enumDescriptor");
        this.encodeTaggedEnum(this.popTag(), serialDescriptor0, v);
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    public final void encodeFloat(float f) {
        this.encodeTaggedFloat(this.popTag(), f);
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeFloatElement(@NotNull SerialDescriptor serialDescriptor0, int v, float f) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        this.encodeTaggedFloat(this.getTag(serialDescriptor0, v), f);
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    @NotNull
    public Encoder encodeInline(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.encodeTaggedInline(this.popTag(), serialDescriptor0);
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    @NotNull
    public final Encoder encodeInlineElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.encodeTaggedInline(this.getTag(serialDescriptor0, v), serialDescriptor0.getElementDescriptor(v));
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    public final void encodeInt(int v) {
        this.encodeTaggedInt(this.popTag(), v);
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeIntElement(@NotNull SerialDescriptor serialDescriptor0, int v, int v1) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        this.encodeTaggedInt(this.getTag(serialDescriptor0, v), v1);
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    public final void encodeLong(long v) {
        this.encodeTaggedLong(this.popTag(), v);
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeLongElement(@NotNull SerialDescriptor serialDescriptor0, int v, long v1) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        this.encodeTaggedLong(this.getTag(serialDescriptor0, v), v1);
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    public void encodeNotNullMark() {
        this.encodeTaggedNonNullMark(this.getCurrentTag());
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        this.encodeTaggedNull(this.popTag());
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    public void encodeNullableSerializableElement(@NotNull SerialDescriptor serialDescriptor0, int v, @NotNull SerializationStrategy serializationStrategy0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(serializationStrategy0, "serializer");
        this.pushTag(this.getTag(serialDescriptor0, v));
        this.encodeNullableSerializableValue(serializationStrategy0, object0);
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
        this.pushTag(this.getTag(serialDescriptor0, v));
        this.encodeSerializableValue(serializationStrategy0, object0);
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    public void encodeSerializableValue(@NotNull SerializationStrategy serializationStrategy0, Object object0) {
        DefaultImpls.encodeSerializableValue(this, serializationStrategy0, object0);
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    public final void encodeShort(short v) {
        this.encodeTaggedShort(this.popTag(), v);
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeShortElement(@NotNull SerialDescriptor serialDescriptor0, int v, short v1) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        this.encodeTaggedShort(this.getTag(serialDescriptor0, v), v1);
    }

    @Override  // kotlinx.serialization.encoding.Encoder
    public final void encodeString(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        this.encodeTaggedString(this.popTag(), s);
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    public final void encodeStringElement(@NotNull SerialDescriptor serialDescriptor0, int v, @NotNull String s) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(s, "value");
        this.encodeTaggedString(this.getTag(serialDescriptor0, v), s);
    }

    public void encodeTaggedBoolean(Object object0, boolean z) {
        this.encodeTaggedValue(object0, Boolean.valueOf(z));
    }

    public void encodeTaggedByte(Object object0, byte b) {
        this.encodeTaggedValue(object0, b);
    }

    public void encodeTaggedChar(Object object0, char c) {
        this.encodeTaggedValue(object0, Character.valueOf(c));
    }

    public void encodeTaggedDouble(Object object0, double f) {
        this.encodeTaggedValue(object0, f);
    }

    public void encodeTaggedEnum(Object object0, @NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "enumDescriptor");
        this.encodeTaggedValue(object0, v);
    }

    public void encodeTaggedFloat(Object object0, float f) {
        this.encodeTaggedValue(object0, f);
    }

    @NotNull
    public Encoder encodeTaggedInline(Object object0, @NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "inlineDescriptor");
        this.pushTag(object0);
        return this;
    }

    public void encodeTaggedInt(Object object0, int v) {
        this.encodeTaggedValue(object0, v);
    }

    public void encodeTaggedLong(Object object0, long v) {
        this.encodeTaggedValue(object0, v);
    }

    public void encodeTaggedNonNullMark(Object object0) {
    }

    public void encodeTaggedNull(Object object0) {
        throw new SerializationException("null is not supported");
    }

    public void encodeTaggedShort(Object object0, short v) {
        this.encodeTaggedValue(object0, v);
    }

    public void encodeTaggedString(Object object0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        this.encodeTaggedValue(object0, s);
    }

    public void encodeTaggedValue(Object object0, @NotNull Object object1) {
        Intrinsics.checkNotNullParameter(object1, "value");
        throw new SerializationException("Non-serializable " + Reflection.getOrCreateKotlinClass(object1.getClass()) + " is not supported by " + Reflection.getOrCreateKotlinClass(this.getClass()) + " encoder");
    }

    public void endEncode(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    public final void endStructure(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        if(!this.a.isEmpty()) {
            this.popTag();
        }
        this.endEncode(serialDescriptor0);
    }

    public final Object getCurrentTag() {
        return CollectionsKt___CollectionsKt.last(this.a);
    }

    @Nullable
    public final Object getCurrentTagOrNull() {
        return CollectionsKt___CollectionsKt.lastOrNull(this.a);
    }

    @Override  // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    @NotNull
    public SerializersModule getSerializersModule() {
        return SerializersModuleBuildersKt.EmptySerializersModule();
    }

    public abstract Object getTag(@NotNull SerialDescriptor arg1, int arg2);

    public final Object popTag() {
        ArrayList arrayList0 = this.a;
        if(arrayList0.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        return arrayList0.remove(CollectionsKt__CollectionsKt.getLastIndex(arrayList0));
    }

    public final void pushTag(Object object0) {
        this.a.add(object0);
    }

    @Override  // kotlinx.serialization.encoding.CompositeEncoder
    @ExperimentalSerializationApi
    public boolean shouldEncodeElementDefault(@NotNull SerialDescriptor serialDescriptor0, int v) {
        return kotlinx.serialization.encoding.CompositeEncoder.DefaultImpls.shouldEncodeElementDefault(this, serialDescriptor0, v);
    }
}

