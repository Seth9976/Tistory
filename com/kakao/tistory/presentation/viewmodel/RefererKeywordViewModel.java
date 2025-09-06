package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001B\u0010\b\u001A\u00020\u00072\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tR#\u0010\u000F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\n8\u0006¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/RefererKeywordViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "<init>", "()V", "", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererKeywordItem;", "list", "", "setRefKeywordList", "(Ljava/util/List;)V", "Landroidx/lifecycle/MutableLiveData;", "g", "Landroidx/lifecycle/MutableLiveData;", "getRefererKeyword", "()Landroidx/lifecycle/MutableLiveData;", "refererKeyword", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class RefererKeywordViewModel extends TistoryViewModel {
    public static final int $stable = 8;
    public final MutableLiveData g;

    @Inject
    public RefererKeywordViewModel() {
        this.g = new MutableLiveData();
    }

    @NotNull
    public final MutableLiveData getRefererKeyword() {
        return this.g;
    }

    public final void setRefKeywordList(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "list");
        this.g.postValue(list0);
    }
}

