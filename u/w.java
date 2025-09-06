package u;

import android.view.Surface;
import androidx.compose.foundation.AndroidExternalSurfaceScope;
import androidx.compose.foundation.SurfaceScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

public abstract class w implements AndroidExternalSurfaceScope, SurfaceScope {
    public final CoroutineScope a;
    public Function5 b;
    public Function3 c;
    public Function1 d;
    public Job e;

    public w(CoroutineScope coroutineScope0) {
        this.a = coroutineScope0;
    }

    @Override  // androidx.compose.foundation.SurfaceScope
    public final void onChanged(Surface surface0, Function3 function30) {
        this.c = function30;
    }

    @Override  // androidx.compose.foundation.SurfaceScope
    public final void onDestroyed(Surface surface0, Function1 function10) {
        this.d = function10;
    }

    @Override  // androidx.compose.foundation.AndroidExternalSurfaceScope
    public final void onSurface(Function5 function50) {
        this.b = function50;
    }
}

