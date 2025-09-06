package androidx.constraintlayout.widget;

import android.content.Context;
import java.io.Writer;
import java.util.HashMap;
import r0.a;

public final class h {
    public Writer a;
    public Context b;
    public int c;
    public HashMap d;

    public final String a(int v) {
        String s;
        HashMap hashMap0 = this.d;
        if(hashMap0.containsKey(v)) {
            return a.o(new StringBuilder("\'"), ((String)hashMap0.get(v)), "\'");
        }
        if(v == 0) {
            return "\'parent\'";
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
        return "\'" + s + "\'";
    }

    public final void b(int v, int v1, String s, String s1) {
        if(v == -1) {
            return;
        }
        Writer writer0 = this.a;
        writer0.write("       " + s);
        writer0.write(":[");
        writer0.write(this.a(v));
        writer0.write(" , ");
        writer0.write(s1);
        if(v1 != 0) {
            writer0.write(" , " + v1);
        }
        writer0.write("],\n");
    }

    public final void c(String s, int v, int v1, float f, int v2, int v3) {
        Writer writer0 = this.a;
        if(v == 0) {
            if(v3 == -1 && v2 == -1) {
                switch(v1) {
                    case 1: {
                        writer0.write("       " + s + ": \'???????????\',\n");
                        return;
                    }
                    case 2: {
                        writer0.write("       " + s + ": \'" + f + "%\',\n");
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            switch(v1) {
                case 0: {
                    writer0.write("       " + s + ": {\'spread\' ," + v2 + ", " + v3 + "}\n");
                    return;
                }
                case 1: {
                    writer0.write("       " + s + ": {\'wrap\' ," + v2 + ", " + v3 + "}\n");
                    return;
                }
                case 2: {
                    writer0.write("       " + s + ": {\'" + f + "\'% ," + v2 + ", " + v3 + "}\n");
                    return;
                }
                default: {
                    return;
                }
            }
        }
        switch(v) {
            case -2: {
                writer0.write("       " + s + ": \'wrap\'\n");
                return;
            }
            case -1: {
                writer0.write("       " + s + ": \'parent\'\n");
                return;
            }
            default: {
                writer0.write("       " + s + ": " + v + ",\n");
            }
        }
    }

    public final void d(int v, String s) {
        if(v != -1 && v != 0) {
            Writer writer0 = this.a;
            writer0.write("       " + s);
            writer0.write(":");
            writer0.write(", " + v);
            writer0.write("\n");
        }
    }

    public final void e(String s, float f) {
        if(f == -1.0f) {
            return;
        }
        Writer writer0 = this.a;
        writer0.write("       " + s);
        writer0.write(": " + f);
        writer0.write(",\n");
    }

    public final void f(String s, String s1) {
        if(s1 == null) {
            return;
        }
        Writer writer0 = this.a;
        writer0.write("       " + s);
        writer0.write(":");
        writer0.write(", " + s1);
        writer0.write("\n");
    }

    public final void g(String s, float f) {
        if(f == 0.5f) {
            return;
        }
        Writer writer0 = this.a;
        writer0.write("       " + s);
        writer0.write(": " + f);
        writer0.write(",\n");
    }
}

