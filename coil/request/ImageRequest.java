package coil.request;

import a5.b;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.MainThread;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import coil.decode.Decoder.Factory;
import coil.decode.Decoder;
import coil.fetch.Fetcher;
import coil.memory.MemoryCache.Key;
import coil.size.-Sizes;
import coil.size.Dimension;
import coil.size.DisplaySizeResolver;
import coil.size.Precision;
import coil.size.Scale;
import coil.size.Size;
import coil.size.SizeResolver;
import coil.size.SizeResolvers;
import coil.size.ViewSizeResolver;
import coil.size.ViewSizeResolvers;
import coil.target.ImageViewTarget;
import coil.target.Target;
import coil.target.ViewTarget;
import coil.transform.Transformation;
import coil.transition.Transition;
import coil.util.-Collections;
import coil.util.-Contexts;
import coil.util.-Requests;
import coil.util.-Utils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.x;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000\u00E2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0004\u00C0\u0001\u00C1\u0001J\u0019\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0003\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u001A\u0010\t\u001A\u00020\b2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001A\u00020\u00018\u0006\u00A2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u0019\u0010\u001C\u001A\u0004\u0018\u00010\u00178\u0006\u00A2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR\u0019\u0010\"\u001A\u0004\u0018\u00010\u001D8\u0006\u00A2\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!R\u0019\u0010(\u001A\u0004\u0018\u00010#8\u0006\u00A2\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'R\u0019\u0010.\u001A\u0004\u0018\u00010)8\u0006\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-R\u0017\u00104\u001A\u00020/8\u0006\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u00103R\u0019\u0010:\u001A\u0004\u0018\u0001058\u0006\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u00109R\u0017\u0010@\u001A\u00020;8\u0006\u00A2\u0006\f\n\u0004\b<\u0010=\u001A\u0004\b>\u0010?R-\u0010H\u001A\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030B\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0018\u00010A8\u0006\u00A2\u0006\f\n\u0004\bD\u0010E\u001A\u0004\bF\u0010GR\u0019\u0010N\u001A\u0004\u0018\u00010I8\u0006\u00A2\u0006\f\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010MR\u001D\u0010U\u001A\b\u0012\u0004\u0012\u00020P0O8\u0006\u00A2\u0006\f\n\u0004\bQ\u0010R\u001A\u0004\bS\u0010TR\u0017\u0010[\u001A\u00020V8\u0006\u00A2\u0006\f\n\u0004\bW\u0010X\u001A\u0004\bY\u0010ZR\u0017\u0010a\u001A\u00020\\8\u0006\u00A2\u0006\f\n\u0004\b]\u0010^\u001A\u0004\b_\u0010`R\u0017\u0010g\u001A\u00020b8\u0006\u00A2\u0006\f\n\u0004\bc\u0010d\u001A\u0004\be\u0010fR\u0017\u0010l\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\bh\u0010i\u001A\u0004\bj\u0010kR\u0017\u0010o\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\bm\u0010i\u001A\u0004\bn\u0010kR\u0017\u0010r\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\bp\u0010i\u001A\u0004\bq\u0010kR\u0017\u0010u\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\bs\u0010i\u001A\u0004\bt\u0010kR\u0017\u0010{\u001A\u00020v8\u0006\u00A2\u0006\f\n\u0004\bw\u0010x\u001A\u0004\by\u0010zR\u0017\u0010~\u001A\u00020v8\u0006\u00A2\u0006\f\n\u0004\b|\u0010x\u001A\u0004\b}\u0010zR\u0019\u0010\u0081\u0001\u001A\u00020v8\u0006\u00A2\u0006\r\n\u0004\b\u007F\u0010x\u001A\u0005\b\u0080\u0001\u0010zR\u001D\u0010\u0087\u0001\u001A\u00030\u0082\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001A\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001D\u0010\u008A\u0001\u001A\u00030\u0082\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0084\u0001\u001A\u0006\b\u0089\u0001\u0010\u0086\u0001R\u001D\u0010\u008D\u0001\u001A\u00030\u0082\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u008B\u0001\u0010\u0084\u0001\u001A\u0006\b\u008C\u0001\u0010\u0086\u0001R\u001D\u0010\u0090\u0001\u001A\u00030\u0082\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u008E\u0001\u0010\u0084\u0001\u001A\u0006\b\u008F\u0001\u0010\u0086\u0001R\u001D\u0010\u0096\u0001\u001A\u00030\u0091\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001A\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001D\u0010\u009C\u0001\u001A\u00030\u0097\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001A\u0006\b\u009A\u0001\u0010\u009B\u0001R\u001D\u0010\u00A2\u0001\u001A\u00030\u009D\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u009E\u0001\u0010\u009F\u0001\u001A\u0006\b\u00A0\u0001\u0010\u00A1\u0001R\u001D\u0010\u00A8\u0001\u001A\u00030\u00A3\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00A4\u0001\u0010\u00A5\u0001\u001A\u0006\b\u00A6\u0001\u0010\u00A7\u0001R\u001C\u0010\u00AB\u0001\u001A\u0004\u0018\u00010#8\u0006\u00A2\u0006\u000E\n\u0005\b\u00A9\u0001\u0010%\u001A\u0005\b\u00AA\u0001\u0010\'R\u001D\u0010\u00B1\u0001\u001A\u00030\u00AC\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00AD\u0001\u0010\u00AE\u0001\u001A\u0006\b\u00AF\u0001\u0010\u00B0\u0001R\u001D\u0010\u00B7\u0001\u001A\u00030\u00B2\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00B3\u0001\u0010\u00B4\u0001\u001A\u0006\b\u00B5\u0001\u0010\u00B6\u0001R\u0017\u0010\u00BB\u0001\u001A\u0005\u0018\u00010\u00B8\u00018F\u00A2\u0006\b\u001A\u0006\b\u00B9\u0001\u0010\u00BA\u0001R\u0017\u0010\u00BD\u0001\u001A\u0005\u0018\u00010\u00B8\u00018F\u00A2\u0006\b\u001A\u0006\b\u00BC\u0001\u0010\u00BA\u0001R\u0017\u0010\u00BF\u0001\u001A\u0005\u0018\u00010\u00B8\u00018F\u00A2\u0006\b\u001A\u0006\b\u00BE\u0001\u0010\u00BA\u0001\u00A8\u0006\u00C2\u0001"}, d2 = {"Lcoil/request/ImageRequest;", "", "Landroid/content/Context;", "context", "Lcoil/request/ImageRequest$Builder;", "newBuilder", "(Landroid/content/Context;)Lcoil/request/ImageRequest$Builder;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "data", "Lcoil/target/Target;", "c", "Lcoil/target/Target;", "getTarget", "()Lcoil/target/Target;", "target", "Lcoil/request/ImageRequest$Listener;", "d", "Lcoil/request/ImageRequest$Listener;", "getListener", "()Lcoil/request/ImageRequest$Listener;", "listener", "Lcoil/memory/MemoryCache$Key;", "e", "Lcoil/memory/MemoryCache$Key;", "getMemoryCacheKey", "()Lcoil/memory/MemoryCache$Key;", "memoryCacheKey", "", "f", "Ljava/lang/String;", "getDiskCacheKey", "()Ljava/lang/String;", "diskCacheKey", "Landroid/graphics/Bitmap$Config;", "g", "Landroid/graphics/Bitmap$Config;", "getBitmapConfig", "()Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/ColorSpace;", "h", "Landroid/graphics/ColorSpace;", "getColorSpace", "()Landroid/graphics/ColorSpace;", "colorSpace", "Lcoil/size/Precision;", "i", "Lcoil/size/Precision;", "getPrecision", "()Lcoil/size/Precision;", "precision", "Lkotlin/Pair;", "Lcoil/fetch/Fetcher$Factory;", "Ljava/lang/Class;", "j", "Lkotlin/Pair;", "getFetcherFactory", "()Lkotlin/Pair;", "fetcherFactory", "Lcoil/decode/Decoder$Factory;", "k", "Lcoil/decode/Decoder$Factory;", "getDecoderFactory", "()Lcoil/decode/Decoder$Factory;", "decoderFactory", "", "Lcoil/transform/Transformation;", "l", "Ljava/util/List;", "getTransformations", "()Ljava/util/List;", "transformations", "Lcoil/transition/Transition$Factory;", "m", "Lcoil/transition/Transition$Factory;", "getTransitionFactory", "()Lcoil/transition/Transition$Factory;", "transitionFactory", "Lokhttp3/Headers;", "n", "Lokhttp3/Headers;", "getHeaders", "()Lokhttp3/Headers;", "headers", "Lcoil/request/Tags;", "o", "Lcoil/request/Tags;", "getTags", "()Lcoil/request/Tags;", "tags", "p", "Z", "getAllowConversionToBitmap", "()Z", "allowConversionToBitmap", "q", "getAllowHardware", "allowHardware", "r", "getAllowRgb565", "allowRgb565", "s", "getPremultipliedAlpha", "premultipliedAlpha", "Lcoil/request/CachePolicy;", "t", "Lcoil/request/CachePolicy;", "getMemoryCachePolicy", "()Lcoil/request/CachePolicy;", "memoryCachePolicy", "u", "getDiskCachePolicy", "diskCachePolicy", "v", "getNetworkCachePolicy", "networkCachePolicy", "Lkotlinx/coroutines/CoroutineDispatcher;", "w", "Lkotlinx/coroutines/CoroutineDispatcher;", "getInterceptorDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "interceptorDispatcher", "x", "getFetcherDispatcher", "fetcherDispatcher", "y", "getDecoderDispatcher", "decoderDispatcher", "z", "getTransformationDispatcher", "transformationDispatcher", "Landroidx/lifecycle/Lifecycle;", "A", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lcoil/size/SizeResolver;", "B", "Lcoil/size/SizeResolver;", "getSizeResolver", "()Lcoil/size/SizeResolver;", "sizeResolver", "Lcoil/size/Scale;", "C", "Lcoil/size/Scale;", "getScale", "()Lcoil/size/Scale;", "scale", "Lcoil/request/Parameters;", "D", "Lcoil/request/Parameters;", "getParameters", "()Lcoil/request/Parameters;", "parameters", "E", "getPlaceholderMemoryCacheKey", "placeholderMemoryCacheKey", "Lcoil/request/DefinedRequestOptions;", "L", "Lcoil/request/DefinedRequestOptions;", "getDefined", "()Lcoil/request/DefinedRequestOptions;", "defined", "Lcoil/request/DefaultRequestOptions;", "M", "Lcoil/request/DefaultRequestOptions;", "getDefaults", "()Lcoil/request/DefaultRequestOptions;", "defaults", "Landroid/graphics/drawable/Drawable;", "getPlaceholder", "()Landroid/graphics/drawable/Drawable;", "placeholder", "getError", "error", "getFallback", "fallback", "Builder", "Listener", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ImageRequest {
    @Metadata(d1 = {"\u0000\u00BA\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005B\u001B\b\u0017\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\t\u001A\u00020\u00002\b\u0010\t\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001A\u00020\u00002\b\u0010\f\u001A\u0004\u0018\u00010\u000B\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\r\u001A\u00020\u00002\b\u0010\f\u001A\u0004\u0018\u00010\u000F\u00A2\u0006\u0004\b\r\u0010\u0010J\u0017\u0010\u0011\u001A\u00020\u00002\b\u0010\f\u001A\u0004\u0018\u00010\u000B\u00A2\u0006\u0004\b\u0011\u0010\u000EJ\u00CE\u0001\u0010\u001E\u001A\u00020\u00002#\b\u0006\u0010\u0016\u001A\u001D\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00150\u00122#\b\u0006\u0010\u0017\u001A\u001D\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00150\u001228\b\u0006\u0010\u001B\u001A2\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0019\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001A\u0012\u0004\u0012\u00020\u00150\u001828\b\u0006\u0010\u001D\u001A2\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u001C\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001A\u0012\u0004\u0012\u00020\u00150\u0018H\u0086\b\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0017\u0010\u001E\u001A\u00020\u00002\b\u0010\u001E\u001A\u0004\u0018\u00010 \u00A2\u0006\u0004\b\u001E\u0010!J\u0015\u0010#\u001A\u00020\u00002\u0006\u0010#\u001A\u00020\"\u00A2\u0006\u0004\b#\u0010$J\u0015\u0010%\u001A\u00020\u00002\u0006\u0010#\u001A\u00020\"\u00A2\u0006\u0004\b%\u0010$J\u0015\u0010&\u001A\u00020\u00002\u0006\u0010#\u001A\u00020\"\u00A2\u0006\u0004\b&\u0010$J\u0015\u0010\'\u001A\u00020\u00002\u0006\u0010#\u001A\u00020\"\u00A2\u0006\u0004\b\'\u0010$J\u0015\u0010(\u001A\u00020\u00002\u0006\u0010#\u001A\u00020\"\u00A2\u0006\u0004\b(\u0010$J!\u0010+\u001A\u00020\u00002\u0012\u0010+\u001A\n\u0012\u0006\b\u0001\u0012\u00020*0)\"\u00020*\u00A2\u0006\u0004\b+\u0010,J\u001B\u0010+\u001A\u00020\u00002\f\u0010+\u001A\b\u0012\u0004\u0012\u00020*0-\u00A2\u0006\u0004\b+\u0010.J\u0015\u00101\u001A\u00020\u00002\u0006\u00100\u001A\u00020/\u00A2\u0006\u0004\b1\u00102J\u0017\u00104\u001A\u00020\u00002\u0006\u00104\u001A\u000203H\u0007\u00A2\u0006\u0004\b4\u00105J\u0017\u00107\u001A\u00020\u00002\b\b\u0001\u00107\u001A\u000206\u00A2\u0006\u0004\b7\u00108J!\u00107\u001A\u00020\u00002\b\b\u0001\u00109\u001A\u0002062\b\b\u0001\u0010:\u001A\u000206\u00A2\u0006\u0004\b7\u0010;J\u001D\u00107\u001A\u00020\u00002\u0006\u00109\u001A\u00020<2\u0006\u0010:\u001A\u00020<\u00A2\u0006\u0004\b7\u0010=J\u0015\u00107\u001A\u00020\u00002\u0006\u00107\u001A\u00020>\u00A2\u0006\u0004\b7\u0010?J\u0015\u00107\u001A\u00020\u00002\u0006\u0010A\u001A\u00020@\u00A2\u0006\u0004\b7\u0010BJ\u0015\u0010D\u001A\u00020\u00002\u0006\u0010D\u001A\u00020C\u00A2\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001A\u00020\u00002\u0006\u0010G\u001A\u00020F\u00A2\u0006\u0004\bG\u0010HJ*\u0010L\u001A\u00020\u0000\"\n\b\u0000\u0010I\u0018\u0001*\u00020\u00012\f\u0010K\u001A\b\u0012\u0004\u0012\u00028\u00000JH\u0086\b\u00A2\u0006\u0004\bL\u0010MJ3\u0010L\u001A\u00020\u0000\"\b\b\u0000\u0010I*\u00020\u00012\f\u0010K\u001A\b\u0012\u0004\u0012\u00028\u00000J2\f\u0010O\u001A\b\u0012\u0004\u0012\u00028\u00000N\u00A2\u0006\u0004\bL\u0010PJ\u0015\u0010R\u001A\u00020\u00002\u0006\u0010K\u001A\u00020Q\u00A2\u0006\u0004\bR\u0010SJ\u0015\u0010V\u001A\u00020\u00002\u0006\u0010U\u001A\u00020T\u00A2\u0006\u0004\bV\u0010WJ\u0015\u0010X\u001A\u00020\u00002\u0006\u0010U\u001A\u00020T\u00A2\u0006\u0004\bX\u0010WJ\u0015\u0010Y\u001A\u00020\u00002\u0006\u0010U\u001A\u00020T\u00A2\u0006\u0004\bY\u0010WJ\u0015\u0010Z\u001A\u00020\u00002\u0006\u0010U\u001A\u00020T\u00A2\u0006\u0004\bZ\u0010WJ\u0015\u0010]\u001A\u00020\u00002\u0006\u0010\\\u001A\u00020[\u00A2\u0006\u0004\b]\u0010^J\u0015\u0010_\u001A\u00020\u00002\u0006\u0010\\\u001A\u00020[\u00A2\u0006\u0004\b_\u0010^J\u0015\u0010`\u001A\u00020\u00002\u0006\u0010\\\u001A\u00020[\u00A2\u0006\u0004\b`\u0010^J\u0015\u0010b\u001A\u00020\u00002\u0006\u0010b\u001A\u00020a\u00A2\u0006\u0004\bb\u0010cJ\u001D\u0010e\u001A\u00020\u00002\u0006\u0010\u0014\u001A\u00020\u000B2\u0006\u0010d\u001A\u00020\u000B\u00A2\u0006\u0004\be\u0010fJ\u001D\u0010g\u001A\u00020\u00002\u0006\u0010\u0014\u001A\u00020\u000B2\u0006\u0010d\u001A\u00020\u000B\u00A2\u0006\u0004\bg\u0010fJ\u0015\u0010h\u001A\u00020\u00002\u0006\u0010\u0014\u001A\u00020\u000B\u00A2\u0006\u0004\bh\u0010\u000EJ&\u0010i\u001A\u00020\u0000\"\n\b\u0000\u0010I\u0018\u0001*\u00020\u00012\b\u0010i\u001A\u0004\u0018\u00018\u0000H\u0086\b\u00A2\u0006\u0004\bi\u0010\nJ1\u0010i\u001A\u00020\u0000\"\b\b\u0000\u0010I*\u00020\u00012\u000E\u0010O\u001A\n\u0012\u0006\b\u0000\u0012\u00028\u00000N2\b\u0010i\u001A\u0004\u0018\u00018\u0000\u00A2\u0006\u0004\bi\u0010jJ\u0015\u0010l\u001A\u00020\u00002\u0006\u0010l\u001A\u00020k\u00A2\u0006\u0004\bl\u0010mJ\u0017\u0010n\u001A\u00020\u00002\b\u0010\f\u001A\u0004\u0018\u00010\u000B\u00A2\u0006\u0004\bn\u0010\u000EJ\u0017\u0010n\u001A\u00020\u00002\b\u0010\f\u001A\u0004\u0018\u00010\u000F\u00A2\u0006\u0004\bn\u0010\u0010J\u0017\u0010p\u001A\u00020\u00002\b\b\u0001\u0010o\u001A\u000206\u00A2\u0006\u0004\bp\u00108J\u0017\u0010p\u001A\u00020\u00002\b\u0010r\u001A\u0004\u0018\u00010q\u00A2\u0006\u0004\bp\u0010sJ\u0017\u0010t\u001A\u00020\u00002\b\b\u0001\u0010o\u001A\u000206\u00A2\u0006\u0004\bt\u00108J\u0017\u0010t\u001A\u00020\u00002\b\u0010r\u001A\u0004\u0018\u00010q\u00A2\u0006\u0004\bt\u0010sJ\u0017\u0010u\u001A\u00020\u00002\b\b\u0001\u0010o\u001A\u000206\u00A2\u0006\u0004\bu\u00108J\u0017\u0010u\u001A\u00020\u00002\b\u0010r\u001A\u0004\u0018\u00010q\u00A2\u0006\u0004\bu\u0010sJ\u0015\u0010x\u001A\u00020\u00002\u0006\u0010w\u001A\u00020v\u00A2\u0006\u0004\bx\u0010yJ\u0083\u0001\u0010x\u001A\u00020\u00002%\b\u0006\u0010\u0016\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010q\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(p\u0012\u0004\u0012\u00020\u00150\u00122%\b\u0006\u0010\u001B\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010q\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(t\u0012\u0004\u0012\u00020\u00150\u00122#\b\u0006\u0010\u001D\u001A\u001D\u0012\u0013\u0012\u00110q\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001A\u0012\u0004\u0012\u00020\u00150\u0012H\u0086\b\u00A2\u0006\u0004\bx\u0010zJ\u0017\u0010x\u001A\u00020\u00002\b\u0010x\u001A\u0004\u0018\u00010{\u00A2\u0006\u0004\bx\u0010|J\u0015\u0010}\u001A\u00020\u00002\u0006\u0010U\u001A\u00020T\u00A2\u0006\u0004\b}\u0010WJ\u0015\u0010}\u001A\u00020\u00002\u0006\u0010~\u001A\u000206\u00A2\u0006\u0004\b}\u00108J\u0019\u0010\u0081\u0001\u001A\u00020\u00002\u0007\u0010\u0080\u0001\u001A\u00020\u007F\u00A2\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001C\u0010\u0085\u0001\u001A\u00020\u00002\n\u0010\u0084\u0001\u001A\u0005\u0018\u00010\u0083\u0001\u00A2\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001C\u0010\u0085\u0001\u001A\u00020\u00002\n\u0010\u0085\u0001\u001A\u0005\u0018\u00010\u0087\u0001\u00A2\u0006\u0006\b\u0085\u0001\u0010\u0088\u0001J0\u0010\u0089\u0001\u001A\u00020\u00002\u0006\u0010\f\u001A\u00020\u000B2\b\u0010d\u001A\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u000BH\u0007\u00A2\u0006\u0006\b\u0089\u0001\u0010\u008A\u0001J\u0017\u0010\u008B\u0001\u001A\u00020\u00002\u0006\u0010\f\u001A\u00020\u000B\u00A2\u0006\u0005\b\u008B\u0001\u0010\u000EJ\u001A\u0010\u008D\u0001\u001A\u00020\u00002\b\u0010\u008D\u0001\u001A\u00030\u008C\u0001\u00A2\u0006\u0006\b\u008D\u0001\u0010\u008E\u0001J\u001A\u0010\u0090\u0001\u001A\u00020\u00002\b\u0010\u0090\u0001\u001A\u00030\u008F\u0001\u00A2\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u0010\u0010\u0092\u0001\u001A\u00020\u0006\u00A2\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001C\u0010\u0095\u0001\u001A\u00020\u00002\b\u0010\u0095\u0001\u001A\u00030\u0094\u0001H\u0007\u00A2\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u001C\u0010\u0098\u0001\u001A\u00020\u00002\b\u0010\u0098\u0001\u001A\u00030\u0097\u0001H\u0007\u00A2\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001C\u0010\u0080\u0001\u001A\u00020\u00002\b\u0010\u0080\u0001\u001A\u00030\u009A\u0001H\u0007\u00A2\u0006\u0006\b\u0080\u0001\u0010\u009B\u0001\u00A8\u0006\u009C\u0001"}, d2 = {"Lcoil/request/ImageRequest$Builder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcoil/request/ImageRequest;", "request", "(Lcoil/request/ImageRequest;Landroid/content/Context;)V", "data", "(Ljava/lang/Object;)Lcoil/request/ImageRequest$Builder;", "", "key", "memoryCacheKey", "(Ljava/lang/String;)Lcoil/request/ImageRequest$Builder;", "Lcoil/memory/MemoryCache$Key;", "(Lcoil/memory/MemoryCache$Key;)Lcoil/request/ImageRequest$Builder;", "diskCacheKey", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "onStart", "onCancel", "Lkotlin/Function2;", "Lcoil/request/ErrorResult;", "result", "onError", "Lcoil/request/SuccessResult;", "onSuccess", "listener", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lcoil/request/ImageRequest$Builder;", "Lcoil/request/ImageRequest$Listener;", "(Lcoil/request/ImageRequest$Listener;)Lcoil/request/ImageRequest$Builder;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "(Lkotlinx/coroutines/CoroutineDispatcher;)Lcoil/request/ImageRequest$Builder;", "interceptorDispatcher", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "", "Lcoil/transform/Transformation;", "transformations", "([Lcoil/transform/Transformation;)Lcoil/request/ImageRequest$Builder;", "", "(Ljava/util/List;)Lcoil/request/ImageRequest$Builder;", "Landroid/graphics/Bitmap$Config;", "config", "bitmapConfig", "(Landroid/graphics/Bitmap$Config;)Lcoil/request/ImageRequest$Builder;", "Landroid/graphics/ColorSpace;", "colorSpace", "(Landroid/graphics/ColorSpace;)Lcoil/request/ImageRequest$Builder;", "", "size", "(I)Lcoil/request/ImageRequest$Builder;", "width", "height", "(II)Lcoil/request/ImageRequest$Builder;", "Lcoil/size/Dimension;", "(Lcoil/size/Dimension;Lcoil/size/Dimension;)Lcoil/request/ImageRequest$Builder;", "Lcoil/size/Size;", "(Lcoil/size/Size;)Lcoil/request/ImageRequest$Builder;", "Lcoil/size/SizeResolver;", "resolver", "(Lcoil/size/SizeResolver;)Lcoil/request/ImageRequest$Builder;", "Lcoil/size/Scale;", "scale", "(Lcoil/size/Scale;)Lcoil/request/ImageRequest$Builder;", "Lcoil/size/Precision;", "precision", "(Lcoil/size/Precision;)Lcoil/request/ImageRequest$Builder;", "T", "Lcoil/fetch/Fetcher$Factory;", "factory", "fetcherFactory", "(Lcoil/fetch/Fetcher$Factory;)Lcoil/request/ImageRequest$Builder;", "Ljava/lang/Class;", "type", "(Lcoil/fetch/Fetcher$Factory;Ljava/lang/Class;)Lcoil/request/ImageRequest$Builder;", "Lcoil/decode/Decoder$Factory;", "decoderFactory", "(Lcoil/decode/Decoder$Factory;)Lcoil/request/ImageRequest$Builder;", "", "enable", "allowConversionToBitmap", "(Z)Lcoil/request/ImageRequest$Builder;", "allowHardware", "allowRgb565", "premultipliedAlpha", "Lcoil/request/CachePolicy;", "policy", "memoryCachePolicy", "(Lcoil/request/CachePolicy;)Lcoil/request/ImageRequest$Builder;", "diskCachePolicy", "networkCachePolicy", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;)Lcoil/request/ImageRequest$Builder;", "value", "addHeader", "(Ljava/lang/String;Ljava/lang/String;)Lcoil/request/ImageRequest$Builder;", "setHeader", "removeHeader", "tag", "(Ljava/lang/Class;Ljava/lang/Object;)Lcoil/request/ImageRequest$Builder;", "Lcoil/request/Tags;", "tags", "(Lcoil/request/Tags;)Lcoil/request/ImageRequest$Builder;", "placeholderMemoryCacheKey", "drawableResId", "placeholder", "Landroid/graphics/drawable/Drawable;", "drawable", "(Landroid/graphics/drawable/Drawable;)Lcoil/request/ImageRequest$Builder;", "error", "fallback", "Landroid/widget/ImageView;", "imageView", "target", "(Landroid/widget/ImageView;)Lcoil/request/ImageRequest$Builder;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcoil/request/ImageRequest$Builder;", "Lcoil/target/Target;", "(Lcoil/target/Target;)Lcoil/request/ImageRequest$Builder;", "crossfade", "durationMillis", "Lcoil/transition/Transition$Factory;", "transition", "transitionFactory", "(Lcoil/transition/Transition$Factory;)Lcoil/request/ImageRequest$Builder;", "Landroidx/lifecycle/LifecycleOwner;", "owner", "lifecycle", "(Landroidx/lifecycle/LifecycleOwner;)Lcoil/request/ImageRequest$Builder;", "Landroidx/lifecycle/Lifecycle;", "(Landroidx/lifecycle/Lifecycle;)Lcoil/request/ImageRequest$Builder;", "setParameter", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Lcoil/request/ImageRequest$Builder;", "removeParameter", "Lcoil/request/Parameters;", "parameters", "(Lcoil/request/Parameters;)Lcoil/request/ImageRequest$Builder;", "Lcoil/request/DefaultRequestOptions;", "defaults", "(Lcoil/request/DefaultRequestOptions;)Lcoil/request/ImageRequest$Builder;", "build", "()Lcoil/request/ImageRequest;", "Lcoil/fetch/Fetcher;", "fetcher", "(Lcoil/fetch/Fetcher;)Lcoil/request/ImageRequest$Builder;", "Lcoil/decode/Decoder;", "decoder", "(Lcoil/decode/Decoder;)Lcoil/request/ImageRequest$Builder;", "Lcoil/transition/Transition;", "(Lcoil/transition/Transition;)Lcoil/request/ImageRequest$Builder;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1057:1\n1#2:1058\n*E\n"})
    public static final class Builder {
        public CoroutineDispatcher A;
        public coil.request.Parameters.Builder B;
        public Key C;
        public Integer D;
        public Drawable E;
        public Integer F;
        public Drawable G;
        public Integer H;
        public Drawable I;
        public Lifecycle J;
        public SizeResolver K;
        public Scale L;
        public Lifecycle M;
        public SizeResolver N;
        public Scale O;
        public final Context a;
        public DefaultRequestOptions b;
        public Object c;
        public Target d;
        public Listener e;
        public Key f;
        public String g;
        public Bitmap.Config h;
        public ColorSpace i;
        public Precision j;
        public Pair k;
        public Factory l;
        public List m;
        public coil.transition.Transition.Factory n;
        public okhttp3.Headers.Builder o;
        public Map p;
        public boolean q;
        public Boolean r;
        public Boolean s;
        public boolean t;
        public CachePolicy u;
        public CachePolicy v;
        public CachePolicy w;
        public CoroutineDispatcher x;
        public CoroutineDispatcher y;
        public CoroutineDispatcher z;

        public Builder(@NotNull Context context0) {
            this.a = context0;
            this.b = -Requests.getDEFAULT_REQUEST_OPTIONS();
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = CollectionsKt__CollectionsKt.emptyList();
            this.n = null;
            this.o = null;
            this.p = null;
            this.q = true;
            this.r = null;
            this.s = null;
            this.t = true;
            this.u = null;
            this.v = null;
            this.w = null;
            this.x = null;
            this.y = null;
            this.z = null;
            this.A = null;
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.I = null;
            this.J = null;
            this.K = null;
            this.L = null;
            this.M = null;
            this.N = null;
            this.O = null;
        }

        @JvmOverloads
        public Builder(@NotNull ImageRequest imageRequest0) {
            this(imageRequest0, null, 2, null);
        }

        @JvmOverloads
        public Builder(@NotNull ImageRequest imageRequest0, @NotNull Context context0) {
            this.a = context0;
            this.b = imageRequest0.getDefaults();
            this.c = imageRequest0.getData();
            this.d = imageRequest0.getTarget();
            this.e = imageRequest0.getListener();
            this.f = imageRequest0.getMemoryCacheKey();
            this.g = imageRequest0.getDiskCacheKey();
            this.h = imageRequest0.getDefined().getBitmapConfig();
            this.i = imageRequest0.getColorSpace();
            this.j = imageRequest0.getDefined().getPrecision();
            this.k = imageRequest0.getFetcherFactory();
            this.l = imageRequest0.getDecoderFactory();
            this.m = imageRequest0.getTransformations();
            this.n = imageRequest0.getDefined().getTransitionFactory();
            this.o = imageRequest0.getHeaders().newBuilder();
            this.p = x.toMutableMap(imageRequest0.getTags().asMap());
            this.q = imageRequest0.getAllowConversionToBitmap();
            this.r = imageRequest0.getDefined().getAllowHardware();
            this.s = imageRequest0.getDefined().getAllowRgb565();
            this.t = imageRequest0.getPremultipliedAlpha();
            this.u = imageRequest0.getDefined().getMemoryCachePolicy();
            this.v = imageRequest0.getDefined().getDiskCachePolicy();
            this.w = imageRequest0.getDefined().getNetworkCachePolicy();
            this.x = imageRequest0.getDefined().getInterceptorDispatcher();
            this.y = imageRequest0.getDefined().getFetcherDispatcher();
            this.z = imageRequest0.getDefined().getDecoderDispatcher();
            this.A = imageRequest0.getDefined().getTransformationDispatcher();
            this.B = imageRequest0.getParameters().newBuilder();
            this.C = imageRequest0.getPlaceholderMemoryCacheKey();
            this.D = imageRequest0.F;
            this.E = imageRequest0.G;
            this.F = imageRequest0.H;
            this.G = imageRequest0.I;
            this.H = imageRequest0.J;
            this.I = imageRequest0.K;
            this.J = imageRequest0.getDefined().getLifecycle();
            this.K = imageRequest0.getDefined().getSizeResolver();
            this.L = imageRequest0.getDefined().getScale();
            if(imageRequest0.getContext() == context0) {
                this.M = imageRequest0.getLifecycle();
                this.N = imageRequest0.getSizeResolver();
                this.O = imageRequest0.getScale();
                return;
            }
            this.M = null;
            this.N = null;
            this.O = null;
        }

        public Builder(ImageRequest imageRequest0, Context context0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                context0 = imageRequest0.getContext();
            }
            this(imageRequest0, context0);
        }

        @NotNull
        public final Builder addHeader(@NotNull String s, @NotNull String s1) {
            okhttp3.Headers.Builder headers$Builder0 = this.o;
            if(headers$Builder0 == null) {
                headers$Builder0 = new okhttp3.Headers.Builder();
                this.o = headers$Builder0;
            }
            headers$Builder0.add(s, s1);
            return this;
        }

        @NotNull
        public final Builder allowConversionToBitmap(boolean z) {
            this.q = z;
            return this;
        }

        @NotNull
        public final Builder allowHardware(boolean z) {
            this.r = Boolean.valueOf(z);
            return this;
        }

        @NotNull
        public final Builder allowRgb565(boolean z) {
            this.s = Boolean.valueOf(z);
            return this;
        }

        @NotNull
        public final Builder bitmapConfig(@NotNull Bitmap.Config bitmap$Config0) {
            this.h = bitmap$Config0;
            return this;
        }

        @NotNull
        public final ImageRequest build() {
            ViewTarget viewTarget0;
            View view1;
            coil.transition.Transition.Factory transition$Factory1;
            SizeResolver sizeResolver1;
            Lifecycle lifecycle2;
            Lifecycle lifecycle1;
            boolean z4;
            NullRequestData nullRequestData0 = this.c;
            if(nullRequestData0 == null) {
                nullRequestData0 = NullRequestData.INSTANCE;
            }
            Target target0 = this.d;
            Listener imageRequest$Listener0 = this.e;
            Key memoryCache$Key0 = this.f;
            String s = this.g;
            Bitmap.Config bitmap$Config0 = this.h == null ? this.b.getBitmapConfig() : this.h;
            ColorSpace colorSpace0 = this.i;
            Precision precision0 = this.j == null ? this.b.getPrecision() : this.j;
            Pair pair0 = this.k;
            Factory decoder$Factory0 = this.l;
            List list0 = this.m;
            coil.transition.Transition.Factory transition$Factory0 = this.n == null ? this.b.getTransitionFactory() : this.n;
            Headers headers0 = -Utils.orEmpty((this.o == null ? null : this.o.build()));
            Tags tags0 = -Utils.orEmpty((this.p == null ? null : Tags.Companion.from(this.p)));
            boolean z = this.q;
            boolean z1 = this.r == null ? this.b.getAllowHardware() : this.r.booleanValue();
            boolean z2 = this.s == null ? this.b.getAllowRgb565() : this.s.booleanValue();
            boolean z3 = this.t;
            CachePolicy cachePolicy0 = this.u == null ? this.b.getMemoryCachePolicy() : this.u;
            CachePolicy cachePolicy1 = this.v == null ? this.b.getDiskCachePolicy() : this.v;
            CachePolicy cachePolicy2 = this.w == null ? this.b.getNetworkCachePolicy() : this.w;
            CoroutineDispatcher coroutineDispatcher0 = this.x == null ? this.b.getInterceptorDispatcher() : this.x;
            CoroutineDispatcher coroutineDispatcher1 = this.y == null ? this.b.getFetcherDispatcher() : this.y;
            CoroutineDispatcher coroutineDispatcher2 = this.z == null ? this.b.getDecoderDispatcher() : this.z;
            CoroutineDispatcher coroutineDispatcher3 = this.A == null ? this.b.getTransformationDispatcher() : this.A;
            Lifecycle lifecycle0 = this.J;
            Context context0 = this.a;
            if(lifecycle0 == null) {
                lifecycle0 = this.M;
                if(lifecycle0 == null) {
                    z4 = z;
                    lifecycle1 = -Contexts.getLifecycle((this.d instanceof ViewTarget ? ((ViewTarget)this.d).getView().getContext() : context0));
                    if(lifecycle1 == null) {
                        lifecycle1 = GlobalLifecycle.INSTANCE;
                    }
                }
                else {
                    z4 = z;
                    lifecycle1 = lifecycle0;
                }
            }
            else {
                z4 = z;
                lifecycle1 = lifecycle0;
            }
            SizeResolver sizeResolver0 = this.K;
            if(sizeResolver0 == null) {
                sizeResolver0 = this.N;
                if(sizeResolver0 == null) {
                    Target target1 = this.d;
                    lifecycle2 = lifecycle1;
                    if(target1 instanceof ViewTarget) {
                        View view0 = ((ViewTarget)target1).getView();
                        if(view0 instanceof ImageView) {
                            ImageView.ScaleType imageView$ScaleType0 = ((ImageView)view0).getScaleType();
                            if(imageView$ScaleType0 != ImageView.ScaleType.CENTER && imageView$ScaleType0 != ImageView.ScaleType.MATRIX) {
                                transition$Factory1 = transition$Factory0;
                                sizeResolver1 = ViewSizeResolvers.create$default(view0, false, 2, null);
                            }
                            else {
                                sizeResolver1 = SizeResolvers.create(Size.ORIGINAL);
                                transition$Factory1 = transition$Factory0;
                            }
                        }
                        else {
                            transition$Factory1 = transition$Factory0;
                            sizeResolver1 = ViewSizeResolvers.create$default(view0, false, 2, null);
                        }
                    }
                    else {
                        transition$Factory1 = transition$Factory0;
                        sizeResolver1 = new DisplaySizeResolver(context0);
                    }
                }
                else {
                    lifecycle2 = lifecycle1;
                    transition$Factory1 = transition$Factory0;
                    sizeResolver1 = sizeResolver0;
                }
            }
            else {
                lifecycle2 = lifecycle1;
                transition$Factory1 = transition$Factory0;
                sizeResolver1 = sizeResolver0;
            }
            Scale scale0 = this.L;
            if(scale0 == null) {
                scale0 = this.O;
                if(scale0 == null) {
                    ViewSizeResolver viewSizeResolver0 = this.K instanceof ViewSizeResolver ? ((ViewSizeResolver)this.K) : null;
                    if(viewSizeResolver0 == null) {
                        viewTarget0 = this.d instanceof ViewTarget ? ((ViewTarget)this.d) : null;
                        view1 = viewTarget0 == null ? null : viewTarget0.getView();
                    }
                    else {
                        view1 = viewSizeResolver0.getView();
                        if(view1 == null) {
                            viewTarget0 = this.d instanceof ViewTarget ? ((ViewTarget)this.d) : null;
                            view1 = viewTarget0 == null ? null : viewTarget0.getView();
                        }
                    }
                    scale0 = view1 instanceof ImageView ? -Utils.getScale(((ImageView)view1)) : Scale.FIT;
                }
            }
            Parameters parameters0 = -Utils.orEmpty((this.B == null ? null : this.B.build()));
            Key memoryCache$Key1 = this.C;
            Integer integer0 = this.D;
            Drawable drawable0 = this.E;
            Integer integer1 = this.F;
            Drawable drawable1 = this.G;
            Integer integer2 = this.H;
            Drawable drawable2 = this.I;
            DefinedRequestOptions definedRequestOptions0 = new DefinedRequestOptions(this.J, this.K, this.L, this.x, this.y, this.z, this.A, this.n, this.j, this.h, this.r, this.s, this.u, this.v, this.w);
            return new ImageRequest(this.a, nullRequestData0, target0, imageRequest$Listener0, memoryCache$Key0, s, bitmap$Config0, colorSpace0, precision0, pair0, decoder$Factory0, list0, transition$Factory1, headers0, tags0, z4, z1, z2, z3, cachePolicy0, cachePolicy1, cachePolicy2, coroutineDispatcher0, coroutineDispatcher1, coroutineDispatcher2, coroutineDispatcher3, lifecycle2, sizeResolver1, scale0, parameters0, memoryCache$Key1, integer0, drawable0, integer1, drawable1, integer2, drawable2, definedRequestOptions0, this.b, null);
        }

        @RequiresApi(26)
        @NotNull
        public final Builder colorSpace(@NotNull ColorSpace colorSpace0) {
            this.i = colorSpace0;
            return this;
        }

        @NotNull
        public final Builder crossfade(int v) {
            coil.transition.Transition.Factory transition$Factory0 = v > 0 ? new coil.transition.CrossfadeTransition.Factory(v, false, 2, null) : coil.transition.Transition.Factory.NONE;
            this.transitionFactory(transition$Factory0);
            return this;
        }

        // 去混淆评级： 低(20)
        @NotNull
        public final Builder crossfade(boolean z) {
            return z ? this.crossfade(100) : this.crossfade(0);
        }

        @NotNull
        public final Builder data(@Nullable Object object0) {
            this.c = object0;
            return this;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to \'decoderFactory\'.", replaceWith = @ReplaceWith(expression = "decoderFactory { _, _, _ -> decoder }", imports = {}))
        @NotNull
        public final Builder decoder(@NotNull Decoder decoder0) {
            -Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @NotNull
        public final Builder decoderDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher0) {
            this.z = coroutineDispatcher0;
            return this;
        }

        @NotNull
        public final Builder decoderFactory(@NotNull Factory decoder$Factory0) {
            this.l = decoder$Factory0;
            return this;
        }

        @NotNull
        public final Builder defaults(@NotNull DefaultRequestOptions defaultRequestOptions0) {
            this.b = defaultRequestOptions0;
            this.O = null;
            return this;
        }

        @NotNull
        public final Builder diskCacheKey(@Nullable String s) {
            this.g = s;
            return this;
        }

        @NotNull
        public final Builder diskCachePolicy(@NotNull CachePolicy cachePolicy0) {
            this.v = cachePolicy0;
            return this;
        }

        @NotNull
        public final Builder dispatcher(@NotNull CoroutineDispatcher coroutineDispatcher0) {
            this.y = coroutineDispatcher0;
            this.z = coroutineDispatcher0;
            this.A = coroutineDispatcher0;
            return this;
        }

        @NotNull
        public final Builder error(@DrawableRes int v) {
            this.F = v;
            this.G = null;
            return this;
        }

        @NotNull
        public final Builder error(@Nullable Drawable drawable0) {
            this.G = drawable0;
            this.F = 0;
            return this;
        }

        @NotNull
        public final Builder fallback(@DrawableRes int v) {
            this.H = v;
            this.I = null;
            return this;
        }

        @NotNull
        public final Builder fallback(@Nullable Drawable drawable0) {
            this.I = drawable0;
            this.H = 0;
            return this;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to \'fetcherFactory\'.", replaceWith = @ReplaceWith(expression = "fetcherFactory<Any> { _, _, _ -> fetcher }", imports = {}))
        @NotNull
        public final Builder fetcher(@NotNull Fetcher fetcher0) {
            -Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @NotNull
        public final Builder fetcherDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher0) {
            this.y = coroutineDispatcher0;
            return this;
        }

        public final Builder fetcherFactory(coil.fetch.Fetcher.Factory fetcher$Factory0) {
            Intrinsics.reifiedOperationMarker(4, "T");
            return this.fetcherFactory(fetcher$Factory0, Object.class);
        }

        @NotNull
        public final Builder fetcherFactory(@NotNull coil.fetch.Fetcher.Factory fetcher$Factory0, @NotNull Class class0) {
            this.k = TuplesKt.to(fetcher$Factory0, class0);
            return this;
        }

        @NotNull
        public final Builder headers(@NotNull Headers headers0) {
            this.o = headers0.newBuilder();
            return this;
        }

        @NotNull
        public final Builder interceptorDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher0) {
            this.x = coroutineDispatcher0;
            return this;
        }

        @NotNull
        public final Builder lifecycle(@Nullable Lifecycle lifecycle0) {
            this.J = lifecycle0;
            return this;
        }

        @NotNull
        public final Builder lifecycle(@Nullable LifecycleOwner lifecycleOwner0) {
            return lifecycleOwner0 == null ? this.lifecycle(null) : this.lifecycle(lifecycleOwner0.getLifecycle());
        }

        @NotNull
        public final Builder listener(@Nullable Listener imageRequest$Listener0) {
            this.e = imageRequest$Listener0;
            return this;
        }

        @NotNull
        public final Builder listener(@NotNull Function1 function10, @NotNull Function1 function11, @NotNull Function2 function20, @NotNull Function2 function21) {
            return this.listener(new Listener() {
                @Override  // coil.request.ImageRequest$Listener
                public void onCancel(@NotNull ImageRequest imageRequest0) {
                    function20.invoke(imageRequest0);
                }

                @Override  // coil.request.ImageRequest$Listener
                public void onError(@NotNull ImageRequest imageRequest0, @NotNull ErrorResult errorResult0) {
                    function21.invoke(imageRequest0, errorResult0);
                }

                @Override  // coil.request.ImageRequest$Listener
                public void onStart(@NotNull ImageRequest imageRequest0) {
                    function11.invoke(imageRequest0);
                }

                @Override  // coil.request.ImageRequest$Listener
                public void onSuccess(@NotNull ImageRequest imageRequest0, @NotNull SuccessResult successResult0) {
                    this.d.invoke(imageRequest0, successResult0);
                }
            });
        }

        public static Builder listener$default(Builder imageRequest$Builder0, Function1 function10, Function1 function11, Function2 function20, Function2 function21, int v, Object object0) {
            if((v & 1) != 0) {
                function10 = coil.request.ImageRequest.Builder.listener.1.INSTANCE;
            }
            if((v & 2) != 0) {
                function11 = coil.request.ImageRequest.Builder.listener.2.INSTANCE;
            }
            if((v & 4) != 0) {
                function20 = coil.request.ImageRequest.Builder.listener.3.INSTANCE;
            }
            if((v & 8) != 0) {
                function21 = coil.request.ImageRequest.Builder.listener.4.INSTANCE;
            }
            return imageRequest$Builder0.listener(new coil.request.ImageRequest.Builder.listener.5(function10, function11, function20, function21));

            @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcoil/request/ImageRequest;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0xB0)
            @SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder$listener$1\n*L\n1#1,1057:1\n*E\n"})
            public final class coil.request.ImageRequest.Builder.listener.1 extends Lambda implements Function1 {
                public static final coil.request.ImageRequest.Builder.listener.1 INSTANCE;

                static {
                    coil.request.ImageRequest.Builder.listener.1.INSTANCE = new coil.request.ImageRequest.Builder.listener.1();
                }

                public coil.request.ImageRequest.Builder.listener.1() {
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull ImageRequest imageRequest0) {
                }
            }


            @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcoil/request/ImageRequest;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0xB0)
            @SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder$listener$2\n*L\n1#1,1057:1\n*E\n"})
            public final class coil.request.ImageRequest.Builder.listener.2 extends Lambda implements Function1 {
                public static final coil.request.ImageRequest.Builder.listener.2 INSTANCE;

                static {
                    coil.request.ImageRequest.Builder.listener.2.INSTANCE = new coil.request.ImageRequest.Builder.listener.2();
                }

                public coil.request.ImageRequest.Builder.listener.2() {
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull ImageRequest imageRequest0) {
                }
            }


            @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcoil/request/ImageRequest;", "<anonymous parameter 1>", "Lcoil/request/ErrorResult;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0xB0)
            @SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder$listener$3\n*L\n1#1,1057:1\n*E\n"})
            public final class coil.request.ImageRequest.Builder.listener.3 extends Lambda implements Function2 {
                public static final coil.request.ImageRequest.Builder.listener.3 INSTANCE;

                static {
                    coil.request.ImageRequest.Builder.listener.3.INSTANCE = new coil.request.ImageRequest.Builder.listener.3();
                }

                public coil.request.ImageRequest.Builder.listener.3() {
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull ImageRequest imageRequest0, @NotNull ErrorResult errorResult0) {
                }
            }


            @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcoil/request/ImageRequest;", "<anonymous parameter 1>", "Lcoil/request/SuccessResult;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0xB0)
            @SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder$listener$4\n*L\n1#1,1057:1\n*E\n"})
            public final class coil.request.ImageRequest.Builder.listener.4 extends Lambda implements Function2 {
                public static final coil.request.ImageRequest.Builder.listener.4 INSTANCE;

                static {
                    coil.request.ImageRequest.Builder.listener.4.INSTANCE = new coil.request.ImageRequest.Builder.listener.4();
                }

                public coil.request.ImageRequest.Builder.listener.4() {
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull ImageRequest imageRequest0, @NotNull SuccessResult successResult0) {
                }
            }

        }

        @NotNull
        public final Builder memoryCacheKey(@Nullable Key memoryCache$Key0) {
            this.f = memoryCache$Key0;
            return this;
        }

        @NotNull
        public final Builder memoryCacheKey(@Nullable String s) {
            return this.memoryCacheKey((s == null ? null : new Key(s, null, 2, null)));
        }

        @NotNull
        public final Builder memoryCachePolicy(@NotNull CachePolicy cachePolicy0) {
            this.u = cachePolicy0;
            return this;
        }

        @NotNull
        public final Builder networkCachePolicy(@NotNull CachePolicy cachePolicy0) {
            this.w = cachePolicy0;
            return this;
        }

        @NotNull
        public final Builder parameters(@NotNull Parameters parameters0) {
            this.B = parameters0.newBuilder();
            return this;
        }

        @NotNull
        public final Builder placeholder(@DrawableRes int v) {
            this.D = v;
            this.E = null;
            return this;
        }

        @NotNull
        public final Builder placeholder(@Nullable Drawable drawable0) {
            this.E = drawable0;
            this.D = 0;
            return this;
        }

        @NotNull
        public final Builder placeholderMemoryCacheKey(@Nullable Key memoryCache$Key0) {
            this.C = memoryCache$Key0;
            return this;
        }

        @NotNull
        public final Builder placeholderMemoryCacheKey(@Nullable String s) {
            return this.placeholderMemoryCacheKey((s == null ? null : new Key(s, null, 2, null)));
        }

        @NotNull
        public final Builder precision(@NotNull Precision precision0) {
            this.j = precision0;
            return this;
        }

        @NotNull
        public final Builder premultipliedAlpha(boolean z) {
            this.t = z;
            return this;
        }

        @NotNull
        public final Builder removeHeader(@NotNull String s) {
            okhttp3.Headers.Builder headers$Builder0 = this.o;
            if(headers$Builder0 != null) {
                headers$Builder0.removeAll(s);
            }
            return this;
        }

        @NotNull
        public final Builder removeParameter(@NotNull String s) {
            coil.request.Parameters.Builder parameters$Builder0 = this.B;
            if(parameters$Builder0 != null) {
                parameters$Builder0.remove(s);
            }
            return this;
        }

        @NotNull
        public final Builder scale(@NotNull Scale scale0) {
            this.L = scale0;
            return this;
        }

        @NotNull
        public final Builder setHeader(@NotNull String s, @NotNull String s1) {
            okhttp3.Headers.Builder headers$Builder0 = this.o;
            if(headers$Builder0 == null) {
                headers$Builder0 = new okhttp3.Headers.Builder();
                this.o = headers$Builder0;
            }
            headers$Builder0.set(s, s1);
            return this;
        }

        @JvmOverloads
        @NotNull
        public final Builder setParameter(@NotNull String s, @Nullable Object object0) {
            return Builder.setParameter$default(this, s, object0, null, 4, null);
        }

        @JvmOverloads
        @NotNull
        public final Builder setParameter(@NotNull String s, @Nullable Object object0, @Nullable String s1) {
            coil.request.Parameters.Builder parameters$Builder0 = this.B;
            if(parameters$Builder0 == null) {
                parameters$Builder0 = new coil.request.Parameters.Builder();
                this.B = parameters$Builder0;
            }
            parameters$Builder0.set(s, object0, s1);
            return this;
        }

        public static Builder setParameter$default(Builder imageRequest$Builder0, String s, Object object0, String s1, int v, Object object1) {
            if((v & 4) != 0) {
                if(object0 != null) {
                    return imageRequest$Builder0.setParameter(s, object0, object0.toString());
                }
                s1 = null;
            }
            return imageRequest$Builder0.setParameter(s, object0, s1);
        }

        @NotNull
        public final Builder size(@Px int v) {
            return this.size(v, v);
        }

        @NotNull
        public final Builder size(@Px int v, @Px int v1) {
            return this.size(-Sizes.Size(v, v1));
        }

        @NotNull
        public final Builder size(@NotNull Dimension dimension0, @NotNull Dimension dimension1) {
            return this.size(new Size(dimension0, dimension1));
        }

        @NotNull
        public final Builder size(@NotNull Size size0) {
            return this.size(SizeResolvers.create(size0));
        }

        @NotNull
        public final Builder size(@NotNull SizeResolver sizeResolver0) {
            this.K = sizeResolver0;
            this.M = null;
            this.N = null;
            this.O = null;
            return this;
        }

        @NotNull
        public final Builder tag(@NotNull Class class0, @Nullable Object object0) {
            if(object0 == null) {
                Map map0 = this.p;
                if(map0 != null) {
                    map0.remove(class0);
                    return this;
                }
            }
            else {
                Map map1 = this.p;
                if(map1 == null) {
                    map1 = new LinkedHashMap();
                    this.p = map1;
                }
                Object object1 = class0.cast(object0);
                Intrinsics.checkNotNull(object1);
                map1.put(class0, object1);
            }
            return this;
        }

        public final Builder tag(Object object0) {
            Intrinsics.reifiedOperationMarker(4, "T");
            return this.tag(Object.class, object0);
        }

        @NotNull
        public final Builder tags(@NotNull Tags tags0) {
            this.p = x.toMutableMap(tags0.asMap());
            return this;
        }

        @NotNull
        public final Builder target(@NotNull ImageView imageView0) {
            return this.target(new ImageViewTarget(imageView0));
        }

        @NotNull
        public final Builder target(@Nullable Target target0) {
            this.d = target0;
            this.M = null;
            this.N = null;
            this.O = null;
            return this;
        }

        @NotNull
        public final Builder target(@NotNull Function1 function10, @NotNull Function1 function11, @NotNull Function1 function12) {
            return this.target(new Target() {
                @Override  // coil.target.Target
                public void onError(@Nullable Drawable drawable0) {
                    function12.invoke(drawable0);
                }

                @Override  // coil.target.Target
                public void onStart(@Nullable Drawable drawable0) {
                    function11.invoke(drawable0);
                }

                @Override  // coil.target.Target
                public void onSuccess(@NotNull Drawable drawable0) {
                    this.c.invoke(drawable0);
                }
            });
        }

        public static Builder target$default(Builder imageRequest$Builder0, Function1 function10, Function1 function11, Function1 function12, int v, Object object0) {
            if((v & 1) != 0) {
                function10 = coil.request.ImageRequest.Builder.target.1.INSTANCE;
            }
            if((v & 2) != 0) {
                function11 = coil.request.ImageRequest.Builder.target.2.INSTANCE;
            }
            if((v & 4) != 0) {
                function12 = coil.request.ImageRequest.Builder.target.3.INSTANCE;
            }
            return imageRequest$Builder0.target(new coil.request.ImageRequest.Builder.target.4(function10, function11, function12));

            @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/drawable/Drawable;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0xB0)
            @SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder$target$1\n*L\n1#1,1057:1\n*E\n"})
            public final class coil.request.ImageRequest.Builder.target.1 extends Lambda implements Function1 {
                public static final coil.request.ImageRequest.Builder.target.1 INSTANCE;

                static {
                    coil.request.ImageRequest.Builder.target.1.INSTANCE = new coil.request.ImageRequest.Builder.target.1();
                }

                public coil.request.ImageRequest.Builder.target.1() {
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Drawable drawable0) {
                }
            }


            @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/drawable/Drawable;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0xB0)
            @SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder$target$2\n*L\n1#1,1057:1\n*E\n"})
            public final class coil.request.ImageRequest.Builder.target.2 extends Lambda implements Function1 {
                public static final coil.request.ImageRequest.Builder.target.2 INSTANCE;

                static {
                    coil.request.ImageRequest.Builder.target.2.INSTANCE = new coil.request.ImageRequest.Builder.target.2();
                }

                public coil.request.ImageRequest.Builder.target.2() {
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Drawable drawable0) {
                }
            }


            @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/drawable/Drawable;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0xB0)
            @SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder$target$3\n*L\n1#1,1057:1\n*E\n"})
            public final class coil.request.ImageRequest.Builder.target.3 extends Lambda implements Function1 {
                public static final coil.request.ImageRequest.Builder.target.3 INSTANCE;

                static {
                    coil.request.ImageRequest.Builder.target.3.INSTANCE = new coil.request.ImageRequest.Builder.target.3();
                }

                public coil.request.ImageRequest.Builder.target.3() {
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull Drawable drawable0) {
                }
            }

        }

        @NotNull
        public final Builder transformationDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher0) {
            this.A = coroutineDispatcher0;
            return this;
        }

        @NotNull
        public final Builder transformations(@NotNull List list0) {
            this.m = -Collections.toImmutableList(list0);
            return this;
        }

        @NotNull
        public final Builder transformations(@NotNull Transformation[] arr_transformation) {
            return this.transformations(ArraysKt___ArraysKt.toList(arr_transformation));
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to \'transitionFactory\'.", replaceWith = @ReplaceWith(expression = "transitionFactory { _, _ -> transition }", imports = {}))
        @NotNull
        public final Builder transition(@NotNull Transition transition0) {
            -Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @NotNull
        public final Builder transitionFactory(@NotNull coil.transition.Transition.Factory transition$Factory0) {
            this.n = transition$Factory0;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0017J\u0018\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\bH\u0017J\u0010\u0010\t\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0017J\u0018\u0010\n\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\u000BH\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcoil/request/ImageRequest$Listener;", "", "onCancel", "", "request", "Lcoil/request/ImageRequest;", "onError", "result", "Lcoil/request/ErrorResult;", "onStart", "onSuccess", "Lcoil/request/SuccessResult;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public interface Listener {
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
        public static final class DefaultImpls {
            @MainThread
            @java.lang.Deprecated
            public static void onCancel(@NotNull Listener imageRequest$Listener0, @NotNull ImageRequest imageRequest0) {
                imageRequest$Listener0.super.onCancel(imageRequest0);
            }

            @MainThread
            @java.lang.Deprecated
            public static void onError(@NotNull Listener imageRequest$Listener0, @NotNull ImageRequest imageRequest0, @NotNull ErrorResult errorResult0) {
                imageRequest$Listener0.super.onError(imageRequest0, errorResult0);
            }

            @MainThread
            @java.lang.Deprecated
            public static void onStart(@NotNull Listener imageRequest$Listener0, @NotNull ImageRequest imageRequest0) {
                imageRequest$Listener0.super.onStart(imageRequest0);
            }

            @MainThread
            @java.lang.Deprecated
            public static void onSuccess(@NotNull Listener imageRequest$Listener0, @NotNull ImageRequest imageRequest0, @NotNull SuccessResult successResult0) {
                imageRequest$Listener0.super.onSuccess(imageRequest0, successResult0);
            }
        }

        @MainThread
        default void onCancel(@NotNull ImageRequest imageRequest0) {
        }

        @MainThread
        default void onError(@NotNull ImageRequest imageRequest0, @NotNull ErrorResult errorResult0) {
        }

        @MainThread
        default void onStart(@NotNull ImageRequest imageRequest0) {
        }

        @MainThread
        default void onSuccess(@NotNull ImageRequest imageRequest0, @NotNull SuccessResult successResult0) {
        }
    }

    public final Lifecycle A;
    public final SizeResolver B;
    public final Scale C;
    public final Parameters D;
    public final Key E;
    public final Integer F;
    public final Drawable G;
    public final Integer H;
    public final Drawable I;
    public final Integer J;
    public final Drawable K;
    public final DefinedRequestOptions L;
    public final DefaultRequestOptions M;
    public final Context a;
    public final Object b;
    public final Target c;
    public final Listener d;
    public final Key e;
    public final String f;
    public final Bitmap.Config g;
    public final ColorSpace h;
    public final Precision i;
    public final Pair j;
    public final Factory k;
    public final List l;
    public final coil.transition.Transition.Factory m;
    public final Headers n;
    public final Tags o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final CachePolicy t;
    public final CachePolicy u;
    public final CachePolicy v;
    public final CoroutineDispatcher w;
    public final CoroutineDispatcher x;
    public final CoroutineDispatcher y;
    public final CoroutineDispatcher z;

    public ImageRequest(Context context0, Object object0, Target target0, Listener imageRequest$Listener0, Key memoryCache$Key0, String s, Bitmap.Config bitmap$Config0, ColorSpace colorSpace0, Precision precision0, Pair pair0, Factory decoder$Factory0, List list0, coil.transition.Transition.Factory transition$Factory0, Headers headers0, Tags tags0, boolean z, boolean z1, boolean z2, boolean z3, CachePolicy cachePolicy0, CachePolicy cachePolicy1, CachePolicy cachePolicy2, CoroutineDispatcher coroutineDispatcher0, CoroutineDispatcher coroutineDispatcher1, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, Lifecycle lifecycle0, SizeResolver sizeResolver0, Scale scale0, Parameters parameters0, Key memoryCache$Key1, Integer integer0, Drawable drawable0, Integer integer1, Drawable drawable1, Integer integer2, Drawable drawable2, DefinedRequestOptions definedRequestOptions0, DefaultRequestOptions defaultRequestOptions0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = context0;
        this.b = object0;
        this.c = target0;
        this.d = imageRequest$Listener0;
        this.e = memoryCache$Key0;
        this.f = s;
        this.g = bitmap$Config0;
        this.h = colorSpace0;
        this.i = precision0;
        this.j = pair0;
        this.k = decoder$Factory0;
        this.l = list0;
        this.m = transition$Factory0;
        this.n = headers0;
        this.o = tags0;
        this.p = z;
        this.q = z1;
        this.r = z2;
        this.s = z3;
        this.t = cachePolicy0;
        this.u = cachePolicy1;
        this.v = cachePolicy2;
        this.w = coroutineDispatcher0;
        this.x = coroutineDispatcher1;
        this.y = coroutineDispatcher2;
        this.z = coroutineDispatcher3;
        this.A = lifecycle0;
        this.B = sizeResolver0;
        this.C = scale0;
        this.D = parameters0;
        this.E = memoryCache$Key1;
        this.F = integer0;
        this.G = drawable0;
        this.H = integer1;
        this.I = drawable1;
        this.J = integer2;
        this.K = drawable2;
        this.L = definedRequestOptions0;
        this.M = defaultRequestOptions0;
    }

    // 去混淆评级： 中等(50)
    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 instanceof ImageRequest) {
            ImageRequest imageRequest0 = (ImageRequest)object0;
            return Intrinsics.areEqual(this.a, imageRequest0.a) && Intrinsics.areEqual(this.b, imageRequest0.b) && Intrinsics.areEqual(this.c, imageRequest0.c) && Intrinsics.areEqual(this.d, imageRequest0.d) && Intrinsics.areEqual(this.e, imageRequest0.e) && Intrinsics.areEqual(this.f, imageRequest0.f) && this.g == imageRequest0.g && Intrinsics.areEqual(this.h, imageRequest0.h) && this.i == imageRequest0.i && Intrinsics.areEqual(this.j, imageRequest0.j) && Intrinsics.areEqual(this.k, imageRequest0.k) && Intrinsics.areEqual(this.l, imageRequest0.l) && Intrinsics.areEqual(this.m, imageRequest0.m) && Intrinsics.areEqual(this.n, imageRequest0.n) && Intrinsics.areEqual(this.o, imageRequest0.o) && this.p == imageRequest0.p && this.q == imageRequest0.q && this.r == imageRequest0.r && this.s == imageRequest0.s && this.t == imageRequest0.t && this.u == imageRequest0.u && this.v == imageRequest0.v && Intrinsics.areEqual(this.w, imageRequest0.w) && Intrinsics.areEqual(this.x, imageRequest0.x) && Intrinsics.areEqual(this.y, imageRequest0.y) && Intrinsics.areEqual(this.z, imageRequest0.z) && Intrinsics.areEqual(this.E, imageRequest0.E) && Intrinsics.areEqual(this.F, imageRequest0.F) && Intrinsics.areEqual(this.G, imageRequest0.G) && Intrinsics.areEqual(this.H, imageRequest0.H) && Intrinsics.areEqual(this.I, imageRequest0.I) && Intrinsics.areEqual(this.J, imageRequest0.J) && Intrinsics.areEqual(this.K, imageRequest0.K) && Intrinsics.areEqual(this.A, imageRequest0.A) && Intrinsics.areEqual(this.B, imageRequest0.B) && this.C == imageRequest0.C && Intrinsics.areEqual(this.D, imageRequest0.D) && Intrinsics.areEqual(this.L, imageRequest0.L) && Intrinsics.areEqual(this.M, imageRequest0.M);
        }
        return false;
    }

    public final boolean getAllowConversionToBitmap() {
        return this.p;
    }

    public final boolean getAllowHardware() {
        return this.q;
    }

    public final boolean getAllowRgb565() {
        return this.r;
    }

    @NotNull
    public final Bitmap.Config getBitmapConfig() {
        return this.g;
    }

    @Nullable
    public final ColorSpace getColorSpace() {
        return this.h;
    }

    @NotNull
    public final Context getContext() {
        return this.a;
    }

    @NotNull
    public final Object getData() {
        return this.b;
    }

    @NotNull
    public final CoroutineDispatcher getDecoderDispatcher() {
        return this.y;
    }

    @Nullable
    public final Factory getDecoderFactory() {
        return this.k;
    }

    @NotNull
    public final DefaultRequestOptions getDefaults() {
        return this.M;
    }

    @NotNull
    public final DefinedRequestOptions getDefined() {
        return this.L;
    }

    @Nullable
    public final String getDiskCacheKey() {
        return this.f;
    }

    @NotNull
    public final CachePolicy getDiskCachePolicy() {
        return this.u;
    }

    @Nullable
    public final Drawable getError() {
        Drawable drawable0 = this.M.getError();
        return -Requests.getDrawableCompat(this, this.I, this.H, drawable0);
    }

    @Nullable
    public final Drawable getFallback() {
        Drawable drawable0 = this.M.getFallback();
        return -Requests.getDrawableCompat(this, this.K, this.J, drawable0);
    }

    @NotNull
    public final CoroutineDispatcher getFetcherDispatcher() {
        return this.x;
    }

    @Nullable
    public final Pair getFetcherFactory() {
        return this.j;
    }

    @NotNull
    public final Headers getHeaders() {
        return this.n;
    }

    @NotNull
    public final CoroutineDispatcher getInterceptorDispatcher() {
        return this.w;
    }

    @NotNull
    public final Lifecycle getLifecycle() {
        return this.A;
    }

    @Nullable
    public final Listener getListener() {
        return this.d;
    }

    @Nullable
    public final Key getMemoryCacheKey() {
        return this.e;
    }

    @NotNull
    public final CachePolicy getMemoryCachePolicy() {
        return this.t;
    }

    @NotNull
    public final CachePolicy getNetworkCachePolicy() {
        return this.v;
    }

    @NotNull
    public final Parameters getParameters() {
        return this.D;
    }

    @Nullable
    public final Drawable getPlaceholder() {
        Drawable drawable0 = this.M.getPlaceholder();
        return -Requests.getDrawableCompat(this, this.G, this.F, drawable0);
    }

    @Nullable
    public final Key getPlaceholderMemoryCacheKey() {
        return this.E;
    }

    @NotNull
    public final Precision getPrecision() {
        return this.i;
    }

    public final boolean getPremultipliedAlpha() {
        return this.s;
    }

    @NotNull
    public final Scale getScale() {
        return this.C;
    }

    @NotNull
    public final SizeResolver getSizeResolver() {
        return this.B;
    }

    @NotNull
    public final Tags getTags() {
        return this.o;
    }

    @Nullable
    public final Target getTarget() {
        return this.c;
    }

    @NotNull
    public final CoroutineDispatcher getTransformationDispatcher() {
        return this.z;
    }

    @NotNull
    public final List getTransformations() {
        return this.l;
    }

    @NotNull
    public final coil.transition.Transition.Factory getTransitionFactory() {
        return this.m;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = a.e(a.e(a.e(a.e((this.o.hashCode() + (this.n.hashCode() + (this.m.hashCode() + b.c(this.l, (((this.i.hashCode() + ((this.g.hashCode() + (((((this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F + (this.e == null ? 0 : this.e.hashCode())) * 0x1F + (this.f == null ? 0 : this.f.hashCode())) * 0x1F) * 0x1F + (this.h == null ? 0 : this.h.hashCode())) * 0x1F) * 0x1F + (this.j == null ? 0 : this.j.hashCode())) * 0x1F + (this.k == null ? 0 : this.k.hashCode())) * 0x1F, 0x1F)) * 0x1F) * 0x1F) * 0x1F, 0x1F, this.p), 0x1F, this.q), 0x1F, this.r), 0x1F, this.s);
        int v2 = this.t.hashCode();
        int v3 = this.u.hashCode();
        int v4 = this.v.hashCode();
        int v5 = this.w.hashCode();
        int v6 = this.x.hashCode();
        int v7 = this.y.hashCode();
        int v8 = this.z.hashCode();
        int v9 = this.A.hashCode();
        int v10 = this.B.hashCode();
        int v11 = this.C.hashCode();
        int v12 = this.D.hashCode();
        int v13 = this.E == null ? 0 : this.E.hashCode();
        int v14 = this.F == null ? 0 : this.F.hashCode();
        int v15 = this.G == null ? 0 : this.G.hashCode();
        int v16 = this.H == null ? 0 : this.H.hashCode();
        int v17 = this.I == null ? 0 : this.I.hashCode();
        int v18 = this.J == null ? 0 : this.J.hashCode();
        Drawable drawable0 = this.K;
        if(drawable0 != null) {
            v = drawable0.hashCode();
        }
        return this.M.hashCode() + (this.L.hashCode() + ((((((((v12 + (v11 + (v10 + (v9 + (v8 + (v7 + (v6 + (v5 + (v4 + (v3 + (v2 + v1) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F + v13) * 0x1F + v14) * 0x1F + v15) * 0x1F + v16) * 0x1F + v17) * 0x1F + v18) * 0x1F + v) * 0x1F) * 0x1F;
    }

    @JvmOverloads
    @NotNull
    public final Builder newBuilder() {
        return ImageRequest.newBuilder$default(this, null, 1, null);
    }

    @JvmOverloads
    @NotNull
    public final Builder newBuilder(@NotNull Context context0) {
        return new Builder(this, context0);
    }

    public static Builder newBuilder$default(ImageRequest imageRequest0, Context context0, int v, Object object0) {
        if((v & 1) != 0) {
            context0 = imageRequest0.a;
        }
        return imageRequest0.newBuilder(context0);
    }
}

