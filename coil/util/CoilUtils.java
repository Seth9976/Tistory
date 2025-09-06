package coil.util;

import android.content.Context;
import android.view.View;
import coil.request.ImageResult;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import okhttp3.Cache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001A\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lcoil/util/CoilUtils;", "", "Landroid/view/View;", "view", "", "dispose", "(Landroid/view/View;)V", "Lcoil/request/ImageResult;", "result", "(Landroid/view/View;)Lcoil/request/ImageResult;", "Landroid/content/Context;", "context", "Lokhttp3/Cache;", "createDefaultCache", "(Landroid/content/Context;)Lokhttp3/Cache;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CoilUtils {
    @NotNull
    public static final CoilUtils INSTANCE;

    static {
        CoilUtils.INSTANCE = new CoilUtils();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "ImageLoaders no longer (and should not) use OkHttp\'s disk cache. Use \'ImageLoader.Builder.diskCache\' to configure a custom disk cache.")
    @JvmStatic
    @NotNull
    public static final Cache createDefaultCache(@NotNull Context context0) {
        -Utils.unsupported();
        throw new KotlinNothingValueException();
    }

    @JvmStatic
    public static final void dispose(@NotNull View view0) {
        -Utils.getRequestManager(view0).dispose();
    }

    @JvmStatic
    @Nullable
    public static final ImageResult result(@NotNull View view0) {
        return -Utils.getRequestManager(view0).getResult();
    }
}

