package b;

public final class k extends p {
    public final boolean a;

    public k(boolean z) {
        super(0);
        this.a = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof k ? this.a == ((k)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    @Override
    public final String toString() {
        return "SaveAllPhoto(generateBitmap=" + this.a + ")";
    }
}

