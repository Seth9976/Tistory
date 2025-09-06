package androidx.compose.material;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\n\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006R\u001D\u0010\r\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006R\u0011\u0010\u0011\u001A\u00020\u000E8G¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0015\u001A\u00020\u00128Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/material/BackdropScaffoldDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getPeekHeight-D9Ej5fM", "()F", "PeekHeight", "b", "getHeaderHeight-D9Ej5fM", "HeaderHeight", "c", "getFrontLayerElevation-D9Ej5fM", "FrontLayerElevation", "Landroidx/compose/ui/graphics/Shape;", "getFrontLayerShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "frontLayerShape", "Landroidx/compose/ui/graphics/Color;", "getFrontLayerScrimColor", "(Landroidx/compose/runtime/Composer;I)J", "frontLayerScrimColor", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,524:1\n154#2:525\n154#2:526\n154#2:527\n154#2:528\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldDefaults\n*L\n509#1:525\n496#1:526\n501#1:527\n514#1:528\n*E\n"})
public final class BackdropScaffoldDefaults {
    public static final int $stable;
    @NotNull
    public static final BackdropScaffoldDefaults INSTANCE;
    public static final float a;
    public static final float b;
    public static final float c;

    static {
        BackdropScaffoldDefaults.INSTANCE = new BackdropScaffoldDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        BackdropScaffoldDefaults.a = 56.0f;
        BackdropScaffoldDefaults.b = 48.0f;
        BackdropScaffoldDefaults.c = 1.0f;
    }

    public final float getFrontLayerElevation-D9Ej5fM() [...] // 潜在的解密器

    @Composable
    @JvmName(name = "getFrontLayerScrimColor")
    public final long getFrontLayerScrimColor(@Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(1806270648);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1806270648, v, -1, "androidx.compose.material.BackdropScaffoldDefaults.<get-frontLayerScrimColor> (BackdropScaffold.kt:519)");
        }
        long v1 = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getSurface-0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return v1;
    }

    @Composable
    @JvmName(name = "getFrontLayerShape")
    @NotNull
    public final Shape getFrontLayerShape(@Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(1580588700);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1580588700, v, -1, "androidx.compose.material.BackdropScaffoldDefaults.<get-frontLayerShape> (BackdropScaffold.kt:507)");
        }
        Shape shape0 = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composer0, 6).getLarge(), CornerSizeKt.CornerSize-0680j_4(16.0f), CornerSizeKt.CornerSize-0680j_4(16.0f), null, null, 12, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return shape0;
    }

    public final float getHeaderHeight-D9Ej5fM() [...] // 潜在的解密器

    public final float getPeekHeight-D9Ej5fM() [...] // 潜在的解密器
}

