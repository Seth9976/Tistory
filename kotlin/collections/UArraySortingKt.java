package kotlin.collections;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\'\u0010\b\u001A\u00020\u00052\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001A\'\u0010\b\u001A\u00020\u00052\u0006\u0010\u0001\u001A\u00020\t2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000B\u001A\'\u0010\b\u001A\u00020\u00052\u0006\u0010\u0001\u001A\u00020\f2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002H\u0001¢\u0006\u0004\b\r\u0010\u000E\u001A\'\u0010\b\u001A\u00020\u00052\u0006\u0010\u0001\u001A\u00020\u000F2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002H\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/UByteArray;", "array", "", "fromIndex", "toIndex", "", "sortArray-4UcCI2c", "([BII)V", "sortArray", "Lkotlin/UShortArray;", "sortArray-Aa5vz7o", "([SII)V", "Lkotlin/UIntArray;", "sortArray-oBK06Vg", "([III)V", "Lkotlin/ULongArray;", "sortArray--nroSd4", "([JII)V", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class UArraySortingKt {
    public static final void a(long[] arr_v, int v, int v1) {
        long v2 = ULongArray.get-s-VKNKU(arr_v, (v + v1) / 2);
        int v3 = v;
        int v4 = v1;
        while(v3 <= v4) {
            while(Long.compareUnsigned(ULongArray.get-s-VKNKU(arr_v, v3), v2) < 0) {
                ++v3;
            }
            while(Long.compareUnsigned(ULongArray.get-s-VKNKU(arr_v, v4), v2) > 0) {
                --v4;
            }
            if(v3 <= v4) {
                long v5 = ULongArray.get-s-VKNKU(arr_v, v3);
                ULongArray.set-k8EXiF4(arr_v, v3, ULongArray.get-s-VKNKU(arr_v, v4));
                ULongArray.set-k8EXiF4(arr_v, v4, v5);
                ++v3;
                --v4;
            }
        }
        if(v < v3 - 1) {
            UArraySortingKt.a(arr_v, v, v3 - 1);
        }
        if(v3 < v1) {
            UArraySortingKt.a(arr_v, v3, v1);
        }
    }

    public static final void b(byte[] arr_b, int v, int v1) {
        int v2 = UByteArray.get-w2LRezQ(arr_b, (v + v1) / 2);
        int v3 = v;
        int v4 = v1;
        while(v3 <= v4) {
            while(Intrinsics.compare(UByteArray.get-w2LRezQ(arr_b, v3) & 0xFF, v2 & 0xFF) < 0) {
                ++v3;
            }
            while(Intrinsics.compare(UByteArray.get-w2LRezQ(arr_b, v4) & 0xFF, v2 & 0xFF) > 0) {
                --v4;
            }
            if(v3 <= v4) {
                int v5 = UByteArray.get-w2LRezQ(arr_b, v3);
                UByteArray.set-VurrAj0(arr_b, v3, UByteArray.get-w2LRezQ(arr_b, v4));
                UByteArray.set-VurrAj0(arr_b, v4, ((byte)v5));
                ++v3;
                --v4;
            }
        }
        if(v < v3 - 1) {
            UArraySortingKt.b(arr_b, v, v3 - 1);
        }
        if(v3 < v1) {
            UArraySortingKt.b(arr_b, v3, v1);
        }
    }

    public static final void c(short[] arr_v, int v, int v1) {
        int v2 = UShortArray.get-Mh2AYeg(arr_v, (v + v1) / 2);
        int v3 = v;
        int v4 = v1;
        while(v3 <= v4) {
            while(Intrinsics.compare(UShortArray.get-Mh2AYeg(arr_v, v3) & 0xFFFF, v2 & 0xFFFF) < 0) {
                ++v3;
            }
            while(Intrinsics.compare(UShortArray.get-Mh2AYeg(arr_v, v4) & 0xFFFF, v2 & 0xFFFF) > 0) {
                --v4;
            }
            if(v3 <= v4) {
                int v5 = UShortArray.get-Mh2AYeg(arr_v, v3);
                UShortArray.set-01HTLdE(arr_v, v3, UShortArray.get-Mh2AYeg(arr_v, v4));
                UShortArray.set-01HTLdE(arr_v, v4, ((short)v5));
                ++v3;
                --v4;
            }
        }
        if(v < v3 - 1) {
            UArraySortingKt.c(arr_v, v, v3 - 1);
        }
        if(v3 < v1) {
            UArraySortingKt.c(arr_v, v3, v1);
        }
    }

    public static final void d(int v, int v1, int[] arr_v) {
        int v2 = UIntArray.get-pVg5ArA(arr_v, (v + v1) / 2);
        int v3 = v;
        int v4 = v1;
        while(v3 <= v4) {
            while(Integer.compareUnsigned(UIntArray.get-pVg5ArA(arr_v, v3), v2) < 0) {
                ++v3;
            }
            while(Integer.compareUnsigned(UIntArray.get-pVg5ArA(arr_v, v4), v2) > 0) {
                --v4;
            }
            if(v3 <= v4) {
                int v5 = UIntArray.get-pVg5ArA(arr_v, v3);
                UIntArray.set-VXSXFK8(arr_v, v3, UIntArray.get-pVg5ArA(arr_v, v4));
                UIntArray.set-VXSXFK8(arr_v, v4, v5);
                ++v3;
                --v4;
            }
        }
        if(v < v3 - 1) {
            UArraySortingKt.d(v, v3 - 1, arr_v);
        }
        if(v3 < v1) {
            UArraySortingKt.d(v3, v1, arr_v);
        }
    }

    @ExperimentalUnsignedTypes
    public static final void sortArray--nroSd4(@NotNull long[] arr_v, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_v, "array");
        UArraySortingKt.a(arr_v, v, v1 - 1);
    }

    @ExperimentalUnsignedTypes
    public static final void sortArray-4UcCI2c(@NotNull byte[] arr_b, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_b, "array");
        UArraySortingKt.b(arr_b, v, v1 - 1);
    }

    @ExperimentalUnsignedTypes
    public static final void sortArray-Aa5vz7o(@NotNull short[] arr_v, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_v, "array");
        UArraySortingKt.c(arr_v, v, v1 - 1);
    }

    @ExperimentalUnsignedTypes
    public static final void sortArray-oBK06Vg(@NotNull int[] arr_v, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_v, "array");
        UArraySortingKt.d(v, v1 - 1, arr_v);
    }
}

