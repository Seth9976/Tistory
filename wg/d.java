package wg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import okio.Path;
import okio.internal.ResourceFileSystem;

public final class d {
    public static final boolean a(d d0, Path path0) {
        d0.getClass();
        return !p.endsWith(path0.name(), ".class", true);
    }

    public static Path b(Path path0, Path path1) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(path1, "base");
        return ResourceFileSystem.e.resolve(p.replace$default(StringsKt__StringsKt.removePrefix(path0.toString(), path1.toString()), '\\', '/', false, 4, null));
    }
}

