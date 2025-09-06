package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.AbsoluteAlignment;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001A0\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0011\u0010\u0006\u001A\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0001¢\u0006\u0002\u0010\t\u001AD\u0010\n\u001A\u00020\u00012\u0006\u0010\u000B\u001A\u00020\u00032\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\r2\b\b\u0002\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u0014H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001A+\u0010\u0017\u001A\u00020\u00012\u0006\u0010\u0013\u001A\u00020\u00142\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u0019\u001A\u00020\rH\u0001¢\u0006\u0002\u0010\u001A\u001A\u0014\u0010\u001B\u001A\u00020\u001C*\u00020\u001D2\u0006\u0010\u001E\u001A\u00020\u001FH\u0000\u001A\"\u0010 \u001A\u00020\u0014*\u00020\u00142\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u0019\u001A\u00020\rH\u0000\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006!"}, d2 = {"HandlePopup", "", "positionProvider", "Landroidx/compose/foundation/text/selection/OffsetProvider;", "handleReferencePoint", "Landroidx/compose/ui/Alignment;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/text/selection/OffsetProvider;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SelectionHandle", "offsetProvider", "isStartHandle", "", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "handlesCrossed", "minTouchTargetSize", "Landroidx/compose/ui/unit/DpSize;", "modifier", "Landroidx/compose/ui/Modifier;", "SelectionHandle-pzduO1o", "(Landroidx/compose/foundation/text/selection/OffsetProvider;ZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZJLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SelectionHandleIcon", "iconVisible", "isLeft", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "createHandleImage", "Landroidx/compose/ui/graphics/ImageBitmap;", "Landroidx/compose/ui/draw/CacheDrawScope;", "radius", "", "drawSelectionHandle", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,258:1\n1223#2,6:259\n1223#2,6:283\n77#3:265\n546#4,17:266\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n*L\n70#1:259,6\n249#1:283,6\n81#1:265\n213#1:266,17\n*E\n"})
public final class AndroidSelectionHandles_androidKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void HandlePopup(@NotNull OffsetProvider offsetProvider0, @NotNull Alignment alignment0, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(476043083);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? composer1.changed(offsetProvider0) : composer1.changedInstance(offsetProvider0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(alignment0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(476043083, v1, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:247)");
            }
            int v2 = (v1 & 14) != 4 && ((v1 & 8) == 0 || !composer1.changed(offsetProvider0)) ? 0 : 1;
            HandlePositionProvider handlePositionProvider0 = composer1.rememberedValue();
            if((((v1 & 0x70) == 0x20 ? 1 : 0) | v2) != 0 || handlePositionProvider0 == Composer.Companion.getEmpty()) {
                handlePositionProvider0 = new HandlePositionProvider(alignment0, offsetProvider0);
                composer1.updateRememberedValue(handlePositionProvider0);
            }
            AndroidPopup_androidKt.Popup(handlePositionProvider0, null, new PopupProperties(false, false, false, null, true, false, 15, null), function20, composer1, v1 << 3 & 0x1C00 | 0x180, 2);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(v, 0, offsetProvider0, alignment0, function20));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SelectionHandle-pzduO1o(@NotNull OffsetProvider offsetProvider0, boolean z, @NotNull ResolvedTextDirection resolvedTextDirection0, boolean z1, long v, @NotNull Modifier modifier0, @Nullable Composer composer0, int v1, int v2) {
        long v4;
        int v3;
        Composer composer1 = composer0.startRestartGroup(-843755800);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (((v1 & 8) == 0 ? composer1.changed(offsetProvider0) : composer1.changedInstance(offsetProvider0)) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v3 |= (composer1.changed(resolvedTextDirection0) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            v3 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            v4 = v;
            v3 |= ((v2 & 16) != 0 || !composer1.changed(v4) ? 0x2000 : 0x4000);
        }
        else {
            v4 = v;
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v1 & 0x30000) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x20000 : 0x10000);
        }
        if((74899 & v3) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) != 0 && !composer1.getDefaultsInvalid()) {
                composer1.skipToGroupEnd();
                if((v2 & 16) != 0) {
                    v3 &= 0xFFFF1FFF;
                }
            }
            else if((v2 & 16) != 0) {
                v4 = 0x7FC000007FC00000L;
                v3 &= 0xFFFF1FFF;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-843755800, v3, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:64)");
            }
            boolean z2 = SelectionHandlesKt.isLeftSelectionHandle(z, resolvedTextDirection0, z1);
            Alignment alignment0 = z2 ? AbsoluteAlignment.INSTANCE.getTopRight() : AbsoluteAlignment.INSTANCE.getTopLeft();
            int v5 = (v3 & 14) == 4 || (v3 & 8) != 0 && composer1.changedInstance(offsetProvider0) ? 1 : 0;
            boolean z3 = composer1.changed(z2);
            f f0 = composer1.rememberedValue();
            if((((v3 & 0x70) == 0x20 ? 1 : 0) | v5 | z3) != 0 || f0 == Composer.Companion.getEmpty()) {
                f0 = new f(offsetProvider0, z, z2);
                composer1.updateRememberedValue(f0);
            }
            Modifier modifier1 = SemanticsModifierKt.semantics$default(modifier0, false, f0, 1, null);
            AndroidSelectionHandles_androidKt.HandlePopup(offsetProvider0, alignment0, ComposableLambdaKt.rememberComposableLambda(0x10B320D1, true, new d(((ViewConfiguration)composer1.consume(CompositionLocalsKt.getLocalViewConfiguration())), v4, z2, modifier1, offsetProvider0), composer1, 54), composer1, v3 & 14 | 0x180);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e(offsetProvider0, z, resolvedTextDirection0, z1, v4, modifier0, v1, v2));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SelectionHandleIcon(@NotNull Modifier modifier0, @NotNull Function0 function00, boolean z, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x7DDD909A);
        int v1 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x7DDD909A, v1, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:122)");
            }
            SpacerKt.Spacer(AndroidSelectionHandles_androidKt.drawSelectionHandle(SizeKt.size-VpY3zN4(modifier0, 25.0f, 25.0f), function00, z), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(modifier0, function00, z, v, 0));
        }
    }

    @NotNull
    public static final ImageBitmap createHandleImage(@NotNull CacheDrawScope cacheDrawScope0, float f) {
        int v = ((int)(((float)Math.ceil(f)))) * 2;
        ImageBitmap imageBitmap0 = g.a.a;
        Canvas canvas0 = g.a.b;
        CanvasDrawScope canvasDrawScope0 = g.a.c;
        if(imageBitmap0 == null || canvas0 == null || v > imageBitmap0.getWidth() || v > imageBitmap0.getHeight()) {
            imageBitmap0 = ImageBitmapKt.ImageBitmap-x__-hDU$default(v, v, 1, false, null, 24, null);
            g.a.a = imageBitmap0;
            canvas0 = CanvasKt.Canvas(imageBitmap0);
            g.a.b = canvas0;
        }
        if(canvasDrawScope0 == null) {
            canvasDrawScope0 = new CanvasDrawScope();
            g.a.c = canvasDrawScope0;
        }
        LayoutDirection layoutDirection0 = cacheDrawScope0.getLayoutDirection();
        long v1 = androidx.compose.ui.geometry.SizeKt.Size(imageBitmap0.getWidth(), imageBitmap0.getHeight());
        DrawParams canvasDrawScope$DrawParams0 = canvasDrawScope0.getDrawParams();
        DrawParams canvasDrawScope$DrawParams1 = canvasDrawScope0.getDrawParams();
        canvasDrawScope$DrawParams1.setDensity(cacheDrawScope0);
        canvasDrawScope$DrawParams1.setLayoutDirection(layoutDirection0);
        canvasDrawScope$DrawParams1.setCanvas(canvas0);
        canvasDrawScope$DrawParams1.setSize-uvyYCjk(v1);
        canvas0.save();
        DrawScope.drawRect-n-J9OG0$default(canvasDrawScope0, 0xFF00000000000000L, 0L, canvasDrawScope0.getSize-NH-jbRc(), 0.0f, null, null, 0, 58, null);
        DrawScope.drawRect-n-J9OG0$default(canvasDrawScope0, 0xFF00000000000000L, 0L, androidx.compose.ui.geometry.SizeKt.Size(f, f), 0.0f, null, null, 0, 120, null);
        DrawScope.drawCircle-VaOC9Bg$default(canvasDrawScope0, 0xFF00000000000000L, f, OffsetKt.Offset(f, f), 0.0f, null, null, 0, 120, null);
        canvas0.restore();
        DrawParams canvasDrawScope$DrawParams2 = canvasDrawScope0.getDrawParams();
        canvasDrawScope$DrawParams2.setDensity(canvasDrawScope$DrawParams0.component1());
        canvasDrawScope$DrawParams2.setLayoutDirection(canvasDrawScope$DrawParams0.component2());
        canvasDrawScope$DrawParams2.setCanvas(canvasDrawScope$DrawParams0.component3());
        canvasDrawScope$DrawParams2.setSize-uvyYCjk(canvasDrawScope$DrawParams0.component4-NH-jbRc());
        return imageBitmap0;
    }

    @NotNull
    public static final Modifier drawSelectionHandle(@NotNull Modifier modifier0, @NotNull Function0 function00, boolean z) {
        return ComposedModifierKt.composed$default(modifier0, null, new j(function00, z, 0), 1, null);
    }
}

