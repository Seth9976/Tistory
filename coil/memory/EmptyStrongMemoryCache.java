package coil.memory;

import android.graphics.Bitmap;
import coil.util.-Bitmaps;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u000B2\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000F0\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001B\u001A\u00020\u00112\u0006\u0010\u001A\u001A\u00020\u0019H\u0016¢\u0006\u0004\b\u001B\u0010\u001CR\u0014\u0010\u001F\u001A\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u001ER\u0014\u0010!\u001A\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b \u0010\u001ER\u001A\u0010%\u001A\b\u0012\u0004\u0012\u00020\u00060\"8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcoil/memory/EmptyStrongMemoryCache;", "Lcoil/memory/StrongMemoryCache;", "Lcoil/memory/WeakMemoryCache;", "weakMemoryCache", "<init>", "(Lcoil/memory/WeakMemoryCache;)V", "Lcoil/memory/MemoryCache$Key;", "key", "Lcoil/memory/MemoryCache$Value;", "get", "(Lcoil/memory/MemoryCache$Key;)Lcoil/memory/MemoryCache$Value;", "Landroid/graphics/Bitmap;", "bitmap", "", "", "", "extras", "", "set", "(Lcoil/memory/MemoryCache$Key;Landroid/graphics/Bitmap;Ljava/util/Map;)V", "", "remove", "(Lcoil/memory/MemoryCache$Key;)Z", "clearMemory", "()V", "", "level", "trimMemory", "(I)V", "getSize", "()I", "size", "getMaxSize", "maxSize", "", "getKeys", "()Ljava/util/Set;", "keys", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EmptyStrongMemoryCache implements StrongMemoryCache {
    public final WeakMemoryCache a;

    public EmptyStrongMemoryCache(@NotNull WeakMemoryCache weakMemoryCache0) {
        this.a = weakMemoryCache0;
    }

    @Override  // coil.memory.StrongMemoryCache
    public void clearMemory() {
    }

    @Override  // coil.memory.StrongMemoryCache
    @Nullable
    public Value get(@NotNull Key memoryCache$Key0) {
        return null;
    }

    @Override  // coil.memory.StrongMemoryCache
    @NotNull
    public Set getKeys() {
        return f0.emptySet();
    }

    @Override  // coil.memory.StrongMemoryCache
    public int getMaxSize() {
        return 0;
    }

    @Override  // coil.memory.StrongMemoryCache
    public int getSize() {
        return 0;
    }

    @Override  // coil.memory.StrongMemoryCache
    public boolean remove(@NotNull Key memoryCache$Key0) {
        return false;
    }

    @Override  // coil.memory.StrongMemoryCache
    public void set(@NotNull Key memoryCache$Key0, @NotNull Bitmap bitmap0, @NotNull Map map0) {
        int v = -Bitmaps.getAllocationByteCountCompat(bitmap0);
        this.a.set(memoryCache$Key0, bitmap0, map0, v);
    }

    @Override  // coil.memory.StrongMemoryCache
    public void trimMemory(int v) {
    }
}

