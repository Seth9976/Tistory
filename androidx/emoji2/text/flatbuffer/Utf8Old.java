package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

public class Utf8Old extends Utf8 {
    public static final ThreadLocal b;

    static {
        Utf8Old.b = ThreadLocal.withInitial(new f());  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.emoji2.text.flatbuffer.Utf8
    public String decodeUtf8(ByteBuffer byteBuffer0, int v, int v1) {
        CharsetDecoder charsetDecoder0 = ((g)Utf8Old.b.get()).b;
        charsetDecoder0.reset();
        ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
        byteBuffer1.position(v);
        byteBuffer1.limit(v + v1);
        try {
            return charsetDecoder0.decode(byteBuffer1).toString();
        }
        catch(CharacterCodingException characterCodingException0) {
            throw new IllegalArgumentException("Bad encoding", characterCodingException0);
        }
    }

    @Override  // androidx.emoji2.text.flatbuffer.Utf8
    public void encodeUtf8(CharSequence charSequence0, ByteBuffer byteBuffer0) {
        g g0 = (g)Utf8Old.b.get();
        if(g0.c != charSequence0) {
            this.encodedLength(charSequence0);
        }
        byteBuffer0.put(g0.d);
    }

    @Override  // androidx.emoji2.text.flatbuffer.Utf8
    public int encodedLength(CharSequence charSequence0) {
        g g0 = (g)Utf8Old.b.get();
        float f = (float)charSequence0.length();
        int v = (int)(g0.a.maxBytesPerChar() * f);
        if(g0.d == null || g0.d.capacity() < v) {
            g0.d = ByteBuffer.allocate(Math.max(0x80, v));
        }
        g0.d.clear();
        g0.c = charSequence0;
        CharBuffer charBuffer0 = charSequence0 instanceof CharBuffer ? ((CharBuffer)charSequence0) : CharBuffer.wrap(charSequence0);
        CoderResult coderResult0 = g0.a.encode(charBuffer0, g0.d, true);
        if(coderResult0.isError()) {
            try {
                coderResult0.throwException();
            }
            catch(CharacterCodingException characterCodingException0) {
                throw new IllegalArgumentException("bad character encoding", characterCodingException0);
            }
        }
        g0.d.flip();
        return g0.d.remaining();
    }
}

