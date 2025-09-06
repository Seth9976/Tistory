package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A0\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001A0\u0010\n\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\t\u001A0\u0010\f\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000E"}, d2 = {"Divider", "", "modifier", "Landroidx/compose/ui/Modifier;", "thickness", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/Color;", "Divider-9IZ8Weo", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "HorizontalDivider", "HorizontalDivider-9IZ8Weo", "VerticalDivider", "VerticalDivider-9IZ8Weo", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDivider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Divider.kt\nandroidx/compose/material3/DividerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,121:1\n1223#2,6:122\n1223#2,6:128\n77#3:134\n168#4:135\n*S KotlinDebug\n*F\n+ 1 Divider.kt\nandroidx/compose/material3/DividerKt\n*L\n55#1:122,6\n84#1:128,6\n105#1:134\n105#1:135\n*E\n"})
public final class DividerKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(message = "Renamed to HorizontalDivider", replaceWith = @ReplaceWith(expression = "HorizontalDivider(modifier, thickness, color)", imports = {}))
    public static final void Divider-9IZ8Weo(@Nullable Modifier modifier0, float f, long v, @Nullable Composer composer0, int v1, int v2) {
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x5D216D69);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v3 |= ((v2 & 4) != 0 || !composer1.changed(v) ? 0x80 : 0x100);
        }
        if((v3 & 0x93) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v2 & 1) != 0) {
                    modifier0 = Modifier.Companion;
                }
                if((v2 & 2) != 0) {
                    f = 0.0f;
                }
                if((v2 & 4) != 0) {
                    v = DividerDefaults.INSTANCE.getColor(composer1, 6);
                    v3 &= -897;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 4) != 0) {
                    v3 &= -897;
                }
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5D216D69, v3, -1, "androidx.compose.material3.Divider (Divider.kt:101)");
            }
            composer1.startReplaceGroup(-433645095);
            float f1 = Dp.equals-impl0(f, 0.0f) ? Dp.constructor-impl(1.0f / ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).getDensity()) : f;
            composer1.endReplaceGroup();
            BoxKt.Box(BackgroundKt.background-bw27NRU$default(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier0, 0.0f, 1, null), f1), v, null, 2, null), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x8(modifier0, f, v, v1, v2, 0));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void HorizontalDivider-9IZ8Weo(@Nullable Modifier modifier0, float f, long v, @Nullable Composer composer0, int v1, int v2) {
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x47A9D25);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v3 |= ((v2 & 4) != 0 || !composer1.changed(v) ? 0x80 : 0x100);
        }
        if((v3 & 0x93) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v2 & 1) != 0) {
                    modifier0 = Modifier.Companion;
                }
                if((v2 & 2) != 0) {
                    f = 0.0f;
                }
                if((v2 & 4) != 0) {
                    v = DividerDefaults.INSTANCE.getColor(composer1, 6);
                    v3 &= -897;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 4) != 0) {
                    v3 &= -897;
                }
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x47A9D25, v3, -1, "androidx.compose.material3.HorizontalDivider (Divider.kt:54)");
            }
            int v4 = 1;
            Modifier modifier1 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier0, 0.0f, 1, null), f);
            if(((v3 & 0x380 ^ 0x180) <= 0x100 || !composer1.changed(v)) && (v3 & 0x180) != 0x100) {
                v4 = 0;
            }
            y8 y80 = composer1.rememberedValue();
            if((((v3 & 0x70) == 0x20 ? 1 : 0) | v4) != 0 || y80 == Composer.Companion.getEmpty()) {
                y80 = new y8(v, f, 0);
                composer1.updateRememberedValue(y80);
            }
            CanvasKt.Canvas(modifier1, y80, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x8(modifier0, f, v, v1, v2, 1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void VerticalDivider-9IZ8Weo(@Nullable Modifier modifier0, float f, long v, @Nullable Composer composer0, int v1, int v2) {
        int v3;
        Composer composer1 = composer0.startRestartGroup(0xA4840393);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v3 |= ((v2 & 4) != 0 || !composer1.changed(v) ? 0x80 : 0x100);
        }
        if((v3 & 0x93) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v2 & 1) != 0) {
                    modifier0 = Modifier.Companion;
                }
                if((v2 & 2) != 0) {
                    f = 0.0f;
                }
                if((v2 & 4) != 0) {
                    v = DividerDefaults.INSTANCE.getColor(composer1, 6);
                    v3 &= -897;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 4) != 0) {
                    v3 &= -897;
                }
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA4840393, v3, -1, "androidx.compose.material3.VerticalDivider (Divider.kt:83)");
            }
            int v4 = 1;
            Modifier modifier1 = SizeKt.width-3ABfNKs(SizeKt.fillMaxHeight$default(modifier0, 0.0f, 1, null), f);
            if(((v3 & 0x380 ^ 0x180) <= 0x100 || !composer1.changed(v)) && (v3 & 0x180) != 0x100) {
                v4 = 0;
            }
            y8 y80 = composer1.rememberedValue();
            if((((v3 & 0x70) == 0x20 ? 1 : 0) | v4) != 0 || y80 == Composer.Companion.getEmpty()) {
                y80 = new y8(v, f, 1);
                composer1.updateRememberedValue(y80);
            }
            CanvasKt.Canvas(modifier1, y80, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x8(modifier0, f, v, v1, v2, 2));
        }
    }
}

