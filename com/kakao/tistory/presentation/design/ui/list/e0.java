package com.kakao.tistory.presentation.design.ui.list;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e0 extends Lambda implements Function2 {
    public final int a;
    public final int b;
    public final TextStyle c;
    public final int d;
    public final int e;

    public e0(int v, int v1, TextStyle textStyle0, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = textStyle0;
        this.d = v2;
        this.e = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        EntryListItemInfoKt.access$LikeCount(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)), this.e);
        return Unit.INSTANCE;
    }
}

