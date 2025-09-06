package coil.memory;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import coil.EventListener;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.decode.DecodeUtils;
import coil.intercept.EngineInterceptor.ExecuteResult;
import coil.intercept.Interceptor.Chain;
import coil.request.ImageRequest;
import coil.request.Options;
import coil.request.RequestService;
import coil.request.SuccessResult;
import coil.size.-Sizes;
import coil.size.Dimension.Pixels;
import coil.size.Dimension;
import coil.size.Scale;
import coil.size.Size;
import coil.transform.Transformation;
import coil.util.-Bitmaps;
import coil.util.-Requests;
import coil.util.-Utils;
import coil.util.Logger;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B!\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0012\u001A\u0004\u0018\u00010\u00112\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\u00012\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000F¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001A\u001A\u0004\u0018\u00010\u00192\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0014\u001A\u00020\u00112\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0018\u001A\u00020\u0017¢\u0006\u0004\b\u001A\u0010\u001BJ7\u0010 \u001A\u00020\u001D2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0014\u001A\u00020\u00112\u0006\u0010\u001C\u001A\u00020\u00192\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0018\u001A\u00020\u0017H\u0001¢\u0006\u0004\b\u001E\u0010\u001FJ\'\u0010#\u001A\u00020\u001D2\b\u0010\u0014\u001A\u0004\u0018\u00010\u00112\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\"\u001A\u00020!¢\u0006\u0004\b#\u0010$J-\u0010(\u001A\u00020\'2\u0006\u0010&\u001A\u00020%2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0014\u001A\u00020\u00112\u0006\u0010\u001C\u001A\u00020\u0019¢\u0006\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcoil/memory/MemoryCacheService;", "", "Lcoil/ImageLoader;", "imageLoader", "Lcoil/request/RequestService;", "requestService", "Lcoil/util/Logger;", "logger", "<init>", "(Lcoil/ImageLoader;Lcoil/request/RequestService;Lcoil/util/Logger;)V", "Lcoil/request/ImageRequest;", "request", "mappedData", "Lcoil/request/Options;", "options", "Lcoil/EventListener;", "eventListener", "Lcoil/memory/MemoryCache$Key;", "newCacheKey", "(Lcoil/request/ImageRequest;Ljava/lang/Object;Lcoil/request/Options;Lcoil/EventListener;)Lcoil/memory/MemoryCache$Key;", "cacheKey", "Lcoil/size/Size;", "size", "Lcoil/size/Scale;", "scale", "Lcoil/memory/MemoryCache$Value;", "getCacheValue", "(Lcoil/request/ImageRequest;Lcoil/memory/MemoryCache$Key;Lcoil/size/Size;Lcoil/size/Scale;)Lcoil/memory/MemoryCache$Value;", "cacheValue", "", "isCacheValueValid$coil_base_release", "(Lcoil/request/ImageRequest;Lcoil/memory/MemoryCache$Key;Lcoil/memory/MemoryCache$Value;Lcoil/size/Size;Lcoil/size/Scale;)Z", "isCacheValueValid", "Lcoil/intercept/EngineInterceptor$ExecuteResult;", "result", "setCacheValue", "(Lcoil/memory/MemoryCache$Key;Lcoil/request/ImageRequest;Lcoil/intercept/EngineInterceptor$ExecuteResult;)Z", "Lcoil/intercept/Interceptor$Chain;", "chain", "Lcoil/request/SuccessResult;", "newResult", "(Lcoil/intercept/Interceptor$Chain;Lcoil/request/ImageRequest;Lcoil/memory/MemoryCache$Key;Lcoil/memory/MemoryCache$Value;)Lcoil/request/SuccessResult;", "Companion", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMemoryCacheService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoryCacheService.kt\ncoil/memory/MemoryCacheService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Collections.kt\ncoil/util/-Collections\n+ 4 Logs.kt\ncoil/util/-Logs\n+ 5 Dimension.kt\ncoil/size/-Dimensions\n+ 6 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 7 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,236:1\n1#2:237\n22#3,4:238\n21#4,4:242\n21#4,4:246\n21#4,4:252\n21#4,4:256\n57#5:250\n57#5:251\n50#6:260\n28#7:261\n*S KotlinDebug\n*F\n+ 1 MemoryCacheService.kt\ncoil/memory/MemoryCacheService\n*L\n62#1:238,4\n93#1:242,4\n116#1:246,4\n166#1:252,4\n176#1:256,4\n137#1:250\n138#1:251\n213#1:260\n213#1:261\n*E\n"})
public final class MemoryCacheService {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006R\u001A\u0010\u0007\u001A\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u0012\u0004\b\b\u0010\u0006R\u001A\u0010\t\u001A\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\t\u0010\u0004\u0012\u0004\b\n\u0010\u0006R\u001A\u0010\u000B\u001A\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u0012\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u000E"}, d2 = {"Lcoil/memory/MemoryCacheService$Companion;", "", "", "EXTRA_TRANSFORMATION_INDEX", "Ljava/lang/String;", "getEXTRA_TRANSFORMATION_INDEX$coil_base_release$annotations", "()V", "EXTRA_TRANSFORMATION_SIZE", "getEXTRA_TRANSFORMATION_SIZE$coil_base_release$annotations", "EXTRA_IS_SAMPLED", "getEXTRA_IS_SAMPLED$coil_base_release$annotations", "EXTRA_DISK_CACHE_KEY", "getEXTRA_DISK_CACHE_KEY$coil_base_release$annotations", "TAG", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @VisibleForTesting
        public static void getEXTRA_DISK_CACHE_KEY$coil_base_release$annotations() {
        }

        @VisibleForTesting
        public static void getEXTRA_IS_SAMPLED$coil_base_release$annotations() {
        }

        @VisibleForTesting
        public static void getEXTRA_TRANSFORMATION_INDEX$coil_base_release$annotations() {
        }

        @VisibleForTesting
        public static void getEXTRA_TRANSFORMATION_SIZE$coil_base_release$annotations() {
        }
    }

    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String EXTRA_DISK_CACHE_KEY = "coil#disk_cache_key";
    @NotNull
    public static final String EXTRA_IS_SAMPLED = "coil#is_sampled";
    @NotNull
    public static final String EXTRA_TRANSFORMATION_INDEX = "coil#transformation_";
    @NotNull
    public static final String EXTRA_TRANSFORMATION_SIZE = "coil#transformation_size";
    public final ImageLoader a;
    public final RequestService b;
    public final Logger c;

    static {
        MemoryCacheService.Companion = new Companion(null);
    }

    public MemoryCacheService(@NotNull ImageLoader imageLoader0, @NotNull RequestService requestService0, @Nullable Logger logger0) {
        this.a = imageLoader0;
        this.b = requestService0;
        this.c = logger0;
    }

    @Nullable
    public final Value getCacheValue(@NotNull ImageRequest imageRequest0, @NotNull Key memoryCache$Key0, @NotNull Size size0, @NotNull Scale scale0) {
        if(!imageRequest0.getMemoryCachePolicy().getReadEnabled()) {
            return null;
        }
        MemoryCache memoryCache0 = this.a.getMemoryCache();
        Value memoryCache$Value0 = memoryCache0 == null ? null : memoryCache0.get(memoryCache$Key0);
        return memoryCache$Value0 == null || !this.isCacheValueValid$coil_base_release(imageRequest0, memoryCache$Key0, memoryCache$Value0, size0, scale0) ? null : memoryCache$Value0;
    }

    @VisibleForTesting
    public final boolean isCacheValueValid$coil_base_release(@NotNull ImageRequest imageRequest0, @NotNull Key memoryCache$Key0, @NotNull Value memoryCache$Value0, @NotNull Size size0, @NotNull Scale scale0) {
        int v4;
        Bitmap.Config bitmap$Config0 = -Bitmaps.getSafeConfig(memoryCache$Value0.getBitmap());
        boolean z = this.b.isConfigValidForHardware(imageRequest0, bitmap$Config0);
        Logger logger0 = this.c;
        if(!z) {
            if(logger0 != null && logger0.getLevel() <= 3) {
                logger0.log("MemoryCacheService", 3, imageRequest0.getData() + ": Cached bitmap is hardware-backed, which is incompatible with the request.", null);
            }
            return false;
        }
        Object object0 = memoryCache$Value0.getExtras().get("coil#is_sampled");
        Boolean boolean0 = object0 instanceof Boolean ? ((Boolean)object0) : null;
        boolean z1 = boolean0 == null ? false : boolean0.booleanValue();
        if(-Sizes.isOriginal(size0)) {
            if(!z1) {
                return true;
            }
            if(logger0 != null && logger0.getLevel() <= 3) {
                logger0.log("MemoryCacheService", 3, imageRequest0.getData() + ": Requested original size, but cached image is sampled.", null);
                return false;
            }
            return false;
        }
        String s = (String)memoryCache$Key0.getExtras().get("coil#transformation_size");
        if(s != null) {
            return Intrinsics.areEqual(s, size0.toString());
        }
        int v = memoryCache$Value0.getBitmap().getWidth();
        int v1 = memoryCache$Value0.getBitmap().getHeight();
        Dimension dimension0 = size0.getWidth();
        int v2 = 0x7FFFFFFF;
        int v3 = dimension0 instanceof Pixels ? ((Pixels)dimension0).px : 0x7FFFFFFF;
        Dimension dimension1 = size0.getHeight();
        if(dimension1 instanceof Pixels) {
            v2 = ((Pixels)dimension1).px;
        }
        double f = DecodeUtils.computeSizeMultiplier(v, v1, v3, v2, scale0);
        boolean z2 = -Requests.getAllowInexactSize(imageRequest0);
        if(z2) {
            double f1 = c.coerceAtMost(f, 1.0);
            if(Math.abs(((double)v3) - ((double)v) * f1) > 1.0) {
                v4 = v1;
                if(Math.abs(((double)v2) - f1 * ((double)v4)) <= 1.0) {
                    return true;
                }
                goto label_37;
            }
            return true;
        }
        else {
            v4 = v1;
            if(!-Utils.isMinOrMax(v3) && Math.abs(v3 - v) > 1 || !-Utils.isMinOrMax(v2) && Math.abs(v2 - v4) > 1) {
            label_37:
                if(Double.compare(f, 1.0) != 0 && !z2) {
                    if(logger0 == null || logger0.getLevel() > 3) {
                        return false;
                    }
                    logger0.log("MemoryCacheService", 3, imageRequest0.getData() + ": Cached image\'s request size (" + v + ", " + v4 + ") does not exactly match the requested size (" + size0.getWidth() + ", " + size0.getHeight() + ", " + scale0 + ").", null);
                    return false;
                }
                if(f > 1.0 && z1) {
                    if(logger0 != null && logger0.getLevel() <= 3) {
                        logger0.log("MemoryCacheService", 3, imageRequest0.getData() + ": Cached image\'s request size (" + v + ", " + v4 + ") is smaller than the requested size (" + size0.getWidth() + ", " + size0.getHeight() + ", " + scale0 + ").", null);
                        return false;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Nullable
    public final Key newCacheKey(@NotNull ImageRequest imageRequest0, @NotNull Object object0, @NotNull Options options0, @NotNull EventListener eventListener0) {
        Key memoryCache$Key0 = imageRequest0.getMemoryCacheKey();
        if(memoryCache$Key0 != null) {
            return memoryCache$Key0;
        }
        String s = this.a.getComponents().key(object0, options0);
        if(s == null) {
            return null;
        }
        List list0 = imageRequest0.getTransformations();
        Map map0 = imageRequest0.getParameters().memoryCacheKeys();
        if(list0.isEmpty() && map0.isEmpty()) {
            return new Key(s, null, 2, null);
        }
        Map map1 = x.toMutableMap(map0);
        if(!list0.isEmpty()) {
            List list1 = imageRequest0.getTransformations();
            int v = list1.size();
            for(int v1 = 0; v1 < v; ++v1) {
                map1.put("coil#transformation_" + v1, ((Transformation)list1.get(v1)).getCacheKey());
            }
            map1.put("coil#transformation_size", options0.getSize().toString());
        }
        return new Key(s, map1);
    }

    @NotNull
    public final SuccessResult newResult(@NotNull Chain interceptor$Chain0, @NotNull ImageRequest imageRequest0, @NotNull Key memoryCache$Key0, @NotNull Value memoryCache$Value0) {
        BitmapDrawable bitmapDrawable0 = new BitmapDrawable(imageRequest0.getContext().getResources(), memoryCache$Value0.getBitmap());
        DataSource dataSource0 = DataSource.MEMORY_CACHE;
        Object object0 = memoryCache$Value0.getExtras().get("coil#disk_cache_key");
        Boolean boolean0 = null;
        String s = object0 instanceof String ? ((String)object0) : null;
        Object object1 = memoryCache$Value0.getExtras().get("coil#is_sampled");
        if(object1 instanceof Boolean) {
            boolean0 = (Boolean)object1;
        }
        return boolean0 == null ? new SuccessResult(bitmapDrawable0, imageRequest0, dataSource0, memoryCache$Key0, s, false, -Utils.isPlaceholderCached(interceptor$Chain0)) : new SuccessResult(bitmapDrawable0, imageRequest0, dataSource0, memoryCache$Key0, s, boolean0.booleanValue(), -Utils.isPlaceholderCached(interceptor$Chain0));
    }

    public final boolean setCacheValue(@Nullable Key memoryCache$Key0, @NotNull ImageRequest imageRequest0, @NotNull ExecuteResult engineInterceptor$ExecuteResult0) {
        if(!imageRequest0.getMemoryCachePolicy().getWriteEnabled()) {
            return false;
        }
        MemoryCache memoryCache0 = this.a.getMemoryCache();
        if(memoryCache0 != null && memoryCache$Key0 != null) {
            Drawable drawable0 = engineInterceptor$ExecuteResult0.getDrawable();
            BitmapDrawable bitmapDrawable0 = drawable0 instanceof BitmapDrawable ? ((BitmapDrawable)drawable0) : null;
            if(bitmapDrawable0 != null) {
                Bitmap bitmap0 = bitmapDrawable0.getBitmap();
                if(bitmap0 != null) {
                    LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                    linkedHashMap0.put("coil#is_sampled", Boolean.valueOf(engineInterceptor$ExecuteResult0.isSampled()));
                    String s = engineInterceptor$ExecuteResult0.getDiskCacheKey();
                    if(s != null) {
                        linkedHashMap0.put("coil#disk_cache_key", s);
                    }
                    memoryCache0.set(memoryCache$Key0, new Value(bitmap0, linkedHashMap0));
                    return true;
                }
            }
        }
        return false;
    }
}

