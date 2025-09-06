package androidx.compose.material;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001A\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u001D\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/material/ProgressIndicatorDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getStrokeWidth-D9Ej5fM", "()F", "StrokeWidth", "", "IndicatorBackgroundOpacity", "Landroidx/compose/animation/core/SpringSpec;", "b", "Landroidx/compose/animation/core/SpringSpec;", "getProgressAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "ProgressAnimationSpec", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,619:1\n154#2:620\n*S KotlinDebug\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorDefaults\n*L\n503#1:620\n*E\n"})
public final class ProgressIndicatorDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final ProgressIndicatorDefaults INSTANCE = null;
    public static final float IndicatorBackgroundOpacity = 0.24f;
    public static final float a;
    public static final SpringSpec b;

    static {
        ProgressIndicatorDefaults.INSTANCE = new ProgressIndicatorDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        ProgressIndicatorDefaults.a = 4.0f;
        ProgressIndicatorDefaults.b = new SpringSpec(1.0f, 50.0f, 0.001f);
    }

    @NotNull
    public final SpringSpec getProgressAnimationSpec() {
        return ProgressIndicatorDefaults.b;
    }

    public final float getStrokeWidth-D9Ej5fM() [...] // 潜在的解密器
}

