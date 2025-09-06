package v0;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.material3.carousel.CarouselItemInfoImpl;
import androidx.compose.material3.carousel.CarouselItemScopeImpl;
import androidx.compose.material3.carousel.CarouselKt.Carousel.1.clipShape.1.1;
import androidx.compose.material3.carousel.CarouselKt;
import androidx.compose.material3.carousel.CarouselPageSize;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function4 {
    public final CarouselState w;
    public final CarouselPageSize x;
    public final Function4 y;

    public c(CarouselState carouselState0, CarouselPageSize carouselPageSize0, Function4 function40) {
        this.w = carouselState0;
        this.x = carouselPageSize0;
        this.y = function40;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        PagerScope pagerScope0 = (PagerScope)object0;
        int v = ((Number)object1).intValue();
        Composer composer0 = (Composer)object2;
        int v1 = ((Number)object3).intValue();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x28F47C20, v1, -1, "androidx.compose.material3.carousel.Carousel.<anonymous> (Carousel.kt:267)");
        }
        CarouselItemInfoImpl carouselItemInfoImpl0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(carouselItemInfoImpl0 == composer$Companion0.getEmpty()) {
            carouselItemInfoImpl0 = new CarouselItemInfoImpl();
            composer0.updateRememberedValue(carouselItemInfoImpl0);
        }
        CarouselItemScopeImpl carouselItemScopeImpl0 = composer0.rememberedValue();
        if(carouselItemScopeImpl0 == composer$Companion0.getEmpty()) {
            carouselItemScopeImpl0 = new CarouselItemScopeImpl(carouselItemInfoImpl0);
            composer0.updateRememberedValue(carouselItemScopeImpl0);
        }
        CarouselKt.Carousel.1.clipShape.1.1 carouselKt$Carousel$1$clipShape$1$10 = composer0.rememberedValue();
        if(carouselKt$Carousel$1$clipShape$1$10 == composer$Companion0.getEmpty()) {
            carouselKt$Carousel$1$clipShape$1$10 = new CarouselKt.Carousel.1.clipShape.1.1(carouselItemInfoImpl0);
            composer0.updateRememberedValue(carouselKt$Carousel$1$clipShape$1$10);
        }
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        CarouselPageSize carouselPageSize0 = this.x;
        boolean z = composer0.changed(carouselPageSize0);
        b b0 = composer0.rememberedValue();
        if(z || b0 == composer$Companion0.getEmpty()) {
            b0 = new b(carouselPageSize0, 0);
            composer0.updateRememberedValue(b0);
        }
        Modifier modifier0 = CarouselKt.carouselItem(modifier$Companion0, v, this.w, b0, carouselItemInfoImpl0, carouselKt$Carousel$1$clipShape$1$10);
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(composer0.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function00);
        }
        else {
            composer0.useNode();
        }
        Function2 function20 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            a.t(v2, composer0, v2, function20);
        }
        Integer integer0 = r0.a.l(composeUiNode$Companion0, composer0, modifier1, v);
        this.y.invoke(carouselItemScopeImpl0, integer0, composer0, ((int)(v1 & 0x70)));
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

