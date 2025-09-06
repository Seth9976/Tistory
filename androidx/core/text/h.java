package androidx.core.text;

public final class h implements TextDirectionAlgorithm {
    public static final h a;

    static {
        h.a = new h();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.core.text.TextDirectionHeuristicsCompat$TextDirectionAlgorithm
    public final int checkRtl(CharSequence charSequence0, int v, int v1) {
        int v2 = v1 + v;
        int v3 = 2;
        while(v < v2 && v3 == 2) {
            switch(Character.getDirectionality(charSequence0.charAt(v))) {
                case 0: 
                case 14: 
                case 15: {
                    v3 = 1;
                    break;
                }
                case 1: 
                case 2: 
                case 16: 
                case 17: {
                    v3 = 0;
                    break;
                }
                default: {
                    v3 = 2;
                }
            }
            ++v;
        }
        return v3;
    }
}

