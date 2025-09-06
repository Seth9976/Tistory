package ca;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.k1;
import androidx.room.a;
import com.kakao.kandinsky.designsystem.common.ItemSliderKt;
import com.kakao.kandinsky.designsystem.theme.Orientation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d1 extends Lambda implements Function5 {
    public final PagerState w;
    public final Function2 x;
    public final Function4 y;
    public final Function4 z;

    public d1(PagerState pagerState0, Function2 function20, Function4 function40, Function4 function41) {
        this.w = pagerState0;
        this.x = function20;
        this.y = function40;
        this.z = function41;
        super(5);
    }

    @Override  // kotlin.jvm.functions.Function5
    public final Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4) {
        boolean z = ((Boolean)object1).booleanValue();
        int v = ((Number)object2).intValue();
        Composer composer0 = (Composer)object3;
        int v1 = ((Number)object4).intValue();
        Intrinsics.checkNotNullParameter(((Orientation)object0), "orientation");
        int v2 = (v1 & 14) == 0 ? (composer0.changed(((Orientation)object0)) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer0.changed(z) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer0.changed(v) ? 0x100 : 0x80);
        }
        if((v2 & 5851) == 1170 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(703338187, v2, -1, "com.kakao.kandinsky.designsystem.common.Pager.<anonymous>.<anonymous> (ItemSlider.kt:188)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
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
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v3)) {
            a.t(v3, composer0, v3, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        Modifier modifier2 = BoxScopeInstance.INSTANCE.align(modifier$Companion0, alignment$Companion0.getCenter());
        composer0.startReplaceGroup(0xE84D4FBA);
        Function2 function21 = this.x;
        boolean z1 = composer0.changed(function21);
        k1 k10 = composer0.rememberedValue();
        if(z1 || k10 == Composer.Companion.getEmpty()) {
            k10 = new k1(function21, 1);
            composer0.updateRememberedValue(k10);
        }
        composer0.endReplaceGroup();
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(-1460935407, true, new c1(this.y, z, v, 0), composer0, 54);
        ComposableLambda composableLambda1 = ComposableLambdaKt.rememberComposableLambda(0x78F97DF0, true, new c1(this.z, z, v, 1), composer0, 54);
        ItemSliderKt.access$SliderItemBox(modifier2, ((Orientation)object0), this.w, v, k10, composableLambda0, composableLambda1, composer0, v2 << 3 & 0x70 | 0x1B0000 | v2 << 3 & 0x1C00, 0);
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

