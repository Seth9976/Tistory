package androidx.compose.ui.graphics.layer;

import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(28)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007J\u0018\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/layer/LayerSnapshotV28;", "Landroidx/compose/ui/graphics/layer/LayerSnapshotImpl;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "Landroid/graphics/Bitmap;", "toBitmap", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "s1/h", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LayerSnapshotV28 implements LayerSnapshotImpl {
    @NotNull
    public static final LayerSnapshotV28 INSTANCE;

    static {
        LayerSnapshotV28.INSTANCE = new LayerSnapshotV28();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    // 检测为 Lambda 实现
    @Override  // androidx.compose.ui.graphics.layer.LayerSnapshotImpl
    @Nullable
    public Object toBitmap(@NotNull GraphicsLayer graphicsLayer0, @NotNull Continuation continuation0) [...]
}

