package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A±\u0001\u0010\u0015\u001A\u00020\u00032\b\b\u0002\u0010\u0001\u001A\u00020\u00002\u0013\b\u0002\u0010\u0005\u001A\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\u0006\u001A\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\u0007\u001A\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\b\u001A\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u000B2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\u0017\u0010\u0012\u001A\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "topBar", "bottomBar", "snackbarHost", "floatingActionButton", "Landroidx/compose/material3/FabPosition;", "floatingActionButtonPosition", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/WindowInsets;", "contentWindowInsets", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Scaffold-TvnljyQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IJJLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Scaffold", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,355:1\n1223#2,6:356\n1223#2,6:362\n1223#2,6:368\n148#3:374\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt\n*L\n96#1:356,6\n99#1:362,6\n140#1:368,6\n346#1:374\n*E\n"})
public final class ScaffoldKt {
    public static final float a;

    static {
        ScaffoldKt.a = 16.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    public static final void Scaffold-TvnljyQ(@Nullable Modifier modifier0, @Nullable Function2 function20, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Function2 function23, int v, long v1, long v2, @Nullable WindowInsets windowInsets0, @NotNull Function3 function30, @Nullable Composer composer0, int v3, int v4) {
        long v10;
        long v9;
        int v8;
        Function2 function27;
        Function2 function26;
        WindowInsets windowInsets1;
        Function2 function25;
        Modifier modifier1;
        boolean z;
        long v14;
        WindowInsets windowInsets2;
        long v12;
        Function2 function211;
        Function2 function210;
        Function2 function29;
        Function2 function28;
        int v11;
        Modifier modifier2;
        long v7;
        int v6;
        Function2 function24;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0xB74F930F);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
            function24 = function20;
        }
        else if((v3 & 0x30) == 0) {
            function24 = function20;
            v5 |= (composer1.changedInstance(function24) ? 0x20 : 16);
        }
        else {
            function24 = function20;
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v3 & 0x180) == 0) {
            v5 |= (composer1.changedInstance(function21) ? 0x100 : 0x80);
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v3 & 0xC00) == 0) {
            v5 |= (composer1.changedInstance(function22) ? 0x800 : 0x400);
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v3 & 0x6000) == 0) {
            v5 |= (composer1.changedInstance(function23) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((v3 & 0x30000) == 0) {
            v5 |= (composer1.changed(v) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x180000) == 0) {
            v6 = v4 & 16;
            v5 |= ((v4 & 0x40) != 0 || !composer1.changed(v1) ? 0x80000 : 0x100000);
        }
        else {
            v6 = v4 & 16;
        }
        if((v3 & 0xC00000) == 0) {
            v7 = v2;
            v5 |= ((v4 & 0x80) != 0 || !composer1.changed(v7) ? 0x400000 : 0x800000);
        }
        else {
            v7 = v2;
        }
        if((v3 & 0x6000000) == 0) {
            v5 |= ((v4 & 0x100) != 0 || !composer1.changed(windowInsets0) ? 0x2000000 : 0x4000000);
        }
        if((v4 & 0x200) != 0) {
            v5 |= 0x30000000;
        }
        else if((v3 & 0x30000000) == 0) {
            v5 |= (composer1.changedInstance(function30) ? 0x20000000 : 0x10000000);
        }
        if((v5 & 306783379) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v4 & 1) == 0 ? modifier0 : Modifier.Companion;
                function28 = (v4 & 2) == 0 ? function24 : ComposableSingletons.ScaffoldKt.INSTANCE.getLambda-1$material3_release();
                function29 = (v4 & 4) == 0 ? function21 : ComposableSingletons.ScaffoldKt.INSTANCE.getLambda-2$material3_release();
                function211 = (v4 & 8) == 0 ? function22 : ComposableSingletons.ScaffoldKt.INSTANCE.getLambda-3$material3_release();
                function210 = v6 == 0 ? function23 : ComposableSingletons.ScaffoldKt.INSTANCE.getLambda-4$material3_release();
                v8 = (v4 & 0x20) == 0 ? v : 2;
                if((v4 & 0x40) == 0) {
                    v11 = v5;
                    v12 = v1;
                }
                else {
                    v11 = v5 & 0xFFC7FFFF;
                    v12 = MaterialTheme.INSTANCE.getColorScheme(composer1, 6).getBackground-0d7_KjU();
                }
                if((v4 & 0x80) != 0) {
                    v7 = ColorSchemeKt.contentColorFor-ek8zF_U(v12, composer1, v11 >> 18 & 14);
                    v11 &= 0xFE3FFFFF;
                }
                if((v4 & 0x100) == 0) {
                    windowInsets2 = windowInsets0;
                }
                else {
                    windowInsets2 = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composer1, 6);
                    v11 &= 0xF1FFFFFF;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 0x40) != 0) {
                    v5 &= 0xFFC7FFFF;
                }
                if((v4 & 0x80) != 0) {
                    v5 &= 0xFE3FFFFF;
                }
                if((v4 & 0x100) != 0) {
                    v5 &= 0xF1FFFFFF;
                }
                modifier2 = modifier0;
                v11 = v5;
                function28 = function24;
                function29 = function21;
                function210 = function23;
                function211 = function22;
                v8 = v;
                v12 = v1;
                windowInsets2 = windowInsets0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB74F930F, v11, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
            }
            int v13 = 0xE000000 & v11 ^ 0x6000000;
            if(v13 > 0x4000000 && composer1.changed(windowInsets2)) {
                v14 = v7;
                z = true;
            }
            else {
                v14 = v7;
                z = (v11 & 0x6000000) == 0x4000000;
            }
            MutableWindowInsets mutableWindowInsets0 = composer1.rememberedValue();
            if(z || mutableWindowInsets0 == Composer.Companion.getEmpty()) {
                mutableWindowInsets0 = new MutableWindowInsets(windowInsets2);
                composer1.updateRememberedValue(mutableWindowInsets0);
            }
            boolean z1 = composer1.changed(mutableWindowInsets0);
            boolean z2 = v13 > 0x4000000 && composer1.changed(windowInsets2) || (0x6000000 & v11) == 0x4000000;
            ji ji0 = composer1.rememberedValue();
            if(z1 || z2 || ji0 == Composer.Companion.getEmpty()) {
                ji0 = new ji(mutableWindowInsets0, windowInsets2, 0);
                composer1.updateRememberedValue(ji0);
            }
            SurfaceKt.Surface-T9BRK9s(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifier2, ji0), null, v12, v14, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(0x8A07B92A, true, new ki(v8, function28, function30, function211, function210, mutableWindowInsets0, function29), composer1, 54), composer1, v11 >> 12 & 0x380 | 0xC00000 | v11 >> 12 & 0x1C00, 0x72);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v10 = v12;
            function26 = function29;
            function25 = function211;
            function27 = function210;
            windowInsets1 = windowInsets2;
            v9 = v14;
            function24 = function28;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            function25 = function22;
            windowInsets1 = windowInsets0;
            function26 = function21;
            function27 = function23;
            v8 = v;
            v9 = v7;
            v10 = v1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new li(modifier1, function24, function26, function25, function27, v8, v10, v9, windowInsets1, function30, v3, v4));
        }
    }

    public static final void access$ScaffoldLayout-FMILGgc(int v, Function2 function20, Function3 function30, Function2 function21, Function2 function22, WindowInsets windowInsets0, Function2 function23, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xC5DADE7A);
        int v2 = (v1 & 6) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= (composer1.changedInstance(function21) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            v2 |= (composer1.changedInstance(function22) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v1) == 0) {
            v2 |= (composer1.changed(windowInsets0) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x180000) == 0) {
            v2 |= (composer1.changedInstance(function23) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x92493) != 0x92492 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC5DADE7A, v2, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:138)");
            }
            oi oi0 = composer1.rememberedValue();
            if((((v2 & 0x70) == 0x20 ? 1 : 0) | ((v2 & 0x1C00) == 0x800 ? 1 : 0) | ((0x70000 & v2) == 0x20000 ? 1 : 0) | ((0xE000 & v2) == 0x4000 ? 1 : 0) | ((v2 & 14) == 4 ? 1 : 0) | ((0x380000 & v2) == 0x100000 ? 1 : 0) | ((v2 & 0x380) == 0x100 ? 1 : 0)) != 0 || oi0 == Composer.Companion.getEmpty()) {
                oi0 = new oi(function20, function21, function22, v, windowInsets0, function23, function30);
                composer1.updateRememberedValue(oi0);
            }
            SubcomposeLayoutKt.SubcomposeLayout(null, oi0, composer1, 0, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new pi(v, function20, function30, function21, function22, windowInsets0, function23, v1));
        }
    }

    public static final float access$getFabSpacing$p() [...] // 潜在的解密器
}

