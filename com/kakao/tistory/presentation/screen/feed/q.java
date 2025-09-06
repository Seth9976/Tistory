package com.kakao.tistory.presentation.screen.feed;

import android.content.Context;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel.Type;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function1 {
    public final Context a;

    public q(Context context0) {
        this.a = context0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        NavigatorExtensionKt.goToBlogFollow(this.a, ((String)object0), Type.FOLLOWER);
        return Unit.INSTANCE;
    }
}

