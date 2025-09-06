package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\f\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lkotlinx/serialization/json/internal/WriteMode;", "", "", "begin", "C", "end", "OBJ", "LIST", "MAP", "POLY_OBJ", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum WriteMode {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');

    public static final WriteMode[] a;
    public static final EnumEntries b;
    @JvmField
    public final char begin;
    @JvmField
    public final char end;

    static {
        WriteMode.a = arr_writeMode;
        Intrinsics.checkNotNullParameter(arr_writeMode, "entries");
        WriteMode.b = new a(arr_writeMode);
    }

    public WriteMode(char c, char c1) {
        this.begin = c;
        this.end = c1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return WriteMode.b;
    }
}

