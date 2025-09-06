package androidx.compose.material3.carousel;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.pager.PagerDefaults;
import androidx.compose.foundation.pager.PagerSnapDistance;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001J\'\u0010\b\u001A\u00020\u00072\u0006\u0010\u0003\u001A\u00020\u00022\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ7\u0010\f\u001A\u00020\u00072\u0006\u0010\u0003\u001A\u00020\u00022\u000E\b\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00050\n2\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\u000E\u0010\u000FR \u0010\u0015\u001A\u00020\u00108\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R \u0010\u0018\u001A\u00020\u00108\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001A\u0004\b\u0017\u0010\u0014R \u0010\u001B\u001A\u00020\u00108\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001A\u0004\b\u001A\u0010\u0014R\u0014\u0010\u001C\u001A\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001C\u0010\u0012\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001D"}, d2 = {"Landroidx/compose/material3/carousel/CarouselDefaults;", "", "Landroidx/compose/material3/carousel/CarouselState;", "state", "Landroidx/compose/animation/core/AnimationSpec;", "", "snapAnimationSpec", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "singleAdvanceFlingBehavior", "(Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "decayAnimationSpec", "multiBrowseFlingBehavior", "(Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "noSnapFlingBehavior", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getMinSmallItemSize-D9Ej5fM$material3_release", "()F", "MinSmallItemSize", "b", "getMaxSmallItemSize-D9Ej5fM$material3_release", "MaxSmallItemSize", "c", "getAnchorSize-D9Ej5fM$material3_release", "AnchorSize", "MediumLargeItemDiffThreshold", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCarousel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Carousel.kt\nandroidx/compose/material3/carousel/CarouselDefaults\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,693:1\n1223#2,6:694\n148#3:700\n148#3:701\n148#3:702\n*S KotlinDebug\n*F\n+ 1 Carousel.kt\nandroidx/compose/material3/carousel/CarouselDefaults\n*L\n675#1:694,6\n685#1:700\n688#1:701\n690#1:702\n*E\n"})
public final class CarouselDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final CarouselDefaults INSTANCE = null;
    public static final float MediumLargeItemDiffThreshold = 0.85f;
    public static final float a;
    public static final float b;
    public static final float c;

    static {
        CarouselDefaults.INSTANCE = new CarouselDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        CarouselDefaults.a = 40.0f;
        CarouselDefaults.b = 56.0f;
        CarouselDefaults.c = 10.0f;
    }

    public final float getAnchorSize-D9Ej5fM$material3_release() [...] // 潜在的解密器

    public final float getMaxSmallItemSize-D9Ej5fM$material3_release() [...] // 潜在的解密器

    public final float getMinSmallItemSize-D9Ej5fM$material3_release() [...] // 潜在的解密器

    @Composable
    @NotNull
    public final TargetedFlingBehavior multiBrowseFlingBehavior(@NotNull CarouselState carouselState0, @Nullable DecayAnimationSpec decayAnimationSpec0, @Nullable AnimationSpec animationSpec0, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 2) != 0) {
            decayAnimationSpec0 = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer0, 0);
        }
        if((v1 & 4) != 0) {
            animationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1105043293, v, -1, "androidx.compose.material3.carousel.CarouselDefaults.multiBrowseFlingBehavior (Carousel.kt:644)");
        }
        androidx.compose.material3.carousel.CarouselDefaults.multiBrowseFlingBehavior.pagerSnapDistance.1 carouselDefaults$multiBrowseFlingBehavior$pagerSnapDistance$10 = new androidx.compose.material3.carousel.CarouselDefaults.multiBrowseFlingBehavior.pagerSnapDistance.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        TargetedFlingBehavior targetedFlingBehavior0 = PagerDefaults.INSTANCE.flingBehavior(carouselState0.getPagerState$material3_release(), carouselDefaults$multiBrowseFlingBehavior$pagerSnapDistance$10, decayAnimationSpec0, animationSpec0, 0.0f, composer0, v << 3 & 0x1F80 | PagerDefaults.$stable << 15, 16);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior0;

        @Metadata(d1 = {"\u0000\u001B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J0\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"androidx/compose/material3/carousel/CarouselDefaults$multiBrowseFlingBehavior$pagerSnapDistance$1", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "calculateTargetPage", "", "startPage", "suggestedTargetPage", "velocity", "", "pageSize", "pageSpacing", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public final class androidx.compose.material3.carousel.CarouselDefaults.multiBrowseFlingBehavior.pagerSnapDistance.1 implements PagerSnapDistance {
            @Override  // androidx.compose.foundation.pager.PagerSnapDistance
            public int calculateTargetPage(int v, int v1, float f, int v2, int v3) {
                return v1;
            }
        }

    }

    @Composable
    @NotNull
    public final TargetedFlingBehavior noSnapFlingBehavior(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE70F7B74, v, -1, "androidx.compose.material3.carousel.CarouselDefaults.noSnapFlingBehavior (Carousel.kt:673)");
        }
        androidx.compose.material3.carousel.CarouselDefaults.noSnapFlingBehavior.decayLayoutInfoProvider.1.1 carouselDefaults$noSnapFlingBehavior$decayLayoutInfoProvider$1$10 = composer0.rememberedValue();
        if(carouselDefaults$noSnapFlingBehavior$decayLayoutInfoProvider$1$10 == Composer.Companion.getEmpty()) {
            carouselDefaults$noSnapFlingBehavior$decayLayoutInfoProvider$1$10 = new androidx.compose.material3.carousel.CarouselDefaults.noSnapFlingBehavior.decayLayoutInfoProvider.1.1();  // 初始化器: Ljava/lang/Object;-><init>()V
            composer0.updateRememberedValue(carouselDefaults$noSnapFlingBehavior$decayLayoutInfoProvider$1$10);
        }
        TargetedFlingBehavior targetedFlingBehavior0 = SnapFlingBehaviorKt.rememberSnapFlingBehavior(carouselDefaults$noSnapFlingBehavior$decayLayoutInfoProvider$1$10, composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior0;

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"androidx/compose/material3/carousel/CarouselDefaults$noSnapFlingBehavior$decayLayoutInfoProvider$1$1", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "calculateSnapOffset", "", "velocity", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public final class androidx.compose.material3.carousel.CarouselDefaults.noSnapFlingBehavior.decayLayoutInfoProvider.1.1 implements SnapLayoutInfoProvider {
            @Override  // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float f) {
                return 0.0f;
            }
        }

    }

    @Composable
    @NotNull
    public final TargetedFlingBehavior singleAdvanceFlingBehavior(@NotNull CarouselState carouselState0, @Nullable AnimationSpec animationSpec0, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 2) != 0) {
            animationSpec0 = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x656C28FF, v, -1, "androidx.compose.material3.carousel.CarouselDefaults.singleAdvanceFlingBehavior (Carousel.kt:611)");
        }
        PagerSnapDistance pagerSnapDistance0 = PagerSnapDistance.Companion.atMost(1);
        TargetedFlingBehavior targetedFlingBehavior0 = PagerDefaults.INSTANCE.flingBehavior(carouselState0.getPagerState$material3_release(), pagerSnapDistance0, null, animationSpec0, 0.0f, composer0, v << 6 & 0x1C00 | PagerDefaults.$stable << 15, 20);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior0;
    }
}

