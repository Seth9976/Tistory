package com.kakao.tistory.presentation.screen.blog.main.contract;

import com.kakao.tistory.domain.blog.entity.Entry;
import com.kakao.tistory.domain.blog.entity.EntryRestrictType;
import com.kakao.tistory.domain.blog.entity.EntryScheduleStatusType;
import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.domain.common.Thumbnail;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Visibility;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogEntry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001Aù\u0001\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042y\u0010\u0006\u001Au\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000B\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000E\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000F\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u00072b\u0010\u0013\u001A^\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00120\u0014¨\u0006\u0019"}, d2 = {"toBlogEntry", "Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogEntry;", "Lcom/kakao/tistory/domain/blog/entity/Entry;", "isMyBlog", "", "isBlogOwner", "onClickEntry", "Lkotlin/Function5;", "", "Lkotlin/ParameterName;", "name", "id", "", "title", "pLink", "thumbnail", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/RestrictType;", "restrictType", "", "onLongClickEntry", "Lkotlin/Function4;", "entryId", "Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "visibility", "password", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class BlogMainEntryKt {
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
            try {
                arr_v[EntryVisibilityType.PROTECTED.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @NotNull
    public static final BlogEntry toBlogEntry(@NotNull Entry entry0, boolean z, boolean z1, @NotNull Function5 function50, @NotNull Function4 function40) {
        Intrinsics.checkNotNullParameter(entry0, "<this>");
        Intrinsics.checkNotNullParameter(function50, "onClickEntry");
        Intrinsics.checkNotNullParameter(function40, "onLongClickEntry");
        EntryRestrictType entryRestrictType0 = entry0.getRestrictType();
        g g0 = null;
        RestrictType restrictType0 = entryRestrictType0 == null ? null : BlogMainEntryRestrictTypeKt.toState(entryRestrictType0);
        boolean z2 = z1 ? entry0.isChallenge() : false;
        long v = entry0.getId();
        String s = entry0.getTitle();
        String s1 = entry0.getSummary();
        Thumbnail thumbnail0 = entry0.getThumbnail();
        ThumbnailUiState thumbnailUiState0 = thumbnail0 == null ? null : ThumbnailUiStateKt.toItem(thumbnail0);
        int v1 = entry0.getLikeCount();
        int v2 = entry0.getCommentCount();
        String s2 = entry0.getPublished();
        if(z) {
            g0 = new g(function40, entry0);
        }
        boolean z3 = entry0.getScheduleStatus() == EntryScheduleStatusType.SCHEDULED;
        switch(WhenMappings.$EnumSwitchMapping$0[entry0.getVisibility().ordinal()]) {
            case 1: {
                return new BlogEntry(v, z, restrictType0, z2, s, s1, thumbnailUiState0, new h(function50, entry0, restrictType0), g0, v1, v2, s2, z3, Visibility.PRIVATE);
            }
            case 2: {
                return new BlogEntry(v, z, restrictType0, z2, s, s1, thumbnailUiState0, new h(function50, entry0, restrictType0), g0, v1, v2, s2, z3, Visibility.PROTECTED);
            }
            default: {
                return new BlogEntry(v, z, restrictType0, z2, s, s1, thumbnailUiState0, new h(function50, entry0, restrictType0), g0, v1, v2, s2, z3, Visibility.NORMAL);
            }
        }
    }
}

