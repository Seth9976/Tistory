package coil.compose;

import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\b\" \u0010\u0007\u001A\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcoil/compose/ImageLoaderProvidableCompositionLocal;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalImageLoader", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalImageLoader$annotations", "()V", "LocalImageLoader", "coil-compose-singleton_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class LocalImageLoaderKt {
    public static final ProvidableCompositionLocal a;

    static {
        LocalImageLoaderKt.a = ImageLoaderProvidableCompositionLocal.constructor-impl$default(null, 1, null);
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalImageLoader() {
        return LocalImageLoaderKt.a;
    }

    @Deprecated(message = "LocalImageLoader was intended to provide a method to overwrite the singleton ImageLoader in local compositions. In practice, it\'s not clear that `LocalImageLoader.provide` **does not** set the singleton ImageLoader. This can result in accidentally creating multiple ImageLoader instances if you use a combination of `LocalImageLoader.current` and `context.imageLoader`. To maximize performance, apps should create one ImageLoader or use `ImageLoader.newBuilder` to create new ImageLoaders that share the same resources.\n\nAdditionally, as a composition is at most scoped to an Activity, `LocalImageLoader.provide` encourages creating multiple ImageLoaders if the user creates multiple activities that use Compose.\n\nYou should migrate to `ImageLoaderFactory` to set the singleton ImageLoader and `LocalContext.current.imageLoader` to access the singleton ImageLoader in Compose. If you need to use a locally scoped ImageLoader it\'s recommended to use the `AsyncImage` and `rememberAsyncImagePainter` overloads that have an ImageLoader argument and pass the local ImageLoader as input.")
    public static void getLocalImageLoader$annotations() {
    }
}

