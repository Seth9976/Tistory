package n1;

import androidx.compose.ui.draw.BuildDrawCacheParams;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;

public final class e implements BuildDrawCacheParams {
    public static final e a;
    public static final long b;
    public static final LayoutDirection c;
    public static final Density d;

    static {
        e.a = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
        e.b = 0x7FC000007FC00000L;
        e.c = LayoutDirection.Ltr;
        e.d = DensityKt.Density(1.0f, 1.0f);
    }

    @Override  // androidx.compose.ui.draw.BuildDrawCacheParams
    public final Density getDensity() {
        return e.d;
    }

    @Override  // androidx.compose.ui.draw.BuildDrawCacheParams
    public final LayoutDirection getLayoutDirection() {
        return e.c;
    }

    @Override  // androidx.compose.ui.draw.BuildDrawCacheParams
    public final long getSize-NH-jbRc() {
        return e.b;
    }
}

