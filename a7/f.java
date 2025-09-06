package a7;

import java.util.Arrays;

public final class f extends e {
    public final byte[] b;

    public f(byte[] arr_b) {
        super(Arrays.copyOfRange(arr_b, 0, 25));
        this.b = arr_b;
    }

    @Override  // a7.e
    public final byte[] b() {
        return this.b;
    }
}

