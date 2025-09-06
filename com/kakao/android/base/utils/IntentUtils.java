package com.kakao.android.base.utils;

import android.content.Intent;
import com.kakao.android.base.BaseKt;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/android/base/utils/IntentUtils;", "", "Landroid/content/Intent;", "intent", "", "isAvailableIntent", "(Landroid/content/Intent;)Z", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class IntentUtils {
    @NotNull
    public static final IntentUtils INSTANCE;

    static {
        IntentUtils.INSTANCE = new IntentUtils();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final boolean isAvailableIntent(@NotNull Intent intent0) {
        Intrinsics.checkNotNullParameter(intent0, "intent");
        List list0 = BaseKt.getAppContext().getPackageManager().queryIntentActivities(intent0, 0x10000);
        return list0 == null ? false : !list0.isEmpty();
    }
}

