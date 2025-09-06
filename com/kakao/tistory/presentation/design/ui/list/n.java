package com.kakao.tistory.presentation.design.ui.list;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function2 {
    public final AnnotatedString a;
    public final int b;

    public n(AnnotatedString annotatedString0, int v) {
        this.a = annotatedString0;
        this.b = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        EntryListItemBodyKt.a(this.a, ((Composer)object0), (this.b | 1) & -920350135 | ((0x24924924 & (this.b | 1)) >> 1 | 306783378 & (this.b | 1)) | (306783378 & (this.b | 1)) << 1 & (0x24924924 & (this.b | 1)));
        return Unit.INSTANCE;
    }
}

