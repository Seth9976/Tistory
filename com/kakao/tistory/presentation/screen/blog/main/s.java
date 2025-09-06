package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo.Others;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function0 {
    public final BlogMainUiState a;

    public s(BlogMainUiState blogMainUiState0) {
        this.a = blogMainUiState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.getOnDismissDialog().invoke();
        BlogMainInfo blogMainInfo0 = this.a.getInfo();
        Others blogMainInfo$Others0 = blogMainInfo0 instanceof Others ? ((Others)blogMainInfo0) : null;
        if(blogMainInfo$Others0 != null) {
            Function1 function10 = blogMainInfo$Others0.getOnConfirmBlockChange();
            if(function10 != null) {
                function10.invoke(Boolean.FALSE);
            }
        }
        return Unit.INSTANCE;
    }
}

