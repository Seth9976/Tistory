package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.nb;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter.Companion;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.r4;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A8\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00002\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001A8\u0010\u000B\u001A\u00020\b2\u0006\u0010\r\u001A\u00020\f2\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000E\u001A8\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0010\u001A\u00020\u000F2\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", "imageVector", "", "contentDescription", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "tint", "", "Icon-ww6aTOc", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "Icon", "Landroidx/compose/ui/graphics/ImageBitmap;", "bitmap", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icon.kt\nandroidx/compose/material/IconKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,171:1\n74#2:172\n74#2:173\n74#2:181\n36#3:174\n36#3:182\n1116#4,6:175\n1116#4,6:183\n1116#4,6:189\n154#5:195\n*S KotlinDebug\n*F\n+ 1 Icon.kt\nandroidx/compose/material/IconKt\n*L\n66#1:172\n100#1:173\n134#1:181\n102#1:174\n136#1:182\n102#1:175,6\n136#1:183,6\n140#1:189,6\n170#1:195\n*E\n"})
public final class IconKt {
    public static final Modifier a;

    static {
        IconKt.a = SizeKt.size-3ABfNKs(Modifier.Companion, 24.0f);
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Icon-ww6aTOc(@NotNull ImageBitmap imageBitmap0, @Nullable String s, @Nullable Modifier modifier0, long v, @Nullable Composer composer0, int v1, int v2) {
        composer0.startReplaceableGroup(0xDEED027D);
        Modifier modifier1 = (v2 & 4) == 0 ? modifier0 : Modifier.Companion;
        long v3 = (v2 & 8) == 0 ? v : Color.copy-wmQWz5c$default(((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl(), ((Number)composer0.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDEED027D, v1, -1, "androidx.compose.material.Icon (Icon.kt:100)");
        }
        composer0.startReplaceableGroup(0x44FAF204);
        boolean z = composer0.changed(imageBitmap0);
        BitmapPainter bitmapPainter0 = composer0.rememberedValue();
        if(z || bitmapPainter0 == Composer.Companion.getEmpty()) {
            bitmapPainter0 = new BitmapPainter(imageBitmap0, 0L, 0L, 6, null);
            composer0.updateRememberedValue(bitmapPainter0);
        }
        composer0.endReplaceableGroup();
        IconKt.Icon-ww6aTOc(bitmapPainter0, s, modifier1, v3, composer0, v1 & 0x70 | 8 | v1 & 0x380 | v1 & 0x1C00, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Icon-ww6aTOc(@NotNull Painter painter0, @Nullable String s, @Nullable Modifier modifier0, long v, @Nullable Composer composer0, int v1, int v2) {
        Modifier modifier4;
        Modifier modifier2;
        int v4;
        long v3;
        Composer composer1 = composer0.startRestartGroup(-1142959010);
        Modifier modifier1 = (v2 & 4) == 0 ? modifier0 : Modifier.Companion;
        if((v2 & 8) == 0) {
            v3 = v;
            v4 = v1;
        }
        else {
            v3 = Color.copy-wmQWz5c$default(((Color)composer1.consume(ContentColorKt.getLocalContentColor())).unbox-impl(), ((Number)composer1.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
            v4 = v1 & 0xFFFFE3FF;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1142959010, v4, -1, "androidx.compose.material.Icon (Icon.kt:134)");
        }
        Color color0 = Color.box-impl(v3);
        composer1.startReplaceableGroup(0x44FAF204);
        boolean z = composer1.changed(color0);
        ColorFilter colorFilter0 = composer1.rememberedValue();
        if(z || colorFilter0 == Composer.Companion.getEmpty()) {
            colorFilter0 = Color.equals-impl0(v3, 0L) ? null : Companion.tint-xETnrds$default(ColorFilter.Companion, v3, 0, 2, null);
            composer1.updateRememberedValue(colorFilter0);
        }
        composer1.endReplaceableGroup();
        if(s == null) {
            modifier2 = Modifier.Companion;
        }
        else {
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            composer1.startReplaceableGroup(-1822880901);
            boolean z1 = composer1.changed(s);
            r4 r40 = composer1.rememberedValue();
            if(z1 || r40 == Composer.Companion.getEmpty()) {
                r40 = new r4(s);
                composer1.updateRememberedValue(r40);
            }
            composer1.endReplaceableGroup();
            modifier2 = SemanticsModifierKt.semantics$default(modifier$Companion0, false, r40, 1, null);
        }
        Modifier modifier3 = GraphicsLayerModifierKt.toolingGraphicsLayer(modifier1);
        if(Size.equals-impl0(painter0.getIntrinsicSize-NH-jbRc(), 0x7FC000007FC00000L)) {
            modifier4 = IconKt.a;
        }
        else {
            long v5 = painter0.getIntrinsicSize-NH-jbRc();
            modifier4 = Float.isInfinite(Size.getWidth-impl(v5)) && Float.isInfinite(Size.getHeight-impl(v5)) ? IconKt.a : Modifier.Companion;
        }
        BoxKt.Box(PainterModifierKt.paint$default(modifier3.then(modifier4), painter0, false, null, ContentScale.Companion.getFit(), 0.0f, colorFilter0, 22, null).then(modifier2), composer1, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new nb(painter0, s, modifier1, v3, v1, v2, 1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Icon-ww6aTOc(@NotNull ImageVector imageVector0, @Nullable String s, @Nullable Modifier modifier0, long v, @Nullable Composer composer0, int v1, int v2) {
        composer0.startReplaceableGroup(0xD043F391);
        Modifier modifier1 = (v2 & 4) == 0 ? modifier0 : Modifier.Companion;
        long v3 = (v2 & 8) == 0 ? v : Color.copy-wmQWz5c$default(((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl(), ((Number)composer0.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD043F391, v1, -1, "androidx.compose.material.Icon (Icon.kt:66)");
        }
        IconKt.Icon-ww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector0, composer0, v1 & 14), s, modifier1, v3, composer0, VectorPainter.$stable | v1 & 0x70 | v1 & 0x380 | v1 & 0x1C00, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
    }
}

