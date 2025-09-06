package okio;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001A\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001A\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u000B\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lokio/-DeprecatedOkio;", "a", "Lokio/-DeprecatedOkio;", "getOkio", "()Lokio/-DeprecatedOkio;", "Okio", "Lokio/-DeprecatedUtf8;", "b", "Lokio/-DeprecatedUtf8;", "getUtf8", "()Lokio/-DeprecatedUtf8;", "Utf8", "okio"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "-DeprecatedUpgrade")
public final class -DeprecatedUpgrade {
    public static final -DeprecatedOkio a;
    public static final -DeprecatedUtf8 b;

    static {
        -DeprecatedUpgrade.a = -DeprecatedOkio.INSTANCE;
        -DeprecatedUpgrade.b = -DeprecatedUtf8.INSTANCE;
    }

    @NotNull
    public static final -DeprecatedOkio getOkio() {
        return -DeprecatedUpgrade.a;
    }

    @NotNull
    public static final -DeprecatedUtf8 getUtf8() {
        return -DeprecatedUpgrade.b;
    }
}

