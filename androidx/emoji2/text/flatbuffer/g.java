package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;

public final class g {
    public final CharsetEncoder a;
    public final CharsetDecoder b;
    public CharSequence c;
    public ByteBuffer d;

    public g() {
        this.c = null;
        this.d = null;
        Charset charset0 = StandardCharsets.UTF_8;
        this.a = charset0.newEncoder();
        this.b = charset0.newDecoder();
    }
}

