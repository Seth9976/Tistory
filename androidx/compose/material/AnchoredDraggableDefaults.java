package androidx.compose.material;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@ExperimentalMaterialApi
@Stable
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001R&\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\b\u0010\t\u001A\u0004\b\u0006\u0010\u0007¨\u0006\u000B"}, d2 = {"Landroidx/compose/material/AnchoredDraggableDefaults;", "", "Landroidx/compose/animation/core/SpringSpec;", "", "a", "Landroidx/compose/animation/core/SpringSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "getAnimationSpec$annotations", "()V", "AnimationSpec", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AnchoredDraggableDefaults {
    public static final int $stable;
    @NotNull
    public static final AnchoredDraggableDefaults INSTANCE;
    public static final SpringSpec a;

    static {
        AnchoredDraggableDefaults.INSTANCE = new AnchoredDraggableDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        AnchoredDraggableDefaults.a = new SpringSpec(0.0f, 0.0f, null, 7, null);
    }

    @ExperimentalMaterialApi
    @NotNull
    public final SpringSpec getAnimationSpec() {
        return AnchoredDraggableDefaults.a;
    }

    @ExperimentalMaterialApi
    public static void getAnimationSpec$annotations() {
    }
}

