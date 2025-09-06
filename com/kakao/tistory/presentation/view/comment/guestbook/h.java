package com.kakao.tistory.presentation.view.comment.guestbook;

import com.kakao.tistory.data.datasource.comment.GuestbookDataSource;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function0 {
    public final GuestbookViewModel a;

    public h(GuestbookViewModel guestbookViewModel0) {
        this.a = guestbookViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        GuestbookDataSource guestbookDataSource0 = new GuestbookDataSource(this.a.F, this.a.getQuery());
        this.a.setDataSource(guestbookDataSource0);
        return guestbookDataSource0;
    }
}

