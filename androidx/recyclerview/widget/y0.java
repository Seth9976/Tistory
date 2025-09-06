package androidx.recyclerview.widget;

public final class y0 {
    public y0 a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public TileList.Tile h;
    public static y0 i;
    public static final Object j;

    static {
        y0.j = new Object();
    }

    public static y0 a(int v, int v1, int v2, int v3, int v4, int v5, TileList.Tile tileList$Tile0) {
        synchronized(y0.j) {
            y0 y00 = y0.i;
            if(y00 == null) {
                y00 = new y0();  // 初始化器: Ljava/lang/Object;-><init>()V
            }
            else {
                y0.i = y00.a;
                y00.a = null;
            }
            y00.b = v;
            y00.c = v1;
            y00.d = v2;
            y00.e = v3;
            y00.f = v4;
            y00.g = v5;
            y00.h = tileList$Tile0;
            return y00;
        }
    }

    public final void b() {
        this.a = null;
        this.g = 0;
        this.f = 0;
        this.e = 0;
        this.d = 0;
        this.c = 0;
        this.b = 0;
        this.h = null;
        synchronized(y0.j) {
            y0 y00 = y0.i;
            if(y00 != null) {
                this.a = y00;
            }
            y0.i = this;
        }
    }
}

