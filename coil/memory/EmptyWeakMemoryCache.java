package coil.memory;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001A\u00020\tH\u0016J\u0012\u0010\n\u001A\u0004\u0018\u00010\u000B2\u0006\u0010\f\u001A\u00020\u0005H\u0016J\u0010\u0010\r\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u0005H\u0016J4\u0010\u000F\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\u0010\u001A\u00020\u00112\u0012\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001A\u00020\u0017H\u0016J\u0010\u0010\u0018\u001A\u00020\t2\u0006\u0010\u0019\u001A\u00020\u0017H\u0016R\u001A\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0007¨\u0006\u001A"}, d2 = {"Lcoil/memory/EmptyWeakMemoryCache;", "Lcoil/memory/WeakMemoryCache;", "()V", "keys", "", "Lcoil/memory/MemoryCache$Key;", "getKeys", "()Ljava/util/Set;", "clearMemory", "", "get", "Lcoil/memory/MemoryCache$Value;", "key", "remove", "", "set", "bitmap", "Landroid/graphics/Bitmap;", "extras", "", "", "", "size", "", "trimMemory", "level", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EmptyWeakMemoryCache implements WeakMemoryCache {
    @Override  // coil.memory.WeakMemoryCache
    public void clearMemory() {
    }

    @Override  // coil.memory.WeakMemoryCache
    @Nullable
    public Value get(@NotNull Key memoryCache$Key0) {
        return null;
    }

    @Override  // coil.memory.WeakMemoryCache
    @NotNull
    public Set getKeys() {
        return f0.emptySet();
    }

    @Override  // coil.memory.WeakMemoryCache
    public boolean remove(@NotNull Key memoryCache$Key0) {
        return false;
    }

    @Override  // coil.memory.WeakMemoryCache
    public void set(@NotNull Key memoryCache$Key0, @NotNull Bitmap bitmap0, @NotNull Map map0, int v) {
    }

    @Override  // coil.memory.WeakMemoryCache
    public void trimMemory(int v) {
    }
}

