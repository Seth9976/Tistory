package bd;

import java.io.PrintStream;
import java.io.PrintWriter;

public final class b extends g.b {
    public final int b;
    public final Object c;

    public b(Object object0, int v) {
        this.b = v;
        this.c = object0;
        super();
    }

    @Override  // g.b
    public final void w(String s) {
        if(this.b != 0) {
            ((PrintWriter)this.c).println(s);
            return;
        }
        ((PrintStream)this.c).println(s);
    }
}

