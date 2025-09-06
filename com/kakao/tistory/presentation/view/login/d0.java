package com.kakao.tistory.presentation.view.login;

import a;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d0 extends Lambda implements Function3 {
    public final Modifier a;
    public final TistroyLoginActivity b;
    public final FocusManager c;

    public d0(Modifier modifier0, TistroyLoginActivity tistroyLoginActivity0, FocusManager focusManager0) {
        this.a = modifier0;
        this.b = tistroyLoginActivity0;
        this.c = focusManager0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((PaddingValues)object0), "paddingValues");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((PaddingValues)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1824001606, v, -1, "com.kakao.tistory.presentation.view.login.TistroyLoginActivity.Content.<anonymous> (TistroyLoginActivity.kt:138)");
        }
        Modifier modifier0 = ScrollKt.verticalScroll$default(PaddingKt.padding(this.a, ((PaddingValues)object0)), ScrollKt.rememberScrollState(0, ((Composer)object1), 0, 1), false, null, false, 14, null);
        b0 b00 = new b0(this.c, null);
        Modifier modifier1 = SuspendingPointerInputFilterKt.pointerInput(modifier0, Unit.INSTANCE, b00);
        TistroyLoginActivity tistroyLoginActivity0 = this.b;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), ((Composer)object1), 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object1), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object1).getCurrentCompositionLocalMap();
        Modifier modifier2 = ComposedModifierKt.materializeModifier(((Composer)object1), modifier1);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(((Composer)object1).getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        ((Composer)object1).startReusableNode();
        if(((Composer)object1).getInserting()) {
            ((Composer)object1).createNode(function00);
        }
        else {
            ((Composer)object1).useNode();
        }
        Composer composer0 = Updater.constructor-impl(((Composer)object1));
        Function2 function20 = a.a(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            d.a(v1, composer0, v1, function20);
        }
        Updater.set-impl(composer0, modifier2, composeUiNode$Companion0.getSetModifier());
        TistroyLoginActivity.access$MigrationGuide(tistroyLoginActivity0, ((Composer)object1), 8);
        TistroyLoginActivity.access$TistoryLogin(tistroyLoginActivity0, ((Composer)object1), 8);
        ((Composer)object1).endNode();
        BackHandlerKt.BackHandler(false, new c0(this.b), ((Composer)object1), 0, 1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

