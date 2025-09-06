package com.kakao.tistory.data.usecase;

import com.kakao.tistory.domain.repository.PushRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001E\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0086B¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/tistory/data/usecase/PushTokenUseCase;", "", "Lcom/kakao/tistory/domain/repository/PushRepository;", "pushRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/PushRepository;)V", "", "fcmToken", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PushTokenUseCase {
    public final PushRepository a;

    @Inject
    public PushTokenUseCase(@NotNull PushRepository pushRepository0) {
        Intrinsics.checkNotNullParameter(pushRepository0, "pushRepository");
        super();
        this.a = pushRepository0;
    }

    @Nullable
    public final Object invoke(@NotNull String s, @NotNull Continuation continuation0) {
        return this.a.postPushToken(s, continuation0);
    }
}

