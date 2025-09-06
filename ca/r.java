package ca;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import com.kakao.kandinsky.designsystem.common.ComposableSingletons.ItemSliderKt;
import com.kakao.kandinsky.designsystem.common.ItemSliderKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function2 {
    public static final r w;

    static {
        r.w = new r(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
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
            ComposerKt.traceEventStart(-1793332030, v, -1, "com.kakao.kandinsky.designsystem.common.ComposableSingletons$ItemSliderKt.lambda-5.<anonymous> (ItemSlider.kt:42)");
        }
        Modifier modifier0 = SizeKt.size-VpY3zN4(Modifier.Companion, 200.0f, 300.0f);
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier0);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
        composer0.startReplaceGroup(22371010);
        MutableIntState mutableIntState0 = composer0.rememberedValue();
        androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
        if(mutableIntState0 == composer$Companion0.getEmpty()) {
            mutableIntState0 = SnapshotIntStateKt.mutableIntStateOf(0);
            composer0.updateRememberedValue(mutableIntState0);
        }
        composer0.endReplaceGroup();
        int v2 = mutableIntState0.getIntValue();
        composer0.startReplaceGroup(0x1555B5E);
        p p0 = composer0.rememberedValue();
        if(p0 == composer$Companion0.getEmpty()) {
            p0 = new p(mutableIntState0, 0);
            composer0.updateRememberedValue(p0);
        }
        composer0.endReplaceGroup();
        ComposableSingletons.ItemSliderKt composableSingletons$ItemSliderKt0 = ComposableSingletons.ItemSliderKt.INSTANCE;
        ItemSliderKt.ItemSlider(null, 10, v2, p0, q.x, composableSingletons$ItemSliderKt0.getLambda-1$designsystem_release(), composableSingletons$ItemSliderKt0.getLambda-2$designsystem_release(), composer0, 0x1B6C30, 1);
        int v3 = mutableIntState0.getIntValue();
        composer0.startReplaceGroup(0x1555E49);
        p p1 = composer0.rememberedValue();
        if(p1 == composer$Companion0.getEmpty()) {
            p1 = new p(mutableIntState0, 1);
            composer0.updateRememberedValue(p1);
        }
        composer0.endReplaceGroup();
        ItemSliderKt.ItemSlider(null, 10, v3, p1, q.y, composableSingletons$ItemSliderKt0.getLambda-3$designsystem_release(), composableSingletons$ItemSliderKt0.getLambda-4$designsystem_release(), composer0, 0x1B6C30, 1);
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

