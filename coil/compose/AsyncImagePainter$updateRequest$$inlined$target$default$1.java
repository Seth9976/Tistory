package coil.compose;

import android.graphics.drawable.Drawable;
import androidx.compose.ui.graphics.painter.Painter;
import coil.target.Target;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001A\u00020\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001A\u00020\u00032\b\u0010\u0007\u001A\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u0005H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"coil/request/ImageRequest$Builder$target$4", "Lcoil/target/Target;", "onError", "", "error", "Landroid/graphics/drawable/Drawable;", "onStart", "placeholder", "onSuccess", "result", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder$target$4\n+ 2 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainter\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder$target$2\n+ 4 ImageRequest.kt\ncoil/request/ImageRequest$Builder$target$3\n*L\n1#1,1057:1\n331#2,2:1058\n847#3:1060\n848#4:1061\n*E\n"})
public final class AsyncImagePainter.updateRequest..inlined.target.default.1 implements Target {
    public final AsyncImagePainter a;

    public AsyncImagePainter.updateRequest..inlined.target.default.1(AsyncImagePainter asyncImagePainter0) {
        this.a = asyncImagePainter0;
        super();
    }

    @Override  // coil.target.Target
    public void onError(@Nullable Drawable drawable0) {
    }

    @Override  // coil.target.Target
    public void onStart(@Nullable Drawable drawable0) {
        Painter painter0 = drawable0 == null ? null : AsyncImagePainter.access$toPainter(this.a, drawable0);
        AsyncImagePainter.access$updateState(this.a, new Loading(painter0));
    }

    @Override  // coil.target.Target
    public void onSuccess(@NotNull Drawable drawable0) {
    }
}

