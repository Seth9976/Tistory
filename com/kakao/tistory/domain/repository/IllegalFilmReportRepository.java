package com.kakao.tistory.domain.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0094\u0001\u0010\u0002\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\t2\b\u0010\n\u001A\u0004\u0018\u00010\t2\b\u0010\u000B\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u0013H¦@¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/kakao/tistory/domain/repository/IllegalFilmReportRepository;", "", "getIllegalFilmReportUrl", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/IllegalFilmReportUrl;", "baseUrl", "", "contentType", "blogId", "", "entryId", "commentId", "userKey", "userName", "nickname", "description", "imageUrl", "viewUrl", "isFlash", "", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface IllegalFilmReportRepository {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object getIllegalFilmReportUrl$default(IllegalFilmReportRepository illegalFilmReportRepository0, String s, String s1, long v, Long long0, Long long1, String s2, String s3, String s4, String s5, String s6, String s7, Boolean boolean0, Continuation continuation0, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIllegalFilmReportUrl");
            }
            String s8 = (v1 & 0x20) == 0 ? s2 : null;
            String s9 = (v1 & 0x40) == 0 ? s3 : null;
            String s10 = (v1 & 0x80) == 0 ? s4 : null;
            String s11 = (v1 & 0x100) == 0 ? s5 : null;
            String s12 = (v1 & 0x200) == 0 ? s6 : null;
            return (v1 & 0x400) == 0 ? illegalFilmReportRepository0.getIllegalFilmReportUrl(s, s1, v, long0, long1, s8, s9, s10, s11, s12, s7, boolean0, continuation0) : illegalFilmReportRepository0.getIllegalFilmReportUrl(s, s1, v, long0, long1, s8, s9, s10, s11, s12, null, boolean0, continuation0);
        }
    }

    @Nullable
    Object getIllegalFilmReportUrl(@NotNull String arg1, @NotNull String arg2, long arg3, @Nullable Long arg4, @Nullable Long arg5, @Nullable String arg6, @Nullable String arg7, @Nullable String arg8, @Nullable String arg9, @Nullable String arg10, @Nullable String arg11, @Nullable Boolean arg12, @NotNull Continuation arg13);
}

