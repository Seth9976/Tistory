package kotlinx.serialization.json;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.internal.JavaStreamSerialReader;
import kotlinx.serialization.json.internal.JsonStreamsKt;
import kotlinx.serialization.json.internal.JsonToJavaStreamWriter;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\"\u0010\u0000\u001A\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u0005\u001A-\u0010\u0000\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u0002H\u00010\u00072\u0006\u0010\u0003\u001A\u00020\u0004H\u0007¢\u0006\u0002\u0010\b\u001A8\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\u00010\n\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u0002H\u00010\u00072\b\b\u0002\u0010\u000B\u001A\u00020\fH\u0007\u001A-\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\u00010\n\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\b\b\u0002\u0010\u000B\u001A\u00020\fH\u0087\b\u001A*\u0010\r\u001A\u00020\u000E\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u000F\u001A\u0002H\u00012\u0006\u0010\u0003\u001A\u00020\u0010H\u0087\b¢\u0006\u0002\u0010\u0011\u001A5\u0010\r\u001A\u00020\u000E\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u0002H\u00010\u00132\u0006\u0010\u000F\u001A\u0002H\u00012\u0006\u0010\u0003\u001A\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"decodeFromStream", "T", "Lkotlinx/serialization/json/Json;", "stream", "Ljava/io/InputStream;", "(Lkotlinx/serialization/json/Json;Ljava/io/InputStream;)Ljava/lang/Object;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/DeserializationStrategy;Ljava/io/InputStream;)Ljava/lang/Object;", "decodeToSequence", "Lkotlin/sequences/Sequence;", "format", "Lkotlinx/serialization/json/DecodeSequenceMode;", "encodeToStream", "", "value", "Ljava/io/OutputStream;", "(Lkotlinx/serialization/json/Json;Ljava/lang/Object;Ljava/io/OutputStream;)V", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;Ljava/io/OutputStream;)V", "kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class JvmStreamsKt {
    @ExperimentalSerializationApi
    public static final Object decodeFromStream(Json json0, InputStream inputStream0) {
        Intrinsics.checkNotNullParameter(json0, "<this>");
        Intrinsics.checkNotNullParameter(inputStream0, "stream");
        Intrinsics.reifiedOperationMarker(6, "T");
        return JvmStreamsKt.decodeFromStream(json0, SerializersKt.serializer(json0.getSerializersModule(), null), inputStream0);
    }

    @ExperimentalSerializationApi
    public static final Object decodeFromStream(@NotNull Json json0, @NotNull DeserializationStrategy deserializationStrategy0, @NotNull InputStream inputStream0) {
        Intrinsics.checkNotNullParameter(json0, "<this>");
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        Intrinsics.checkNotNullParameter(inputStream0, "stream");
        JavaStreamSerialReader javaStreamSerialReader0 = new JavaStreamSerialReader(inputStream0);
        try {
            return JsonStreamsKt.decodeByReader(json0, deserializationStrategy0, javaStreamSerialReader0);
        }
        finally {
            javaStreamSerialReader0.release();
        }
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final Sequence decodeToSequence(@NotNull Json json0, @NotNull InputStream inputStream0, @NotNull DeserializationStrategy deserializationStrategy0, @NotNull DecodeSequenceMode decodeSequenceMode0) {
        Intrinsics.checkNotNullParameter(json0, "<this>");
        Intrinsics.checkNotNullParameter(inputStream0, "stream");
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        Intrinsics.checkNotNullParameter(decodeSequenceMode0, "format");
        return JsonStreamsKt.decodeToSequenceByReader(json0, new JavaStreamSerialReader(inputStream0), deserializationStrategy0, decodeSequenceMode0);
    }

    @ExperimentalSerializationApi
    public static final Sequence decodeToSequence(Json json0, InputStream inputStream0, DecodeSequenceMode decodeSequenceMode0) {
        Intrinsics.checkNotNullParameter(json0, "<this>");
        Intrinsics.checkNotNullParameter(inputStream0, "stream");
        Intrinsics.checkNotNullParameter(decodeSequenceMode0, "format");
        Intrinsics.reifiedOperationMarker(6, "T");
        return JvmStreamsKt.decodeToSequence(json0, inputStream0, SerializersKt.serializer(json0.getSerializersModule(), null), decodeSequenceMode0);
    }

    public static Sequence decodeToSequence$default(Json json0, InputStream inputStream0, DeserializationStrategy deserializationStrategy0, DecodeSequenceMode decodeSequenceMode0, int v, Object object0) {
        if((v & 4) != 0) {
            decodeSequenceMode0 = DecodeSequenceMode.AUTO_DETECT;
        }
        return JvmStreamsKt.decodeToSequence(json0, inputStream0, deserializationStrategy0, decodeSequenceMode0);
    }

    public static Sequence decodeToSequence$default(Json json0, InputStream inputStream0, DecodeSequenceMode decodeSequenceMode0, int v, Object object0) {
        if((v & 2) != 0) {
            decodeSequenceMode0 = DecodeSequenceMode.AUTO_DETECT;
        }
        Intrinsics.checkNotNullParameter(json0, "<this>");
        Intrinsics.checkNotNullParameter(inputStream0, "stream");
        Intrinsics.checkNotNullParameter(decodeSequenceMode0, "format");
        Intrinsics.reifiedOperationMarker(6, "T");
        return JvmStreamsKt.decodeToSequence(json0, inputStream0, SerializersKt.serializer(json0.getSerializersModule(), null), decodeSequenceMode0);
    }

    @ExperimentalSerializationApi
    public static final void encodeToStream(Json json0, Object object0, OutputStream outputStream0) {
        Intrinsics.checkNotNullParameter(json0, "<this>");
        Intrinsics.checkNotNullParameter(outputStream0, "stream");
        Intrinsics.reifiedOperationMarker(6, "T");
        JvmStreamsKt.encodeToStream(json0, SerializersKt.serializer(json0.getSerializersModule(), null), object0, outputStream0);
    }

    @ExperimentalSerializationApi
    public static final void encodeToStream(@NotNull Json json0, @NotNull SerializationStrategy serializationStrategy0, Object object0, @NotNull OutputStream outputStream0) {
        Intrinsics.checkNotNullParameter(json0, "<this>");
        Intrinsics.checkNotNullParameter(serializationStrategy0, "serializer");
        Intrinsics.checkNotNullParameter(outputStream0, "stream");
        JsonToJavaStreamWriter jsonToJavaStreamWriter0 = new JsonToJavaStreamWriter(outputStream0);
        try {
            JsonStreamsKt.encodeByWriter(json0, jsonToJavaStreamWriter0, serializationStrategy0, object0);
        }
        finally {
            jsonToJavaStreamWriter0.release();
        }
    }
}

