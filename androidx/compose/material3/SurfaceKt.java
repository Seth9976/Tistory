package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001Am\u0010\u0012\u001A\u00020\r2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\u0011\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\r0\f\u00A2\u0006\u0002\b\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0010\u0010\u0011\u001A\u0091\u0001\u0010\u0012\u001A\u00020\r2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001A\u0004\u0018\u00010\u00162\u0011\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\r0\f\u00A2\u0006\u0002\b\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019\u001A\u0099\u0001\u0010\u0012\u001A\u00020\r2\u0006\u0010\u001A\u001A\u00020\u00142\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001A\u0004\u0018\u00010\u00162\u0011\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\r0\f\u00A2\u0006\u0002\b\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001C\u001A\u009F\u0001\u0010\u0012\u001A\u00020\r2\u0006\u0010\u001D\u001A\u00020\u00142\u0012\u0010\u001F\u001A\u000E\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u001E2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001A\u0004\u0018\u00010\u00162\u0011\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\r0\f\u00A2\u0006\u0002\b\u000EH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010 \"\u001D\u0010&\u001A\b\u0012\u0004\u0012\u00020\u00070!8\u0006\u00A2\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006\'"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "color", "contentColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "Landroidx/compose/foundation/BorderStroke;", "border", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "Surface-T9BRK9s", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Surface", "onClick", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Surface-o_FOJdg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "selected", "Surface-d85dljk", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "Lkotlin/Function1;", "onCheckedChange", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalAbsoluteTonalElevation", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalAbsoluteTonalElevation", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,475:1\n148#2:476\n148#2:477\n148#2:480\n148#2:481\n148#2:484\n148#2:485\n148#2:488\n148#2:489\n77#3:478\n77#3:482\n77#3:486\n77#3:490\n50#4:479\n50#4:483\n50#4:487\n50#4:491\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material3/SurfaceKt\n*L\n99#1:476\n100#1:477\n199#1:480\n200#1:481\n302#1:484\n303#1:485\n406#1:488\n407#1:489\n104#1:478\n205#1:482\n308#1:486\n412#1:490\n104#1:479\n205#1:483\n308#1:487\n412#1:491\n*E\n"})
public final class SurfaceKt {
    public static final ProvidableCompositionLocal a;

    static {
        SurfaceKt.a = CompositionLocalKt.compositionLocalOf$default(null, m4.O, 1, null);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Surface-T9BRK9s(@Nullable Modifier modifier0, @Nullable Shape shape0, long v, long v1, float f, float f1, @Nullable BorderStroke borderStroke0, @NotNull Function2 function20, @Nullable Composer composer0, int v2, int v3) {
        Modifier modifier1 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
        Shape shape1 = (v3 & 2) == 0 ? shape0 : RectangleShapeKt.getRectangleShape();
        long v4 = (v3 & 4) == 0 ? v : MaterialTheme.INSTANCE.getColorScheme(composer0, 6).getSurface-0d7_KjU();
        long v5 = (v3 & 8) == 0 ? v1 : ColorSchemeKt.contentColorFor-ek8zF_U(v4, composer0, v2 >> 6 & 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE15EC973, v2, -1, "androidx.compose.material3.Surface (Surface.kt:102)");
        }
        float f2 = Dp.constructor-impl(((Dp)composer0.consume(SurfaceKt.a)).unbox-impl() + ((v3 & 16) == 0 ? f : 0.0f));
        ProvidedValue providedValue0 = ContentColorKt.getLocalContentColor().provides(Color.box-impl(v5));
        Dp dp0 = Dp.box-impl(f2);
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{providedValue0, SurfaceKt.a.provides(dp0)}, ComposableLambdaKt.rememberComposableLambda(-70914509, true, new mm(modifier1, shape1, v4, f2, ((v3 & 0x40) == 0 ? borderStroke0 : null), ((v3 & 0x20) == 0 ? f1 : 0.0f), function20, 0), composer0, 54), composer0, ProvidedValue.$stable | 0x30);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Surface-d85dljk(boolean z, @NotNull Function0 function00, @Nullable Modifier modifier0, boolean z1, @Nullable Shape shape0, long v, long v1, float f, float f1, @Nullable BorderStroke borderStroke0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function2 function20, @Nullable Composer composer0, int v2, int v3, int v4) {
        Modifier modifier1 = (v4 & 4) == 0 ? modifier0 : Modifier.Companion;
        Shape shape1 = (v4 & 16) == 0 ? shape0 : RectangleShapeKt.getRectangleShape();
        long v5 = (v4 & 0x20) == 0 ? v : MaterialTheme.INSTANCE.getColorScheme(composer0, 6).getSurface-0d7_KjU();
        long v6 = (v4 & 0x40) == 0 ? v1 : ColorSchemeKt.contentColorFor-ek8zF_U(v5, composer0, v2 >> 15 & 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x20344540, v2, v3, "androidx.compose.material3.Surface (Surface.kt:306)");
        }
        float f2 = Dp.constructor-impl(((Dp)composer0.consume(SurfaceKt.a)).unbox-impl() + ((v4 & 0x80) == 0 ? f : 0.0f));
        ProvidedValue providedValue0 = ContentColorKt.getLocalContentColor().provides(Color.box-impl(v6));
        Dp dp0 = Dp.box-impl(f2);
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{providedValue0, SurfaceKt.a.provides(dp0)}, ComposableLambdaKt.rememberComposableLambda(0xBA966880, true, new om(modifier1, shape1, v5, f2, ((v4 & 0x200) == 0 ? borderStroke0 : null), z, ((v4 & 0x400) == 0 ? mutableInteractionSource0 : null), ((v4 & 8) == 0 ? z1 : true), function00, ((v4 & 0x100) == 0 ? f1 : 0.0f), function20), composer0, 54), composer0, ProvidedValue.$stable | 0x30);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Surface-d85dljk(boolean z, @NotNull Function1 function10, @Nullable Modifier modifier0, boolean z1, @Nullable Shape shape0, long v, long v1, float f, float f1, @Nullable BorderStroke borderStroke0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function2 function20, @Nullable Composer composer0, int v2, int v3, int v4) {
        Modifier modifier1 = (v4 & 4) == 0 ? modifier0 : Modifier.Companion;
        Shape shape1 = (v4 & 16) == 0 ? shape0 : RectangleShapeKt.getRectangleShape();
        long v5 = (v4 & 0x20) == 0 ? v : MaterialTheme.INSTANCE.getColorScheme(composer0, 6).getSurface-0d7_KjU();
        long v6 = (v4 & 0x40) == 0 ? v1 : ColorSchemeKt.contentColorFor-ek8zF_U(v5, composer0, v2 >> 15 & 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x90191EDF, v2, v3, "androidx.compose.material3.Surface (Surface.kt:410)");
        }
        float f2 = Dp.constructor-impl(((Dp)composer0.consume(SurfaceKt.a)).unbox-impl() + ((v4 & 0x80) == 0 ? f : 0.0f));
        ProvidedValue providedValue0 = ContentColorKt.getLocalContentColor().provides(Color.box-impl(v6));
        Dp dp0 = Dp.box-impl(f2);
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{providedValue0, SurfaceKt.a.provides(dp0)}, ComposableLambdaKt.rememberComposableLambda(0x2A7B421F, true, new pm(modifier1, shape1, v5, f2, ((v4 & 0x200) == 0 ? borderStroke0 : null), z, ((v4 & 0x400) == 0 ? mutableInteractionSource0 : null), ((v4 & 8) == 0 ? z1 : true), function10, ((v4 & 0x100) == 0 ? f1 : 0.0f), function20), composer0, 54), composer0, ProvidedValue.$stable | 0x30);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Surface-o_FOJdg(@NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, @Nullable Shape shape0, long v, long v1, float f, float f1, @Nullable BorderStroke borderStroke0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function2 function20, @Nullable Composer composer0, int v2, int v3, int v4) {
        Modifier modifier1 = (v4 & 2) == 0 ? modifier0 : Modifier.Companion;
        Shape shape1 = (v4 & 8) == 0 ? shape0 : RectangleShapeKt.getRectangleShape();
        long v5 = (v4 & 16) == 0 ? v : MaterialTheme.INSTANCE.getColorScheme(composer0, 6).getSurface-0d7_KjU();
        long v6 = (v4 & 0x20) == 0 ? v1 : ColorSchemeKt.contentColorFor-ek8zF_U(v5, composer0, v2 >> 12 & 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD0ED541C, v2, v3, "androidx.compose.material3.Surface (Surface.kt:203)");
        }
        float f2 = Dp.constructor-impl(((Dp)composer0.consume(SurfaceKt.a)).unbox-impl() + ((v4 & 0x40) == 0 ? f : 0.0f));
        ProvidedValue providedValue0 = ContentColorKt.getLocalContentColor().provides(Color.box-impl(v6));
        Dp dp0 = Dp.box-impl(f2);
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{providedValue0, SurfaceKt.a.provides(dp0)}, ComposableLambdaKt.rememberComposableLambda(1279702876, true, new nm(modifier1, shape1, v5, f2, ((v4 & 0x100) == 0 ? borderStroke0 : null), ((v4 & 0x200) == 0 ? mutableInteractionSource0 : null), ((v4 & 4) == 0 ? z : true), function00, ((v4 & 0x80) == 0 ? f1 : 0.0f), function20), composer0, 54), composer0, ProvidedValue.$stable | 0x30);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final Modifier access$surface-XO-JAsU(Modifier modifier0, Shape shape0, long v, BorderStroke borderStroke0, float f) {
        Modifier modifier1 = f > 0.0f ? GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, shape0, false, null, 0L, 0L, 0, 0x1E7DF, null) : Modifier.Companion;
        Modifier modifier2 = modifier0.then(modifier1);
        return borderStroke0 == null ? ClipKt.clip(BackgroundKt.background-bw27NRU(modifier2.then(Modifier.Companion), v, shape0), shape0) : ClipKt.clip(BackgroundKt.background-bw27NRU(modifier2.then(BorderKt.border(Modifier.Companion, borderStroke0, shape0)), v, shape0), shape0);
    }

    public static final long access$surfaceColorAtElevation-CLU3JFs(long v, float f, Composer composer0, int v1) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8406F7F6, v1, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:465)");
        }
        long v2 = ColorSchemeKt.applyTonalElevation-RFCenO8(MaterialTheme.INSTANCE.getColorScheme(composer0, 6), v, f, composer0, v1 << 3 & 0x3F0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v2;
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalAbsoluteTonalElevation() {
        return SurfaceKt.a;
    }
}

