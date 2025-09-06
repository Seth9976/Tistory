package coil.util;

import android.content.Context;
import coil.disk.DiskCache.Builder;
import coil.disk.DiskCache;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import wd.l;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcoil/util/SingletonDiskCache;", "", "Landroid/content/Context;", "context", "Lcoil/disk/DiskCache;", "get", "(Landroid/content/Context;)Lcoil/disk/DiskCache;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncoil/util/SingletonDiskCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
public final class SingletonDiskCache {
    @NotNull
    public static final SingletonDiskCache INSTANCE;
    public static DiskCache a;

    static {
        SingletonDiskCache.INSTANCE = new SingletonDiskCache();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public final DiskCache get(@NotNull Context context0) {
        synchronized(this) {
            DiskCache diskCache0 = SingletonDiskCache.a;
            if(diskCache0 == null) {
                diskCache0 = new Builder().directory(l.resolve(-Utils.getSafeCacheDir(context0), "image_cache")).build();
                SingletonDiskCache.a = diskCache0;
            }
            return diskCache0;
        }
    }
}

