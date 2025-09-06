package com.kakao.tistory.presentation.view.comment.guestbook;

import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.screen.item.GuestbookExtra;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final GuestbookActivity a;

    public a(GuestbookActivity guestbookActivity0) {
        this.a = guestbookActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((GuestbookExtra)object0), "it");
        NavigatorExtensionKt.goToPinGuestBook(this.a, ((GuestbookExtra)object0), 10005);
        return Unit.INSTANCE;
    }
}

