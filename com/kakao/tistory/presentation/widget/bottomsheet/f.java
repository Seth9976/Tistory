package com.kakao.tistory.presentation.widget.bottomsheet;

import android.view.Window;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ModalBottomSheetDefaults;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.SwipeableKt;
import androidx.compose.material.SwipeableState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.room.a;
import com.kakao.tistory.presentation.common.utils.DeviceUtilsKt;
import d;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.x;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class f extends Lambda implements Function3 {
    public final int a;
    public final SwipeableState b;
    public final Function0 c;
    public final Window d;
    public final Function2 e;

    public f(int v, SwipeableState swipeableState0, Function0 function00, Window window0, Function2 function20) {
        this.a = v;
        this.b = swipeableState0;
        this.c = function00;
        this.d = window0;
        this.e = function20;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Modifier modifier3;
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
            ComposerKt.traceEventStart(-1320949948, v, -1, "com.kakao.tistory.presentation.widget.bottomsheet.BottomSheetModal.<anonymous> (BottomSheetModal.kt:52)");
        }
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
            compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer0), composer0);
        }
        CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
        float f = (float)Constraints.getMaxHeight-impl(((BoxWithConstraintsScope)object0).getConstraints-msEJaDk());
        float f1 = (float)DeviceUtilsKt.getStatusBarHeight();
        float f2 = ((float)this.a) - f1;
        Object object3 = this.b.getCurrentValue();
        BottomSheetValue bottomSheetValue0 = BottomSheetValue.Closed;
        if(object3 != bottomSheetValue0 && this.b.getTargetValue() == bottomSheetValue0) {
            this.c.invoke();
        }
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Map map0 = x.mapOf(new Pair[]{TuplesKt.to(0.0f, BottomSheetValue.Expanded), TuplesKt.to(f2, BottomSheetValue.Open), TuplesKt.to(f, bottomSheetValue0)});
        Modifier modifier0 = SwipeableKt.swipeable-pPrIpRY$default(modifier$Companion0, this.b, map0, Orientation.Vertical, false, false, null, e.a, null, 0.0f, 440, null);
        boolean z = this.b.getTargetValue() != bottomSheetValue0;
        Modifier modifier1 = SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null);
        Window window0 = this.d;
        SwipeableState swipeableState0 = this.b;
        Function0 function00 = this.c;
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier2 = ComposedModifierKt.materializeModifier(composer0, modifier1);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function01 = composeUiNode$Companion0.getConstructor();
        if(composer0.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function01);
        }
        else {
            composer0.useNode();
        }
        Function2 function20 = a.a(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting()) {
            modifier3 = modifier0;
            d.a(v1, composer0, v1, function20);
        }
        else {
            modifier3 = modifier0;
            if(!Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
                d.a(v1, composer0, v1, function20);
            }
        }
        Updater.set-impl(composer0, modifier2, composeUiNode$Companion0.getSetModifier());
        BottomSheetModalKt.access$Scrim-sW7UJKQ(window0, ModalBottomSheetDefaults.INSTANCE.getScrimColor(composer0, ModalBottomSheetDefaults.$stable), new b(coroutineScope0, swipeableState0, function00), z, composer0, 8, 0);
        composer0.endNode();
        composer0.startReplaceGroup(0x75C017E7);
        boolean z1 = composer0.changed(this.b);
        SwipeableState swipeableState1 = this.b;
        c c0 = composer0.rememberedValue();
        if(z1 || c0 == composer$Companion0.getEmpty()) {
            c0 = new c(swipeableState1);
            composer0.updateRememberedValue(c0);
        }
        composer0.endReplaceGroup();
        SurfaceKt.Surface-F-jzlyU(NestedScrollModifierKt.nestedScroll$default(ShadowKt.shadow-s4CzXII$default(OffsetKt.offset(modifier$Companion0, c0), (z ? 8.0f : 0.0f), RoundedCornerShapeKt.RoundedCornerShape-a9UjIt4$default(12.0f, 12.0f, 0.0f, 0.0f, 12, null), false, 0L, 0L, 28, null), BottomSheetModalKt.getPreUpPostDownNestedScrollConnection(this.b), null, 2, null).then(modifier3), null, 0L, 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1028924792, true, new com.kakao.tistory.presentation.widget.bottomsheet.d(this.e), composer0, 54), composer0, 0x180000, 62);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

