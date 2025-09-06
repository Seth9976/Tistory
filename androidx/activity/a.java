package androidx.activity;

import kotlin.jvm.internal.Intrinsics;

public final class a implements Runnable {
    public final int a;
    public final ComponentActivity b;

    public a(ComponentActivity componentActivity0, int v) {
        this.a = v;
        this.b = componentActivity0;
        super();
    }

    @Override
    public final void run() {
        ComponentActivity componentActivity0 = this.b;
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(componentActivity0, "this$0");
            try {
                componentActivity0.super.onBackPressed();
                return;
            }
            catch(IllegalStateException illegalStateException0) {
                if(!Intrinsics.areEqual(illegalStateException0.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw illegalStateException0;
                }
            }
            catch(NullPointerException nullPointerException0) {
                if(!Intrinsics.areEqual(nullPointerException0.getMessage(), "Attempt to invoke virtual method \'android.os.Handler android.app.FragmentHostCallback.getHandler()\' on a null object reference")) {
                    throw nullPointerException0;
                }
            }
            return;
        }
        Intrinsics.checkNotNullParameter(componentActivity0, "this$0");
        componentActivity0.invalidateMenu();
    }
}

