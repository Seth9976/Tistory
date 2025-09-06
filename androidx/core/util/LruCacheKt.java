package androidx.core.util;

import android.util.LruCache;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u001Aø\u0001\u0010\u0000\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u000628\b\u0006\u0010\u0007\u001A2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000B\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00060\b2%\b\u0006\u0010\r\u001A\u001F\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000B\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u000E2d\b\u0006\u0010\u000F\u001A^\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000B\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u0001H\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0010H\u0086\b¨\u0006\u0016"}, d2 = {"lruCache", "Landroid/util/LruCache;", "K", "V", "", "maxSize", "", "sizeOf", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "key", "value", "create", "Lkotlin/Function1;", "onEntryRemoved", "Lkotlin/Function4;", "", "evicted", "oldValue", "newValue", "", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LruCacheKt {
    @NotNull
    public static final LruCache lruCache(int v, @NotNull Function2 function20, @NotNull Function1 function10, @NotNull Function4 function40) {
        return new LruCache(v) {
            @Override  // android.util.LruCache
            @Nullable
            public Object create(@NotNull Object object0) {
                return function10.invoke(object0);
            }

            @Override  // android.util.LruCache
            public void entryRemoved(boolean z, @NotNull Object object0, @NotNull Object object1, @Nullable Object object2) {
                function40.invoke(Boolean.valueOf(z), object0, object1, object2);
            }

            @Override  // android.util.LruCache
            public int sizeOf(@NotNull Object object0, @NotNull Object object1) {
                return ((Number)function20.invoke(object0, object1)).intValue();
            }
        };
    }

    public static LruCache lruCache$default(int v, Function2 function20, Function1 function10, Function4 function40, int v1, Object object0) {
        if((v1 & 2) != 0) {
            function20 = androidx.core.util.LruCacheKt.lruCache.1.INSTANCE;
        }
        if((v1 & 4) != 0) {
            function10 = androidx.core.util.LruCacheKt.lruCache.2.INSTANCE;
        }
        if((v1 & 8) != 0) {
            function40 = androidx.core.util.LruCacheKt.lruCache.3.INSTANCE;
        }
        return new androidx.core.util.LruCacheKt.lruCache.4(v, function20, function10, function40);

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001A\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001A\u0002H\u00022\u0006\u0010\u0006\u001A\u0002H\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "K", "", "V", "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/core/util/LruCacheKt$lruCache$1\n*L\n1#1,54:1\n*E\n"})
        public final class androidx.core.util.LruCacheKt.lruCache.1 extends Lambda implements Function2 {
            public static final androidx.core.util.LruCacheKt.lruCache.1 INSTANCE;

            static {
                androidx.core.util.LruCacheKt.lruCache.1.INSTANCE = new androidx.core.util.LruCacheKt.lruCache.1();
            }

            public androidx.core.util.LruCacheKt.lruCache.1() {
                super(2);
            }

            @NotNull
            public final Integer invoke(@NotNull Object object0, @NotNull Object object1) {
                return 1;
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(object0, object1);
            }
        }


        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001A\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u00032\u0006\u0010\u0004\u001A\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "V", "K", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/core/util/LruCacheKt$lruCache$2\n*L\n1#1,54:1\n*E\n"})
        public final class androidx.core.util.LruCacheKt.lruCache.2 extends Lambda implements Function1 {
            public static final androidx.core.util.LruCacheKt.lruCache.2 INSTANCE;

            static {
                androidx.core.util.LruCacheKt.lruCache.2.INSTANCE = new androidx.core.util.LruCacheKt.lruCache.2();
            }

            public androidx.core.util.LruCacheKt.lruCache.2() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@NotNull Object object0) {
                return null;
            }
        }


        @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\u0010\u0000\u001A\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u0002H\u00022\u0006\u0010\b\u001A\u0002H\u00042\b\u0010\t\u001A\u0004\u0018\u0001H\u0004H\n¢\u0006\u0004\b\n\u0010\u000B"}, d2 = {"<anonymous>", "", "K", "", "V", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "invoke", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/core/util/LruCacheKt$lruCache$3\n*L\n1#1,54:1\n*E\n"})
        public final class androidx.core.util.LruCacheKt.lruCache.3 extends Lambda implements Function4 {
            public static final androidx.core.util.LruCacheKt.lruCache.3 INSTANCE;

            static {
                androidx.core.util.LruCacheKt.lruCache.3.INSTANCE = new androidx.core.util.LruCacheKt.lruCache.3();
            }

            public androidx.core.util.LruCacheKt.lruCache.3() {
                super(4);
            }

            @Override  // kotlin.jvm.functions.Function4
            public Object invoke(Object object0, Object object1, Object object2, Object object3) {
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z, @NotNull Object object0, @NotNull Object object1, @Nullable Object object2) {
            }
        }

    }
}

