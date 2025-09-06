package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.selection.b0;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A8\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00002\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001A8\u0010\u000B\u001A\u00020\b2\u0006\u0010\r\u001A\u00020\f2\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000E\u001A8\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0010\u001A\u00020\u000F2\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0011\u001A5\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0010\u001A\u00020\u000F2\b\u0010\u0007\u001A\u0004\u0018\u00010\u00122\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u000B\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", "imageVector", "", "contentDescription", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "tint", "", "Icon-ww6aTOc", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "Icon", "Landroidx/compose/ui/graphics/ImageBitmap;", "bitmap", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/ColorProducer;", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/ColorProducer;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icon.kt\nandroidx/compose/material3/IconKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,247:1\n77#2:248\n77#2:249\n77#2:256\n1223#3,6:250\n1223#3,6:257\n1223#3,6:263\n1223#3,6:269\n1223#3,6:275\n*S KotlinDebug\n*F\n+ 1 Icon.kt\nandroidx/compose/material3/IconKt\n*L\n70#1:248\n106#1:249\n143#1:256\n108#1:250,6\n146#1:257,6\n149#1:263,6\n195#1:269,6\n207#1:275,6\n*E\n"})
public final class IconKt {
    public static final Modifier a;

    static {
        float f = IconButtonTokens.INSTANCE.getIconSize-D9Ej5fM();
        IconKt.a = SizeKt.size-3ABfNKs(Modifier.Companion, f);
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Icon(@NotNull Painter painter0, @Nullable ColorProducer colorProducer0, @Nullable String s, @Nullable Modifier modifier0, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier3;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(1755070997);
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
            v2 |= (composer1.changedInstance(colorProducer0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(s) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !composer1.getSkipping()) {
            if((v1 & 8) != 0) {
                modifier0 = Modifier.Companion;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1755070997, v2, -1, "androidx.compose.material3.Icon (Icon.kt:191)");
            }
            composer1.startReplaceGroup(0x80287FE0);
            if(s == null) {
                modifier1 = Modifier.Companion;
            }
            else {
                Companion modifier$Companion0 = Modifier.Companion;
                qb qb0 = composer1.rememberedValue();
                if((v2 & 0x380) == 0x100 || qb0 == Composer.Companion.getEmpty()) {
                    qb0 = new qb(s);
                    composer1.updateRememberedValue(qb0);
                }
                modifier1 = SemanticsModifierKt.semantics$default(modifier$Companion0, false, qb0, 1, null);
            }
            composer1.endReplaceGroup();
            Modifier modifier2 = GraphicsLayerModifierKt.toolingGraphicsLayer(modifier0);
            if(Size.equals-impl0(painter0.getIntrinsicSize-NH-jbRc(), 0x7FC000007FC00000L)) {
                modifier3 = IconKt.a;
            }
            else {
                long v3 = painter0.getIntrinsicSize-NH-jbRc();
                if(Float.isInfinite(Size.getWidth-impl(v3)) && Float.isInfinite(Size.getHeight-impl(v3))) {
                    modifier3 = IconKt.a;
                }
                else {
                    long v4 = painter0.getIntrinsicSize-NH-jbRc();
                    sb sb0 = new sb(Size.getWidth-impl(v4), Size.getHeight-impl(v4));
                    modifier3 = LayoutModifierKt.layout(Modifier.Companion, sb0);
                }
            }
            Modifier modifier4 = modifier2.then(modifier3);
            boolean z = composer1.changedInstance(painter0);
            boolean z1 = composer1.changedInstance(colorProducer0);
            ob ob0 = composer1.rememberedValue();
            if(z || z1 || ob0 == Composer.Companion.getEmpty()) {
                ob0 = new ob(painter0, colorProducer0);
                composer1.updateRememberedValue(ob0);
            }
            BoxKt.Box(DrawModifierKt.drawBehind(modifier4, ob0).then(modifier1), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b0(painter0, colorProducer0, s, modifier0, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Icon-ww6aTOc(@NotNull ImageBitmap imageBitmap0, @Nullable String s, @Nullable Modifier modifier0, long v, @Nullable Composer composer0, int v1, int v2) {
        long v7;
        Modifier modifier2;
        int v6;
        int v5;
        long v4;
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(-1092052280);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (composer1.changedInstance(imageBitmap0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v1 & 0x180) == 0) {
            modifier1 = modifier0;
            v3 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 0xC00) == 0) {
            if((v2 & 8) == 0) {
                v4 = v;
                v5 = composer1.changed(v4) ? 0x800 : 0x400;
            }
            else {
                v4 = v;
                v5 = 0x400;
            }
            v3 |= v5;
        }
        else {
            v4 = v;
        }
        if((v3 & 0x493) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v2 & 4) == 0 ? modifier1 : Modifier.Companion;
                if((v2 & 8) == 0) {
                    v6 = v3;
                    modifier2 = modifier3;
                    v7 = v4;
                }
                else {
                    v6 = v3 & 0xFFFFE3FF;
                    modifier2 = modifier3;
                    v7 = ((Color)composer1.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 8) != 0) {
                    v3 &= 0xFFFFE3FF;
                }
                v6 = v3;
                modifier2 = modifier1;
                v7 = v4;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1092052280, v6, -1, "androidx.compose.material3.Icon (Icon.kt:106)");
            }
            boolean z = composer1.changed(imageBitmap0);
            BitmapPainter bitmapPainter0 = composer1.rememberedValue();
            if(z || bitmapPainter0 == Composer.Companion.getEmpty()) {
                BitmapPainter bitmapPainter1 = new BitmapPainter(imageBitmap0, 0L, 0L, 6, null);
                composer1.updateRememberedValue(bitmapPainter1);
                bitmapPainter0 = bitmapPainter1;
            }
            IconKt.Icon-ww6aTOc(bitmapPainter0, s, modifier2, v7, composer1, v6 & 0x1FF0, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            v4 = v7;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new mb(imageBitmap0, s, modifier1, v4, v1, v2, 1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Icon-ww6aTOc(@NotNull Painter painter0, @Nullable String s, @Nullable Modifier modifier0, long v, @Nullable Composer composer0, int v1, int v2) {
        long v5;
        Modifier modifier4;
        Modifier modifier2;
        long v6;
        long v4;
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x80500507);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (composer1.changedInstance(painter0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v1 & 0x180) == 0) {
            modifier1 = modifier0;
            v3 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 0xC00) == 0) {
            v4 = v;
            v3 |= ((v2 & 8) != 0 || !composer1.changed(v4) ? 0x400 : 0x800);
        }
        else {
            v4 = v;
        }
        if((v3 & 0x493) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v2 & 4) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v2 & 8) != 0) {
                    v4 = ((Color)composer1.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
                    v3 &= 0xFFFFE3FF;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 8) != 0) {
                    v3 &= 0xFFFFE3FF;
                }
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x80500507, v3, -1, "androidx.compose.material3.Icon (Icon.kt:143)");
            }
            boolean z = (v3 & 0x1C00 ^ 0xC00) > 0x800 && composer1.changed(v4) || (v3 & 0xC00) == 0x800;
            ColorFilter colorFilter0 = composer1.rememberedValue();
            if(z || colorFilter0 == Composer.Companion.getEmpty()) {
                if(Color.equals-impl0(v4, 0L)) {
                    v6 = v4;
                    colorFilter0 = null;
                }
                else {
                    v6 = v4;
                    colorFilter0 = androidx.compose.ui.graphics.ColorFilter.Companion.tint-xETnrds$default(ColorFilter.Companion, v4, 0, 2, null);
                }
                composer1.updateRememberedValue(colorFilter0);
            }
            else {
                v6 = v4;
            }
            composer1.startReplaceGroup(0x80278E00);
            if(s == null) {
                modifier2 = Modifier.Companion;
            }
            else {
                Companion modifier$Companion0 = Modifier.Companion;
                pb pb0 = composer1.rememberedValue();
                if((v3 & 0x70) == 0x20 || pb0 == Composer.Companion.getEmpty()) {
                    pb0 = new pb(s);
                    composer1.updateRememberedValue(pb0);
                }
                modifier2 = SemanticsModifierKt.semantics$default(modifier$Companion0, false, pb0, 1, null);
            }
            composer1.endReplaceGroup();
            Modifier modifier3 = GraphicsLayerModifierKt.toolingGraphicsLayer(modifier1);
            if(Size.equals-impl0(painter0.getIntrinsicSize-NH-jbRc(), 0x7FC000007FC00000L)) {
                modifier4 = IconKt.a;
            }
            else {
                long v7 = painter0.getIntrinsicSize-NH-jbRc();
                modifier4 = Float.isInfinite(Size.getWidth-impl(v7)) && Float.isInfinite(Size.getHeight-impl(v7)) ? IconKt.a : Modifier.Companion;
            }
            BoxKt.Box(PainterModifierKt.paint$default(modifier3.then(modifier4), painter0, false, null, ContentScale.Companion.getFit(), 0.0f, colorFilter0, 22, null).then(modifier2), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v5 = v6;
        }
        else {
            composer1.skipToGroupEnd();
            v5 = v4;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new nb(painter0, s, modifier1, v5, v1, v2, 0));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Icon-ww6aTOc(@NotNull ImageVector imageVector0, @Nullable String s, @Nullable Modifier modifier0, long v, @Nullable Composer composer0, int v1, int v2) {
        Modifier modifier1;
        long v6;
        Modifier modifier2;
        int v5;
        long v4;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0xF86FCC34);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (composer1.changed(imageVector0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            if((v2 & 8) == 0) {
                v4 = v;
                v5 = composer1.changed(v4) ? 0x800 : 0x400;
            }
            else {
                v4 = v;
                v5 = 0x400;
            }
            v3 |= v5;
        }
        else {
            v4 = v;
        }
        if((v3 & 0x493) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v2 & 4) == 0 ? modifier0 : Modifier.Companion;
                if((v2 & 8) == 0) {
                    v6 = v4;
                }
                else {
                    v3 &= 0xFFFFE3FF;
                    v6 = ((Color)composer1.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 8) != 0) {
                    v3 &= 0xFFFFE3FF;
                }
                modifier2 = modifier0;
                v6 = v4;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF86FCC34, v3, -1, "androidx.compose.material3.Icon (Icon.kt:70)");
            }
            IconKt.Icon-ww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector0, composer1, v3 & 14), s, modifier2, v6, composer1, VectorPainter.$stable | v3 & 0x70 | v3 & 0x380 | v3 & 0x1C00, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            v4 = v6;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new mb(imageVector0, s, modifier1, v4, v1, v2, 0));
        }
    }
}

