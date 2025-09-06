package androidx.core.text;

import java.nio.CharBuffer;

public abstract class i implements TextDirectionHeuristicCompat {
    public final TextDirectionAlgorithm a;

    public i(TextDirectionAlgorithm textDirectionHeuristicsCompat$TextDirectionAlgorithm0) {
        this.a = textDirectionHeuristicsCompat$TextDirectionAlgorithm0;
    }

    public abstract boolean a();

    @Override  // androidx.core.text.TextDirectionHeuristicCompat
    public final boolean isRtl(CharSequence charSequence0, int v, int v1) {
        if(charSequence0 != null && v >= 0 && v1 >= 0 && charSequence0.length() - v1 >= v) {
            TextDirectionAlgorithm textDirectionHeuristicsCompat$TextDirectionAlgorithm0 = this.a;
            if(textDirectionHeuristicsCompat$TextDirectionAlgorithm0 == null) {
                return this.a();
            }
            switch(textDirectionHeuristicsCompat$TextDirectionAlgorithm0.checkRtl(charSequence0, v, v1)) {
                case 0: {
                    return true;
                }
                case 1: {
                    return false;
                }
                default: {
                    return this.a();
                }
            }
        }
        throw new IllegalArgumentException();
    }

    @Override  // androidx.core.text.TextDirectionHeuristicCompat
    public final boolean isRtl(char[] arr_c, int v, int v1) {
        return this.isRtl(CharBuffer.wrap(arr_c), v, v1);
    }
}

