package kotlin.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\u001A\'\u0010\u0004\u001A\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001A\'\u0010\u0004\u001A\u00020\u00062\u0006\u0010\u0001\u001A\u00020\u00062\u0006\u0010\u0002\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u0006H\u0001¢\u0006\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"", "start", "end", "step", "getProgressionLastElement", "(III)I", "", "(JJJ)J", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ProgressionUtilKt {
    @PublishedApi
    public static final int getProgressionLastElement(int v, int v1, int v2) {
        if(v2 > 0) {
            if(v >= v1) {
                return v1;
            }
            int v3 = v1 % v2;
            if(v3 < 0) {
                v3 += v2;
            }
            int v4 = v % v2;
            if(v4 < 0) {
                v4 += v2;
            }
            int v5 = (v3 - v4) % v2;
            if(v5 < 0) {
                v5 += v2;
            }
            return v1 - v5;
        }
        if(v2 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if(v > v1) {
            int v6 = v % -v2;
            if(v6 < 0) {
                v6 -= v2;
            }
            int v7 = v1 % -v2;
            if(v7 < 0) {
                v7 -= v2;
            }
            int v8 = (v6 - v7) % -v2;
            if(v8 < 0) {
                v8 -= v2;
            }
            return v1 + v8;
        }
        return v1;
    }

    @PublishedApi
    public static final long getProgressionLastElement(long v, long v1, long v2) {
        int v3 = Long.compare(v2, 0L);
        if(v3 > 0) {
            if(v >= v1) {
                return v1;
            }
            long v4 = v1 % v2;
            if(v4 < 0L) {
                v4 += v2;
            }
            long v5 = v % v2;
            if(v5 < 0L) {
                v5 += v2;
            }
            long v6 = (v4 - v5) % v2;
            if(v6 < 0L) {
                v6 += v2;
            }
            return v1 - v6;
        }
        if(v3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if(v > v1) {
            long v7 = v % -v2;
            if(v7 < 0L) {
                v7 -= v2;
            }
            long v8 = v1 % -v2;
            if(v8 < 0L) {
                v8 -= v2;
            }
            long v9 = (v7 - v8) % -v2;
            if(v9 < 0L) {
                v9 -= v2;
            }
            return v1 + v9;
        }
        return v1;
    }
}

