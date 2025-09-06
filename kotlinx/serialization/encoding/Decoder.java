package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000E\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tH&J\b\u0010\n\u001A\u00020\u000BH&J\b\u0010\f\u001A\u00020\rH&J\b\u0010\u000E\u001A\u00020\u000FH&J\b\u0010\u0010\u001A\u00020\u0011H&J\u0010\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\tH&J\b\u0010\u0015\u001A\u00020\u0016H&J\u0010\u0010\u0017\u001A\u00020\u00002\u0006\u0010\b\u001A\u00020\tH&J\b\u0010\u0018\u001A\u00020\u0013H&J\b\u0010\u0019\u001A\u00020\u001AH&J\b\u0010\u001B\u001A\u00020\u000BH\'J\n\u0010\u001C\u001A\u0004\u0018\u00010\u001DH\'J)\u0010\u001E\u001A\u0004\u0018\u0001H\u001F\"\b\b\u0000\u0010\u001F*\u00020\u00012\u000E\u0010 \u001A\n\u0012\u0006\u0012\u0004\u0018\u0001H\u001F0!H\u0017¢\u0006\u0002\u0010\"J!\u0010#\u001A\u0002H\u001F\"\u0004\b\u0000\u0010\u001F2\f\u0010 \u001A\b\u0012\u0004\u0012\u0002H\u001F0!H\u0016¢\u0006\u0002\u0010\"J\b\u0010$\u001A\u00020%H&J\b\u0010&\u001A\u00020\'H&R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005¨\u0006("}, d2 = {"Lkotlinx/serialization/encoding/Decoder;", "", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "beginStructure", "Lkotlinx/serialization/encoding/CompositeDecoder;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "decodeBoolean", "", "decodeByte", "", "decodeChar", "", "decodeDouble", "", "decodeEnum", "", "enumDescriptor", "decodeFloat", "", "decodeInline", "decodeInt", "decodeLong", "", "decodeNotNullMark", "decodeNull", "", "decodeNullableSerializableValue", "T", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "decodeSerializableValue", "decodeShort", "", "decodeString", "", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface Decoder {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nDecoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Decoding.kt\nkotlinx/serialization/encoding/Decoder$DefaultImpls\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,575:1\n270#2,2:576\n*S KotlinDebug\n*F\n+ 1 Decoding.kt\nkotlinx/serialization/encoding/Decoder$DefaultImpls\n*L\n263#1:576,2\n*E\n"})
    public static final class DefaultImpls {
        @ExperimentalSerializationApi
        @Nullable
        public static Object decodeNullableSerializableValue(@NotNull Decoder decoder0, @NotNull DeserializationStrategy deserializationStrategy0) {
            Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
            return !deserializationStrategy0.getDescriptor().isNullable() && !decoder0.decodeNotNullMark() ? decoder0.decodeNull() : decoder0.decodeSerializableValue(deserializationStrategy0);
        }

        public static Object decodeSerializableValue(@NotNull Decoder decoder0, @NotNull DeserializationStrategy deserializationStrategy0) {
            Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
            return deserializationStrategy0.deserialize(decoder0);
        }
    }

    @NotNull
    CompositeDecoder beginStructure(@NotNull SerialDescriptor arg1);

    boolean decodeBoolean();

    byte decodeByte();

    char decodeChar();

    double decodeDouble();

    int decodeEnum(@NotNull SerialDescriptor arg1);

    float decodeFloat();

    @NotNull
    Decoder decodeInline(@NotNull SerialDescriptor arg1);

    int decodeInt();

    long decodeLong();

    @ExperimentalSerializationApi
    boolean decodeNotNullMark();

    @ExperimentalSerializationApi
    @Nullable
    Void decodeNull();

    @ExperimentalSerializationApi
    @Nullable
    Object decodeNullableSerializableValue(@NotNull DeserializationStrategy arg1);

    Object decodeSerializableValue(@NotNull DeserializationStrategy arg1);

    short decodeShort();

    @NotNull
    String decodeString();

    @NotNull
    SerializersModule getSerializersModule();
}

