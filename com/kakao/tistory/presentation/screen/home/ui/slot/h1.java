package com.kakao.tistory.presentation.screen.home.ui.slot;

import a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
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
import b;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Focus;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotEntryListItemKt;
import com.kakao.tistory.presentation.theme.TTextStyle;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import d;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h1 extends Lambda implements Function3 {
    public final Focus a;

    public h1(Focus homeSlotUiState$Focus0) {
        this.a = homeSlotUiState$Focus0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$SlotContainer");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDBD79E00, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.Focus.<anonymous> (Focus.kt:58)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 20.0f, 20.0f, 60.0f, 0.0f, 8, null);
        Focus homeSlotUiState$Focus0 = this.a;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), ((Composer)object1), 0);
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
        FocusKt.access$FocusMark(((Composer)object1), 0);
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(homeSlotUiState$Focus0.getTitle(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TTextStyle.INSTANCE.getSize30Weight800(), ((Composer)object1), 0x180, 0xC00000, 0x1FFFA);
        String s = homeSlotUiState$Focus0.getDescription();
        ((Composer)object1).startReplaceGroup(0x967FB071);
        if(s != null) {
            b.a(8.0f, modifier$Companion0, ((Composer)object1), 6);
            FocusKt.access$Description(s, ((Composer)object1), 0);
        }
        ((Composer)object1).endReplaceGroup();
        ((Composer)object1).endNode();
        int v2 = 0;
        for(Object object3: this.a.getContents()) {
            if(v2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            SlotEntryListItemKt.SlotEntryListItemWithBlogThumbnail(((com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Focus)object3), v2 != 0, ((Composer)object1), 0, 0);
            ++v2;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

