package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000E\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH\u0016J\u0010\u0010\f\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tH&J\u0010\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0010H&J\u0010\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0012H&J\u0010\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0014H&J\u0010\u0010\u0015\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0016H&J\u0018\u0010\u0017\u001A\u00020\u000E2\u0006\u0010\u0018\u001A\u00020\t2\u0006\u0010\u0019\u001A\u00020\u000BH&J\u0010\u0010\u001A\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u001BH&J\u0010\u0010\u001C\u001A\u00020\u00002\u0006\u0010\b\u001A\u00020\tH&J\u0010\u0010\u001D\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u000BH&J\u0010\u0010\u001E\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u001FH&J\b\u0010 \u001A\u00020\u000EH\u0017J\b\u0010!\u001A\u00020\u000EH\'J/\u0010\"\u001A\u00020\u000E\"\b\b\u0000\u0010#*\u00020\u00012\f\u0010$\u001A\b\u0012\u0004\u0012\u0002H#0%2\b\u0010\u000F\u001A\u0004\u0018\u0001H#H\u0017\u00A2\u0006\u0002\u0010&J)\u0010\'\u001A\u00020\u000E\"\u0004\b\u0000\u0010#2\f\u0010$\u001A\b\u0012\u0004\u0012\u0002H#0%2\u0006\u0010\u000F\u001A\u0002H#H\u0016\u00A2\u0006\u0002\u0010&J\u0010\u0010(\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020)H&J\u0010\u0010*\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020+H&R\u0012\u0010\u0002\u001A\u00020\u0003X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005\u00A8\u0006,"}, d2 = {"Lkotlinx/serialization/encoding/Encoder;", "", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "beginCollection", "Lkotlinx/serialization/encoding/CompositeEncoder;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "collectionSize", "", "beginStructure", "encodeBoolean", "", "value", "", "encodeByte", "", "encodeChar", "", "encodeDouble", "", "encodeEnum", "enumDescriptor", "index", "encodeFloat", "", "encodeInline", "encodeInt", "encodeLong", "", "encodeNotNullMark", "encodeNull", "encodeNullableSerializableValue", "T", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "encodeSerializableValue", "encodeShort", "", "encodeString", "", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface Encoder {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @NotNull
        public static CompositeEncoder beginCollection(@NotNull Encoder encoder0, @NotNull SerialDescriptor serialDescriptor0, int v) {
            Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
            return encoder0.beginStructure(serialDescriptor0);
        }

        @ExperimentalSerializationApi
        public static void encodeNotNullMark(@NotNull Encoder encoder0) {
        }

        @ExperimentalSerializationApi
        public static void encodeNullableSerializableValue(@NotNull Encoder encoder0, @NotNull SerializationStrategy serializationStrategy0, @Nullable Object object0) {
            Intrinsics.checkNotNullParameter(serializationStrategy0, "serializer");
            if(serializationStrategy0.getDescriptor().isNullable()) {
                encoder0.encodeSerializableValue(serializationStrategy0, object0);
                return;
            }
            if(object0 == null) {
                encoder0.encodeNull();
                return;
            }
            encoder0.encodeNotNullMark();
            encoder0.encodeSerializableValue(serializationStrategy0, object0);
        }

        public static void encodeSerializableValue(@NotNull Encoder encoder0, @NotNull SerializationStrategy serializationStrategy0, Object object0) {
            Intrinsics.checkNotNullParameter(serializationStrategy0, "serializer");
            serializationStrategy0.serialize(encoder0, object0);
        }
    }

    @NotNull
    CompositeEncoder beginCollection(@NotNull SerialDescriptor arg1, int arg2);

    @NotNull
    CompositeEncoder beginStructure(@NotNull SerialDescriptor arg1);

    void encodeBoolean(boolean arg1);

    void encodeByte(byte arg1);

    void encodeChar(char arg1);

    void encodeDouble(double arg1);

    void encodeEnum(@NotNull SerialDescriptor arg1, int arg2);

    void encodeFloat(float arg1);

    @NotNull
    Encoder encodeInline(@NotNull SerialDescriptor arg1);

    void encodeInt(int arg1);

    void encodeLong(long arg1);

    @ExperimentalSerializationApi
    void encodeNotNullMark();

    @ExperimentalSerializationApi
    void encodeNull();

    @ExperimentalSerializationApi
    void encodeNullableSerializableValue(@NotNull SerializationStrategy arg1, @Nullable Object arg2);

    void encodeSerializableValue(@NotNull SerializationStrategy arg1, Object arg2);

    void encodeShort(short arg1);

    void encodeString(@NotNull String arg1);

    @NotNull
    SerializersModule getSerializersModule();
}

