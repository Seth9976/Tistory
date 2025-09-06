package androidx.compose.material3.internal;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001R\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/material3/internal/AnchoredDraggableDefaults;", "", "Landroidx/compose/animation/core/SpringSpec;", "", "a", "Landroidx/compose/animation/core/SpringSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "AnimationSpec", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AnchoredDraggableDefaults {
    public static final int $stable;
    @NotNull
    public static final AnchoredDraggableDefaults INSTANCE;
    public static final SpringSpec a;

    static {
        AnchoredDraggableDefaults.INSTANCE = new AnchoredDraggableDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        AnchoredDraggableDefaults.a = new SpringSpec(0.0f, 0.0f, null, 7, null);
    }

    @NotNull
    public final SpringSpec getAnimationSpec() {
        return AnchoredDraggableDefaults.a;
    }
}

