package com.kakao.tistory.presentation.screen.blog.noticeList.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.Pager;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.domain.blog.entity.BlogInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent;", "", "ChangeBlogInfo", "HideBottomSheet", "HideDialog", "Refresh", "RefreshComplete", "ShowBottomSheet", "ShowDialog", "ShowErrorDialog", "UpdateCurrentUserId", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent$ChangeBlogInfo;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent$HideBottomSheet;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent$HideDialog;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent$Refresh;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent$RefreshComplete;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent$ShowBottomSheet;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent$ShowDialog;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent$ShowErrorDialog;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent$UpdateCurrentUserId;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface BlogNoticeListIntent {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent$ChangeBlogInfo;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent;", "Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "blog", "<init>", "(Lcom/kakao/tistory/domain/blog/entity/BlogInfo;)V", "component1", "()Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "copy", "(Lcom/kakao/tistory/domain/blog/entity/BlogInfo;)Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent$ChangeBlogInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "getBlog", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeBlogInfo implements BlogNoticeListIntent {
        public static final int $stable = 8;
        public final BlogInfo a;

        public ChangeBlogInfo(@Nullable BlogInfo blogInfo0) {
            this.a = blogInfo0;
        }

        @Nullable
        public final BlogInfo component1() {
            return this.a;
        }

        @NotNull
        public final ChangeBlogInfo copy(@Nullable BlogInfo blogInfo0) {
            return new ChangeBlogInfo(blogInfo0);
        }

        public static ChangeBlogInfo copy$default(ChangeBlogInfo blogNoticeListIntent$ChangeBlogInfo0, BlogInfo blogInfo0, int v, Object object0) {
            if((v & 1) != 0) {
                blogInfo0 = blogNoticeListIntent$ChangeBlogInfo0.a;
            }
            return blogNoticeListIntent$ChangeBlogInfo0.copy(blogInfo0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeBlogInfo ? Intrinsics.areEqual(this.a, ((ChangeBlogInfo)object0).a) : false;
        }

        @Nullable
        public final BlogInfo getBlog() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a == null ? 0 : this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeBlogInfo(blog=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent$HideBottomSheet;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class HideBottomSheet implements BlogNoticeListIntent {
        public static final int $stable;
        @NotNull
        public static final HideBottomSheet INSTANCE;

        static {
            HideBottomSheet.INSTANCE = new HideBottomSheet();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof HideBottomSheet;
        }

        @Override
        public int hashCode() {
            return 0x22FCA74;
        }

        @Override
        @NotNull
        public String toString() {
            return "HideBottomSheet";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent$HideDialog;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class HideDialog implements BlogNoticeListIntent {
        public static final int $stable;
        @NotNull
        public static final HideDialog INSTANCE;

        static {
            HideDialog.INSTANCE = new HideDialog();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof HideDialog;
        }

        @Override
        public int hashCode() {
            return -1402152760;
        }

        @Override
        @NotNull
        public String toString() {
            return "HideDialog";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent$Refresh;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Refresh implements BlogNoticeListIntent {
        public static final int $stable;
        @NotNull
        public static final Refresh INSTANCE;

        static {
            Refresh.INSTANCE = new Refresh();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof Refresh;
        }

        @Override
        public int hashCode() {
            return -917120003;
        }

        @Override
        @NotNull
        public String toString() {
            return "Refresh";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001B\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001A\u00020\u00002\u0014\b\u0002\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent$RefreshComplete;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent;", "Landroidx/paging/Pager;", "", "Lcom/kakao/tistory/domain/blog/entity/Notice;", "noticeListPager", "<init>", "(Landroidx/paging/Pager;)V", "component1", "()Landroidx/paging/Pager;", "copy", "(Landroidx/paging/Pager;)Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent$RefreshComplete;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/paging/Pager;", "getNoticeListPager", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RefreshComplete implements BlogNoticeListIntent {
        public static final int $stable = 8;
        public final Pager a;

        public RefreshComplete(@NotNull Pager pager0) {
            Intrinsics.checkNotNullParameter(pager0, "noticeListPager");
            super();
            this.a = pager0;
        }

        @NotNull
        public final Pager component1() {
            return this.a;
        }

        @NotNull
        public final RefreshComplete copy(@NotNull Pager pager0) {
            Intrinsics.checkNotNullParameter(pager0, "noticeListPager");
            return new RefreshComplete(pager0);
        }

        public static RefreshComplete copy$default(RefreshComplete blogNoticeListIntent$RefreshComplete0, Pager pager0, int v, Object object0) {
            if((v & 1) != 0) {
                pager0 = blogNoticeListIntent$RefreshComplete0.a;
            }
            return blogNoticeListIntent$RefreshComplete0.copy(pager0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof RefreshComplete ? Intrinsics.areEqual(this.a, ((RefreshComplete)object0).a) : false;
        }

        @NotNull
        public final Pager getNoticeListPager() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "RefreshComplete(noticeListPager=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent$ShowBottomSheet;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/NoticeBottomSheet;", "noticeBottomSheet", "<init>", "(Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/NoticeBottomSheet;)V", "component1", "()Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/NoticeBottomSheet;", "copy", "(Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/NoticeBottomSheet;)Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent$ShowBottomSheet;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/NoticeBottomSheet;", "getNoticeBottomSheet", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowBottomSheet implements BlogNoticeListIntent {
        public static final int $stable = 8;
        public final NoticeBottomSheet a;

        public ShowBottomSheet(@NotNull NoticeBottomSheet noticeBottomSheet0) {
            Intrinsics.checkNotNullParameter(noticeBottomSheet0, "noticeBottomSheet");
            super();
            this.a = noticeBottomSheet0;
        }

        @NotNull
        public final NoticeBottomSheet component1() {
            return this.a;
        }

        @NotNull
        public final ShowBottomSheet copy(@NotNull NoticeBottomSheet noticeBottomSheet0) {
            Intrinsics.checkNotNullParameter(noticeBottomSheet0, "noticeBottomSheet");
            return new ShowBottomSheet(noticeBottomSheet0);
        }

        public static ShowBottomSheet copy$default(ShowBottomSheet blogNoticeListIntent$ShowBottomSheet0, NoticeBottomSheet noticeBottomSheet0, int v, Object object0) {
            if((v & 1) != 0) {
                noticeBottomSheet0 = blogNoticeListIntent$ShowBottomSheet0.a;
            }
            return blogNoticeListIntent$ShowBottomSheet0.copy(noticeBottomSheet0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ShowBottomSheet ? Intrinsics.areEqual(this.a, ((ShowBottomSheet)object0).a) : false;
        }

        @NotNull
        public final NoticeBottomSheet getNoticeBottomSheet() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ShowBottomSheet(noticeBottomSheet=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent$ShowDialog;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/DialogType;", "type", "<init>", "(Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/DialogType;)V", "component1", "()Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/DialogType;", "copy", "(Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/DialogType;)Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent$ShowDialog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/DialogType;", "getType", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowDialog implements BlogNoticeListIntent {
        public static final int $stable = 8;
        public final DialogType a;

        public ShowDialog(@NotNull DialogType dialogType0) {
            Intrinsics.checkNotNullParameter(dialogType0, "type");
            super();
            this.a = dialogType0;
        }

        @NotNull
        public final DialogType component1() {
            return this.a;
        }

        @NotNull
        public final ShowDialog copy(@NotNull DialogType dialogType0) {
            Intrinsics.checkNotNullParameter(dialogType0, "type");
            return new ShowDialog(dialogType0);
        }

        public static ShowDialog copy$default(ShowDialog blogNoticeListIntent$ShowDialog0, DialogType dialogType0, int v, Object object0) {
            if((v & 1) != 0) {
                dialogType0 = blogNoticeListIntent$ShowDialog0.a;
            }
            return blogNoticeListIntent$ShowDialog0.copy(dialogType0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ShowDialog ? Intrinsics.areEqual(this.a, ((ShowDialog)object0).a) : false;
        }

        @NotNull
        public final DialogType getType() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ShowDialog(type=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent$ShowErrorDialog;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent;", "Lcom/kakao/android/base/model/ErrorModel;", "errorModel", "<init>", "(Lcom/kakao/android/base/model/ErrorModel;)V", "component1", "()Lcom/kakao/android/base/model/ErrorModel;", "copy", "(Lcom/kakao/android/base/model/ErrorModel;)Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent$ShowErrorDialog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/android/base/model/ErrorModel;", "getErrorModel", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowErrorDialog implements BlogNoticeListIntent {
        public static final int $stable = 8;
        public final ErrorModel a;

        public ShowErrorDialog(@NotNull ErrorModel errorModel0) {
            Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
            super();
            this.a = errorModel0;
        }

        @NotNull
        public final ErrorModel component1() {
            return this.a;
        }

        @NotNull
        public final ShowErrorDialog copy(@NotNull ErrorModel errorModel0) {
            Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
            return new ShowErrorDialog(errorModel0);
        }

        public static ShowErrorDialog copy$default(ShowErrorDialog blogNoticeListIntent$ShowErrorDialog0, ErrorModel errorModel0, int v, Object object0) {
            if((v & 1) != 0) {
                errorModel0 = blogNoticeListIntent$ShowErrorDialog0.a;
            }
            return blogNoticeListIntent$ShowErrorDialog0.copy(errorModel0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ShowErrorDialog ? Intrinsics.areEqual(this.a, ((ShowErrorDialog)object0).a) : false;
        }

        @NotNull
        public final ErrorModel getErrorModel() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ShowErrorDialog(errorModel=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent$UpdateCurrentUserId;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent;", "", "userId", "<init>", "(Ljava/lang/Long;)V", "component1", "()Ljava/lang/Long;", "copy", "(Ljava/lang/Long;)Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListIntent$UpdateCurrentUserId;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Long;", "getUserId", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateCurrentUserId implements BlogNoticeListIntent {
        public static final int $stable;
        public final Long a;

        public UpdateCurrentUserId(@Nullable Long long0) {
            this.a = long0;
        }

        @Nullable
        public final Long component1() {
            return this.a;
        }

        @NotNull
        public final UpdateCurrentUserId copy(@Nullable Long long0) {
            return new UpdateCurrentUserId(long0);
        }

        public static UpdateCurrentUserId copy$default(UpdateCurrentUserId blogNoticeListIntent$UpdateCurrentUserId0, Long long0, int v, Object object0) {
            if((v & 1) != 0) {
                long0 = blogNoticeListIntent$UpdateCurrentUserId0.a;
            }
            return blogNoticeListIntent$UpdateCurrentUserId0.copy(long0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdateCurrentUserId ? Intrinsics.areEqual(this.a, ((UpdateCurrentUserId)object0).a) : false;
        }

        @Nullable
        public final Long getUserId() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a == null ? 0 : this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdateCurrentUserId(userId=" + this.a + ")";
        }
    }

}

