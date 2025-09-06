package tf;

import androidx.datastore.core.MulticastFileObserver.Companion;
import androidx.datastore.core.MulticastFileObserver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.android.HandlerContext;

public final class a implements DisposableHandle {
    public final int a;
    public final Object b;
    public final Object c;

    public a(int v, Object object0, Object object1) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        super();
    }

    @Override  // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        if(this.a != 0) {
            String s = (String)this.b;
            Function1 function10 = (Function1)this.c;
            Intrinsics.checkNotNullParameter(function10, "$observer");
            Object object0 = MulticastFileObserver.c;
            synchronized(object0) {
                Companion multicastFileObserver$Companion0 = MulticastFileObserver.Companion;
                MulticastFileObserver multicastFileObserver0 = (MulticastFileObserver)multicastFileObserver$Companion0.getFileObservers$datastore_core_release().get(s);
                if(multicastFileObserver0 != null) {
                    multicastFileObserver0.b.remove(function10);
                    if(multicastFileObserver0.b.isEmpty()) {
                        multicastFileObserver$Companion0.getFileObservers$datastore_core_release().remove(s);
                        multicastFileObserver0.stopWatching();
                    }
                }
            }
            return;
        }
        ((HandlerContext)this.b).b.removeCallbacks(((Runnable)this.c));
    }
}

