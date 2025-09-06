package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public class BaseVector {
    public int a;
    public int b;
    protected ByteBuffer bb;
    public int c;

    public int __element(int v) {
        return v * this.c + this.a;
    }

    public void __reset(int v, int v1, ByteBuffer byteBuffer0) {
        this.bb = byteBuffer0;
        if(byteBuffer0 != null) {
            this.a = v;
            this.b = byteBuffer0.getInt(v - 4);
            this.c = v1;
            return;
        }
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public int __vector() {
        return this.a;
    }

    public int length() {
        return this.b;
    }

    public void reset() {
        this.__reset(0, 0, null);
    }
}

