package retrofit2;

import okhttp3.Call.Factory;

public abstract class m extends k0 {
    public final i0 a;
    public final Factory b;
    public final Converter c;

    public m(i0 i00, Factory call$Factory0, Converter converter0) {
        this.a = i00;
        this.b = call$Factory0;
        this.c = converter0;
    }

    public abstract Object b(s arg1, Object[] arg2);
}

