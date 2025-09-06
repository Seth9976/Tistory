package ca;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import com.kakao.kandinsky.designsystem.theme.Orientation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b1 extends Lambda implements Function4 {
    public final PagerState w;
    public final Function5 x;
    public final Orientation y;

    public b1(PagerState pagerState0, Function5 function50, Orientation orientation0) {
        this.w = pagerState0;
        this.x = function50;
        this.y = orientation0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((PagerScope)object0), "$this$VerticalPager");
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD62FBF7A, v1, -1, "com.kakao.kandinsky.designsystem.common.Pager.<anonymous>.<anonymous> (ItemSlider.kt:276)");
        }
        ((Composer)object2).startReplaceGroup(0x8605E4F3);
        State state0 = ((Composer)object2).rememberedValue();
        if(state0 == Composer.Companion.getEmpty()) {
            state0 = SnapshotStateKt.derivedStateOf(new z0(v, this.w, 1));
            ((Composer)object2).updateRememberedValue(state0);
        }
        ((Composer)object2).endReplaceGroup();
        Modifier modifier0 = GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ$default(Modifier.Companion, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0x1FFFD, null);
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object2), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object2).getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(((Composer)object2), modifier0);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(((Composer)object2).getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        ((Composer)object2).startReusableNode();
        if(((Composer)object2).getInserting()) {
            ((Composer)object2).createNode(function00);
        }
        else {
            ((Composer)object2).useNode();
        }
        Composer composer0 = Updater.constructor-impl(((Composer)object2));
        Function2 function20 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            a.t(v2, composer0, v2, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        Object object4 = state0.getValue();
        ((Boolean)object4).getClass();
        this.x.invoke(this.y, ((Boolean)object4), v, ((Composer)object2), ((int)(v1 << 3 & 0x380 | 0xC00)));
        ((Composer)object2).endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

