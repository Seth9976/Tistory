package kotlinx.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.InternalHexConverter;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\"\u0010\u0000\u001A\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u0005\u001A\"\u0010\u0006\u001A\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\bH\u0086\b¢\u0006\u0002\u0010\t\u001A+\u0010\u0006\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\n\u001A\b\u0012\u0004\u0012\u0002H\u00010\u000B2\u0006\u0010\u0007\u001A\u00020\b¢\u0006\u0002\u0010\f\u001A\"\u0010\r\u001A\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\bH\u0086\b¢\u0006\u0002\u0010\u0010\u001A\"\u0010\u0011\u001A\u00020\u0004\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0012\u001A\u0002H\u0001H\u0086\b¢\u0006\u0002\u0010\u0013\u001A\"\u0010\u0014\u001A\u00020\b\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0012\u001A\u0002H\u0001H\u0086\b¢\u0006\u0002\u0010\u0015\u001A+\u0010\u0014\u001A\u00020\b\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u0002H\u00010\u00172\u0006\u0010\u0012\u001A\u0002H\u0001¢\u0006\u0002\u0010\u0018\u001A\"\u0010\u0019\u001A\u00020\b\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u000E2\u0006\u0010\u0012\u001A\u0002H\u0001H\u0086\b¢\u0006\u0002\u0010\u001A¨\u0006\u001B"}, d2 = {"decodeFromByteArray", "T", "Lkotlinx/serialization/BinaryFormat;", "bytes", "", "(Lkotlinx/serialization/BinaryFormat;[B)Ljava/lang/Object;", "decodeFromHexString", "hex", "", "(Lkotlinx/serialization/BinaryFormat;Ljava/lang/String;)Ljava/lang/Object;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/BinaryFormat;Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;", "decodeFromString", "Lkotlinx/serialization/StringFormat;", "string", "(Lkotlinx/serialization/StringFormat;Ljava/lang/String;)Ljava/lang/Object;", "encodeToByteArray", "value", "(Lkotlinx/serialization/BinaryFormat;Ljava/lang/Object;)[B", "encodeToHexString", "(Lkotlinx/serialization/BinaryFormat;Ljava/lang/Object;)Ljava/lang/String;", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/BinaryFormat;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;", "encodeToString", "(Lkotlinx/serialization/StringFormat;Ljava/lang/Object;)Ljava/lang/String;", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class SerialFormatKt {
    public static final Object decodeFromByteArray(BinaryFormat binaryFormat0, byte[] arr_b) {
        Intrinsics.checkNotNullParameter(binaryFormat0, "<this>");
        Intrinsics.checkNotNullParameter(arr_b, "bytes");
        SerializersModule serializersModule0 = binaryFormat0.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        return binaryFormat0.decodeFromByteArray(SerializersKt.serializer(serializersModule0, null), arr_b);
    }

    public static final Object decodeFromHexString(BinaryFormat binaryFormat0, String s) {
        Intrinsics.checkNotNullParameter(binaryFormat0, "<this>");
        Intrinsics.checkNotNullParameter(s, "hex");
        SerializersModule serializersModule0 = binaryFormat0.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        return SerialFormatKt.decodeFromHexString(binaryFormat0, SerializersKt.serializer(serializersModule0, null), s);
    }

    public static final Object decodeFromHexString(@NotNull BinaryFormat binaryFormat0, @NotNull DeserializationStrategy deserializationStrategy0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(binaryFormat0, "<this>");
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        Intrinsics.checkNotNullParameter(s, "hex");
        return binaryFormat0.decodeFromByteArray(deserializationStrategy0, InternalHexConverter.INSTANCE.parseHexBinary(s));
    }

    public static final Object decodeFromString(StringFormat stringFormat0, String s) {
        Intrinsics.checkNotNullParameter(stringFormat0, "<this>");
        Intrinsics.checkNotNullParameter(s, "string");
        SerializersModule serializersModule0 = stringFormat0.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        return stringFormat0.decodeFromString(SerializersKt.serializer(serializersModule0, null), s);
    }

    public static final byte[] encodeToByteArray(BinaryFormat binaryFormat0, Object object0) {
        Intrinsics.checkNotNullParameter(binaryFormat0, "<this>");
        SerializersModule serializersModule0 = binaryFormat0.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        return binaryFormat0.encodeToByteArray(SerializersKt.serializer(serializersModule0, null), object0);
    }

    public static final String encodeToHexString(BinaryFormat binaryFormat0, Object object0) {
        Intrinsics.checkNotNullParameter(binaryFormat0, "<this>");
        SerializersModule serializersModule0 = binaryFormat0.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        return SerialFormatKt.encodeToHexString(binaryFormat0, SerializersKt.serializer(serializersModule0, null), object0);
    }

    @NotNull
    public static final String encodeToHexString(@NotNull BinaryFormat binaryFormat0, @NotNull SerializationStrategy serializationStrategy0, Object object0) {
        Intrinsics.checkNotNullParameter(binaryFormat0, "<this>");
        Intrinsics.checkNotNullParameter(serializationStrategy0, "serializer");
        byte[] arr_b = binaryFormat0.encodeToByteArray(serializationStrategy0, object0);
        return InternalHexConverter.INSTANCE.printHexBinary(arr_b, true);
    }

    public static final String encodeToString(StringFormat stringFormat0, Object object0) {
        Intrinsics.checkNotNullParameter(stringFormat0, "<this>");
        SerializersModule serializersModule0 = stringFormat0.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        return stringFormat0.encodeToString(SerializersKt.serializer(serializersModule0, null), object0);
    }
}

