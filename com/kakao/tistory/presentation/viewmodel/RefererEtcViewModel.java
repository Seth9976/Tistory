package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kakao.android.base.utils.DateUtils;
import com.kakao.tistory.data.repository.OldStatisticsRepository;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\b\u0010\n\u001A\u0004\u0018\u00010\u00062\b\u0010\u000B\u001A\u0004\u0018\u00010\u00062\b\u0010\f\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0010\u001A\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0019\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u001A"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/RefererEtcViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/data/repository/OldStatisticsRepository;", "statisticsRepository", "<init>", "(Lcom/kakao/tistory/data/repository/OldStatisticsRepository;)V", "", "blogName", "", "entryId", "date", "granularity", "metric", "", "init", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRefererEtc", "()V", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/kakao/tistory/data/model/RefererEtcItem;", "m", "Landroidx/lifecycle/MutableLiveData;", "getRefererEtcItems", "()Landroidx/lifecycle/MutableLiveData;", "refererEtcItems", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class RefererEtcViewModel extends TistoryViewModel {
    public static final int $stable = 8;
    public final OldStatisticsRepository g;
    public final MutableLiveData h;
    public final MutableLiveData i;
    public final MutableLiveData j;
    public final MutableLiveData k;
    public final MutableLiveData l;
    public final MutableLiveData m;

    @Inject
    public RefererEtcViewModel(@NotNull OldStatisticsRepository oldStatisticsRepository0) {
        Intrinsics.checkNotNullParameter(oldStatisticsRepository0, "statisticsRepository");
        super();
        this.g = oldStatisticsRepository0;
        this.h = new MutableLiveData();
        this.i = new MutableLiveData();
        this.j = new MutableLiveData();
        this.k = new MutableLiveData();
        this.l = new MutableLiveData();
        this.m = new MutableLiveData();
    }

    public final void getRefererEtc() {
        Object object0 = this.h.getValue();
        if(((String)object0) == null) {
            return;
        }
        String s = (String)this.j.getValue();
        if(s == null) {
            s = DateUtils.getCurrentDateTime$default(DateUtils.INSTANCE, null, 1, null);
        }
        Intrinsics.checkNotNull(s);
        String s1 = (String)this.k.getValue();
        if(s1 == null) {
            s1 = "day";
        }
        Intrinsics.checkNotNull(s1);
        String s2 = (String)this.l.getValue();
        if(s2 == null) {
            s2 = "uv";
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new i3(this, ((String)object0), s, s1, s2, null), 3, null);
    }

    @NotNull
    public final MutableLiveData getRefererEtcItems() {
        return this.m;
    }

    public final void init(@NotNull String s, @Nullable Long long0, @Nullable String s1, @Nullable String s2, @Nullable String s3) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        this.h.setValue(s);
        this.i.setValue(long0);
        MutableLiveData mutableLiveData0 = this.j;
        if(s1 == null) {
            s1 = DateUtils.getCurrentDateTime$default(DateUtils.INSTANCE, null, 1, null);
        }
        mutableLiveData0.setValue(s1);
        MutableLiveData mutableLiveData1 = this.k;
        if(s2 == null) {
            s2 = "day";
        }
        mutableLiveData1.setValue(s2);
        this.l.setValue(s3);
    }

    public static void init$default(RefererEtcViewModel refererEtcViewModel0, String s, Long long0, String s1, String s2, String s3, int v, Object object0) {
        if((v & 2) != 0) {
            long0 = null;
        }
        refererEtcViewModel0.init(s, long0, s1, s2, s3);
    }
}

