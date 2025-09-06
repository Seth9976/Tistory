package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public abstract class Utf8 {
    public static Utf8 a;

    public abstract String decodeUtf8(ByteBuffer arg1, int arg2, int arg3);

    public abstract void encodeUtf8(CharSequence arg1, ByteBuffer arg2);

    public abstract int encodedLength(CharSequence arg1);

    public static Utf8 getDefault() {
        if(Utf8.a == null) {
            Utf8.a = new Utf8Safe();
        }
        return Utf8.a;
    }

    public static void setDefault(Utf8 utf80) {
        Utf8.a = utf80;
    }
}

