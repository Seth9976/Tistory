package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoGuestBook;
import com.kakao.tistory.presentation.screen.item.GuestbookExtra;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class w2 extends Lambda implements Function1 {
    public final BlogMainViewModel a;

    public w2(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((GuestbookExtra)object0), "it");
        BlogMainTiara.INSTANCE.trackClickGuestBook();
        GoGuestBook blogMainEvent$GoGuestBook0 = new GoGuestBook(((GuestbookExtra)object0));
        this.a.sendEvent(blogMainEvent$GoGuestBook0);
        return Unit.INSTANCE;
    }
}

