package coil.decode;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcoil/decode/DataSource;", "", "MEMORY_CACHE", "MEMORY", "DISK", "NETWORK", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum DataSource {
    MEMORY_CACHE,
    MEMORY,
    DISK,
    NETWORK;

    public static final DataSource[] a;
    public static final EnumEntries b;

    static {
        DataSource.a = arr_dataSource;
        Intrinsics.checkNotNullParameter(arr_dataSource, "entries");
        DataSource.b = new a(arr_dataSource);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return DataSource.b;
    }
}

