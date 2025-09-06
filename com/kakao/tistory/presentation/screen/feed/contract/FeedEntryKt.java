package com.kakao.tistory.presentation.screen.feed.contract;

import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.Thumbnail;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001A,\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¨\u0006\t"}, d2 = {"toEntryItem", "Lcom/kakao/tistory/presentation/screen/feed/contract/FeedEntry;", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "onClickBlog", "Lkotlin/Function0;", "", "onClickEntry", "Lkotlin/Function1;", "", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class FeedEntryKt {
    @NotNull
    public static final FeedEntry toEntryItem(@NotNull EntryItem entryItem0, @NotNull Function0 function00, @NotNull Function1 function10) {
        ThumbnailUiState thumbnailUiState1;
        Intrinsics.checkNotNullParameter(entryItem0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "onClickBlog");
        Intrinsics.checkNotNullParameter(function10, "onClickEntry");
        Long long0 = entryItem0.getId();
        long v = long0 == null ? -1L : ((long)long0);
        Blog blog0 = entryItem0.getBlog();
        ThumbnailUiState thumbnailUiState0 = null;
        if(blog0 == null) {
            thumbnailUiState1 = null;
        }
        else {
            String s = blog0.getLogoImageUrl();
            thumbnailUiState1 = s == null ? null : ThumbnailUiStateKt.toBlogThumbnailItem(s);
        }
        String s1 = entryItem0.getBlogTitle() == null ? "" : entryItem0.getBlogTitle();
        String s2 = entryItem0.getTitle() == null ? "" : entryItem0.getTitle();
        String s3 = entryItem0.getSummary() == null ? "" : entryItem0.getSummary();
        Thumbnail thumbnail0 = entryItem0.getThumbnail();
        if(thumbnail0 != null) {
            String s4 = thumbnail0.getOrigin();
            if(s4 != null) {
                thumbnailUiState0 = thumbnail0.getSmall() == null || thumbnail0.getMedium() == null || thumbnail0.getLarge() == null ? ThumbnailUiStateKt.toThumbnailItem(s4) : new ThumbnailUiState(s4, (thumbnail0.getLarge() == null ? s4 : thumbnail0.getLarge()), (thumbnail0.getMedium() == null ? s4 : thumbnail0.getMedium()), (thumbnail0.getSmall() == null ? s4 : thumbnail0.getSmall()));
            }
        }
        int v1 = (int)entryItem0.getLikeCount();
        int v2 = (int)entryItem0.getCommentCount();
        String s5 = entryItem0.getPublished();
        return s5 == null ? new FeedEntry(v, thumbnailUiState1, s1, function00, s2, s3, thumbnailUiState0, function10, v1, v2, "") : new FeedEntry(v, thumbnailUiState1, s1, function00, s2, s3, thumbnailUiState0, function10, v1, v2, s5);
    }
}

