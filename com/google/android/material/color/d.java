package com.google.android.material.color;

import androidx.core.app.y;
import java.util.List;

public final class d {
    public final f a;
    public final e b;
    public final h c;
    public final h d;
    public final y e;

    public d(e e0, List list0) {
        this.b = e0;
        this.c = new h(false, new String[]{"?1", "?2", "?3", "?4", "?5", "color"});
        String[] arr_s = new String[list0.size()];
        for(int v = 0; v < list0.size(); ++v) {
            arr_s[v] = ((c)list0.get(v)).d;
        }
        this.d = new h(true, arr_s);
        this.e = new y(list0);
        this.a = new f(0x200, 0x120, this.a());
    }

    public final int a() {
        return ((g[])((i)this.e.d).e).length * 16 + (((int[])((i)this.e.d).d).length * 4 + 84) + (this.e.a * 4 + 16) + (this.c.l + 0x120 + this.d.l);
    }
}

