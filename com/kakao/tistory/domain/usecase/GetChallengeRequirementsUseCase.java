package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.repository.EntryRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\n2\u0006\u0010\u0007\u001A\u00020\u00062\b\u0010\t\u001A\u0004\u0018\u00010\bH\u0086B¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Lcom/kakao/tistory/domain/usecase/GetChallengeRequirementsUseCase;", "", "Lcom/kakao/tistory/domain/repository/EntryRepository;", "entryRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/EntryRepository;)V", "", "blogName", "", "entryId", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/entry/ChallengeRequirements;", "invoke", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GetChallengeRequirementsUseCase {
    public final EntryRepository a;

    @Inject
    public GetChallengeRequirementsUseCase(@NotNull EntryRepository entryRepository0) {
        Intrinsics.checkNotNullParameter(entryRepository0, "entryRepository");
        super();
        this.a = entryRepository0;
    }

    @Nullable
    public final Object invoke(@NotNull String s, @Nullable Long long0, @NotNull Continuation continuation0) {
        return this.a.getChallengeRequirements(s, long0, continuation0);
    }
}

