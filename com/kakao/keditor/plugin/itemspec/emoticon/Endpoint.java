package com.kakao.keditor.plugin.itemspec.emoticon;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\u0006\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/emoticon/Endpoint;", "", "()V", "BASE_URL", "", "EMOTICON_BASE_URL", "SCHEME", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Endpoint {
    @NotNull
    public static final String BASE_URL = "https://t1.daumcdn.net/keditor";
    @NotNull
    public static final String EMOTICON_BASE_URL = "https://t1.daumcdn.net/keditor/emoticon";
    @NotNull
    public static final Endpoint INSTANCE = null;
    @NotNull
    public static final String SCHEME = "https";

    static {
        Endpoint.INSTANCE = new Endpoint();
    }
}

