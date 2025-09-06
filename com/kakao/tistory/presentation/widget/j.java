package com.kakao.tistory.presentation.widget;

import a;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnitKt;
import c;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function3 {
    public final State a;
    public final Function0 b;
    public final TopViewModel c;

    public j(State state0, Function0 function00, TopViewModel topViewModel0) {
        this.a = state0;
        this.b = function00;
        this.c = topViewModel0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$CommonTitleView");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((RowScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2507EF25, v, -1, "com.kakao.tistory.presentation.widget.TitleWithCategoryView.<anonymous> (CommonTitle.kt:100)");
        }
        String s = CommonTitleKt.access$TitleWithCategoryView$lambda$5(this.a);
        if(s != null) {
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = SemanticsModifierKt.semantics(ClickableKt.clickable-XHw0xAI$default(PaddingKt.padding-qDBjuR0$default(((RowScope)object0).align(modifier$Companion0, Alignment.Companion.getBottom()), 0.0f, 0.0f, 0.0f, 22.0f, 7, null), false, null, null, new h(this.b, this.c), 7, null), true, i.a);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), ((Composer)object1), 0x30);
            int v1 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object1), 0);
            CompositionLocalMap compositionLocalMap0 = ((Composer)object1).getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(((Composer)object1), modifier0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
            TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(((Composer)object1), MaterialTheme.$stable).getH5();
            TextUnitKt.checkArithmetic--R2X_6o(0x13F000000L);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, null, 0L, 0L, null, null, null, 0x1BF000000L, null, null, 0L, 0, false, false, 0, 0, null, textStyle0, ((Composer)object1), 0, 0xC00, 0x1DF7E);
            c.a(6.0f, modifier$Companion0, ((Composer)object1), 6);
            ImageKt.Image(PainterResources_androidKt.painterResource(drawable.ic_list_fold, ((Composer)object1), 0), null, null, null, null, 0.0f, null, ((Composer)object1), 56, 0x7C);
            ((Composer)object1).endNode();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

