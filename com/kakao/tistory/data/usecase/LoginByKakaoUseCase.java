package com.kakao.tistory.data.usecase;

import com.kakao.tistory.domain.repository.AccountRepository;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JN\u0010\u0010\u001A\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000F0\u000E2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\b2\u000E\u0010\r\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fH\u0086B¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/kakao/tistory/data/usecase/LoginByKakaoUseCase;", "", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/AccountRepository;)V", "", "accessToken", "", "accessTokenExpiresAt", "refreshToken", "refreshTokenExpiresAt", "", "scopes", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kakao/tistory/domain/entity/common/Result;", "invoke", "(Ljava/lang/String;JLjava/lang/String;JLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class LoginByKakaoUseCase {
    public final AccountRepository a;

    @Inject
    public LoginByKakaoUseCase(@NotNull AccountRepository accountRepository0) {
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        super();
        this.a = accountRepository0;
    }

    @Nullable
    public final Object invoke(@NotNull String s, long v, @NotNull String s1, long v1, @Nullable List list0, @NotNull Continuation continuation0) {
        return FlowKt.flow(new b(list0, this, s, v, s1, v1, null));
    }
}

