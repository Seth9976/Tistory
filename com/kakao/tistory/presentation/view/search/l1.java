package com.kakao.tistory.presentation.view.search;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.design.ui.list.BlogTitleKt;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.viewmodel.SearchResultViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class l1 extends Lambda implements Function2 {
    public final EntryItem a;
    public final SearchResultViewModel b;

    public l1(EntryItem entryItem0, SearchResultViewModel searchResultViewModel0) {
        this.a = entryItem0;
        this.b = searchResultViewModel0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ThumbnailUiState thumbnailUiState0;
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2C38E513, v, -1, "com.kakao.tistory.presentation.view.search.SearchPostResult.<anonymous> (SearchResultListFragment.kt:336)");
        }
        Blog blog0 = this.a.getBlog();
        if(blog0 == null) {
            thumbnailUiState0 = null;
        }
        else {
            String s = blog0.getLogoImageUrl();
            thumbnailUiState0 = s == null ? null : ThumbnailUiStateKt.toBlogThumbnailItem(s);
        }
        String s1 = this.a.getBlogTitle();
        if(s1 == null) {
            s1 = "";
        }
        BlogTitleKt.BlogTitleWithThumbnail(thumbnailUiState0, s1, null, null, new k1(this.a, this.b), false, ((Composer)object0), 0, 44);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

