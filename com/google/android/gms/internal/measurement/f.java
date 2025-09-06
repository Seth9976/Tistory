package com.google.android.gms.internal.measurement;

public final class f implements zzbu {
    public static boolean a(byte[] arr_b, int v, int v1) {
        while(v < v1 && arr_b[v] >= 0) {
            ++v;
        }
        if(v < v1) {
            while(v < v1) {
                int v2 = v + 1;
                int v3 = arr_b[v];
                if(v3 < 0) {
                    if(v3 < 0xFFFFFFE0) {
                        if(v2 >= v1) {
                            return v3 == 0;
                        }
                        else if(v3 >= -62) {
                            v += 2;
                            if(arr_b[v2] <= -65) {
                                continue;
                            }
                            return false;
                        }
                    }
                    else if(v3 < -16) {
                        if(v2 >= v1 - 1) {
                            return f2.a(arr_b, v2, v1) == 0;
                        }
                        int v4 = v + 2;
                        int v5 = arr_b[v2];
                        if(v5 <= -65 && (v3 != 0xFFFFFFE0 || v5 >= 0xFFFFFFA0) && (v3 != -19 || v5 < 0xFFFFFFA0)) {
                            v += 3;
                            if(arr_b[v4] <= -65) {
                                continue;
                            }
                            return false;
                        }
                    }
                    else {
                        if(v2 >= v1 - 2) {
                            return f2.a(arr_b, v2, v1) == 0;
                        }
                        int v6 = arr_b[v2];
                        if(v6 <= -65 && v6 + 0x70 + (v3 << 28) >> 30 == 0) {
                            int v7 = v + 3;
                            if(arr_b[v + 2] <= -65) {
                                v += 4;
                                if(arr_b[v7] <= -65) {
                                    continue;
                                }
                                return false;
                            }
                        }
                    }
                    return false;
                }
                v = v2;
            }
        }
        return true;
    }
}

