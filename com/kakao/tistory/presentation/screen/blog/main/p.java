package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainUiState;
import com.kakao.tistory.presentation.screen.blog.main.contract.BottomSheetType.EntryModify;
import com.kakao.tistory.presentation.screen.blog.main.contract.BottomSheetType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function1 {
    public final BlogMainUiState a;
    public final BottomSheetType b;

    public p(BlogMainUiState blogMainUiState0, BottomSheetType bottomSheetType0) {
        this.a = blogMainUiState0;
        this.b = bottomSheetType0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((EntryVisibilityType)object0), "visibilityType");
        Function4 function40 = this.a.getChangeVisibility();
        Long long0 = ((EntryModify)this.b).getEntryId();
        Boolean boolean0 = Boolean.valueOf(((EntryModify)this.b).isEntryModifiable());
        function40.invoke(this.a.getBlogName(), long0, boolean0, ((EntryVisibilityType)object0));
        return Unit.INSTANCE;
    }
}

