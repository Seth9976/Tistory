package androidx.fragment.app;

import androidx.lifecycle.Lifecycle.State;

public abstract class j1 {
    public static final int[] a;

    static {
        int[] arr_v = new int[State.values().length];
        j1.a = arr_v;
        try {
            arr_v[State.RESUMED.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            j1.a[State.STARTED.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            j1.a[State.CREATED.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            j1.a[State.INITIALIZED.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

