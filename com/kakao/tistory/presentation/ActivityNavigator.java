package com.kakao.tistory.presentation;

import com.kakao.tistory.presentation.screen.item.GuestbookExtra;
import com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel.Type;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000E\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&J\u0010\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\bH&J\u0018\u0010\t\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\n\u001A\u00020\u000BH&J\u0018\u0010\f\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\n\u001A\u00020\u000BH&J \u0010\r\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u0005H&J\u0018\u0010\u0010\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0011\u001A\u00020\u0012H&J\u0010\u0010\u0013\u001A\u00020\u00032\u0006\u0010\u0014\u001A\u00020\u0015H&J\b\u0010\u0016\u001A\u00020\u0003H&J\u0016\u0010\u0017\u001A\u00020\u00032\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u001A0\u0019H&J\u0010\u0010\u001B\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&J\u0014\u0010\u001C\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005H&J\b\u0010\u001D\u001A\u00020\u0003H&J\u0010\u0010\u001E\u001A\u00020\u00032\u0006\u0010\u001F\u001A\u00020\u0005H&J\u0018\u0010 \u001A\u00020\u00032\u0006\u0010!\u001A\u00020\u00052\u0006\u0010\"\u001A\u00020\u0005H&J\u0018\u0010#\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010$\u001A\u00020\bH&J\u0010\u0010%\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&J\u0010\u0010&\u001A\u00020\u00032\u0006\u0010\'\u001A\u00020\u0005H&¨\u0006("}, d2 = {"Lcom/kakao/tistory/presentation/ActivityNavigator;", "", "navigateToBlog", "", "blogName", "", "navigateToEditor", "openLatestEdit", "", "navigateToEntry", "entryId", "", "navigateToEntryEditor", "navigateToEntryStatistics", "id", "title", "navigateToFollowScreen", "type", "Lcom/kakao/tistory/presentation/viewmodel/BlogFollowViewModel$Type;", "navigateToGuestbook", "guestbookExtra", "Lcom/kakao/tistory/presentation/screen/item/GuestbookExtra;", "navigateToMainMy", "navigateToRefererKeyword", "list", "", "Lcom/kakao/tistory/domain/blog/entity/RefererKeyword;", "navigateToRefererLog", "navigateToSearch", "navigateToSetting", "navigateToStoryCreator", "link", "navigateToTextShare", "subject", "text", "navigateToTopEntryList", "isMine", "navigateToTrend", "navigateToWeb", "url", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface ActivityNavigator {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void navigateToSearch$default(ActivityNavigator activityNavigator0, String s, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToSearch");
            }
            if((v & 1) != 0) {
                s = null;
            }
            activityNavigator0.navigateToSearch(s);
        }
    }

    void navigateToBlog(@NotNull String arg1);

    void navigateToEditor(boolean arg1);

    void navigateToEntry(@NotNull String arg1, long arg2);

    void navigateToEntryEditor(@NotNull String arg1, long arg2);

    void navigateToEntryStatistics(@NotNull String arg1, long arg2, @NotNull String arg3);

    void navigateToFollowScreen(@NotNull String arg1, @NotNull Type arg2);

    void navigateToGuestbook(@NotNull GuestbookExtra arg1);

    void navigateToMainMy();

    void navigateToRefererKeyword(@NotNull List arg1);

    void navigateToRefererLog(@NotNull String arg1);

    void navigateToSearch(@Nullable String arg1);

    void navigateToSetting();

    void navigateToStoryCreator(@NotNull String arg1);

    void navigateToTextShare(@NotNull String arg1, @NotNull String arg2);

    void navigateToTopEntryList(@NotNull String arg1, boolean arg2);

    void navigateToTrend(@NotNull String arg1);

    void navigateToWeb(@NotNull String arg1);
}

