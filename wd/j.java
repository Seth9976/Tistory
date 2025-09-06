package wd;

import java.io.File;
import kotlin.io.FileTreeWalk;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class j extends i {
    @NotNull
    public static final FileTreeWalk walk(@NotNull File file0, @NotNull FileWalkDirection fileWalkDirection0) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(fileWalkDirection0, "direction");
        return new FileTreeWalk(file0, fileWalkDirection0);
    }

    public static FileTreeWalk walk$default(File file0, FileWalkDirection fileWalkDirection0, int v, Object object0) {
        if((v & 1) != 0) {
            fileWalkDirection0 = FileWalkDirection.TOP_DOWN;
        }
        return j.walk(file0, fileWalkDirection0);
    }

    @NotNull
    public static final FileTreeWalk walkBottomUp(@NotNull File file0) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        return j.walk(file0, FileWalkDirection.BOTTOM_UP);
    }

    @NotNull
    public static final FileTreeWalk walkTopDown(@NotNull File file0) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        return j.walk(file0, FileWalkDirection.TOP_DOWN);
    }
}

