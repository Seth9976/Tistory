package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0005\u001A\u00020\u00028Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0007\u001A\u00020\u00028Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0004\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/material/SnackbarDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "getBackgroundColor", "(Landroidx/compose/runtime/Composer;I)J", "backgroundColor", "getPrimaryActionColor", "primaryActionColor", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SnackbarDefaults {
    public static final int $stable;
    @NotNull
    public static final SnackbarDefaults INSTANCE;

    static {
        SnackbarDefaults.INSTANCE = new SnackbarDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Composable
    @JvmName(name = "getBackgroundColor")
    public final long getBackgroundColor(@Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(1630911716);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1630911716, v, -1, "androidx.compose.material.SnackbarDefaults.<get-backgroundColor> (Snackbar.kt:202)");
        }
        long v1 = ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer0, 6).getSurface-0d7_KjU());
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return v1;
    }

    @Composable
    @JvmName(name = "getPrimaryActionColor")
    public final long getPrimaryActionColor(@Nullable Composer composer0, int v) {
        long v2;
        composer0.startReplaceableGroup(-810329402);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-810329402, v, -1, "androidx.compose.material.SnackbarDefaults.<get-primaryActionColor> (Snackbar.kt:222)");
        }
        Colors colors0 = MaterialTheme.INSTANCE.getColors(composer0, 6);
        if(colors0.isLight()) {
            long v1 = colors0.getPrimary-0d7_KjU();
            v2 = ColorKt.compositeOver--OWjLjI(Color.copy-wmQWz5c$default(colors0.getSurface-0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), v1);
        }
        else {
            v2 = colors0.getPrimaryVariant-0d7_KjU();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return v2;
    }
}

