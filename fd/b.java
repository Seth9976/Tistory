package fd;

import io.reactivex.parallel.ParallelFailureHandling;

public abstract class b {
    public static final int[] a;

    static {
        int[] arr_v = new int[ParallelFailureHandling.values().length];
        b.a = arr_v;
        try {
            arr_v[ParallelFailureHandling.RETRY.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.a[ParallelFailureHandling.SKIP.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.a[ParallelFailureHandling.STOP.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

