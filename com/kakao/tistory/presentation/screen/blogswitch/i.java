package com.kakao.tistory.presentation.screen.blogswitch;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import com.kakao.tistory.domain.entity.Blog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function2 {
    public final Blog a;
    public final Blog b;
    public final Blog c;
    public final PaddingValues d;
    public final Function0 e;
    public final int f;

    public i(Blog blog0, Blog blog1, Blog blog2, PaddingValues paddingValues0, Function0 function00, int v) {
        this.a = blog0;
        this.b = blog1;
        this.c = blog2;
        this.d = paddingValues0;
        this.e = function00;
        this.f = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogSwitchBottomSheetKt.access$BlogListItem(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)));
        return Unit.INSTANCE;
    }
}

