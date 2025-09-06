package coil.compose;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.Coil;
import coil.ImageLoader;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmInline;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p5.g;

@Deprecated(message = "LocalImageLoader was intended to provide a method to overwrite the singleton ImageLoader in local compositions. In practice, it\'s not clear that `LocalImageLoader.provide` **does not** set the singleton ImageLoader. This can result in accidentally creating multiple ImageLoader instances if you use a combination of `LocalImageLoader.current` and `context.imageLoader`. To maximize performance, apps should create one ImageLoader or use `ImageLoader.newBuilder` to create new ImageLoaders that share the same resources.\n\nAdditionally, as a composition is at most scoped to an Activity, `LocalImageLoader.provide` encourages creating multiple ImageLoaders if the user creates multiple activities that use Compose.\n\nYou should migrate to `ImageLoaderFactory` to set the singleton ImageLoader and `LocalContext.current.imageLoader` to access the singleton ImageLoader in Compose. If you need to use a locally scoped ImageLoader it\'s recommended to use the `AsyncImage` and `rememberAsyncImagePainter` overloads that have an ImageLoader argument and pass the local ImageLoader as input.")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087@\u0018\u00002\u00020\u0001B\u001B\b\u0000\u0012\u0010\b\u0002\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000B\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b2\u0006\u0010\u0007\u001A\u00020\u0003H\u0087\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000F\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0013\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0018\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001A\u0010\u001D\u001A\u00020\u00038GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u0019\u0010\u001A\u0088\u0001\u0004\u0092\u0001\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¨\u0006\u001E"}, d2 = {"Lcoil/compose/ImageLoaderProvidableCompositionLocal;", "", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcoil/ImageLoader;", "delegate", "constructor-impl", "(Landroidx/compose/runtime/ProvidableCompositionLocal;)Landroidx/compose/runtime/ProvidableCompositionLocal;", "value", "Landroidx/compose/runtime/ProvidedValue;", "provides-impl", "(Landroidx/compose/runtime/ProvidableCompositionLocal;Lcoil/ImageLoader;)Landroidx/compose/runtime/ProvidedValue;", "provides", "", "toString-impl", "(Landroidx/compose/runtime/ProvidableCompositionLocal;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Landroidx/compose/runtime/ProvidableCompositionLocal;)I", "hashCode", "other", "", "equals-impl", "(Landroidx/compose/runtime/ProvidableCompositionLocal;Ljava/lang/Object;)Z", "equals", "getCurrent", "(Landroidx/compose/runtime/ProvidableCompositionLocal;Landroidx/compose/runtime/Composer;I)Lcoil/ImageLoader;", "getCurrent$annotations", "()V", "current", "coil-compose-singleton_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nLocalImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalImageLoader.kt\ncoil/compose/ImageLoaderProvidableCompositionLocal\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,55:1\n74#2:56\n24#3:57\n*S KotlinDebug\n*F\n+ 1 LocalImageLoader.kt\ncoil/compose/ImageLoaderProvidableCompositionLocal\n*L\n50#1:56\n50#1:57\n*E\n"})
public final class ImageLoaderProvidableCompositionLocal {
    public final ProvidableCompositionLocal a;

    public ImageLoaderProvidableCompositionLocal(ProvidableCompositionLocal providableCompositionLocal0) {
        this.a = providableCompositionLocal0;
    }

    public static final ImageLoaderProvidableCompositionLocal box-impl(ProvidableCompositionLocal providableCompositionLocal0) {
        return new ImageLoaderProvidableCompositionLocal(providableCompositionLocal0);
    }

    @NotNull
    public static ProvidableCompositionLocal constructor-impl(@NotNull ProvidableCompositionLocal providableCompositionLocal0) [...] // Inlined contents

    public static ProvidableCompositionLocal constructor-impl$default(ProvidableCompositionLocal providableCompositionLocal0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        return (v & 1) == 0 ? providableCompositionLocal0 : CompositionLocalKt.staticCompositionLocalOf(g.w);
    }

    @Override
    public boolean equals(Object object0) {
        return ImageLoaderProvidableCompositionLocal.equals-impl(this.a, object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(ProvidableCompositionLocal providableCompositionLocal0, Object object0) {
        return object0 instanceof ImageLoaderProvidableCompositionLocal ? Intrinsics.areEqual(providableCompositionLocal0, ((ImageLoaderProvidableCompositionLocal)object0).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(ProvidableCompositionLocal providableCompositionLocal0, ProvidableCompositionLocal providableCompositionLocal1) {
        return Intrinsics.areEqual(providableCompositionLocal0, providableCompositionLocal1);
    }

    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getCurrent")
    @NotNull
    public static final ImageLoader getCurrent(ProvidableCompositionLocal providableCompositionLocal0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDB303512, v, -1, "coil.compose.ImageLoaderProvidableCompositionLocal.<get-current> (LocalImageLoader.kt:49)");
        }
        ImageLoader imageLoader0 = (ImageLoader)composer0.consume(providableCompositionLocal0);
        if(imageLoader0 == null) {
            imageLoader0 = Coil.imageLoader(((Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext())));
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return imageLoader0;
    }

    @Deprecated(message = "LocalImageLoader was intended to provide a method to overwrite the singleton ImageLoader in local compositions. In practice, it\'s not clear that `LocalImageLoader.provide` **does not** set the singleton ImageLoader. This can result in accidentally creating multiple ImageLoader instances if you use a combination of `LocalImageLoader.current` and `context.imageLoader`. To maximize performance, apps should create one ImageLoader or use `ImageLoader.newBuilder` to create new ImageLoaders that share the same resources.\n\nAdditionally, as a composition is at most scoped to an Activity, `LocalImageLoader.provide` encourages creating multiple ImageLoaders if the user creates multiple activities that use Compose.\n\nYou should migrate to `ImageLoaderFactory` to set the singleton ImageLoader and `LocalContext.current.imageLoader` to access the singleton ImageLoader in Compose. If you need to use a locally scoped ImageLoader it\'s recommended to use the `AsyncImage` and `rememberAsyncImagePainter` overloads that have an ImageLoader argument and pass the local ImageLoader as input.", replaceWith = @ReplaceWith(expression = "LocalContext.current.imageLoader", imports = {"androidx.compose.ui.platform.LocalContext", "coil.imageLoader"}))
    public static void getCurrent$annotations() {
    }

    @Override
    public int hashCode() {
        return ImageLoaderProvidableCompositionLocal.hashCode-impl(this.a);
    }

    public static int hashCode-impl(ProvidableCompositionLocal providableCompositionLocal0) {
        return providableCompositionLocal0.hashCode();
    }

    @Deprecated(message = "Implement `ImageLoaderFactory` in your `android.app.Application` class.")
    @NotNull
    public static final ProvidedValue provides-impl(ProvidableCompositionLocal providableCompositionLocal0, @NotNull ImageLoader imageLoader0) {
        return providableCompositionLocal0.provides(imageLoader0);
    }

    @Override
    public String toString() {
        return "ImageLoaderProvidableCompositionLocal(delegate=" + this.a + ')';
    }

    public static String toString-impl(ProvidableCompositionLocal providableCompositionLocal0) [...] // Inlined contents

    public final ProvidableCompositionLocal unbox-impl() {
        return this.a;
    }
}

