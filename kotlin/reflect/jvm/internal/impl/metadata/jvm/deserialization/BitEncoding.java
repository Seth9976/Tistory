package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import org.jetbrains.annotations.NotNull;

public class BitEncoding {
    static {
        String s = null;
        try {
            s = System.getProperty("kotlin.jvm.serialization.use8to7");
        }
        catch(SecurityException unused_ex) {
        }
        "true".equals(s);
    }

    public static void a(int v) {
        IllegalStateException illegalStateException0;
        int v1;
        String s;
        switch(v) {
            case 1: 
            case 3: 
            case 6: 
            case 8: 
            case 10: 
            case 12: 
            case 14: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 1: 
            case 3: 
            case 6: 
            case 8: 
            case 10: 
            case 12: 
            case 14: {
                v1 = 2;
                break;
            }
            default: {
                v1 = 3;
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 1: 
            case 3: 
            case 6: 
            case 8: 
            case 10: 
            case 12: 
            case 14: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
                break;
            }
            default: {
                arr_object[0] = "data";
            }
        }
        switch(v) {
            case 1: {
                arr_object[1] = "encodeBytes";
                break;
            }
            case 3: {
                arr_object[1] = "encode8to7";
                break;
            }
            case 6: {
                arr_object[1] = "splitBytesToStringArray";
                break;
            }
            case 8: {
                arr_object[1] = "decodeBytes";
                break;
            }
            case 10: {
                arr_object[1] = "dropMarker";
                break;
            }
            case 12: {
                arr_object[1] = "combineStringArrayIntoBytes";
                break;
            }
            case 14: {
                arr_object[1] = "decode7to8";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
            }
        }
        switch(v) {
            case 2: {
                arr_object[2] = "encode8to7";
                break;
            }
            case 4: {
                arr_object[2] = "addModuloByte";
                break;
            }
            case 5: {
                arr_object[2] = "splitBytesToStringArray";
                break;
            }
            case 7: {
                arr_object[2] = "decodeBytes";
                break;
            }
            case 9: {
                arr_object[2] = "dropMarker";
                break;
            }
            case 11: {
                arr_object[2] = "combineStringArrayIntoBytes";
                break;
            }
            case 13: {
                arr_object[2] = "decode7to8";
                break;
            }
            case 1: 
            case 3: 
            case 6: 
            case 8: 
            case 10: 
            case 12: 
            case 14: {
                break;
            }
            default: {
                arr_object[2] = "encodeBytes";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 1: 
            case 3: 
            case 6: 
            case 8: 
            case 10: 
            case 12: 
            case 14: {
                illegalStateException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalStateException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalStateException0;
    }

    @NotNull
    public static byte[] decodeBytes(@NotNull String[] arr_s) {
        if(arr_s != null) {
            if(arr_s.length > 0 && !arr_s[0].isEmpty()) {
                int v = arr_s[0].charAt(0);
                if(v == 0) {
                    String[] arr_s1 = (String[])arr_s.clone();
                    arr_s1[0] = arr_s1[0].substring(1);
                    byte[] arr_b = UtfEncodingKt.stringsToBytes(arr_s1);
                    if(arr_b != null) {
                        return arr_b;
                    }
                    BitEncoding.a(8);
                    throw null;
                }
                if(v == 0xFFFF) {
                    arr_s = (String[])arr_s.clone();
                    arr_s[0] = arr_s[0].substring(1);
                }
            }
            int v2 = 0;
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                v2 += arr_s[v1].length();
            }
            byte[] arr_b1 = new byte[v2];
            for(int v3 = 0; v3 < arr_s.length; ++v3) {
                String s = arr_s[v3];
                int v5 = s.length();
                int v6 = 0;
                for(int v4 = 0; v6 < v5; ++v4) {
                    arr_b1[v4] = (byte)s.charAt(v6);
                    ++v6;
                }
            }
            for(int v7 = 0; v7 < v2; ++v7) {
                arr_b1[v7] = (byte)(arr_b1[v7] + 0x7F & 0x7F);
            }
            int v8 = v2 * 7 / 8;
            byte[] arr_b2 = new byte[v8];
            int v10 = 0;
            int v11 = 0;
            for(int v9 = 0; v9 < v8; ++v9) {
                arr_b2[v9] = (byte)(((arr_b1[v10] & 0xFF) >>> v11) + ((arr_b1[v10 + 1] & (1 << v11 + 1) - 1) << 7 - v11));
                if(v11 == 6) {
                    v10 += 2;
                    v11 = 0;
                }
                else {
                    ++v10;
                    ++v11;
                }
            }
            return arr_b2;
        }
        BitEncoding.a(7);
        throw null;
    }
}

