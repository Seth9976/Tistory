package com.kakao.tistory.presentation.screen.blog.noticeList.contract;

import com.kakao.tistory.domain.blog.entity.EntryRestrictType;
import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.domain.blog.entity.Notice;
import com.kakao.tistory.domain.common.Thumbnail;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Visibility;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogEntry;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEntryRestrictTypeKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.RestrictType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001AZ\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042 \u0010\u0005\u001A\u001C\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u00062$\u0010\u000B\u001A \u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f¨\u0006\u000E"}, d2 = {"toBlogEntry", "Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogEntry;", "Lcom/kakao/tistory/domain/blog/entity/Notice;", "isMyBlog", "", "onClick", "Lkotlin/Function3;", "", "", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/RestrictType;", "", "onLongClick", "Lkotlin/Function4;", "Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class BlogNoticeKt {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[EntryVisibilityType.values().length];
            try {
                arr_v[EntryVisibilityType.PRIVATE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @NotNull
    public static final BlogEntry toBlogEntry(@NotNull Notice notice0, boolean z, @NotNull Function3 function30, @NotNull Function4 function40) {
        Intrinsics.checkNotNullParameter(notice0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "onClick");
        Intrinsics.checkNotNullParameter(function40, "onLongClick");
        EntryRestrictType entryRestrictType0 = notice0.getRestrictType();
        a a0 = null;
        RestrictType restrictType0 = entryRestrictType0 == null ? null : BlogMainEntryRestrictTypeKt.toState(entryRestrictType0);
        Visibility entryListUiState$Visibility0 = WhenMappings.$EnumSwitchMapping$0[notice0.getVisibility().ordinal()] == 1 ? Visibility.PRIVATE : Visibility.NORMAL;
        long v = notice0.getId();
        String s = notice0.getTitle();
        String s1 = notice0.getSummary();
        Thumbnail thumbnail0 = notice0.getThumbnail();
        ThumbnailUiState thumbnailUiState0 = thumbnail0 == null ? null : ThumbnailUiStateKt.toItem(thumbnail0);
        int v1 = notice0.getLikeCount();
        String s2 = notice0.getPublished();
        if(z) {
            a0 = new a(function40, notice0);
        }
        return new BlogEntry(v, z, restrictType0, false, s, s1, thumbnailUiState0, new b(function30, notice0, restrictType0), a0, v1, null, s2, false, entryListUiState$Visibility0);
    }
}

