package com.kakao.tistory.presentation.screen.blog.noticeList.contract;

import a5.b;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.common.event.ShowToastEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000B\f\r¨\u0006\u000E"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent;", "", "Finish", "GoEditor", "GoNotice", "GoStatistics", "ShowToast", "ShowToastBarDialog", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent$Finish;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent$GoEditor;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent$GoNotice;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent$GoStatistics;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent$ShowToast;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent$ShowToastBarDialog;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface BlogNoticeListEvent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent$Finish;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Finish implements BlogNoticeListEvent {
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
            return 1967506971;
        }

        @Override
        @NotNull
        public String toString() {
            return "Finish";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000E\u0010\tJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u000B¨\u0006\u001D"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent$GoEditor;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent;", "", "blogName", "", "id", "<init>", "(Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent$GoEditor;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "b", "J", "getId", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoEditor implements BlogNoticeListEvent {
        public static final int $stable;
        public final String a;
        public final long b;

        public GoEditor(@NotNull String s, long v) {
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
        public final GoEditor copy(@NotNull String s, long v) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            return new GoEditor(s, v);
        }

        public static GoEditor copy$default(GoEditor blogNoticeListEvent$GoEditor0, String s, long v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                s = blogNoticeListEvent$GoEditor0.a;
            }
            if((v1 & 2) != 0) {
                v = blogNoticeListEvent$GoEditor0.b;
            }
            return blogNoticeListEvent$GoEditor0.copy(s, v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof GoEditor)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((GoEditor)object0).a) ? this.b == ((GoEditor)object0).b : false;
        }

        @NotNull
        public final String getBlogName() {
            return this.a;
        }

        public final long getId() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return Long.hashCode(this.b) + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "GoEditor(blogName=" + this.a + ", id=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000E\u0010\tJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u000B¨\u0006\u001D"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent$GoNotice;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent;", "", "blogName", "", "noticeId", "<init>", "(Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent$GoNotice;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "b", "J", "getNoticeId", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoNotice implements BlogNoticeListEvent {
        public static final int $stable;
        public final String a;
        public final long b;

        public GoNotice(@NotNull String s, long v) {
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
        public final GoNotice copy(@NotNull String s, long v) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            return new GoNotice(s, v);
        }

        public static GoNotice copy$default(GoNotice blogNoticeListEvent$GoNotice0, String s, long v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                s = blogNoticeListEvent$GoNotice0.a;
            }
            if((v1 & 2) != 0) {
                v = blogNoticeListEvent$GoNotice0.b;
            }
            return blogNoticeListEvent$GoNotice0.copy(s, v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof GoNotice)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((GoNotice)object0).a) ? this.b == ((GoNotice)object0).b : false;
        }

        @NotNull
        public final String getBlogName() {
            return this.a;
        }

        public final long getNoticeId() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return Long.hashCode(this.b) + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "GoNotice(blogName=" + this.a + ", noticeId=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000B\b\u0087\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0017\u001A\u00020\u00162\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\nR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\fR\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001F\u0010\u001A\u001A\u0004\b \u0010\n¨\u0006!"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent$GoStatistics;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent;", "", "blogName", "", "id", "title", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "copy", "(Ljava/lang/String;JLjava/lang/String;)Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent$GoStatistics;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "b", "J", "getId", "c", "getTitle", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoStatistics implements BlogNoticeListEvent {
        public static final int $stable;
        public final String a;
        public final long b;
        public final String c;

        public GoStatistics(@NotNull String s, long v, @NotNull String s1) {
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
        public final GoStatistics copy(@NotNull String s, long v, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            Intrinsics.checkNotNullParameter(s1, "title");
            return new GoStatistics(s, v, s1);
        }

        public static GoStatistics copy$default(GoStatistics blogNoticeListEvent$GoStatistics0, String s, long v, String s1, int v1, Object object0) {
            if((v1 & 1) != 0) {
                s = blogNoticeListEvent$GoStatistics0.a;
            }
            if((v1 & 2) != 0) {
                v = blogNoticeListEvent$GoStatistics0.b;
            }
            if((v1 & 4) != 0) {
                s1 = blogNoticeListEvent$GoStatistics0.c;
            }
            return blogNoticeListEvent$GoStatistics0.copy(s, v, s1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof GoStatistics)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((GoStatistics)object0).a)) {
                return false;
            }
            return this.b == ((GoStatistics)object0).b ? Intrinsics.areEqual(this.c, ((GoStatistics)object0).c) : false;
        }

        @NotNull
        public final String getBlogName() {
            return this.a;
        }

        public final long getId() {
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
            StringBuilder stringBuilder0 = new StringBuilder("GoStatistics(blogName=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", id=");
            stringBuilder0.append(this.b);
            return b.q(stringBuilder0, ", title=", this.c, ")");
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001F\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000B\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ(\u0010\r\u001A\u00020\u00002\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000F\u0010\nJ\u0010\u0010\u0010\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001C\u0010\u0004\u001A\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\nR\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\f¨\u0006\u001D"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent$ShowToast;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent;", "Lcom/kakao/tistory/presentation/common/event/ShowToastEvent;", "", "message", "", "messageRes", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent$ShowToast;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMessage", "b", "Ljava/lang/Integer;", "getMessageRes", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowToast implements ShowToastEvent, BlogNoticeListEvent {
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

        public static ShowToast copy$default(ShowToast blogNoticeListEvent$ShowToast0, String s, Integer integer0, int v, Object object0) {
            if((v & 1) != 0) {
                s = blogNoticeListEvent$ShowToast0.a;
            }
            if((v & 2) != 0) {
                integer0 = blogNoticeListEvent$ShowToast0.b;
            }
            return blogNoticeListEvent$ShowToast0.copy(s, integer0);
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
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0003\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent$ShowToastBarDialog;", "Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent;", "", "messageRes", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/kakao/tistory/presentation/screen/blog/noticeList/contract/BlogNoticeListEvent$ShowToastBarDialog;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getMessageRes", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowToastBarDialog implements BlogNoticeListEvent {
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

        public static ShowToastBarDialog copy$default(ShowToastBarDialog blogNoticeListEvent$ShowToastBarDialog0, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = blogNoticeListEvent$ShowToastBarDialog0.a;
            }
            return blogNoticeListEvent$ShowToastBarDialog0.copy(v);
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

