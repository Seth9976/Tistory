package com.kakao.tistory.domain.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0005\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\fH¦@¢\u0006\u0002\u0010\rR\u0018\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u001A\u0010\u0007\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX¦\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u000B¨\u0006\u000E"}, d2 = {"Lcom/kakao/tistory/domain/repository/AppInfoRepository;", "", "appInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kakao/tistory/domain/entity/appinfo/AppInfo;", "getAppInfo", "()Landroidx/lifecycle/MutableLiveData;", "step1", "Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/domain/entity/appinfo/Step1;", "getStep1", "()Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/domain/entity/common/Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface AppInfoRepository {
    @NotNull
    MutableLiveData getAppInfo();

    @Nullable
    Object getAppInfo(@NotNull Continuation arg1);

    @NotNull
    LiveData getStep1();
}

