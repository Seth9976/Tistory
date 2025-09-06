package androidx.work.impl.utils.futures;

public final class b extends Throwable {
    public final int a;

    public b(String s, int v) {
        this.a = v;
        super(s);
    }

    @Override
    public final Throwable fillInStackTrace() {
        __monitor_enter(this);
        switch(this.a) {
            case 0: {
                __monitor_exit(this);
                return this;
            }
            case 1: {
                __monitor_exit(this);
                return this;
            }
            default: {
                __monitor_exit(this);
                return this;
            }
        }
    }
}

