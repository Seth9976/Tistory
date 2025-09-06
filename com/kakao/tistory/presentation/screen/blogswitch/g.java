package com.kakao.tistory.presentation.screen.blogswitch;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.domain.entity.Blog;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function2 {
    public final List a;
    public final List b;
    public final Blog c;
    public final Blog d;
    public final Function2 e;
    public final Modifier f;
    public final PaddingValues g;
    public final int h;
    public final int i;

    public g(List list0, List list1, Blog blog0, Blog blog1, Function2 function20, Modifier modifier0, PaddingValues paddingValues0, int v, int v1) {
        this.a = list0;
        this.b = list1;
        this.c = blog0;
        this.d = blog1;
        this.e = function20;
        this.f = modifier0;
        this.g = paddingValues0;
        this.h = v;
        this.i = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogSwitchBottomSheetKt.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, ((Composer)object0), (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)), this.i);
        return Unit.INSTANCE;
    }
}

