package androidx.constraintlayout.widget;

import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;

public abstract class b {
    public static final int[] a;

    static {
        int[] arr_v = new int[DimensionBehaviour.values().length];
        b.a = arr_v;
        try {
            arr_v[DimensionBehaviour.FIXED.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.a[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.a[DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.a[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

