package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.repository.AppInfoRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0086B¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/kakao/tistory/domain/usecase/GetAppInfoUseCase;", "", "Lcom/kakao/tistory/domain/repository/AppInfoRepository;", "appInfoRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/AppInfoRepository;)V", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/appinfo/AppInfo;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GetAppInfoUseCase {
    public final AppInfoRepository a;

    @Inject
    public GetAppInfoUseCase(@NotNull AppInfoRepository appInfoRepository0) {
        Intrinsics.checkNotNullParameter(appInfoRepository0, "appInfoRepository");
        super();
        this.a = appInfoRepository0;
    }

    @Nullable
    public final Object invoke(@NotNull Continuation continuation0) {
        return this.a.getAppInfo(continuation0);
    }
}

