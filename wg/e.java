package wg;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okio.internal.ResourceFileSystem;
import okio.internal.ZipEntry;

public final class e extends Lambda implements Function1 {
    public final int w;
    public static final e x;
    public static final e y;

    static {
        e.x = new e(1, 0);
        e.y = new e(1, 1);
    }

    public e(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((ZipEntry)object0), "it");
            return true;
        }
        Intrinsics.checkNotNullParameter(((ZipEntry)object0), "entry");
        return Boolean.valueOf(d.a(ResourceFileSystem.d, ((ZipEntry)object0).getCanonicalPath()));
    }
}

