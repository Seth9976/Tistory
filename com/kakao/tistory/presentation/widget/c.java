package com.kakao.tistory.presentation.widget;

import a;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.SwipeableKt;
import androidx.compose.material.SwipeableState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import d;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function3 {
    public final int a;
    public final Function2 b;

    public c(int v, Function2 function20) {
        this.a = v;
        this.b = function20;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BoxWithConstraintsScope)object0), "$this$BoxWithConstraints");
        if((v & 14) == 0) {
            v |= (composer0.changed(((BoxWithConstraintsScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDBF431D4, v, -1, "com.kakao.tistory.presentation.widget.CommonBottomModal.<anonymous> (BottomModal.kt:33)");
        }
        float f = (float)Constraints.getMaxHeight-impl(((BoxWithConstraintsScope)object0).getConstraints-msEJaDk());
        SwipeableState swipeableState0 = SwipeableKt.rememberSwipeableState(BottomSheetValue.Closed, null, null, composer0, 6, 6);
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SwipeableKt.swipeable-pPrIpRY$default(modifier$Companion0, swipeableState0, x.mapOf(new Pair[]{TuplesKt.to(f, BottomSheetValue.Expanded), TuplesKt.to(((float)(f - ((float)this.a))), BottomSheetValue.Open), TuplesKt.to(0.0f, BottomSheetValue.Closed)}), Orientation.Vertical, false, false, null, null, null, 0.0f, 504, null);
        Function2 function20 = this.b;
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
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
        Function2 function21 = a.a(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            d.a(v1, composer0, v1, function21);
        }
        r0.a.z(composeUiNode$Companion0, composer0, modifier1, composer0, 0xC9F83E8D);
        boolean z = composer0.changed(swipeableState0);
        com.kakao.tistory.presentation.widget.a a0 = composer0.rememberedValue();
        if(z || a0 == Composer.Companion.getEmpty()) {
            a0 = new com.kakao.tistory.presentation.widget.a(swipeableState0);
            composer0.updateRememberedValue(a0);
        }
        composer0.endReplaceGroup();
        SurfaceKt.Surface-F-jzlyU(OffsetKt.offset(modifier$Companion0, a0), null, 0L, 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(0x108D6BD2, true, new b(function20), composer0, 54), composer0, 0x180000, 62);
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

