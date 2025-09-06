package wd;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

public abstract class g {
    public final File a;

    public g(File file0) {
        Intrinsics.checkNotNullParameter(file0, "root");
        super();
        this.a = file0;
    }

    public abstract File a();
}

