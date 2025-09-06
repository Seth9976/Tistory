package androidx.core.text;

public final class TextDirectionHeuristicsCompat {
    interface TextDirectionAlgorithm {
        int checkRtl(CharSequence arg1, int arg2, int arg3);
    }

    public static final TextDirectionHeuristicCompat ANYRTL_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_RTL;
    public static final TextDirectionHeuristicCompat LOCALE;
    public static final TextDirectionHeuristicCompat LTR;
    public static final TextDirectionHeuristicCompat RTL;

    static {
        TextDirectionHeuristicsCompat.LTR = new j(null, false);
        TextDirectionHeuristicsCompat.RTL = new j(null, true);
        TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR = new j(h.a, false);
        TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL = new j(h.a, true);
        TextDirectionHeuristicsCompat.ANYRTL_LTR = new j(g.a, false);
        TextDirectionHeuristicsCompat.LOCALE = k.b;
    }
}

