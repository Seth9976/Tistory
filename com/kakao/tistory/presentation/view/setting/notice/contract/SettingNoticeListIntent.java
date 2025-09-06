package com.kakao.tistory.presentation.view.setting.notice.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.Pager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListIntent;", "", "Load", "LoadComplete", "Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListIntent$Load;", "Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListIntent$LoadComplete;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface SettingNoticeListIntent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListIntent$Load;", "Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Load implements SettingNoticeListIntent {
        public static final int $stable;
        @NotNull
        public static final Load INSTANCE;

        static {
            Load.INSTANCE = new Load();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof Load;
        }

        @Override
        public int hashCode() {
            return 0xE08779B1;
        }

        @Override
        @NotNull
        public String toString() {
            return "Load";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001B\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001A\u00020\u00002\u0014\b\u0002\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListIntent$LoadComplete;", "Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListIntent;", "Landroidx/paging/Pager;", "", "Lcom/kakao/tistory/domain/blog/entity/Entry;", "noticeListPager", "<init>", "(Landroidx/paging/Pager;)V", "component1", "()Landroidx/paging/Pager;", "copy", "(Landroidx/paging/Pager;)Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListIntent$LoadComplete;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/paging/Pager;", "getNoticeListPager", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class LoadComplete implements SettingNoticeListIntent {
        public static final int $stable = 8;
        public final Pager a;

        public LoadComplete(@NotNull Pager pager0) {
            Intrinsics.checkNotNullParameter(pager0, "noticeListPager");
            super();
            this.a = pager0;
        }

        @NotNull
        public final Pager component1() {
            return this.a;
        }

        @NotNull
        public final LoadComplete copy(@NotNull Pager pager0) {
            Intrinsics.checkNotNullParameter(pager0, "noticeListPager");
            return new LoadComplete(pager0);
        }

        public static LoadComplete copy$default(LoadComplete settingNoticeListIntent$LoadComplete0, Pager pager0, int v, Object object0) {
            if((v & 1) != 0) {
                pager0 = settingNoticeListIntent$LoadComplete0.a;
            }
            return settingNoticeListIntent$LoadComplete0.copy(pager0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof LoadComplete ? Intrinsics.areEqual(this.a, ((LoadComplete)object0).a) : false;
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
            return "LoadComplete(noticeListPager=" + this.a + ")";
        }
    }

}

