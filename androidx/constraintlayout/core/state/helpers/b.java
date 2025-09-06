package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.State.Chain;

public abstract class b {
    public static final int[] a;

    static {
        int[] arr_v = new int[Chain.values().length];
        b.a = arr_v;
        try {
            arr_v[Chain.SPREAD.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.a[Chain.SPREAD_INSIDE.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.a[Chain.PACKED.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

