package a;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import b.b0;
import b.s;
import com.kakao.kandinsky.KandinskyActivity;
import com.kakao.kandinsky.designsystem.util.DpExtensionKt;
import com.kakao.kandinsky.preview.PreviewAnimator;
import com.kakao.kandinsky.preview.PreviewGestureController;
import com.kakao.kandinsky.selector.SelectorEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p0 extends Lambda implements Function2 {
    public final KandinskyActivity a;

    public p0(KandinskyActivity kandinskyActivity0) {
        this.a = kandinskyActivity0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Composer composer0 = (Composer)object0;
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1638035915, v, -1, "com.kakao.kandinsky.KandinskyActivity.KandinskyScreen.<anonymous> (KandinskyActivity.kt:263)");
        }
        composer0.startReplaceGroup(0x5521E8D6);
        MutableState mutableState0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceGroup();
        Object object2 = mutableState0.component1();
        Function1 function10 = mutableState0.component2();
        composer0.startReplaceGroup(0x5521E92A);
        PreviewAnimator previewAnimator0 = composer0.rememberedValue();
        if(previewAnimator0 == composer$Companion0.getEmpty()) {
            previewAnimator0 = new PreviewAnimator();
            composer0.updateRememberedValue(previewAnimator0);
        }
        composer0.endReplaceGroup();
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null);
        KandinskyActivity kandinskyActivity0 = this.a;
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
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
        Function2 function20 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            a.t(v1, composer0, v1, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
        State state0 = SnapshotStateKt.collectAsState(kandinskyActivity0.a().getUiState(), null, composer0, 8, 1);
        s s0 = ((b0)state0.getValue()).a;
        composer0.startReplaceGroup(0xD6CF0D13);
        boolean z = composer0.changed(s0);
        PreviewGestureController previewGestureController0 = composer0.rememberedValue();
        if(z || previewGestureController0 == composer$Companion0.getEmpty()) {
            previewGestureController0 = new PreviewGestureController();
            composer0.updateRememberedValue(previewGestureController0);
        }
        composer0.endReplaceGroup();
        KandinskyActivity.a(kandinskyActivity0, previewAnimator0, previewGestureController0, ((b0)state0.getValue()).a, composer0, 0x1006);
        KandinskyActivity.a(kandinskyActivity0, boxScopeInstance0, ((b0)state0.getValue()), function10, previewAnimator0, composer0, 35910);
        composer0.startMovableGroup(0xD6CF0EF4, ((b0)state0.getValue()).a);
        boolean z1 = previewGestureController0.isChanged();
        composer0.startReplaceGroup(0xD6CF0F47);
        boolean z2 = composer0.changed(previewGestureController0);
        m0 m00 = composer0.rememberedValue();
        if(z2 || m00 == composer$Companion0.getEmpty()) {
            m00 = new m0(previewGestureController0, previewAnimator0);
            composer0.updateRememberedValue(m00);
        }
        composer0.endReplaceGroup();
        BackHandlerKt.BackHandler(z1, m00, composer0, 0, 0);
        composer0.endMovableGroup();
        String s1 = ((b0)state0.getValue()).o.getOriginalUri();
        composer0.startReplaceGroup(0xD6CF105F);
        boolean z3 = composer0.changed(previewGestureController0);
        n0 n00 = composer0.rememberedValue();
        if(z3 || n00 == composer$Companion0.getEmpty()) {
            n00 = new n0(previewGestureController0, previewAnimator0, null);
            composer0.updateRememberedValue(n00);
        }
        composer0.endReplaceGroup();
        EffectsKt.LaunchedEffect(s1, n00, composer0, 0x40);
        composer0.startReplaceGroup(0xD6CF1153);
        boolean z4 = composer0.changed(function10);
        o0 o00 = composer0.rememberedValue();
        if(z4 || o00 == composer$Companion0.getEmpty()) {
            o00 = new o0(function10);
            composer0.updateRememberedValue(o00);
        }
        composer0.endReplaceGroup();
        KandinskyActivity.a(kandinskyActivity0, ((SelectorEvent)object2), o00, composer0, SelectorEvent.$stable | 0x200);
        composer0.startReplaceGroup(0x5521EE87);
        if(((b0)state0.getValue()).e) {
            Modifier modifier2 = SizeKt.size-VpY3zN4(OffsetKt.offset-VpY3zN4(modifier$Companion0, DpExtensionKt.toDp(((b0)state0.getValue()).c.getLeft(), composer0, 0), DpExtensionKt.toDp(((b0)state0.getValue()).c.getTop(), composer0, 0)), DpExtensionKt.toDp(((b0)state0.getValue()).c.getWidth(), composer0, 0), DpExtensionKt.toDp(((b0)state0.getValue()).c.getHeight(), composer0, 0));
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getCenter(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
            CompositionLocalMap compositionLocalMap1 = composer0.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer0, modifier2);
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
            Function2 function21 = a.r(composeUiNode$Companion0, composer0, measurePolicy1, composer0, compositionLocalMap1);
            if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
                a.t(v2, composer0, v2, function21);
            }
            Updater.set-impl(composer0, modifier3, composeUiNode$Companion0.getSetModifier());
            KandinskyActivity.c(kandinskyActivity0, composer0, 8);
            composer0.endNode();
        }
        if(a.x(composer0)) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

