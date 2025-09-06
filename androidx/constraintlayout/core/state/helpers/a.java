package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.State.Direction;

public abstract class a {
    public static final int[] a;

    static {
        int[] arr_v = new int[Direction.values().length];
        a.a = arr_v;
        try {
            arr_v[Direction.LEFT.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Direction.START.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Direction.RIGHT.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Direction.END.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Direction.TOP.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Direction.BOTTOM.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

