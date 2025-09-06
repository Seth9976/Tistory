package com.kakao.sdk.common.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fj\u0002\b\u000Ej\u0002\b\u000Fj\u0002\b\u0004j\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/kakao/sdk/common/util/SdkLogLevel;", "", "", "a", "I", "getLevel", "()I", "level", "", "b", "Ljava/lang/String;", "getSymbol", "()Ljava/lang/String;", "symbol", "V", "D", "W", "E", "common_release"}, k = 1, mv = {1, 4, 0})
public enum SdkLogLevel {
    V(0, "[\uD83D\uDCAC]"),
    D(1, "[ℹ️]"),
    I(2, "[\uD83D\uDD2C]"),
    W(3, "[⚠️]"),
    E(4, "[‼️]");

    public final int a;
    public final String b;

    public SdkLogLevel(int v1, String s1) {
        this.a = v1;
        this.b = s1;
    }

    public final int getLevel() {
        return this.a;
    }

    @NotNull
    public final String getSymbol() {
        return this.b;
    }
}

