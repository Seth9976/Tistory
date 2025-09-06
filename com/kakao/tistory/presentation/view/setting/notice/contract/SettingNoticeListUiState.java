package com.kakao.tistory.presentation.view.setting.notice.contract;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0016\b\u0002\u0010\u0005\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001E\u0010\b\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ(\u0010\n\u001A\u00020\u00002\u0016\b\u0002\u0010\u0005\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R%\u0010\u0005\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListUiState;", "", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeEntry;", "noticeList", "<init>", "(Lkotlinx/coroutines/flow/Flow;)V", "component1", "()Lkotlinx/coroutines/flow/Flow;", "copy", "(Lkotlinx/coroutines/flow/Flow;)Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeListUiState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlinx/coroutines/flow/Flow;", "getNoticeList", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SettingNoticeListUiState {
    public static final int $stable;
    public final Flow a;

    public SettingNoticeListUiState() {
        this(null, 1, null);
    }

    public SettingNoticeListUiState(@Nullable Flow flow0) {
        this.a = flow0;
    }

    public SettingNoticeListUiState(Flow flow0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            flow0 = null;
        }
        this(flow0);
    }

    @Nullable
    public final Flow component1() {
        return this.a;
    }

    @NotNull
    public final SettingNoticeListUiState copy(@Nullable Flow flow0) {
        return new SettingNoticeListUiState(flow0);
    }

    public static SettingNoticeListUiState copy$default(SettingNoticeListUiState settingNoticeListUiState0, Flow flow0, int v, Object object0) {
        if((v & 1) != 0) {
            flow0 = settingNoticeListUiState0.a;
        }
        return settingNoticeListUiState0.copy(flow0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof SettingNoticeListUiState ? Intrinsics.areEqual(this.a, ((SettingNoticeListUiState)object0).a) : false;
    }

    @Nullable
    public final Flow getNoticeList() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "SettingNoticeListUiState(noticeList=" + this.a + ")";
    }
}

