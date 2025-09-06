package com.kakao.android.base.utils;

import com.kakao.android.base.BaseKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/android/base/utils/DeviceUtils;", "", "", "getDisplayHeight", "()I", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DeviceUtils {
    @NotNull
    public static final DeviceUtils INSTANCE;

    static {
        DeviceUtils.INSTANCE = new DeviceUtils();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final int getDisplayHeight() {
        return BaseKt.getAppContext().getResources().getDisplayMetrics().heightPixels;
    }
}

