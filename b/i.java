package b;

public final class i extends p {
    public static final i a;

    static {
        i.a = new i();
    }

    public i() {
        super(0);
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof i;
    }

    @Override
    public final int hashCode() {
        return 0xE57387E0;
    }

    @Override
    public final String toString() {
        return "ResetCurrentPhoto";
    }
}

