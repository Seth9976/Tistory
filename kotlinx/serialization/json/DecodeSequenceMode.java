package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/json/DecodeSequenceMode;", "", "WHITESPACE_SEPARATED", "ARRAY_WRAPPED", "AUTO_DETECT", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@ExperimentalSerializationApi
public enum DecodeSequenceMode {
    WHITESPACE_SEPARATED,
    ARRAY_WRAPPED,
    AUTO_DETECT;

    public static final DecodeSequenceMode[] a;
    public static final EnumEntries b;

    static {
        DecodeSequenceMode.a = arr_decodeSequenceMode;
        Intrinsics.checkNotNullParameter(arr_decodeSequenceMode, "entries");
        DecodeSequenceMode.b = new a(arr_decodeSequenceMode);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return DecodeSequenceMode.b;
    }
}

