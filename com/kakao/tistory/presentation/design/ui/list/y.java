package com.kakao.tistory.presentation.design.ui.list;

import a;
import androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.screen.home.ui.common.PlaceHolderKt;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function3 {
    public final TextStyle a;
    public final int b;
    public final int c;
    public final int d;

    public y(TextStyle textStyle0, int v, int v1, int v2) {
        this.a = textStyle0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v1;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BoxWithConstraintsScope)object0), "$this$BoxWithConstraints");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((BoxWithConstraintsScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1706345013, v, -1, "com.kakao.tistory.presentation.design.ui.list.EntryListItemInfo.<anonymous>.<anonymous> (EntryListItemInfo.kt:100)");
        }
        if(Float.isNaN(((BoxWithConstraintsScope)object0).getMaxWidth-D9Ej5fM()) || Dp.compareTo-0680j_4(((BoxWithConstraintsScope)object0).getMaxWidth-D9Ej5fM(), 171.0f) > 0) {
            v1 = 4;
        }
        else if(Dp.compareTo-0680j_4(((BoxWithConstraintsScope)object0).getMaxWidth-D9Ej5fM(), 149.0f) > 0) {
            v1 = 3;
        }
        else {
            v1 = 2;
        }
        long v2 = this.a.getFontSize-XSAIIZE();
        Modifier modifier0 = PlaceHolderKt.placeholder-YV-b6Qo(Modifier.Companion, v2, 0L, 0.0f, 0, ((Composer)object1), 6, 14);
        HorizontalOrVertical arrangement$HorizontalOrVertical0 = Arrangement.INSTANCE.spacedBy-0680j_4(10.0f);
        int v3 = this.b;
        TextStyle textStyle0 = this.a;
        int v4 = this.c;
        int v5 = this.d;
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(arrangement$HorizontalOrVertical0, Alignment.Companion.getCenterVertically(), ((Composer)object1), 54);
        int v6 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object1), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object1).getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(((Composer)object1), modifier0);
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
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v6)) {
            d.a(v6, composer0, v6, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        EntryListItemInfoKt.access$LikeCount(v3, v1, textStyle0, ((Composer)object1), 0x180, 0);
        EntryListItemInfoKt.access$CommentCount(v4, v1, textStyle0, ((Composer)object1), 0x180, 0);
        EntryListItemInfoKt.access$EntryInfoCount(StringResources_androidKt.stringResource(string.label_view_count, ((Composer)object1), 0), v5, v1, textStyle0, ((Composer)object1), 0xC00, 0);
        ((Composer)object1).endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

