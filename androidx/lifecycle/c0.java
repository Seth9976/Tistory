package androidx.lifecycle;

public abstract class c0 {
    public final Observer a;
    public boolean b;
    public int c;
    public final LiveData d;

    public c0(LiveData liveData0, Observer observer0) {
        this.d = liveData0;
        this.c = -1;
        this.a = observer0;
    }

    public final void a(boolean z) {
        if(z == this.b) {
            return;
        }
        this.b = z;
        LiveData liveData0 = this.d;
        int v = liveData0.f;
        liveData0.f = (z ? 1 : -1) + v;
        if(!liveData0.g) {
            liveData0.g = true;
            try {
                while(true) {
                    int v2 = liveData0.f;
                    if(v == v2) {
                        break;
                    }
                    if(v == 0 && v2 > 0) {
                        liveData0.onActive();
                    }
                    else if(v > 0 && v2 == 0) {
                        liveData0.onInactive();
                    }
                    v = v2;
                }
            }
            finally {
                liveData0.g = false;
            }
        }
        if(this.b) {
            liveData0.c(this);
        }
    }

    public void b() {
    }

    public boolean c(LifecycleOwner lifecycleOwner0) {
        return false;
    }

    public abstract boolean d();
}

