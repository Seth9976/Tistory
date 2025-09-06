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
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.utils.DateUtils.DateTimeFormat;
import com.kakao.tistory.presentation.screen.home.ui.common.PlaceHolderKt;
import com.kakao.tistory.presentation.widget.common.DateTimeTextKt;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function3 {
    public final TextStyle a;
    public final boolean b;
    public final Visibility c;
    public final int d;
    public final Integer e;
    public final String f;

    public b0(TextStyle textStyle0, boolean z, Visibility entryListUiState$Visibility0, int v, Integer integer0, String s) {
        this.a = textStyle0;
        this.b = z;
        this.c = entryListUiState$Visibility0;
        this.d = v;
        this.e = integer0;
        this.f = s;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        boolean z2;
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BoxWithConstraintsScope)object0), "$this$BoxWithConstraints");
        if((v & 14) == 0) {
            v |= (composer0.changed(((BoxWithConstraintsScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB11744D3, v, -1, "com.kakao.tistory.presentation.design.ui.list.EntryListItemInfo.<anonymous>.<anonymous> (EntryListItemInfo.kt:148)");
        }
        boolean z = Float.isNaN(((BoxWithConstraintsScope)object0).getMaxWidth-D9Ej5fM()) || Dp.compareTo-0680j_4(((BoxWithConstraintsScope)object0).getMaxWidth-D9Ej5fM(), 209.0f) > 0;
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PlaceHolderKt.placeholder-YV-b6Qo(modifier$Companion0, this.a.getFontSize-XSAIIZE(), 0L, 0.0f, 0, composer0, 6, 14);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        Arrangement arrangement0 = Arrangement.INSTANCE;
        HorizontalOrVertical arrangement$HorizontalOrVertical0 = arrangement0.spacedBy-0680j_4(3.0f);
        boolean z1 = this.b;
        int v1 = this.d;
        TextStyle textStyle0 = this.a;
        Integer integer0 = this.e;
        String s = this.f;
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(arrangement$HorizontalOrVertical0, alignment$Companion0.getCenterVertically(), composer0, 54);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Visibility entryListUiState$Visibility0 = this.c;
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
        if(composer0.getInserting()) {
            z2 = z1;
            d.a(v2, composer0, v2, function20);
        }
        else {
            z2 = z1;
            if(!Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
                d.a(v2, composer0, v2, function20);
            }
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.spacedBy-0680j_4(10.0f), alignment$Companion0.getTop(), composer0, 6);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap1 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier2 = ComposedModifierKt.materializeModifier(composer0, modifier$Companion0);
        Function0 function01 = composeUiNode$Companion0.getConstructor();
        if(composer0.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function01);
        }
        else {
            composer0.useNode();
        }
        Function2 function21 = a.a(composeUiNode$Companion0, composer0, measurePolicy1, composer0, compositionLocalMap1);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v3)) {
            d.a(v3, composer0, v3, function21);
        }
        Updater.set-impl(composer0, modifier2, composeUiNode$Companion0.getSetModifier());
        EntryListItemInfoKt.access$LikeCount(v1, 0, textStyle0, composer0, 0x180, 2);
        composer0.startReplaceGroup(0xBA6EDE31);
        if(integer0 != null) {
            EntryListItemInfoKt.access$CommentCount(((int)integer0), 0, textStyle0, composer0, 0x180, 2);
        }
        composer0.endReplaceGroup();
        DateTimeTextKt.DateTimeText-Vc6wB30(s, DateTimeFormat.DATE_TIME_FORMAT_yyyy_M_d, true, null, null, 0L, 0L, textStyle0, composer0, 0xC001B0, 120);
        composer0.endNode();
        composer0.startReplaceGroup(0xCFF84F3E);
        if(z2 && z) {
            EntryListItemInfoKt.access$EntryInfoIcon(drawable.ico_list_scheduled, StringResources_androidKt.stringResource(string.content_desc_scheduled, composer0, 0), composer0, 0, 0);
        }
        composer0.endReplaceGroup();
        composer0.startReplaceGroup(0xCFF86A87);
        if(entryListUiState$Visibility0.getIconRes() != null && z) {
            Integer integer1 = entryListUiState$Visibility0.getContentDesc();
            composer0.startReplaceGroup(0xCFF87DB5);
            String s1 = integer1 == null ? null : StringResources_androidKt.stringResource(integer1.intValue(), composer0, 0);
            composer0.endReplaceGroup();
            EntryListItemInfoKt.access$EntryInfoIcon(((int)entryListUiState$Visibility0.getIconRes()), s1, composer0, 0, 0);
        }
        if(m.a(composer0)) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

