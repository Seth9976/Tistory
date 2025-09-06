package androidx.compose.ui.graphics.vector;

import java.util.ArrayList;
import java.util.List;

public final class a {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final List i;
    public final List j;

    public a(String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, List list0, int v) {
        if((v & 1) != 0) {
            s = "";
        }
        if((v & 2) != 0) {
            f = 0.0f;
        }
        if((v & 4) != 0) {
            f1 = 0.0f;
        }
        if((v & 8) != 0) {
            f2 = 0.0f;
        }
        if((v & 16) != 0) {
            f3 = 1.0f;
        }
        if((v & 0x20) != 0) {
            f4 = 1.0f;
        }
        if((v & 0x40) != 0) {
            f5 = 0.0f;
        }
        if((v & 0x80) != 0) {
            f6 = 0.0f;
        }
        if((v & 0x100) != 0) {
            list0 = VectorKt.getEmptyPath();
        }
        ArrayList arrayList0 = new ArrayList();
        super();
        this.a = s;
        this.b = f;
        this.c = f1;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = list0;
        this.j = arrayList0;
    }
}

