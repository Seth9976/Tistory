package com.kakao.tistory.presentation.screen.feed.ui;

import android.util.LongSparseArray;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.domain.entity.entry.LikeState;
import com.kakao.tistory.presentation.screen.feed.contract.FeedEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function4 {
    public final LazyPagingItems a;
    public final State b;
    public final State c;

    public f(LazyPagingItems lazyPagingItems0, State state0, State state1) {
        this.a = lazyPagingItems0;
        this.b = state0;
        this.c = state1;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        int v3;
        int v2;
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
            ComposerKt.traceEventStart(0x80F77F03, v1, -1, "com.kakao.tistory.presentation.screen.feed.ui.FeedList.<anonymous>.<anonymous> (FeedList.kt:37)");
        }
        Object object4 = this.a.get(v);
        if(((FeedEntry)object4) != null) {
            State state0 = this.c;
            LongSparseArray longSparseArray0 = FeedListKt.access$FeedList$lambda$0(this.b);
            if(longSparseArray0 == null) {
                v2 = ((FeedEntry)object4).getLikeCount();
            }
            else {
                LikeState likeState0 = (LikeState)longSparseArray0.get(((FeedEntry)object4).getId());
                v2 = likeState0 == null ? ((FeedEntry)object4).getLikeCount() : ((int)likeState0.getLikeCount());
            }
            LongSparseArray longSparseArray1 = FeedListKt.access$FeedList$lambda$1(state0);
            if(longSparseArray1 == null) {
                v3 = ((FeedEntry)object4).getCommentCount();
            }
            else {
                Long long0 = (Long)longSparseArray1.get(((FeedEntry)object4).getId());
                v3 = long0 == null ? ((FeedEntry)object4).getCommentCount() : ((int)(((long)long0)));
            }
            FeedListKt.access$FeedItem(v, FeedEntry.copy$default(((FeedEntry)object4), 0L, null, null, null, null, null, null, null, v2, v3, null, 0x4FF, null), ((Composer)object2), v1 >> 3 & 14);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

