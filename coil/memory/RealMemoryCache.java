package coil.memory;

import coil.util.-Collections;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u0004\u0018\u00010\n2\u0006\u0010\t\u001A\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\r\u001A\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0012\u001A\u00020\u00112\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001A\u00020\u000E2\u0006\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001C\u001A\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u001BR\u0014\u0010\u001E\u001A\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u001BR\u001A\u0010\"\u001A\b\u0012\u0004\u0012\u00020\b0\u001F8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcoil/memory/RealMemoryCache;", "Lcoil/memory/MemoryCache;", "Lcoil/memory/StrongMemoryCache;", "strongMemoryCache", "Lcoil/memory/WeakMemoryCache;", "weakMemoryCache", "<init>", "(Lcoil/memory/StrongMemoryCache;Lcoil/memory/WeakMemoryCache;)V", "Lcoil/memory/MemoryCache$Key;", "key", "Lcoil/memory/MemoryCache$Value;", "get", "(Lcoil/memory/MemoryCache$Key;)Lcoil/memory/MemoryCache$Value;", "value", "", "set", "(Lcoil/memory/MemoryCache$Key;Lcoil/memory/MemoryCache$Value;)V", "", "remove", "(Lcoil/memory/MemoryCache$Key;)Z", "clear", "()V", "", "level", "trimMemory", "(I)V", "getSize", "()I", "size", "getMaxSize", "maxSize", "", "getKeys", "()Ljava/util/Set;", "keys", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class RealMemoryCache implements MemoryCache {
    public final StrongMemoryCache a;
    public final WeakMemoryCache b;

    public RealMemoryCache(@NotNull StrongMemoryCache strongMemoryCache0, @NotNull WeakMemoryCache weakMemoryCache0) {
        this.a = strongMemoryCache0;
        this.b = weakMemoryCache0;
    }

    @Override  // coil.memory.MemoryCache
    public void clear() {
        this.a.clearMemory();
        this.b.clearMemory();
    }

    @Override  // coil.memory.MemoryCache
    @Nullable
    public Value get(@NotNull Key memoryCache$Key0) {
        Value memoryCache$Value0 = this.a.get(memoryCache$Key0);
        return memoryCache$Value0 == null ? this.b.get(memoryCache$Key0) : memoryCache$Value0;
    }

    @Override  // coil.memory.MemoryCache
    @NotNull
    public Set getKeys() {
        return g0.plus(this.a.getKeys(), this.b.getKeys());
    }

    @Override  // coil.memory.MemoryCache
    public int getMaxSize() {
        return this.a.getMaxSize();
    }

    @Override  // coil.memory.MemoryCache
    public int getSize() {
        return this.a.getSize();
    }

    // 去混淆评级： 低(20)
    @Override  // coil.memory.MemoryCache
    public boolean remove(@NotNull Key memoryCache$Key0) {
        return this.a.remove(memoryCache$Key0) || this.b.remove(memoryCache$Key0);
    }

    @Override  // coil.memory.MemoryCache
    public void set(@NotNull Key memoryCache$Key0, @NotNull Value memoryCache$Value0) {
        Key memoryCache$Key1 = Key.copy$default(memoryCache$Key0, null, -Collections.toImmutableMap(memoryCache$Key0.getExtras()), 1, null);
        Map map0 = -Collections.toImmutableMap(memoryCache$Value0.getExtras());
        this.a.set(memoryCache$Key1, memoryCache$Value0.getBitmap(), map0);
    }

    @Override  // coil.memory.MemoryCache
    public void trimMemory(int v) {
        this.a.trimMemory(v);
        this.b.trimMemory(v);
    }
}

