package b;

public final class l extends p {
    public final int a;

    public l(int v) {
        super(0);
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof l ? this.a == ((l)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        return "SelectPhoto(index=" + this.a + ")";
    }
}

