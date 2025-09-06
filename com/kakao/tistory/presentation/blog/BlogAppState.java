package com.kakao.tistory.presentation.blog;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.Stable;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.NavOptionsBuilderKt;
import com.google.accompanist.navigation.material.BottomSheetNavigator;
import com.kakao.tistory.presentation.ActivityNavigator;
import com.kakao.tistory.presentation.ActivityNavigatorImpl;
import com.kakao.tistory.presentation.common.network.NetworkConnection;
import com.kakao.tistory.presentation.screen.blog.navigation.BlogNavigationKt;
import com.kakao.tistory.presentation.screen.blogswitch.navigation.BlogSwitchNavigationKt;
import com.kakao.tistory.presentation.screen.item.GuestbookExtra;
import com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0003\u001A\u00020\u0002H\u0096\u0001\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0018\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\u0012\u001A\u00020\u0011H\u0096\u0001\u00A2\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0017\u001A\u00020\u000E2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0016\u001A\u00020\u0015H\u0096\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018J \u0010\u0019\u001A\u00020\u000E2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0016\u001A\u00020\u0015H\u0096\u0001\u00A2\u0006\u0004\b\u0019\u0010\u0018J(\u0010\u001C\u001A\u00020\u000E2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u001A\u001A\u00020\u00152\u0006\u0010\u001B\u001A\u00020\u0002H\u0096\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001DJ \u0010 \u001A\u00020\u000E2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u001F\u001A\u00020\u001EH\u0096\u0001\u00A2\u0006\u0004\b \u0010!J\u0018\u0010$\u001A\u00020\u000E2\u0006\u0010#\u001A\u00020\"H\u0096\u0001\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010&\u001A\u00020\u000EH\u0096\u0001\u00A2\u0006\u0004\b&\u0010\'J\u001E\u0010+\u001A\u00020\u000E2\f\u0010*\u001A\b\u0012\u0004\u0012\u00020)0(H\u0096\u0001\u00A2\u0006\u0004\b+\u0010,J\u0018\u0010-\u001A\u00020\u000E2\u0006\u0010\u0003\u001A\u00020\u0002H\u0096\u0001\u00A2\u0006\u0004\b-\u0010\u0010J\u001C\u0010.\u001A\u00020\u000E2\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002H\u0096\u0001\u00A2\u0006\u0004\b.\u0010\u0010J\u0010\u0010/\u001A\u00020\u000EH\u0096\u0001\u00A2\u0006\u0004\b/\u0010\'J\u0018\u00101\u001A\u00020\u000E2\u0006\u00100\u001A\u00020\u0002H\u0096\u0001\u00A2\u0006\u0004\b1\u0010\u0010J \u00104\u001A\u00020\u000E2\u0006\u00102\u001A\u00020\u00022\u0006\u00103\u001A\u00020\u0002H\u0096\u0001\u00A2\u0006\u0004\b4\u00105J \u00107\u001A\u00020\u000E2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u00106\u001A\u00020\u0011H\u0096\u0001\u00A2\u0006\u0004\b7\u00108J\u0018\u00109\u001A\u00020\u000E2\u0006\u0010\u0003\u001A\u00020\u0002H\u0096\u0001\u00A2\u0006\u0004\b9\u0010\u0010J\u0018\u0010;\u001A\u00020\u000E2\u0006\u0010:\u001A\u00020\u0002H\u0096\u0001\u00A2\u0006\u0004\b;\u0010\u0010J\r\u0010<\u001A\u00020\u000E\u00A2\u0006\u0004\b<\u0010\'J\r\u0010=\u001A\u00020\u000E\u00A2\u0006\u0004\b=\u0010\'J\r\u0010>\u001A\u00020\u000E\u00A2\u0006\u0004\b>\u0010\'R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b?\u0010@\u001A\u0004\bA\u0010BR\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bC\u0010D\u001A\u0004\bE\u0010FR\u0017\u0010\t\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\bG\u0010H\u001A\u0004\bI\u0010JR\u0017\u0010\u000B\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\bK\u0010L\u001A\u0004\bM\u0010NR\u0019\u0010T\u001A\u0004\u0018\u00010O8\u0006\u00A2\u0006\f\n\u0004\bP\u0010Q\u001A\u0004\bR\u0010S\u00A8\u0006U"}, d2 = {"Lcom/kakao/tistory/presentation/blog/BlogAppState;", "Lcom/kakao/tistory/presentation/ActivityNavigator;", "", "blogName", "Landroid/content/Context;", "context", "Landroidx/navigation/NavHostController;", "navController", "Lcom/google/accompanist/navigation/material/BottomSheetNavigator;", "bottomSheetNavigator", "Lcom/kakao/tistory/presentation/common/network/NetworkConnection;", "networkChecker", "<init>", "(Ljava/lang/String;Landroid/content/Context;Landroidx/navigation/NavHostController;Lcom/google/accompanist/navigation/material/BottomSheetNavigator;Lcom/kakao/tistory/presentation/common/network/NetworkConnection;)V", "", "navigateToBlog", "(Ljava/lang/String;)V", "", "openLatestEdit", "navigateToEditor", "(Z)V", "", "entryId", "navigateToEntry", "(Ljava/lang/String;J)V", "navigateToEntryEditor", "id", "title", "navigateToEntryStatistics", "(Ljava/lang/String;JLjava/lang/String;)V", "Lcom/kakao/tistory/presentation/viewmodel/BlogFollowViewModel$Type;", "type", "navigateToFollowScreen", "(Ljava/lang/String;Lcom/kakao/tistory/presentation/viewmodel/BlogFollowViewModel$Type;)V", "Lcom/kakao/tistory/presentation/screen/item/GuestbookExtra;", "guestbookExtra", "navigateToGuestbook", "(Lcom/kakao/tistory/presentation/screen/item/GuestbookExtra;)V", "navigateToMainMy", "()V", "", "Lcom/kakao/tistory/domain/blog/entity/RefererKeyword;", "list", "navigateToRefererKeyword", "(Ljava/util/List;)V", "navigateToRefererLog", "navigateToSearch", "navigateToSetting", "link", "navigateToStoryCreator", "subject", "text", "navigateToTextShare", "(Ljava/lang/String;Ljava/lang/String;)V", "isMine", "navigateToTopEntryList", "(Ljava/lang/String;Z)V", "navigateToTrend", "url", "navigateToWeb", "navigateToBlogSetting", "navigateToBlogSwitchBottomSheet", "navigateToPop", "a", "Ljava/lang/String;", "getBlogName", "()Ljava/lang/String;", "b", "Landroidx/navigation/NavHostController;", "getNavController", "()Landroidx/navigation/NavHostController;", "c", "Lcom/google/accompanist/navigation/material/BottomSheetNavigator;", "getBottomSheetNavigator", "()Lcom/google/accompanist/navigation/material/BottomSheetNavigator;", "d", "Lcom/kakao/tistory/presentation/common/network/NetworkConnection;", "getNetworkChecker", "()Lcom/kakao/tistory/presentation/common/network/NetworkConnection;", "Landroid/app/Activity;", "f", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "activity", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogAppState implements ActivityNavigator {
    public static final int $stable;
    public final String a;
    public final NavHostController b;
    public final BottomSheetNavigator c;
    public final NetworkConnection d;
    public final ActivityNavigatorImpl e;
    public final Activity f;

    public BlogAppState(@Nullable String s, @NotNull Context context0, @NotNull NavHostController navHostController0, @NotNull BottomSheetNavigator bottomSheetNavigator0, @NotNull NetworkConnection networkConnection0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(navHostController0, "navController");
        Intrinsics.checkNotNullParameter(bottomSheetNavigator0, "bottomSheetNavigator");
        Intrinsics.checkNotNullParameter(networkConnection0, "networkChecker");
        super();
        this.a = s;
        this.b = navHostController0;
        this.c = bottomSheetNavigator0;
        this.d = networkConnection0;
        this.e = new ActivityNavigatorImpl(context0);
        this.f = context0 instanceof Activity ? ((Activity)context0) : null;
    }

    public BlogAppState(String s, Context context0, NavHostController navHostController0, BottomSheetNavigator bottomSheetNavigator0, NetworkConnection networkConnection0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 16) != 0) {
            networkConnection0 = new NetworkConnection(context0);
        }
        this(s, context0, navHostController0, bottomSheetNavigator0, networkConnection0);
    }

    @Nullable
    public final Activity getActivity() {
        return this.f;
    }

    @Nullable
    public final String getBlogName() {
        return this.a;
    }

    @NotNull
    public final BottomSheetNavigator getBottomSheetNavigator() {
        return this.c;
    }

    @NotNull
    public final NavHostController getNavController() {
        return this.b;
    }

    @NotNull
    public final NetworkConnection getNetworkChecker() {
        return this.d;
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToBlog(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        this.e.navigateToBlog(s);
    }

    public final void navigateToBlogSetting() {
        NavOptions navOptions0 = NavOptionsBuilderKt.navOptions(i.a);
        BlogNavigationKt.navigateToBlogSetting(this.b, navOptions0);
    }

    public final void navigateToBlogSwitchBottomSheet() {
        NavOptions navOptions0 = NavOptionsBuilderKt.navOptions(j.a);
        BlogSwitchNavigationKt.navigateToBlogSwitch$default(this.b, null, "블로그", "블로그탑", navOptions0, 1, null);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToEditor(boolean z) {
        this.e.navigateToEditor(z);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToEntry(@NotNull String s, long v) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        this.e.navigateToEntry(s, v);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToEntryEditor(@NotNull String s, long v) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        this.e.navigateToEntryEditor(s, v);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToEntryStatistics(@NotNull String s, long v, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(s1, "title");
        this.e.navigateToEntryStatistics(s, v, s1);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToFollowScreen(@NotNull String s, @NotNull Type blogFollowViewModel$Type0) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(blogFollowViewModel$Type0, "type");
        this.e.navigateToFollowScreen(s, blogFollowViewModel$Type0);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToGuestbook(@NotNull GuestbookExtra guestbookExtra0) {
        Intrinsics.checkNotNullParameter(guestbookExtra0, "guestbookExtra");
        this.e.navigateToGuestbook(guestbookExtra0);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToMainMy() {
        this.e.navigateToMainMy();
    }

    public final void navigateToPop() {
        if(this.b.getPreviousBackStackEntry() == null) {
            Activity activity0 = this.f;
            if(activity0 != null) {
                activity0.finish();
            }
        }
        else {
            this.b.navigateUp();
        }
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToRefererKeyword(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "list");
        this.e.navigateToRefererKeyword(list0);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToRefererLog(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        this.e.navigateToRefererLog(s);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToSearch(@Nullable String s) {
        this.e.navigateToSearch(s);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToSetting() {
        this.e.navigateToSetting();
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToStoryCreator(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "link");
        this.e.navigateToStoryCreator(s);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToTextShare(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "subject");
        Intrinsics.checkNotNullParameter(s1, "text");
        this.e.navigateToTextShare(s, s1);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToTopEntryList(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        this.e.navigateToTopEntryList(s, z);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToTrend(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        this.e.navigateToTrend(s);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToWeb(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "url");
        this.e.navigateToWeb(s);
    }
}

