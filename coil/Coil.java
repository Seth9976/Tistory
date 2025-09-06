package coil;

import android.content.Context;
import coil.request.Disposable;
import coil.request.ImageRequest;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001A\u00020\u00072\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\b\u0010\fJ\u000F\u0010\r\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0010\u001A\u00020\u000FH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0010\u001A\u00020\u000FH\u0087@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcoil/Coil;", "", "Landroid/content/Context;", "context", "Lcoil/ImageLoader;", "imageLoader", "(Landroid/content/Context;)Lcoil/ImageLoader;", "", "setImageLoader", "(Lcoil/ImageLoader;)V", "Lcoil/ImageLoaderFactory;", "factory", "(Lcoil/ImageLoaderFactory;)V", "reset", "()V", "Lcoil/request/ImageRequest;", "request", "Lcoil/request/Disposable;", "enqueue", "(Lcoil/request/ImageRequest;)Lcoil/request/Disposable;", "Lcoil/request/ImageResult;", "execute", "(Lcoil/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coil-singleton_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCoil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Coil.kt\ncoil/Coil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
public final class Coil {
    @NotNull
    public static final Coil INSTANCE;
    public static ImageLoader a;
    public static ImageLoaderFactory b;

    static {
        Coil.INSTANCE = new Coil();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Replace with \'context.imageLoader.enqueue(request)\'.", replaceWith = @ReplaceWith(expression = "request.context.imageLoader.enqueue(request)", imports = {"coil.imageLoader"}))
    @JvmStatic
    @NotNull
    public static final Disposable enqueue(@NotNull ImageRequest imageRequest0) {
        throw new IllegalStateException("Unsupported");
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Replace with \'context.imageLoader.execute(request)\'.", replaceWith = @ReplaceWith(expression = "request.context.imageLoader.execute(request)", imports = {"coil.imageLoader"}))
    @JvmStatic
    @Nullable
    public static final Object execute(@NotNull ImageRequest imageRequest0, @NotNull Continuation continuation0) {
        throw new IllegalStateException("Unsupported");
    }

    @JvmStatic
    @NotNull
    public static final ImageLoader imageLoader(@NotNull Context context0) {
        ImageLoader imageLoader0 = Coil.a;
        if(imageLoader0 == null) {
            synchronized(Coil.INSTANCE) {
                imageLoader0 = Coil.a;
                if(imageLoader0 != null) {
                    return imageLoader0;
                }
                ImageLoaderFactory imageLoaderFactory0 = Coil.b;
                if(imageLoaderFactory0 == null) {
                label_13:
                    Context context1 = context0.getApplicationContext();
                    ImageLoaderFactory imageLoaderFactory1 = context1 instanceof ImageLoaderFactory ? ((ImageLoaderFactory)context1) : null;
                    imageLoader0 = imageLoaderFactory1 == null ? ImageLoaders.create(context0) : imageLoaderFactory1.newImageLoader();
                }
                else {
                    imageLoader0 = imageLoaderFactory0.newImageLoader();
                    if(imageLoader0 == null) {
                        goto label_13;
                    }
                }
                Coil.b = null;
                Coil.a = imageLoader0;
            }
        }
        return imageLoader0;
    }

    @JvmStatic
    public static final void reset() {
        synchronized(Coil.class) {
            Coil.a = null;
            Coil.b = null;
        }
    }

    @JvmStatic
    public static final void setImageLoader(@NotNull ImageLoader imageLoader0) {
        synchronized(Coil.class) {
            Coil.b = null;
            Coil.a = imageLoader0;
        }
    }

    @JvmStatic
    public static final void setImageLoader(@NotNull ImageLoaderFactory imageLoaderFactory0) {
        synchronized(Coil.class) {
            Coil.b = imageLoaderFactory0;
            Coil.a = null;
        }
    }
}

