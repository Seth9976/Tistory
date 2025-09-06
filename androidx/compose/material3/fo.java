package androidx.compose.material3;

import aa.x;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class fo extends Lambda implements Function2 {
    public final Function2 w;
    public final Function2 x;
    public final Function3 y;

    public fo(Function2 function20, Function2 function21, Function3 function30) {
        this.w = function20;
        this.x = function21;
        this.y = function30;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-65106680, v, -1, "androidx.compose.material3.TabRowImpl.<anonymous> (TabRow.kt:576)");
        }
        TabRowKt.TabRowImpl.1.scope.1.1 tabRowKt$TabRowImpl$1$scope$1$10 = ((Composer)object0).rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(tabRowKt$TabRowImpl$1$scope$1$10 == composer$Companion0.getEmpty()) {
            tabRowKt$TabRowImpl$1$scope$1$10 = new TabRowKt.TabRowImpl.1.scope.1.1();
            ((Composer)object0).updateRememberedValue(tabRowKt$TabRowImpl$1$scope$1$10);
        }
        Modifier modifier0 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(1236693605, true, new x(9, this.y, tabRowKt$TabRowImpl$1$scope$1$10), ((Composer)object0), 54);
        List list0 = CollectionsKt__CollectionsKt.listOf(new Function2[]{this.w, this.x, composableLambda0});
        eo eo0 = ((Composer)object0).rememberedValue();
        if(eo0 == composer$Companion0.getEmpty()) {
            eo0 = new eo(tabRowKt$TabRowImpl$1$scope$1$10);
            ((Composer)object0).updateRememberedValue(eo0);
        }
        Function2 function20 = LayoutKt.combineAsVirtualLayouts(list0);
        MeasurePolicy measurePolicy0 = ((Composer)object0).rememberedValue();
        if(measurePolicy0 == composer$Companion0.getEmpty()) {
            measurePolicy0 = MultiContentMeasurePolicyKt.createMeasurePolicy(eo0);
            ((Composer)object0).updateRememberedValue(measurePolicy0);
        }
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object0), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object0).getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(((Composer)object0), modifier0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(((Composer)object0).getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        ((Composer)object0).startReusableNode();
        if(((Composer)object0).getInserting()) {
            ((Composer)object0).createNode(function00);
        }
        else {
            ((Composer)object0).useNode();
        }
        Composer composer0 = Updater.constructor-impl(((Composer)object0));
        Function2 function21 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            a.t(v1, composer0, v1, function21);
        }
        if(r0.a.B(function20, ((Composer)object0), r0.a.l(composeUiNode$Companion0, composer0, modifier1, 0))) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

