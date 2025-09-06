package y0;

import android.os.Looper;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.k;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function0 {
    public final int w;
    public static final a x;
    public static final a y;
    public static final a z;

    static {
        a.x = new a(0, 0);
        a.y = new a(0, 1);
        a.z = new a(0, 2);
    }

    public a(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return Looper.getMainLooper() != null ? androidx.compose.runtime.a.a : k.a;
            }
            case 1: {
                ComposerKt.composeRuntimeError("Unexpected call to default provider");
                throw new KotlinNothingValueException();
            }
            default: {
                return null;
            }
        }
    }
}

