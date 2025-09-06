package androidx.compose.material;

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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001R\u0011\u0010\u0005\u001A\u00020\u00028G¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004R\u0011\u0010\t\u001A\u00020\u00068G¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\r\u001A\u00020\n8G¢\u0006\u0006\u001A\u0004\b\u000B\u0010\f¨\u0006\u000E"}, d2 = {"Landroidx/compose/material/MaterialTheme;", "", "Landroidx/compose/material/Colors;", "getColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;", "colors", "Landroidx/compose/material/Typography;", "getTypography", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Typography;", "typography", "Landroidx/compose/material/Shapes;", "getShapes", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Shapes;", "shapes", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialTheme\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,139:1\n74#2:140\n74#2:141\n74#2:142\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialTheme\n*L\n103#1:140\n113#1:141\n121#1:142\n*E\n"})
public final class MaterialTheme {
    public static final int $stable;
    @NotNull
    public static final MaterialTheme INSTANCE;

    static {
        MaterialTheme.INSTANCE = new MaterialTheme();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getColors")
    @NotNull
    public final Colors getColors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA8D755D9, v, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:102)");
        }
        Colors colors0 = (Colors)composer0.consume(ColorsKt.getLocalColors());
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return colors0;
    }

    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getShapes")
    @NotNull
    public final Shapes getShapes(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA173B11B, v, -1, "androidx.compose.material.MaterialTheme.<get-shapes> (MaterialTheme.kt:120)");
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
            ComposerKt.traceEventStart(-1630198856, v, -1, "androidx.compose.material.MaterialTheme.<get-typography> (MaterialTheme.kt:112)");
        }
        Typography typography0 = (Typography)composer0.consume(TypographyKt.getLocalTypography());
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return typography0;
    }
}

