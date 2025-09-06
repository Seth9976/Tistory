package com.kakao.tistory.presentation.screen.blogswitch;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.domain.entity.Blog;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function2 {
    public final Blog a;
    public final Blog b;
    public final List c;
    public final List d;
    public final Function0 e;
    public final Function2 f;
    public final int g;

    public s(Blog blog0, Blog blog1, List list0, List list1, Function0 function00, Function2 function20, int v) {
        this.a = blog0;
        this.b = blog1;
        this.c = list0;
        this.d = list1;
        this.e = function00;
        this.f = function20;
        this.g = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogSwitchBottomSheetKt.access$BlogSwitchBottomSheetNormal(this.a, this.b, this.c, this.d, this.e, this.f, ((Composer)object0), (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)));
        return Unit.INSTANCE;
    }
}

