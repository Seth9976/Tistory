package com.kakao.tistory.domain.usecase;

import com.kakao.tistory.domain.repository.IllegalFilmReportRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0098\u0001\u0010\u0017\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\b\u0010\u000B\u001A\u0004\u0018\u00010\t2\b\u0010\f\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0086B¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/domain/usecase/GetIllegalFilmReportUrlUseCase;", "", "Lcom/kakao/tistory/domain/repository/IllegalFilmReportRepository;", "illegalFilmReportRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/IllegalFilmReportRepository;)V", "", "baseUrl", "contentType", "", "blogId", "entryId", "commentId", "userKey", "userName", "nickname", "description", "imageUrl", "viewUrl", "", "isFlash", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/IllegalFilmReportUrl;", "invoke", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GetIllegalFilmReportUrlUseCase {
    public final IllegalFilmReportRepository a;

    @Inject
    public GetIllegalFilmReportUrlUseCase(@NotNull IllegalFilmReportRepository illegalFilmReportRepository0) {
        Intrinsics.checkNotNullParameter(illegalFilmReportRepository0, "illegalFilmReportRepository");
        super();
        this.a = illegalFilmReportRepository0;
    }

    @Nullable
    public final Object invoke(@NotNull String s, @NotNull String s1, long v, @Nullable Long long0, @Nullable Long long1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6, @Nullable String s7, @Nullable Boolean boolean0, @NotNull Continuation continuation0) {
        return this.a.getIllegalFilmReportUrl(s, s1, v, long0, long1, s2, s3, s4, s5, s6, s7, boolean0, continuation0);
    }

    public static Object invoke$default(GetIllegalFilmReportUrlUseCase getIllegalFilmReportUrlUseCase0, String s, String s1, long v, Long long0, Long long1, String s2, String s3, String s4, String s5, String s6, String s7, Boolean boolean0, Continuation continuation0, int v1, Object object0) {
        String s8 = (v1 & 0x20) == 0 ? s2 : null;
        String s9 = (v1 & 0x40) == 0 ? s3 : null;
        String s10 = (v1 & 0x80) == 0 ? s4 : null;
        String s11 = (v1 & 0x100) == 0 ? s5 : null;
        String s12 = (v1 & 0x200) == 0 ? s6 : null;
        String s13 = (v1 & 0x400) == 0 ? s7 : null;
        return (v1 & 0x800) == 0 ? getIllegalFilmReportUrlUseCase0.invoke(s, s1, v, long0, long1, s8, s9, s10, s11, s12, s13, boolean0, continuation0) : getIllegalFilmReportUrlUseCase0.invoke(s, s1, v, long0, long1, s8, s9, s10, s11, s12, s13, null, continuation0);
    }
}

