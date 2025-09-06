package com.kakao.tistory.presentation;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.data.model.StatisticsItem.RefererKeywordItem;
import com.kakao.tistory.domain.blog.entity.RefererKeyword;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.common.utils.UrlUtils;
import com.kakao.tistory.presentation.main.navigation.MainCommand.GoMy;
import com.kakao.tistory.presentation.screen.item.GuestbookExtra;
import com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\r\u0010\bJ\u0019\u0010\u000E\u001A\u00020\u00062\b\u0010\n\u001A\u0004\u0018\u00010\tH\u0016\u00A2\u0006\u0004\b\u000E\u0010\fJ\u0017\u0010\u0011\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u001F\u0010\u0015\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u0014\u001A\u00020\u0013H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001A\u00020\u00062\u0006\u0010\u0017\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b\u0018\u0010\fJ\u001F\u0010\u001B\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u001A\u001A\u00020\u0019H\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u001F\u0010\u001E\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u001D\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\'\u0010\"\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\u0006\u0010 \u001A\u00020\u00192\u0006\u0010!\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b\"\u0010#J\u001F\u0010$\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u001A\u001A\u00020\u0019H\u0016\u00A2\u0006\u0004\b$\u0010\u001CJ\u001F\u0010\'\u001A\u00020\u00062\u0006\u0010%\u001A\u00020\t2\u0006\u0010&\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b\'\u0010(J\u0017\u0010+\u001A\u00020\u00062\u0006\u0010*\u001A\u00020)H\u0016\u00A2\u0006\u0004\b+\u0010,J\u0017\u0010-\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b-\u0010\fJ\u0017\u0010.\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b.\u0010\fJ\u001D\u00102\u001A\u00020\u00062\f\u00101\u001A\b\u0012\u0004\u0012\u0002000/H\u0016\u00A2\u0006\u0004\b2\u00103J\u0017\u00105\u001A\u00020\u00062\u0006\u00104\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b5\u0010\fR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u00109\u00A8\u0006:"}, d2 = {"Lcom/kakao/tistory/presentation/ActivityNavigatorImpl;", "Lcom/kakao/tistory/presentation/ActivityNavigator;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "navigateToMainMy", "()V", "", "blogName", "navigateToBlog", "(Ljava/lang/String;)V", "navigateToSetting", "navigateToSearch", "", "openLatestEdit", "navigateToEditor", "(Z)V", "Lcom/kakao/tistory/presentation/viewmodel/BlogFollowViewModel$Type;", "type", "navigateToFollowScreen", "(Ljava/lang/String;Lcom/kakao/tistory/presentation/viewmodel/BlogFollowViewModel$Type;)V", "link", "navigateToStoryCreator", "", "entryId", "navigateToEntry", "(Ljava/lang/String;J)V", "isMine", "navigateToTopEntryList", "(Ljava/lang/String;Z)V", "id", "title", "navigateToEntryStatistics", "(Ljava/lang/String;JLjava/lang/String;)V", "navigateToEntryEditor", "subject", "text", "navigateToTextShare", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/kakao/tistory/presentation/screen/item/GuestbookExtra;", "guestbookExtra", "navigateToGuestbook", "(Lcom/kakao/tistory/presentation/screen/item/GuestbookExtra;)V", "navigateToTrend", "navigateToRefererLog", "", "Lcom/kakao/tistory/domain/blog/entity/RefererKeyword;", "list", "navigateToRefererKeyword", "(Ljava/util/List;)V", "url", "navigateToWeb", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nActivityNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.kt\ncom/kakao/tistory/presentation/ActivityNavigatorImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1549#2:116\n1620#2,3:117\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.kt\ncom/kakao/tistory/presentation/ActivityNavigatorImpl\n*L\n104#1:116\n104#1:117,3\n*E\n"})
public final class ActivityNavigatorImpl implements ActivityNavigator {
    public static final int $stable = 8;
    public final Context a;

    public ActivityNavigatorImpl(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super();
        this.a = context0;
    }

    @NotNull
    public final Context getContext() {
        return this.a;
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToBlog(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        NavigatorExtensionKt.goToBlogTop(this.a, s);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToEditor(boolean z) {
        NavigatorExtensionKt.goToEditor(this.a, z);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToEntry(@NotNull String s, long v) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        NavigatorExtensionKt.goToEntryView$default(this.a, s, v, null, null, null, 28, null);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToEntryEditor(@NotNull String s, long v) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        NavigatorExtensionKt.goToEntryEditor$default(this.a, s, v, null, 4, null);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToEntryStatistics(@NotNull String s, long v, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(s1, "title");
        EntryItem entryItem0 = new EntryItem(v, null, null, null, false, null, false, s1, null, null, null, null, null, null, null, null, null, null, s, null, 0L, 0L, false, 0L, false, 0x1FBFF7E, null);
        NavigatorExtensionKt.goToStatistics(this.a, entryItem0, true);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToFollowScreen(@NotNull String s, @NotNull Type blogFollowViewModel$Type0) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(blogFollowViewModel$Type0, "type");
        NavigatorExtensionKt.goToBlogFollow(this.a, s, blogFollowViewModel$Type0);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToGuestbook(@NotNull GuestbookExtra guestbookExtra0) {
        Intrinsics.checkNotNullParameter(guestbookExtra0, "guestbookExtra");
        NavigatorExtensionKt.goToGuestbook(this.a, guestbookExtra0);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToMainMy() {
        NavigatorExtensionKt.goToMain$default(this.a, null, null, GoMy.INSTANCE, 3, null);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToRefererKeyword(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "list");
        Context context0 = this.a;
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            arrayList0.add(new RefererKeywordItem(((RefererKeyword)object0).getCount(), "", null, null, null, 28, null));
        }
        NavigatorExtensionKt.goToRefererKeyword(context0, arrayList0);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToRefererLog(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        NavigatorExtensionKt.goToRefererLog(this.a, s);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToSearch(@Nullable String s) {
        NavigatorExtensionKt.goToSearch$default(this.a, null, s, null, 5, null);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToSetting() {
        NavigatorExtensionKt.goToSetting(this.a);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToStoryCreator(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "link");
        String s1 = UrlUtils.INSTANCE.getUrlWithHttps(s);
        NavigatorExtensionKt.goToWebView$default(this.a, s1, false, false, false, false, 30, null);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToTextShare(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "subject");
        Intrinsics.checkNotNullParameter(s1, "text");
        NavigatorExtensionKt.goToShareIntent(this.a, s, s1);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToTopEntryList(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        NavigatorExtensionKt.goToTopPost$default(this.a, s, null, null, z, 6, null);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToTrend(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        NavigatorExtensionKt.goToStatistics(this.a, s);
    }

    @Override  // com.kakao.tistory.presentation.ActivityNavigator
    public void navigateToWeb(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "url");
        NavigatorExtensionKt.goToWebView$default(this.a, s, false, false, false, false, 30, null);
    }
}

