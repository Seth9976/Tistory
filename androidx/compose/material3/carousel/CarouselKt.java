package androidx.compose.material3.carousel;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.x1;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v0.c;
import v0.d;
import v0.e;
import v0.f;
import v0.g;
import v0.h;
import v0.l;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A\u0091\u0001\u0010\u0019\u001A\u00020\u00132\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\u000B21\u0010\u0016\u001A-\u0012\u0004\u0012\u00020\u000E\u0012\u0013\u0012\u00110\u000F\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\r\u00A2\u0006\u0002\b\u0014\u00A2\u0006\u0002\b\u0015H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0018\u001A}\u0010\u001D\u001A\u00020\u00132\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u001A\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\f\u001A\u00020\u000B21\u0010\u0016\u001A-\u0012\u0004\u0012\u00020\u000E\u0012\u0013\u0012\u00110\u000F\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\r\u00A2\u0006\u0002\b\u0014\u00A2\u0006\u0002\b\u0015H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001C\u001A\u00BB\u0001\u0010\'\u001A\u00020\u00132\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u001F\u001A\u00020\u001E26\u0010#\u001A2\u0012\u0013\u0012\u00110 \u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110 \u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\"0\r2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010$\u001A\u00020\u000F2\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u000721\u0010\u0016\u001A-\u0012\u0004\u0012\u00020\u000E\u0012\u0013\u0012\u00110\u000F\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\r\u00A2\u0006\u0002\b\u0014\u00A2\u0006\u0002\b\u0015H\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010&\u001AA\u00100\u001A\u00020\u0004*\u00020\u00042\u0006\u0010(\u001A\u00020\u000F2\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010+\u001A\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010-\u001A\u00020,2\u0006\u0010/\u001A\u00020.H\u0000\u00A2\u0006\u0004\b0\u00101\u001A\u001F\u00102\u001A\u00020 2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010+\u001A\u00020*H\u0000\u00A2\u0006\u0004\b2\u00103\u001A\u001F\u00104\u001A\u00020 2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010+\u001A\u00020*H\u0001\u00A2\u0006\u0004\b4\u00103\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00065"}, d2 = {"Landroidx/compose/material3/carousel/CarouselState;", "state", "Landroidx/compose/ui/unit/Dp;", "preferredItemWidth", "Landroidx/compose/ui/Modifier;", "modifier", "itemSpacing", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "flingBehavior", "minSmallItemWidth", "maxSmallItemWidth", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Lkotlin/Function2;", "Landroidx/compose/material3/carousel/CarouselItemScope;", "", "Lkotlin/ParameterName;", "name", "itemIndex", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "HorizontalMultiBrowseCarousel-zCIJ0Nk", "(Landroidx/compose/material3/carousel/CarouselState;FLandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;FFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "HorizontalMultiBrowseCarousel", "itemWidth", "HorizontalUncontainedCarousel-9QcgTRs", "(Landroidx/compose/material3/carousel/CarouselState;FLandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "HorizontalUncontainedCarousel", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "availableSpace", "Landroidx/compose/material3/carousel/KeylineList;", "keylineList", "maxNonFocalVisibleItemCount", "Carousel-V-95POc", "(Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;ILandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "Carousel", "index", "Lkotlin/Function0;", "Landroidx/compose/material3/carousel/Strategy;", "strategy", "Landroidx/compose/material3/carousel/CarouselItemInfoImpl;", "carouselItemInfo", "Landroidx/compose/ui/graphics/Shape;", "clipShape", "carouselItem", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/material3/carousel/CarouselState;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/carousel/CarouselItemInfoImpl;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "calculateCurrentScrollOffset", "(Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/material3/carousel/Strategy;)F", "calculateMaxScrollOffset", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCarousel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Carousel.kt\nandroidx/compose/material3/carousel/CarouselKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,693:1\n148#2:694\n148#2:695\n148#2:703\n148#2:704\n148#2:712\n77#3:696\n77#3:705\n77#3:719\n77#3:720\n77#3:721\n77#3:722\n77#3:724\n77#3:725\n1223#4,6:697\n1223#4,6:706\n1223#4,6:713\n1#5:723\n*S KotlinDebug\n*F\n+ 1 Carousel.kt\nandroidx/compose/material3/carousel/CarouselKt\n*L\n105#1:694\n110#1:695\n175#1:703\n177#1:704\n238#1:712\n113#1:696\n180#1:705\n301#1:719\n302#1:720\n347#1:721\n350#1:722\n359#1:724\n362#1:725\n117#1:697,6\n184#1:706,6\n246#1:713,6\n*E\n"})
public final class CarouselKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Carousel-V-95POc(@NotNull CarouselState carouselState0, @NotNull Orientation orientation0, @NotNull Function2 function20, @NotNull PaddingValues paddingValues0, int v, @Nullable Modifier modifier0, float f, @Nullable TargetedFlingBehavior targetedFlingBehavior0, @NotNull Function4 function40, @Nullable Composer composer0, int v1, int v2) {
        float f2;
        Modifier modifier1;
        TargetedFlingBehavior targetedFlingBehavior2;
        boolean z;
        Modifier modifier2;
        int v4;
        TargetedFlingBehavior targetedFlingBehavior1;
        float f1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(-2035733443);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (composer1.changedInstance(carouselState0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (composer1.changed(orientation0) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            v3 |= (composer1.changed(paddingValues0) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v1 & 0x6000) == 0) {
            v3 |= (composer1.changed(v) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((0x30000 & v1) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
            f1 = f;
        }
        else if((0x180000 & v1) == 0) {
            f1 = f;
            v3 |= (composer1.changed(f1) ? 0x100000 : 0x80000);
        }
        else {
            f1 = f;
        }
        if((v1 & 0xC00000) == 0) {
            if((v2 & 0x80) == 0) {
                targetedFlingBehavior1 = targetedFlingBehavior0;
                v4 = composer1.changed(targetedFlingBehavior1) ? 0x800000 : 0x400000;
            }
            else {
                targetedFlingBehavior1 = targetedFlingBehavior0;
                v4 = 0x400000;
            }
            v3 |= v4;
        }
        else {
            targetedFlingBehavior1 = targetedFlingBehavior0;
        }
        if((v2 & 0x100) != 0) {
            v3 |= 0x6000000;
        }
        else if((v1 & 0x6000000) == 0) {
            v3 |= (composer1.changedInstance(function40) ? 0x4000000 : 0x2000000);
        }
        int v5 = v3;
        if((0x2492493 & v5) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v2 & 0x20) == 0 ? modifier0 : Modifier.Companion;
                if((v2 & 0x80) == 0) {
                    z = false;
                    targetedFlingBehavior2 = targetedFlingBehavior1;
                }
                else {
                    z = false;
                    TargetedFlingBehavior targetedFlingBehavior3 = CarouselDefaults.INSTANCE.singleAdvanceFlingBehavior(carouselState0, null, composer1, v5 & 14 | 0x180, 2);
                    v5 &= 0xFE3FFFFF;
                    targetedFlingBehavior2 = targetedFlingBehavior3;
                }
                modifier2 = modifier3;
                f1 = (v2 & 0x40) == 0 ? f1 : 0.0f;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x80) != 0) {
                    v5 &= 0xFE3FFFFF;
                }
                modifier2 = modifier0;
                z = false;
                targetedFlingBehavior2 = targetedFlingBehavior1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2035733443, v5, -1, "androidx.compose.material3.carousel.Carousel (Carousel.kt:241)");
            }
            int v6 = v5 >> 9 & 14 | v5 & 0x70;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x710F78B3, v6, -1, "androidx.compose.material3.carousel.calculateBeforeContentPadding (Carousel.kt:341)");
            }
            composer1.startReplaceGroup(0x11A20459);
            Orientation orientation1 = Orientation.Vertical;
            float f3 = orientation0 == orientation1 ? paddingValues0.calculateTopPadding-D9Ej5fM() : PaddingKt.calculateStartPadding(paddingValues0, ((LayoutDirection)composer1.consume(CompositionLocalsKt.getLocalLayoutDirection())));
            composer1.endReplaceGroup();
            float f4 = ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toPx-0680j_4(f3);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x3CB506D0, v6, -1, "androidx.compose.material3.carousel.calculateAfterContentPadding (Carousel.kt:353)");
            }
            composer1.startReplaceGroup(0xDCF9AF81);
            float f5 = orientation0 == orientation1 ? paddingValues0.calculateBottomPadding-D9Ej5fM() : PaddingKt.calculateEndPadding(paddingValues0, ((LayoutDirection)composer1.consume(CompositionLocalsKt.getLocalLayoutDirection())));
            composer1.endReplaceGroup();
            float f6 = ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toPx-0680j_4(f5);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            if((v5 & 0x380) == 0x100) {
                z = true;
            }
            CarouselPageSize carouselPageSize0 = composer1.rememberedValue();
            if(z || carouselPageSize0 == Composer.Companion.getEmpty()) {
                carouselPageSize0 = new CarouselPageSize(function20, f4, f6);
                composer1.updateRememberedValue(carouselPageSize0);
            }
            SnapPosition snapPosition0 = KeylineSnapPositionKt.KeylineSnapPosition(carouselPageSize0);
            if(orientation0 == Orientation.Horizontal) {
                composer1.startReplaceGroup(0x9F85505C);
                PagerKt.HorizontalPager-oI3XNZo(carouselState0.getPagerState$material3_release(), modifier2, PaddingKt.PaddingValues-a9UjIt4$default(0.0f, paddingValues0.calculateTopPadding-D9Ej5fM(), 0.0f, paddingValues0.calculateBottomPadding-D9Ej5fM(), 5, null), carouselPageSize0, v, f1, null, targetedFlingBehavior2, false, false, null, null, snapPosition0, ComposableLambdaKt.rememberComposableLambda(0x28F47C20, true, new c(carouselState0, carouselPageSize0, function40), composer1, 54), composer1, v5 >> 12 & 0x70 | 0xE000 & v5 | v5 >> 3 & 0x70000 | 0x1C00000 & v5, 0xC00, 0xF40);
            }
            else if(orientation0 == orientation1) {
                composer1.startReplaceGroup(0x9F9F2968);
                PagerKt.VerticalPager-oI3XNZo(carouselState0.getPagerState$material3_release(), modifier2, PaddingKt.PaddingValues-a9UjIt4$default(PaddingKt.calculateStartPadding(paddingValues0, ((LayoutDirection)composer1.consume(CompositionLocalsKt.getLocalLayoutDirection()))), 0.0f, PaddingKt.calculateEndPadding(paddingValues0, ((LayoutDirection)composer1.consume(CompositionLocalsKt.getLocalLayoutDirection()))), 0.0f, 10, null), carouselPageSize0, v, f1, null, targetedFlingBehavior2, false, false, null, null, snapPosition0, ComposableLambdaKt.rememberComposableLambda(-817308503, true, new d(carouselState0, carouselPageSize0, function40), composer1, 54), composer1, v5 >> 12 & 0x70 | 0xE000 & v5 | v5 >> 3 & 0x70000 | 0x1C00000 & v5, 0xC00, 0xF40);
            }
            else {
                composer1.startReplaceGroup(0x9FB84057);
            }
            composer1.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            targetedFlingBehavior1 = targetedFlingBehavior2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        f2 = f1;
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e(carouselState0, orientation0, function20, paddingValues0, v, modifier1, f2, targetedFlingBehavior1, function40, v1, v2));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void HorizontalMultiBrowseCarousel-zCIJ0Nk(@NotNull CarouselState carouselState0, float f, @Nullable Modifier modifier0, float f1, @Nullable TargetedFlingBehavior targetedFlingBehavior0, float f2, float f3, @Nullable PaddingValues paddingValues0, @NotNull Function4 function40, @Nullable Composer composer0, int v, int v1) {
        float f8;
        float f7;
        PaddingValues paddingValues1;
        Modifier modifier1;
        PaddingValues paddingValues2;
        TargetedFlingBehavior targetedFlingBehavior2;
        float f9;
        Modifier modifier2;
        float f6;
        float f5;
        int v3;
        TargetedFlingBehavior targetedFlingBehavior1;
        float f4;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-1825706865);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(carouselState0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            f4 = f1;
        }
        else if((v & 0xC00) == 0) {
            f4 = f1;
            v2 |= (composer1.changed(f4) ? 0x800 : 0x400);
        }
        else {
            f4 = f1;
        }
        if((v & 0x6000) == 0) {
            if((v1 & 16) == 0) {
                targetedFlingBehavior1 = targetedFlingBehavior0;
                v3 = composer1.changed(targetedFlingBehavior1) ? 0x4000 : 0x2000;
            }
            else {
                targetedFlingBehavior1 = targetedFlingBehavior0;
                v3 = 0x2000;
            }
            v2 |= v3;
        }
        else {
            targetedFlingBehavior1 = targetedFlingBehavior0;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
            f5 = f2;
        }
        else if((0x30000 & v) == 0) {
            f5 = f2;
            v2 |= (composer1.changed(f5) ? 0x20000 : 0x10000);
        }
        else {
            f5 = f2;
        }
        if((v1 & 0x40) == 0) {
            f6 = f3;
            if((v & 0x180000) == 0) {
                v2 |= (composer1.changed(f6) ? 0x100000 : 0x80000);
            }
        }
        else {
            v2 |= 0x180000;
            f6 = f3;
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changed(paddingValues0) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v2 |= (composer1.changedInstance(function40) ? 0x4000000 : 0x2000000);
        }
        int v4 = v2;
        if((v4 & 0x2492493) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
                f9 = (v1 & 8) == 0 ? f4 : 0.0f;
                if((v1 & 16) != 0) {
                    TargetedFlingBehavior targetedFlingBehavior3 = CarouselDefaults.INSTANCE.singleAdvanceFlingBehavior(carouselState0, null, composer1, v4 & 14 | 0x180, 2);
                    v4 &= 0xFFFF1FFF;
                    targetedFlingBehavior1 = targetedFlingBehavior3;
                }
                if((v1 & 0x20) != 0) {
                    f5 = 40.0f;
                }
                if((v1 & 0x40) != 0) {
                    f6 = 56.0f;
                }
                if((v1 & 0x80) == 0) {
                    targetedFlingBehavior2 = targetedFlingBehavior1;
                    paddingValues2 = paddingValues0;
                }
                else {
                    paddingValues2 = PaddingKt.PaddingValues-0680j_4(0.0f);
                    targetedFlingBehavior2 = targetedFlingBehavior1;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 16) != 0) {
                    v4 &= 0xFFFF1FFF;
                }
                modifier2 = modifier0;
                f9 = f4;
                targetedFlingBehavior2 = targetedFlingBehavior1;
                paddingValues2 = paddingValues0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1825706865, v4, -1, "androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel (Carousel.kt:111)");
            }
            Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            Orientation orientation0 = Orientation.Horizontal;
            boolean z = composer1.changed(density0);
            int v5 = 1;
            boolean z1 = composer1.changedInstance(carouselState0);
            if((0x380000 & v4) != 0x100000) {
                v5 = 0;
            }
            f f10 = composer1.rememberedValue();
            if((z | (v4 & 0x70) == 0x20 | z1 | ((v4 & 0x70000) == 0x20000 ? 1 : 0) | v5) != 0 || f10 == Composer.Companion.getEmpty()) {
                f10 = new f(density0, f, carouselState0, f5, f6);
                composer1.updateRememberedValue(f10);
            }
            CarouselKt.Carousel-V-95POc(carouselState0, orientation0, f10, paddingValues2, 2, modifier2, f9, targetedFlingBehavior2, function40, composer1, v4 & 14 | 0x6030 | v4 >> 12 & 0x1C00 | 0x70000 & v4 << 9 | 0x380000 & v4 << 9 | v4 << 9 & 0x1C00000 | v4 & 0xE000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            targetedFlingBehavior1 = targetedFlingBehavior2;
            f8 = f5;
            f7 = f6;
            modifier1 = modifier2;
            f4 = f9;
            paddingValues1 = paddingValues2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            paddingValues1 = paddingValues0;
            f7 = f6;
            f8 = f5;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(carouselState0, f, modifier1, f4, targetedFlingBehavior1, f8, f7, paddingValues1, function40, v, v1));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void HorizontalUncontainedCarousel-9QcgTRs(@NotNull CarouselState carouselState0, float f, @Nullable Modifier modifier0, float f1, @Nullable TargetedFlingBehavior targetedFlingBehavior0, @Nullable PaddingValues paddingValues0, @NotNull Function4 function40, @Nullable Composer composer0, int v, int v1) {
        PaddingValues paddingValues1;
        TargetedFlingBehavior targetedFlingBehavior2;
        float f3;
        boolean z;
        PaddingValues paddingValues2;
        TargetedFlingBehavior targetedFlingBehavior3;
        int v4;
        int v3;
        TargetedFlingBehavior targetedFlingBehavior1;
        float f2;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x1F8CD358);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(carouselState0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(f) ? 0x20 : 16);
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
            f2 = f1;
        }
        else if((v & 0xC00) == 0) {
            f2 = f1;
            v2 |= (composer1.changed(f2) ? 0x800 : 0x400);
        }
        else {
            f2 = f1;
        }
        if((v & 0x6000) == 0) {
            if((v1 & 16) == 0) {
                targetedFlingBehavior1 = targetedFlingBehavior0;
                v3 = composer1.changed(targetedFlingBehavior1) ? 0x4000 : 0x2000;
            }
            else {
                targetedFlingBehavior1 = targetedFlingBehavior0;
                v3 = 0x2000;
            }
            v2 |= v3;
        }
        else {
            targetedFlingBehavior1 = targetedFlingBehavior0;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x30000 & v) == 0) {
            v2 |= (composer1.changed(paddingValues0) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (composer1.changedInstance(function40) ? 0x100000 : 0x80000);
        }
        if((0x92493 & v2) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 4) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v1 & 8) != 0) {
                    f2 = 0.0f;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                    targetedFlingBehavior1 = CarouselDefaults.INSTANCE.noSnapFlingBehavior(composer1, 6);
                }
                z = false;
                if((v1 & 0x20) == 0) {
                    v4 = v2;
                    f3 = f2;
                    targetedFlingBehavior3 = targetedFlingBehavior1;
                    paddingValues2 = paddingValues0;
                }
                else {
                    v4 = v2;
                    paddingValues2 = PaddingKt.PaddingValues-0680j_4(0.0f);
                    f3 = f2;
                    targetedFlingBehavior3 = targetedFlingBehavior1;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                v4 = v2;
                f3 = f2;
                targetedFlingBehavior3 = targetedFlingBehavior1;
                paddingValues2 = paddingValues0;
                z = false;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1F8CD358, v4, -1, "androidx.compose.material3.carousel.HorizontalUncontainedCarousel (Carousel.kt:178)");
            }
            Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            Orientation orientation0 = Orientation.Horizontal;
            boolean z1 = composer1.changed(density0);
            if((v4 & 0x70) == 0x20) {
                z = true;
            }
            x1 x10 = composer1.rememberedValue();
            if(z || z1 || x10 == Composer.Companion.getEmpty()) {
                x10 = new x1(density0, f, 1);
                composer1.updateRememberedValue(x10);
            }
            CarouselKt.Carousel-V-95POc(carouselState0, orientation0, x10, paddingValues2, 0, modifier1, f3, targetedFlingBehavior3, function40, composer1, v4 & 14 | 0x6030 | v4 >> 6 & 0x1C00 | 0x70000 & v4 << 9 | 0x380000 & v4 << 9 | v4 << 9 & 0x1C00000 | v4 << 6 & 0xE000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            targetedFlingBehavior2 = targetedFlingBehavior3;
            paddingValues1 = paddingValues2;
        }
        else {
            composer1.skipToGroupEnd();
            f3 = f2;
            targetedFlingBehavior2 = targetedFlingBehavior1;
            paddingValues1 = paddingValues0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(carouselState0, f, modifier1, f3, targetedFlingBehavior2, paddingValues1, function40, v, v1));
        }
    }

    // 去混淆评级： 低(20)
    public static final float access$getProgress(Keyline keyline0, Keyline keyline1, float f) {
        return Intrinsics.areEqual(keyline0, keyline1) ? 1.0f : (f - keyline0.getUnadjustedOffset()) / (keyline1.getUnadjustedOffset() - keyline0.getUnadjustedOffset());
    }

    public static final float calculateCurrentScrollOffset(@NotNull CarouselState carouselState0, @NotNull Strategy strategy0) {
        float f = strategy0.getItemSpacing() + strategy0.getItemMainAxisSize();
        float f1 = ((float)carouselState0.getPagerState$material3_release().getCurrentPage()) * f;
        return carouselState0.getPagerState$material3_release().getCurrentPageOffsetFraction() * f + f1 - ((float)KeylineSnapPositionKt.getSnapPositionOffset(strategy0, carouselState0.getPagerState$material3_release().getCurrentPage(), carouselState0.getPagerState$material3_release().getPageCount()));
    }

    @VisibleForTesting
    public static final float calculateMaxScrollOffset(@NotNull CarouselState carouselState0, @NotNull Strategy strategy0) {
        float f = (float)carouselState0.getPagerState$material3_release().getPageCount();
        return kotlin.ranges.c.coerceAtLeast(q.a(f, 1.0f, strategy0.getItemSpacing(), strategy0.getItemMainAxisSize() * f) - strategy0.getAvailableSpace(), 0.0f);
    }

    @NotNull
    public static final Modifier carouselItem(@NotNull Modifier modifier0, int v, @NotNull CarouselState carouselState0, @NotNull Function0 function00, @NotNull CarouselItemInfoImpl carouselItemInfoImpl0, @NotNull Shape shape0) {
        return LayoutModifierKt.layout(modifier0, new l(function00, carouselState0, v, carouselItemInfoImpl0, shape0));
    }
}

