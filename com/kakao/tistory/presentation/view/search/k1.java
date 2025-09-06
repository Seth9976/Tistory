package com.kakao.tistory.presentation.view.search;

import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.viewmodel.SearchResultViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class k1 extends Lambda implements Function0 {
    public final EntryItem a;
    public final SearchResultViewModel b;

    public k1(EntryItem entryItem0, SearchResultViewModel searchResultViewModel0) {
        this.a = entryItem0;
        this.b = searchResultViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Blog blog0 = this.a.getBlog();
        if(blog0 != null) {
            this.b.onClickBlog(blog0, true);
        }
        return Unit.INSTANCE;
    }
}

