package com.kakao.tistory.presentation.view.setting.notice.contract;

import com.kakao.tistory.domain.blog.entity.Entry;
import com.kakao.tistory.domain.blog.entity.EntryRestrictType;
import com.kakao.tistory.domain.blog.entity.EntryScheduleStatusType;
import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.domain.common.Thumbnail;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Visibility;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEntryRestrictTypeKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.RestrictType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\u001A*\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u001E\u0010\u0003\u001A\u001A\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0004¨\u0006\b"}, d2 = {"toSettingEntry", "Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeEntry;", "Lcom/kakao/tistory/domain/blog/entity/Entry;", "onClick", "Lkotlin/Function3;", "", "", "", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class SettingNoticeEntryKt {
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
    public static final SettingNoticeEntry toSettingEntry(@NotNull Entry entry0, @NotNull Function3 function30) {
        Visibility entryListUiState$Visibility0;
        Intrinsics.checkNotNullParameter(entry0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "onClick");
        EntryRestrictType entryRestrictType0 = entry0.getRestrictType();
        ThumbnailUiState thumbnailUiState0 = null;
        RestrictType restrictType0 = entryRestrictType0 == null ? null : BlogMainEntryRestrictTypeKt.toState(entryRestrictType0);
        switch(WhenMappings.$EnumSwitchMapping$0[entry0.getVisibility().ordinal()]) {
            case 1: {
                entryListUiState$Visibility0 = Visibility.PRIVATE;
                break;
            }
            case 2: {
                entryListUiState$Visibility0 = Visibility.PROTECTED;
                break;
            }
            default: {
                entryListUiState$Visibility0 = Visibility.NORMAL;
            }
        }
        long v = entry0.getId();
        String s = entry0.getTitle();
        String s1 = entry0.getSummary();
        Thumbnail thumbnail0 = entry0.getThumbnail();
        if(thumbnail0 != null) {
            thumbnailUiState0 = ThumbnailUiStateKt.toItem(thumbnail0);
        }
        int v1 = entry0.getLikeCount();
        int v2 = entry0.getCommentCount();
        String s2 = entry0.getPublished();
        return entry0.getScheduleStatus() == EntryScheduleStatusType.SCHEDULED ? new SettingNoticeEntry(v, restrictType0, s, s1, thumbnailUiState0, v1, v2, s2, true, entryListUiState$Visibility0, new b(function30, entry0)) : new SettingNoticeEntry(v, restrictType0, s, s1, thumbnailUiState0, v1, v2, s2, false, entryListUiState$Visibility0, new b(function30, entry0));
    }
}

