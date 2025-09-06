package coil.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import coil.EventListener;
import coil.base.R.id;
import coil.decode.DataSource;
import coil.decode.Decoder.Factory;
import coil.disk.DiskCache.Editor;
import coil.intercept.Interceptor.Chain;
import coil.intercept.RealInterceptorChain;
import coil.memory.MemoryCache.Key;
import coil.memory.MemoryCache.Value;
import coil.memory.MemoryCache;
import coil.request.Parameters;
import coil.request.Tags;
import coil.request.ViewTargetRequestManager;
import coil.size.-Sizes;
import coil.size.Dimension.Pixels;
import coil.size.Dimension;
import coil.size.Scale;
import coil.size.Size;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.o;
import kotlin.text.p;
import kotlinx.coroutines.Deferred;
import okhttp3.Headers.Builder;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u00A6\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u0013\u0010\u0002\u001A\u00020\u0001*\u00020\u0000H\u0000\u00A2\u0006\u0004\b\u0002\u0010\u0003\u001A\u001F\u0010\u0007\u001A\u0004\u0018\u00010\u0005*\u00020\u00042\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005H\u0000\u00A2\u0006\u0004\b\u0007\u0010\b\u001A\u0015\u0010\n\u001A\u00020\t*\u0004\u0018\u00010\tH\u0000\u00A2\u0006\u0004\b\n\u0010\u000B\u001A\u0015\u0010\n\u001A\u00020\f*\u0004\u0018\u00010\fH\u0000\u00A2\u0006\u0004\b\n\u0010\r\u001A\u0015\u0010\n\u001A\u00020\u000E*\u0004\u0018\u00010\u000EH\u0000\u00A2\u0006\u0004\b\n\u0010\u000F\u001A\u000F\u0010\u0011\u001A\u00020\u0010H\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012\u001A!\u0010\u0015\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0016\u001A \u0010\u001B\u001A\u0004\u0018\u00010\u001A*\u00020\u00172\b\u0010\u0019\u001A\u0004\u0018\u00010\u0018H\u0080\n\u00A2\u0006\u0004\b\u001B\u0010\u001C\u001A2\u0010\"\u001A\u00020\u001D*\u00020\u001D2\u001C\u0010!\u001A\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001F\u0012\b\u0012\u0006\u0012\u0002\b\u00030 \u0018\u00010\u001EH\u0080\b\u00A2\u0006\u0004\b\"\u0010#\u001A\u001E\u0010\"\u001A\u00020\u001D*\u00020\u001D2\b\u0010%\u001A\u0004\u0018\u00010$H\u0080\b\u00A2\u0006\u0004\b\"\u0010&\u001A\u001B\u0010)\u001A\u00020\'*\u00020\u00052\u0006\u0010(\u001A\u00020\'H\u0000\u00A2\u0006\u0004\b)\u0010*\u001A\u0013\u0010,\u001A\u00020\u0001*\u00020+H\u0000\u00A2\u0006\u0004\b,\u0010-\u001A\u0013\u0010.\u001A\u00020\u0010*\u00020\'H\u0000\u00A2\u0006\u0004\b.\u0010/\u001A*\u00105\u001A\u00020\'*\u0002002\u0006\u00102\u001A\u0002012\f\u00104\u001A\b\u0012\u0004\u0012\u00020\'03H\u0080\b\u00A2\u0006\u0004\b5\u00106\u001A*\u00107\u001A\u00020\'*\u0002002\u0006\u00102\u001A\u0002012\f\u00104\u001A\b\u0012\u0004\u0012\u00020\'03H\u0080\b\u00A2\u0006\u0004\b7\u00106\u001A\u001B\u00109\u001A\u00020\'*\u0002082\u0006\u00102\u001A\u000201H\u0000\u00A2\u0006\u0004\b9\u0010:\u001A\u000F\u0010<\u001A\u00020;H\u0000\u00A2\u0006\u0004\b<\u0010=\u001A\u0017\u0010@\u001A\u00020\u00102\u0006\u0010?\u001A\u00020>H\u0000\u00A2\u0006\u0004\b@\u0010A\u001A\u001B\u0010D\u001A\u00020B*\u00020B2\u0006\u0010C\u001A\u00020\u0005H\u0000\u00A2\u0006\u0004\bD\u0010E\u001A\u0013\u0010H\u001A\u00020G*\u00020FH\u0000\u00A2\u0006\u0004\bH\u0010I\u001A\u0017\u0010M\u001A\u00020L2\u0006\u0010K\u001A\u00020JH\u0000\u00A2\u0006\u0004\bM\u0010N\u001A\u001F\u0010P\u001A\u00020\'2\u0006\u0010K\u001A\u00020J2\u0006\u0010O\u001A\u00020LH\u0000\u00A2\u0006\u0004\bP\u0010Q\" \u0010X\u001A\b\u0012\u0004\u0012\u00020S0R8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bT\u0010U\u001A\u0004\bV\u0010W\"\u001A\u0010]\u001A\u00020S8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bY\u0010Z\u001A\u0004\b[\u0010\\\"\u001A\u0010b\u001A\u00020\t8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b^\u0010_\u001A\u0004\b`\u0010a\"\u0014\u0010c\u001A\u00020\u00058\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\bc\u0010d\"\u0014\u0010e\u001A\u00020\u00058\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\be\u0010d\"\u0014\u0010f\u001A\u00020\u00058\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\bf\u0010d\"\u0014\u0010g\u001A\u00020\u00058\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\bg\u0010d\"\u0014\u0010h\u001A\u00020\u00058\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\bh\u0010d\"\u0018\u0010m\u001A\u00020j*\u00020i8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bk\u0010l\"\u0018\u0010q\u001A\u00020\u0005*\u00020n8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bo\u0010p\"\u0018\u0010u\u001A\u00020\'*\u00020r8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bs\u0010t\"\u0018\u0010w\u001A\u00020\'*\u00020r8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bv\u0010t\"\u0018\u0010x\u001A\u00020\u0010*\u00020r8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bx\u0010y\"\u0018\u00102\u001A\u000201*\u00020z8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b{\u0010|\"\u001A\u0010\u007F\u001A\u0004\u0018\u00010\u0005*\u00020>8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b}\u0010~\"\u001C\u0010\u0083\u0001\u001A\u00020\'*\u00030\u0080\u00018@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u0081\u0001\u0010\u0082\u0001\"\"\u0010\u0085\u0001\u001A\u0005\u0018\u00010\u0084\u00018\u0000X\u0080\u0004\u00A2\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001A\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u001D\u0010\u008C\u0001\u001A\u00020\'*\u00030\u0089\u00018\u00C0\u0002X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u008A\u0001\u0010\u008B\u0001\"\u001C\u0010\u0090\u0001\u001A\u00030\u008D\u0001*\u00020J8@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u008E\u0001\u0010\u008F\u0001\"\u001C\u0010\u0092\u0001\u001A\u00020\u0010*\u00030\u0091\u00018@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u001D\u0010\u0097\u0001\u001A\u00030\u0094\u0001*\u00030\u0091\u00018@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u0095\u0001\u0010\u0096\u0001\u00A8\u0006\u0098\u0001"}, d2 = {"Ljava/io/Closeable;", "", "closeQuietly", "(Ljava/io/Closeable;)V", "Landroid/webkit/MimeTypeMap;", "", "url", "getMimeTypeFromUrl", "(Landroid/webkit/MimeTypeMap;Ljava/lang/String;)Ljava/lang/String;", "Lokhttp3/Headers;", "orEmpty", "(Lokhttp3/Headers;)Lokhttp3/Headers;", "Lcoil/request/Tags;", "(Lcoil/request/Tags;)Lcoil/request/Tags;", "Lcoil/request/Parameters;", "(Lcoil/request/Parameters;)Lcoil/request/Parameters;", "", "isMainThread", "()Z", "T", "Lkotlinx/coroutines/Deferred;", "getCompletedOrNull", "(Lkotlinx/coroutines/Deferred;)Ljava/lang/Object;", "Lcoil/memory/MemoryCache;", "Lcoil/memory/MemoryCache$Key;", "key", "Lcoil/memory/MemoryCache$Value;", "get", "(Lcoil/memory/MemoryCache;Lcoil/memory/MemoryCache$Key;)Lcoil/memory/MemoryCache$Value;", "Lcoil/ComponentRegistry$Builder;", "Lkotlin/Pair;", "Lcoil/fetch/Fetcher$Factory;", "Ljava/lang/Class;", "pair", "addFirst", "(Lcoil/ComponentRegistry$Builder;Lkotlin/Pair;)Lcoil/ComponentRegistry$Builder;", "Lcoil/decode/Decoder$Factory;", "factory", "(Lcoil/ComponentRegistry$Builder;Lcoil/decode/Decoder$Factory;)Lcoil/ComponentRegistry$Builder;", "", "defaultValue", "toNonNegativeInt", "(Ljava/lang/String;I)I", "Lcoil/disk/DiskCache$Editor;", "abortQuietly", "(Lcoil/disk/DiskCache$Editor;)V", "isMinOrMax", "(I)Z", "Lcoil/size/Size;", "Lcoil/size/Scale;", "scale", "Lkotlin/Function0;", "original", "widthPx", "(Lcoil/size/Size;Lcoil/size/Scale;Lkotlin/jvm/functions/Function0;)I", "heightPx", "Lcoil/size/Dimension;", "toPx", "(Lcoil/size/Dimension;Lcoil/size/Scale;)I", "", "unsupported", "()Ljava/lang/Void;", "Landroid/net/Uri;", "uri", "isAssetUri", "(Landroid/net/Uri;)Z", "Lokhttp3/Headers$Builder;", "line", "addUnsafeNonAscii", "(Lokhttp3/Headers$Builder;Ljava/lang/String;)Lokhttp3/Headers$Builder;", "Lokhttp3/Response;", "Lokhttp3/ResponseBody;", "requireBody", "(Lokhttp3/Response;)Lokhttp3/ResponseBody;", "Landroid/content/Context;", "context", "", "defaultMemoryCacheSizePercent", "(Landroid/content/Context;)D", "percent", "calculateMemoryCacheSize", "(Landroid/content/Context;D)I", "", "Landroid/graphics/Bitmap$Config;", "a", "[Landroid/graphics/Bitmap$Config;", "getVALID_TRANSFORMATION_CONFIGS", "()[Landroid/graphics/Bitmap$Config;", "VALID_TRANSFORMATION_CONFIGS", "b", "Landroid/graphics/Bitmap$Config;", "getDEFAULT_BITMAP_CONFIG", "()Landroid/graphics/Bitmap$Config;", "DEFAULT_BITMAP_CONFIG", "c", "Lokhttp3/Headers;", "getEMPTY_HEADERS", "()Lokhttp3/Headers;", "EMPTY_HEADERS", "MIME_TYPE_JPEG", "Ljava/lang/String;", "MIME_TYPE_WEBP", "MIME_TYPE_HEIC", "MIME_TYPE_HEIF", "ASSET_FILE_PATH_ROOT", "Landroid/view/View;", "Lcoil/request/ViewTargetRequestManager;", "getRequestManager", "(Landroid/view/View;)Lcoil/request/ViewTargetRequestManager;", "requestManager", "Lcoil/decode/DataSource;", "getEmoji", "(Lcoil/decode/DataSource;)Ljava/lang/String;", "emoji", "Landroid/graphics/drawable/Drawable;", "getWidth", "(Landroid/graphics/drawable/Drawable;)I", "width", "getHeight", "height", "isVector", "(Landroid/graphics/drawable/Drawable;)Z", "Landroid/widget/ImageView;", "getScale", "(Landroid/widget/ImageView;)Lcoil/size/Scale;", "getFirstPathSegment", "(Landroid/net/Uri;)Ljava/lang/String;", "firstPathSegment", "Landroid/content/res/Configuration;", "getNightMode", "(Landroid/content/res/Configuration;)I", "nightMode", "Landroid/graphics/ColorSpace;", "NULL_COLOR_SPACE", "Landroid/graphics/ColorSpace;", "getNULL_COLOR_SPACE", "()Landroid/graphics/ColorSpace;", "", "getIdentityHashCode", "(Ljava/lang/Object;)I", "identityHashCode", "Ljava/io/File;", "getSafeCacheDir", "(Landroid/content/Context;)Ljava/io/File;", "safeCacheDir", "Lcoil/intercept/Interceptor$Chain;", "isPlaceholderCached", "(Lcoil/intercept/Interceptor$Chain;)Z", "Lcoil/EventListener;", "getEventListener", "(Lcoil/intercept/Interceptor$Chain;)Lcoil/EventListener;", "eventListener", "coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "-Utils")
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncoil/util/-Utils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dimension.kt\ncoil/size/-Dimensions\n+ 4 Contexts.kt\ncoil/util/-Contexts\n+ 5 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,302:1\n1#2:303\n57#3:304\n78#4:305\n78#4:307\n31#5:306\n31#5:308\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncoil/util/-Utils\n*L\n226#1:304\n258#1:305\n270#1:307\n258#1:306\n270#1:308\n*E\n"})
public final class -Utils {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;
        public static final int[] $EnumSwitchMapping$2;

        static {
            int[] arr_v = new int[DataSource.values().length];
            try {
                arr_v[DataSource.MEMORY_CACHE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[DataSource.MEMORY.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[DataSource.DISK.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[DataSource.NETWORK.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
            int[] arr_v1 = new int[ImageView.ScaleType.values().length];
            try {
                arr_v1[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$1 = arr_v1;
            int[] arr_v2 = new int[Scale.values().length];
            try {
                arr_v2[Scale.FILL.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v2[Scale.FIT.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$2 = arr_v2;
        }
    }

    @NotNull
    public static final String ASSET_FILE_PATH_ROOT = "android_asset";
    @NotNull
    public static final String MIME_TYPE_HEIC = "image/heic";
    @NotNull
    public static final String MIME_TYPE_HEIF = "image/heif";
    @NotNull
    public static final String MIME_TYPE_JPEG = "image/jpeg";
    @NotNull
    public static final String MIME_TYPE_WEBP = "image/webp";
    public static final Bitmap.Config[] a;
    public static final Bitmap.Config b;
    public static final Headers c;

    static {
        -Utils.a = new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};
        -Utils.b = Bitmap.Config.HARDWARE;
        -Utils.c = new Builder().build();
    }

    public static final void abortQuietly(@NotNull Editor diskCache$Editor0) {
        try {
            diskCache$Editor0.abort();
        }
        catch(Exception unused_ex) {
        }
    }

    @NotNull
    public static final coil.ComponentRegistry.Builder addFirst(@NotNull coil.ComponentRegistry.Builder componentRegistry$Builder0, @Nullable Factory decoder$Factory0) {
        if(decoder$Factory0 != null) {
            componentRegistry$Builder0.getDecoderFactories$coil_base_release().add(0, decoder$Factory0);
        }
        return componentRegistry$Builder0;
    }

    @NotNull
    public static final coil.ComponentRegistry.Builder addFirst(@NotNull coil.ComponentRegistry.Builder componentRegistry$Builder0, @Nullable Pair pair0) {
        if(pair0 != null) {
            componentRegistry$Builder0.getFetcherFactories$coil_base_release().add(0, pair0);
        }
        return componentRegistry$Builder0;
    }

    @NotNull
    public static final Builder addUnsafeNonAscii(@NotNull Builder headers$Builder0, @NotNull String s) {
        int v = StringsKt__StringsKt.indexOf$default(s, ':', 0, false, 6, null);
        if(v == -1) {
            throw new IllegalArgumentException(("Unexpected header: " + s).toString());
        }
        String s1 = s.substring(0, v);
        Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
        String s2 = StringsKt__StringsKt.trim(s1).toString();
        String s3 = s.substring(v + 1);
        Intrinsics.checkNotNullExpressionValue(s3, "substring(...)");
        headers$Builder0.addUnsafeNonAscii(s2, s3);
        return headers$Builder0;
    }

    public static final int calculateMemoryCacheSize(@NotNull Context context0, double f) {
        try {
            Object object0 = ContextCompat.getSystemService(context0, ActivityManager.class);
            Intrinsics.checkNotNull(object0);
            return (context0.getApplicationInfo().flags & 0x100000) == 0 ? ((int)(f * ((double)((ActivityManager)object0).getMemoryClass()) * 1048576.0)) : ((int)(f * ((double)((ActivityManager)object0).getLargeMemoryClass()) * 1048576.0));
        }
        catch(Exception unused_ex) {
            return (int)(f * 268435456.0);
        }
    }

    public static final void closeQuietly(@NotNull Closeable closeable0) {
        try {
            closeable0.close();
        }
        catch(RuntimeException runtimeException0) {
            throw runtimeException0;
        }
        catch(Exception unused_ex) {
        }
    }

    public static final double defaultMemoryCacheSizePercent(@NotNull Context context0) {
        try {
            Object object0 = ContextCompat.getSystemService(context0, ActivityManager.class);
            Intrinsics.checkNotNull(object0);
            if(((ActivityManager)object0).isLowRamDevice()) {
                return 0.15;
            }
        }
        catch(Exception unused_ex) {
        }
        return 0.2;
    }

    @Nullable
    public static final Value get(@NotNull MemoryCache memoryCache0, @Nullable Key memoryCache$Key0) {
        return memoryCache$Key0 == null ? null : memoryCache0.get(memoryCache$Key0);
    }

    @Nullable
    public static final Object getCompletedOrNull(@NotNull Deferred deferred0) {
        try {
            return deferred0.getCompleted();
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    @NotNull
    public static final Bitmap.Config getDEFAULT_BITMAP_CONFIG() {
        return -Utils.b;
    }

    @NotNull
    public static final Headers getEMPTY_HEADERS() {
        return -Utils.c;
    }

    @NotNull
    public static final String getEmoji(@NotNull DataSource dataSource0) {
        switch(WhenMappings.$EnumSwitchMapping$0[dataSource0.ordinal()]) {
            case 1: 
            case 2: {
                return "\uD83E\uDDE0";
            }
            case 3: {
                return "\uD83D\uDCBE";
            }
            case 4: {
                return "☁️ ";
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    // 去混淆评级： 低(20)
    @NotNull
    public static final EventListener getEventListener(@NotNull Chain interceptor$Chain0) {
        return interceptor$Chain0 instanceof RealInterceptorChain ? ((RealInterceptorChain)interceptor$Chain0).getEventListener() : EventListener.NONE;
    }

    @Nullable
    public static final String getFirstPathSegment(@NotNull Uri uri0) {
        return (String)CollectionsKt___CollectionsKt.firstOrNull(uri0.getPathSegments());
    }

    public static final int getHeight(@NotNull Drawable drawable0) {
        BitmapDrawable bitmapDrawable0 = drawable0 instanceof BitmapDrawable ? ((BitmapDrawable)drawable0) : null;
        if(bitmapDrawable0 != null) {
            Bitmap bitmap0 = bitmapDrawable0.getBitmap();
            return bitmap0 == null ? drawable0.getIntrinsicHeight() : bitmap0.getHeight();
        }
        return drawable0.getIntrinsicHeight();
    }

    public static final int getIdentityHashCode(@NotNull Object object0) {
        return System.identityHashCode(object0);
    }

    @Nullable
    public static final String getMimeTypeFromUrl(@NotNull MimeTypeMap mimeTypeMap0, @Nullable String s) {
        return s == null || p.isBlank(s) ? null : mimeTypeMap0.getMimeTypeFromExtension(StringsKt__StringsKt.substringAfterLast(StringsKt__StringsKt.substringAfterLast$default(StringsKt__StringsKt.substringBeforeLast$default(StringsKt__StringsKt.substringBeforeLast$default(s, '#', null, 2, null), '?', null, 2, null), '/', null, 2, null), '.', ""));
    }

    @Nullable
    public static final ColorSpace getNULL_COLOR_SPACE() [...] // Inlined contents

    public static final int getNightMode(@NotNull Configuration configuration0) {
        return configuration0.uiMode & 0x30;
    }

    @NotNull
    public static final ViewTargetRequestManager getRequestManager(@NotNull View view0) {
        Object object0 = view0.getTag(id.coil_request_manager);
        ViewTargetRequestManager viewTargetRequestManager0 = null;
        ViewTargetRequestManager viewTargetRequestManager1 = object0 instanceof ViewTargetRequestManager ? ((ViewTargetRequestManager)object0) : null;
        if(viewTargetRequestManager1 == null) {
            synchronized(view0) {
                Object object1 = view0.getTag(id.coil_request_manager);
                if(object1 instanceof ViewTargetRequestManager) {
                    viewTargetRequestManager0 = (ViewTargetRequestManager)object1;
                }
                if(viewTargetRequestManager0 == null) {
                    viewTargetRequestManager1 = new ViewTargetRequestManager(view0);
                    view0.addOnAttachStateChangeListener(viewTargetRequestManager1);
                    view0.setTag(id.coil_request_manager, viewTargetRequestManager1);
                }
                else {
                    viewTargetRequestManager1 = viewTargetRequestManager0;
                }
                return viewTargetRequestManager1;
            }
        }
        return viewTargetRequestManager1;
    }

    @NotNull
    public static final File getSafeCacheDir(@NotNull Context context0) {
        File file0 = context0.getCacheDir();
        if(file0 == null) {
            throw new IllegalStateException("cacheDir == null");
        }
        file0.mkdirs();
        return file0;
    }

    @NotNull
    public static final Scale getScale(@NotNull ImageView imageView0) {
        ImageView.ScaleType imageView$ScaleType0 = imageView0.getScaleType();
        int v = imageView$ScaleType0 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[imageView$ScaleType0.ordinal()];
        return v == 1 || v == 2 || v == 3 || v == 4 ? Scale.FIT : Scale.FILL;
    }

    @NotNull
    public static final Bitmap.Config[] getVALID_TRANSFORMATION_CONFIGS() {
        return -Utils.a;
    }

    public static final int getWidth(@NotNull Drawable drawable0) {
        BitmapDrawable bitmapDrawable0 = drawable0 instanceof BitmapDrawable ? ((BitmapDrawable)drawable0) : null;
        if(bitmapDrawable0 != null) {
            Bitmap bitmap0 = bitmapDrawable0.getBitmap();
            return bitmap0 == null ? drawable0.getIntrinsicWidth() : bitmap0.getWidth();
        }
        return drawable0.getIntrinsicWidth();
    }

    // 去混淆评级： 低(20)
    public static final int heightPx(@NotNull Size size0, @NotNull Scale scale0, @NotNull Function0 function00) {
        return -Sizes.isOriginal(size0) ? ((Number)function00.invoke()).intValue() : -Utils.toPx(size0.getHeight(), scale0);
    }

    // 去混淆评级： 低(20)
    public static final boolean isAssetUri(@NotNull Uri uri0) {
        return Intrinsics.areEqual(uri0.getScheme(), "file") && Intrinsics.areEqual(-Utils.getFirstPathSegment(uri0), "android_asset");
    }

    public static final boolean isMainThread() {
        return Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean isMinOrMax(int v) {
        return v == 0x80000000 || v == 0x7FFFFFFF;
    }

    // 去混淆评级： 低(20)
    public static final boolean isPlaceholderCached(@NotNull Chain interceptor$Chain0) {
        return interceptor$Chain0 instanceof RealInterceptorChain && ((RealInterceptorChain)interceptor$Chain0).isPlaceholderCached();
    }

    // 去混淆评级： 低(20)
    public static final boolean isVector(@NotNull Drawable drawable0) {
        return drawable0 instanceof VectorDrawable || drawable0 instanceof VectorDrawableCompat;
    }

    @NotNull
    public static final Parameters orEmpty(@Nullable Parameters parameters0) {
        return parameters0 == null ? Parameters.EMPTY : parameters0;
    }

    @NotNull
    public static final Tags orEmpty(@Nullable Tags tags0) {
        return tags0 == null ? Tags.EMPTY : tags0;
    }

    @NotNull
    public static final Headers orEmpty(@Nullable Headers headers0) {
        return headers0 == null ? -Utils.c : headers0;
    }

    @NotNull
    public static final ResponseBody requireBody(@NotNull Response response0) {
        ResponseBody responseBody0 = response0.body();
        if(responseBody0 == null) {
            throw new IllegalStateException("response body == null");
        }
        return responseBody0;
    }

    public static final int toNonNegativeInt(@NotNull String s, int v) {
        Long long0 = o.toLongOrNull(s);
        if(long0 != null) {
            long v1 = (long)long0;
            if(v1 > 0x7FFFFFFFL) {
                return 0x7FFFFFFF;
            }
            return v1 >= 0L ? ((int)v1) : 0;
        }
        return v;
    }

    public static final int toPx(@NotNull Dimension dimension0, @NotNull Scale scale0) {
        if(dimension0 instanceof Pixels) {
            return ((Pixels)dimension0).px;
        }
        switch(WhenMappings.$EnumSwitchMapping$2[scale0.ordinal()]) {
            case 1: {
                return 0x80000000;
            }
            case 2: {
                return 0x7FFFFFFF;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public static final Void unsupported() {
        throw new IllegalStateException("Unsupported");
    }

    // 去混淆评级： 低(20)
    public static final int widthPx(@NotNull Size size0, @NotNull Scale scale0, @NotNull Function0 function00) {
        return -Sizes.isOriginal(size0) ? ((Number)function00.invoke()).intValue() : -Utils.toPx(size0.getWidth(), scale0);
    }
}

