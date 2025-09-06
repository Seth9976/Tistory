package com.kakao.tistory.presentation.view.search;

import a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.StringExtensionKt;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h1 extends Lambda implements Function2 {
    public final Modifier a;
    public final String b;
    public final long c;

    public h1(Modifier modifier0, String s, long v) {
        this.a = modifier0;
        this.b = s;
        this.c = v;
        super(2);
    }

    public final void a(Composer composer0, int v) {
        long v3;
        if((v & 11) == 2 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(457017688, v, -1, "com.kakao.tistory.presentation.view.search.SearchCountText.<anonymous> (SearchResultListFragment.kt:393)");
        }
        String s = this.b;
        long v1 = this.c;
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer0, 0);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier0 = ComposedModifierKt.materializeModifier(composer0, this.a);
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
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            d.a(v2, composer0, v2, function20);
        }
        r0.a.z(composeUiNode$Companion0, composer0, modifier0, composer0, 0x7F48636F);
        if(s == null) {
            v3 = v1;
        }
        else {
            v3 = v1;
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.label_search_result_blog_prefix, composer0, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer0, 0, 0, 0x1FFFE);
            TextKt.Text--4IGK_g(s, SizeKt.widthIn-VpY3zN4$default(Modifier.Companion, 0.0f, 135.0f, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, composer0, 0x30, 0xC30, 0x1D7FC);
            TextKt.Text--4IGK_g(androidx.room.a.z(StringResources_androidKt.stringResource(string.label_search_result_blog_postfix, composer0, 0), " "), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer0, 0, 0, 0x1FFFE);
        }
        composer0.endReplaceGroup();
        composer0.startReplaceGroup(0x7F48A518);
        Builder annotatedString$Builder0 = new Builder(0, 1, null);
        int v4 = annotatedString$Builder0.pushStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFB, null));
        try {
            annotatedString$Builder0.append(StringExtensionKt.toFormattedString$default(v3, 0, 1, null));
        }
        finally {
            annotatedString$Builder0.pop(v4);
        }
        annotatedString$Builder0.append(" ");
        annotatedString$Builder0.append(StringResources_androidKt.stringResource(string.label_search_result_count, composer0, 0));
        AnnotatedString annotatedString0 = annotatedString$Builder0.toAnnotatedString();
        composer0.endReplaceGroup();
        TextKt.Text-IbK3jfQ(annotatedString0, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer0, 0, 0, 0x3FFFE);
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        this.a(((Composer)object0), ((Number)object1).intValue());
        return Unit.INSTANCE;
    }
}

