package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;

public abstract class g {
    public static final int[] a;

    static {
        int[] arr_v = new int[Type.values().length];
        g.a = arr_v;
        try {
            arr_v[Type.LEFT.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            g.a[Type.RIGHT.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            g.a[Type.TOP.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            g.a[Type.BASELINE.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            g.a[Type.BOTTOM.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

