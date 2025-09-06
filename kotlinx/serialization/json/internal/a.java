package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;

public final class a implements Iterator, KMappedMarker {
    public final Json a;
    public final ReaderJsonLexer b;
    public final DeserializationStrategy c;
    public boolean d;
    public boolean e;

    public a(Json json0, ReaderJsonLexer readerJsonLexer0, DeserializationStrategy deserializationStrategy0) {
        Intrinsics.checkNotNullParameter(json0, "json");
        Intrinsics.checkNotNullParameter(readerJsonLexer0, "lexer");
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        super();
        this.a = json0;
        this.b = readerJsonLexer0;
        this.c = deserializationStrategy0;
        this.d = true;
    }

    @Override
    public final boolean hasNext() {
        if(this.e) {
            return false;
        }
        ReaderJsonLexer readerJsonLexer0 = this.b;
        if(readerJsonLexer0.peekNextToken() == 9) {
            this.e = true;
            readerJsonLexer0.consumeNextToken(9);
            if(readerJsonLexer0.isNotEof()) {
                if(readerJsonLexer0.peekNextToken() != 8) {
                    readerJsonLexer0.expectEof();
                    return false;
                }
                AbstractJsonLexer.fail$default(this.b, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn\'t merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            return false;
        }
        if(!readerJsonLexer0.isNotEof() && !this.e) {
            AbstractJsonLexer.fail$kotlinx_serialization_json$default(readerJsonLexer0, 9, false, 2, null);
            throw new KotlinNothingValueException();
        }
        return true;
    }

    @Override
    public final Object next() {
        if(this.d) {
            this.d = false;
        }
        else {
            this.b.consumeNextToken(',');
        }
        SerialDescriptor serialDescriptor0 = this.c.getDescriptor();
        return new StreamingJsonDecoder(this.a, WriteMode.OBJ, this.b, serialDescriptor0, null).decodeSerializableValue(this.c);
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

