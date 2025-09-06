package androidx.compose.foundation;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.room.a;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u.c2;
import u.d2;
import u.e2;
import u.f2;

@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001AS\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u000FH\u0007¢\u0006\u0002\u0010\u0010\u001Ab\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u000F2\b\b\u0002\u0010\u0011\u001A\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001AS\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0015\u001A\u00020\u00162\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u000FH\u0007¢\u0006\u0002\u0010\u0017\u001AS\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0018\u001A\u00020\u00192\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u000FH\u0007¢\u0006\u0002\u0010\u001A\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001B"}, d2 = {"Image", "", "bitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "Image-5h-nEew", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;II)V", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "imageVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Image.kt\nandroidx/compose/foundation/ImageKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,268:1\n1223#2,6:269\n1223#2,6:275\n124#3,6:281\n131#3,5:296\n136#3:307\n138#3:310\n289#4,9:287\n298#4,2:308\n4032#5,6:301\n*S KotlinDebug\n*F\n+ 1 Image.kt\nandroidx/compose/foundation/ImageKt\n*L\n154#1:269,6\n246#1:275,6\n256#1:281,6\n256#1:296,5\n256#1:307\n256#1:310\n256#1:287,9\n256#1:308,2\n256#1:301,6\n*E\n"})
public final class ImageKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Consider usage of the Image composable that consumes an optional FilterQuality parameter", replaceWith = @ReplaceWith(expression = "Image(bitmap, contentDescription, modifier, alignment, contentScale, alpha, colorFilter, DefaultFilterQuality)", imports = {"androidx.compose.foundation", "androidx.compose.ui.graphics.DefaultAlpha", "androidx.compose.ui.Alignment", "androidx.compose.ui.graphics.drawscope.DrawScope.Companion.DefaultFilterQuality", "androidx.compose.ui.layout.ContentScale.Fit"}))
    public static final void Image(ImageBitmap imageBitmap0, String s, Modifier modifier0, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, Composer composer0, int v, int v1) {
        Modifier modifier1 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
        Alignment alignment1 = (v1 & 8) == 0 ? alignment0 : Alignment.Companion.getCenter();
        ContentScale contentScale1 = (v1 & 16) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x817219FF, v, -1, "androidx.compose.foundation.Image (Image.kt:95)");
        }
        ImageKt.Image-5h-nEew(imageBitmap0, s, modifier1, alignment1, contentScale1, ((v1 & 0x20) == 0 ? f : 1.0f), ((v1 & 0x40) == 0 ? colorFilter0 : null), 1, composer0, v & 0x3FFFFE, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Image(@NotNull Painter painter0, @Nullable String s, @Nullable Modifier modifier0, @Nullable Alignment alignment0, @Nullable ContentScale contentScale0, float f, @Nullable ColorFilter colorFilter0, @Nullable Composer composer0, int v, int v1) {
        float f1;
        ColorFilter colorFilter2;
        ContentScale contentScale1;
        Alignment alignment1;
        Modifier modifier2;
        Modifier modifier3;
        ColorFilter colorFilter1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x441D0E20);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(painter0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v & 0x180) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(alignment0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changed(contentScale0) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x30000 & v) == 0) {
            v2 |= (composer1.changed(f) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) == 0) {
            colorFilter1 = colorFilter0;
            if((v & 0x180000) == 0) {
                v2 |= (composer1.changed(colorFilter1) ? 0x100000 : 0x80000);
            }
        }
        else {
            v2 |= 0x180000;
            colorFilter1 = colorFilter0;
        }
        if((v2 & 0x92493) != 0x92492 || !composer1.getSkipping()) {
            if((v1 & 4) != 0) {
                modifier1 = Modifier.Companion;
            }
            Alignment alignment2 = (v1 & 8) == 0 ? alignment0 : Alignment.Companion.getCenter();
            ContentScale contentScale2 = (v1 & 16) == 0 ? contentScale0 : ContentScale.Companion.getFit();
            float f2 = (v1 & 0x20) == 0 ? f : 1.0f;
            if((v1 & 0x40) != 0) {
                colorFilter1 = null;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x441D0E20, v2, -1, "androidx.compose.foundation.Image (Image.kt:243)");
            }
            if(s == null) {
                composer1.startReplaceGroup(1040398089);
                composer1.endReplaceGroup();
                modifier3 = Modifier.Companion;
            }
            else {
                composer1.startReplaceGroup(1040258775);
                Companion modifier$Companion0 = Modifier.Companion;
                f2 f20 = composer1.rememberedValue();
                if((v2 & 0x70) == 0x20 || f20 == Composer.Companion.getEmpty()) {
                    f20 = new f2(s);
                    composer1.updateRememberedValue(f20);
                }
                modifier3 = SemanticsModifierKt.semantics$default(modifier$Companion0, false, f20, 1, null);
                composer1.endReplaceGroup();
            }
            Modifier modifier4 = PainterModifierKt.paint$default(ClipKt.clipToBounds(modifier1.then(modifier3)), painter0, false, alignment2, contentScale2, f2, colorFilter1, 2, null);
            d2 d20 = (d2 this, /* 缺少Lambda参数 */, /* 缺少Lambda参数 */) -> MeasureScope.layout$default(measureScope0, Constraints.getMinWidth-impl(v), Constraints.getMinHeight-impl(v), null, c2.w, 4, null);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function00);
            }
            else {
                composer1.useNode();
            }
            Updater.set-impl(composer1, d20, composeUiNode$Companion0.getSetMeasurePolicy());
            Updater.set-impl(composer1, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            Function2 function20 = composeUiNode$Companion0.getSetCompositeKeyHash();
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function20);
            }
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            alignment1 = alignment2;
            contentScale1 = contentScale2;
            modifier2 = modifier1;
            colorFilter2 = colorFilter1;
            f1 = f2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier2 = modifier1;
            alignment1 = alignment0;
            contentScale1 = contentScale0;
            colorFilter2 = colorFilter1;
            f1 = f;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e2(painter0, s, modifier2, alignment1, contentScale1, f1, colorFilter2, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Image(@NotNull ImageVector imageVector0, @Nullable String s, @Nullable Modifier modifier0, @Nullable Alignment alignment0, @Nullable ContentScale contentScale0, float f, @Nullable ColorFilter colorFilter0, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier1 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
        Alignment alignment1 = (v1 & 8) == 0 ? alignment0 : Alignment.Companion.getCenter();
        ContentScale contentScale1 = (v1 & 16) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5F1F9C13, v, -1, "androidx.compose.foundation.Image (Image.kt:197)");
        }
        ImageKt.Image(VectorPainterKt.rememberVectorPainter(imageVector0, composer0, v & 14), s, modifier1, alignment1, contentScale1, ((v1 & 0x20) == 0 ? f : 1.0f), ((v1 & 0x40) == 0 ? colorFilter0 : null), composer0, VectorPainter.$stable | v & 0x70 | v & 0x380 | v & 0x1C00 | 0xE000 & v | 0x70000 & v | v & 0x380000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Image-5h-nEew(@NotNull ImageBitmap imageBitmap0, @Nullable String s, @Nullable Modifier modifier0, @Nullable Alignment alignment0, @Nullable ContentScale contentScale0, float f, @Nullable ColorFilter colorFilter0, int v, @Nullable Composer composer0, int v1, int v2) {
        Modifier modifier1 = (v2 & 4) == 0 ? modifier0 : Modifier.Companion;
        Alignment alignment1 = (v2 & 8) == 0 ? alignment0 : Alignment.Companion.getCenter();
        ContentScale contentScale1 = (v2 & 16) == 0 ? contentScale0 : ContentScale.Companion.getFit();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xACC6C084, v1, -1, "androidx.compose.foundation.Image (Image.kt:152)");
        }
        boolean z = composer0.changed(imageBitmap0);
        BitmapPainter bitmapPainter0 = composer0.rememberedValue();
        if(z || bitmapPainter0 == Composer.Companion.getEmpty()) {
            bitmapPainter0 = BitmapPainterKt.BitmapPainter-QZhYCtY$default(imageBitmap0, 0L, 0L, ((v2 & 0x80) == 0 ? v : 1), 6, null);
            composer0.updateRememberedValue(bitmapPainter0);
        }
        ImageKt.Image(bitmapPainter0, s, modifier1, alignment1, contentScale1, ((v2 & 0x20) == 0 ? f : 1.0f), ((v2 & 0x40) == 0 ? colorFilter0 : null), composer0, 0x3FFFF0 & v1, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

