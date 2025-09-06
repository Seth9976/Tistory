package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u001B\u0010\u0003\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u001A\u0010\n\u001A\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "clipScrollableContainer", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getMaxSupportedElevation", "()F", "MaxSupportedElevation", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nClipScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,100:1\n148#2:101\n*S KotlinDebug\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/ClipScrollableContainerKt\n*L\n63#1:101\n*E\n"})
public final class ClipScrollableContainerKt {
    public static final float a;
    public static final Modifier b;
    public static final Modifier c;

    static {
        ClipScrollableContainerKt.a = 30.0f;
        ClipScrollableContainerKt.HorizontalScrollableClipModifier.1 clipScrollableContainerKt$HorizontalScrollableClipModifier$10 = new ClipScrollableContainerKt.HorizontalScrollableClipModifier.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        ClipScrollableContainerKt.b = ClipKt.clip(Modifier.Companion, clipScrollableContainerKt$HorizontalScrollableClipModifier$10);
        ClipScrollableContainerKt.VerticalScrollableClipModifier.1 clipScrollableContainerKt$VerticalScrollableClipModifier$10 = new ClipScrollableContainerKt.VerticalScrollableClipModifier.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        ClipScrollableContainerKt.c = ClipKt.clip(Modifier.Companion, clipScrollableContainerKt$VerticalScrollableClipModifier$10);
    }

    @Stable
    @NotNull
    public static final Modifier clipScrollableContainer(@NotNull Modifier modifier0, @NotNull Orientation orientation0) {
        return orientation0 == Orientation.Vertical ? modifier0.then(ClipScrollableContainerKt.c) : modifier0.then(ClipScrollableContainerKt.b);
    }

    public static final float getMaxSupportedElevation() [...] // 潜在的解密器
}

