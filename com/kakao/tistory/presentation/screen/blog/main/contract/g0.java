package com.kakao.tistory.presentation.screen.blog.main.contract;

import com.kakao.tistory.domain.blog.entity.BlogInfo;
import com.kakao.tistory.presentation.screen.item.GuestbookExtra;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g0 extends Lambda implements Function0 {
    public final Function1 a;
    public final BlogInfo b;

    public g0(Function1 function10, BlogInfo blogInfo0) {
        this.a = function10;
        this.b = blogInfo0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String s = this.b.getRole().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(s, "toLowerCase(...)");
        GuestbookExtra guestbookExtra0 = new GuestbookExtra(this.b.getName(), this.b.getId(), s, null, this.b.isBlocked(), this.b.getAllowWriteOnGuestbook());
        this.a.invoke(guestbookExtra0);
        return Unit.INSTANCE;
    }
}

