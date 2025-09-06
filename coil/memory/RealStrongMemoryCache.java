package coil.memory;

import android.graphics.Bitmap;
import androidx.collection.LruCache;
import coil.util.-Bitmaps;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v5.a;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u000B\n\u0002\u0010#\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001&B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000B\u001A\u0004\u0018\u00010\n2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\fJ3\u0010\u0014\u001A\u00020\u00132\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000E\u001A\u00020\r2\u0012\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000FH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001A\u00020\u00162\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u0019\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001AJ\u0017\u0010\u001C\u001A\u00020\u00132\u0006\u0010\u001B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u001C\u0010\u001DR\u0014\u0010 \u001A\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001E\u0010\u001FR\u0014\u0010\u0003\u001A\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b!\u0010\u001FR\u001A\u0010%\u001A\b\u0012\u0004\u0012\u00020\b0\"8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b#\u0010$¨\u0006\'"}, d2 = {"Lcoil/memory/RealStrongMemoryCache;", "Lcoil/memory/StrongMemoryCache;", "", "maxSize", "Lcoil/memory/WeakMemoryCache;", "weakMemoryCache", "<init>", "(ILcoil/memory/WeakMemoryCache;)V", "Lcoil/memory/MemoryCache$Key;", "key", "Lcoil/memory/MemoryCache$Value;", "get", "(Lcoil/memory/MemoryCache$Key;)Lcoil/memory/MemoryCache$Value;", "Landroid/graphics/Bitmap;", "bitmap", "", "", "", "extras", "", "set", "(Lcoil/memory/MemoryCache$Key;Landroid/graphics/Bitmap;Ljava/util/Map;)V", "", "remove", "(Lcoil/memory/MemoryCache$Key;)Z", "clearMemory", "()V", "level", "trimMemory", "(I)V", "getSize", "()I", "size", "getMaxSize", "", "getKeys", "()Ljava/util/Set;", "keys", "v5/a", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStrongMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrongMemoryCache.kt\ncoil/memory/RealStrongMemoryCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
public final class RealStrongMemoryCache implements StrongMemoryCache {
    public final WeakMemoryCache a;
    public final coil.memory.RealStrongMemoryCache.cache.1 b;

    public RealStrongMemoryCache(int v, @NotNull WeakMemoryCache weakMemoryCache0) {
        this.a = weakMemoryCache0;
        this.b = new LruCache(this) {
            public void entryRemoved(boolean z, @NotNull Key memoryCache$Key0, @NotNull a a0, @Nullable a a1) {
                RealStrongMemoryCache.access$getWeakMemoryCache$p(this.j).set(memoryCache$Key0, a0.a, a0.b, a0.c);
            }

            @Override  // androidx.collection.LruCache
            public void entryRemoved(boolean z, Object object0, Object object1, Object object2) {
                this.entryRemoved(z, ((Key)object0), ((a)object1), ((a)object2));
            }

            public int sizeOf(@NotNull Key memoryCache$Key0, @NotNull a a0) {
                return a0.c;
            }

            @Override  // androidx.collection.LruCache
            public int sizeOf(Object object0, Object object1) {
                return this.sizeOf(((Key)object0), ((a)object1));
            }
        };
    }

    public static final WeakMemoryCache access$getWeakMemoryCache$p(RealStrongMemoryCache realStrongMemoryCache0) {
        return realStrongMemoryCache0.a;
    }

    @Override  // coil.memory.StrongMemoryCache
    public void clearMemory() {
        this.b.evictAll();
    }

    @Override  // coil.memory.StrongMemoryCache
    @Nullable
    public Value get(@NotNull Key memoryCache$Key0) {
        a a0 = (a)this.b.get(memoryCache$Key0);
        return a0 == null ? null : new Value(a0.a, a0.b);
    }

    @Override  // coil.memory.StrongMemoryCache
    @NotNull
    public Set getKeys() {
        return this.b.snapshot().keySet();
    }

    @Override  // coil.memory.StrongMemoryCache
    public int getMaxSize() {
        return this.b.maxSize();
    }

    @Override  // coil.memory.StrongMemoryCache
    public int getSize() {
        return this.b.size();
    }

    @Override  // coil.memory.StrongMemoryCache
    public boolean remove(@NotNull Key memoryCache$Key0) {
        return this.b.remove(memoryCache$Key0) != null;
    }

    @Override  // coil.memory.StrongMemoryCache
    public void set(@NotNull Key memoryCache$Key0, @NotNull Bitmap bitmap0, @NotNull Map map0) {
        int v = -Bitmaps.getAllocationByteCountCompat(bitmap0);
        int v1 = this.getMaxSize();
        coil.memory.RealStrongMemoryCache.cache.1 realStrongMemoryCache$cache$10 = this.b;
        if(v <= v1) {
            realStrongMemoryCache$cache$10.put(memoryCache$Key0, new a(bitmap0, map0, v));
            return;
        }
        realStrongMemoryCache$cache$10.remove(memoryCache$Key0);
        this.a.set(memoryCache$Key0, bitmap0, map0, v);
    }

    @Override  // coil.memory.StrongMemoryCache
    public void trimMemory(int v) {
        if(v >= 40) {
            this.clearMemory();
            return;
        }
        if(10 <= v && v < 20) {
            int v1 = this.getSize();
            this.b.trimToSize(v1 / 2);
        }
    }
}

