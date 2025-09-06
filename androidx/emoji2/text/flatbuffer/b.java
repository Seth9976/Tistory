package androidx.emoji2.text.flatbuffer;

public abstract class b extends a {
    protected final int size;

    public b(ReadBuf readBuf0, int v, int v1) {
        super(readBuf0, v, v1);
        this.size = (int)FlexBuffers.c(readBuf0, v - v1, v1);
    }
}

