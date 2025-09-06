package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000 )2\u00020\u0001:\u0001)J\u0018\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH&J\u0018\u0010\f\u001A\u00020\r2\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH&J\u0018\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH&J\u0010\u0010\u0010\u001A\u00020\u000B2\u0006\u0010\b\u001A\u00020\tH\u0016J\u0018\u0010\u0011\u001A\u00020\u00122\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH&J\u0010\u0010\u0013\u001A\u00020\u000B2\u0006\u0010\b\u001A\u00020\tH&J\u0018\u0010\u0014\u001A\u00020\u00152\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH&J\u0018\u0010\u0016\u001A\u00020\u00172\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH&J\u0018\u0010\u0018\u001A\u00020\u000B2\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH&J\u0018\u0010\u0019\u001A\u00020\u001A2\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH&JE\u0010\u001B\u001A\u0004\u0018\u0001H\u001C\"\b\b\u0000\u0010\u001C*\u00020\u00012\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u000E\u0010\u001D\u001A\n\u0012\u0006\u0012\u0004\u0018\u0001H\u001C0\u001E2\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u0001H\u001CH\'\u00A2\u0006\u0002\u0010 J\b\u0010!\u001A\u00020\u0007H\u0017J=\u0010\"\u001A\u0002H\u001C\"\u0004\b\u0000\u0010\u001C2\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u0002H\u001C0\u001E2\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u0001H\u001CH&\u00A2\u0006\u0002\u0010 J\u0018\u0010#\u001A\u00020$2\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH&J\u0018\u0010%\u001A\u00020&2\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH&J\u0010\u0010\'\u001A\u00020(2\u0006\u0010\b\u001A\u00020\tH&R\u0012\u0010\u0002\u001A\u00020\u0003X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005\u00A8\u0006*"}, d2 = {"Lkotlinx/serialization/encoding/CompositeDecoder;", "", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "decodeBooleanElement", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "index", "", "decodeByteElement", "", "decodeCharElement", "", "decodeCollectionSize", "decodeDoubleElement", "", "decodeElementIndex", "decodeFloatElement", "", "decodeInlineElement", "Lkotlinx/serialization/encoding/Decoder;", "decodeIntElement", "decodeLongElement", "", "decodeNullableSerializableElement", "T", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "previousValue", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "decodeSequentially", "decodeSerializableElement", "decodeShortElement", "", "decodeStringElement", "", "endStructure", "", "Companion", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface CompositeDecoder {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/encoding/CompositeDecoder$Companion;", "", "", "DECODE_DONE", "I", "UNKNOWN_NAME", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public static final int DECODE_DONE = -1;
        public static final int UNKNOWN_NAME = -3;
        public static final Companion a;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static int decodeCollectionSize(@NotNull CompositeDecoder compositeDecoder0, @NotNull SerialDescriptor serialDescriptor0) {
            Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
            return -1;
        }

        public static Object decodeNullableSerializableElement$default(CompositeDecoder compositeDecoder0, SerialDescriptor serialDescriptor0, int v, DeserializationStrategy deserializationStrategy0, Object object0, int v1, Object object1) {
            if(object1 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeNullableSerializableElement");
            }
            if((v1 & 8) != 0) {
                object0 = null;
            }
            return compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, v, deserializationStrategy0, object0);
        }

        @ExperimentalSerializationApi
        public static boolean decodeSequentially(@NotNull CompositeDecoder compositeDecoder0) [...] // Inlined contents

        public static Object decodeSerializableElement$default(CompositeDecoder compositeDecoder0, SerialDescriptor serialDescriptor0, int v, DeserializationStrategy deserializationStrategy0, Object object0, int v1, Object object1) {
            if(object1 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            }
            if((v1 & 8) != 0) {
                object0 = null;
            }
            return compositeDecoder0.decodeSerializableElement(serialDescriptor0, v, deserializationStrategy0, object0);
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final int DECODE_DONE = -1;
    public static final int UNKNOWN_NAME = -3;

    static {
        CompositeDecoder.Companion = Companion.a;
    }

    boolean decodeBooleanElement(@NotNull SerialDescriptor arg1, int arg2);

    byte decodeByteElement(@NotNull SerialDescriptor arg1, int arg2);

    char decodeCharElement(@NotNull SerialDescriptor arg1, int arg2);

    int decodeCollectionSize(@NotNull SerialDescriptor arg1);

    double decodeDoubleElement(@NotNull SerialDescriptor arg1, int arg2);

    int decodeElementIndex(@NotNull SerialDescriptor arg1);

    float decodeFloatElement(@NotNull SerialDescriptor arg1, int arg2);

    @NotNull
    Decoder decodeInlineElement(@NotNull SerialDescriptor arg1, int arg2);

    int decodeIntElement(@NotNull SerialDescriptor arg1, int arg2);

    long decodeLongElement(@NotNull SerialDescriptor arg1, int arg2);

    @ExperimentalSerializationApi
    @Nullable
    Object decodeNullableSerializableElement(@NotNull SerialDescriptor arg1, int arg2, @NotNull DeserializationStrategy arg3, @Nullable Object arg4);

    @ExperimentalSerializationApi
    boolean decodeSequentially();

    Object decodeSerializableElement(@NotNull SerialDescriptor arg1, int arg2, @NotNull DeserializationStrategy arg3, @Nullable Object arg4);

    short decodeShortElement(@NotNull SerialDescriptor arg1, int arg2);

    @NotNull
    String decodeStringElement(@NotNull SerialDescriptor arg1, int arg2);

    void endStructure(@NotNull SerialDescriptor arg1);

    @NotNull
    SerializersModule getSerializersModule();
}

