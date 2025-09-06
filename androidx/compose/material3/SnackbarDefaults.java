package androidx.compose.material3;

import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001R\u0011\u0010\u0005\u001A\u00020\u00028G¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004R\u0017\u0010\t\u001A\u00020\u00068Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u0017\u0010\u000B\u001A\u00020\u00068Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\n\u0010\bR\u0017\u0010\r\u001A\u00020\u00068Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\f\u0010\bR\u0017\u0010\u000F\u001A\u00020\u00068Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u000E\u0010\bR\u0017\u0010\u0011\u001A\u00020\u00068Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0010\u0010\b\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/SnackbarDefaults;", "", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "getColor", "(Landroidx/compose/runtime/Composer;I)J", "color", "getContentColor", "contentColor", "getActionColor", "actionColor", "getActionContentColor", "actionContentColor", "getDismissActionContentColor", "dismissActionContentColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SnackbarDefaults {
    public static final int $stable;
    @NotNull
    public static final SnackbarDefaults INSTANCE;

    static {
        SnackbarDefaults.INSTANCE = new SnackbarDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Composable
    @JvmName(name = "getActionColor")
    public final long getActionColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2C4FC5B9, v, -1, "androidx.compose.material3.SnackbarDefaults.<get-actionColor> (Snackbar.kt:430)");
        }
        long v1 = ColorSchemeKt.getValue(SnackbarTokens.INSTANCE.getActionLabelTextColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @Composable
    @JvmName(name = "getActionContentColor")
    public final long getActionContentColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB1BB0CA7, v, -1, "androidx.compose.material3.SnackbarDefaults.<get-actionContentColor> (Snackbar.kt:434)");
        }
        long v1 = ColorSchemeKt.getValue(SnackbarTokens.INSTANCE.getActionLabelTextColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @Composable
    @JvmName(name = "getColor")
    public final long getColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3AE2BDCD, v, -1, "androidx.compose.material3.SnackbarDefaults.<get-color> (Snackbar.kt:422)");
        }
        long v1 = ColorSchemeKt.getValue(SnackbarTokens.INSTANCE.getContainerColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @Composable
    @JvmName(name = "getContentColor")
    public final long getContentColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3CDFF767, v, -1, "androidx.compose.material3.SnackbarDefaults.<get-contentColor> (Snackbar.kt:426)");
        }
        long v1 = ColorSchemeKt.getValue(SnackbarTokens.INSTANCE.getSupportingTextColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @Composable
    @JvmName(name = "getDismissActionContentColor")
    public final long getDismissActionContentColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE07E293F, v, -1, "androidx.compose.material3.SnackbarDefaults.<get-dismissActionContentColor> (Snackbar.kt:438)");
        }
        long v1 = ColorSchemeKt.getValue(SnackbarTokens.INSTANCE.getIconColor(), composer0, 6);
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
            ComposerKt.traceEventStart(0xDF1ECED3, v, -1, "androidx.compose.material3.SnackbarDefaults.<get-shape> (Snackbar.kt:418)");
        }
        Shape shape0 = ShapesKt.getValue(SnackbarTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }
}

