package com.kakao.tistory.presentation.widget.entry;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.domain.entity.Blog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function2 {
    public final Modifier a;
    public final String b;
    public final Blog c;
    public final int d;
    public final int e;

    public b(Modifier modifier0, String s, Blog blog0, int v, int v1) {
        this.a = modifier0;
        this.b = s;
        this.c = blog0;
        this.d = v;
        this.e = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        EntryBlogInfoKt.EntryBlogInfo(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)), this.e);
        return Unit.INSTANCE;
    }
}

