package d;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

public final class d implements Factory {
    public final b a;

    public d(b b0) {
        this.a = b0;
    }

    @Override  // javax.inject.Provider
    public final Object get() {
        File file0 = this.a.a.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(file0, "getCacheDir(...)");
        return (File)Preconditions.checkNotNullFromProvides(file0);
    }
}

