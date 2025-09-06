package retrofit2;

public final class a0 extends p0 {
    public final Converter d;
    public final boolean e;

    public a0(Converter converter0, boolean z) {
        this.d = converter0;
        this.e = z;
    }

    @Override  // retrofit2.p0
    public final void a(g0 g00, Object object0) {
        if(object0 == null) {
            return;
        }
        g00.b(((String)this.d.convert(object0)), null, this.e);
    }
}

