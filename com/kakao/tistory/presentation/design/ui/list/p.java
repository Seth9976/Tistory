package com.kakao.tistory.presentation.design.ui.list;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function2 {
    public final AnnotatedString a;
    public final AnnotatedString b;
    public final int c;
    public final int d;

    public p(AnnotatedString annotatedString0, AnnotatedString annotatedString1, int v, int v1) {
        this.a = annotatedString0;
        this.b = annotatedString1;
        this.c = v;
        this.d = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        EntryListItemBodyKt.EntryTitleAndSummary(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)), this.d);
        return Unit.INSTANCE;
    }
}

