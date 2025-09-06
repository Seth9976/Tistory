package androidx.compose.material;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Deprecated(message = "Material\'s Swipeable has been replaced by Foundation\'s AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001J1\u0010\b\u001A\u0004\u0018\u00010\u00072\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u001D\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00030\n8\u0006¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000ER\u001D\u0010\u0015\u001A\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001A\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001A\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/material/SwipeableDefaults;", "", "", "", "anchors", "factorAtMin", "factorAtMax", "Landroidx/compose/material/ResistanceConfig;", "resistanceConfig", "(Ljava/util/Set;FF)Landroidx/compose/material/ResistanceConfig;", "Landroidx/compose/animation/core/SpringSpec;", "a", "Landroidx/compose/animation/core/SpringSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "AnimationSpec", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getVelocityThreshold-D9Ej5fM", "()F", "VelocityThreshold", "StiffResistanceFactor", "StandardResistanceFactor", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,908:1\n154#2:909\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableDefaults\n*L\n826#1:909\n*E\n"})
public final class SwipeableDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final SwipeableDefaults INSTANCE = null;
    public static final float StandardResistanceFactor = 10.0f;
    public static final float StiffResistanceFactor = 20.0f;
    public static final SpringSpec a;
    public static final float b;

    static {
        SwipeableDefaults.INSTANCE = new SwipeableDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        SwipeableDefaults.a = new SpringSpec(0.0f, 0.0f, null, 7, null);
        SwipeableDefaults.b = 125.0f;
    }

    @NotNull
    public final SpringSpec getAnimationSpec() {
        return SwipeableDefaults.a;
    }

    public final float getVelocityThreshold-D9Ej5fM() [...] // 潜在的解密器

    @Nullable
    public final ResistanceConfig resistanceConfig(@NotNull Set set0, float f, float f1) {
        if(set0.size() <= 1) {
            return null;
        }
        Float float0 = CollectionsKt___CollectionsKt.maxOrNull(set0);
        Intrinsics.checkNotNull(float0);
        Float float1 = CollectionsKt___CollectionsKt.minOrNull(set0);
        Intrinsics.checkNotNull(float1);
        return new ResistanceConfig(((float)float0) - ((float)float1), f, f1);
    }

    public static ResistanceConfig resistanceConfig$default(SwipeableDefaults swipeableDefaults0, Set set0, float f, float f1, int v, Object object0) {
        if((v & 2) != 0) {
            f = 10.0f;
        }
        if((v & 4) != 0) {
            f1 = 10.0f;
        }
        return swipeableDefaults0.resistanceConfig(set0, f, f1);
    }
}

