package androidx.emoji2.text.flatbuffer;

public abstract class a {
    public final ReadBuf a;
    public final int b;
    public final int c;

    public a(ReadBuf readBuf0, int v, int v1) {
        this.a = readBuf0;
        this.b = v;
        this.c = v1;
    }

    @Override
    public String toString() {
        return this.toString(new StringBuilder(0x80)).toString();
    }

    public abstract StringBuilder toString(StringBuilder arg1);
}

