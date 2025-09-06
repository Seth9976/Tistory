package com.kakao.common.view;

import androidx.annotation.ChecksSdkIntAtLeast;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\n\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t¨\u0006\u000B"}, d2 = {"Lcom/kakao/common/view/SoftInputInfo;", "", "", "useInsetListenerMethod", "()Z", "", "a", "I", "getTypeIme", "()I", "typeIme", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SoftInputInfo {
    @NotNull
    public static final SoftInputInfo INSTANCE;
    public static final int a;

    static {
        SoftInputInfo.INSTANCE = new SoftInputInfo();  // 初始化器: Ljava/lang/Object;-><init>()V
        SoftInputInfo.a = 8;
    }

    public final int getTypeIme() [...] // 潜在的解密器

    @ChecksSdkIntAtLeast(api = 30)
    public final boolean useInsetListenerMethod() [...] // 潜在的解密器
}

