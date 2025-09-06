package androidx.compose.material3.tokens;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\bÀ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0017\u0010\u0010\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u0004\u001A\u0004\b\u000F\u0010\u0006R\u001D\u0010\u0016\u001A\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u001D\u0010\u0019\u001A\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001A\u0004\b\u0018\u0010\u0015R\u0017\u0010\u001C\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001A\u0010\n\u001A\u0004\b\u001B\u0010\fR\u001D\u0010\u001F\u001A\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001D\u0010\u0013\u001A\u0004\b\u001E\u0010\u0015R\u001D\u0010\"\u001A\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010\u0013\u001A\u0004\b!\u0010\u0015R\u0017\u0010%\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0004\u001A\u0004\b$\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/material3/tokens/SheetBottomTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getDockedContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "DockedContainerColor", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "b", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getDockedContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "DockedContainerShape", "c", "getDockedDragHandleColor", "DockedDragHandleColor", "Landroidx/compose/ui/unit/Dp;", "d", "F", "getDockedDragHandleHeight-D9Ej5fM", "()F", "DockedDragHandleHeight", "e", "getDockedDragHandleWidth-D9Ej5fM", "DockedDragHandleWidth", "f", "getDockedMinimizedContainerShape", "DockedMinimizedContainerShape", "g", "getDockedModalContainerElevation-D9Ej5fM", "DockedModalContainerElevation", "h", "getDockedStandardContainerElevation-D9Ej5fM", "DockedStandardContainerElevation", "i", "getFocusIndicatorColor", "FocusIndicatorColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSheetBottomTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetBottomTokens.kt\nandroidx/compose/material3/tokens/SheetBottomTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,34:1\n158#2:35\n158#2:36\n*S KotlinDebug\n*F\n+ 1 SheetBottomTokens.kt\nandroidx/compose/material3/tokens/SheetBottomTokens\n*L\n27#1:35\n28#1:36\n*E\n"})
public final class SheetBottomTokens {
    public static final int $stable;
    @NotNull
    public static final SheetBottomTokens INSTANCE;
    public static final ColorSchemeKeyTokens a;
    public static final ShapeKeyTokens b;
    public static final ColorSchemeKeyTokens c;
    public static final float d;
    public static final float e;
    public static final ShapeKeyTokens f;
    public static final float g;
    public static final float h;
    public static final ColorSchemeKeyTokens i;

    static {
        SheetBottomTokens.INSTANCE = new SheetBottomTokens();  // 初始化器: Ljava/lang/Object;-><init>()V
        SheetBottomTokens.a = ColorSchemeKeyTokens.SurfaceContainerLow;
        SheetBottomTokens.b = ShapeKeyTokens.CornerExtraLargeTop;
        SheetBottomTokens.c = ColorSchemeKeyTokens.OnSurfaceVariant;
        SheetBottomTokens.d = 4.0f;
        SheetBottomTokens.e = 32.0f;
        SheetBottomTokens.f = ShapeKeyTokens.CornerNone;
        SheetBottomTokens.g = 0.0f;
        SheetBottomTokens.h = 0.0f;
        SheetBottomTokens.i = ColorSchemeKeyTokens.Secondary;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDockedContainerColor() {
        return SheetBottomTokens.a;
    }

    @NotNull
    public final ShapeKeyTokens getDockedContainerShape() {
        return SheetBottomTokens.b;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDockedDragHandleColor() {
        return SheetBottomTokens.c;
    }

    public final float getDockedDragHandleHeight-D9Ej5fM() [...] // 潜在的解密器

    public final float getDockedDragHandleWidth-D9Ej5fM() [...] // 潜在的解密器

    @NotNull
    public final ShapeKeyTokens getDockedMinimizedContainerShape() {
        return SheetBottomTokens.f;
    }

    public final float getDockedModalContainerElevation-D9Ej5fM() {
        return SheetBottomTokens.g;
    }

    public final float getDockedStandardContainerElevation-D9Ej5fM() {
        return SheetBottomTokens.h;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusIndicatorColor() {
        return SheetBottomTokens.i;
    }
}

