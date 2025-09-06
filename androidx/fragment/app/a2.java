package androidx.fragment.app;

import android.util.Log;
import com.google.gson.internal.q;
import java.io.Writer;
import java.util.Objects;

public final class a2 extends Writer {
    public final int a;
    public final Object b;
    public final CharSequence c;

    public a2() {
        this.a = 0;
        super();
        this.c = new StringBuilder(0x80);
        this.b = "FragmentManager";
    }

    public a2(Appendable appendable0) {
        this.a = 1;
        super();
        this.c = new q();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.b = appendable0;
    }

    private final void a() {
    }

    @Override
    public Writer append(CharSequence charSequence0) {
        if(this.a != 1) {
            return super.append(charSequence0);
        }
        ((Appendable)this.b).append(charSequence0);
        return this;
    }

    @Override
    public Writer append(CharSequence charSequence0, int v, int v1) {
        if(this.a != 1) {
            return super.append(charSequence0, v, v1);
        }
        ((Appendable)this.b).append(charSequence0, v, v1);
        return this;
    }

    @Override
    public Appendable append(CharSequence charSequence0) {
        if(this.a != 1) {
            return super.append(charSequence0);
        }
        ((Appendable)this.b).append(charSequence0);
        return this;
    }

    @Override
    public Appendable append(CharSequence charSequence0, int v, int v1) {
        if(this.a != 1) {
            return super.append(charSequence0, v, v1);
        }
        ((Appendable)this.b).append(charSequence0, v, v1);
        return this;
    }

    private final void b() {
    }

    public void c() {
        StringBuilder stringBuilder0 = (StringBuilder)this.c;
        if(stringBuilder0.length() > 0) {
            Log.d(((String)this.b), stringBuilder0.toString());
            stringBuilder0.delete(0, stringBuilder0.length());
        }
    }

    @Override
    public final void close() {
        if(this.a != 0) {
            return;
        }
        this.c();
    }

    @Override
    public final void flush() {
        if(this.a != 0) {
            return;
        }
        this.c();
    }

    @Override
    public void write(int v) {
        if(this.a != 1) {
            super.write(v);
            return;
        }
        ((Appendable)this.b).append(((char)v));
    }

    @Override
    public void write(String s, int v, int v1) {
        if(this.a != 1) {
            super.write(s, v, v1);
            return;
        }
        Objects.requireNonNull(s);
        ((Appendable)this.b).append(s, v, v1 + v);
    }

    @Override
    public final void write(char[] arr_c, int v, int v1) {
        if(this.a != 0) {
            ((q)this.c).a = arr_c;
            ((q)this.c).b = null;
            ((Appendable)this.b).append(((q)this.c), v, v1 + v);
            return;
        }
        for(int v2 = 0; v2 < v1; ++v2) {
            int v3 = arr_c[v + v2];
            if(v3 == 10) {
                this.c();
            }
            else {
                ((StringBuilder)this.c).append(((char)v3));
            }
        }
    }
}

