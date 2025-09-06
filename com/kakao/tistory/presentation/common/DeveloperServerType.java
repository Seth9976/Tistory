package com.kakao.tistory.presentation.common;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006j\u0002\b\u000Bj\u0002\b\fj\u0002\b\rj\u0002\b\u000Ej\u0002\b\u000Fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/presentation/common/DeveloperServerType;", "", "", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "title", "b", "getUrl", "url", "HOST0", "HOST1", "HOST2", "HOST3", "HOST4", "HOST5", "HOST6", "HOST7", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum DeveloperServerType {
    HOST0("Default", "https://api.tistory.com"),
    HOST1("\uD83D\uDC51Conan\uD83D\uDC51", "http://api.conan.dev.tistory.com"),
    HOST2("James", "http://api.james.dev.tistory.com"),
    HOST3("Justin", "http://api.v1.dev.tistory.com"),
    HOST4("Leeby", "http://api.leeby.dev.tistory.com"),
    HOST5("Mark", "http://api.mark.dev.tistory.com"),
    HOST6("Peter", "http://api.peter.dev.tistory.com"),
    HOST7("Theo", "http://api.theo.dev.tistory.com");

    public final String a;
    public final String b;
    public static final DeveloperServerType[] c;
    public static final EnumEntries d;

    static {
        DeveloperServerType.c = arr_developerServerType;
        Intrinsics.checkNotNullParameter(arr_developerServerType, "entries");
        DeveloperServerType.d = new a(arr_developerServerType);
    }

    public DeveloperServerType(String s1, String s2) {
        this.a = s1;
        this.b = s2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return DeveloperServerType.d;
    }

    @NotNull
    public final String getTitle() {
        return this.a;
    }

    @NotNull
    public final String getUrl() {
        return this.b;
    }
}

