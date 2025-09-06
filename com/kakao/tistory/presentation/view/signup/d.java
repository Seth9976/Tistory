package com.kakao.tistory.presentation.view.signup;

import a;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.SharedFlow;

public final class d extends Lambda implements Function3 {
    public final SignUpActivity a;
    public final State b;

    public d(SignUpActivity signUpActivity0, State state0) {
        this.a = signUpActivity0;
        this.b = state0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((PaddingValues)object0), "paddingValues");
        if((v & 14) == 0) {
            v |= (composer0.changed(((PaddingValues)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF339747F, v, -1, "com.kakao.tistory.presentation.view.signup.SignUpActivity.Content.<anonymous> (SignUpActivity.kt:96)");
        }
        Modifier modifier0 = PaddingKt.padding(Modifier.Companion, ((PaddingValues)object0));
        State state0 = this.b;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer0, 0);
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
        Function2 function20 = a.a(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            d.a(v1, composer0, v1, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        switch(SignUpActivity.Content.2.WhenMappings.$EnumSwitchMapping$0[SignUpActivity.access$Content$lambda$0(state0).getPageType().ordinal()]) {
            case 1: {
                composer0.startReplaceGroup(0xD9547460);
                SignUpScreenKt.SignUpScreen(SignUpActivity.access$Content$lambda$0(state0), composer0, 8);
                composer0.endReplaceGroup();
                break;
            }
            case 2: {
                composer0.startReplaceGroup(0xD9547D49);
                SignUpUsedEmailScreenKt.SignUpUsedEmailScreen(SignUpActivity.access$Content$lambda$0(state0), composer0, 8);
                composer0.endReplaceGroup();
                break;
            }
            default: {
                composer0.startReplaceGroup(1362879031);
                composer0.endReplaceGroup();
            }
        }
        composer0.endNode();
        BackHandlerKt.BackHandler(false, SignUpActivity.access$Content$lambda$0(this.b).getOnClickBack(), composer0, 0, 1);
        SharedFlow sharedFlow0 = SignUpActivity.access$getSignUpViewModel(this.a).getEvent();
        SignUpActivity.access$EventHandler(this.a, sharedFlow0, composer0, 72);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

