package com.kakao.tistory.domain.home.usecase;

import com.kakao.tistory.domain.home.repository.HomeRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0086B¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/domain/home/usecase/SetCategoryPreferenceUseCase;", "", "Lcom/kakao/tistory/domain/home/repository/HomeRepository;", "homeRepository", "<init>", "(Lcom/kakao/tistory/domain/home/repository/HomeRepository;)V", "", "categoryGroupId", "", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SetCategoryPreferenceUseCase {
    public final HomeRepository a;

    @Inject
    public SetCategoryPreferenceUseCase(@NotNull HomeRepository homeRepository0) {
        Intrinsics.checkNotNullParameter(homeRepository0, "homeRepository");
        super();
        this.a = homeRepository0;
    }

    @Nullable
    public final Object invoke(@NotNull String s, @NotNull Continuation continuation0) {
        Object object0 = this.a.setCategoryPreference(s, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

