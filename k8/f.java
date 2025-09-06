package k8;

import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import fg.c;
import kotlin.jvm.internal.Intrinsics;

public final class f implements InstallStateUpdatedListener {
    public final b a;
    public final c b;

    public f(b b0, c c0) {
        Intrinsics.checkNotNullParameter(b0, "listener");
        Intrinsics.checkNotNullParameter(c0, "disposeAction");
        super();
        this.a = b0;
        this.b = c0;
    }

    @Override  // com.google.android.play.core.listener.StateUpdatedListener
    public final void onStateUpdate(Object object0) {
        Intrinsics.checkNotNullParameter(((InstallState)object0), "state");
        this.a.onStateUpdate(((InstallState)object0));
        switch(((InstallState)object0).installStatus()) {
            case 0: 
            case 5: 
            case 6: 
            case 11: {
                this.b.invoke(this);
            }
        }
    }
}

