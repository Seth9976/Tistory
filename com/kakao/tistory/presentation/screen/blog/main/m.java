package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainUiState;
import com.kakao.tistory.presentation.screen.blog.main.contract.BottomSheetType.EntryModify;
import com.kakao.tistory.presentation.screen.blog.main.contract.BottomSheetType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function0 {
    public final BlogMainUiState a;
    public final BottomSheetType b;

    public m(BlogMainUiState blogMainUiState0, BottomSheetType bottomSheetType0) {
        this.a = blogMainUiState0;
        this.b = bottomSheetType0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Function3 function30 = this.a.getModifyEntry();
        Long long0 = ((EntryModify)this.b).getEntryId();
        Boolean boolean0 = Boolean.valueOf(((EntryModify)this.b).isEntryModifiable());
        function30.invoke(this.a.getBlogName(), long0, boolean0);
        return Unit.INSTANCE;
    }
}

