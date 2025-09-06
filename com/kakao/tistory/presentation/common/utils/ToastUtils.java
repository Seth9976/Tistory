package com.kakao.tistory.presentation.common.utils;

import android.content.Context;
import android.widget.Toast;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.android.base.BaseKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001J7\u0010\t\u001A\u00020\b2\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ5\u0010\t\u001A\u00020\b2\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\t\u0010\rR\u0014\u0010\u000E\u001A\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000E\u0010\u000FR\u0014\u0010\u0010\u001A\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000F¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/presentation/common/utils/ToastUtils;", "", "Landroid/content/Context;", "context", "", "messageStringId", "gravity", "duration", "", "show", "(Landroid/content/Context;III)V", "", "message", "(Landroid/content/Context;Ljava/lang/String;II)V", "LENGTH_SHORT", "I", "LENGTH_LONG", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ToastUtils {
    public static final int $stable = 0;
    @NotNull
    public static final ToastUtils INSTANCE = null;
    public static final int LENGTH_LONG = 1;
    public static final int LENGTH_SHORT;

    static {
        ToastUtils.INSTANCE = new ToastUtils();
    }

    public final void show(@Nullable Context context0, @StringRes int v, int v1, int v2) {
        if(context0 != null) {
            String s = context0.getString(v);
            Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
            ToastUtils.INSTANCE.show(context0, s, v1, v2);
        }
    }

    public final void show(@Nullable Context context0, @NotNull String s, int v, int v1) {
        Intrinsics.checkNotNullParameter(s, "message");
        if(context0 != null) {
            Toast toast0 = Toast.makeText(context0, s, v1);
            toast0.setGravity(v, 0, 100);
            toast0.show();
        }
    }

    public static void show$default(ToastUtils toastUtils0, Context context0, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 1) != 0) {
            context0 = BaseKt.getAppContext();
        }
        if((v3 & 4) != 0) {
            v1 = 80;
        }
        if((v3 & 8) != 0) {
            v2 = 0;
        }
        toastUtils0.show(context0, v, v1, v2);
    }

    public static void show$default(ToastUtils toastUtils0, Context context0, String s, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            context0 = BaseKt.getAppContext();
        }
        if((v2 & 4) != 0) {
            v = 80;
        }
        if((v2 & 8) != 0) {
            v1 = 0;
        }
        toastUtils0.show(context0, s, v, v1);
    }
}

