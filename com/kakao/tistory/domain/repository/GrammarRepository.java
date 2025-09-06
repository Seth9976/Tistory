package com.kakao.tistory.domain.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001C\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/kakao/tistory/domain/repository/GrammarRepository;", "", "postGrammarCheck", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/GrammarCheck;", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface GrammarRepository {
    @Nullable
    Object postGrammarCheck(@NotNull String arg1, @NotNull Continuation arg2);
}

