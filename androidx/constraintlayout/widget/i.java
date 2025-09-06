package androidx.constraintlayout.widget;

import a5.b;
import android.content.Context;
import java.io.Writer;
import java.util.HashMap;
import r0.a;

public final class i {
    public Writer a;
    public Context b;
    public int c;
    public HashMap d;

    public final String a(int v) {
        String s;
        HashMap hashMap0 = this.d;
        if(hashMap0.containsKey(v)) {
            return a.o(new StringBuilder("@+id/"), ((String)hashMap0.get(v)), "");
        }
        if(v == 0) {
            return "parent";
        }
        try {
            if(v == -1) {
                int v1 = this.c + 1;
                this.c = v1;
                s = "unknown" + v1;
            }
            else {
                s = this.b.getResources().getResourceEntryName(v);
            }
        }
        catch(Exception unused_ex) {
            int v2 = this.c + 1;
            this.c = v2;
            s = "unknown" + v2;
        }
        hashMap0.put(v, s);
        return "@+id/" + s + "";
    }

    public final void b(int v, String s) {
        if(v != -5) {
            Writer writer0 = this.a;
            if(v == -2) {
                writer0.write("\n       " + s + "=\"wrap_content\"");
                return;
            }
            if(v == -1) {
                writer0.write("\n       " + s + "=\"match_parent\"");
                return;
            }
            writer0.write("\n       " + s + "=\"" + v + "dp\"");
        }
    }

    public final void c(String s, boolean z, boolean z1) {
        if(z != z1) {
            this.a.write("\n       " + s + "=\"" + z + "dp\"");
        }
    }

    public final void d(int v, int v1, String s) {
        if(v != v1) {
            this.a.write("\n       " + s + "=\"" + v + "dp\"");
        }
    }

    public final void e(String s, int v, String[] arr_s, int v1) {
        if(v != v1) {
            String s1 = a.o(b.v("\n       ", s, "=\""), arr_s[v], "\"");
            this.a.write(s1);
        }
    }

    public final void f(int v, String s) {
        if(v != -1 && v != 0) {
            this.a.write("\n       " + s + "=\"" + v + "\"\n");
        }
    }

    public final void g(String s, float f, float f1) {
        if(f == f1) {
            return;
        }
        Writer writer0 = this.a;
        writer0.write("\n       " + s);
        writer0.write("=\"" + f + "\"");
    }

    public final void h(String s, String s1) {
        if(s1 != null && !s1.equals(null)) {
            Writer writer0 = this.a;
            writer0.write("\n       " + s);
            writer0.write("=\"" + s1 + "\"");
        }
    }

    public final void i(int v, String s) {
        if(v == -1) {
            return;
        }
        Writer writer0 = this.a;
        writer0.write("\n       " + s);
        writer0.write("=\"" + this.a(v) + "\"");
    }
}

