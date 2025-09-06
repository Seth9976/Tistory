package androidx.core.view;

import androidx.compose.foundation.layout.e4;

public abstract class z1 {
    public static int a(int v) {
        int v1 = 0;
        for(int v2 = 1; v2 <= 0x100; v2 <<= 1) {
            if((v & v2) != 0) {
                switch(v2) {
                    case 1: {
                        v1 |= m1.b();
                        break;
                    }
                    case 2: {
                        v1 |= m1.s();
                        break;
                    }
                    case 4: {
                        v1 |= m1.x();
                        break;
                    }
                    case 8: {
                        v1 |= e4.b();
                        break;
                    }
                    case 16: {
                        v1 |= m1.z();
                        break;
                    }
                    case 0x20: {
                        v1 |= m1.B();
                        break;
                    }
                    case 0x40: {
                        v1 |= m1.C();
                        break;
                    }
                    case 0x80: {
                        v1 |= m1.D();
                    }
                }
            }
        }
        return v1;
    }
}

