package bd;

public final class a extends RuntimeException {
    public final int a;

    public a() {
        this.a = 0;
    }

    public a(String s) {
        this.a = 1;
        super(s);
    }

    @Override
    public String getMessage() {
        return this.a == 0 ? "Chain of Causes for CompositeException In Order Received =>" : super.getMessage();
    }
}

