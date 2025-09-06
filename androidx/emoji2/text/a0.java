package androidx.emoji2.text;

import android.util.SparseArray;

public final class a0 {
    public final SparseArray a;
    public TypefaceEmojiRasterizer b;

    public a0(int v) {
        this.a = new SparseArray(v);
    }

    public final void a(TypefaceEmojiRasterizer typefaceEmojiRasterizer0, int v, int v1) {
        int v2 = typefaceEmojiRasterizer0.getCodepointAt(v);
        SparseArray sparseArray0 = this.a;
        a0 a00 = sparseArray0 == null ? null : ((a0)sparseArray0.get(v2));
        if(a00 == null) {
            a00 = new a0(1);
            sparseArray0.put(typefaceEmojiRasterizer0.getCodepointAt(v), a00);
        }
        if(v1 > v) {
            a00.a(typefaceEmojiRasterizer0, v + 1, v1);
            return;
        }
        a00.b = typefaceEmojiRasterizer0;
    }
}

