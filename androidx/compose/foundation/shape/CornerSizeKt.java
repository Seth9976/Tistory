package androidx.compose.foundation.shape;

import androidx.annotation.IntRange;
import androidx.compose.runtime.Stable;
import i0.a;
import i0.b;
import i0.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\n\u001A\u001A\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u0017\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\u0005\u0010\u0004\u001A\u0019\u0010\u0005\u001A\u00020\u00022\b\b\u0001\u0010\b\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\t\" \u0010\u0010\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000B\u0012\u0004\b\u000E\u0010\u000F\u001A\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "size", "Landroidx/compose/foundation/shape/CornerSize;", "CornerSize-0680j_4", "(F)Landroidx/compose/foundation/shape/CornerSize;", "CornerSize", "", "", "percent", "(I)Landroidx/compose/foundation/shape/CornerSize;", "a", "Landroidx/compose/foundation/shape/CornerSize;", "getZeroCornerSize", "()Landroidx/compose/foundation/shape/CornerSize;", "getZeroCornerSize$annotations", "()V", "ZeroCornerSize", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class CornerSizeKt {
    public static final CornerSizeKt.ZeroCornerSize.1 a;

    static {
        CornerSizeKt.a = new CornerSizeKt.ZeroCornerSize.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Stable
    @NotNull
    public static final CornerSize CornerSize(float f) {
        return new c(f);
    }

    @Stable
    @NotNull
    public static final CornerSize CornerSize(@IntRange(from = 0L, to = 100L) int v) {
        return new b(((float)v));
    }

    @Stable
    @NotNull
    public static final CornerSize CornerSize-0680j_4(float f) {
        return new a(f);
    }

    @NotNull
    public static final CornerSize getZeroCornerSize() {
        return CornerSizeKt.a;
    }

    @Stable
    public static void getZeroCornerSize$annotations() {
    }
}

