package j2;

import com.squareup.moshi.f0;

public final class d {
    public final int a;
    public int b;
    public Object c;
    public int d;
    public int e;

    public d(int v) {
        this.a = v;
        super();
    }

    public void a(f0 f00) {
        f00.c = null;
        f00.a = null;
        f00.b = null;
        f00.i = 1;
        int v = this.b;
        if(v > 0) {
            int v1 = this.e;
            if((v1 & 1) == 0) {
                this.e = v1 + 1;
                this.b = v - 1;
                ++this.d;
            }
        }
        f00.a = (f0)this.c;
        this.c = f00;
        int v2 = this.e;
        this.e = v2 + 1;
        int v3 = this.b;
        if(v3 > 0 && (v2 + 1 & 1) == 0) {
            this.e = v2 + 2;
            this.b = v3 - 1;
            ++this.d;
        }
        for(int v4 = 4; (this.e & v4 - 1) == v4 - 1; v4 *= 2) {
            int v5 = this.d;
            if(v5 == 0) {
                f0 f01 = (f0)this.c;
                f0 f02 = f01.a;
                f0 f03 = f02.a;
                f02.a = f03.a;
                this.c = f02;
                f02.b = f03;
                f02.c = f01;
                f02.i = f01.i + 1;
                f03.a = f02;
                f01.a = f02;
            }
            else {
                switch(v5) {
                    case 1: {
                        f0 f04 = (f0)this.c;
                        this.c = f04.a;
                        f04.a.c = f04;
                        f04.a.i = f04.i + 1;
                        f04.a = f04.a;
                        this.d = 0;
                        break;
                    }
                    case 2: {
                        this.d = 0;
                    }
                }
            }
        }
    }

    public int b() {
        return this.e - this.d;
    }

    @Override
    public String toString() {
        switch(this.a) {
            case 0: {
                return "";
            }
            case 1: {
                return "";
            }
            default: {
                return super.toString();
            }
        }
    }
}

