package ca;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import com.kakao.kandinsky.designsystem.common.ComposableSingletons.FeatureBottomBarKt;
import com.kakao.kandinsky.designsystem.common.KDButtonColors;
import com.kakao.kandinsky.designsystem.common.KDButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import r0.a;

public final class m0 extends Lambda implements Function4 {
    public final int w;
    public final Modifier x;
    public final Object y;

    public m0(Modifier modifier0, Object object0, int v) {
        this.w = v;
        this.x = modifier0;
        this.y = object0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        if(this.w != 0) {
            Composer composer0 = (Composer)object2;
            int v = ((Number)object3).intValue();
            int v1 = (v & 6) == 0 ? (composer0.changed(((SharedTransitionScope)object0)) ? 4 : 2) | v : v;
            if((v & 0x30) == 0) {
                v1 |= (composer0.changed(((Modifier)object1)) ? 0x20 : 16);
            }
            if((v1 & 0x93) == 0x92 && composer0.getSkipping()) {
                composer0.skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-130587847, v1, -1, "androidx.compose.animation.SharedTransitionLayout.<anonymous> (SharedTransitionScope.kt:115)");
            }
            Modifier modifier0 = this.x.then(((Modifier)object1));
            composer0.startReplaceableGroup(0x2BB5B5D7);
            MeasurePolicy measurePolicy0 = a.i(Alignment.Companion, false, composer0, 0, -1323940314);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
            CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            Function3 function30 = LayoutKt.modifierMaterializerOf(modifier0);
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
            Function2 function20 = androidx.room.a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
            if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
                androidx.room.a.t(v2, composer0, v2, function20);
            }
            a.w(0, function30, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
            ((Function3)this.y).invoke(((SharedTransitionScope)object0), composer0, ((int)(v1 & 14)));
            composer0.endReplaceableGroup();
            composer0.endNode();
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        int v3 = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((Function0)object0), "onClickConfirm");
        int v4 = (v3 & 14) == 0 ? (((Composer)object2).changedInstance(((Function0)object0)) ? 4 : 2) | v3 : v3;
        if((v3 & 0x70) == 0) {
            v4 |= (((Composer)object2).changedInstance(((Function0)object1)) ? 0x20 : 16);
        }
        if((v4 & 731) == 0x92 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xBD8CCF38, v4, -1, "com.kakao.kandinsky.designsystem.common.FeatureBottomBarRightContent.<anonymous>.<anonymous> (FeatureBottomBar.kt:148)");
        }
        ((Composer)object2).startReplaceGroup(0x6294261B);
        if(((Function0)object1) != null) {
            KDButtonKt.KDIconButton(((Function0)object1), this.x, false, ((KDButtonColors)this.y), null, ComposableSingletons.FeatureBottomBarKt.INSTANCE.getLambda-2$designsystem_release(), ((Composer)object2), 0x30030, 20);
        }
        ((Composer)object2).endReplaceGroup();
        KDButtonKt.KDIconButton(((Function0)object0), this.x, false, ((KDButtonColors)this.y), null, ComposableSingletons.FeatureBottomBarKt.INSTANCE.getLambda-3$designsystem_release(), ((Composer)object2), v4 & 14 | 0x30030, 20);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

