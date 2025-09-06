package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kakao.android.base.BaseKt;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.data.repository.DashboardRepository;
import com.kakao.tistory.domain.entity.SortItem.LogRefSortItem;
import com.kakao.tistory.domain.entity.SortItem;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001%B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\b¢\u0006\u0004\b\u000B\u0010\fJ\u0013\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r¢\u0006\u0004\b\u000F\u0010\u0010J\u0015\u0010\u0012\u001A\u00020\n2\u0006\u0010\u0011\u001A\u00020\u000E¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001A\u00020\n2\u0006\u0010\u0014\u001A\u00020\b¢\u0006\u0004\b\u0015\u0010\fR\u001D\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR\u001D\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u001D0\u00168\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u0019\u001A\u0004\b\u001F\u0010\u001BR\u001D\u0010$\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0!0 8F¢\u0006\u0006\u001A\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/RefererLogViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "Lcom/kakao/tistory/data/repository/DashboardRepository;", "dashboardRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/AccountRepository;Lcom/kakao/tistory/data/repository/DashboardRepository;)V", "", "blogName", "", "init", "(Ljava/lang/String;)V", "", "Lcom/kakao/tistory/domain/entity/SortItem;", "getSortItems", "()Ljava/util/List;", "selectedSortItem", "updateReferLog", "(Lcom/kakao/tistory/domain/entity/SortItem;)V", "logUrl", "onClickRefererLog", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererLog;", "j", "Landroidx/lifecycle/MutableLiveData;", "getRefererLog", "()Landroidx/lifecycle/MutableLiveData;", "refererLog", "", "k", "isShowTopReferer", "Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/presentation/common/extension/Event;", "getGoToWeb", "()Landroidx/lifecycle/LiveData;", "goToWeb", "RefLogType", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRefererLogViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RefererLogViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/RefererLogViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
public final class RefererLogViewModel extends TistoryViewModel {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fj\u0002\b\u000Ej\u0002\b\u000F¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/RefererLogViewModel$RefLogType;", "", "", "a", "I", "getTitleResourceId", "()I", "titleResourceId", "", "b", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "LATEST", "TOP", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum RefLogType {
        LATEST(string.label_home_ref_log_latest, "latest"),
        TOP(string.label_home_ref_log_top, "top");

        public final int a;
        public final String b;
        public static final RefLogType[] c;
        public static final EnumEntries d;

        static {
            RefLogType.c = arr_refererLogViewModel$RefLogType;
            Intrinsics.checkNotNullParameter(arr_refererLogViewModel$RefLogType, "entries");
            RefLogType.d = new a(arr_refererLogViewModel$RefLogType);
        }

        public RefLogType(int v1, String s1) {
            this.a = v1;
            this.b = s1;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return RefLogType.d;
        }

        public final int getTitleResourceId() {
            return this.a;
        }

        @NotNull
        public final String getValue() {
            return this.b;
        }
    }

    public static final int $stable = 8;
    public final DashboardRepository g;
    public final MutableLiveData h;
    public String i;
    public final MutableLiveData j;
    public final MutableLiveData k;
    public final MutableLiveData l;

    @Inject
    public RefererLogViewModel(@NotNull AccountRepository accountRepository0, @NotNull DashboardRepository dashboardRepository0) {
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        Intrinsics.checkNotNullParameter(dashboardRepository0, "dashboardRepository");
        super();
        this.g = dashboardRepository0;
        this.h = accountRepository0.getOldCurrentBlog();
        this.j = dashboardRepository0.getRefererLog();
        MutableLiveData mutableLiveData0 = new MutableLiveData();
        this.k = mutableLiveData0;
        this.l = new MutableLiveData();
        mutableLiveData0.postValue(Boolean.FALSE);
    }

    @NotNull
    public final LiveData getGoToWeb() {
        return this.l;
    }

    @NotNull
    public final MutableLiveData getRefererLog() {
        return this.j;
    }

    @NotNull
    public final List getSortItems() {
        List list0 = new ArrayList();
        RefLogType[] arr_refererLogViewModel$RefLogType = RefLogType.values();
        for(int v = 0; v < arr_refererLogViewModel$RefLogType.length; ++v) {
            RefLogType refererLogViewModel$RefLogType0 = arr_refererLogViewModel$RefLogType[v];
            String s = BaseKt.getAppContext().getString(refererLogViewModel$RefLogType0.getTitleResourceId());
            Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
            ((ArrayList)list0).add(new LogRefSortItem(refererLogViewModel$RefLogType0.getValue(), s));
        }
        return list0;
    }

    public final void init(@Nullable String s) {
        this.i = s;
    }

    @NotNull
    public final MutableLiveData isShowTopReferer() {
        return this.k;
    }

    public final void onClickRefererLog(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "logUrl");
        Click click0 = TiaraUtils.createClick$default(TiaraUtils.INSTANCE, null, null, null, s, null, null, null, null, null, null, 0x3F7, null);
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_REFERER_LOG_URL, null, click0, null, null, null, 0xE8, null);
        Event event0 = new Event(s);
        this.l.postValue(event0);
    }

    public final void updateReferLog(@NotNull SortItem sortItem0) {
        Intrinsics.checkNotNullParameter(sortItem0, "selectedSortItem");
        if(!(sortItem0 instanceof LogRefSortItem)) {
            sortItem0 = null;
        }
        if(sortItem0 != null) {
            if(Intrinsics.areEqual(sortItem0.getType(), "top")) {
                this.k.postValue(Boolean.TRUE);
            }
            else {
                this.k.postValue(Boolean.FALSE);
            }
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new m3(this, ((LogRefSortItem)sortItem0), null), 3, null);
        }
    }
}

