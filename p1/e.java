package p1;

import android.graphics.BlendModeColorFilter;
import androidx.annotation.DoNotInline;
import androidx.compose.ui.graphics.AndroidBlendMode_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import org.jetbrains.annotations.NotNull;

public final class e {
    public static final e a;

    static {
        e.a = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @NotNull
    public final BlendModeColorFilter a(long v, int v1) {
        return d.e(ColorKt.toArgb-8_81llA(v), AndroidBlendMode_androidKt.toAndroidBlendMode-s9anfk8(v1));
    }

    @DoNotInline
    @NotNull
    public final androidx.compose.ui.graphics.BlendModeColorFilter b(@NotNull BlendModeColorFilter blendModeColorFilter0) {
        return new androidx.compose.ui.graphics.BlendModeColorFilter(ColorKt.Color(blendModeColorFilter0.getColor()), AndroidBlendMode_androidKt.toComposeBlendMode(blendModeColorFilter0.getMode()), blendModeColorFilter0, null);
    }
}

