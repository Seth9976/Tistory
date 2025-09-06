package com.kakao.tistory.presentation.widget.common;

import androidx.compose.ui.text.AnnotatedString.Range;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g2 extends Lambda implements Function1 {
    public final AnnotatedString a;
    public final Function1 b;

    public g2(AnnotatedString annotatedString0, Function1 function10) {
        this.a = annotatedString0;
        this.b = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v = ((Number)object0).intValue();
        Range annotatedString$Range0 = (Range)CollectionsKt___CollectionsKt.firstOrNull(this.a.getStringAnnotations(v, v));
        if(annotatedString$Range0 != null) {
            Function1 function10 = this.b;
            if(Intrinsics.areEqual(annotatedString$Range0.getTag(), "link")) {
                function10.invoke(annotatedString$Range0.getItem());
            }
        }
        return Unit.INSTANCE;
    }
}

