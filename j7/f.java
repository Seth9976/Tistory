package j7;

public final class f extends e {
    public final char a;

    public f(char c) {
        this.a = c;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("CharMatcher.is(\'");
        char[] arr_c = {'\\', 'u', '\u0000', '\u0000', '\u0000', '\u0000'};
        int v = this.a;
        for(int v1 = 0; v1 < 4; ++v1) {
            arr_c[5 - v1] = "0123456789ABCDEF".charAt(v & 15);
            v >>= 4;
        }
        stringBuilder0.append(String.copyValueOf(arr_c));
        stringBuilder0.append("\')");
        return stringBuilder0.toString();
    }

    @Override  // com.google.android.gms.internal.common.zzo
    public final boolean zza(char c) {
        return c == this.a;
    }
}

