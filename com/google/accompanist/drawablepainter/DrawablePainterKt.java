package com.google.accompanist.drawablepainter;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l6.a;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0019\u0010\u0003\u001A\u00020\u00022\b\u0010\u0001\u001A\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/graphics/drawable/Drawable;", "drawable", "Landroidx/compose/ui/graphics/painter/Painter;", "rememberDrawablePainter", "(Landroid/graphics/drawable/Drawable;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "drawablepainter_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDrawablePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawablePainter.kt\ncom/google/accompanist/drawablepainter/DrawablePainterKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,175:1\n36#2:176\n1097#3,6:177\n*S KotlinDebug\n*F\n+ 1 DrawablePainter.kt\ncom/google/accompanist/drawablepainter/DrawablePainterKt\n*L\n152#1:176\n152#1:177,6\n*E\n"})
public final class DrawablePainterKt {
    public static final Lazy a;

    static {
        DrawablePainterKt.a = c.lazy(LazyThreadSafetyMode.NONE, a.w);
    }

    // 去混淆评级： 低(20)
    public static final long access$getIntrinsicSize(Drawable drawable0) {
        return drawable0.getIntrinsicWidth() < 0 || drawable0.getIntrinsicHeight() < 0 ? 0x7FC000007FC00000L : SizeKt.Size(drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight());
    }

    public static final Handler access$getMAIN_HANDLER() {
        return (Handler)DrawablePainterKt.a.getValue();
    }

    @Composable
    @NotNull
    public static final Painter rememberDrawablePainter(@Nullable Drawable drawable0, @Nullable Composer composer0, int v) {
        ColorPainter colorPainter0;
        composer0.startReplaceableGroup(0x68B6FB29);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x68B6FB29, v, -1, "com.google.accompanist.drawablepainter.rememberDrawablePainter (DrawablePainter.kt:151)");
        }
        composer0.startReplaceableGroup(0x44FAF204);
        boolean z = composer0.changed(drawable0);
        Object object0 = composer0.rememberedValue();
        if(z || object0 == Composer.Companion.getEmpty()) {
            if(drawable0 == null) {
                object0 = EmptyPainter.INSTANCE;
            }
            else {
                if(drawable0 instanceof ColorDrawable) {
                    colorPainter0 = new ColorPainter(ColorKt.Color(((ColorDrawable)drawable0).getColor()), null);
                }
                else {
                    Drawable drawable1 = drawable0.mutate();
                    Intrinsics.checkNotNullExpressionValue(drawable1, "mutate(...)");
                    colorPainter0 = new DrawablePainter(drawable1);
                }
                object0 = colorPainter0;
            }
            composer0.updateRememberedValue(object0);
        }
        composer0.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return (Painter)object0;
    }
}

