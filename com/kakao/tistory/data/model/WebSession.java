package com.kakao.tistory.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/kakao/tistory/data/model/WebSession;", "", "sessionName", "", "sessionValue", "(Ljava/lang/String;Ljava/lang/String;)V", "getSessionName", "()Ljava/lang/String;", "getSessionValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class WebSession {
    @NotNull
    private final String sessionName;
    @NotNull
    private final String sessionValue;

    public WebSession(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "sessionName");
        Intrinsics.checkNotNullParameter(s1, "sessionValue");
        super();
        this.sessionName = s;
        this.sessionValue = s1;
    }

    @NotNull
    public final String component1() {
        return this.sessionName;
    }

    @NotNull
    public final String component2() {
        return this.sessionValue;
    }

    @NotNull
    public final WebSession copy(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "sessionName");
        Intrinsics.checkNotNullParameter(s1, "sessionValue");
        return new WebSession(s, s1);
    }

    public static WebSession copy$default(WebSession webSession0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = webSession0.sessionName;
        }
        if((v & 2) != 0) {
            s1 = webSession0.sessionValue;
        }
        return webSession0.copy(s, s1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof WebSession)) {
            return false;
        }
        return Intrinsics.areEqual(this.sessionName, ((WebSession)object0).sessionName) ? Intrinsics.areEqual(this.sessionValue, ((WebSession)object0).sessionValue) : false;
    }

    @NotNull
    public final String getSessionName() {
        return this.sessionName;
    }

    @NotNull
    public final String getSessionValue() {
        return this.sessionValue;
    }

    @Override
    public int hashCode() {
        return this.sessionValue.hashCode() + this.sessionName.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "WebSession(sessionName=" + this.sessionName + ", sessionValue=" + this.sessionValue + ")";
    }
}

