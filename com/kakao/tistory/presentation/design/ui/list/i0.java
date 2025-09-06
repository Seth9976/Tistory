package com.kakao.tistory.presentation.design.ui.list;

import a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.Dp;
import b;
import c;
import com.kakao.tistory.presentation.design.ui.thumbnail.EntryThumbnailKt;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i0 extends Lambda implements Function3 {
    public final ThumbnailUiState a;
    public final AnnotatedString b;
    public final int c;
    public final int d;
    public final int e;

    public i0(ThumbnailUiState thumbnailUiState0, AnnotatedString annotatedString0, int v, int v1, int v2) {
        this.a = thumbnailUiState0;
        this.b = annotatedString0;
        this.c = v;
        this.d = v1;
        this.e = v2;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$EntryListItemContainer");
        if((v & 81) == 16 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4F22AFA7, v, -1, "com.kakao.tistory.presentation.design.ui.list.EntryListCompactItem.<anonymous> (EntryList.kt:246)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null);
        ThumbnailUiState thumbnailUiState0 = this.a;
        AnnotatedString annotatedString0 = this.b;
        int v1 = this.c;
        int v2 = this.d;
        int v3 = this.e;
        Arrangement arrangement0 = Arrangement.INSTANCE;
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getTop(), composer0, 0);
        int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v4)) {
            d.a(v4, composer0, v4, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        Modifier modifier2 = RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null);
        MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer0, 0);
        int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap1 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier3 = ComposedModifierKt.materializeModifier(composer0, modifier2);
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
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v5)) {
            d.a(v5, composer0, v5, function21);
        }
        Updater.set-impl(composer0, modifier3, composeUiNode$Companion0.getSetModifier());
        EntryListItemBodyKt.EntryTitle(annotatedString0, 1, 0, null, composer0, 0x30, 12);
        b.a(8.0f, modifier$Companion0, composer0, 6);
        EntryListItemInfoKt.EntryListItemInfo(v1, v2, v3, composer0, 0);
        composer0.endNode();
        composer0.startReplaceGroup(0x34239ADB);
        if(thumbnailUiState0 != null) {
            c.a(16.0f, modifier$Companion0, composer0, 6);
            EntryThumbnailKt.EntryThumbnail-T-dY9a0(thumbnailUiState0, null, Dp.box-impl(72.0f), null, composer0, 0x180, 10);
        }
        if(m.a(composer0)) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

