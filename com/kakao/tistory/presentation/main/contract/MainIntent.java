package com.kakao.tistory.presentation.main.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.domain.entity.Blog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000B\f\r¨\u0006\u000E"}, d2 = {"Lcom/kakao/tistory/presentation/main/contract/MainIntent;", "", "BackPressedInHome", "ChangeCurrentBlog", "NavigateToEditor", "RedirectUrl", "UpdateNotificationCount", "WaitingTimeForFinishEnds", "Lcom/kakao/tistory/presentation/main/contract/MainIntent$BackPressedInHome;", "Lcom/kakao/tistory/presentation/main/contract/MainIntent$ChangeCurrentBlog;", "Lcom/kakao/tistory/presentation/main/contract/MainIntent$NavigateToEditor;", "Lcom/kakao/tistory/presentation/main/contract/MainIntent$RedirectUrl;", "Lcom/kakao/tistory/presentation/main/contract/MainIntent$UpdateNotificationCount;", "Lcom/kakao/tistory/presentation/main/contract/MainIntent$WaitingTimeForFinishEnds;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface MainIntent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/main/contract/MainIntent$BackPressedInHome;", "Lcom/kakao/tistory/presentation/main/contract/MainIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class BackPressedInHome implements MainIntent {
        public static final int $stable;
        @NotNull
        public static final BackPressedInHome INSTANCE;

        static {
            BackPressedInHome.INSTANCE = new BackPressedInHome();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof BackPressedInHome;
        }

        @Override
        public int hashCode() {
            return 0x99B8BEDB;
        }

        @Override
        @NotNull
        public String toString() {
            return "BackPressedInHome";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/main/contract/MainIntent$ChangeCurrentBlog;", "Lcom/kakao/tistory/presentation/main/contract/MainIntent;", "Lcom/kakao/tistory/domain/entity/Blog;", "blog", "<init>", "(Lcom/kakao/tistory/domain/entity/Blog;)V", "component1", "()Lcom/kakao/tistory/domain/entity/Blog;", "copy", "(Lcom/kakao/tistory/domain/entity/Blog;)Lcom/kakao/tistory/presentation/main/contract/MainIntent$ChangeCurrentBlog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/domain/entity/Blog;", "getBlog", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeCurrentBlog implements MainIntent {
        public static final int $stable = 8;
        public final Blog a;

        public ChangeCurrentBlog(@Nullable Blog blog0) {
            this.a = blog0;
        }

        @Nullable
        public final Blog component1() {
            return this.a;
        }

        @NotNull
        public final ChangeCurrentBlog copy(@Nullable Blog blog0) {
            return new ChangeCurrentBlog(blog0);
        }

        public static ChangeCurrentBlog copy$default(ChangeCurrentBlog mainIntent$ChangeCurrentBlog0, Blog blog0, int v, Object object0) {
            if((v & 1) != 0) {
                blog0 = mainIntent$ChangeCurrentBlog0.a;
            }
            return mainIntent$ChangeCurrentBlog0.copy(blog0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeCurrentBlog ? Intrinsics.areEqual(this.a, ((ChangeCurrentBlog)object0).a) : false;
        }

        @Nullable
        public final Blog getBlog() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a == null ? 0 : this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeCurrentBlog(blog=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/main/contract/MainIntent$NavigateToEditor;", "Lcom/kakao/tistory/presentation/main/contract/MainIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class NavigateToEditor implements MainIntent {
        public static final int $stable;
        @NotNull
        public static final NavigateToEditor INSTANCE;

        static {
            NavigateToEditor.INSTANCE = new NavigateToEditor();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof NavigateToEditor;
        }

        @Override
        public int hashCode() {
            return 0x5E84F6BD;
        }

        @Override
        @NotNull
        public String toString() {
            return "NavigateToEditor";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/main/contract/MainIntent$RedirectUrl;", "Lcom/kakao/tistory/presentation/main/contract/MainIntent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/main/contract/MainIntent$RedirectUrl;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getUrl", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RedirectUrl implements MainIntent {
        public static final int $stable;
        public final String a;

        public RedirectUrl(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "url");
            super();
            this.a = s;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final RedirectUrl copy(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "url");
            return new RedirectUrl(s);
        }

        public static RedirectUrl copy$default(RedirectUrl mainIntent$RedirectUrl0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = mainIntent$RedirectUrl0.a;
            }
            return mainIntent$RedirectUrl0.copy(s);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof RedirectUrl ? Intrinsics.areEqual(this.a, ((RedirectUrl)object0).a) : false;
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
            return "RedirectUrl(url=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/main/contract/MainIntent$UpdateNotificationCount;", "Lcom/kakao/tistory/presentation/main/contract/MainIntent;", "", "count", "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/kakao/tistory/presentation/main/contract/MainIntent$UpdateNotificationCount;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getCount", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateNotificationCount implements MainIntent {
        public static final int $stable;
        public final long a;

        public UpdateNotificationCount(long v) {
            this.a = v;
        }

        public final long component1() {
            return this.a;
        }

        @NotNull
        public final UpdateNotificationCount copy(long v) {
            return new UpdateNotificationCount(v);
        }

        public static UpdateNotificationCount copy$default(UpdateNotificationCount mainIntent$UpdateNotificationCount0, long v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = mainIntent$UpdateNotificationCount0.a;
            }
            return mainIntent$UpdateNotificationCount0.copy(v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdateNotificationCount ? this.a == ((UpdateNotificationCount)object0).a : false;
        }

        public final long getCount() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Long.hashCode(this.a);
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdateNotificationCount(count=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/main/contract/MainIntent$WaitingTimeForFinishEnds;", "Lcom/kakao/tistory/presentation/main/contract/MainIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class WaitingTimeForFinishEnds implements MainIntent {
        public static final int $stable;
        @NotNull
        public static final WaitingTimeForFinishEnds INSTANCE;

        static {
            WaitingTimeForFinishEnds.INSTANCE = new WaitingTimeForFinishEnds();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof WaitingTimeForFinishEnds;
        }

        @Override
        public int hashCode() {
            return 853617054;
        }

        @Override
        @NotNull
        public String toString() {
            return "WaitingTimeForFinishEnds";
        }
    }

}

