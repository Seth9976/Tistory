package androidx.work.impl.background.systemjob;

import androidx.work.NetworkType;

public abstract class b {
    public static final int[] a;

    static {
        int[] arr_v = new int[NetworkType.values().length];
        b.a = arr_v;
        try {
            arr_v[NetworkType.NOT_REQUIRED.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.a[NetworkType.CONNECTED.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.a[NetworkType.UNMETERED.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.a[NetworkType.NOT_ROAMING.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.a[NetworkType.METERED.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

