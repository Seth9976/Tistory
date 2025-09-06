package androidx.compose.material3;

import androidx.compose.material3.tokens.ExtendedFabPrimaryTokens;
import androidx.compose.material3.tokens.FabPrimaryLargeTokens;
import androidx.compose.material3.tokens.FabPrimarySmallTokens;
import androidx.compose.material3.tokens.FabPrimaryTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001J:\u0010\n\u001A\u00020\u00072\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ:\u0010\f\u001A\u00020\u00072\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\tJ8\u0010\u000F\u001A\u00020\u00072\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000ER\u001D\u0010\u0014\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0018\u001A\u00020\u00158G¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001A\u001A\u00020\u00158G¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001C\u001A\u00020\u00158G¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u0017R\u0011\u0010\u001E\u001A\u00020\u00158G¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u0017R\u0017\u0010\"\u001A\u00020\u001F8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b \u0010!\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/material3/FloatingActionButtonDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "Landroidx/compose/material3/FloatingActionButtonElevation;", "elevation-xZ9-QkE", "(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/FloatingActionButtonElevation;", "elevation", "loweredElevation-xZ9-QkE", "loweredElevation", "bottomAppBarFabElevation-a9UjIt4", "(FFFF)Landroidx/compose/material3/FloatingActionButtonElevation;", "bottomAppBarFabElevation", "a", "F", "getLargeIconSize-D9Ej5fM", "()F", "LargeIconSize", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "getSmallShape", "smallShape", "getLargeShape", "largeShape", "getExtendedFabShape", "extendedFabShape", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "containerColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,702:1\n148#2:703\n148#2:704\n148#2:705\n148#2:706\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonDefaults\n*L\n489#1:703\n490#1:704\n491#1:705\n492#1:706\n*E\n"})
public final class FloatingActionButtonDefaults {
    public static final int $stable;
    @NotNull
    public static final FloatingActionButtonDefaults INSTANCE;
    public static final float a;

    static {
        FloatingActionButtonDefaults.INSTANCE = new FloatingActionButtonDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        FloatingActionButtonDefaults.a = FabPrimaryLargeTokens.INSTANCE.getIconSize-D9Ej5fM();
    }

    @NotNull
    public final FloatingActionButtonElevation bottomAppBarFabElevation-a9UjIt4(float f, float f1, float f2, float f3) {
        return new FloatingActionButtonElevation(f, f1, f2, f3, null);
    }

    public static FloatingActionButtonElevation bottomAppBarFabElevation-a9UjIt4$default(FloatingActionButtonDefaults floatingActionButtonDefaults0, float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.0f;
        }
        if((v & 8) != 0) {
            f3 = 0.0f;
        }
        return floatingActionButtonDefaults0.bottomAppBarFabElevation-a9UjIt4(f, f1, f2, f3);
    }

    @Composable
    @NotNull
    public final FloatingActionButtonElevation elevation-xZ9-QkE(float f, float f1, float f2, float f3, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            f = 0.0f;
        }
        if((v1 & 2) != 0) {
            f1 = 0.0f;
        }
        if((v1 & 4) != 0) {
            f2 = 0.0f;
        }
        if((v1 & 8) != 0) {
            f3 = 0.0f;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF1A102B7, v, -1, "androidx.compose.material3.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:446)");
        }
        FloatingActionButtonElevation floatingActionButtonElevation0 = new FloatingActionButtonElevation(f, f1, f2, f3, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return floatingActionButtonElevation0;
    }

    @Composable
    @JvmName(name = "getContainerColor")
    public final long getContainerColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x6E9B11C7, v, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-containerColor> (FloatingActionButton.kt:426)");
        }
        long v1 = ColorSchemeKt.getValue(FabPrimaryTokens.INSTANCE.getContainerColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @Composable
    @JvmName(name = "getExtendedFabShape")
    @NotNull
    public final Shape getExtendedFabShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE00CF465, v, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-extendedFabShape> (FloatingActionButton.kt:422)");
        }
        Shape shape0 = ShapesKt.getValue(ExtendedFabPrimaryTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    public final float getLargeIconSize-D9Ej5fM() {
        return FloatingActionButtonDefaults.a;
    }

    @Composable
    @JvmName(name = "getLargeShape")
    @NotNull
    public final Shape getLargeShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x92923405, v, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-largeShape> (FloatingActionButton.kt:418)");
        }
        Shape shape0 = ShapesKt.getValue(FabPrimaryLargeTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFCD381B3, v, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-shape> (FloatingActionButton.kt:410)");
        }
        Shape shape0 = ShapesKt.getValue(FabPrimaryTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    @Composable
    @JvmName(name = "getSmallShape")
    @NotNull
    public final Shape getSmallShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x178A3485, v, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-smallShape> (FloatingActionButton.kt:414)");
        }
        Shape shape0 = ShapesKt.getValue(FabPrimarySmallTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    @Composable
    @NotNull
    public final FloatingActionButtonElevation loweredElevation-xZ9-QkE(float f, float f1, float f2, float f3, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            f = 0.0f;
        }
        if((v1 & 2) != 0) {
            f1 = 0.0f;
        }
        if((v1 & 4) != 0) {
            f2 = 0.0f;
        }
        if((v1 & 8) != 0) {
            f3 = 0.0f;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xEF02405B, v, -1, "androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation (FloatingActionButton.kt:470)");
        }
        FloatingActionButtonElevation floatingActionButtonElevation0 = new FloatingActionButtonElevation(f, f1, f2, f3, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return floatingActionButtonElevation0;
    }
}

