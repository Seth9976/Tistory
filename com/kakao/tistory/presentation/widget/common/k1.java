package com.kakao.tistory.presentation.widget.common;

import androidx.compose.ui.text.AnnotatedString.Range;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.p;

public final class k1 extends Lambda implements Function1 {
    public final AnnotatedString a;
    public final Function1 b;

    public k1(AnnotatedString annotatedString0, Function1 function10) {
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
            if(!p.isBlank(annotatedString$Range0.getTag())) {
                function10.invoke(annotatedString$Range0.getTag());
            }
        }
        return Unit.INSTANCE;
    }
}

