package yd;

import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.p;

public abstract class e {
    public static final Path a;
    public static final Path b;

    static {
        e.a = Paths.get("", new String[0]);
        e.b = Paths.get("..", new String[0]);
    }

    public static Path a(Path path0, Path path1) {
        Intrinsics.checkNotNullParameter(path0, "path");
        Intrinsics.checkNotNullParameter(path1, "base");
        Path path2 = path1.normalize();
        Path path3 = path0.normalize();
        Path path4 = path2.relativize(path3);
        int v = Math.min(path2.getNameCount(), path3.getNameCount());
        for(int v1 = 0; v1 < v; ++v1) {
            Path path5 = path2.getName(v1);
            Path path6 = e.b;
            if(!Intrinsics.areEqual(path5, path6)) {
                break;
            }
            if(!Intrinsics.areEqual(path3.getName(v1), path6)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if(Intrinsics.areEqual(path3, path2) || !Intrinsics.areEqual(path2, e.a)) {
            String s = path4.toString();
            String s1 = path4.getFileSystem().getSeparator();
            Intrinsics.checkNotNullExpressionValue(s1, "getSeparator(...)");
            path3 = p.endsWith$default(s, s1, false, 2, null) ? path4.getFileSystem().getPath(StringsKt___StringsKt.dropLast(s, path4.getFileSystem().getSeparator().length()), new String[0]) : path4;
        }
        Intrinsics.checkNotNull(path3);
        return path3;
    }
}

