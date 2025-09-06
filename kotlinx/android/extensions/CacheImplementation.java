package kotlinx.android.extensions;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/android/extensions/CacheImplementation;", "", "Companion", "SPARSE_ARRAY", "HASH_MAP", "NO_CACHE", "kotlin-android-extensions-runtime"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum CacheImplementation {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/android/extensions/CacheImplementation$Companion;", "", "Lkotlinx/android/extensions/CacheImplementation;", "DEFAULT", "Lkotlinx/android/extensions/CacheImplementation;", "getDEFAULT", "()Lkotlinx/android/extensions/CacheImplementation;", "kotlin-android-extensions-runtime"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final CacheImplementation getDEFAULT() {
            return CacheImplementation.a;
        }
    }

    SPARSE_ARRAY,
    HASH_MAP,
    NO_CACHE;

    @NotNull
    public static final Companion Companion;
    public static final CacheImplementation a;
    public static final CacheImplementation[] b;
    public static final EnumEntries c;

    static {
        CacheImplementation.b = arr_cacheImplementation;
        Intrinsics.checkNotNullParameter(arr_cacheImplementation, "entries");
        CacheImplementation.c = new a(arr_cacheImplementation);
        CacheImplementation.Companion = new Companion(null);
        CacheImplementation.a = CacheImplementation.HASH_MAP;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return CacheImplementation.c;
    }
}

