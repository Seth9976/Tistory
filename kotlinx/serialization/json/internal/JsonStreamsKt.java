package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.DecodeSequenceMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonEncoder;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A1\u0010\u0000\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u0002H\u00010\u00052\u0006\u0010\u0006\u001A\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001A<\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\u00010\n\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00072\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u0002H\u00010\u00052\b\b\u0002\u0010\u000B\u001A\u00020\fH\u0007\u001A1\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\u00010\n\"\u0006\b\u0000\u0010\u0001\u0018\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\u000B\u001A\u00020\fH\u0087\b\u001A9\u0010\r\u001A\u00020\u000E\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u000F\u001A\u00020\u00102\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u0002H\u00010\u00122\u0006\u0010\u0013\u001A\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"decodeByReader", "T", "json", "Lkotlinx/serialization/json/Json;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "reader", "Lkotlinx/serialization/json/internal/InternalJsonReader;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/serialization/json/internal/InternalJsonReader;)Ljava/lang/Object;", "decodeToSequenceByReader", "Lkotlin/sequences/Sequence;", "format", "Lkotlinx/serialization/json/DecodeSequenceMode;", "encodeByWriter", "", "writer", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "value", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/InternalJsonWriter;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class JsonStreamsKt {
    @JsonFriendModuleApi
    public static final Object decodeByReader(@NotNull Json json0, @NotNull DeserializationStrategy deserializationStrategy0, @NotNull InternalJsonReader internalJsonReader0) {
        Intrinsics.checkNotNullParameter(json0, "json");
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        Intrinsics.checkNotNullParameter(internalJsonReader0, "reader");
        ReaderJsonLexer readerJsonLexer0 = new ReaderJsonLexer(internalJsonReader0, null, 2, null);
        try {
            SerialDescriptor serialDescriptor0 = deserializationStrategy0.getDescriptor();
            Object object0 = new StreamingJsonDecoder(json0, WriteMode.OBJ, readerJsonLexer0, serialDescriptor0, null).decodeSerializableValue(deserializationStrategy0);
            readerJsonLexer0.expectEof();
            return object0;
        }
        finally {
            readerJsonLexer0.release();
        }
    }

    @ExperimentalSerializationApi
    @JsonFriendModuleApi
    @NotNull
    public static final Sequence decodeToSequenceByReader(@NotNull Json json0, @NotNull InternalJsonReader internalJsonReader0, @NotNull DeserializationStrategy deserializationStrategy0, @NotNull DecodeSequenceMode decodeSequenceMode0) {
        Intrinsics.checkNotNullParameter(json0, "json");
        Intrinsics.checkNotNullParameter(internalJsonReader0, "reader");
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        Intrinsics.checkNotNullParameter(decodeSequenceMode0, "format");
        return SequencesKt__SequencesKt.constrainOnce(new Sequence() {
            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                return JsonIteratorKt.JsonIterator(decodeSequenceMode0, json0, new ReaderJsonLexer(internalJsonReader0, new char[0x4000]), deserializationStrategy0);
            }
        });
    }

    @ExperimentalSerializationApi
    @JsonFriendModuleApi
    public static final Sequence decodeToSequenceByReader(Json json0, InternalJsonReader internalJsonReader0, DecodeSequenceMode decodeSequenceMode0) {
        Intrinsics.checkNotNullParameter(json0, "json");
        Intrinsics.checkNotNullParameter(internalJsonReader0, "reader");
        Intrinsics.checkNotNullParameter(decodeSequenceMode0, "format");
        Intrinsics.reifiedOperationMarker(6, "T");
        return JsonStreamsKt.decodeToSequenceByReader(json0, internalJsonReader0, SerializersKt.serializer(json0.getSerializersModule(), null), decodeSequenceMode0);
    }

    public static Sequence decodeToSequenceByReader$default(Json json0, InternalJsonReader internalJsonReader0, DeserializationStrategy deserializationStrategy0, DecodeSequenceMode decodeSequenceMode0, int v, Object object0) {
        if((v & 8) != 0) {
            decodeSequenceMode0 = DecodeSequenceMode.AUTO_DETECT;
        }
        return JsonStreamsKt.decodeToSequenceByReader(json0, internalJsonReader0, deserializationStrategy0, decodeSequenceMode0);
    }

    public static Sequence decodeToSequenceByReader$default(Json json0, InternalJsonReader internalJsonReader0, DecodeSequenceMode decodeSequenceMode0, int v, Object object0) {
        if((v & 4) != 0) {
            decodeSequenceMode0 = DecodeSequenceMode.AUTO_DETECT;
        }
        Intrinsics.checkNotNullParameter(json0, "json");
        Intrinsics.checkNotNullParameter(internalJsonReader0, "reader");
        Intrinsics.checkNotNullParameter(decodeSequenceMode0, "format");
        Intrinsics.reifiedOperationMarker(6, "T");
        return JsonStreamsKt.decodeToSequenceByReader(json0, internalJsonReader0, SerializersKt.serializer(json0.getSerializersModule(), null), decodeSequenceMode0);
    }

    @JsonFriendModuleApi
    public static final void encodeByWriter(@NotNull Json json0, @NotNull InternalJsonWriter internalJsonWriter0, @NotNull SerializationStrategy serializationStrategy0, Object object0) {
        Intrinsics.checkNotNullParameter(json0, "json");
        Intrinsics.checkNotNullParameter(internalJsonWriter0, "writer");
        Intrinsics.checkNotNullParameter(serializationStrategy0, "serializer");
        JsonEncoder[] arr_jsonEncoder = new JsonEncoder[WriteMode.getEntries().size()];
        new StreamingJsonEncoder(internalJsonWriter0, json0, WriteMode.OBJ, arr_jsonEncoder).encodeSerializableValue(serializationStrategy0, object0);
    }
}

