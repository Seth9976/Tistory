package coil.decode;

import android.content.Context;
import coil.util.-Utils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function0 {
    public final Context w;

    public a(Context context0) {
        this.w = context0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return -Utils.getSafeCacheDir(this.w);
    }
}

