package com.kakao.tistory.presentation.screen.blog.noticeList;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.screen.blog.navigation.NavActions;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function2 {
    public final BlogNoticeListViewModel a;
    public final NavActions b;
    public final int c;

    public q(BlogNoticeListViewModel blogNoticeListViewModel0, NavActions navActions0, int v) {
        this.a = blogNoticeListViewModel0;
        this.b = navActions0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogNoticeListScreenKt.a(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

