package com.kakao.kandinsky.core.filter.usecase;

import com.kakao.kandinsky.core.filter.ViewFilterEngine;
import com.kakao.kandinsky.core.filter.repository.FilterRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001A\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kakao/kandinsky/core/filter/usecase/GetViewFilterEngineUseCase;", "", "Lcom/kakao/kandinsky/core/filter/repository/FilterRepository;", "filterRepository", "<init>", "(Lcom/kakao/kandinsky/core/filter/repository/FilterRepository;)V", "Lcom/kakao/kandinsky/core/filter/ViewFilterEngine;", "invoke", "()Lcom/kakao/kandinsky/core/filter/ViewFilterEngine;", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GetViewFilterEngineUseCase {
    public final FilterRepository a;

    @Inject
    public GetViewFilterEngineUseCase(@NotNull FilterRepository filterRepository0) {
        Intrinsics.checkNotNullParameter(filterRepository0, "filterRepository");
        super();
        this.a = filterRepository0;
    }

    @NotNull
    public final ViewFilterEngine invoke() {
        return this.a.getFilterEngine();
    }
}

