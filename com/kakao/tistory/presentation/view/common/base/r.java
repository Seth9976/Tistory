package com.kakao.tistory.presentation.view.common.base;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.design.ui.list.m;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function2 {
    public final TistoryComposeFragment a;

    public r(TistoryComposeFragment tistoryComposeFragment0) {
        this.a = tistoryComposeFragment0;
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
            ComposerKt.traceEventStart(-1251792066, v, -1, "com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment.onViewCreated.<anonymous>.<anonymous> (TistoryComposeFragment.kt:62)");
        }
        long v1 = ColorResources_androidKt.colorResource(color.white, ((Composer)object0), 0);
        Modifier modifier0 = BackgroundKt.background-bw27NRU$default(Modifier.Companion, v1, null, 2, null);
        TistoryComposeFragment tistoryComposeFragment0 = this.a;
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object0), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object0).getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(((Composer)object0), modifier0);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
        Function2 function20 = a.a(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            d.a(v2, composer0, v2, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        tistoryComposeFragment0.Content(((Composer)object0), 8);
        ErrorModel errorModel0 = (ErrorModel)LiveDataAdapterKt.observeAsState(tistoryComposeFragment0.d, ((Composer)object0), 8).getValue();
        ((Composer)object0).startReplaceGroup(0x8A026FB7);
        if(errorModel0 != null) {
            tistoryComposeFragment0.CommonExceptionView(errorModel0, ((Composer)object0), 72);
        }
        if(m.a(((Composer)object0))) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

