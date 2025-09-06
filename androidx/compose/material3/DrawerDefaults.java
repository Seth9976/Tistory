package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.material3.tokens.ScrimTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\n\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006R\u001D\u0010\r\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006R\u001D\u0010\u0010\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000E\u0010\u0004\u001A\u0004\b\u000F\u0010\u0006R \u0010\u0016\u001A\u00020\u00118GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0012\u0010\u0013R\u0011\u0010\u001A\u001A\u00020\u00178G¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001C\u001A\u00020\u00118Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u0013R\u0017\u0010\u001E\u001A\u00020\u00118Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u0013R\u0017\u0010 \u001A\u00020\u00118Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u001F\u0010\u0013R\u0011\u0010$\u001A\u00020!8G¢\u0006\u0006\u001A\u0004\b\"\u0010#\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/material3/DrawerDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getModalDrawerElevation-D9Ej5fM", "()F", "ModalDrawerElevation", "b", "getPermanentDrawerElevation-D9Ej5fM", "PermanentDrawerElevation", "c", "getDismissibleDrawerElevation-D9Ej5fM", "DismissibleDrawerElevation", "d", "getMaximumDrawerWidth-D9Ej5fM", "MaximumDrawerWidth", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "getContainerColor$annotations", "()V", "containerColor", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "getScrimColor", "scrimColor", "getStandardContainerColor", "standardContainerColor", "getModalContainerColor", "modalContainerColor", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DrawerDefaults {
    public static final int $stable;
    @NotNull
    public static final DrawerDefaults INSTANCE;
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        DrawerDefaults.INSTANCE = new DrawerDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        DrawerDefaults.a = 0.0f;
        DrawerDefaults.b = 0.0f;
        DrawerDefaults.c = 0.0f;
        DrawerDefaults.d = 0.0f;
    }

    @Composable
    @JvmName(name = "getContainerColor")
    public final long getContainerColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x94DF1D73, v, -1, "androidx.compose.material3.DrawerDefaults.<get-containerColor> (NavigationDrawer.kt:872)");
        }
        long v1 = ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getStandardContainerColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Please use standardContainerColor or modalContainerColor instead.", replaceWith = @ReplaceWith(expression = "standardContainerColor", imports = {}))
    public static void getContainerColor$annotations() {
    }

    public final float getDismissibleDrawerElevation-D9Ej5fM() [...] // 潜在的解密器

    public final float getMaximumDrawerWidth-D9Ej5fM() [...] // 潜在的解密器

    @Composable
    @JvmName(name = "getModalContainerColor")
    public final long getModalContainerColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2A1B2E01, v, -1, "androidx.compose.material3.DrawerDefaults.<get-modalContainerColor> (NavigationDrawer.kt:882)");
        }
        long v1 = ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getModalContainerColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    public final float getModalDrawerElevation-D9Ej5fM() [...] // 潜在的解密器

    public final float getPermanentDrawerElevation-D9Ej5fM() [...] // 潜在的解密器

    @Composable
    @JvmName(name = "getScrimColor")
    public final long getScrimColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1055074989, v, -1, "androidx.compose.material3.DrawerDefaults.<get-scrimColor> (NavigationDrawer.kt:863)");
        }
        long v1 = Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(ScrimTokens.INSTANCE.getContainerColor(), composer0, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3755F05F, v, -1, "androidx.compose.material3.DrawerDefaults.<get-shape> (NavigationDrawer.kt:859)");
        }
        Shape shape0 = ShapesKt.getValue(NavigationDrawerTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    @Composable
    @JvmName(name = "getStandardContainerColor")
    public final long getStandardContainerColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF87E2A13, v, -1, "androidx.compose.material3.DrawerDefaults.<get-standardContainerColor> (NavigationDrawer.kt:878)");
        }
        long v1 = ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getStandardContainerColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @Composable
    @JvmName(name = "getWindowInsets")
    @NotNull
    public final WindowInsets getWindowInsets(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-909973510, v, -1, "androidx.compose.material3.DrawerDefaults.<get-windowInsets> (NavigationDrawer.kt:891)");
        }
        WindowInsets windowInsets0 = WindowInsetsKt.only-bOOhFvg(SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer0, 6), 57);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }
}

