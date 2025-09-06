package b;

public final class e extends p {
    public static final e a;

    static {
        e.a = new e();
    }

    public e() {
        super(0);
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof e;
    }

    @Override
    public final int hashCode() {
        return 0x9BA14EDB;
    }

    @Override
    public final String toString() {
        return "Finish";
    }
}

