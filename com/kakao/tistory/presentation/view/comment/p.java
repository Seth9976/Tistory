package com.kakao.tistory.presentation.view.comment;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function2 {
    public final CommentFragment a;
    public final float b;
    public final int c;
    public final int d;

    public p(CommentFragment commentFragment0, float f, int v, int v1) {
        this.a = commentFragment0;
        this.b = f;
        this.c = v;
        this.d = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        CommentFragment.access$CommentDivider-kHDZbjc(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)), this.d);
        return Unit.INSTANCE;
    }
}

