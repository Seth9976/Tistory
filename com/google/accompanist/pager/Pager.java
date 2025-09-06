package com.google.accompanist.pager;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o6.a;
import o6.b;
import o6.c;
import o6.d;
import o6.g;
import o6.h;
import o6.i;
import o6.k;
import o6.m;
import o6.n;
import o6.o;
import o6.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000l\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\u001A\u00C7\u0001\u0010\u001F\u001A\u00020\u00192\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2%\b\u0002\u0010\u0015\u001A\u001F\u0012\u0013\u0012\u00110\u0000\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00102\b\b\u0002\u0010\u0016\u001A\u00020\u000621\u0010\u001C\u001A-\u0012\u0004\u0012\u00020\u0018\u0012\u0013\u0012\u00110\u0000\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00190\u0017\u00A2\u0006\u0002\b\u001A\u00A2\u0006\u0002\b\u001BH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001D\u0010\u001E\u001A\u00C7\u0001\u0010$\u001A\u00020\u00192\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010!\u001A\u00020 2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2%\b\u0002\u0010\u0015\u001A\u001F\u0012\u0013\u0012\u00110\u0000\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00102\b\b\u0002\u0010\u0016\u001A\u00020\u000621\u0010\u001C\u001A-\u0012\u0004\u0012\u00020\u0018\u0012\u0013\u0012\u00110\u0000\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00190\u0017\u00A2\u0006\u0002\b\u001A\u00A2\u0006\u0002\b\u001BH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\"\u0010#\u001A\u00C9\u0001\u0010(\u001A\u00020\u00192\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010%\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u000E2#\u0010\u0015\u001A\u001F\u0012\u0013\u0012\u00110\u0000\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00102\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0016\u001A\u00020\u00062\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010!\u001A\u00020 21\u0010\u001C\u001A-\u0012\u0004\u0012\u00020\u0018\u0012\u0013\u0012\u00110\u0000\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00190\u0017\u00A2\u0006\u0002\b\u001A\u00A2\u0006\u0002\b\u001BH\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b&\u0010\'\u001A\u001B\u0010*\u001A\u00020)*\u00020\u00182\u0006\u0010\u0013\u001A\u00020\u0000H\u0007\u00A2\u0006\u0004\b*\u0010+\"\u0014\u0010,\u001A\u00020\u00068\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b,\u0010-\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b\u0019\u00A8\u0006."}, d2 = {"", "count", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/google/accompanist/pager/PagerState;", "state", "", "reverseLayout", "Landroidx/compose/ui/unit/Dp;", "itemSpacing", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "page", "", "key", "userScrollEnabled", "Lkotlin/Function2;", "Lcom/google/accompanist/pager/PagerScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "HorizontalPager-7SJ-wSw", "(ILandroidx/compose/ui/Modifier;Lcom/google/accompanist/pager/PagerState;ZFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "HorizontalPager", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "VerticalPager-7SJ-wSw", "(ILandroidx/compose/ui/Modifier;Lcom/google/accompanist/pager/PagerState;ZFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "VerticalPager", "isVertical", "Pager-upBTbn8", "(ILandroidx/compose/ui/Modifier;Lcom/google/accompanist/pager/PagerState;ZFZLandroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "Pager", "", "calculateCurrentOffsetForPage", "(Lcom/google/accompanist/pager/PagerScope;I)F", "DebugLog", "Z", "pager_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "Pager")
@SourceDebugExtension({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\ncom/google/accompanist/pager/Pager\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,580:1\n154#2:581\n154#2:582\n154#2:583\n154#2:584\n1#3:585\n36#4:586\n50#4:593\n49#4:594\n36#4:601\n36#4:608\n67#4,3:616\n66#4:619\n36#4:626\n36#4:633\n83#4,3:640\n83#4,3:649\n1114#5,6:587\n1114#5,6:595\n1114#5,6:602\n1114#5,6:609\n1114#5,6:620\n1114#5,6:627\n1114#5,6:634\n1114#5,6:643\n1114#5,6:652\n76#6:615\n*S KotlinDebug\n*F\n+ 1 Pager.kt\ncom/google/accompanist/pager/Pager\n*L\n275#1:581\n276#1:582\n337#1:583\n338#1:584\n384#1:586\n389#1:593\n389#1:594\n394#1:601\n403#1:608\n409#1:616,3\n409#1:619\n413#1:626\n417#1:633\n435#1:640,3\n464#1:649,3\n384#1:587,6\n389#1:595,6\n394#1:602,6\n403#1:609,6\n409#1:620,6\n413#1:627,6\n417#1:634,6\n435#1:643,6\n464#1:652,6\n408#1:615\n*E\n"})
public final class Pager {
    public static final boolean DebugLog = false;

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Deprecated(message = "\naccompanist/pager is deprecated.\nThe androidx.compose equivalent of HorizontalPager is androidx.compose.foundation.pager.HorizontalPager\nFor more migration information, please visit https://google.github.io/accompanist/pager/#migration\n", replaceWith = @ReplaceWith(expression = "HorizontalPager", imports = {"androidx.compose.foundation.pager.HorizontalPager"}))
    public static final void HorizontalPager-7SJ-wSw(int v, @Nullable Modifier modifier0, @Nullable PagerState pagerState0, boolean z, float f, @Nullable PaddingValues paddingValues0, @Nullable Vertical alignment$Vertical0, @Nullable FlingBehavior flingBehavior0, @Nullable Function1 function10, boolean z1, @NotNull Function4 function40, @Nullable Composer composer0, int v1, int v2, int v3) {
        Function1 function11;
        FlingBehavior flingBehavior1;
        float f1;
        PaddingValues paddingValues2;
        boolean z3;
        PagerState pagerState1;
        Modifier modifier1;
        Vertical alignment$Vertical1;
        boolean z2;
        PaddingValues paddingValues3;
        boolean z5;
        PagerState pagerState2;
        Modifier modifier2;
        Function1 function12;
        FlingBehavior flingBehavior2;
        Vertical alignment$Vertical2;
        float f2;
        boolean z4;
        int v9;
        FlingBehavior flingBehavior3;
        int v8;
        int v7;
        int v6;
        int v5;
        PaddingValues paddingValues1;
        int v4;
        Intrinsics.checkNotNullParameter(function40, "content");
        Composer composer1 = composer0.startRestartGroup(-131850087);
        if((v3 & 1) == 0) {
            v4 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v4 |= ((v3 & 4) != 0 || !composer1.changed(pagerState0) ? 0x80 : 0x100);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v4 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v1 & 0xE000) == 0) {
            v4 |= (composer1.changed(f) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) == 0) {
            paddingValues1 = paddingValues0;
            if((v1 & 0x70000) == 0) {
                v4 |= (composer1.changed(paddingValues1) ? 0x20000 : 0x10000);
            }
        }
        else {
            v4 |= 0x30000;
            paddingValues1 = paddingValues0;
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v1 & 0x380000) == 0) {
            v4 |= (composer1.changed(alignment$Vertical0) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x1C00000) == 0) {
            v4 |= ((v3 & 0x80) != 0 || !composer1.changed(flingBehavior0) ? 0x400000 : 0x800000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
            v5 = v3 & 0x100;
        }
        else if((v1 & 0xE000000) == 0) {
            v5 = v3 & 0x100;
            v4 |= (composer1.changedInstance(function10) ? 0x4000000 : 0x2000000);
        }
        else {
            v5 = v3 & 0x100;
        }
        if((v3 & 0x200) != 0) {
            v4 |= 0x30000000;
            v6 = v3 & 0x200;
        }
        else if((v1 & 0x70000000) == 0) {
            v6 = v3 & 0x200;
            v4 |= (composer1.changed(z1) ? 0x20000000 : 0x10000000);
        }
        else {
            v6 = v3 & 0x200;
        }
        if((v3 & 0x400) == 0) {
            v7 = (v2 & 14) == 0 ? v2 | (composer1.changedInstance(function40) ? 4 : 2) : v2;
        }
        else {
            v7 = v2 | 6;
        }
        if((v4 & 0x5B6DB6DB) != 306783378 || (v7 & 11) != 2 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 4) == 0) {
                    v8 = v4;
                    pagerState2 = pagerState0;
                }
                else {
                    v8 = v4 & -897;
                    pagerState2 = PagerStateKt.rememberPagerState(0, composer1, 0, 1);
                }
                z4 = (v3 & 8) == 0 ? z : false;
                float f3 = (v3 & 16) == 0 ? f : 0.0f;
                if((v3 & 0x20) != 0) {
                    paddingValues1 = PaddingKt.PaddingValues-0680j_4(0.0f);
                }
                Vertical alignment$Vertical3 = (v3 & 0x40) == 0 ? alignment$Vertical0 : Alignment.Companion.getCenterVertically();
                if((v3 & 0x80) == 0) {
                    flingBehavior3 = flingBehavior0;
                    v9 = v8;
                }
                else {
                    float f4 = PaddingKt.calculateEndPadding(paddingValues1, LayoutDirection.Ltr);
                    flingBehavior3 = PagerDefaults.INSTANCE.flingBehavior--jt2gSs(pagerState2, null, null, f4, composer1, v8 >> 6 & 14 | 0x6000, 6);
                    v9 = v8 & 0xFE3FFFFF;
                }
                Function1 function13 = v5 == 0 ? function10 : null;
                if(v6 == 0) {
                    z5 = z1;
                    flingBehavior2 = flingBehavior3;
                    v4 = v9;
                    function12 = function13;
                    f2 = f3;
                    paddingValues3 = paddingValues1;
                    alignment$Vertical2 = alignment$Vertical3;
                }
                else {
                    flingBehavior2 = flingBehavior3;
                    v4 = v9;
                    f2 = f3;
                    paddingValues3 = paddingValues1;
                    alignment$Vertical2 = alignment$Vertical3;
                    z5 = true;
                    function12 = function13;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                if((v3 & 0x80) != 0) {
                    v4 &= 0xFE3FFFFF;
                }
                z4 = z;
                f2 = f;
                alignment$Vertical2 = alignment$Vertical0;
                flingBehavior2 = flingBehavior0;
                function12 = function10;
                modifier2 = modifier0;
                pagerState2 = pagerState0;
                z5 = z1;
                paddingValues3 = paddingValues1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-131850087, v4, v7, "com.google.accompanist.pager.HorizontalPager (Pager.kt:269)");
            }
            Pager.Pager-upBTbn8(v, modifier2, pagerState2, z4, f2, false, flingBehavior2, function12, paddingValues3, z5, alignment$Vertical2, null, function40, composer1, v4 & 14 | 0x30000 | v4 & 0x70 | v4 & 0x380 | v4 & 0x1C00 | 0xE000 & v4 | v4 >> 3 & 0x380000 | v4 >> 3 & 0x1C00000 | v4 << 9 & 0xE000000 | v4 & 0x70000000, v4 >> 18 & 14 | v7 << 6 & 0x380, 0x800);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f1 = f2;
            modifier1 = modifier2;
            paddingValues2 = paddingValues3;
            alignment$Vertical1 = alignment$Vertical2;
            pagerState1 = pagerState2;
            flingBehavior1 = flingBehavior2;
            z2 = z4;
            function11 = function12;
            z3 = z5;
        }
        else {
            composer1.skipToGroupEnd();
            z2 = z;
            alignment$Vertical1 = alignment$Vertical0;
            modifier1 = modifier0;
            pagerState1 = pagerState0;
            z3 = z1;
            paddingValues2 = paddingValues1;
            f1 = f;
            flingBehavior1 = flingBehavior0;
            function11 = function10;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b(v, modifier1, pagerState1, z2, f1, paddingValues2, alignment$Vertical1, flingBehavior1, function11, z3, function40, v1, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Pager-upBTbn8(int v, @NotNull Modifier modifier0, @NotNull PagerState pagerState0, boolean z, float f, boolean z1, @NotNull FlingBehavior flingBehavior0, @Nullable Function1 function10, @NotNull PaddingValues paddingValues0, boolean z2, @Nullable Vertical alignment$Vertical0, @Nullable Horizontal alignment$Horizontal0, @NotNull Function4 function40, @Nullable Composer composer0, int v1, int v2, int v3) {
        int v13;
        Horizontal alignment$Horizontal3;
        Vertical alignment$Vertical3;
        int v10;
        Horizontal alignment$Horizontal1;
        Vertical alignment$Vertical1;
        int v8;
        int v5;
        Intrinsics.checkNotNullParameter(modifier0, "modifier");
        Intrinsics.checkNotNullParameter(pagerState0, "state");
        Intrinsics.checkNotNullParameter(flingBehavior0, "flingBehavior");
        Intrinsics.checkNotNullParameter(paddingValues0, "contentPadding");
        Intrinsics.checkNotNullParameter(function40, "content");
        Composer composer1 = composer0.startRestartGroup(-1072219707);
        int v4 = 4;
        if((v3 & 1) == 0) {
            v5 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        }
        else {
            v5 = v1 | 6;
        }
        int v6 = 16;
        if((v3 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        int v7 = 0x80;
        if((v3 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v5 |= (composer1.changed(pagerState0) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v5 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v1 & 0xE000) == 0) {
            v5 |= (composer1.changed(f) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((v1 & 0x70000) == 0) {
            v5 |= (composer1.changed(z1) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v1 & 0x380000) == 0) {
            v5 |= (composer1.changed(flingBehavior0) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v1 & 0x1C00000) == 0) {
            v5 |= (composer1.changedInstance(function10) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((0xE000000 & v1) == 0) {
            v5 |= (composer1.changed(paddingValues0) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x200) != 0) {
            v5 |= 0x30000000;
        }
        else if((0x70000000 & v1) == 0) {
            v5 |= (composer1.changed(z2) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 0x400) != 0) {
            v8 = v2 | 6;
        }
        else if((v2 & 14) == 0) {
            if(!composer1.changed(alignment$Vertical0)) {
                v4 = 2;
            }
            v8 = v2 | v4;
        }
        else {
            v8 = v2;
        }
        if((v3 & 0x800) != 0) {
            v8 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            if(composer1.changed(alignment$Horizontal0)) {
                v6 = 0x20;
            }
            v8 |= v6;
        }
        int v9 = v8;
        if((v3 & 0x1000) != 0) {
            v9 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            if(composer1.changedInstance(function40)) {
                v7 = 0x100;
            }
            v9 |= v7;
        }
        if((0x5B6DB6DB & v5) == 306783378 && (v9 & 731) == 0x92 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
            alignment$Vertical1 = alignment$Vertical0;
            alignment$Horizontal1 = alignment$Horizontal0;
        }
        else {
            Vertical alignment$Vertical2 = (v3 & 0x400) == 0 ? alignment$Vertical0 : Alignment.Companion.getCenterVertically();
            Horizontal alignment$Horizontal2 = (v3 & 0x800) == 0 ? alignment$Horizontal0 : Alignment.Companion.getCenterHorizontally();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1072219707, v5, v9, "com.google.accompanist.pager.Pager (Pager.kt:364)");
            }
            if(v < 0) {
                throw new IllegalArgumentException("pageCount must be >= 0");
            }
            composer1.startReplaceableGroup(0x44FAF204);
            boolean z3 = composer1.changed(flingBehavior0);
            c c0 = composer1.rememberedValue();
            if(z3) {
                v10 = v5 >> 18;
                c0 = new c(flingBehavior0);
                composer1.updateRememberedValue(c0);
            }
            else {
                v10 = v5 >> 18;
                if(c0 == Composer.Companion.getEmpty()) {
                    c0 = new c(flingBehavior0);
                    composer1.updateRememberedValue(c0);
                }
            }
            composer1.endReplaceableGroup();
            pagerState0.setFlingAnimationTarget$pager_release(c0);
            Integer integer0 = v;
            composer1.startReplaceableGroup(0x1E7B2B64);
            boolean z4 = composer1.changed(pagerState0);
            boolean z5 = composer1.changed(v);
            d d0 = composer1.rememberedValue();
            if(z5 || z4 || d0 == Composer.Companion.getEmpty()) {
                d0 = new d(pagerState0, v, null);
                composer1.updateRememberedValue(d0);
            }
            composer1.endReplaceableGroup();
            EffectsKt.LaunchedEffect(integer0, d0, composer1, v5 & 14 | 0x40);
            composer1.startReplaceableGroup(0x44FAF204);
            boolean z6 = composer1.changed(pagerState0);
            g g0 = composer1.rememberedValue();
            if(z6 || g0 == Composer.Companion.getEmpty()) {
                g0 = new g(pagerState0, null);
                composer1.updateRememberedValue(g0);
            }
            composer1.endReplaceableGroup();
            int v11 = v5 >> 6 & 14 | 0x40;
            EffectsKt.LaunchedEffect(pagerState0, g0, composer1, v11);
            composer1.startReplaceableGroup(0x44FAF204);
            boolean z7 = composer1.changed(pagerState0);
            h h0 = composer1.rememberedValue();
            if(z7 || h0 == Composer.Companion.getEmpty()) {
                h0 = new h(pagerState0, null);
                composer1.updateRememberedValue(h0);
            }
            composer1.endReplaceableGroup();
            EffectsKt.LaunchedEffect(pagerState0, h0, composer1, v11);
            Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            Dp dp0 = Dp.box-impl(f);
            Dp dp1 = Dp.box-impl(f);
            composer1.startReplaceableGroup(0x607FB4C4);
            boolean z8 = composer1.changed(density0);
            boolean z9 = composer1.changed(pagerState0);
            boolean z10 = composer1.changed(dp1);
            i i0 = composer1.rememberedValue();
            if((z10 | (z8 | z9)) != 0 || i0 == Composer.Companion.getEmpty()) {
                i0 = new i(density0, pagerState0, f, null);
                composer1.updateRememberedValue(i0);
            }
            composer1.endReplaceableGroup();
            EffectsKt.LaunchedEffect(density0, pagerState0, dp0, i0, composer1, v5 >> 3 & 0x70 | 0x1000 | v5 >> 6 & 0x380);
            composer1.startReplaceableGroup(0x44FAF204);
            boolean z11 = composer1.changed(pagerState0);
            r r0 = composer1.rememberedValue();
            if(z11 || r0 == Composer.Companion.getEmpty()) {
                r0 = new r(pagerState0);
                composer1.updateRememberedValue(r0);
            }
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0x44FAF204);
            boolean z12 = composer1.changed(Boolean.valueOf(z1));
            a a0 = composer1.rememberedValue();
            if(z12 || a0 == Composer.Companion.getEmpty()) {
                a0 = new a(!z1, z1, pagerState0);
                composer1.updateRememberedValue(a0);
            }
            composer1.endReplaceableGroup();
            int v12 = 0;
            if(z1) {
                composer1.startReplaceableGroup(-510388635);
                LazyListState lazyListState0 = pagerState0.getLazyListState$pager_release();
                androidx.compose.foundation.layout.Arrangement.Vertical arrangement$Vertical0 = Arrangement.INSTANCE.spacedBy-D5KLDUw(f, alignment$Vertical2);
                Object[] arr_object = {v, function10, a0, function40, r0};
                composer1.startReplaceableGroup(0xDE219177);
                boolean z13 = false;
                while(v12 < 5) {
                    z13 |= composer1.changed(arr_object[v12]);
                    ++v12;
                }
                k k0 = composer1.rememberedValue();
                if(z13 || k0 == Composer.Companion.getEmpty()) {
                    alignment$Vertical3 = alignment$Vertical2;
                    k k1 = new k(v, function10, a0, function40, r0, v9);
                    composer1.updateRememberedValue(k1);
                    k0 = k1;
                }
                else {
                    alignment$Vertical3 = alignment$Vertical2;
                }
                composer1.endReplaceableGroup();
                LazyDslKt.LazyColumn(modifier0, lazyListState0, paddingValues0, z, arrangement$Vertical0, alignment$Horizontal2, flingBehavior0, z2, k0, composer1, v5 >> 3 & 14 | v10 & 0x380 | v5 & 0x1C00 | v9 << 12 & 0x70000 | v5 & 0x380000 | v5 >> 6 & 0x1C00000, 0);
                composer1.endReplaceableGroup();
                alignment$Horizontal3 = alignment$Horizontal2;
            }
            else {
                alignment$Vertical3 = alignment$Vertical2;
                composer1.startReplaceableGroup(-510387428);
                LazyListState lazyListState1 = pagerState0.getLazyListState$pager_release();
                androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal0 = Arrangement.INSTANCE.spacedBy-D5KLDUw(f, alignment$Horizontal2);
                Object[] arr_object1 = {v, function10, a0, function40, r0};
                composer1.startReplaceableGroup(0xDE219177);
                boolean z14 = false;
                while(v12 < 5) {
                    z14 |= composer1.changed(arr_object1[v12]);
                    ++v12;
                }
                m m0 = composer1.rememberedValue();
                if(z14 || m0 == Composer.Companion.getEmpty()) {
                    v13 = v5;
                    m0 = new m(v, function10, a0, function40, r0, v9);
                    composer1.updateRememberedValue(m0);
                }
                else {
                    v13 = v5;
                }
                composer1.endReplaceableGroup();
                alignment$Horizontal3 = alignment$Horizontal2;
                LazyDslKt.LazyRow(modifier0, lazyListState1, paddingValues0, z, arrangement$Horizontal0, alignment$Vertical3, flingBehavior0, z2, m0, composer1, v5 >> 3 & 14 | v10 & 0x380 | v13 & 0x1C00 | v9 << 15 & 0x70000 | v13 & 0x380000 | v5 >> 6 & 0x1C00000, 0);
                composer1.endReplaceableGroup();
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            alignment$Horizontal1 = alignment$Horizontal3;
            alignment$Vertical1 = alignment$Vertical3;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n(v, modifier0, pagerState0, z, f, z1, flingBehavior0, function10, paddingValues0, z2, alignment$Vertical1, alignment$Horizontal1, function40, v1, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Deprecated(message = "\naccompanist/pager is deprecated.\nThe androidx.compose equivalent of VerticalPager is androidx.compose.foundation.pager.VerticalPager.\nFor more migration information, please visit https://google.github.io/accompanist/pager/#migration\n")
    public static final void VerticalPager-7SJ-wSw(int v, @Nullable Modifier modifier0, @Nullable PagerState pagerState0, boolean z, float f, @Nullable PaddingValues paddingValues0, @Nullable Horizontal alignment$Horizontal0, @Nullable FlingBehavior flingBehavior0, @Nullable Function1 function10, boolean z1, @NotNull Function4 function40, @Nullable Composer composer0, int v1, int v2, int v3) {
        Function1 function11;
        FlingBehavior flingBehavior1;
        float f1;
        PaddingValues paddingValues2;
        boolean z3;
        PagerState pagerState1;
        Modifier modifier1;
        Horizontal alignment$Horizontal1;
        boolean z2;
        PaddingValues paddingValues3;
        boolean z5;
        PagerState pagerState2;
        Modifier modifier2;
        Function1 function12;
        FlingBehavior flingBehavior2;
        Horizontal alignment$Horizontal2;
        float f2;
        boolean z4;
        int v9;
        FlingBehavior flingBehavior3;
        int v8;
        int v7;
        int v6;
        int v5;
        PaddingValues paddingValues1;
        int v4;
        Intrinsics.checkNotNullParameter(function40, "content");
        Composer composer1 = composer0.startRestartGroup(0x134ED9B5);
        if((v3 & 1) == 0) {
            v4 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v4 |= ((v3 & 4) != 0 || !composer1.changed(pagerState0) ? 0x80 : 0x100);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v4 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v1 & 0xE000) == 0) {
            v4 |= (composer1.changed(f) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) == 0) {
            paddingValues1 = paddingValues0;
            if((v1 & 0x70000) == 0) {
                v4 |= (composer1.changed(paddingValues1) ? 0x20000 : 0x10000);
            }
        }
        else {
            v4 |= 0x30000;
            paddingValues1 = paddingValues0;
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v1 & 0x380000) == 0) {
            v4 |= (composer1.changed(alignment$Horizontal0) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x1C00000) == 0) {
            v4 |= ((v3 & 0x80) != 0 || !composer1.changed(flingBehavior0) ? 0x400000 : 0x800000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
            v5 = v3 & 0x100;
        }
        else if((v1 & 0xE000000) == 0) {
            v5 = v3 & 0x100;
            v4 |= (composer1.changedInstance(function10) ? 0x4000000 : 0x2000000);
        }
        else {
            v5 = v3 & 0x100;
        }
        if((v3 & 0x200) != 0) {
            v4 |= 0x30000000;
            v6 = v3 & 0x200;
        }
        else if((v1 & 0x70000000) == 0) {
            v6 = v3 & 0x200;
            v4 |= (composer1.changed(z1) ? 0x20000000 : 0x10000000);
        }
        else {
            v6 = v3 & 0x200;
        }
        if((v3 & 0x400) == 0) {
            v7 = (v2 & 14) == 0 ? v2 | (composer1.changedInstance(function40) ? 4 : 2) : v2;
        }
        else {
            v7 = v2 | 6;
        }
        if((v4 & 0x5B6DB6DB) != 306783378 || (v7 & 11) != 2 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 4) == 0) {
                    v8 = v4;
                    pagerState2 = pagerState0;
                }
                else {
                    v8 = v4 & -897;
                    pagerState2 = PagerStateKt.rememberPagerState(0, composer1, 0, 1);
                }
                z4 = (v3 & 8) == 0 ? z : false;
                float f3 = (v3 & 16) == 0 ? f : 0.0f;
                if((v3 & 0x20) != 0) {
                    paddingValues1 = PaddingKt.PaddingValues-0680j_4(0.0f);
                }
                Horizontal alignment$Horizontal3 = (v3 & 0x40) == 0 ? alignment$Horizontal0 : Alignment.Companion.getCenterHorizontally();
                if((v3 & 0x80) == 0) {
                    flingBehavior3 = flingBehavior0;
                    v9 = v8;
                }
                else {
                    float f4 = paddingValues1.calculateBottomPadding-D9Ej5fM();
                    flingBehavior3 = PagerDefaults.INSTANCE.flingBehavior--jt2gSs(pagerState2, null, null, f4, composer1, v8 >> 6 & 14 | 0x6000, 6);
                    v9 = v8 & 0xFE3FFFFF;
                }
                Function1 function13 = v5 == 0 ? function10 : null;
                if(v6 == 0) {
                    z5 = z1;
                    flingBehavior2 = flingBehavior3;
                    v4 = v9;
                    function12 = function13;
                    f2 = f3;
                    paddingValues3 = paddingValues1;
                    alignment$Horizontal2 = alignment$Horizontal3;
                }
                else {
                    flingBehavior2 = flingBehavior3;
                    v4 = v9;
                    f2 = f3;
                    paddingValues3 = paddingValues1;
                    alignment$Horizontal2 = alignment$Horizontal3;
                    z5 = true;
                    function12 = function13;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                if((v3 & 0x80) != 0) {
                    v4 &= 0xFE3FFFFF;
                }
                z4 = z;
                f2 = f;
                alignment$Horizontal2 = alignment$Horizontal0;
                flingBehavior2 = flingBehavior0;
                function12 = function10;
                modifier2 = modifier0;
                pagerState2 = pagerState0;
                z5 = z1;
                paddingValues3 = paddingValues1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x134ED9B5, v4, v7, "com.google.accompanist.pager.VerticalPager (Pager.kt:331)");
            }
            Pager.Pager-upBTbn8(v, modifier2, pagerState2, z4, f2, true, flingBehavior2, function12, paddingValues3, z5, null, alignment$Horizontal2, function40, composer1, v4 & 14 | 0x30000 | v4 & 0x70 | v4 & 0x380 | v4 & 0x1C00 | 0xE000 & v4 | v4 >> 3 & 0x380000 | v4 >> 3 & 0x1C00000 | v4 << 9 & 0xE000000 | v4 & 0x70000000, v4 >> 15 & 0x70 | v7 << 6 & 0x380, 0x400);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f1 = f2;
            modifier1 = modifier2;
            paddingValues2 = paddingValues3;
            alignment$Horizontal1 = alignment$Horizontal2;
            pagerState1 = pagerState2;
            flingBehavior1 = flingBehavior2;
            z2 = z4;
            function11 = function12;
            z3 = z5;
        }
        else {
            composer1.skipToGroupEnd();
            z2 = z;
            alignment$Horizontal1 = alignment$Horizontal0;
            modifier1 = modifier0;
            pagerState1 = pagerState0;
            z3 = z1;
            paddingValues2 = paddingValues1;
            f1 = f;
            flingBehavior1 = flingBehavior0;
            function11 = function10;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o(v, modifier1, pagerState1, z2, f1, paddingValues2, alignment$Horizontal1, flingBehavior1, function11, z3, function40, v1, v2, v3));
        }
    }

    public static final long access$consume-9KIMszo(long v, boolean z, boolean z1) {
        float f = 0.0f;
        float f1 = z ? Offset.getX-impl(v) : 0.0f;
        if(z1) {
            f = Offset.getY-impl(v);
        }
        return OffsetKt.Offset(f1, f);
    }

    public static final long access$consume-BMRW4eQ(long v, boolean z, boolean z1) {
        float f = 0.0f;
        float f1 = z ? Velocity.getX-impl(v) : 0.0f;
        if(z1) {
            f = Velocity.getY-impl(v);
        }
        return VelocityKt.Velocity(f1, f);
    }

    @Deprecated(message = "\naccompanist/pager is deprecated.\nThe androidx.compose equivalent of Pager is androidx.compose.foundation.pager.Pager.\nFor more migration information, please visit https://google.github.io/accompanist/pager/#migration\n")
    public static final float calculateCurrentOffsetForPage(@NotNull PagerScope pagerScope0, int v) {
        Intrinsics.checkNotNullParameter(pagerScope0, "<this>");
        int v1 = pagerScope0.getCurrentPage();
        return pagerScope0.getCurrentPageOffset() + ((float)(v1 - v));
    }
}

