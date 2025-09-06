package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\rH&J \u0010\u000E\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000FH&J \u0010\u0010\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u0011H&J \u0010\u0012\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u0013H&J \u0010\u0014\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u0015H&J\u0018\u0010\u0016\u001A\u00020\u00172\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH&J \u0010\u0018\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000BH&J \u0010\u0019\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u001AH&J?\u0010\u001B\u001A\u00020\u0007\"\b\b\u0000\u0010\u001C*\u00020\u00012\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u0002H\u001C0\u001E2\b\u0010\f\u001A\u0004\u0018\u0001H\u001CH\'\u00A2\u0006\u0002\u0010\u001FJ9\u0010 \u001A\u00020\u0007\"\u0004\b\u0000\u0010\u001C2\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u0002H\u001C0\u001E2\u0006\u0010\f\u001A\u0002H\u001CH&\u00A2\u0006\u0002\u0010\u001FJ \u0010!\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\"H&J \u0010#\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020$H&J\u0010\u0010%\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tH&J\u0018\u0010&\u001A\u00020\r2\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH\u0017R\u0012\u0010\u0002\u001A\u00020\u0003X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005\u00A8\u0006\'"}, d2 = {"Lkotlinx/serialization/encoding/CompositeEncoder;", "", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "encodeBooleanElement", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "index", "", "value", "", "encodeByteElement", "", "encodeCharElement", "", "encodeDoubleElement", "", "encodeFloatElement", "", "encodeInlineElement", "Lkotlinx/serialization/encoding/Encoder;", "encodeIntElement", "encodeLongElement", "", "encodeNullableSerializableElement", "T", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "encodeSerializableElement", "encodeShortElement", "", "encodeStringElement", "", "endStructure", "shouldEncodeElementDefault", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface CompositeEncoder {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @ExperimentalSerializationApi
        public static boolean shouldEncodeElementDefault(@NotNull CompositeEncoder compositeEncoder0, @NotNull SerialDescriptor serialDescriptor0, int v) {
            Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
            return true;
        }
    }

    void encodeBooleanElement(@NotNull SerialDescriptor arg1, int arg2, boolean arg3);

    void encodeByteElement(@NotNull SerialDescriptor arg1, int arg2, byte arg3);

    void encodeCharElement(@NotNull SerialDescriptor arg1, int arg2, char arg3);

    void encodeDoubleElement(@NotNull SerialDescriptor arg1, int arg2, double arg3);

    void encodeFloatElement(@NotNull SerialDescriptor arg1, int arg2, float arg3);

    @NotNull
    Encoder encodeInlineElement(@NotNull SerialDescriptor arg1, int arg2);

    void encodeIntElement(@NotNull SerialDescriptor arg1, int arg2, int arg3);

    void encodeLongElement(@NotNull SerialDescriptor arg1, int arg2, long arg3);

    @ExperimentalSerializationApi
    void encodeNullableSerializableElement(@NotNull SerialDescriptor arg1, int arg2, @NotNull SerializationStrategy arg3, @Nullable Object arg4);

    void encodeSerializableElement(@NotNull SerialDescriptor arg1, int arg2, @NotNull SerializationStrategy arg3, Object arg4);

    void encodeShortElement(@NotNull SerialDescriptor arg1, int arg2, short arg3);

    void encodeStringElement(@NotNull SerialDescriptor arg1, int arg2, @NotNull String arg3);

    void endStructure(@NotNull SerialDescriptor arg1);

    @NotNull
    SerializersModule getSerializersModule();

    @ExperimentalSerializationApi
    boolean shouldEncodeElementDefault(@NotNull SerialDescriptor arg1, int arg2);
}

