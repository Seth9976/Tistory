package d;

import android.content.ContentResolver;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.internal.Intrinsics;

public final class e implements Factory {
    public final b a;

    public e(b b0) {
        this.a = b0;
    }

    @Override  // javax.inject.Provider
    public final Object get() {
        ContentResolver contentResolver0 = this.a.a.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver0, "getContentResolver(...)");
        return (ContentResolver)Preconditions.checkNotNullFromProvides(contentResolver0);
    }
}

