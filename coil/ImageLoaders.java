package coil;

import android.content.Context;
import androidx.annotation.WorkerThread;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlinx.coroutines.BuildersKt;
import o5.a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0015\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0007¢\u0006\u0002\b\u0004\u001A\u0014\u0010\u0005\u001A\u00020\u0006*\u00020\u00012\u0006\u0010\u0007\u001A\u00020\bH\u0007¨\u0006\t"}, d2 = {"ImageLoader", "Lcoil/ImageLoader;", "context", "Landroid/content/Context;", "create", "executeBlocking", "Lcoil/request/ImageResult;", "request", "Lcoil/request/ImageRequest;", "coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "ImageLoaders")
public final class ImageLoaders {
    @JvmName(name = "create")
    @NotNull
    public static final ImageLoader create(@NotNull Context context0) {
        return new Builder(context0).build();
    }

    @WorkerThread
    @NotNull
    public static final ImageResult executeBlocking(@NotNull ImageLoader imageLoader0, @NotNull ImageRequest imageRequest0) {
        return (ImageResult)BuildersKt.runBlocking$default(null, new a(imageLoader0, imageRequest0, null), 1, null);
    }
}

