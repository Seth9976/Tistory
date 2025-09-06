package com.kakao.android.base.utils;

import android.widget.Toast;
import androidx.annotation.StringRes;
import com.kakao.android.base.BaseKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001J+\u0010\u0007\u001A\u00020\u00062\b\b\u0001\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u000BR\u0014\u0010\f\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000E\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000E\u0010\r¨\u0006\u000F"}, d2 = {"Lcom/kakao/android/base/utils/ToastUtils;", "", "", "messageStringId", "gravity", "duration", "", "show", "(III)V", "", "message", "(Ljava/lang/String;II)V", "LENGTH_SHORT", "I", "LENGTH_LONG", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ToastUtils {
    @NotNull
    public static final ToastUtils INSTANCE = null;
    public static final int LENGTH_LONG = 1;
    public static final int LENGTH_SHORT;

    static {
        ToastUtils.INSTANCE = new ToastUtils();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final void show(@StringRes int v, int v1, int v2) {
        String s = BaseKt.getAppContext().getString(v);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        this.show(s, v1, v2);
    }

    public final void show(@NotNull String s, int v, int v1) {
        Intrinsics.checkNotNullParameter(s, "message");
        Toast toast0 = Toast.makeText(BaseKt.getAppContext(), s, v1);
        toast0.setGravity(v, 0, 100);
        toast0.show();
    }

    public static void show$default(ToastUtils toastUtils0, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 80;
        }
        if((v3 & 4) != 0) {
            v2 = 0;
        }
        toastUtils0.show(v, v1, v2);
    }

    public static void show$default(ToastUtils toastUtils0, String s, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 80;
        }
        if((v2 & 4) != 0) {
            v1 = 0;
        }
        toastUtils0.show(s, v, v1);
    }
}

