package kotlinx.serialization.internal;

import hg.l;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder.DefaultImpls;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\b\b\'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\u0007\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u001B\u0010\t\u001A\u00028\u0000*\u00020\u00062\u0006\u0010\b\u001A\u00020\u0007H$\u00A2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00028\u0000H\u0014\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u000B\u001A\u00028\u0000H\u0014\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001A\u0004\u0018\u00010\u00122\u0006\u0010\u000B\u001A\u00028\u0000H\u0014\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001A\u00020\u000F2\u0006\u0010\u000B\u001A\u00028\u0000H\u0014\u00A2\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u000B\u001A\u00028\u0000H\u0014\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u000B\u001A\u00028\u0000H\u0014\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0017\u0010\u001C\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00028\u0000H\u0014\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0017\u0010\u001F\u001A\u00020\u001E2\u0006\u0010\u000B\u001A\u00028\u0000H\u0014\u00A2\u0006\u0004\b\u001F\u0010 J\u0017\u0010\"\u001A\u00020!2\u0006\u0010\u000B\u001A\u00028\u0000H\u0014\u00A2\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001A\u00020$2\u0006\u0010\u000B\u001A\u00028\u0000H\u0014\u00A2\u0006\u0004\b%\u0010&J\u0017\u0010(\u001A\u00020\'2\u0006\u0010\u000B\u001A\u00028\u0000H\u0014\u00A2\u0006\u0004\b(\u0010)J\u0017\u0010+\u001A\u00020*2\u0006\u0010\u000B\u001A\u00028\u0000H\u0014\u00A2\u0006\u0004\b+\u0010,J\u001F\u0010.\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00028\u00002\u0006\u0010-\u001A\u00020\u0006H\u0014\u00A2\u0006\u0004\b.\u0010/J\u001F\u00101\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00028\u00002\u0006\u00100\u001A\u00020\u0006H\u0014\u00A2\u0006\u0004\b1\u00102J-\u00107\u001A\u00028\u0001\"\u0004\b\u0001\u001032\f\u00105\u001A\b\u0012\u0004\u0012\u00028\u0001042\b\u00106\u001A\u0004\u0018\u00018\u0001H\u0014\u00A2\u0006\u0004\b7\u00108J\u0017\u0010:\u001A\u00020\u00022\u0006\u00109\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b:\u0010;J\u000F\u0010<\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b<\u0010=J\u000F\u0010>\u001A\u0004\u0018\u00010\u0012\u00A2\u0006\u0004\b>\u0010?J\r\u0010@\u001A\u00020\u000F\u00A2\u0006\u0004\b@\u0010=J\r\u0010A\u001A\u00020\u0016\u00A2\u0006\u0004\bA\u0010BJ\r\u0010C\u001A\u00020\u0019\u00A2\u0006\u0004\bC\u0010DJ\r\u0010E\u001A\u00020\u0007\u00A2\u0006\u0004\bE\u0010FJ\r\u0010G\u001A\u00020\u001E\u00A2\u0006\u0004\bG\u0010HJ\r\u0010I\u001A\u00020!\u00A2\u0006\u0004\bI\u0010JJ\r\u0010K\u001A\u00020$\u00A2\u0006\u0004\bK\u0010LJ\r\u0010M\u001A\u00020\'\u00A2\u0006\u0004\bM\u0010NJ\r\u0010O\u001A\u00020*\u00A2\u0006\u0004\bO\u0010PJ\u0015\u0010Q\u001A\u00020\u00072\u0006\u0010-\u001A\u00020\u0006\u00A2\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001A\u00020\u00032\u0006\u00109\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001A\u00020U2\u0006\u00109\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\bV\u0010WJ\u001D\u0010X\u001A\u00020\u000F2\u0006\u00109\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\bX\u0010YJ\u001D\u0010Z\u001A\u00020\u00162\u0006\u00109\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\bZ\u0010[J\u001D\u0010\\\u001A\u00020\u00192\u0006\u00109\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\\\u0010]J\u001D\u0010^\u001A\u00020\u00072\u0006\u00109\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b^\u0010_J\u001D\u0010`\u001A\u00020\u001E2\u0006\u00109\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b`\u0010aJ\u001D\u0010b\u001A\u00020!2\u0006\u00109\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\bb\u0010cJ\u001D\u0010d\u001A\u00020$2\u0006\u00109\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\bd\u0010eJ\u001D\u0010f\u001A\u00020\'2\u0006\u00109\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\bf\u0010gJ\u001D\u0010h\u001A\u00020*2\u0006\u00109\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\bh\u0010iJ\u001D\u0010j\u001A\u00020\u00022\u0006\u00109\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\bj\u0010kJ;\u0010l\u001A\u00028\u0001\"\u0004\b\u0001\u001032\u0006\u00109\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00072\f\u00105\u001A\b\u0012\u0004\u0012\u00028\u0001042\b\u00106\u001A\u0004\u0018\u00018\u0001\u00A2\u0006\u0004\bl\u0010mJC\u0010n\u001A\u0004\u0018\u00018\u0001\"\b\b\u0001\u00103*\u00020\f2\u0006\u00109\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00072\u000E\u00105\u001A\n\u0012\u0006\u0012\u0004\u0018\u00018\u0001042\b\u00106\u001A\u0004\u0018\u00018\u0001\u00A2\u0006\u0004\bn\u0010mJ\u0017\u0010p\u001A\u00020U2\u0006\u0010o\u001A\u00028\u0000H\u0004\u00A2\u0006\u0004\bp\u0010qJ\u001D\u0010s\u001A\u00020U2\f\u0010r\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0004\u00A2\u0006\u0004\bs\u0010tJ\u000F\u0010u\u001A\u00028\u0000H\u0004\u00A2\u0006\u0004\bu\u0010vR\u0014\u0010z\u001A\u00020w8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bx\u0010yR\u0014\u0010|\u001A\u00028\u00008DX\u0084\u0004\u00A2\u0006\u0006\u001A\u0004\b{\u0010vR\u0016\u0010~\u001A\u0004\u0018\u00018\u00008DX\u0084\u0004\u00A2\u0006\u0006\u001A\u0004\b}\u0010v\u00A8\u0006\u007F"}, d2 = {"Lkotlinx/serialization/internal/TaggedDecoder;", "Tag", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "<init>", "()V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "getTag", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/Object;", "tag", "", "decodeTaggedValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "decodeTaggedNotNullMark", "(Ljava/lang/Object;)Z", "", "decodeTaggedNull", "(Ljava/lang/Object;)Ljava/lang/Void;", "decodeTaggedBoolean", "", "decodeTaggedByte", "(Ljava/lang/Object;)B", "", "decodeTaggedShort", "(Ljava/lang/Object;)S", "decodeTaggedInt", "(Ljava/lang/Object;)I", "", "decodeTaggedLong", "(Ljava/lang/Object;)J", "", "decodeTaggedFloat", "(Ljava/lang/Object;)F", "", "decodeTaggedDouble", "(Ljava/lang/Object;)D", "", "decodeTaggedChar", "(Ljava/lang/Object;)C", "", "decodeTaggedString", "(Ljava/lang/Object;)Ljava/lang/String;", "enumDescriptor", "decodeTaggedEnum", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "inlineDescriptor", "decodeTaggedInline", "(Ljava/lang/Object;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "previousValue", "decodeSerializableValue", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "descriptor", "decodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "decodeNotNullMark", "()Z", "decodeNull", "()Ljava/lang/Void;", "decodeBoolean", "decodeByte", "()B", "decodeShort", "()S", "decodeInt", "()I", "decodeLong", "()J", "decodeFloat", "()F", "decodeDouble", "()D", "decodeChar", "()C", "decodeString", "()Ljava/lang/String;", "decodeEnum", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder;", "", "endStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "decodeBooleanElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "decodeByteElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)B", "decodeShortElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)S", "decodeIntElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I", "decodeLongElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)J", "decodeFloatElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)F", "decodeDoubleElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)D", "decodeCharElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)C", "decodeStringElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "decodeInlineElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Lkotlinx/serialization/encoding/Decoder;", "decodeSerializableElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "decodeNullableSerializableElement", "name", "pushTag", "(Ljava/lang/Object;)V", "other", "copyTagsTo", "(Lkotlinx/serialization/internal/TaggedDecoder;)V", "popTag", "()Ljava/lang/Object;", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "getCurrentTag", "currentTag", "getCurrentTagOrNull", "currentTagOrNull", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTagged.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tagged.kt\nkotlinx/serialization/internal/TaggedDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,335:1\n1#2:336\n*E\n"})
@InternalSerializationApi
public abstract class TaggedDecoder implements CompositeDecoder, Decoder {
    public final ArrayList a;
    public boolean b;

    public TaggedDecoder() {
        this.a = new ArrayList();
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    @NotNull
    public CompositeDecoder beginStructure(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this;
    }

    public final void copyTagsTo(@NotNull TaggedDecoder taggedDecoder0) {
        Intrinsics.checkNotNullParameter(taggedDecoder0, "other");
        taggedDecoder0.a.addAll(this.a);
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    public final boolean decodeBoolean() {
        return this.decodeTaggedBoolean(this.popTag());
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public final boolean decodeBooleanElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.decodeTaggedBoolean(this.getTag(serialDescriptor0, v));
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    public final byte decodeByte() {
        return this.decodeTaggedByte(this.popTag());
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public final byte decodeByteElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.decodeTaggedByte(this.getTag(serialDescriptor0, v));
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    public final char decodeChar() {
        return this.decodeTaggedChar(this.popTag());
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public final char decodeCharElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.decodeTaggedChar(this.getTag(serialDescriptor0, v));
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeCollectionSize(@NotNull SerialDescriptor serialDescriptor0) {
        return DefaultImpls.decodeCollectionSize(this, serialDescriptor0);
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    public final double decodeDouble() {
        return this.decodeTaggedDouble(this.popTag());
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public final double decodeDoubleElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.decodeTaggedDouble(this.getTag(serialDescriptor0, v));
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    public final int decodeEnum(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "enumDescriptor");
        return this.decodeTaggedEnum(this.popTag(), serialDescriptor0);
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    public final float decodeFloat() {
        return this.decodeTaggedFloat(this.popTag());
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public final float decodeFloatElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.decodeTaggedFloat(this.getTag(serialDescriptor0, v));
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    @NotNull
    public Decoder decodeInline(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.decodeTaggedInline(this.popTag(), serialDescriptor0);
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    @NotNull
    public final Decoder decodeInlineElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.decodeTaggedInline(this.getTag(serialDescriptor0, v), serialDescriptor0.getElementDescriptor(v));
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    public final int decodeInt() {
        return this.decodeTaggedInt(this.popTag());
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeIntElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.decodeTaggedInt(this.getTag(serialDescriptor0, v));
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    public final long decodeLong() {
        return this.decodeTaggedLong(this.popTag());
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public final long decodeLongElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.decodeTaggedLong(this.getTag(serialDescriptor0, v));
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        Object object0 = this.getCurrentTagOrNull();
        return object0 == null ? false : this.decodeTaggedNotNullMark(object0);
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    @Nullable
    public final Void decodeNull() {
        return null;
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    @Nullable
    public final Object decodeNullableSerializableElement(@NotNull SerialDescriptor serialDescriptor0, int v, @NotNull DeserializationStrategy deserializationStrategy0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        Object object1 = this.getTag(serialDescriptor0, v);
        l l0 = new l(this, deserializationStrategy0, object0, 0);
        this.pushTag(object1);
        Object object2 = l0.invoke();
        if(!this.b) {
            this.popTag();
        }
        this.b = false;
        return object2;
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
    public final Object decodeSerializableElement(@NotNull SerialDescriptor serialDescriptor0, int v, @NotNull DeserializationStrategy deserializationStrategy0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        Object object1 = this.getTag(serialDescriptor0, v);
        l l0 = new l(this, deserializationStrategy0, object0, 1);
        this.pushTag(object1);
        Object object2 = l0.invoke();
        if(!this.b) {
            this.popTag();
        }
        this.b = false;
        return object2;
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    public Object decodeSerializableValue(@NotNull DeserializationStrategy deserializationStrategy0) {
        return kotlinx.serialization.encoding.Decoder.DefaultImpls.decodeSerializableValue(this, deserializationStrategy0);
    }

    public Object decodeSerializableValue(@NotNull DeserializationStrategy deserializationStrategy0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        return this.decodeSerializableValue(deserializationStrategy0);
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    public final short decodeShort() {
        return this.decodeTaggedShort(this.popTag());
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public final short decodeShortElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.decodeTaggedShort(this.getTag(serialDescriptor0, v));
    }

    @Override  // kotlinx.serialization.encoding.Decoder
    @NotNull
    public final String decodeString() {
        return this.decodeTaggedString(this.popTag());
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    @NotNull
    public final String decodeStringElement(@NotNull SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return this.decodeTaggedString(this.getTag(serialDescriptor0, v));
    }

    public boolean decodeTaggedBoolean(Object object0) {
        Object object1 = this.decodeTaggedValue(object0);
        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean)object1).booleanValue();
    }

    public byte decodeTaggedByte(Object object0) {
        Object object1 = this.decodeTaggedValue(object0);
        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Byte");
        return (byte)(((Byte)object1));
    }

    public char decodeTaggedChar(Object object0) {
        Object object1 = this.decodeTaggedValue(object0);
        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Char");
        return ((Character)object1).charValue();
    }

    public double decodeTaggedDouble(Object object0) {
        Object object1 = this.decodeTaggedValue(object0);
        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Double");
        return (double)(((Double)object1));
    }

    public int decodeTaggedEnum(Object object0, @NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "enumDescriptor");
        Object object1 = this.decodeTaggedValue(object0);
        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Int");
        return (int)(((Integer)object1));
    }

    public float decodeTaggedFloat(Object object0) {
        Object object1 = this.decodeTaggedValue(object0);
        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Float");
        return (float)(((Float)object1));
    }

    @NotNull
    public Decoder decodeTaggedInline(Object object0, @NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "inlineDescriptor");
        this.pushTag(object0);
        return this;
    }

    public int decodeTaggedInt(Object object0) {
        Object object1 = this.decodeTaggedValue(object0);
        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Int");
        return (int)(((Integer)object1));
    }

    public long decodeTaggedLong(Object object0) {
        Object object1 = this.decodeTaggedValue(object0);
        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Long");
        return (long)(((Long)object1));
    }

    public boolean decodeTaggedNotNullMark(Object object0) {
        return true;
    }

    @Nullable
    public Void decodeTaggedNull(Object object0) {
        return null;
    }

    public short decodeTaggedShort(Object object0) {
        Object object1 = this.decodeTaggedValue(object0);
        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Short");
        return (short)(((Short)object1));
    }

    @NotNull
    public String decodeTaggedString(Object object0) {
        Object object1 = this.decodeTaggedValue(object0);
        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.String");
        return (String)object1;
    }

    @NotNull
    public Object decodeTaggedValue(Object object0) {
        throw new SerializationException(Reflection.getOrCreateKotlinClass(this.getClass()) + " can\'t retrieve untyped values");
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
    }

    public final Object getCurrentTag() {
        return CollectionsKt___CollectionsKt.last(this.a);
    }

    @Nullable
    public final Object getCurrentTagOrNull() {
        return CollectionsKt___CollectionsKt.lastOrNull(this.a);
    }

    @Override  // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    @NotNull
    public SerializersModule getSerializersModule() {
        return SerializersModuleBuildersKt.EmptySerializersModule();
    }

    public abstract Object getTag(@NotNull SerialDescriptor arg1, int arg2);

    public final Object popTag() {
        int v = CollectionsKt__CollectionsKt.getLastIndex(this.a);
        Object object0 = this.a.remove(v);
        this.b = true;
        return object0;
    }

    public final void pushTag(Object object0) {
        this.a.add(object0);
    }
}

