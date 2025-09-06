package androidx.activity;

import android.app.Activity;
import android.app.PictureInPictureParams.Builder;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(26)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u001D\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/activity/Api26Impl;", "", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", "hint", "", "setPipParamsSourceRectHint", "(Landroid/app/Activity;Landroid/graphics/Rect;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Api26Impl {
    @NotNull
    public static final Api26Impl INSTANCE;

    static {
        Api26Impl.INSTANCE = new Api26Impl();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final void setPipParamsSourceRectHint(@NotNull Activity activity0, @NotNull Rect rect0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(rect0, "hint");
        activity0.setPictureInPictureParams(new PictureInPictureParams.Builder().setSourceRectHint(rect0).build());
    }
}

