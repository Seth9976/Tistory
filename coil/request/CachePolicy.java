package coil.request;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000B\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006j\u0002\b\u000Bj\u0002\b\fj\u0002\b\rj\u0002\b\u000E¨\u0006\u000F"}, d2 = {"Lcoil/request/CachePolicy;", "", "", "a", "Z", "getReadEnabled", "()Z", "readEnabled", "b", "getWriteEnabled", "writeEnabled", "ENABLED", "READ_ONLY", "WRITE_ONLY", "DISABLED", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum CachePolicy {
    ENABLED(true, true),
    READ_ONLY(true, false),
    WRITE_ONLY(false, true),
    DISABLED(false, false);

    public final boolean a;
    public final boolean b;
    public static final CachePolicy[] c;
    public static final EnumEntries d;

    static {
        CachePolicy.c = arr_cachePolicy;
        Intrinsics.checkNotNullParameter(arr_cachePolicy, "entries");
        CachePolicy.d = new a(arr_cachePolicy);
    }

    public CachePolicy(boolean z, boolean z1) {
        this.a = z;
        this.b = z1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return CachePolicy.d;
    }

    public final boolean getReadEnabled() {
        return this.a;
    }

    public final boolean getWriteEnabled() {
        return this.b;
    }
}

