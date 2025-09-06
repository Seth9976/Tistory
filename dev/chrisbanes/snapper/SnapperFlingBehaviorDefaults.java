package dev.chrisbanes.snapper;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import vc.h;
import vc.i;

@StabilityInferred(parameters = 0)
@ExperimentalSnapperApi
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001R\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007R,\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000B\u0010\f\u0012\u0004\b\u000F\u0010\u0010\u001A\u0004\b\r\u0010\u000ERM\u0010\u001C\u001A8\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B¨\u0006\u001D"}, d2 = {"Ldev/chrisbanes/snapper/SnapperFlingBehaviorDefaults;", "", "Landroidx/compose/animation/core/AnimationSpec;", "", "a", "Landroidx/compose/animation/core/AnimationSpec;", "getSpringAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "SpringAnimationSpec", "Lkotlin/Function1;", "Ldev/chrisbanes/snapper/SnapperLayoutInfo;", "b", "Lkotlin/jvm/functions/Function1;", "getMaximumFlingDistance", "()Lkotlin/jvm/functions/Function1;", "getMaximumFlingDistance$annotations", "()V", "MaximumFlingDistance", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "startIndex", "targetIndex", "c", "Lkotlin/jvm/functions/Function3;", "getSnapIndex", "()Lkotlin/jvm/functions/Function3;", "SnapIndex", "lib_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class SnapperFlingBehaviorDefaults {
    public static final int $stable;
    @NotNull
    public static final SnapperFlingBehaviorDefaults INSTANCE;
    public static final SpringSpec a;
    public static final h b;
    public static final i c;

    static {
        SnapperFlingBehaviorDefaults.INSTANCE = new SnapperFlingBehaviorDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        SnapperFlingBehaviorDefaults.a = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        SnapperFlingBehaviorDefaults.b = h.w;
        SnapperFlingBehaviorDefaults.c = i.w;
        SnapperFlingBehaviorDefaults.$stable = 8;
    }

    @NotNull
    public final Function1 getMaximumFlingDistance() {
        return SnapperFlingBehaviorDefaults.b;
    }

    @Deprecated(message = "The maximumFlingDistance parameter has been deprecated.")
    public static void getMaximumFlingDistance$annotations() {
    }

    @NotNull
    public final Function3 getSnapIndex() {
        return SnapperFlingBehaviorDefaults.c;
    }

    @NotNull
    public final AnimationSpec getSpringAnimationSpec() {
        return SnapperFlingBehaviorDefaults.a;
    }
}

