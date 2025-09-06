package androidx.fragment.app;

public final class s0 extends FragmentFactory {
    public final FragmentManager b;

    public s0(FragmentManager fragmentManager0) {
        this.b = fragmentManager0;
        super();
    }

    @Override  // androidx.fragment.app.FragmentFactory
    public final Fragment instantiate(ClassLoader classLoader0, String s) {
        return this.b.getHost().instantiate(this.b.getHost().b, s, null);
    }
}

