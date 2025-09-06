package coil.memory;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0006\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0002,-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\t2\u0012\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000B2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u0019\u001A\u00020\u00112\u0006\u0010\u0018\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001C\u001A\u00020\u0011H\u0001¢\u0006\u0004\b\u001B\u0010\u0003R\\\u0010\'\u001A>\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001F0\u001Ej\b\u0012\u0004\u0012\u00020\u001F` 0\u001Dj\u001E\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001F0\u001Ej\b\u0012\u0004\u0012\u00020\u001F` `!8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010\u0003\u001A\u0004\b$\u0010%R\u001A\u0010+\u001A\b\u0012\u0004\u0012\u00020\u00040(8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcoil/memory/RealWeakMemoryCache;", "Lcoil/memory/WeakMemoryCache;", "<init>", "()V", "Lcoil/memory/MemoryCache$Key;", "key", "Lcoil/memory/MemoryCache$Value;", "get", "(Lcoil/memory/MemoryCache$Key;)Lcoil/memory/MemoryCache$Value;", "Landroid/graphics/Bitmap;", "bitmap", "", "", "", "extras", "", "size", "", "set", "(Lcoil/memory/MemoryCache$Key;Landroid/graphics/Bitmap;Ljava/util/Map;I)V", "", "remove", "(Lcoil/memory/MemoryCache$Key;)Z", "clearMemory", "level", "trimMemory", "(I)V", "cleanUp$coil_base_release", "cleanUp", "Ljava/util/LinkedHashMap;", "Ljava/util/ArrayList;", "Lcoil/memory/RealWeakMemoryCache$InternalValue;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/LinkedHashMap;", "a", "Ljava/util/LinkedHashMap;", "getCache$coil_base_release", "()Ljava/util/LinkedHashMap;", "getCache$coil_base_release$annotations", "cache", "", "getKeys", "()Ljava/util/Set;", "keys", "Companion", "InternalValue", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWeakMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeakMemoryCache.kt\ncoil/memory/RealWeakMemoryCache\n+ 2 Collections.kt\ncoil/util/-Collections\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Utils.kt\ncoil/util/-Utils\n*L\n1#1,158:1\n44#2,2:159\n47#2:163\n55#2,9:172\n1#3:161\n1#3:162\n372#4,7:164\n162#5:171\n*S KotlinDebug\n*F\n+ 1 WeakMemoryCache.kt\ncoil/memory/RealWeakMemoryCache\n*L\n63#1:159,2\n63#1:163\n137#1:172,9\n63#1:162\n73#1:164,7\n77#1:171\n*E\n"})
public final class RealWeakMemoryCache implements WeakMemoryCache {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil/memory/RealWeakMemoryCache$Companion;", "", "", "CLEAN_UP_INTERVAL", "I", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @VisibleForTesting
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0006\u0010\n\u001A\u00020\u0002¢\u0006\u0004\b\u000B\u0010\fR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010R\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R#\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u0017\u0010\n\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000E\u001A\u0004\b\u001A\u0010\u0010¨\u0006\u001B"}, d2 = {"Lcoil/memory/RealWeakMemoryCache$InternalValue;", "", "", "identityHashCode", "Ljava/lang/ref/WeakReference;", "Landroid/graphics/Bitmap;", "bitmap", "", "", "extras", "size", "<init>", "(ILjava/lang/ref/WeakReference;Ljava/util/Map;I)V", "a", "I", "getIdentityHashCode", "()I", "b", "Ljava/lang/ref/WeakReference;", "getBitmap", "()Ljava/lang/ref/WeakReference;", "c", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "d", "getSize", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class InternalValue {
        public final int a;
        public final WeakReference b;
        public final Map c;
        public final int d;

        public InternalValue(int v, @NotNull WeakReference weakReference0, @NotNull Map map0, int v1) {
            this.a = v;
            this.b = weakReference0;
            this.c = map0;
            this.d = v1;
        }

        @NotNull
        public final WeakReference getBitmap() {
            return this.b;
        }

        @NotNull
        public final Map getExtras() {
            return this.c;
        }

        public final int getIdentityHashCode() {
            return this.a;
        }

        public final int getSize() {
            return this.d;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final LinkedHashMap a;
    public int b;

    static {
        RealWeakMemoryCache.Companion = new Companion(null);
    }

    public RealWeakMemoryCache() {
        this.a = new LinkedHashMap();
    }

    @VisibleForTesting
    public final void cleanUp$coil_base_release() {
        Bitmap bitmap0;
        this.b = 0;
        Iterator iterator0 = this.a.values().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            ArrayList arrayList0 = (ArrayList)object0;
            if(arrayList0.size() <= 1) {
                InternalValue realWeakMemoryCache$InternalValue0 = (InternalValue)CollectionsKt___CollectionsKt.firstOrNull(arrayList0);
                if(realWeakMemoryCache$InternalValue0 == null) {
                    bitmap0 = null;
                }
                else {
                    WeakReference weakReference0 = realWeakMemoryCache$InternalValue0.getBitmap();
                    if(weakReference0 != null) {
                        bitmap0 = (Bitmap)weakReference0.get();
                    }
                }
                if(bitmap0 != null) {
                    continue;
                }
                iterator0.remove();
            }
            else {
                int v = arrayList0.size();
                int v2 = 0;
                for(int v1 = 0; v1 < v; ++v1) {
                    int v3 = v1 - v2;
                    if(((InternalValue)arrayList0.get(v3)).getBitmap().get() == null) {
                        arrayList0.remove(v3);
                        ++v2;
                    }
                }
                if(arrayList0.isEmpty()) {
                    iterator0.remove();
                }
            }
        }
    }

    @Override  // coil.memory.WeakMemoryCache
    public void clearMemory() {
        synchronized(this) {
            this.b = 0;
            this.a.clear();
        }
    }

    @Override  // coil.memory.WeakMemoryCache
    @Nullable
    public Value get(@NotNull Key memoryCache$Key0) {
        synchronized(this) {
            Value memoryCache$Value0 = null;
            ArrayList arrayList0 = (ArrayList)this.a.get(memoryCache$Key0);
            if(arrayList0 == null) {
                return null;
            }
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                InternalValue realWeakMemoryCache$InternalValue0 = (InternalValue)arrayList0.get(v2);
                Bitmap bitmap0 = (Bitmap)realWeakMemoryCache$InternalValue0.getBitmap().get();
                Value memoryCache$Value1 = bitmap0 == null ? null : new Value(bitmap0, realWeakMemoryCache$InternalValue0.getExtras());
                if(memoryCache$Value1 != null) {
                    memoryCache$Value0 = memoryCache$Value1;
                    break;
                }
            }
            int v3 = this.b;
            this.b = v3 + 1;
            if(v3 >= 10) {
                this.cleanUp$coil_base_release();
            }
            return memoryCache$Value0;
        }
    }

    @NotNull
    public final LinkedHashMap getCache$coil_base_release() {
        return this.a;
    }

    @VisibleForTesting
    public static void getCache$coil_base_release$annotations() {
    }

    @Override  // coil.memory.WeakMemoryCache
    @NotNull
    public Set getKeys() {
        synchronized(this) {
            return CollectionsKt___CollectionsKt.toSet(this.a.keySet());
        }
    }

    @Override  // coil.memory.WeakMemoryCache
    public boolean remove(@NotNull Key memoryCache$Key0) {
        synchronized(this) {
            return this.a.remove(memoryCache$Key0) != null;
        }
    }

    @Override  // coil.memory.WeakMemoryCache
    public void set(@NotNull Key memoryCache$Key0, @NotNull Bitmap bitmap0, @NotNull Map map0, int v) {
        synchronized(this) {
            LinkedHashMap linkedHashMap0 = this.a;
            ArrayList arrayList0 = linkedHashMap0.get(memoryCache$Key0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                linkedHashMap0.put(memoryCache$Key0, arrayList0);
            }
            int v2 = System.identityHashCode(bitmap0);
            InternalValue realWeakMemoryCache$InternalValue0 = new InternalValue(v2, new WeakReference(bitmap0), map0, v);
            int v3 = arrayList0.size();
            for(int v4 = 0; true; ++v4) {
                if(v4 >= v3) {
                    arrayList0.add(realWeakMemoryCache$InternalValue0);
                    break;
                }
                InternalValue realWeakMemoryCache$InternalValue1 = (InternalValue)arrayList0.get(v4);
                if(v >= realWeakMemoryCache$InternalValue1.getSize()) {
                    if(realWeakMemoryCache$InternalValue1.getIdentityHashCode() == v2 && realWeakMemoryCache$InternalValue1.getBitmap().get() == bitmap0) {
                        arrayList0.set(v4, realWeakMemoryCache$InternalValue0);
                        break;
                    }
                    arrayList0.add(v4, realWeakMemoryCache$InternalValue0);
                    break;
                }
            }
            int v5 = this.b;
            this.b = v5 + 1;
            if(v5 >= 10) {
                this.cleanUp$coil_base_release();
            }
        }
    }

    @Override  // coil.memory.WeakMemoryCache
    public void trimMemory(int v) {
        synchronized(this) {
            if(v >= 10 && v != 20) {
                this.cleanUp$coil_base_release();
            }
        }
    }
}

