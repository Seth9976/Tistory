package kotlinx.serialization.json.internal;

import a5.b;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.UStringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001A\u0010\u001D\u001A\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C¨\u0006\u001E"}, d2 = {"Lkotlinx/serialization/json/internal/JsonDecoderForUnsignedTypes;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "lexer", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lkotlinx/serialization/json/internal/AbstractJsonLexer;Lkotlinx/serialization/json/Json;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "decodeElementIndex", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "decodeInt", "()I", "", "decodeLong", "()J", "", "decodeByte", "()B", "", "decodeShort", "()S", "Lkotlinx/serialization/modules/SerializersModule;", "b", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStreamingJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonDecoderForUnsignedTypes\n+ 2 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoderKt\n*L\n1#1,391:1\n384#2,5:392\n384#2,5:397\n384#2,5:402\n384#2,5:407\n*S KotlinDebug\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonDecoderForUnsignedTypes\n*L\n377#1:392,5\n378#1:397,5\n379#1:402,5\n380#1:407,5\n*E\n"})
public final class JsonDecoderForUnsignedTypes extends AbstractDecoder {
    public final AbstractJsonLexer a;
    public final SerializersModule b;

    public JsonDecoderForUnsignedTypes(@NotNull AbstractJsonLexer abstractJsonLexer0, @NotNull Json json0) {
        Intrinsics.checkNotNullParameter(abstractJsonLexer0, "lexer");
        Intrinsics.checkNotNullParameter(json0, "json");
        super();
        this.a = abstractJsonLexer0;
        this.b = json0.getSerializersModule();
    }

    @Override  // kotlinx.serialization.encoding.AbstractDecoder
    public byte decodeByte() {
        AbstractJsonLexer abstractJsonLexer0 = this.a;
        String s = abstractJsonLexer0.consumeStringLenient();
        try {
            return UStringsKt.toUByte(s);
        }
        catch(IllegalArgumentException unused_ex) {
            AbstractJsonLexer.fail$default(abstractJsonLexer0, "Failed to parse type \'UByte\' for input \'" + s + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override  // kotlinx.serialization.encoding.AbstractDecoder
    public int decodeInt() {
        AbstractJsonLexer abstractJsonLexer0 = this.a;
        String s = abstractJsonLexer0.consumeStringLenient();
        try {
            return UStringsKt.toUInt(s);
        }
        catch(IllegalArgumentException unused_ex) {
            AbstractJsonLexer.fail$default(abstractJsonLexer0, b.j("Failed to parse type \'UInt\' for input \'", '\'', s), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override  // kotlinx.serialization.encoding.AbstractDecoder
    public long decodeLong() {
        AbstractJsonLexer abstractJsonLexer0 = this.a;
        String s = abstractJsonLexer0.consumeStringLenient();
        try {
            return UStringsKt.toULong(s);
        }
        catch(IllegalArgumentException unused_ex) {
            AbstractJsonLexer.fail$default(abstractJsonLexer0, "Failed to parse type \'ULong\' for input \'" + s + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override  // kotlinx.serialization.encoding.AbstractDecoder
    public short decodeShort() {
        AbstractJsonLexer abstractJsonLexer0 = this.a;
        String s = abstractJsonLexer0.consumeStringLenient();
        try {
            return UStringsKt.toUShort(s);
        }
        catch(IllegalArgumentException unused_ex) {
            AbstractJsonLexer.fail$default(abstractJsonLexer0, "Failed to parse type \'UShort\' for input \'" + s + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override  // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    @NotNull
    public SerializersModule getSerializersModule() {
        return this.b;
    }
}

