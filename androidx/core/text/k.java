package androidx.core.text;

import java.util.Locale;

public final class k extends i {
    public static final k b;

    static {
        k.b = new k(null);  // 初始化器: Landroidx/core/text/i;-><init>(Landroidx/core/text/TextDirectionHeuristicsCompat$TextDirectionAlgorithm;)V
    }

    @Override  // androidx.core.text.i
    public final boolean a() {
        return TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }
}

