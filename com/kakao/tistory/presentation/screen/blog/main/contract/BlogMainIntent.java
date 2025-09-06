package com.kakao.tistory.presentation.screen.blog.main.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.Pager;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.domain.blog.entity.BlogInfo;
import com.kakao.tistory.domain.entity.common.Result;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u001A\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001A\u001B\u0082\u0001\u001A\u001C\u001D\u001E\u001F !\"#$%&\'()*+,-./012345¨\u00066"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "", "ChangeBlockState", "ChangeBlogInfo", "ChangeCurrentCategory", "ChangeFollow", "GuideDismiss", "HideBottomSheet", "HideDialog", "NeedGuide", "OnClickFollow", "Refresh", "RefreshChallenge", "RefreshEntryAndNoticeIfMyBlog", "RequestChangeBlock", "ShowBottomSheet", "ShowDialog", "ShowErrorDialog", "UpdateCategories", "UpdateChallenge", "UpdateEntryList", "UpdateRecentNotice", "UpdateStatisticsRefererKeyword", "UpdateStatisticsRefererLog", "UpdateStatisticsRevenue", "UpdateStatisticsRevenueEnable", "UpdateStatisticsTrend", "UpdateTopEntryList", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$ChangeBlockState;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$ChangeBlogInfo;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$ChangeCurrentCategory;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$ChangeFollow;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$GuideDismiss;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$HideBottomSheet;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$HideDialog;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$NeedGuide;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$OnClickFollow;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$Refresh;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$RefreshChallenge;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$RefreshEntryAndNoticeIfMyBlog;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$RequestChangeBlock;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$ShowBottomSheet;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$ShowDialog;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$ShowErrorDialog;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateCategories;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateChallenge;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateEntryList;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateRecentNotice;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateStatisticsRefererKeyword;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateStatisticsRefererLog;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateStatisticsRevenue;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateStatisticsRevenueEnable;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateStatisticsTrend;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateTopEntryList;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface BlogMainIntent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0012\u001A\u00020\u00022\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$ChangeBlockState;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "", "needBlock", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$ChangeBlockState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getNeedBlock", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeBlockState implements BlogMainIntent {
        public static final int $stable;
        public final boolean a;

        public ChangeBlockState(boolean z) {
            this.a = z;
        }

        public final boolean component1() {
            return this.a;
        }

        @NotNull
        public final ChangeBlockState copy(boolean z) {
            return new ChangeBlockState(z);
        }

        public static ChangeBlockState copy$default(ChangeBlockState blogMainIntent$ChangeBlockState0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                z = blogMainIntent$ChangeBlockState0.a;
            }
            return blogMainIntent$ChangeBlockState0.copy(z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeBlockState ? this.a == ((ChangeBlockState)object0).a : false;
        }

        public final boolean getNeedBlock() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.a);
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeBlockState(needBlock=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$ChangeBlogInfo;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "blogInfo", "<init>", "(Lcom/kakao/tistory/domain/blog/entity/BlogInfo;)V", "component1", "()Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "copy", "(Lcom/kakao/tistory/domain/blog/entity/BlogInfo;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$ChangeBlogInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "getBlogInfo", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeBlogInfo implements BlogMainIntent {
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

        public static ChangeBlogInfo copy$default(ChangeBlogInfo blogMainIntent$ChangeBlogInfo0, BlogInfo blogInfo0, int v, Object object0) {
            if((v & 1) != 0) {
                blogInfo0 = blogMainIntent$ChangeBlogInfo0.a;
            }
            return blogMainIntent$ChangeBlogInfo0.copy(blogInfo0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeBlogInfo ? Intrinsics.areEqual(this.a, ((ChangeBlogInfo)object0).a) : false;
        }

        @Nullable
        public final BlogInfo getBlogInfo() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a == null ? 0 : this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeBlogInfo(blogInfo=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$ChangeCurrentCategory;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategoryItem;", "category", "<init>", "(Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategoryItem;)V", "component1", "()Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategoryItem;", "copy", "(Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategoryItem;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$ChangeCurrentCategory;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategoryItem;", "getCategory", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeCurrentCategory implements BlogMainIntent {
        public static final int $stable;
        public final BlogMainCategoryItem a;

        public ChangeCurrentCategory(@NotNull BlogMainCategoryItem blogMainCategoryItem0) {
            Intrinsics.checkNotNullParameter(blogMainCategoryItem0, "category");
            super();
            this.a = blogMainCategoryItem0;
        }

        @NotNull
        public final BlogMainCategoryItem component1() {
            return this.a;
        }

        @NotNull
        public final ChangeCurrentCategory copy(@NotNull BlogMainCategoryItem blogMainCategoryItem0) {
            Intrinsics.checkNotNullParameter(blogMainCategoryItem0, "category");
            return new ChangeCurrentCategory(blogMainCategoryItem0);
        }

        public static ChangeCurrentCategory copy$default(ChangeCurrentCategory blogMainIntent$ChangeCurrentCategory0, BlogMainCategoryItem blogMainCategoryItem0, int v, Object object0) {
            if((v & 1) != 0) {
                blogMainCategoryItem0 = blogMainIntent$ChangeCurrentCategory0.a;
            }
            return blogMainIntent$ChangeCurrentCategory0.copy(blogMainCategoryItem0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeCurrentCategory ? Intrinsics.areEqual(this.a, ((ChangeCurrentCategory)object0).a) : false;
        }

        @NotNull
        public final BlogMainCategoryItem getCategory() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeCurrentCategory(category=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0012\u001A\u00020\u00022\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0003\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$ChangeFollow;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "", "isFollowing", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$ChangeFollow;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeFollow implements BlogMainIntent {
        public static final int $stable;
        public final boolean a;

        public ChangeFollow(boolean z) {
            this.a = z;
        }

        public final boolean component1() {
            return this.a;
        }

        @NotNull
        public final ChangeFollow copy(boolean z) {
            return new ChangeFollow(z);
        }

        public static ChangeFollow copy$default(ChangeFollow blogMainIntent$ChangeFollow0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                z = blogMainIntent$ChangeFollow0.a;
            }
            return blogMainIntent$ChangeFollow0.copy(z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeFollow ? this.a == ((ChangeFollow)object0).a : false;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final boolean isFollowing() {
            return this.a;
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeFollow(isFollowing=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$GuideDismiss;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GuideDismiss implements BlogMainIntent {
        public static final int $stable;
        @NotNull
        public static final GuideDismiss INSTANCE;

        static {
            GuideDismiss.INSTANCE = new GuideDismiss();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof GuideDismiss;
        }

        @Override
        public int hashCode() {
            return 0x89781C46;
        }

        @Override
        @NotNull
        public String toString() {
            return "GuideDismiss";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$HideBottomSheet;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class HideBottomSheet implements BlogMainIntent {
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
            return 0x75B7A3FA;
        }

        @Override
        @NotNull
        public String toString() {
            return "HideBottomSheet";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$HideDialog;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class HideDialog implements BlogMainIntent {
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
            return 1008247682;
        }

        @Override
        @NotNull
        public String toString() {
            return "HideDialog";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$NeedGuide;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class NeedGuide implements BlogMainIntent {
        public static final int $stable;
        @NotNull
        public static final NeedGuide INSTANCE;

        static {
            NeedGuide.INSTANCE = new NeedGuide();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof NeedGuide;
        }

        @Override
        public int hashCode() {
            return 1921003182;
        }

        @Override
        @NotNull
        public String toString() {
            return "NeedGuide";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0012\u001A\u00020\u00022\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$OnClickFollow;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "", "needFollow", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$OnClickFollow;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getNeedFollow", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class OnClickFollow implements BlogMainIntent {
        public static final int $stable;
        public final boolean a;

        public OnClickFollow(boolean z) {
            this.a = z;
        }

        public final boolean component1() {
            return this.a;
        }

        @NotNull
        public final OnClickFollow copy(boolean z) {
            return new OnClickFollow(z);
        }

        public static OnClickFollow copy$default(OnClickFollow blogMainIntent$OnClickFollow0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                z = blogMainIntent$OnClickFollow0.a;
            }
            return blogMainIntent$OnClickFollow0.copy(z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof OnClickFollow ? this.a == ((OnClickFollow)object0).a : false;
        }

        public final boolean getNeedFollow() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.a);
        }

        @Override
        @NotNull
        public String toString() {
            return "OnClickFollow(needFollow=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$Refresh;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Refresh implements BlogMainIntent {
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
            return -1237673085;
        }

        @Override
        @NotNull
        public String toString() {
            return "Refresh";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$RefreshChallenge;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RefreshChallenge implements BlogMainIntent {
        public static final int $stable;
        @NotNull
        public static final RefreshChallenge INSTANCE;

        static {
            RefreshChallenge.INSTANCE = new RefreshChallenge();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof RefreshChallenge;
        }

        @Override
        public int hashCode() {
            return -282770400;
        }

        @Override
        @NotNull
        public String toString() {
            return "RefreshChallenge";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$RefreshEntryAndNoticeIfMyBlog;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RefreshEntryAndNoticeIfMyBlog implements BlogMainIntent {
        public static final int $stable;
        @NotNull
        public static final RefreshEntryAndNoticeIfMyBlog INSTANCE;

        static {
            RefreshEntryAndNoticeIfMyBlog.INSTANCE = new RefreshEntryAndNoticeIfMyBlog();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof RefreshEntryAndNoticeIfMyBlog;
        }

        @Override
        public int hashCode() {
            return -1903383381;
        }

        @Override
        @NotNull
        public String toString() {
            return "RefreshEntryAndNoticeIfMyBlog";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0016\u001A\u00020\u00042\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u000B¨\u0006\u001E"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$RequestChangeBlock;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "", "ownerId", "", "needBlock", "<init>", "(JZ)V", "component1", "()J", "component2", "()Z", "copy", "(JZ)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$RequestChangeBlock;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getOwnerId", "b", "Z", "getNeedBlock", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RequestChangeBlock implements BlogMainIntent {
        public static final int $stable;
        public final long a;
        public final boolean b;

        public RequestChangeBlock(long v, boolean z) {
            this.a = v;
            this.b = z;
        }

        public final long component1() {
            return this.a;
        }

        public final boolean component2() {
            return this.b;
        }

        @NotNull
        public final RequestChangeBlock copy(long v, boolean z) {
            return new RequestChangeBlock(v, z);
        }

        public static RequestChangeBlock copy$default(RequestChangeBlock blogMainIntent$RequestChangeBlock0, long v, boolean z, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = blogMainIntent$RequestChangeBlock0.a;
            }
            if((v1 & 2) != 0) {
                z = blogMainIntent$RequestChangeBlock0.b;
            }
            return blogMainIntent$RequestChangeBlock0.copy(v, z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RequestChangeBlock)) {
                return false;
            }
            return this.a == ((RequestChangeBlock)object0).a ? this.b == ((RequestChangeBlock)object0).b : false;
        }

        public final boolean getNeedBlock() {
            return this.b;
        }

        public final long getOwnerId() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.b) + Long.hashCode(this.a) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "RequestChangeBlock(ownerId=" + this.a + ", needBlock=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$ShowBottomSheet;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BottomSheetType;", "type", "<init>", "(Lcom/kakao/tistory/presentation/screen/blog/main/contract/BottomSheetType;)V", "component1", "()Lcom/kakao/tistory/presentation/screen/blog/main/contract/BottomSheetType;", "copy", "(Lcom/kakao/tistory/presentation/screen/blog/main/contract/BottomSheetType;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$ShowBottomSheet;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BottomSheetType;", "getType", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowBottomSheet implements BlogMainIntent {
        public static final int $stable = 8;
        public final BottomSheetType a;

        public ShowBottomSheet(@NotNull BottomSheetType bottomSheetType0) {
            Intrinsics.checkNotNullParameter(bottomSheetType0, "type");
            super();
            this.a = bottomSheetType0;
        }

        @NotNull
        public final BottomSheetType component1() {
            return this.a;
        }

        @NotNull
        public final ShowBottomSheet copy(@NotNull BottomSheetType bottomSheetType0) {
            Intrinsics.checkNotNullParameter(bottomSheetType0, "type");
            return new ShowBottomSheet(bottomSheetType0);
        }

        public static ShowBottomSheet copy$default(ShowBottomSheet blogMainIntent$ShowBottomSheet0, BottomSheetType bottomSheetType0, int v, Object object0) {
            if((v & 1) != 0) {
                bottomSheetType0 = blogMainIntent$ShowBottomSheet0.a;
            }
            return blogMainIntent$ShowBottomSheet0.copy(bottomSheetType0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ShowBottomSheet ? Intrinsics.areEqual(this.a, ((ShowBottomSheet)object0).a) : false;
        }

        @NotNull
        public final BottomSheetType getType() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ShowBottomSheet(type=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$ShowDialog;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/DialogType;", "type", "<init>", "(Lcom/kakao/tistory/presentation/screen/blog/main/contract/DialogType;)V", "component1", "()Lcom/kakao/tistory/presentation/screen/blog/main/contract/DialogType;", "copy", "(Lcom/kakao/tistory/presentation/screen/blog/main/contract/DialogType;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$ShowDialog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/DialogType;", "getType", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowDialog implements BlogMainIntent {
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

        public static ShowDialog copy$default(ShowDialog blogMainIntent$ShowDialog0, DialogType dialogType0, int v, Object object0) {
            if((v & 1) != 0) {
                dialogType0 = blogMainIntent$ShowDialog0.a;
            }
            return blogMainIntent$ShowDialog0.copy(dialogType0);
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
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$ShowErrorDialog;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "Lcom/kakao/android/base/model/ErrorModel;", "errorModel", "<init>", "(Lcom/kakao/android/base/model/ErrorModel;)V", "component1", "()Lcom/kakao/android/base/model/ErrorModel;", "copy", "(Lcom/kakao/android/base/model/ErrorModel;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$ShowErrorDialog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/android/base/model/ErrorModel;", "getErrorModel", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowErrorDialog implements BlogMainIntent {
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

        public static ShowErrorDialog copy$default(ShowErrorDialog blogMainIntent$ShowErrorDialog0, ErrorModel errorModel0, int v, Object object0) {
            if((v & 1) != 0) {
                errorModel0 = blogMainIntent$ShowErrorDialog0.a;
            }
            return blogMainIntent$ShowErrorDialog0.copy(errorModel0);
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

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001A\u00020\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateCategories;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "", "Lcom/kakao/tistory/domain/blog/entity/Category;", "categories", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateCategories;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getCategories", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateCategories implements BlogMainIntent {
        public static final int $stable = 8;
        public final List a;

        public UpdateCategories(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "categories");
            super();
            this.a = list0;
        }

        @NotNull
        public final List component1() {
            return this.a;
        }

        @NotNull
        public final UpdateCategories copy(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "categories");
            return new UpdateCategories(list0);
        }

        public static UpdateCategories copy$default(UpdateCategories blogMainIntent$UpdateCategories0, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                list0 = blogMainIntent$UpdateCategories0.a;
            }
            return blogMainIntent$UpdateCategories0.copy(list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdateCategories ? Intrinsics.areEqual(this.a, ((UpdateCategories)object0).a) : false;
        }

        @NotNull
        public final List getCategories() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdateCategories(categories=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001A\u00020\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateChallenge;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "", "Lcom/kakao/tistory/domain/blog/entity/Challenge;", "challenge", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateChallenge;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getChallenge", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateChallenge implements BlogMainIntent {
        public static final int $stable = 8;
        public final List a;

        public UpdateChallenge(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "challenge");
            super();
            this.a = list0;
        }

        @NotNull
        public final List component1() {
            return this.a;
        }

        @NotNull
        public final UpdateChallenge copy(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "challenge");
            return new UpdateChallenge(list0);
        }

        public static UpdateChallenge copy$default(UpdateChallenge blogMainIntent$UpdateChallenge0, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                list0 = blogMainIntent$UpdateChallenge0.a;
            }
            return blogMainIntent$UpdateChallenge0.copy(list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdateChallenge ? Intrinsics.areEqual(this.a, ((UpdateChallenge)object0).a) : false;
        }

        @NotNull
        public final List getChallenge() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdateChallenge(challenge=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001B\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001A\u00020\u00002\u0014\b\u0002\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateEntryList;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "Landroidx/paging/Pager;", "", "Lcom/kakao/tistory/domain/blog/entity/Entry;", "entryListPaging", "<init>", "(Landroidx/paging/Pager;)V", "component1", "()Landroidx/paging/Pager;", "copy", "(Landroidx/paging/Pager;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateEntryList;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/paging/Pager;", "getEntryListPaging", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateEntryList implements BlogMainIntent {
        public static final int $stable = 8;
        public final Pager a;

        public UpdateEntryList(@NotNull Pager pager0) {
            Intrinsics.checkNotNullParameter(pager0, "entryListPaging");
            super();
            this.a = pager0;
        }

        @NotNull
        public final Pager component1() {
            return this.a;
        }

        @NotNull
        public final UpdateEntryList copy(@NotNull Pager pager0) {
            Intrinsics.checkNotNullParameter(pager0, "entryListPaging");
            return new UpdateEntryList(pager0);
        }

        public static UpdateEntryList copy$default(UpdateEntryList blogMainIntent$UpdateEntryList0, Pager pager0, int v, Object object0) {
            if((v & 1) != 0) {
                pager0 = blogMainIntent$UpdateEntryList0.a;
            }
            return blogMainIntent$UpdateEntryList0.copy(pager0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdateEntryList ? Intrinsics.areEqual(this.a, ((UpdateEntryList)object0).a) : false;
        }

        @NotNull
        public final Pager getEntryListPaging() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdateEntryList(entryListPaging=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001A\u00020\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateRecentNotice;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "", "Lcom/kakao/tistory/domain/blog/entity/Notice;", "notice", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateRecentNotice;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getNotice", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateRecentNotice implements BlogMainIntent {
        public static final int $stable = 8;
        public final List a;

        public UpdateRecentNotice(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "notice");
            super();
            this.a = list0;
        }

        @NotNull
        public final List component1() {
            return this.a;
        }

        @NotNull
        public final UpdateRecentNotice copy(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "notice");
            return new UpdateRecentNotice(list0);
        }

        public static UpdateRecentNotice copy$default(UpdateRecentNotice blogMainIntent$UpdateRecentNotice0, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                list0 = blogMainIntent$UpdateRecentNotice0.a;
            }
            return blogMainIntent$UpdateRecentNotice0.copy(list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdateRecentNotice ? Intrinsics.areEqual(this.a, ((UpdateRecentNotice)object0).a) : false;
        }

        @NotNull
        public final List getNotice() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdateRecentNotice(notice=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001B\u0012\u0012\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001A\u00020\u00002\u0014\b\u0002\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\t¨\u0006\u001A"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateStatisticsRefererKeyword;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "Lcom/kakao/tistory/domain/blog/entity/RefererKeyword;", "result", "<init>", "(Lcom/kakao/tistory/domain/entity/common/Result;)V", "component1", "()Lcom/kakao/tistory/domain/entity/common/Result;", "copy", "(Lcom/kakao/tistory/domain/entity/common/Result;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateStatisticsRefererKeyword;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/domain/entity/common/Result;", "getResult", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateStatisticsRefererKeyword implements BlogMainIntent {
        public static final int $stable = 8;
        public final Result a;

        public UpdateStatisticsRefererKeyword(@NotNull Result result0) {
            Intrinsics.checkNotNullParameter(result0, "result");
            super();
            this.a = result0;
        }

        @NotNull
        public final Result component1() {
            return this.a;
        }

        @NotNull
        public final UpdateStatisticsRefererKeyword copy(@NotNull Result result0) {
            Intrinsics.checkNotNullParameter(result0, "result");
            return new UpdateStatisticsRefererKeyword(result0);
        }

        public static UpdateStatisticsRefererKeyword copy$default(UpdateStatisticsRefererKeyword blogMainIntent$UpdateStatisticsRefererKeyword0, Result result0, int v, Object object0) {
            if((v & 1) != 0) {
                result0 = blogMainIntent$UpdateStatisticsRefererKeyword0.a;
            }
            return blogMainIntent$UpdateStatisticsRefererKeyword0.copy(result0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdateStatisticsRefererKeyword ? Intrinsics.areEqual(this.a, ((UpdateStatisticsRefererKeyword)object0).a) : false;
        }

        @NotNull
        public final Result getResult() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdateStatisticsRefererKeyword(result=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001B\u0012\u0012\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001A\u00020\u00002\u0014\b\u0002\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\t¨\u0006\u001A"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateStatisticsRefererLog;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "Lcom/kakao/tistory/domain/blog/entity/RefererLog;", "result", "<init>", "(Lcom/kakao/tistory/domain/entity/common/Result;)V", "component1", "()Lcom/kakao/tistory/domain/entity/common/Result;", "copy", "(Lcom/kakao/tistory/domain/entity/common/Result;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateStatisticsRefererLog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/domain/entity/common/Result;", "getResult", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateStatisticsRefererLog implements BlogMainIntent {
        public static final int $stable = 8;
        public final Result a;

        public UpdateStatisticsRefererLog(@NotNull Result result0) {
            Intrinsics.checkNotNullParameter(result0, "result");
            super();
            this.a = result0;
        }

        @NotNull
        public final Result component1() {
            return this.a;
        }

        @NotNull
        public final UpdateStatisticsRefererLog copy(@NotNull Result result0) {
            Intrinsics.checkNotNullParameter(result0, "result");
            return new UpdateStatisticsRefererLog(result0);
        }

        public static UpdateStatisticsRefererLog copy$default(UpdateStatisticsRefererLog blogMainIntent$UpdateStatisticsRefererLog0, Result result0, int v, Object object0) {
            if((v & 1) != 0) {
                result0 = blogMainIntent$UpdateStatisticsRefererLog0.a;
            }
            return blogMainIntent$UpdateStatisticsRefererLog0.copy(result0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdateStatisticsRefererLog ? Intrinsics.areEqual(this.a, ((UpdateStatisticsRefererLog)object0).a) : false;
        }

        @NotNull
        public final Result getResult() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdateStatisticsRefererLog(result=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001B\u0012\u0012\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001A\u00020\u00002\u0014\b\u0002\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\t¨\u0006\u001A"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateStatisticsRevenue;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "Lcom/kakao/tistory/domain/revenue/entity/RevenueCurrent;", "result", "<init>", "(Lcom/kakao/tistory/domain/entity/common/Result;)V", "component1", "()Lcom/kakao/tistory/domain/entity/common/Result;", "copy", "(Lcom/kakao/tistory/domain/entity/common/Result;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateStatisticsRevenue;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/domain/entity/common/Result;", "getResult", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateStatisticsRevenue implements BlogMainIntent {
        public static final int $stable = 8;
        public final Result a;

        public UpdateStatisticsRevenue(@NotNull Result result0) {
            Intrinsics.checkNotNullParameter(result0, "result");
            super();
            this.a = result0;
        }

        @NotNull
        public final Result component1() {
            return this.a;
        }

        @NotNull
        public final UpdateStatisticsRevenue copy(@NotNull Result result0) {
            Intrinsics.checkNotNullParameter(result0, "result");
            return new UpdateStatisticsRevenue(result0);
        }

        public static UpdateStatisticsRevenue copy$default(UpdateStatisticsRevenue blogMainIntent$UpdateStatisticsRevenue0, Result result0, int v, Object object0) {
            if((v & 1) != 0) {
                result0 = blogMainIntent$UpdateStatisticsRevenue0.a;
            }
            return blogMainIntent$UpdateStatisticsRevenue0.copy(result0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdateStatisticsRevenue ? Intrinsics.areEqual(this.a, ((UpdateStatisticsRevenue)object0).a) : false;
        }

        @NotNull
        public final Result getResult() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdateStatisticsRevenue(result=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0012\u001A\u00020\u00022\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateStatisticsRevenueEnable;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "", "enable", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateStatisticsRevenueEnable;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getEnable", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateStatisticsRevenueEnable implements BlogMainIntent {
        public static final int $stable;
        public final boolean a;

        public UpdateStatisticsRevenueEnable(boolean z) {
            this.a = z;
        }

        public final boolean component1() {
            return this.a;
        }

        @NotNull
        public final UpdateStatisticsRevenueEnable copy(boolean z) {
            return new UpdateStatisticsRevenueEnable(z);
        }

        public static UpdateStatisticsRevenueEnable copy$default(UpdateStatisticsRevenueEnable blogMainIntent$UpdateStatisticsRevenueEnable0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                z = blogMainIntent$UpdateStatisticsRevenueEnable0.a;
            }
            return blogMainIntent$UpdateStatisticsRevenueEnable0.copy(z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdateStatisticsRevenueEnable ? this.a == ((UpdateStatisticsRevenueEnable)object0).a : false;
        }

        public final boolean getEnable() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.a);
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdateStatisticsRevenueEnable(enable=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001B\u0012\u0012\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001A\u00020\u00002\u0014\b\u0002\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\t¨\u0006\u001A"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateStatisticsTrend;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "Lcom/kakao/tistory/domain/blog/entity/Trend;", "result", "<init>", "(Lcom/kakao/tistory/domain/entity/common/Result;)V", "component1", "()Lcom/kakao/tistory/domain/entity/common/Result;", "copy", "(Lcom/kakao/tistory/domain/entity/common/Result;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateStatisticsTrend;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/domain/entity/common/Result;", "getResult", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateStatisticsTrend implements BlogMainIntent {
        public static final int $stable = 8;
        public final Result a;

        public UpdateStatisticsTrend(@NotNull Result result0) {
            Intrinsics.checkNotNullParameter(result0, "result");
            super();
            this.a = result0;
        }

        @NotNull
        public final Result component1() {
            return this.a;
        }

        @NotNull
        public final UpdateStatisticsTrend copy(@NotNull Result result0) {
            Intrinsics.checkNotNullParameter(result0, "result");
            return new UpdateStatisticsTrend(result0);
        }

        public static UpdateStatisticsTrend copy$default(UpdateStatisticsTrend blogMainIntent$UpdateStatisticsTrend0, Result result0, int v, Object object0) {
            if((v & 1) != 0) {
                result0 = blogMainIntent$UpdateStatisticsTrend0.a;
            }
            return blogMainIntent$UpdateStatisticsTrend0.copy(result0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdateStatisticsTrend ? Intrinsics.areEqual(this.a, ((UpdateStatisticsTrend)object0).a) : false;
        }

        @NotNull
        public final Result getResult() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdateStatisticsTrend(result=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ \u0010\f\u001A\u00020\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u000B¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateTopEntryList;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent;", "", "Lcom/kakao/tistory/domain/statistics/entity/TopEntry;", "data", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainIntent$UpdateTopEntryList;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getData", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateTopEntryList implements BlogMainIntent {
        public static final int $stable = 8;
        public final List a;

        public UpdateTopEntryList(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "data");
            super();
            this.a = list0;
        }

        @NotNull
        public final List component1() {
            return this.a;
        }

        @NotNull
        public final UpdateTopEntryList copy(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "data");
            return new UpdateTopEntryList(list0);
        }

        public static UpdateTopEntryList copy$default(UpdateTopEntryList blogMainIntent$UpdateTopEntryList0, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                list0 = blogMainIntent$UpdateTopEntryList0.a;
            }
            return blogMainIntent$UpdateTopEntryList0.copy(list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdateTopEntryList ? Intrinsics.areEqual(this.a, ((UpdateTopEntryList)object0).a) : false;
        }

        @NotNull
        public final List getData() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return a.d("UpdateTopEntryList(data=[", CollectionsKt___CollectionsKt.joinToString$default(this.a, null, null, null, 0, null, m0.a, 0x1F, null), "])");
        }
    }

}

