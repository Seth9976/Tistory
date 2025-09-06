package com.kakao.tistory.presentation.view.comment;

import androidx.compose.runtime.Composer;
import androidx.paging.LoadState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a1 extends Lambda implements Function2 {
    public final CommentFragment a;
    public final LoadState b;
    public final Function0 c;
    public final Function1 d;
    public final int e;

    public a1(CommentFragment commentFragment0, LoadState loadState0, Function0 function00, Function1 function10, int v) {
        this.a = commentFragment0;
        this.b = loadState0;
        this.c = function00;
        this.d = function10;
        this.e = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.a(this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)));
        return Unit.INSTANCE;
    }
}

