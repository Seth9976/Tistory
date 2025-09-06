package kotlin.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001A\'\u0010\u0007\u001A\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\u0006\u0010\u0004\u001A\u00020\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001A\'\u0010\u0007\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\b2\u0006\u0010\u0002\u001A\u00020\b2\u0006\u0010\u0004\u001A\u00020\tH\u0001¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Lkotlin/UInt;", "start", "end", "", "step", "getProgressionLastElement-Nkh28Cs", "(III)I", "getProgressionLastElement", "Lkotlin/ULong;", "", "getProgressionLastElement-7ftBX0g", "(JJJ)J", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class UProgressionUtilKt {
    public static final int a(int v, int v1, int v2) {
        int v3 = Integer.remainderUnsigned(v, v2);
        int v4 = Integer.remainderUnsigned(v1, v2);
        int v5 = v3 - v4;
        return Integer.compareUnsigned(v3, v4) >= 0 ? v5 : v5 + v2;
    }

    public static final long b(long v, long v1, long v2) {
        long v3 = Long.remainderUnsigned(v, v2);
        long v4 = Long.remainderUnsigned(v1, v2);
        long v5 = v3 - v4;
        return Long.compareUnsigned(v3, v4) >= 0 ? v5 : v5 + v2;
    }

    @PublishedApi
    @SinceKotlin(version = "1.3")
    public static final long getProgressionLastElement-7ftBX0g(long v, long v1, long v2) {
        int v3 = Long.compare(v2, 0L);
        if(v3 > 0) {
            return Long.compareUnsigned(v, v1) >= 0 ? v1 : v1 - UProgressionUtilKt.b(v1, v, v2);
        }
        if(v3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        return Long.compareUnsigned(v, v1) <= 0 ? v1 : v1 + UProgressionUtilKt.b(v, v1, -v2);
    }

    @PublishedApi
    @SinceKotlin(version = "1.3")
    public static final int getProgressionLastElement-Nkh28Cs(int v, int v1, int v2) {
        if(v2 > 0) {
            return Integer.compareUnsigned(v, v1) >= 0 ? v1 : v1 - UProgressionUtilKt.a(v1, v, v2);
        }
        if(v2 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        return Integer.compareUnsigned(v, v1) <= 0 ? v1 : UProgressionUtilKt.a(v, v1, -v2) + v1;
    }
}

