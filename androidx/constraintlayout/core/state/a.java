package androidx.constraintlayout.core.state;

public abstract class a {
    public static final int[] a;

    static {
        int[] arr_v = new int[Constraint.values().length];
        a.a = arr_v;
        try {
            arr_v[Constraint.LEFT_TO_LEFT.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Constraint.LEFT_TO_RIGHT.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Constraint.RIGHT_TO_LEFT.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Constraint.RIGHT_TO_RIGHT.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Constraint.START_TO_START.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Constraint.START_TO_END.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Constraint.END_TO_START.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Constraint.END_TO_END.ordinal()] = 8;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Constraint.TOP_TO_TOP.ordinal()] = 9;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Constraint.TOP_TO_BOTTOM.ordinal()] = 10;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Constraint.BOTTOM_TO_TOP.ordinal()] = 11;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Constraint.BOTTOM_TO_BOTTOM.ordinal()] = 12;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Constraint.BASELINE_TO_BOTTOM.ordinal()] = 13;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Constraint.BASELINE_TO_TOP.ordinal()] = 14;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Constraint.BASELINE_TO_BASELINE.ordinal()] = 15;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Constraint.CIRCULAR_CONSTRAINT.ordinal()] = 16;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Constraint.CENTER_HORIZONTALLY.ordinal()] = 17;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            a.a[Constraint.CENTER_VERTICALLY.ordinal()] = 18;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

