package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.oh;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001A:\u0010\n\u001A\u00020\u00072\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/unit/Dp;", "thickness", "startIndent", "", "Divider-oMI9zvI", "(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V", "Divider", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDivider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Divider.kt\nandroidx/compose/material/DividerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,69:1\n154#2:70\n154#2:71\n174#2:73\n74#3:72\n*S KotlinDebug\n*F\n+ 1 Divider.kt\nandroidx/compose/material/DividerKt\n*L\n47#1:70\n48#1:71\n56#1:73\n56#1:72\n*E\n"})
public final class DividerKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Divider-oMI9zvI(@Nullable Modifier modifier0, long v, float f, float f1, @Nullable Composer composer0, int v1, int v2) {
        Modifier modifier1;
        float f3;
        float f2;
        long v4;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0xB587C9BA);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v1 & 0x70) == 0) {
            v4 = v;
            v3 |= ((v2 & 2) != 0 || !composer1.changed(v4) ? 16 : 0x20);
        }
        else {
            v4 = v;
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            f2 = f;
        }
        else if((v1 & 0x380) == 0) {
            f2 = f;
            v3 |= (composer1.changed(f2) ? 0x100 : 0x80);
        }
        else {
            f2 = f;
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
            f3 = f1;
        }
        else if((v1 & 0x1C00) == 0) {
            f3 = f1;
            v3 |= (composer1.changed(f3) ? 0x800 : 0x400);
        }
        else {
            f3 = f1;
        }
        if((v3 & 5851) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v2 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v2 & 2) != 0) {
                    v4 = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer1, 6).getOnSurface-0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    v3 &= 0xFFFFFF8F;
                }
                if((v2 & 4) != 0) {
                    f2 = 1.0f;
                }
                if((v2 & 8) != 0) {
                    f3 = 0.0f;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 2) != 0) {
                    v3 &= 0xFFFFFF8F;
                }
                modifier1 = modifier0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB587C9BA, v3, -1, "androidx.compose.material.Divider (Divider.kt:48)");
            }
            Modifier modifier2 = f3 == 0.0f ? Modifier.Companion : PaddingKt.padding-qDBjuR0$default(Modifier.Companion, f3, 0.0f, 0.0f, 0.0f, 14, null);
            composer1.startReplaceableGroup(0x493FBE0D);
            float f4 = Dp.equals-impl0(f2, 0.0f) ? Dp.constructor-impl(1.0f / ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).getDensity()) : f2;
            composer1.endReplaceableGroup();
            BoxKt.Box(BackgroundKt.background-bw27NRU$default(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier1.then(modifier2), 0.0f, 1, null), f4), v4, null, 2, null), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new oh(modifier1, v4, f2, f3, v1, v2));
        }
    }
}

