package com.kakao.tistory.presentation.view.search;

import android.util.LongSparseArray;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.domain.entity.SearchResultItem.BlogItem;
import com.kakao.tistory.domain.entity.SearchResultItem.Empty;
import com.kakao.tistory.domain.entity.SearchResultItem.Post;
import com.kakao.tistory.domain.entity.SearchResultItem.Top;
import com.kakao.tistory.domain.entity.SearchResultItem;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.domain.entity.entry.LikeState;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.viewmodel.SearchResultViewModel;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class n1 extends Lambda implements Function4 {
    public final LazyPagingItems a;
    public final TopViewModel b;
    public final SearchResultViewModel c;
    public final String d;
    public final State e;
    public final State f;

    public n1(LazyPagingItems lazyPagingItems0, TopViewModel topViewModel0, SearchResultViewModel searchResultViewModel0, String s, State state0, State state1) {
        this.a = lazyPagingItems0;
        this.b = topViewModel0;
        this.c = searchResultViewModel0;
        this.d = s;
        this.e = state0;
        this.f = state1;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        long v4;
        long v3;
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((LazyItemScope)object0), "$this$items");
        if((v1 & 0x70) == 0) {
            v1 |= (((Composer)object2).changed(v) ? 0x20 : 16);
        }
        if((v1 & 721) == 0x90 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDF60475F, v1, -1, "com.kakao.tistory.presentation.view.search.SearchResultList.<anonymous>.<anonymous> (SearchResultListFragment.kt:242)");
        }
        Long long0 = null;
        SearchResultItem searchResultItem0 = (SearchResultItem)this.a.get(v);
        if(searchResultItem0 instanceof Top) {
            ((Composer)object2).startReplaceGroup(1093895657);
            SearchResultListFragmentKt.access$SearchTop(((Top)searchResultItem0), this.b, ((Composer)object2), 72);
        }
        else if(searchResultItem0 instanceof Post) {
            ((Composer)object2).startReplaceGroup(-448879069);
            EntryItem entryItem0 = ((Post)searchResultItem0).getEntryItem();
            if(entryItem0 != null) {
                String s = this.d;
                SearchResultViewModel searchResultViewModel0 = this.c;
                State state0 = this.f;
                LongSparseArray longSparseArray0 = SearchResultListFragmentKt.access$SearchResultList$lambda$14(this.e);
                long v2 = -1L;
                if(longSparseArray0 == null) {
                    v3 = entryItem0.getLikeCount();
                }
                else {
                    Long long1 = entryItem0.getId();
                    LikeState likeState0 = (LikeState)longSparseArray0.get((long1 == null ? -1L : ((long)long1)));
                    v3 = likeState0 == null ? entryItem0.getLikeCount() : likeState0.getLikeCount();
                }
                LongSparseArray longSparseArray1 = SearchResultListFragmentKt.access$SearchResultList$lambda$15(state0);
                if(longSparseArray1 != null) {
                    Long long2 = entryItem0.getId();
                    if(long2 != null) {
                        v2 = (long)long2;
                    }
                    long0 = (Long)longSparseArray1.get(v2);
                }
                if(long0 == null) {
                    v4 = entryItem0.getCommentCount();
                }
                else {
                    Intrinsics.checkNotNull(long0);
                    v4 = (long)long0;
                }
                SearchResultListFragmentKt.access$SearchPostResult(v, ((EntryItem)SearchResultListFragmentKt.access$getUpdatedEntry(entryItem0, v3, v4, ((Composer)object2), 0).getValue()), s, searchResultViewModel0.isBlogSearch(), searchResultViewModel0, ((Composer)object2), v1 >> 3 & 14 | 0x8000);
            }
        }
        else if(searchResultItem0 instanceof BlogItem) {
            ((Composer)object2).startReplaceGroup(1093921753);
            SearchResultListFragmentKt.access$SearchBlogResult(((BlogItem)searchResultItem0), this.c, ((Composer)object2), 72);
        }
        else if(searchResultItem0 instanceof Empty) {
            ((Composer)object2).startReplaceGroup(0x4133F791);
            SearchKeywordFragmentKt.SearchEmptyView(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), string.label_search_result_empty, ((Composer)object2), 6, 0);
        }
        else {
            ((Composer)object2).startReplaceGroup(0xE54D52D4);
        }
        ((Composer)object2).endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

