package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;

public final class t0 extends CrossAxisAlignment {
    public static final t0 d;

    static {
        t0.d = new t0(null);  // 初始化器: Landroidx/compose/foundation/layout/CrossAxisAlignment;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    }

    @Override  // androidx.compose.foundation.layout.CrossAxisAlignment
    public final int align$foundation_layout_release(int v, LayoutDirection layoutDirection0, Placeable placeable0, int v1) {
        return v / 2;
    }
}

