package coil;

import android.graphics.Bitmap;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import androidx.compose.ui.text.n0;
import coil.decode.DecodeResult;
import coil.decode.Decoder;
import coil.fetch.FetchResult;
import coil.fetch.Fetcher;
import coil.request.ErrorResult;
import coil.request.ImageRequest.Listener;
import coil.request.ImageRequest;
import coil.request.Options;
import coil.request.SuccessResult;
import coil.size.Size;
import coil.transition.Transition;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 +2\u00020\u0001:\u0002+,J*\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\b\u0010\n\u001A\u0004\u0018\u00010\u000BH\u0017J \u0010\f\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tH\u0017J*\u0010\r\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\b\u001A\u00020\t2\b\u0010\n\u001A\u0004\u0018\u00010\u0010H\u0017J \u0010\u0011\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\b\u001A\u00020\tH\u0017J\u001A\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\b\u0010\u0013\u001A\u0004\u0018\u00010\u0014H\u0017J\u0018\u0010\u0015\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0016\u001A\u00020\u0017H\u0017J\u0018\u0010\u0018\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0013\u001A\u00020\u0017H\u0017J\u0018\u0010\u0019\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0016\u001A\u00020\u0017H\u0017J\u0010\u0010\u001A\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0017J\u0018\u0010\u001B\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\n\u001A\u00020\u001CH\u0017J\u0010\u0010\u001D\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0017J\u0018\u0010\u001E\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\n\u001A\u00020\u001FH\u0017J\u0018\u0010 \u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010!\u001A\u00020\"H\u0017J\u0010\u0010#\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0017J\u0018\u0010$\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0013\u001A\u00020%H\u0017J\u0018\u0010&\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0016\u001A\u00020%H\u0017J\u0018\u0010\'\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010(\u001A\u00020)H\u0017J\u0018\u0010*\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010(\u001A\u00020)H\u0017\u00F8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00A8\u0006-\u00C0\u0006\u0003"}, d2 = {"Lcoil/EventListener;", "Lcoil/request/ImageRequest$Listener;", "decodeEnd", "", "request", "Lcoil/request/ImageRequest;", "decoder", "Lcoil/decode/Decoder;", "options", "Lcoil/request/Options;", "result", "Lcoil/decode/DecodeResult;", "decodeStart", "fetchEnd", "fetcher", "Lcoil/fetch/Fetcher;", "Lcoil/fetch/FetchResult;", "fetchStart", "keyEnd", "output", "", "keyStart", "input", "", "mapEnd", "mapStart", "onCancel", "onError", "Lcoil/request/ErrorResult;", "onStart", "onSuccess", "Lcoil/request/SuccessResult;", "resolveSizeEnd", "size", "Lcoil/size/Size;", "resolveSizeStart", "transformEnd", "Landroid/graphics/Bitmap;", "transformStart", "transitionEnd", "transition", "Lcoil/transition/Transition;", "transitionStart", "Companion", "Factory", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface EventListener extends Listener {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0005"}, d2 = {"Lcoil/EventListener$Companion;", "", "Lcoil/EventListener;", "NONE", "Lcoil/EventListener;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @WorkerThread
        @Deprecated
        public static void decodeEnd(@NotNull EventListener eventListener0, @NotNull ImageRequest imageRequest0, @NotNull Decoder decoder0, @NotNull Options options0, @Nullable DecodeResult decodeResult0) {
        }

        @WorkerThread
        @Deprecated
        public static void decodeStart(@NotNull EventListener eventListener0, @NotNull ImageRequest imageRequest0, @NotNull Decoder decoder0, @NotNull Options options0) {
        }

        @WorkerThread
        @Deprecated
        public static void fetchEnd(@NotNull EventListener eventListener0, @NotNull ImageRequest imageRequest0, @NotNull Fetcher fetcher0, @NotNull Options options0, @Nullable FetchResult fetchResult0) {
        }

        @WorkerThread
        @Deprecated
        public static void fetchStart(@NotNull EventListener eventListener0, @NotNull ImageRequest imageRequest0, @NotNull Fetcher fetcher0, @NotNull Options options0) {
        }

        @MainThread
        @Deprecated
        public static void keyEnd(@NotNull EventListener eventListener0, @NotNull ImageRequest imageRequest0, @Nullable String s) {
        }

        @MainThread
        @Deprecated
        public static void keyStart(@NotNull EventListener eventListener0, @NotNull ImageRequest imageRequest0, @NotNull Object object0) {
        }

        @MainThread
        @Deprecated
        public static void mapEnd(@NotNull EventListener eventListener0, @NotNull ImageRequest imageRequest0, @NotNull Object object0) {
        }

        @MainThread
        @Deprecated
        public static void mapStart(@NotNull EventListener eventListener0, @NotNull ImageRequest imageRequest0, @NotNull Object object0) {
        }

        @MainThread
        @Deprecated
        public static void onCancel(@NotNull EventListener eventListener0, @NotNull ImageRequest imageRequest0) {
        }

        @MainThread
        @Deprecated
        public static void onError(@NotNull EventListener eventListener0, @NotNull ImageRequest imageRequest0, @NotNull ErrorResult errorResult0) {
        }

        @MainThread
        @Deprecated
        public static void onStart(@NotNull EventListener eventListener0, @NotNull ImageRequest imageRequest0) {
        }

        @MainThread
        @Deprecated
        public static void onSuccess(@NotNull EventListener eventListener0, @NotNull ImageRequest imageRequest0, @NotNull SuccessResult successResult0) {
        }

        @MainThread
        @Deprecated
        public static void resolveSizeEnd(@NotNull EventListener eventListener0, @NotNull ImageRequest imageRequest0, @NotNull Size size0) {
        }

        @MainThread
        @Deprecated
        public static void resolveSizeStart(@NotNull EventListener eventListener0, @NotNull ImageRequest imageRequest0) {
        }

        @WorkerThread
        @Deprecated
        public static void transformEnd(@NotNull EventListener eventListener0, @NotNull ImageRequest imageRequest0, @NotNull Bitmap bitmap0) {
        }

        @WorkerThread
        @Deprecated
        public static void transformStart(@NotNull EventListener eventListener0, @NotNull ImageRequest imageRequest0, @NotNull Bitmap bitmap0) {
        }

        @MainThread
        @Deprecated
        public static void transitionEnd(@NotNull EventListener eventListener0, @NotNull ImageRequest imageRequest0, @NotNull Transition transition0) {
        }

        @MainThread
        @Deprecated
        public static void transitionStart(@NotNull EventListener eventListener0, @NotNull ImageRequest imageRequest0, @NotNull Transition transition0) {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcoil/EventListener$Factory;", "", "create", "Lcoil/EventListener;", "request", "Lcoil/request/ImageRequest;", "Companion", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public interface Factory {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0005"}, d2 = {"Lcoil/EventListener$Factory$Companion;", "", "Lcoil/EventListener$Factory;", "NONE", "Lcoil/EventListener$Factory;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class coil.EventListener.Factory.Companion {
            public static final coil.EventListener.Factory.Companion a;

            static {
                coil.EventListener.Factory.Companion.a = new coil.EventListener.Factory.Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            }
        }

        @NotNull
        public static final coil.EventListener.Factory.Companion Companion;
        @JvmField
        @NotNull
        public static final Factory NONE;

        static {
            Factory.Companion = coil.EventListener.Factory.Companion.a;
            Factory.NONE = new n0(25);
        }

        @NotNull
        EventListener create(@NotNull ImageRequest arg1);
    }

    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final EventListener NONE;

    static {
        EventListener.Companion = Companion.a;
        EventListener.NONE = new EventListener.Companion.NONE.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    static void access$decodeEnd$jd(EventListener eventListener0, ImageRequest imageRequest0, Decoder decoder0, Options options0, DecodeResult decodeResult0) {
    }

    static void access$decodeStart$jd(EventListener eventListener0, ImageRequest imageRequest0, Decoder decoder0, Options options0) {
    }

    static void access$fetchEnd$jd(EventListener eventListener0, ImageRequest imageRequest0, Fetcher fetcher0, Options options0, FetchResult fetchResult0) {
    }

    static void access$fetchStart$jd(EventListener eventListener0, ImageRequest imageRequest0, Fetcher fetcher0, Options options0) {
    }

    static void access$keyEnd$jd(EventListener eventListener0, ImageRequest imageRequest0, String s) {
    }

    static void access$keyStart$jd(EventListener eventListener0, ImageRequest imageRequest0, Object object0) {
    }

    static void access$mapEnd$jd(EventListener eventListener0, ImageRequest imageRequest0, Object object0) {
    }

    static void access$mapStart$jd(EventListener eventListener0, ImageRequest imageRequest0, Object object0) {
    }

    static void access$onCancel$jd(EventListener eventListener0, ImageRequest imageRequest0) {
    }

    static void access$onError$jd(EventListener eventListener0, ImageRequest imageRequest0, ErrorResult errorResult0) {
    }

    static void access$onStart$jd(EventListener eventListener0, ImageRequest imageRequest0) {
    }

    static void access$onSuccess$jd(EventListener eventListener0, ImageRequest imageRequest0, SuccessResult successResult0) {
    }

    static void access$resolveSizeEnd$jd(EventListener eventListener0, ImageRequest imageRequest0, Size size0) {
    }

    static void access$resolveSizeStart$jd(EventListener eventListener0, ImageRequest imageRequest0) {
    }

    static void access$transformEnd$jd(EventListener eventListener0, ImageRequest imageRequest0, Bitmap bitmap0) {
    }

    static void access$transformStart$jd(EventListener eventListener0, ImageRequest imageRequest0, Bitmap bitmap0) {
    }

    static void access$transitionEnd$jd(EventListener eventListener0, ImageRequest imageRequest0, Transition transition0) {
    }

    static void access$transitionStart$jd(EventListener eventListener0, ImageRequest imageRequest0, Transition transition0) {
    }

    @WorkerThread
    default void decodeEnd(@NotNull ImageRequest imageRequest0, @NotNull Decoder decoder0, @NotNull Options options0, @Nullable DecodeResult decodeResult0) {
    }

    @WorkerThread
    default void decodeStart(@NotNull ImageRequest imageRequest0, @NotNull Decoder decoder0, @NotNull Options options0) {
    }

    @WorkerThread
    default void fetchEnd(@NotNull ImageRequest imageRequest0, @NotNull Fetcher fetcher0, @NotNull Options options0, @Nullable FetchResult fetchResult0) {
    }

    @WorkerThread
    default void fetchStart(@NotNull ImageRequest imageRequest0, @NotNull Fetcher fetcher0, @NotNull Options options0) {
    }

    @MainThread
    default void keyEnd(@NotNull ImageRequest imageRequest0, @Nullable String s) {
    }

    @MainThread
    default void keyStart(@NotNull ImageRequest imageRequest0, @NotNull Object object0) {
    }

    @MainThread
    default void mapEnd(@NotNull ImageRequest imageRequest0, @NotNull Object object0) {
    }

    @MainThread
    default void mapStart(@NotNull ImageRequest imageRequest0, @NotNull Object object0) {
    }

    @Override  // coil.request.ImageRequest$Listener
    @MainThread
    default void onCancel(@NotNull ImageRequest imageRequest0) {
    }

    @Override  // coil.request.ImageRequest$Listener
    @MainThread
    default void onError(@NotNull ImageRequest imageRequest0, @NotNull ErrorResult errorResult0) {
    }

    @Override  // coil.request.ImageRequest$Listener
    @MainThread
    default void onStart(@NotNull ImageRequest imageRequest0) {
    }

    @Override  // coil.request.ImageRequest$Listener
    @MainThread
    default void onSuccess(@NotNull ImageRequest imageRequest0, @NotNull SuccessResult successResult0) {
    }

    @MainThread
    default void resolveSizeEnd(@NotNull ImageRequest imageRequest0, @NotNull Size size0) {
    }

    @MainThread
    default void resolveSizeStart(@NotNull ImageRequest imageRequest0) {
    }

    @WorkerThread
    default void transformEnd(@NotNull ImageRequest imageRequest0, @NotNull Bitmap bitmap0) {
    }

    @WorkerThread
    default void transformStart(@NotNull ImageRequest imageRequest0, @NotNull Bitmap bitmap0) {
    }

    @MainThread
    default void transitionEnd(@NotNull ImageRequest imageRequest0, @NotNull Transition transition0) {
    }

    @MainThread
    default void transitionStart(@NotNull ImageRequest imageRequest0, @NotNull Transition transition0) {
    }
}

