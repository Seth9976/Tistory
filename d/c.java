package d;

import android.content.res.AssetManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.internal.Intrinsics;

public final class c implements Factory {
    public final b a;

    public c(b b0) {
        this.a = b0;
    }

    @Override  // javax.inject.Provider
    public final Object get() {
        AssetManager assetManager0 = this.a.a.getAssets();
        Intrinsics.checkNotNullExpressionValue(assetManager0, "getAssets(...)");
        return (AssetManager)Preconditions.checkNotNullFromProvides(assetManager0);
    }
}

