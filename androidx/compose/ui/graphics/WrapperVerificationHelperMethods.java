package androidx.compose.ui.graphics;

import android.graphics.Paint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p1.d;

@RequiresApi(29)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001J&\u0010\n\u001A\u00020\u00072\n\u0010\u0004\u001A\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001A\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/graphics/WrapperVerificationHelperMethods;", "", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "paint", "Landroidx/compose/ui/graphics/BlendMode;", "mode", "", "setBlendMode-GB0RdKg", "(Landroid/graphics/Paint;I)V", "setBlendMode", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class WrapperVerificationHelperMethods {
    @NotNull
    public static final WrapperVerificationHelperMethods INSTANCE;

    static {
        WrapperVerificationHelperMethods.INSTANCE = new WrapperVerificationHelperMethods();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final void setBlendMode-GB0RdKg(@NotNull Paint paint0, int v) {
        d.i(paint0, AndroidBlendMode_androidKt.toAndroidBlendMode-s9anfk8(v));
    }
}

