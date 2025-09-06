package androidx.lifecycle;

public final class f0 implements Observer {
    public final LiveData a;
    public final Observer b;
    public int c;

    public f0(LiveData liveData0, Observer observer0) {
        this.c = -1;
        this.a = liveData0;
        this.b = observer0;
    }

    @Override  // androidx.lifecycle.Observer
    public final void onChanged(Object object0) {
        int v = this.a.j;
        if(this.c != v) {
            this.c = v;
            this.b.onChanged(object0);
        }
    }
}

