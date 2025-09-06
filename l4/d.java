package l4;

import androidx.loader.content.ModernAsyncTask.Status;

public abstract class d {
    public static final int[] a;

    static {
        int[] arr_v = new int[ModernAsyncTask.Status.values().length];
        d.a = arr_v;
        try {
            arr_v[ModernAsyncTask.Status.RUNNING.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            d.a[ModernAsyncTask.Status.FINISHED.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

