package coil.request;

import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import coil.ImageLoader;
import coil.size.Dimension.Undefined;
import coil.size.Scale;
import coil.size.Size;
import coil.target.Target;
import coil.target.ViewTarget;
import coil.util.-Bitmaps;
import coil.util.-HardwareBitmaps;
import coil.util.-Requests;
import coil.util.-Utils;
import coil.util.HardwareBitmapService;
import coil.util.Logger;
import coil.util.SystemCallbacks;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001D\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u000F\u0010\u0010J\u001D\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0011\u001A\u00020\n2\u0006\u0010\u0013\u001A\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001D\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u0011\u001A\u00020\n2\u0006\u0010\u0018\u001A\u00020\u0017¢\u0006\u0004\b\u001A\u0010\u001BJ\u001D\u0010\u001F\u001A\u00020\u001E2\u0006\u0010\u0011\u001A\u00020\n2\u0006\u0010\u001D\u001A\u00020\u001C¢\u0006\u0004\b\u001F\u0010 J\u0015\u0010!\u001A\u00020\u00192\u0006\u0010\u001A\u001A\u00020\u0019¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcoil/request/RequestService;", "", "Lcoil/ImageLoader;", "imageLoader", "Lcoil/util/SystemCallbacks;", "systemCallbacks", "Lcoil/util/Logger;", "logger", "<init>", "(Lcoil/ImageLoader;Lcoil/util/SystemCallbacks;Lcoil/util/Logger;)V", "Lcoil/request/ImageRequest;", "initialRequest", "Lkotlinx/coroutines/Job;", "job", "Lcoil/request/RequestDelegate;", "requestDelegate", "(Lcoil/request/ImageRequest;Lkotlinx/coroutines/Job;)Lcoil/request/RequestDelegate;", "request", "", "throwable", "Lcoil/request/ErrorResult;", "errorResult", "(Lcoil/request/ImageRequest;Ljava/lang/Throwable;)Lcoil/request/ErrorResult;", "Lcoil/size/Size;", "size", "Lcoil/request/Options;", "options", "(Lcoil/request/ImageRequest;Lcoil/size/Size;)Lcoil/request/Options;", "Landroid/graphics/Bitmap$Config;", "requestedConfig", "", "isConfigValidForHardware", "(Lcoil/request/ImageRequest;Landroid/graphics/Bitmap$Config;)Z", "updateOptionsOnWorkerThread", "(Lcoil/request/Options;)Lcoil/request/Options;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRequestService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestService.kt\ncoil/request/RequestService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n1#2:176\n*E\n"})
public final class RequestService {
    public final ImageLoader a;
    public final SystemCallbacks b;
    public final HardwareBitmapService c;

    public RequestService(@NotNull ImageLoader imageLoader0, @NotNull SystemCallbacks systemCallbacks0, @Nullable Logger logger0) {
        this.a = imageLoader0;
        this.b = systemCallbacks0;
        this.c = -HardwareBitmaps.HardwareBitmapService(logger0);
    }

    @NotNull
    public final ErrorResult errorResult(@NotNull ImageRequest imageRequest0, @NotNull Throwable throwable0) {
        if(throwable0 instanceof NullRequestDataException) {
            Drawable drawable0 = imageRequest0.getFallback();
            return drawable0 == null ? new ErrorResult(imageRequest0.getError(), imageRequest0, throwable0) : new ErrorResult(drawable0, imageRequest0, throwable0);
        }
        return new ErrorResult(imageRequest0.getError(), imageRequest0, throwable0);
    }

    public final boolean isConfigValidForHardware(@NotNull ImageRequest imageRequest0, @NotNull Bitmap.Config bitmap$Config0) {
        if(!-Bitmaps.isHardware(bitmap$Config0)) {
            return true;
        }
        if(!imageRequest0.getAllowHardware()) {
            return false;
        }
        Target target0 = imageRequest0.getTarget();
        if(target0 instanceof ViewTarget) {
            View view0 = ((ViewTarget)target0).getView();
            return !view0.isAttachedToWindow() || view0.isHardwareAccelerated();
        }
        return true;
    }

    // 去混淆评级： 低(30)
    @NotNull
    public final Options options(@NotNull ImageRequest imageRequest0, @NotNull Size size0) {
        Bitmap.Config bitmap$Config0 = !imageRequest0.getTransformations().isEmpty() && !ArraysKt___ArraysKt.contains(-Utils.getVALID_TRANSFORMATION_CONFIGS(), imageRequest0.getBitmapConfig()) || -Bitmaps.isHardware(imageRequest0.getBitmapConfig()) && (!this.isConfigValidForHardware(imageRequest0, imageRequest0.getBitmapConfig()) || !this.c.allowHardwareMainThread(size0)) ? Bitmap.Config.ARGB_8888 : imageRequest0.getBitmapConfig();
        Scale scale0 = Intrinsics.areEqual(size0.getWidth(), Undefined.INSTANCE) || Intrinsics.areEqual(size0.getHeight(), Undefined.INSTANCE) ? Scale.FIT : imageRequest0.getScale();
        return !imageRequest0.getAllowRgb565() || !imageRequest0.getTransformations().isEmpty() || bitmap$Config0 == Bitmap.Config.ALPHA_8 ? new Options(imageRequest0.getContext(), bitmap$Config0, imageRequest0.getColorSpace(), size0, scale0, -Requests.getAllowInexactSize(imageRequest0), false, imageRequest0.getPremultipliedAlpha(), imageRequest0.getDiskCacheKey(), imageRequest0.getHeaders(), imageRequest0.getTags(), imageRequest0.getParameters(), imageRequest0.getMemoryCachePolicy(), imageRequest0.getDiskCachePolicy(), imageRequest0.getNetworkCachePolicy()) : new Options(imageRequest0.getContext(), bitmap$Config0, imageRequest0.getColorSpace(), size0, scale0, -Requests.getAllowInexactSize(imageRequest0), true, imageRequest0.getPremultipliedAlpha(), imageRequest0.getDiskCacheKey(), imageRequest0.getHeaders(), imageRequest0.getTags(), imageRequest0.getParameters(), imageRequest0.getMemoryCachePolicy(), imageRequest0.getDiskCachePolicy(), imageRequest0.getNetworkCachePolicy());
    }

    @NotNull
    public final RequestDelegate requestDelegate(@NotNull ImageRequest imageRequest0, @NotNull Job job0) {
        Lifecycle lifecycle0 = imageRequest0.getLifecycle();
        Target target0 = imageRequest0.getTarget();
        return target0 instanceof ViewTarget ? new ViewTargetRequestDelegate(this.a, imageRequest0, ((ViewTarget)target0), lifecycle0, job0) : new BaseRequestDelegate(lifecycle0, job0);
    }

    @NotNull
    public final Options updateOptionsOnWorkerThread(@NotNull Options options0) {
        boolean z;
        Bitmap.Config bitmap$Config1;
        Bitmap.Config bitmap$Config0 = options0.getConfig();
        CachePolicy cachePolicy0 = options0.getNetworkCachePolicy();
        if(!-Bitmaps.isHardware(options0.getConfig()) || this.c.allowHardwareWorkerThread()) {
            z = false;
            bitmap$Config1 = bitmap$Config0;
        }
        else {
            bitmap$Config1 = Bitmap.Config.ARGB_8888;
            z = true;
        }
        if(options0.getNetworkCachePolicy().getReadEnabled() && !this.b.isOnline()) {
            return Options.copy$default(options0, null, bitmap$Config1, null, null, null, false, false, false, null, null, null, null, null, null, CachePolicy.DISABLED, 0x3FFD, null);
        }
        return z ? Options.copy$default(options0, null, bitmap$Config1, null, null, null, false, false, false, null, null, null, null, null, null, cachePolicy0, 0x3FFD, null) : options0;
    }
}

