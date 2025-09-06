package com.kakao.tistory.domain.repository;

import com.kakao.tistory.domain.entity.AdInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001A\u00020\tH&R\u001A\u0010\u0002\u001A\u0004\u0018\u00010\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/kakao/tistory/domain/repository/ADIDRepository;", "", "adInfo", "Lcom/kakao/tistory/domain/entity/AdInfo;", "getAdInfo", "()Lcom/kakao/tistory/domain/entity/AdInfo;", "setAdInfo", "(Lcom/kakao/tistory/domain/entity/AdInfo;)V", "init", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface ADIDRepository {
    @Nullable
    AdInfo getAdInfo();

    void init();

    void setAdInfo(@Nullable AdInfo arg1);
}

