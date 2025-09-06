package com.kakao.tistory.presentation.common;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/presentation/common/UrlConst;", "", "", "THUMBNAIL_URL", "Ljava/lang/String;", "AUTH_URL", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class UrlConst {
    public static final int $stable = 0;
    @NotNull
    public static final String AUTH_URL = "https://accounts.kakao.com/weblogin/account";
    @NotNull
    public static final UrlConst INSTANCE = null;
    @NotNull
    public static final String THUMBNAIL_URL = "https://img1.daumcdn.net/thumb/%s/?scode=mtistory2&fname=%s";

    static {
        UrlConst.INSTANCE = new UrlConst();
    }
}

