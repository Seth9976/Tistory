package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.DecodeSequenceMode;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\u001AA\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00052\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"T", "Lkotlinx/serialization/json/DecodeSequenceMode;", "mode", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "lexer", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "", "JsonIterator", "(Lkotlinx/serialization/json/DecodeSequenceMode;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/internal/ReaderJsonLexer;Lkotlinx/serialization/DeserializationStrategy;)Ljava/util/Iterator;", "kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class JsonIteratorKt {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[DecodeSequenceMode.values().length];
            try {
                arr_v[DecodeSequenceMode.WHITESPACE_SEPARATED.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[DecodeSequenceMode.ARRAY_WRAPPED.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[DecodeSequenceMode.AUTO_DETECT.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @NotNull
    public static final Iterator JsonIterator(@NotNull DecodeSequenceMode decodeSequenceMode0, @NotNull Json json0, @NotNull ReaderJsonLexer readerJsonLexer0, @NotNull DeserializationStrategy deserializationStrategy0) {
        DecodeSequenceMode decodeSequenceMode1;
        Intrinsics.checkNotNullParameter(decodeSequenceMode0, "mode");
        Intrinsics.checkNotNullParameter(json0, "json");
        Intrinsics.checkNotNullParameter(readerJsonLexer0, "lexer");
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        int[] arr_v = WhenMappings.$EnumSwitchMapping$0;
        int v = arr_v[decodeSequenceMode0.ordinal()];
        if(v == 1) {
            decodeSequenceMode1 = DecodeSequenceMode.WHITESPACE_SEPARATED;
        }
        else {
            switch(v) {
                case 2: {
                    if(readerJsonLexer0.peekNextToken() == 8) {
                        readerJsonLexer0.consumeNextToken(8);
                        decodeSequenceMode1 = DecodeSequenceMode.ARRAY_WRAPPED;
                        break;
                    }
                    AbstractJsonLexer.fail$kotlinx_serialization_json$default(readerJsonLexer0, 8, false, 2, null);
                    throw new KotlinNothingValueException();
                }
                case 3: {
                    if(readerJsonLexer0.peekNextToken() == 8) {
                        readerJsonLexer0.consumeNextToken(8);
                        decodeSequenceMode1 = DecodeSequenceMode.ARRAY_WRAPPED;
                    }
                    else {
                        decodeSequenceMode1 = DecodeSequenceMode.WHITESPACE_SEPARATED;
                    }
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        switch(arr_v[decodeSequenceMode1.ordinal()]) {
            case 1: {
                return new b(json0, readerJsonLexer0, deserializationStrategy0);
            }
            case 2: {
                return new a(json0, readerJsonLexer0, deserializationStrategy0);
            }
            case 3: {
                throw new IllegalStateException("AbstractJsonLexer.determineFormat must be called beforehand.");
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}

