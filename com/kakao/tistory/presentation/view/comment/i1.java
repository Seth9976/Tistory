package com.kakao.tistory.presentation.view.comment;

import android.content.Context;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.common.redirect.RedirectUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i1 extends Lambda implements Function1 {
    public final CommentFragment a;

    public i1(CommentFragment commentFragment0) {
        this.a = commentFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(((String)object0) != null) {
            Context context0 = this.a.getContext();
            if(context0 != null) {
                Intrinsics.checkNotNull(context0);
                NavigatorExtensionKt.goToRedirect(context0, RedirectUtils.createRedirectData$default(RedirectUtils.INSTANCE, ((String)object0), false, 2, null));
            }
        }
        return Unit.INSTANCE;
    }
}

