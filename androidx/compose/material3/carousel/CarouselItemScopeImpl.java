package androidx.compose.material3.carousel;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v0.a;

@ExperimentalMaterial3Api
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001B\u0010\t\u001A\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001A\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001A\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\b\u001A\u00020\u0007H\u0017¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\b\u001A\u00020\u0007H\u0017¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001A\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/carousel/CarouselItemScopeImpl;", "Landroidx/compose/material3/carousel/CarouselItemScope;", "Landroidx/compose/material3/carousel/CarouselItemInfo;", "itemInfo", "<init>", "(Landroidx/compose/material3/carousel/CarouselItemInfo;)V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/Shape;", "shape", "maskClip", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/BorderStroke;", "border", "maskBorder", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/shape/GenericShape;", "rememberMaskShape", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/shape/GenericShape;", "getCarouselItemInfo", "()Landroidx/compose/material3/carousel/CarouselItemInfo;", "carouselItemInfo", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCarouselItemScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselItemScope.kt\nandroidx/compose/material3/carousel/CarouselItemScopeImpl\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,99:1\n77#2:100\n1223#3,6:101\n*S KotlinDebug\n*F\n+ 1 CarouselItemScope.kt\nandroidx/compose/material3/carousel/CarouselItemScopeImpl\n*L\n89#1:100\n90#1:101,6\n*E\n"})
public final class CarouselItemScopeImpl implements CarouselItemScope {
    public static final int $stable = 8;
    public final CarouselItemInfo a;

    public CarouselItemScopeImpl(@NotNull CarouselItemInfo carouselItemInfo0) {
        this.a = carouselItemInfo0;
    }

    @Override  // androidx.compose.material3.carousel.CarouselItemScope
    @NotNull
    public CarouselItemInfo getCarouselItemInfo() {
        return this.a;
    }

    @Override  // androidx.compose.material3.carousel.CarouselItemScope
    @Composable
    @NotNull
    public Modifier maskBorder(@NotNull Modifier modifier0, @NotNull BorderStroke borderStroke0, @NotNull Shape shape0, @Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0x24698F68);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x24698F68, v, -1, "androidx.compose.material3.carousel.CarouselItemScopeImpl.maskBorder (CarouselItemScope.kt:84)");
        }
        Modifier modifier1 = BorderKt.border(modifier0, borderStroke0, this.rememberMaskShape(shape0, composer0, v >> 6 & 0x7E));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return modifier1;
    }

    @Override  // androidx.compose.material3.carousel.CarouselItemScope
    @Composable
    @NotNull
    public Modifier maskClip(@NotNull Modifier modifier0, @NotNull Shape shape0, @Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(440683050);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(440683050, v, -1, "androidx.compose.material3.carousel.CarouselItemScopeImpl.maskClip (CarouselItemScope.kt:80)");
        }
        Modifier modifier1 = ClipKt.clip(modifier0, this.rememberMaskShape(shape0, composer0, v >> 3 & 0x7E));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return modifier1;
    }

    @Override  // androidx.compose.material3.carousel.CarouselItemScope
    @Composable
    @NotNull
    public GenericShape rememberMaskShape(@NotNull Shape shape0, @Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0x91838A8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x91838A8, v, -1, "androidx.compose.material3.carousel.CarouselItemScopeImpl.rememberMaskShape (CarouselItemScope.kt:87)");
        }
        Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
        boolean z = composer0.changed(this.getCarouselItemInfo());
        boolean z1 = composer0.changed(density0);
        GenericShape genericShape0 = composer0.rememberedValue();
        if(z || z1 || genericShape0 == Composer.Companion.getEmpty()) {
            genericShape0 = new GenericShape(new a(this, shape0, density0));
            composer0.updateRememberedValue(genericShape0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return genericShape0;
    }
}

