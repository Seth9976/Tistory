package com.kakao.tistory.presentation.screen.blog.main.contract;

import a5.b;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.common.event.ShowToastEvent;
import com.kakao.tistory.presentation.screen.item.GuestbookExtra;
import com.kakao.tistory.presentation.viewmodel.BlogTopReportData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0018\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u0082\u0001\u0018\u001A\u001B\u001C\u001D\u001E\u001F !\"#$%&\'()*+,-./01¨\u00062"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "", "CopyPassword", "Finish", "GoAuthWeb", "GoBlogSetting", "GoEntry", "GoEntryEditor", "GoEntryStatistics", "GoFollowerList", "GoFollowingList", "GoGuestBook", "GoNoticeList", "GoRefererKeyword", "GoRefererLog", "GoRevenue", "GoSearch", "GoShare", "GoStoryCreator", "GoTopEntryList", "GoTrend", "GoWeb", "ShowBlogSwitchBottomSheet", "ShowReportBottomSheet", "ShowToast", "ShowToastBarDialog", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$CopyPassword;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$Finish;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoAuthWeb;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoBlogSetting;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoEntry;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoEntryEditor;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoEntryStatistics;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoFollowerList;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoFollowingList;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoGuestBook;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoNoticeList;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoRefererKeyword;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoRefererLog;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoRevenue;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoSearch;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoShare;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoStoryCreator;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoTopEntryList;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoTrend;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoWeb;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$ShowBlogSwitchBottomSheet;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$ShowReportBottomSheet;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$ShowToast;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$ShowToastBarDialog;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface BlogMainEvent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$CopyPassword;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "", "password", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$CopyPassword;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPassword", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class CopyPassword implements BlogMainEvent {
        public static final int $stable;
        public final String a;

        public CopyPassword(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "password");
            super();
            this.a = s;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final CopyPassword copy(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "password");
            return new CopyPassword(s);
        }

        public static CopyPassword copy$default(CopyPassword blogMainEvent$CopyPassword0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = blogMainEvent$CopyPassword0.a;
            }
            return blogMainEvent$CopyPassword0.copy(s);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof CopyPassword ? Intrinsics.areEqual(this.a, ((CopyPassword)object0).a) : false;
        }

        @NotNull
        public final String getPassword() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "CopyPassword(password=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$Finish;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Finish implements BlogMainEvent {
        public static final int $stable;
        @NotNull
        public static final Finish INSTANCE;

        static {
            Finish.INSTANCE = new Finish();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof Finish;
        }

        @Override
        public int hashCode() {
            return 0x7540AF21;
        }

        @Override
        @NotNull
        public String toString() {
            return "Finish";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoAuthWeb;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoAuthWeb;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getUrl", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoAuthWeb implements BlogMainEvent {
        public static final int $stable;
        public final String a;

        public GoAuthWeb(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "url");
            super();
            this.a = s;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final GoAuthWeb copy(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "url");
            return new GoAuthWeb(s);
        }

        public static GoAuthWeb copy$default(GoAuthWeb blogMainEvent$GoAuthWeb0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = blogMainEvent$GoAuthWeb0.a;
            }
            return blogMainEvent$GoAuthWeb0.copy(s);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof GoAuthWeb ? Intrinsics.areEqual(this.a, ((GoAuthWeb)object0).a) : false;
        }

        @NotNull
        public final String getUrl() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "GoAuthWeb(url=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoBlogSetting;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoBlogSetting implements BlogMainEvent {
        public static final int $stable;
        @NotNull
        public static final GoBlogSetting INSTANCE;

        static {
            GoBlogSetting.INSTANCE = new GoBlogSetting();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof GoBlogSetting;
        }

        @Override
        public int hashCode() {
            return -145590280;
        }

        @Override
        @NotNull
        public String toString() {
            return "GoBlogSetting";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000E\u0010\tJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u000B¨\u0006\u001D"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoEntry;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "", "blogName", "", "entryId", "<init>", "(Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoEntry;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "b", "J", "getEntryId", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoEntry implements BlogMainEvent {
        public static final int $stable;
        public final String a;
        public final long b;

        public GoEntry(@NotNull String s, long v) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            super();
            this.a = s;
            this.b = v;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        public final long component2() {
            return this.b;
        }

        @NotNull
        public final GoEntry copy(@NotNull String s, long v) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            return new GoEntry(s, v);
        }

        public static GoEntry copy$default(GoEntry blogMainEvent$GoEntry0, String s, long v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                s = blogMainEvent$GoEntry0.a;
            }
            if((v1 & 2) != 0) {
                v = blogMainEvent$GoEntry0.b;
            }
            return blogMainEvent$GoEntry0.copy(s, v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof GoEntry)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((GoEntry)object0).a) ? this.b == ((GoEntry)object0).b : false;
        }

        @NotNull
        public final String getBlogName() {
            return this.a;
        }

        public final long getEntryId() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return Long.hashCode(this.b) + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "GoEntry(blogName=" + this.a + ", entryId=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000E\u0010\tJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u000B¨\u0006\u001D"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoEntryEditor;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "", "blogName", "", "entryId", "<init>", "(Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoEntryEditor;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "b", "J", "getEntryId", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoEntryEditor implements BlogMainEvent {
        public static final int $stable;
        public final String a;
        public final long b;

        public GoEntryEditor(@NotNull String s, long v) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            super();
            this.a = s;
            this.b = v;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        public final long component2() {
            return this.b;
        }

        @NotNull
        public final GoEntryEditor copy(@NotNull String s, long v) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            return new GoEntryEditor(s, v);
        }

        public static GoEntryEditor copy$default(GoEntryEditor blogMainEvent$GoEntryEditor0, String s, long v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                s = blogMainEvent$GoEntryEditor0.a;
            }
            if((v1 & 2) != 0) {
                v = blogMainEvent$GoEntryEditor0.b;
            }
            return blogMainEvent$GoEntryEditor0.copy(s, v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof GoEntryEditor)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((GoEntryEditor)object0).a) ? this.b == ((GoEntryEditor)object0).b : false;
        }

        @NotNull
        public final String getBlogName() {
            return this.a;
        }

        public final long getEntryId() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return Long.hashCode(this.b) + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "GoEntryEditor(blogName=" + this.a + ", entryId=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000B\b\u0087\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0017\u001A\u00020\u00162\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\nR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\fR\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001F\u0010\u001A\u001A\u0004\b \u0010\n¨\u0006!"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoEntryStatistics;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "", "blogName", "", "entryId", "title", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "copy", "(Ljava/lang/String;JLjava/lang/String;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoEntryStatistics;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "b", "J", "getEntryId", "c", "getTitle", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoEntryStatistics implements BlogMainEvent {
        public static final int $stable;
        public final String a;
        public final long b;
        public final String c;

        public GoEntryStatistics(@NotNull String s, long v, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            Intrinsics.checkNotNullParameter(s1, "title");
            super();
            this.a = s;
            this.b = v;
            this.c = s1;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        public final long component2() {
            return this.b;
        }

        @NotNull
        public final String component3() {
            return this.c;
        }

        @NotNull
        public final GoEntryStatistics copy(@NotNull String s, long v, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            Intrinsics.checkNotNullParameter(s1, "title");
            return new GoEntryStatistics(s, v, s1);
        }

        public static GoEntryStatistics copy$default(GoEntryStatistics blogMainEvent$GoEntryStatistics0, String s, long v, String s1, int v1, Object object0) {
            if((v1 & 1) != 0) {
                s = blogMainEvent$GoEntryStatistics0.a;
            }
            if((v1 & 2) != 0) {
                v = blogMainEvent$GoEntryStatistics0.b;
            }
            if((v1 & 4) != 0) {
                s1 = blogMainEvent$GoEntryStatistics0.c;
            }
            return blogMainEvent$GoEntryStatistics0.copy(s, v, s1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof GoEntryStatistics)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((GoEntryStatistics)object0).a)) {
                return false;
            }
            return this.b == ((GoEntryStatistics)object0).b ? Intrinsics.areEqual(this.c, ((GoEntryStatistics)object0).c) : false;
        }

        @NotNull
        public final String getBlogName() {
            return this.a;
        }

        public final long getEntryId() {
            return this.b;
        }

        @NotNull
        public final String getTitle() {
            return this.c;
        }

        @Override
        public int hashCode() {
            return this.c.hashCode() + a.k(this.b, this.a.hashCode() * 0x1F, 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("GoEntryStatistics(blogName=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", entryId=");
            stringBuilder0.append(this.b);
            return b.q(stringBuilder0, ", title=", this.c, ")");
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoFollowerList;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "", "blogName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoFollowerList;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoFollowerList implements BlogMainEvent {
        public static final int $stable;
        public final String a;

        public GoFollowerList(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            super();
            this.a = s;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final GoFollowerList copy(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            return new GoFollowerList(s);
        }

        public static GoFollowerList copy$default(GoFollowerList blogMainEvent$GoFollowerList0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = blogMainEvent$GoFollowerList0.a;
            }
            return blogMainEvent$GoFollowerList0.copy(s);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof GoFollowerList ? Intrinsics.areEqual(this.a, ((GoFollowerList)object0).a) : false;
        }

        @NotNull
        public final String getBlogName() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "GoFollowerList(blogName=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoFollowingList;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "", "blogName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoFollowingList;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoFollowingList implements BlogMainEvent {
        public static final int $stable;
        public final String a;

        public GoFollowingList(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            super();
            this.a = s;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final GoFollowingList copy(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            return new GoFollowingList(s);
        }

        public static GoFollowingList copy$default(GoFollowingList blogMainEvent$GoFollowingList0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = blogMainEvent$GoFollowingList0.a;
            }
            return blogMainEvent$GoFollowingList0.copy(s);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof GoFollowingList ? Intrinsics.areEqual(this.a, ((GoFollowingList)object0).a) : false;
        }

        @NotNull
        public final String getBlogName() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "GoFollowingList(blogName=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoGuestBook;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "Lcom/kakao/tistory/presentation/screen/item/GuestbookExtra;", "guestbookExtra", "<init>", "(Lcom/kakao/tistory/presentation/screen/item/GuestbookExtra;)V", "component1", "()Lcom/kakao/tistory/presentation/screen/item/GuestbookExtra;", "copy", "(Lcom/kakao/tistory/presentation/screen/item/GuestbookExtra;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoGuestBook;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/screen/item/GuestbookExtra;", "getGuestbookExtra", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoGuestBook implements BlogMainEvent {
        public static final int $stable;
        public final GuestbookExtra a;

        public GoGuestBook(@NotNull GuestbookExtra guestbookExtra0) {
            Intrinsics.checkNotNullParameter(guestbookExtra0, "guestbookExtra");
            super();
            this.a = guestbookExtra0;
        }

        @NotNull
        public final GuestbookExtra component1() {
            return this.a;
        }

        @NotNull
        public final GoGuestBook copy(@NotNull GuestbookExtra guestbookExtra0) {
            Intrinsics.checkNotNullParameter(guestbookExtra0, "guestbookExtra");
            return new GoGuestBook(guestbookExtra0);
        }

        public static GoGuestBook copy$default(GoGuestBook blogMainEvent$GoGuestBook0, GuestbookExtra guestbookExtra0, int v, Object object0) {
            if((v & 1) != 0) {
                guestbookExtra0 = blogMainEvent$GoGuestBook0.a;
            }
            return blogMainEvent$GoGuestBook0.copy(guestbookExtra0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof GoGuestBook ? Intrinsics.areEqual(this.a, ((GoGuestBook)object0).a) : false;
        }

        @NotNull
        public final GuestbookExtra getGuestbookExtra() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "GoGuestBook(guestbookExtra=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoNoticeList;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoNoticeList implements BlogMainEvent {
        public static final int $stable;
        @NotNull
        public static final GoNoticeList INSTANCE;

        static {
            GoNoticeList.INSTANCE = new GoNoticeList();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof GoNoticeList;
        }

        @Override
        public int hashCode() {
            return 0x7A53F6AC;
        }

        @Override
        @NotNull
        public String toString() {
            return "GoNoticeList";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001A\u00020\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoRefererKeyword;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "", "Lcom/kakao/tistory/domain/blog/entity/RefererKeyword;", "list", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoRefererKeyword;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getList", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoRefererKeyword implements BlogMainEvent {
        public static final int $stable = 8;
        public final List a;

        public GoRefererKeyword(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "list");
            super();
            this.a = list0;
        }

        @NotNull
        public final List component1() {
            return this.a;
        }

        @NotNull
        public final GoRefererKeyword copy(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "list");
            return new GoRefererKeyword(list0);
        }

        public static GoRefererKeyword copy$default(GoRefererKeyword blogMainEvent$GoRefererKeyword0, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                list0 = blogMainEvent$GoRefererKeyword0.a;
            }
            return blogMainEvent$GoRefererKeyword0.copy(list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof GoRefererKeyword ? Intrinsics.areEqual(this.a, ((GoRefererKeyword)object0).a) : false;
        }

        @NotNull
        public final List getList() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "GoRefererKeyword(list=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoRefererLog;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "", "blogName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoRefererLog;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoRefererLog implements BlogMainEvent {
        public static final int $stable;
        public final String a;

        public GoRefererLog(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            super();
            this.a = s;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final GoRefererLog copy(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            return new GoRefererLog(s);
        }

        public static GoRefererLog copy$default(GoRefererLog blogMainEvent$GoRefererLog0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = blogMainEvent$GoRefererLog0.a;
            }
            return blogMainEvent$GoRefererLog0.copy(s);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof GoRefererLog ? Intrinsics.areEqual(this.a, ((GoRefererLog)object0).a) : false;
        }

        @NotNull
        public final String getBlogName() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "GoRefererLog(blogName=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoRevenue;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoRevenue implements BlogMainEvent {
        public static final int $stable;
        @NotNull
        public static final GoRevenue INSTANCE;

        static {
            GoRevenue.INSTANCE = new GoRevenue();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof GoRevenue;
        }

        @Override
        public int hashCode() {
            return 0x61024C6;
        }

        @Override
        @NotNull
        public String toString() {
            return "GoRevenue";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoSearch;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "", "blogName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoSearch;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoSearch implements BlogMainEvent {
        public static final int $stable;
        public final String a;

        public GoSearch(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            super();
            this.a = s;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final GoSearch copy(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            return new GoSearch(s);
        }

        public static GoSearch copy$default(GoSearch blogMainEvent$GoSearch0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = blogMainEvent$GoSearch0.a;
            }
            return blogMainEvent$GoSearch0.copy(s);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof GoSearch ? Intrinsics.areEqual(this.a, ((GoSearch)object0).a) : false;
        }

        @NotNull
        public final String getBlogName() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "GoSearch(blogName=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\bR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001A\u0004\b\u0019\u0010\b¨\u0006\u001A"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoShare;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "", "title", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoShare;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "b", "getUrl", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoShare implements BlogMainEvent {
        public static final int $stable;
        public final String a;
        public final String b;

        public GoShare(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "title");
            Intrinsics.checkNotNullParameter(s1, "url");
            super();
            this.a = s;
            this.b = s1;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final String component2() {
            return this.b;
        }

        @NotNull
        public final GoShare copy(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "title");
            Intrinsics.checkNotNullParameter(s1, "url");
            return new GoShare(s, s1);
        }

        public static GoShare copy$default(GoShare blogMainEvent$GoShare0, String s, String s1, int v, Object object0) {
            if((v & 1) != 0) {
                s = blogMainEvent$GoShare0.a;
            }
            if((v & 2) != 0) {
                s1 = blogMainEvent$GoShare0.b;
            }
            return blogMainEvent$GoShare0.copy(s, s1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof GoShare)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((GoShare)object0).a) ? Intrinsics.areEqual(this.b, ((GoShare)object0).b) : false;
        }

        @NotNull
        public final String getTitle() {
            return this.a;
        }

        @NotNull
        public final String getUrl() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "GoShare(title=" + this.a + ", url=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoStoryCreator;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "", "link", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoStoryCreator;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getLink", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoStoryCreator implements BlogMainEvent {
        public static final int $stable;
        public final String a;

        public GoStoryCreator(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "link");
            super();
            this.a = s;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final GoStoryCreator copy(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "link");
            return new GoStoryCreator(s);
        }

        public static GoStoryCreator copy$default(GoStoryCreator blogMainEvent$GoStoryCreator0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = blogMainEvent$GoStoryCreator0.a;
            }
            return blogMainEvent$GoStoryCreator0.copy(s);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof GoStoryCreator ? Intrinsics.areEqual(this.a, ((GoStoryCreator)object0).a) : false;
        }

        @NotNull
        public final String getLink() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "GoStoryCreator(link=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000E\u0010\tJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0014\u001A\u00020\u00042\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u0005\u0010\u000B¨\u0006\u001B"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoTopEntryList;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "", "blogName", "", "isMine", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoTopEntryList;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "b", "Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoTopEntryList implements BlogMainEvent {
        public static final int $stable;
        public final String a;
        public final boolean b;

        public GoTopEntryList(@NotNull String s, boolean z) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            super();
            this.a = s;
            this.b = z;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        public final boolean component2() {
            return this.b;
        }

        @NotNull
        public final GoTopEntryList copy(@NotNull String s, boolean z) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            return new GoTopEntryList(s, z);
        }

        public static GoTopEntryList copy$default(GoTopEntryList blogMainEvent$GoTopEntryList0, String s, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                s = blogMainEvent$GoTopEntryList0.a;
            }
            if((v & 2) != 0) {
                z = blogMainEvent$GoTopEntryList0.b;
            }
            return blogMainEvent$GoTopEntryList0.copy(s, z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof GoTopEntryList)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((GoTopEntryList)object0).a) ? this.b == ((GoTopEntryList)object0).b : false;
        }

        @NotNull
        public final String getBlogName() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.b) + this.a.hashCode() * 0x1F;
        }

        public final boolean isMine() {
            return this.b;
        }

        @Override
        @NotNull
        public String toString() {
            return "GoTopEntryList(blogName=" + this.a + ", isMine=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoTrend;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "", "blogName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoTrend;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoTrend implements BlogMainEvent {
        public static final int $stable;
        public final String a;

        public GoTrend(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            super();
            this.a = s;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final GoTrend copy(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            return new GoTrend(s);
        }

        public static GoTrend copy$default(GoTrend blogMainEvent$GoTrend0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = blogMainEvent$GoTrend0.a;
            }
            return blogMainEvent$GoTrend0.copy(s);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof GoTrend ? Intrinsics.areEqual(this.a, ((GoTrend)object0).a) : false;
        }

        @NotNull
        public final String getBlogName() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "GoTrend(blogName=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoWeb;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$GoWeb;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getUrl", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoWeb implements BlogMainEvent {
        public static final int $stable;
        public final String a;

        public GoWeb(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "url");
            super();
            this.a = s;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final GoWeb copy(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "url");
            return new GoWeb(s);
        }

        public static GoWeb copy$default(GoWeb blogMainEvent$GoWeb0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = blogMainEvent$GoWeb0.a;
            }
            return blogMainEvent$GoWeb0.copy(s);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof GoWeb ? Intrinsics.areEqual(this.a, ((GoWeb)object0).a) : false;
        }

        @NotNull
        public final String getUrl() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "GoWeb(url=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$ShowBlogSwitchBottomSheet;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowBlogSwitchBottomSheet implements BlogMainEvent {
        public static final int $stable;
        @NotNull
        public static final ShowBlogSwitchBottomSheet INSTANCE;

        static {
            ShowBlogSwitchBottomSheet.INSTANCE = new ShowBlogSwitchBottomSheet();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof ShowBlogSwitchBottomSheet;
        }

        @Override
        public int hashCode() {
            return 697520723;
        }

        @Override
        @NotNull
        public String toString() {
            return "ShowBlogSwitchBottomSheet";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ.\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000BJ\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0019\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u000BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\rR\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010\u000F¨\u0006$"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$ShowReportBottomSheet;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "", "blogName", "", "blogId", "Lcom/kakao/tistory/presentation/viewmodel/BlogTopReportData;", "blogReportData", "<init>", "(Ljava/lang/String;JLcom/kakao/tistory/presentation/viewmodel/BlogTopReportData;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()Lcom/kakao/tistory/presentation/viewmodel/BlogTopReportData;", "copy", "(Ljava/lang/String;JLcom/kakao/tistory/presentation/viewmodel/BlogTopReportData;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$ShowReportBottomSheet;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "b", "J", "getBlogId", "c", "Lcom/kakao/tistory/presentation/viewmodel/BlogTopReportData;", "getBlogReportData", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowReportBottomSheet implements BlogMainEvent {
        public static final int $stable;
        public final String a;
        public final long b;
        public final BlogTopReportData c;

        public ShowReportBottomSheet(@NotNull String s, long v, @NotNull BlogTopReportData blogTopReportData0) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            Intrinsics.checkNotNullParameter(blogTopReportData0, "blogReportData");
            super();
            this.a = s;
            this.b = v;
            this.c = blogTopReportData0;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        public final long component2() {
            return this.b;
        }

        @NotNull
        public final BlogTopReportData component3() {
            return this.c;
        }

        @NotNull
        public final ShowReportBottomSheet copy(@NotNull String s, long v, @NotNull BlogTopReportData blogTopReportData0) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            Intrinsics.checkNotNullParameter(blogTopReportData0, "blogReportData");
            return new ShowReportBottomSheet(s, v, blogTopReportData0);
        }

        public static ShowReportBottomSheet copy$default(ShowReportBottomSheet blogMainEvent$ShowReportBottomSheet0, String s, long v, BlogTopReportData blogTopReportData0, int v1, Object object0) {
            if((v1 & 1) != 0) {
                s = blogMainEvent$ShowReportBottomSheet0.a;
            }
            if((v1 & 2) != 0) {
                v = blogMainEvent$ShowReportBottomSheet0.b;
            }
            if((v1 & 4) != 0) {
                blogTopReportData0 = blogMainEvent$ShowReportBottomSheet0.c;
            }
            return blogMainEvent$ShowReportBottomSheet0.copy(s, v, blogTopReportData0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ShowReportBottomSheet)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((ShowReportBottomSheet)object0).a)) {
                return false;
            }
            return this.b == ((ShowReportBottomSheet)object0).b ? Intrinsics.areEqual(this.c, ((ShowReportBottomSheet)object0).c) : false;
        }

        public final long getBlogId() {
            return this.b;
        }

        @NotNull
        public final String getBlogName() {
            return this.a;
        }

        @NotNull
        public final BlogTopReportData getBlogReportData() {
            return this.c;
        }

        @Override
        public int hashCode() {
            return this.c.hashCode() + a.k(this.b, this.a.hashCode() * 0x1F, 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            return "ShowReportBottomSheet(blogName=" + this.a + ", blogId=" + this.b + ", blogReportData=" + this.c + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001F\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000B\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ(\u0010\r\u001A\u00020\u00002\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000F\u0010\nJ\u0010\u0010\u0010\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001C\u0010\u0004\u001A\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\nR\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\f¨\u0006\u001D"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$ShowToast;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "Lcom/kakao/tistory/presentation/common/event/ShowToastEvent;", "", "message", "", "messageRes", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$ShowToast;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMessage", "b", "Ljava/lang/Integer;", "getMessageRes", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowToast implements ShowToastEvent, BlogMainEvent {
        public static final int $stable;
        public final String a;
        public final Integer b;

        public ShowToast() {
            this(null, null, 3, null);
        }

        public ShowToast(@Nullable String s, @Nullable Integer integer0) {
            this.a = s;
            this.b = integer0;
        }

        public ShowToast(String s, Integer integer0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                s = null;
            }
            if((v & 2) != 0) {
                integer0 = null;
            }
            this(s, integer0);
        }

        @Nullable
        public final String component1() {
            return this.a;
        }

        @Nullable
        public final Integer component2() {
            return this.b;
        }

        @NotNull
        public final ShowToast copy(@Nullable String s, @Nullable Integer integer0) {
            return new ShowToast(s, integer0);
        }

        public static ShowToast copy$default(ShowToast blogMainEvent$ShowToast0, String s, Integer integer0, int v, Object object0) {
            if((v & 1) != 0) {
                s = blogMainEvent$ShowToast0.a;
            }
            if((v & 2) != 0) {
                integer0 = blogMainEvent$ShowToast0.b;
            }
            return blogMainEvent$ShowToast0.copy(s, integer0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ShowToast)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((ShowToast)object0).a) ? Intrinsics.areEqual(this.b, ((ShowToast)object0).b) : false;
        }

        @Override  // com.kakao.tistory.presentation.common.event.ShowToastEvent
        @Nullable
        public String getMessage() {
            return this.a;
        }

        @Override  // com.kakao.tistory.presentation.common.event.ShowToastEvent
        @Nullable
        public Integer getMessageRes() {
            return this.b;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.a == null ? 0 : this.a.hashCode();
            Integer integer0 = this.b;
            if(integer0 != null) {
                v = integer0.hashCode();
            }
            return v1 * 0x1F + v;
        }

        @Override
        @NotNull
        public String toString() {
            return "ShowToast(message=" + this.a + ", messageRes=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0003\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$ShowToastBarDialog;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent;", "", "messageRes", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainEvent$ShowToastBarDialog;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getMessageRes", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowToastBarDialog implements BlogMainEvent {
        public static final int $stable;
        public final int a;

        public ShowToastBarDialog(@StringRes int v) {
            this.a = v;
        }

        public final int component1() {
            return this.a;
        }

        @NotNull
        public final ShowToastBarDialog copy(@StringRes int v) {
            return new ShowToastBarDialog(v);
        }

        public static ShowToastBarDialog copy$default(ShowToastBarDialog blogMainEvent$ShowToastBarDialog0, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = blogMainEvent$ShowToastBarDialog0.a;
            }
            return blogMainEvent$ShowToastBarDialog0.copy(v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ShowToastBarDialog ? this.a == ((ShowToastBarDialog)object0).a : false;
        }

        public final int getMessageRes() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a;
        }

        @Override
        @NotNull
        public String toString() {
            return "ShowToastBarDialog(messageRes=" + this.a + ")";
        }
    }

}

