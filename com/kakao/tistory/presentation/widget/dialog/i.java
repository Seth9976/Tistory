package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.domain.entity.Blog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function2 {
    public final Blog a;
    public final Function0 b;
    public final Function0 c;
    public final Function0 d;
    public final int e;

    public i(Blog blog0, Function0 function00, Function0 function01, Function0 function02, int v) {
        this.a = blog0;
        this.b = function00;
        this.c = function01;
        this.d = function02;
        this.e = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogDialogKt.DefaultBlogDialog(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)));
        return Unit.INSTANCE;
    }
}

