package androidx.compose.material3;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material3.tokens.ProgressIndicatorTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0014\b\u00C7\u0002\u0018\u00002\u00020\u0001J0\u0010\r\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000B\u0010\fR\u001D\u0010\u0012\u001A\u00020\u00048\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R\u001D\u0010\u0017\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u001D\u0010\u001A\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u0018\u0010\u0014\u001A\u0004\b\u0019\u0010\u0016R\u001D\u0010\u001D\u001A\u00020\b8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b\u001B\u0010\u0014\u001A\u0004\b\u001C\u0010\u0016R&\u0010\"\u001A\u00020\u00048GX\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b\u001E\u0010\u000F\u0012\u0004\b \u0010!\u001A\u0004\b\u001F\u0010\u0011R&\u0010&\u001A\u00020\u00048GX\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b#\u0010\u000F\u0012\u0004\b%\u0010!\u001A\u0004\b$\u0010\u0011R&\u0010*\u001A\u00020\u00048GX\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b\'\u0010\u000F\u0012\u0004\b)\u0010!\u001A\u0004\b(\u0010\u0011R\u001D\u00101\u001A\b\u0012\u0004\u0012\u00020,0+8\u0006\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u00100R \u00105\u001A\u00020\u00068GX\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\b4\u0010!\u001A\u0004\b2\u00103R\u0017\u00107\u001A\u00020\u00068G\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b6\u00103R\u0017\u00109\u001A\u00020\u00068G\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b8\u00103R\u0017\u0010;\u001A\u00020\u00068G\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b:\u00103R\u0017\u0010=\u001A\u00020\u00068G\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b<\u00103R\u0017\u0010?\u001A\u00020\u00068G\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b>\u00103\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006@"}, d2 = {"Landroidx/compose/material3/ProgressIndicatorDefaults;", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawScope", "Landroidx/compose/ui/unit/Dp;", "stopSize", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeCap", "", "drawStopIndicator-EgI2THU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJI)V", "drawStopIndicator", "a", "F", "getCircularStrokeWidth-D9Ej5fM", "()F", "CircularStrokeWidth", "b", "I", "getLinearStrokeCap-KaPHkGw", "()I", "LinearStrokeCap", "c", "getCircularDeterminateStrokeCap-KaPHkGw", "CircularDeterminateStrokeCap", "d", "getCircularIndeterminateStrokeCap-KaPHkGw", "CircularIndeterminateStrokeCap", "e", "getLinearTrackStopIndicatorSize-D9Ej5fM", "getLinearTrackStopIndicatorSize-D9Ej5fM$annotations", "()V", "LinearTrackStopIndicatorSize", "f", "getLinearIndicatorTrackGapSize-D9Ej5fM", "getLinearIndicatorTrackGapSize-D9Ej5fM$annotations", "LinearIndicatorTrackGapSize", "g", "getCircularIndicatorTrackGapSize-D9Ej5fM", "getCircularIndicatorTrackGapSize-D9Ej5fM$annotations", "CircularIndicatorTrackGapSize", "Landroidx/compose/animation/core/SpringSpec;", "", "h", "Landroidx/compose/animation/core/SpringSpec;", "getProgressAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "ProgressAnimationSpec", "getCircularTrackColor", "(Landroidx/compose/runtime/Composer;I)J", "getCircularTrackColor$annotations", "circularTrackColor", "getLinearColor", "linearColor", "getCircularColor", "circularColor", "getLinearTrackColor", "linearTrackColor", "getCircularDeterminateTrackColor", "circularDeterminateTrackColor", "getCircularIndeterminateTrackColor", "circularIndeterminateTrackColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ProgressIndicatorDefaults {
    public static final int $stable;
    @NotNull
    public static final ProgressIndicatorDefaults INSTANCE;
    public static final float a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final SpringSpec h;

    static {
        ProgressIndicatorDefaults.INSTANCE = new ProgressIndicatorDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        ProgressIndicatorDefaults.a = 0.0f;
        ProgressIndicatorDefaults.b = 1;
        ProgressIndicatorDefaults.c = 1;
        ProgressIndicatorDefaults.d = 1;
        ProgressIndicatorDefaults.e = 0.0f;
        ProgressIndicatorDefaults.f = 0.0f;
        ProgressIndicatorDefaults.g = 0.0f;
        ProgressIndicatorDefaults.h = new SpringSpec(1.0f, 50.0f, 0.001f);
    }

    public final void drawStopIndicator-EgI2THU(@NotNull DrawScope drawScope0, float f, long v, int v1) {
        float f1 = Math.min(drawScope0.toPx-0680j_4(f), Size.getHeight-impl(drawScope0.getSize-NH-jbRc()));
        float f2 = (Size.getHeight-impl(drawScope0.getSize-NH-jbRc()) - f1) / 2.0f;
        if(StrokeCap.equals-impl0(v1, 1)) {
            DrawScope.drawCircle-VaOC9Bg$default(drawScope0, v, f1 / 2.0f, OffsetKt.Offset(Size.getWidth-impl(drawScope0.getSize-NH-jbRc()) - f1 / 2.0f - f2, Size.getHeight-impl(drawScope0.getSize-NH-jbRc()) / 2.0f), 0.0f, null, null, 0, 120, null);
            return;
        }
        DrawScope.drawRect-n-J9OG0$default(drawScope0, v, OffsetKt.Offset(Size.getWidth-impl(drawScope0.getSize-NH-jbRc()) - f1 - f2, (Size.getHeight-impl(drawScope0.getSize-NH-jbRc()) - f1) / 2.0f), SizeKt.Size(f1, f1), 0.0f, null, null, 0, 120, null);
    }

    @Composable
    @JvmName(name = "getCircularColor")
    public final long getCircularColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1803349725, v, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularColor> (ProgressIndicator.kt:847)");
        }
        long v1 = ColorSchemeKt.getValue(ProgressIndicatorTokens.INSTANCE.getActiveIndicatorColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    public final int getCircularDeterminateStrokeCap-KaPHkGw() [...] // 潜在的解密器

    @Composable
    @JvmName(name = "getCircularDeterminateTrackColor")
    public final long getCircularDeterminateTrackColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x803889B3, v, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularDeterminateTrackColor> (ProgressIndicator.kt:864)");
        }
        long v1 = ColorSchemeKt.getValue(ProgressIndicatorTokens.INSTANCE.getTrackColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    public final int getCircularIndeterminateStrokeCap-KaPHkGw() [...] // 潜在的解密器

    @Composable
    @JvmName(name = "getCircularIndeterminateTrackColor")
    public final long getCircularIndeterminateTrackColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1947901123, v, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularIndeterminateTrackColor> (ProgressIndicator.kt:868)");
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return 0L;
    }

    @ExperimentalMaterial3Api
    public final float getCircularIndicatorTrackGapSize-D9Ej5fM() [...] // 潜在的解密器

    @ExperimentalMaterial3Api
    public static void getCircularIndicatorTrackGapSize-D9Ej5fM$annotations() {
    }

    public final float getCircularStrokeWidth-D9Ej5fM() [...] // 潜在的解密器

    @Composable
    @JvmName(name = "getCircularTrackColor")
    public final long getCircularTrackColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE7E80ED9, v, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularTrackColor> (ProgressIndicator.kt:860)");
        }
        long v1 = Color.Companion.getTransparent-0d7_KjU();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to circularDeterminateTrackColor or circularIndeterminateTrackColor", replaceWith = @ReplaceWith(expression = "ProgressIndicatorDefaults.circularIndeterminateTrackColor", imports = {}))
    public static void getCircularTrackColor$annotations() {
    }

    @Composable
    @JvmName(name = "getLinearColor")
    public final long getLinearColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xC980B0E9, v, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearColor> (ProgressIndicator.kt:843)");
        }
        long v1 = ColorSchemeKt.getValue(ProgressIndicatorTokens.INSTANCE.getActiveIndicatorColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @ExperimentalMaterial3Api
    public final float getLinearIndicatorTrackGapSize-D9Ej5fM() [...] // 潜在的解密器

    @ExperimentalMaterial3Api
    public static void getLinearIndicatorTrackGapSize-D9Ej5fM$annotations() {
    }

    public final int getLinearStrokeCap-KaPHkGw() [...] // 潜在的解密器

    @Composable
    @JvmName(name = "getLinearTrackColor")
    public final long getLinearTrackColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x63FD40D9, v, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearTrackColor> (ProgressIndicator.kt:851)");
        }
        long v1 = ColorSchemeKt.getValue(ProgressIndicatorTokens.INSTANCE.getTrackColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    @ExperimentalMaterial3Api
    public final float getLinearTrackStopIndicatorSize-D9Ej5fM() {
        return ProgressIndicatorDefaults.e;
    }

    @ExperimentalMaterial3Api
    public static void getLinearTrackStopIndicatorSize-D9Ej5fM$annotations() {
    }

    @NotNull
    public final SpringSpec getProgressAnimationSpec() {
        return ProgressIndicatorDefaults.h;
    }
}

