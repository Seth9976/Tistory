package androidx.core.text;

public final class g implements TextDirectionAlgorithm {
    public static final g a;

    static {
        g.a = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionAlgorithm
    public final int checkRtl(CharSequence charSequence0, int v, int v1) {
        int v2 = v1 + v;
        boolean z = false;
        while(v < v2) {
            switch(Character.getDirectionality(charSequence0.charAt(v))) {
                case 0: {
                    z = true;
                    break;
                }
                case 1: 
                case 2: {
                    return 0;
                }
            }
            ++v;
        }
        return z ? 1 : 2;
    }
}

