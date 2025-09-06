package coil.key;

import coil.request.Options;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcoil/key/FileKeyer;", "Lcoil/key/Keyer;", "Ljava/io/File;", "", "addLastModifiedToFileCacheKey", "<init>", "(Z)V", "data", "Lcoil/request/Options;", "options", "", "key", "(Ljava/io/File;Lcoil/request/Options;)Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FileKeyer implements Keyer {
    public final boolean a;

    public FileKeyer(boolean z) {
        this.a = z;
    }

    // 去混淆评级： 低(20)
    @NotNull
    public String key(@NotNull File file0, @NotNull Options options0) {
        return this.a ? file0.getPath() + ':' + file0.lastModified() : file0.getPath();
    }

    @Override  // coil.key.Keyer
    public String key(Object object0, Options options0) {
        return this.key(((File)object0), options0);
    }
}

