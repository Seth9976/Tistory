package com.kakao.tistory.presentation.screen.blogswitch;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchState;
import com.kakao.tistory.presentation.screen.blogswitch.navigation.BlogSwitchType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function2 {
    public final BlogSwitchType a;
    public final BlogSwitchState b;
    public final int c;

    public q(BlogSwitchType blogSwitchType0, BlogSwitchState blogSwitchState0, int v) {
        this.a = blogSwitchType0;
        this.b = blogSwitchState0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogSwitchBottomSheetKt.a(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

