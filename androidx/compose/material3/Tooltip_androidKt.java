package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001Ao\u0010\u0013\u001A\u00020\u000E*\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\f\u001A\u00020\n2\u0011\u0010\u0010\u001A\r\u0012\u0004\u0012\u00020\u000E0\r¢\u0006\u0002\b\u000FH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001A\u0093\u0001\u0010\u001B\u001A\u00020\u000E*\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00012\u0015\b\u0002\u0010\u0014\u001A\u000F\u0012\u0004\u0012\u00020\u000E\u0018\u00010\r¢\u0006\u0002\b\u000F2\u0015\b\u0002\u0010\u0015\u001A\u000F\u0012\u0004\u0012\u00020\u000E\u0018\u00010\r¢\u0006\u0002\b\u000F2\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\f\u001A\u00020\n2\u0011\u0010\u0018\u001A\r\u0012\u0004\u0012\u00020\u000E0\r¢\u0006\u0002\b\u000FH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001A\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001C"}, d2 = {"Landroidx/compose/material3/TooltipScope;", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/DpSize;", "caretSize", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "contentColor", "containerColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "PlainTooltip-7QI4Sbk", "(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PlainTooltip", "title", "action", "Landroidx/compose/material3/RichTooltipColors;", "colors", "text", "RichTooltip-yDvdmqw", "(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/RichTooltipColors;FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "RichTooltip", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTooltip.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.android.kt\nandroidx/compose/material3/Tooltip_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,326:1\n148#2:327\n148#2:328\n482#2:329\n482#2:340\n148#2:349\n77#3:330\n77#3:331\n77#3:338\n77#3:341\n77#3:342\n1223#4,6:332\n1223#4,6:343\n50#5:339\n*S KotlinDebug\n*F\n+ 1 Tooltip.android.kt\nandroidx/compose/material3/Tooltip_androidKt\n*L\n218#1:327\n219#1:328\n76#1:329\n153#1:340\n237#1:349\n77#1:330\n78#1:331\n149#1:338\n154#1:341\n155#1:342\n79#1:332,6\n156#1:343,6\n149#1:339\n*E\n"})
public final class Tooltip_androidKt {
    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void PlainTooltip-7QI4Sbk(@NotNull TooltipScope tooltipScope0, @Nullable Modifier modifier0, long v, @Nullable Shape shape0, long v1, long v2, float f, float f1, @NotNull Function2 function20, @Nullable Composer composer0, int v3, int v4) {
        long v10;
        float f3;
        float f2;
        long v9;
        Modifier modifier1;
        Modifier modifier3;
        long v16;
        Shape shape3;
        float f5;
        long v12;
        int v11;
        float f4;
        Modifier modifier2;
        long v14;
        Shape shape2;
        long v13;
        int v8;
        long v7;
        int v6;
        Shape shape1;
        int v5;
        Composer composer1 = composer0.startRestartGroup(1407069716);
        if((0x80000000 & v4) == 0) {
            v5 = (v3 & 6) == 0 ? (((v3 & 8) == 0 ? composer1.changed(tooltipScope0) : composer1.changedInstance(tooltipScope0)) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 1) != 0) {
            v5 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v3 & 0x180) == 0) {
            v5 |= ((v4 & 2) != 0 || !composer1.changed(v) ? 0x80 : 0x100);
        }
        if((v3 & 0xC00) == 0) {
            if((v4 & 4) == 0) {
                shape1 = shape0;
                v6 = composer1.changed(shape1) ? 0x800 : 0x400;
            }
            else {
                shape1 = shape0;
                v6 = 0x400;
            }
            v5 |= v6;
        }
        else {
            shape1 = shape0;
        }
        if((v3 & 0x6000) == 0) {
            if((v4 & 8) == 0) {
                v7 = v1;
                v8 = composer1.changed(v7) ? 0x4000 : 0x2000;
            }
            else {
                v7 = v1;
                v8 = 0x2000;
            }
            v5 |= v8;
        }
        else {
            v7 = v1;
        }
        if((v3 & 0x30000) == 0) {
            v5 |= ((v4 & 16) != 0 || !composer1.changed(v2) ? 0x10000 : 0x20000);
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x180000;
        }
        else if((v3 & 0x180000) == 0) {
            v5 |= (composer1.changed(f) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0xC00000;
        }
        else if((v3 & 0xC00000) == 0) {
            v5 |= (composer1.changed(f1) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0x6000000;
        }
        else if((v3 & 0x6000000) == 0) {
            v5 |= (composer1.changedInstance(function20) ? 0x4000000 : 0x2000000);
        }
        if((0x2492493 & v5) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v4 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 2) == 0) {
                    v13 = v;
                }
                else {
                    v13 = 0x7FC000007FC00000L;
                    v5 &= -897;
                }
                if((v4 & 4) == 0) {
                    shape2 = shape1;
                }
                else {
                    shape2 = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composer1, 6);
                    v5 &= 0xFFFFE3FF;
                }
                if((v4 & 8) != 0) {
                    v7 = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composer1, 6);
                    v5 &= 0xFFFF1FFF;
                }
                if((v4 & 16) == 0) {
                    v14 = v2;
                }
                else {
                    v14 = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composer1, 6);
                    v5 &= 0xFFF8FFFF;
                }
                if((v4 & 0x40) == 0) {
                    f3 = f1;
                    v11 = v5;
                }
                else {
                    v11 = v5;
                    f3 = 0.0f;
                }
                shape1 = shape2;
                f4 = (v4 & 0x20) == 0 ? f : 0.0f;
                v12 = v13;
                v10 = v14;
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 2) != 0) {
                    v5 &= -897;
                }
                if((v4 & 4) != 0) {
                    v5 &= 0xFFFFE3FF;
                }
                if((v4 & 8) != 0) {
                    v5 &= 0xFFFF1FFF;
                }
                if((v4 & 16) != 0) {
                    v5 &= 0xFFF8FFFF;
                }
                modifier2 = modifier0;
                f4 = f;
                f3 = f1;
                v11 = v5;
                v10 = v2;
                v12 = v;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1407069716, v11, -1, "androidx.compose.material3.PlainTooltip (Tooltip.android.kt:73)");
            }
            composer1.startReplaceGroup(0xEC19D8D1);
            if(v12 == 0x7FC000007FC00000L) {
                f5 = f4;
                shape3 = shape1;
                v16 = v7;
                modifier3 = modifier2;
            }
            else {
                Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
                Configuration configuration0 = (Configuration)composer1.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
                Companion modifier$Companion0 = Modifier.Companion;
                boolean z = composer1.changed(density0);
                boolean z1 = composer1.changedInstance(configuration0);
                f5 = f4;
                shape3 = shape1;
                int v15 = ((v11 & 0x70000 ^ 0x30000) <= 0x20000 || !composer1.changed(v10)) && (v11 & 0x30000) != 0x20000 ? 0 : 1;
                v16 = v7;
                int v17 = ((v11 & 0x380 ^ 0x180) <= 0x100 || !composer1.changed(v12)) && (v11 & 0x180) != 0x100 ? 0 : 1;
                gr gr0 = composer1.rememberedValue();
                if((z | z1 | v15 | v17) != 0 || gr0 == Composer.Companion.getEmpty()) {
                    gr0 = new gr(density0, configuration0, v10, v12, 0);
                    composer1.updateRememberedValue(gr0);
                }
                modifier3 = tooltipScope0.drawCaret(modifier$Companion0, gr0).then(modifier2);
            }
            composer1.endReplaceGroup();
            v7 = v16;
            SurfaceKt.Surface-T9BRK9s(modifier3, shape3, v10, 0L, f5, f3, null, ComposableLambdaKt.rememberComposableLambda(0x553DDA6F, true, new er(v7, function20), composer1, 54), composer1, v11 >> 6 & 0x70 | 0xC00000 | v11 >> 9 & 0x380 | 0xE000 & v11 >> 6 | v11 >> 6 & 0x70000, 72);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f2 = f5;
            v9 = v12;
            shape1 = shape3;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            v9 = v;
            f2 = f;
            f3 = f1;
            v10 = v2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new fr(tooltipScope0, modifier1, v9, shape1, v7, v10, f2, f3, function20, v3, v4));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void RichTooltip-yDvdmqw(@NotNull TooltipScope tooltipScope0, @Nullable Modifier modifier0, @Nullable Function2 function20, @Nullable Function2 function21, long v, @Nullable Shape shape0, @Nullable RichTooltipColors richTooltipColors0, float f, float f1, @NotNull Function2 function22, @Nullable Composer composer0, int v1, int v2) {
        float f3;
        long v6;
        Function2 function24;
        float f2;
        RichTooltipColors richTooltipColors1;
        Function2 function23;
        Modifier modifier1;
        Modifier modifier2;
        Function2 function27;
        Shape shape2;
        float f6;
        float f4;
        int v8;
        long v7;
        Function2 function26;
        RichTooltipColors richTooltipColors2;
        Function2 function25;
        RichTooltipColors richTooltipColors3;
        int v5;
        Shape shape1;
        long v4;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x6F4F19C9);
        if((0x80000000 & v2) == 0) {
            v3 = (v1 & 6) == 0 ? (((v1 & 8) == 0 ? composer1.changed(tooltipScope0) : composer1.changedInstance(tooltipScope0)) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 1) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v2 & 2) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v2 & 4) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            v4 = v;
            v3 |= ((v2 & 8) != 0 || !composer1.changed(v4) ? 0x2000 : 0x4000);
        }
        else {
            v4 = v;
        }
        if((0x30000 & v1) == 0) {
            if((v2 & 16) == 0) {
                shape1 = shape0;
                v5 = composer1.changed(shape1) ? 0x20000 : 0x10000;
            }
            else {
                shape1 = shape0;
                v5 = 0x10000;
            }
            v3 |= v5;
        }
        else {
            shape1 = shape0;
        }
        if((v1 & 0x180000) == 0) {
            v3 |= ((v2 & 0x20) != 0 || !composer1.changed(richTooltipColors0) ? 0x80000 : 0x100000);
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0xC00000;
        }
        else if((v1 & 0xC00000) == 0) {
            v3 |= (composer1.changed(f) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x80) != 0) {
            v3 |= 0x6000000;
        }
        else if((v1 & 0x6000000) == 0) {
            v3 |= (composer1.changed(f1) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x100) != 0) {
            v3 |= 0x30000000;
        }
        else if((v1 & 0x30000000) == 0) {
            v3 |= (composer1.changedInstance(function22) ? 0x20000000 : 0x10000000);
        }
        if((306783379 & v3) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v2 & 1) == 0 ? modifier0 : Modifier.Companion;
                function26 = null;
                function25 = (v2 & 2) == 0 ? function20 : null;
                if((v2 & 4) == 0) {
                    function26 = function21;
                }
                if((v2 & 8) == 0) {
                    v7 = v4;
                }
                else {
                    v7 = 0x7FC000007FC00000L;
                    v3 &= 0xFFFF1FFF;
                }
                if((v2 & 16) != 0) {
                    shape1 = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composer1, 6);
                    v3 &= 0xFFF8FFFF;
                }
                if((v2 & 0x20) == 0) {
                    richTooltipColors3 = richTooltipColors0;
                }
                else {
                    richTooltipColors3 = TooltipDefaults.INSTANCE.richTooltipColors(composer1, 6);
                    v3 &= 0xFFC7FFFF;
                }
                f2 = (v2 & 0x80) == 0 ? f1 : 0.0f;
                richTooltipColors2 = richTooltipColors3;
                v8 = v3;
                f4 = (v2 & 0x40) == 0 ? f : 0.0f;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 8) != 0) {
                    v3 &= 0xFFFF1FFF;
                }
                if((v2 & 16) != 0) {
                    v3 &= 0xFFF8FFFF;
                }
                if((v2 & 0x20) != 0) {
                    v3 &= 0xFFC7FFFF;
                }
                modifier1 = modifier0;
                function25 = function20;
                richTooltipColors2 = richTooltipColors0;
                f2 = f1;
                function26 = function21;
                v7 = v4;
                v8 = v3;
                f4 = f;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x6F4F19C9, v8, -1, "androidx.compose.material3.RichTooltip (Tooltip.android.kt:147)");
            }
            float f5 = Dp.constructor-impl(((Dp)composer1.consume(SurfaceKt.getLocalAbsoluteTonalElevation())).unbox-impl() + f4);
            long v9 = ColorSchemeKt.applyTonalElevation-RFCenO8(MaterialTheme.INSTANCE.getColorScheme(composer1, 6), richTooltipColors2.getContainerColor-0d7_KjU(), f5, composer1, 0);
            composer1.startReplaceGroup(0x57C853B7);
            if(v7 == 0x7FC000007FC00000L) {
                f6 = f4;
                function27 = function26;
                shape2 = shape1;
                modifier2 = modifier1;
            }
            else {
                Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
                Configuration configuration0 = (Configuration)composer1.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
                f6 = f4;
                Companion modifier$Companion0 = Modifier.Companion;
                boolean z = composer1.changed(density0);
                boolean z1 = composer1.changedInstance(configuration0);
                boolean z2 = composer1.changed(v9);
                shape2 = shape1;
                function27 = function26;
                int v10 = ((v8 & 0xE000 ^ 0x6000) <= 0x4000 || !composer1.changed(v7)) && (v8 & 0x6000) != 0x4000 ? 0 : 1;
                gr gr0 = composer1.rememberedValue();
                if((z | z1 | z2 | v10) != 0 || gr0 == Composer.Companion.getEmpty()) {
                    gr0 = new gr(density0, configuration0, v9, v7, 1);
                    composer1.updateRememberedValue(gr0);
                }
                modifier2 = tooltipScope0.drawCaret(modifier$Companion0, gr0).then(modifier1);
            }
            composer1.endReplaceGroup();
            function24 = function27;
            SurfaceKt.Surface-T9BRK9s(SizeKt.sizeIn-qDBjuR0$default(modifier2, 40.0f, 24.0f, 320.0f, 0.0f, 8, null), shape2, richTooltipColors2.getContainerColor-0d7_KjU(), 0L, f6, f2, null, ComposableLambdaKt.rememberComposableLambda(317290958, true, new hr(function25, function24, richTooltipColors2, function22), composer1, 54), composer1, v8 >> 12 & 0x70 | 0xC00000 | 0xE000 & v8 >> 9 | v8 >> 9 & 0x70000, 72);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function23 = function25;
            v6 = v7;
            f3 = f6;
            shape1 = shape2;
            richTooltipColors1 = richTooltipColors2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            function23 = function20;
            richTooltipColors1 = richTooltipColors0;
            f2 = f1;
            function24 = function21;
            v6 = v4;
            f3 = f;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ir(tooltipScope0, modifier1, function23, function24, v6, shape1, richTooltipColors1, f3, f2, function22, v1, v2));
        }
    }

    public static final DrawResult access$drawCaretWithPath-JKu-mZY(CacheDrawScope cacheDrawScope0, x2 x20, Density density0, Configuration configuration0, long v, long v1, LayoutCoordinates layoutCoordinates0) {
        long v6;
        Path path0 = AndroidPath_androidKt.Path();
        if(layoutCoordinates0 != null) {
            int v2 = density0.roundToPx-0680j_4(DpSize.getHeight-D9Ej5fM(v1));
            int v3 = density0.roundToPx-0680j_4(DpSize.getWidth-D9Ej5fM(v1));
            int v4 = density0.roundToPx-0680j_4(((float)configuration0.screenWidthDp));
            int v5 = density0.roundToPx-0680j_4(4.0f);
            Rect rect0 = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates0);
            float f = rect0.getLeft();
            float f1 = rect0.getRight();
            float f2 = (f1 + f) / 2.0f;
            float f3 = f1 - f;
            float f4 = Size.getWidth-impl(cacheDrawScope0.getSize-NH-jbRc());
            float f5 = Size.getHeight-impl(cacheDrawScope0.getSize-NH-jbRc());
            boolean z = rect0.getTop() - f5 - ((float)v5) < 0.0f;
            if(z) {
                f5 = 0.0f;
            }
            if(x20 != x2.a) {
                long v7 = OffsetKt.Offset(f2 - f, f5);
                if(f + f4 > ((float)v4)) {
                    float f6 = f1 - f4;
                    v7 = OffsetKt.Offset(f2 - f6, f5);
                    if(f6 >= 0.0f) {
                        v6 = v7;
                    }
                    else if(f - f4 / 2.0f + f3 / 2.0f <= 0.0f) {
                        v6 = OffsetKt.Offset(f2, f5);
                    }
                    else if(f1 + f4 / 2.0f - f3 / 2.0f >= ((float)v4)) {
                        v6 = OffsetKt.Offset(f4 - (((float)v4) - f2), f5);
                    }
                    else {
                        v6 = OffsetKt.Offset(f4 / 2.0f, f5);
                    }
                }
                else {
                    v6 = v7;
                }
            }
            else if(f4 / 2.0f + f2 > ((float)v4)) {
                v6 = OffsetKt.Offset(f4 - (((float)v4) - f2), f5);
            }
            else {
                v6 = OffsetKt.Offset(f2 - Math.max(f - (Size.getWidth-impl(cacheDrawScope0.getSize-NH-jbRc()) / 2.0f - f3 / 2.0f), 0.0f), f5);
            }
            if(z) {
                path0.moveTo(Offset.getX-impl(v6), Offset.getY-impl(v6));
                path0.lineTo(Offset.getX-impl(v6) + ((float)(v3 / 2)), Offset.getY-impl(v6));
                path0.lineTo(Offset.getX-impl(v6), Offset.getY-impl(v6) - ((float)v2));
                path0.lineTo(Offset.getX-impl(v6) - ((float)(v3 / 2)), Offset.getY-impl(v6));
                path0.close();
                return cacheDrawScope0.onDrawWithContent(new jr(layoutCoordinates0, path0, v));
            }
            path0.moveTo(Offset.getX-impl(v6), Offset.getY-impl(v6));
            path0.lineTo(Offset.getX-impl(v6) + ((float)(v3 / 2)), Offset.getY-impl(v6));
            path0.lineTo(Offset.getX-impl(v6), Offset.getY-impl(v6) + ((float)v2));
            path0.lineTo(Offset.getX-impl(v6) - ((float)(v3 / 2)), Offset.getY-impl(v6));
            path0.close();
        }
        return cacheDrawScope0.onDrawWithContent(new jr(layoutCoordinates0, path0, v));
    }
}

