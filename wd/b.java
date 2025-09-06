package wd;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

public abstract class b extends g {
    public b(File file0) {
        Intrinsics.checkNotNullParameter(file0, "rootDir");
        super(file0);
    }
}

