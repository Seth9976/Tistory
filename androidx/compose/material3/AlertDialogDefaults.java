package androidx.compose.material3;

import androidx.compose.material3.tokens.DialogTokens;
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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000B\u001A\u00020\b8G¢\u0006\u0006\u001A\u0004\b\t\u0010\nR\u0017\u0010\u000F\u001A\u00020\f8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\r\u0010\u000ER\u0017\u0010\u0011\u001A\u00020\f8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u000ER\u0017\u0010\u0013\u001A\u00020\f8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u000ER\u0017\u0010\u0015\u001A\u00020\f8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u000E\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/AlertDialogDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getTonalElevation-D9Ej5fM", "()F", "TonalElevation", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "containerColor", "getIconContentColor", "iconContentColor", "getTitleContentColor", "titleContentColor", "getTextContentColor", "textContentColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,464:1\n148#2:465\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogDefaults\n*L\n227#1:465\n*E\n"})
public final class AlertDialogDefaults {
    public static final int $stable;
    @NotNull
    public static final AlertDialogDefaults INSTANCE;
    public static final float a;

    static {
        AlertDialogDefaults.INSTANCE = new AlertDialogDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        AlertDialogDefaults.a = 0.0f;
    }

    @Composable
    @JvmName(name = "getContainerColor")
    public final long getContainerColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(616766901, v, -1, "androidx.compose.material3.AlertDialogDefaults.<get-containerColor> (AlertDialog.kt:211)");
        }
        long v1 = ColorSchemeKt.getValue(DialogTokens.INSTANCE.getContainerColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @Composable
    @JvmName(name = "getIconContentColor")
    public final long getIconContentColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x6225F015, v, -1, "androidx.compose.material3.AlertDialogDefaults.<get-iconContentColor> (AlertDialog.kt:215)");
        }
        long v1 = ColorSchemeKt.getValue(DialogTokens.INSTANCE.getIconColor(), composer0, 6);
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
            ComposerKt.traceEventStart(0xC739F0A1, v, -1, "androidx.compose.material3.AlertDialogDefaults.<get-shape> (AlertDialog.kt:207)");
        }
        Shape shape0 = ShapesKt.getValue(DialogTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    @Composable
    @JvmName(name = "getTextContentColor")
    public final long getTextContentColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x671B5995, v, -1, "androidx.compose.material3.AlertDialogDefaults.<get-textContentColor> (AlertDialog.kt:223)");
        }
        long v1 = ColorSchemeKt.getValue(DialogTokens.INSTANCE.getSupportingTextColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @Composable
    @JvmName(name = "getTitleContentColor")
    public final long getTitleContentColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(247083549, v, -1, "androidx.compose.material3.AlertDialogDefaults.<get-titleContentColor> (AlertDialog.kt:219)");
        }
        long v1 = ColorSchemeKt.getValue(DialogTokens.INSTANCE.getHeadlineColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    public final float getTonalElevation-D9Ej5fM() [...] // 潜在的解密器
}

