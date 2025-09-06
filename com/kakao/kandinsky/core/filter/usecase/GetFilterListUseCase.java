package com.kakao.kandinsky.core.filter.usecase;

import com.kakao.kandinsky.core.filter.repository.FilterRepository;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/kakao/kandinsky/core/filter/usecase/GetFilterListUseCase;", "", "Lcom/kakao/kandinsky/core/filter/repository/FilterRepository;", "filterRepository", "<init>", "(Lcom/kakao/kandinsky/core/filter/repository/FilterRepository;)V", "", "Lcom/kakao/kandinsky/core/kdphoto/Filter;", "invoke", "()Ljava/util/List;", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GetFilterListUseCase {
    public final FilterRepository a;

    @Inject
    public GetFilterListUseCase(@NotNull FilterRepository filterRepository0) {
        Intrinsics.checkNotNullParameter(filterRepository0, "filterRepository");
        super();
        this.a = filterRepository0;
    }

    @NotNull
    public final List invoke() {
        return this.a.getFilterList();
    }
}

