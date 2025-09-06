package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001R\u0011\u0010\u0005\u001A\u00020\u00028G¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004R\u0011\u0010\t\u001A\u00020\u00068G¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\r\u001A\u00020\n8G¢\u0006\u0006\u001A\u0004\b\u000B\u0010\f¨\u0006\u000E"}, d2 = {"Landroidx/compose/material3/MaterialTheme;", "", "Landroidx/compose/material3/ColorScheme;", "getColorScheme", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;", "colorScheme", "Landroidx/compose/material3/Typography;", "getTypography", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;", "typography", "Landroidx/compose/material3/Shapes;", "getShapes", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Shapes;", "shapes", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material3/MaterialTheme\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,172:1\n77#2:173\n77#2:174\n77#2:175\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material3/MaterialTheme\n*L\n84#1:173\n92#1:174\n100#1:175\n*E\n"})
public final class MaterialTheme {
    public static final int $stable;
    @NotNull
    public static final MaterialTheme INSTANCE;

    static {
        MaterialTheme.INSTANCE = new MaterialTheme();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getColorScheme")
    @NotNull
    public final ColorScheme getColorScheme(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDE8660E2, v, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:83)");
        }
        ColorScheme colorScheme0 = (ColorScheme)composer0.consume(ColorSchemeKt.getLocalColorScheme());
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return colorScheme0;
    }

    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getShapes")
    @NotNull
    public final Shapes getShapes(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(419509830, v, -1, "androidx.compose.material3.MaterialTheme.<get-shapes> (MaterialTheme.kt:99)");
        }
        Shapes shapes0 = (Shapes)composer0.consume(ShapesKt.getLocalShapes());
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shapes0;
    }

    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getTypography")
    @NotNull
    public final Typography getTypography(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xC7CE1749, v, -1, "androidx.compose.material3.MaterialTheme.<get-typography> (MaterialTheme.kt:91)");
        }
        Typography typography0 = (Typography)composer0.consume(TypographyKt.getLocalTypography());
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return typography0;
    }
}

