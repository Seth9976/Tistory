package com.kakao.tistory.presentation.screen.blog.main;

import androidx.activity.result.ActivityResult;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f0 extends Lambda implements Function1 {
    public final BlogMainUiState a;

    public f0(BlogMainUiState blogMainUiState0) {
        this.a = blogMainUiState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ActivityResult)object0), "<anonymous parameter 0>");
        this.a.getRefreshChallenge().invoke();
        return Unit.INSTANCE;
    }
}

