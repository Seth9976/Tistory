package com.kakao.tistory.presentation.common.utils;

import android.content.Context;
import androidx.annotation.DimenRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.android.base.BaseKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001J\u001F\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001A\u00020\u00062\b\b\u0001\u0010\t\u001A\u00020\u00062\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/tistory/presentation/common/utils/ScaleUtils;", "", "", "dp", "Landroid/content/Context;", "context", "", "dp2px", "(FLandroid/content/Context;)I", "dimension", "dimen2px", "(ILandroid/content/Context;)I", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ScaleUtils {
    public static final int $stable;
    @NotNull
    public static final ScaleUtils INSTANCE;

    static {
        ScaleUtils.INSTANCE = new ScaleUtils();
    }

    public final int dimen2px(@DimenRes int v, @NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        return ScaleUtilsKt.dimen2px(context0, v);
    }

    public static int dimen2px$default(ScaleUtils scaleUtils0, int v, Context context0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            context0 = BaseKt.getAppContext();
        }
        return scaleUtils0.dimen2px(v, context0);
    }

    public final int dp2px(float f, @NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        return ScaleUtilsKt.dp2px(context0, f);
    }

    public static int dp2px$default(ScaleUtils scaleUtils0, float f, Context context0, int v, Object object0) {
        if((v & 2) != 0) {
            context0 = BaseKt.getAppContext();
        }
        return scaleUtils0.dp2px(f, context0);
    }
}

