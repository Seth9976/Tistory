package com.kakao.tistory.presentation.view.setting.notice.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListEvent;", "", "Finish", "GoNotice", "Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListEvent$Finish;", "Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListEvent$GoNotice;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface SettingNoticeListEvent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListEvent$Finish;", "Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Finish implements SettingNoticeListEvent {
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
            return 0xC1C0810E;
        }

        @Override
        @NotNull
        public String toString() {
            return "Finish";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000E\u0010\tJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u000B¨\u0006\u001D"}, d2 = {"Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListEvent$GoNotice;", "Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListEvent;", "", "noticeBlogName", "", "noticeId", "<init>", "(Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListEvent$GoNotice;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getNoticeBlogName", "b", "J", "getNoticeId", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoNotice implements SettingNoticeListEvent {
        public static final int $stable;
        public final String a;
        public final long b;

        public GoNotice(@NotNull String s, long v) {
            Intrinsics.checkNotNullParameter(s, "noticeBlogName");
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
            Intrinsics.checkNotNullParameter(s, "noticeBlogName");
            return new GoNotice(s, v);
        }

        public static GoNotice copy$default(GoNotice settingNoticeListEvent$GoNotice0, String s, long v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                s = settingNoticeListEvent$GoNotice0.a;
            }
            if((v1 & 2) != 0) {
                v = settingNoticeListEvent$GoNotice0.b;
            }
            return settingNoticeListEvent$GoNotice0.copy(s, v);
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
        public final String getNoticeBlogName() {
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
            return "GoNotice(noticeBlogName=" + this.a + ", noticeId=" + this.b + ")";
        }
    }

}

