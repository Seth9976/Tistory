package com.kakao.tistory.presentation.screen.blogswitch;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.screen.blogswitch.navigation.BlogSwitchType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function2 {
    public final String a;
    public final String b;
    public final BlogSwitchType c;
    public final Function0 d;
    public final Function0 e;
    public final Function0 f;
    public final BlogSwitchViewModel g;
    public final int h;
    public final int i;

    public o(String s, String s1, BlogSwitchType blogSwitchType0, Function0 function00, Function0 function01, Function0 function02, BlogSwitchViewModel blogSwitchViewModel0, int v, int v1) {
        this.a = s;
        this.b = s1;
        this.c = blogSwitchType0;
        this.d = function00;
        this.e = function01;
        this.f = function02;
        this.g = blogSwitchViewModel0;
        this.h = v;
        this.i = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogSwitchBottomSheetKt.BlogSwitchBottomSheet(this.a, this.b, this.c, this.d, this.e, this.f, this.g, ((Composer)object0), (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)), this.i);
        return Unit.INSTANCE;
    }
}

