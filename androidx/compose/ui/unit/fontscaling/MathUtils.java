package androidx.compose.ui.unit.fontscaling;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY})
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001J%\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000B\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\u0002¢\u0006\u0004\b\u000B\u0010\u0007J5\u0010\u0010\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/unit/fontscaling/MathUtils;", "", "", "start", "stop", "amount", "lerp", "(FFF)F", "a", "b", "value", "lerpInv", "rangeMin", "rangeMax", "valueMin", "valueMax", "constrainedMap", "(FFFFF)F", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class MathUtils {
    public static final int $stable;
    @NotNull
    public static final MathUtils INSTANCE;

    static {
        MathUtils.INSTANCE = new MathUtils();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final float constrainedMap(float f, float f1, float f2, float f3, float f4) {
        return this.lerp(f, f1, Math.max(0.0f, Math.min(1.0f, this.lerpInv(f2, f3, f4))));
    }

    public final float lerp(float f, float f1, float f2) {
        return (f1 - f) * f2 + f;
    }

    public final float lerpInv(float f, float f1, float f2) {
        return f == f1 ? 0.0f : (f2 - f) / (f1 - f);
    }
}

