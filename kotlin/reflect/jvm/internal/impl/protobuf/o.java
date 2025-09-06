package kotlin.reflect.jvm.internal.impl.protobuf;

public abstract class o {
    public static final m a;
    public static final n b;

    static {
        o.a = new m();  // 初始化器: Ljava/lang/Object;-><init>()V
        o.b = new n();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static int a(int v, int v1) {
        return v > -12 || v1 > -65 ? -1 : v ^ v1 << 8;
    }

    public static int b(byte[] arr_b, int v, int v1) {
        int v2 = arr_b[v - 1];
        switch(v1 - v) {
            case 0: {
                return v2 <= -12 ? v2 : -1;
            }
            case 1: {
                return o.a(v2, arr_b[v]);
            }
            case 2: {
                int v3 = arr_b[v];
                int v4 = arr_b[v + 1];
                return v2 > -12 || v3 > -65 || v4 > -65 ? -1 : v3 << 8 ^ v2 ^ v4 << 16;
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    public static int c(byte[] arr_b, int v, int v1) {
        int v2;
        while(v < v1 && arr_b[v] >= 0) {
            v2 = 0;
            ++v;
        }
        if(v < v1) {
            while(v < v1) {
                int v3 = v + 1;
                int v4 = arr_b[v];
                if(v4 < 0) {
                    if(v4 < 0xFFFFFFE0) {
                        if(v3 >= v1) {
                            return v4;
                        }
                        if(v4 >= -62) {
                            v += 2;
                            if(arr_b[v3] <= -65) {
                                continue;
                            }
                            return -1;
                        }
                    }
                    else if(v4 < -16) {
                        if(v3 >= v1 - 1) {
                            return o.b(arr_b, v3, v1);
                        }
                        int v5 = v + 2;
                        int v6 = arr_b[v3];
                        if(v6 <= -65 && (v4 != 0xFFFFFFE0 || v6 >= 0xFFFFFFA0) && (v4 != -19 || v6 < 0xFFFFFFA0)) {
                            v += 3;
                            if(arr_b[v5] <= -65) {
                                continue;
                            }
                            return -1;
                        }
                    }
                    else {
                        if(v3 >= v1 - 2) {
                            return o.b(arr_b, v3, v1);
                        }
                        int v7 = arr_b[v3];
                        if(v7 <= -65 && v7 + 0x70 + (v4 << 28) >> 30 == 0) {
                            int v8 = v + 3;
                            if(arr_b[v + 2] <= -65) {
                                v += 4;
                                if(arr_b[v8] <= -65) {
                                    continue;
                                }
                                return -1;
                            }
                        }
                    }
                    return -1;
                }
                v = v3;
            }
        }
        return v2;
    }
}

