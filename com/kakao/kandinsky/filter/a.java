package com.kakao.kandinsky.filter;

import aa.l;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.kandinsky.designsystem.common.FeatureBottomBarKt;
import com.kakao.kandinsky.designsystem.common.FunctionStateKt;
import com.kakao.kandinsky.filter.contract.FeatureMenu;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public final State w;

    public a(State state0) {
        this.w = state0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3E5C475, v, -1, "com.kakao.kandinsky.filter.FilterScreen.<anonymous>.<anonymous> (FilterScreen.kt:103)");
        }
        String s = StringResources_androidKt.stringResource(string.filter_feature_name, ((Composer)object0), 0);
        State state0 = this.w;
        boolean z = FilterScreenKt.access$FilterScreen$lambda$0(state0).getFeatureMenu() == FeatureMenu.Filter;
        ((Composer)object0).startReplaceGroup(0xA8D647F1);
        boolean z1 = ((Composer)object0).changed(state0);
        l l0 = ((Composer)object0).rememberedValue();
        if(z1 || l0 == Composer.Companion.getEmpty()) {
            l0 = new l(state0, 13);
            ((Composer)object0).updateRememberedValue(l0);
        }
        ((Composer)object0).endReplaceGroup();
        FeatureBottomBarKt.BottomBarFeatureTypeText(s, false, z, FunctionStateKt.skippableLambda(l0, ((Composer)object0), 0), ((Composer)object0), 0, 2);
        String s1 = StringResources_androidKt.stringResource(string.effect_feature_name, ((Composer)object0), 0);
        boolean z2 = FilterScreenKt.access$FilterScreen$lambda$0(state0).getFeatureMenu() == FeatureMenu.Effect;
        ((Composer)object0).startReplaceGroup(0xA8D64970);
        boolean z3 = ((Composer)object0).changed(state0);
        l l1 = ((Composer)object0).rememberedValue();
        if(z3 || l1 == Composer.Companion.getEmpty()) {
            l1 = new l(state0, 14);
            ((Composer)object0).updateRememberedValue(l1);
        }
        ((Composer)object0).endReplaceGroup();
        FeatureBottomBarKt.BottomBarFeatureTypeText(s1, false, z2, FunctionStateKt.skippableLambda(l1, ((Composer)object0), 0), ((Composer)object0), 0, 2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

