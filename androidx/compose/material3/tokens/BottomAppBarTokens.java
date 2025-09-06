package androidx.compose.material3.tokens;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\r\u001A\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u001D\u0010\u0010\u001A\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000E\u0010\n\u001A\u0004\b\u000F\u0010\fR\u0017\u0010\u0016\u001A\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/tokens/BottomAppBarTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getContainerElevation-D9Ej5fM", "()F", "ContainerElevation", "c", "getContainerHeight-D9Ej5fM", "ContainerHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "d", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBottomAppBarTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomAppBarTokens.kt\nandroidx/compose/material3/tokens/BottomAppBarTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,29:1\n158#2:30\n*S KotlinDebug\n*F\n+ 1 BottomAppBarTokens.kt\nandroidx/compose/material3/tokens/BottomAppBarTokens\n*L\n26#1:30\n*E\n"})
public final class BottomAppBarTokens {
    public static final int $stable;
    @NotNull
    public static final BottomAppBarTokens INSTANCE;
    public static final ColorSchemeKeyTokens a;
    public static final float b;
    public static final float c;
    public static final ShapeKeyTokens d;

    static {
        BottomAppBarTokens.INSTANCE = new BottomAppBarTokens();  // 初始化器: Ljava/lang/Object;-><init>()V
        BottomAppBarTokens.a = ColorSchemeKeyTokens.SurfaceContainer;
        BottomAppBarTokens.b = 0.0f;
        BottomAppBarTokens.c = 80.0f;
        BottomAppBarTokens.d = ShapeKeyTokens.CornerNone;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return BottomAppBarTokens.a;
    }

    public final float getContainerElevation-D9Ej5fM() {
        return BottomAppBarTokens.b;
    }

    public final float getContainerHeight-D9Ej5fM() [...] // 潜在的解密器

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return BottomAppBarTokens.d;
    }
}

