package coil;

import android.content.Context;
import android.widget.ImageView;
import coil.request.Disposable;
import coil.request.ImageRequest.Builder;
import coil.request.ImageResult;
import coil.util.CoilUtils;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\r\u0010\u000E\u001A\u00020\u000F*\u00020\u0007H\u0087\b\u001A\r\u0010\u0010\u001A\u00020\u000F*\u00020\u0007H\u0086\b\u001A<\u0010\u0011\u001A\u00020\u0012*\u00020\u00072\b\u0010\u0013\u001A\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0000\u001A\u00020\u00012\u0019\b\u0002\u0010\u0015\u001A\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000F0\u0016¢\u0006\u0002\b\u0018H\u0086\b\u001A<\u0010\u0019\u001A\u00020\u0012*\u00020\u00072\b\u0010\u0013\u001A\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0000\u001A\u00020\u00012\u0019\b\u0002\u0010\u0015\u001A\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000F0\u0016¢\u0006\u0002\b\u0018H\u0087\b\"\u0016\u0010\u0000\u001A\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004\"!\u0010\u0005\u001A\u0004\u0018\u00010\u0006*\u00020\u00078Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000B\"\u0018\u0010\f\u001A\u0004\u0018\u00010\u0006*\u00020\u00078Æ\u0002¢\u0006\u0006\u001A\u0004\b\r\u0010\u000B¨\u0006\u001A"}, d2 = {"imageLoader", "Lcoil/ImageLoader;", "Landroid/content/Context;", "getImageLoader", "(Landroid/content/Context;)Lcoil/ImageLoader;", "metadata", "Lcoil/request/ImageResult;", "Landroid/widget/ImageView;", "getMetadata$annotations", "(Landroid/widget/ImageView;)V", "getMetadata", "(Landroid/widget/ImageView;)Lcoil/request/ImageResult;", "result", "getResult", "clear", "", "dispose", "load", "Lcoil/request/Disposable;", "data", "", "builder", "Lkotlin/Function1;", "Lcoil/request/ImageRequest$Builder;", "Lkotlin/ExtensionFunctionType;", "loadAny", "coil-singleton_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "-SingletonExtensions")
@SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,114:1\n24#1:115\n59#1,6:116\n24#1:122\n59#1,6:123\n71#1,2:129\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\ncoil/-SingletonExtensions\n*L\n56#1:115\n92#1:116,6\n90#1:122\n92#1:123,6\n102#1:129,2\n*E\n"})
public final class -SingletonExtensions {
    @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to \'dispose\'.", replaceWith = @ReplaceWith(expression = "dispose()", imports = {"coil.dispose"}))
    public static final void clear(@NotNull ImageView imageView0) {
        CoilUtils.dispose(imageView0);
    }

    public static final void dispose(@NotNull ImageView imageView0) {
        CoilUtils.dispose(imageView0);
    }

    @NotNull
    public static final ImageLoader getImageLoader(@NotNull Context context0) {
        return Coil.imageLoader(context0);
    }

    @Nullable
    public static final ImageResult getMetadata(@NotNull ImageView imageView0) {
        return CoilUtils.result(imageView0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to \'result\'.", replaceWith = @ReplaceWith(expression = "result", imports = {"coil.result"}))
    public static void getMetadata$annotations(ImageView imageView0) {
    }

    @Nullable
    public static final ImageResult getResult(@NotNull ImageView imageView0) {
        return CoilUtils.result(imageView0);
    }

    @NotNull
    public static final Disposable load(@NotNull ImageView imageView0, @Nullable Object object0, @NotNull ImageLoader imageLoader0, @NotNull Function1 function10) {
        Builder imageRequest$Builder0 = new Builder(imageView0.getContext()).data(object0).target(imageView0);
        function10.invoke(imageRequest$Builder0);
        return imageLoader0.enqueue(imageRequest$Builder0.build());
    }

    public static Disposable load$default(ImageView imageView0, Object object0, ImageLoader imageLoader0, Function1 function10, int v, Object object1) {
        if((v & 2) != 0) {
            imageLoader0 = Coil.imageLoader(imageView0.getContext());
        }
        if((v & 4) != 0) {
            function10 = coil.-SingletonExtensions.load.1.INSTANCE;
        }
        Builder imageRequest$Builder0 = new Builder(imageView0.getContext()).data(object0).target(imageView0);
        function10.invoke(imageRequest$Builder0);
        return imageLoader0.enqueue(imageRequest$Builder0.build());

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcoil/request/ImageRequest$Builder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,114:1\n*E\n"})
        public final class coil.-SingletonExtensions.load.1 extends Lambda implements Function1 {
            public static final coil.-SingletonExtensions.load.1 INSTANCE;

            static {
                coil.-SingletonExtensions.load.1.INSTANCE = new coil.-SingletonExtensions.load.1();
            }

            public coil.-SingletonExtensions.load.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Builder imageRequest$Builder0) {
            }
        }

    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to \'load\'.", replaceWith = @ReplaceWith(expression = "load(data, imageLoader, builder)", imports = {"coil.imageLoader", "coil.load"}))
    @NotNull
    public static final Disposable loadAny(@NotNull ImageView imageView0, @Nullable Object object0, @NotNull ImageLoader imageLoader0, @NotNull Function1 function10) {
        Builder imageRequest$Builder0 = new Builder(imageView0.getContext()).data(object0).target(imageView0);
        function10.invoke(imageRequest$Builder0);
        return imageLoader0.enqueue(imageRequest$Builder0.build());
    }

    public static Disposable loadAny$default(ImageView imageView0, Object object0, ImageLoader imageLoader0, Function1 function10, int v, Object object1) {
        if((v & 2) != 0) {
            imageLoader0 = Coil.imageLoader(imageView0.getContext());
        }
        if((v & 4) != 0) {
            function10 = coil.-SingletonExtensions.loadAny.1.INSTANCE;
        }
        Builder imageRequest$Builder0 = new Builder(imageView0.getContext()).data(object0).target(imageView0);
        function10.invoke(imageRequest$Builder0);
        return imageLoader0.enqueue(imageRequest$Builder0.build());

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcoil/request/ImageRequest$Builder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\ncoil/-SingletonExtensions$loadAny$1\n*L\n1#1,114:1\n*E\n"})
        public final class coil.-SingletonExtensions.loadAny.1 extends Lambda implements Function1 {
            public static final coil.-SingletonExtensions.loadAny.1 INSTANCE;

            static {
                coil.-SingletonExtensions.loadAny.1.INSTANCE = new coil.-SingletonExtensions.loadAny.1();
            }

            public coil.-SingletonExtensions.loadAny.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Builder imageRequest$Builder0) {
            }
        }

    }
}

