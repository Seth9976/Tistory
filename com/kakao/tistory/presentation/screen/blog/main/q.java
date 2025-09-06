package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainUiState;
import com.kakao.tistory.presentation.screen.blog.main.contract.BottomSheetType.EntryModify;
import com.kakao.tistory.presentation.screen.blog.main.contract.BottomSheetType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function0 {
    public final BottomSheetType a;
    public final BlogMainUiState b;

    public q(BottomSheetType bottomSheetType0, BlogMainUiState blogMainUiState0) {
        this.a = bottomSheetType0;
        this.b = blogMainUiState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String s = ((EntryModify)this.a).getPassword();
        if(s != null) {
            this.b.getOnClickPassword().invoke(s);
        }
        return Unit.INSTANCE;
    }
}

