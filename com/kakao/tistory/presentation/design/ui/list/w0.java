package com.kakao.tistory.presentation.design.ui.list;

import a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import b;
import com.kakao.tistory.presentation.design.ui.thumbnail.EntryThumbnailKt;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class w0 extends Lambda implements Function3 {
    public final ThumbnailUiState a;
    public final ThumbnailUiState b;
    public final String c;
    public final Function0 d;
    public final boolean e;
    public final AnnotatedString f;
    public final AnnotatedString g;
    public final int h;
    public final Integer i;
    public final String j;

    public w0(ThumbnailUiState thumbnailUiState0, ThumbnailUiState thumbnailUiState1, String s, Function0 function00, boolean z, AnnotatedString annotatedString0, AnnotatedString annotatedString1, int v, Integer integer0, String s1) {
        this.a = thumbnailUiState0;
        this.b = thumbnailUiState1;
        this.c = s;
        this.d = function00;
        this.e = z;
        this.f = annotatedString0;
        this.g = annotatedString1;
        this.h = v;
        this.i = integer0;
        this.j = s1;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v3;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$EntryListItemContainer");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2002692201, v, -1, "com.kakao.tistory.presentation.design.ui.list.EntryListItemWithLargeImage.<anonymous> (EntryList.kt:205)");
        }
        ThumbnailUiState thumbnailUiState0 = this.a;
        ThumbnailUiState thumbnailUiState1 = this.b;
        String s = this.c;
        Function0 function00 = this.d;
        boolean z = this.e;
        AnnotatedString annotatedString0 = this.f;
        AnnotatedString annotatedString1 = this.g;
        int v1 = this.h;
        Companion modifier$Companion0 = Modifier.Companion;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), ((Composer)object1), 0);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object1), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object1).getCurrentCompositionLocalMap();
        Modifier modifier0 = ComposedModifierKt.materializeModifier(((Composer)object1), modifier$Companion0);
        String s1 = this.j;
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Integer integer0 = this.i;
        Function0 function01 = composeUiNode$Companion0.getConstructor();
        if(((Composer)object1).getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        ((Composer)object1).startReusableNode();
        if(((Composer)object1).getInserting()) {
            ((Composer)object1).createNode(function01);
        }
        else {
            ((Composer)object1).useNode();
        }
        Composer composer0 = Updater.constructor-impl(((Composer)object1));
        Function2 function20 = a.a(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting()) {
            v3 = v1;
            d.a(v2, composer0, v2, function20);
        }
        else {
            v3 = v1;
            if(!Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
                d.a(v2, composer0, v2, function20);
            }
        }
        Updater.set-impl(composer0, modifier0, composeUiNode$Companion0.getSetModifier());
        EntryThumbnailKt.EntryThumbnail-T-dY9a0(thumbnailUiState0, SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), null, null, ((Composer)object1), 0x30, 12);
        SpacerKt.Spacer(SizeKt.size-3ABfNKs(modifier$Companion0, 14.0f), ((Composer)object1), 6);
        BlogTitleKt.BlogTitleWithThumbnail(thumbnailUiState1, s, null, null, function00, z, ((Composer)object1), 0, 12);
        EntryListItemBodyKt.EntryTitleAndSummary(annotatedString0, annotatedString1, ((Composer)object1), 0, 0);
        b.a(14.0f, modifier$Companion0, ((Composer)object1), 6);
        EntryListItemInfoKt.EntryListItemInfo(v3, integer0, s1, false, null, ((Composer)object1), 0, 24);
        ((Composer)object1).endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

