package com.kakao.tistory.presentation.screen.blog.main;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.State;
import androidx.paging.ItemSnapshotList;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainCategory;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainChallengeList;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainNotice;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainStatistics;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainTopEntry;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainUiState;
import com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainCategoryKt;
import com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainChallengeKt;
import com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainInfoKt;
import com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainNoticeKt;
import com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainStatisticsKt;
import com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainTopEntryListKt;
import com.kakao.tistory.presentation.view.common.PagingItemListKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function1 {
    public final BlogMainUiState a;
    public final LazyPagingItems b;
    public final State c;

    public g(BlogMainUiState blogMainUiState0, LazyPagingItems lazyPagingItems0, State state0) {
        this.a = blogMainUiState0;
        this.b = lazyPagingItems0;
        this.c = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyColumn");
        BlogMainUiState blogMainUiState0 = this.a;
        for(Object object1: this.a.getContentList()) {
            if(object1 instanceof BlogMainInfo) {
                BlogMainInfoKt.blogMainInfo(((LazyListScope)object0), ((BlogMainInfo)object1));
            }
            else if(object1 instanceof BlogMainStatistics) {
                BlogMainStatisticsKt.blogMainStatistics-mxwnekA(((LazyListScope)object0), ((BlogMainStatistics)object1), com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfoKt.topGradientEndColor(blogMainUiState0.getInfo()));
            }
            else if(object1 instanceof BlogMainChallengeList) {
                BlogMainChallengeKt.blogMainChallengeList(((LazyListScope)object0), ((BlogMainChallengeList)object1));
            }
            else if(object1 instanceof BlogMainTopEntry) {
                BlogMainTopEntryListKt.blogMainTopEntryList(((LazyListScope)object0), ((BlogMainTopEntry)object1));
            }
            else if(object1 instanceof BlogMainCategory) {
                BlogMainCategoryKt.blogMainCategory(((LazyListScope)object0), ((BlogMainCategory)object1));
            }
            else if(object1 instanceof BlogMainNotice) {
                BlogMainNoticeKt.blogNotice(((LazyListScope)object0), ((BlogMainNotice)object1));
            }
        }
        List list0 = ((ItemSnapshotList)this.c.getValue()).getItems();
        PagingItemListKt.pagingItemList$default(((LazyListScope)object0), this.b, list0, 0, ComposableSingletons.BlogMainScreenKt.INSTANCE.getLambda-1$presentation_prodRelease(), 4, null);
        return Unit.INSTANCE;
    }
}

