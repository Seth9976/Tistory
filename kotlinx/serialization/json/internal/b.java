package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;

public final class b implements Iterator, KMappedMarker {
    public final Json a;
    public final ReaderJsonLexer b;
    public final DeserializationStrategy c;

    public b(Json json0, ReaderJsonLexer readerJsonLexer0, DeserializationStrategy deserializationStrategy0) {
        Intrinsics.checkNotNullParameter(json0, "json");
        Intrinsics.checkNotNullParameter(readerJsonLexer0, "lexer");
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        super();
        this.a = json0;
        this.b = readerJsonLexer0;
        this.c = deserializationStrategy0;
    }

    @Override
    public final boolean hasNext() {
        return this.b.isNotEof();
    }

    @Override
    public final Object next() {
        SerialDescriptor serialDescriptor0 = this.c.getDescriptor();
        return new StreamingJsonDecoder(this.a, WriteMode.OBJ, this.b, serialDescriptor0, null).decodeSerializableValue(this.c);
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

