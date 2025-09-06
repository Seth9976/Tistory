package coil.memory;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001A\u00020\bH&J\u0012\u0010\t\u001A\u0004\u0018\u00010\n2\u0006\u0010\u000B\u001A\u00020\u0004H&J\u0010\u0010\f\u001A\u00020\r2\u0006\u0010\u000B\u001A\u00020\u0004H&J4\u0010\u000E\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00020\u00102\u0012\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u00122\u0006\u0010\u0014\u001A\u00020\u0015H&J\u0010\u0010\u0016\u001A\u00020\b2\u0006\u0010\u0017\u001A\u00020\u0015H&R\u0018\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Lcoil/memory/WeakMemoryCache;", "", "keys", "", "Lcoil/memory/MemoryCache$Key;", "getKeys", "()Ljava/util/Set;", "clearMemory", "", "get", "Lcoil/memory/MemoryCache$Value;", "key", "remove", "", "set", "bitmap", "Landroid/graphics/Bitmap;", "extras", "", "", "size", "", "trimMemory", "level", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface WeakMemoryCache {
    void clearMemory();

    @Nullable
    Value get(@NotNull Key arg1);

    @NotNull
    Set getKeys();

    boolean remove(@NotNull Key arg1);

    void set(@NotNull Key arg1, @NotNull Bitmap arg2, @NotNull Map arg3, int arg4);

    void trimMemory(int arg1);
}

