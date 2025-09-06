package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/layer/LayerSnapshotV21;", "Landroidx/compose/ui/graphics/layer/LayerSnapshotImpl;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "Landroid/graphics/Bitmap;", "toBitmap", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LayerSnapshotV21 implements LayerSnapshotImpl {
    @NotNull
    public static final LayerSnapshotV21 INSTANCE;

    static {
        LayerSnapshotV21.INSTANCE = new LayerSnapshotV21();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.compose.ui.graphics.layer.LayerSnapshotImpl
    @Nullable
    public Object toBitmap(@NotNull GraphicsLayer graphicsLayer0, @NotNull Continuation continuation0) {
        long v = graphicsLayer0.getSize-YbymL2g();
        Bitmap bitmap0 = Bitmap.createBitmap(IntSize.getWidth-impl(v), IntSize.getHeight-impl(v), Bitmap.Config.ARGB_8888);
        graphicsLayer0.draw$ui_graphics_release(AndroidCanvas_androidKt.Canvas(new Canvas(bitmap0)), null);
        return bitmap0;
    }
}

