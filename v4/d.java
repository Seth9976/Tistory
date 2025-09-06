package v4;

import a5.b;
import androidx.profileinstaller.ProfileVersion;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import jeb.synthetic.TWR;

public abstract class d {
    public static final byte[] a;
    public static final byte[] b;

    static {
        d.a = new byte[]{0x70, 0x72, 0x6F, 0};
        d.b = new byte[]{0x70, 0x72, 109, 0};
    }

    public static byte[] a(byte[] arr_b) {
        Deflater deflater0 = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try(DeflaterOutputStream deflaterOutputStream0 = new DeflaterOutputStream(byteArrayOutputStream0, deflater0)) {
            deflaterOutputStream0.write(arr_b);
        }
        finally {
            deflater0.end();
        }
        return byteArrayOutputStream0.toByteArray();
    }

    public static byte[] b(a[] arr_a, byte[] arr_b) {
        int v1 = 0;
        for(int v = 0; v < arr_a.length; ++v) {
            a a0 = arr_a[v];
            byte[] arr_b1 = d.d(arr_b, a0.a, a0.b).getBytes(StandardCharsets.UTF_8);
            v1 += (a0.g * 2 + 7 & -8) / 8 + (a0.e * 2 + (arr_b1.length + 16) + a0.f);
        }
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(v1);
        if(Arrays.equals(arr_b, ProfileVersion.c)) {
            for(int v2 = 0; v2 < arr_a.length; ++v2) {
                a a1 = arr_a[v2];
                d.o(byteArrayOutputStream0, a1, d.d(arr_b, a1.a, a1.b));
                d.q(byteArrayOutputStream0, a1);
                int[] arr_v = a1.h;
                int v3 = 0;
                for(int v4 = 0; v3 < arr_v.length; v4 = v5) {
                    int v5 = arr_v[v3];
                    d.s(byteArrayOutputStream0, v5 - v4);
                    ++v3;
                }
                d.p(byteArrayOutputStream0, a1);
            }
        }
        else {
            for(int v6 = 0; v6 < arr_a.length; ++v6) {
                a a2 = arr_a[v6];
                d.o(byteArrayOutputStream0, a2, d.d(arr_b, a2.a, a2.b));
            }
            for(int v7 = 0; v7 < arr_a.length; ++v7) {
                a a3 = arr_a[v7];
                d.q(byteArrayOutputStream0, a3);
                int[] arr_v1 = a3.h;
                int v8 = 0;
                for(int v9 = 0; v8 < arr_v1.length; v9 = v10) {
                    int v10 = arr_v1[v8];
                    d.s(byteArrayOutputStream0, v10 - v9);
                    ++v8;
                }
                d.p(byteArrayOutputStream0, a3);
            }
        }
        if(byteArrayOutputStream0.size() != v1) {
            throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream0.size() + " expected=" + v1);
        }
        return byteArrayOutputStream0.toByteArray();
    }

    public static boolean c(File file0) {
        if(file0.isDirectory()) {
            File[] arr_file = file0.listFiles();
            if(arr_file == null) {
                return false;
            }
            boolean z = true;
            for(int v = 0; v < arr_file.length; ++v) {
                z = d.c(arr_file[v]) && z;
            }
            return z;
        }
        file0.delete();
        return true;
    }

    public static String d(byte[] arr_b, String s, String s1) {
        String s2;
        byte[] arr_b1 = ProfileVersion.e;
        boolean z = Arrays.equals(arr_b, arr_b1);
        byte[] arr_b2 = ProfileVersion.d;
        if(z) {
            s2 = ":";
        }
        else if(!Arrays.equals(arr_b, arr_b2)) {
            s2 = "!";
        }
        else {
            s2 = ":";
        }
        if(s.length() <= 0) {
            if("!".equals(s2)) {
                return s1.replace(":", "!");
            }
            return ":".equals(s2) ? s1.replace("!", ":") : s1;
        }
        if(s1.equals("classes.dex")) {
            return s;
        }
        if(!s1.contains("!") && !s1.contains(":")) {
            if(s1.endsWith(".apk")) {
                return s1;
            }
            StringBuilder stringBuilder0 = b.t(s);
            if(Arrays.equals(arr_b, arr_b1)) {
                return r0.a.o(stringBuilder0, ":", s1);
            }
            return Arrays.equals(arr_b, arr_b2) ? r0.a.o(stringBuilder0, ":", s1) : r0.a.o(stringBuilder0, "!", s1);
        }
        if("!".equals(s2)) {
            return s1.replace(":", "!");
        }
        return ":".equals(s2) ? s1.replace("!", ":") : s1;
    }

    public static byte[] e(InputStream inputStream0, int v) {
        byte[] arr_b = new byte[v];
        for(int v1 = 0; v1 < v; v1 += v2) {
            int v2 = inputStream0.read(arr_b, v1, v - v1);
            if(v2 < 0) {
                throw new IllegalStateException("Not enough bytes to read: " + v);
            }
        }
        return arr_b;
    }

    public static int[] f(ByteArrayInputStream byteArrayInputStream0, int v) {
        int[] arr_v = new int[v];
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += (int)d.l(byteArrayInputStream0, 2);
            arr_v[v1] = v2;
        }
        return arr_v;
    }

    public static byte[] g(FileInputStream fileInputStream0, int v, int v1) {
        int v3;
        Inflater inflater0 = new Inflater();
        try {
            byte[] arr_b = new byte[v1];
            byte[] arr_b1 = new byte[0x800];
            v3 = 0;
            int v4 = 0;
            while(!inflater0.finished() && !inflater0.needsDictionary() && v3 < v) {
                int v5 = fileInputStream0.read(arr_b1);
                if(v5 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + v + " bytes");
                }
                inflater0.setInput(arr_b1, 0, v5);
                try {
                    v4 += inflater0.inflate(arr_b, v4, v1 - v4);
                    v3 += v5;
                }
                catch(DataFormatException dataFormatException0) {
                    throw new IllegalStateException(dataFormatException0.getMessage());
                }
            }
            if(v3 == v) {
                if(!inflater0.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                return arr_b;
            }
        }
        finally {
            inflater0.end();
        }
        throw new IllegalStateException("Didn\'t read enough bytes during decompression. expected=" + v + " actual=" + v3);
    }

    public static a[] h(FileInputStream fileInputStream0, byte[] arr_b, byte[] arr_b1, a[] arr_a) {
        byte[] arr_b2 = ProfileVersion.f;
        if(Arrays.equals(arr_b, arr_b2)) {
            if(Arrays.equals(ProfileVersion.a, arr_b1)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            if(!Arrays.equals(arr_b, arr_b2)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int v = (int)d.l(fileInputStream0, 1);
            long v1 = d.l(fileInputStream0, 4);
            byte[] arr_b3 = d.g(fileInputStream0, ((int)d.l(fileInputStream0, 4)), ((int)v1));
            if(fileInputStream0.read() <= 0) {
                try(ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b3)) {
                    return d.i(byteArrayInputStream0, v, arr_a);
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        if(!Arrays.equals(arr_b, ProfileVersion.g)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int v2 = (int)d.l(fileInputStream0, 2);
        long v3 = d.l(fileInputStream0, 4);
        byte[] arr_b4 = d.g(fileInputStream0, ((int)d.l(fileInputStream0, 4)), ((int)v3));
        if(fileInputStream0.read() <= 0) {
            try(ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(arr_b4)) {
                return d.j(byteArrayInputStream1, arr_b1, v2, arr_a);
            }
        }
        throw new IllegalStateException("Content found after the end of file");
    }

    public static a[] i(ByteArrayInputStream byteArrayInputStream0, int v, a[] arr_a) {
        if(byteArrayInputStream0.available() == 0) {
            return new a[0];
        }
        if(v != arr_a.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] arr_s = new String[v];
        int[] arr_v = new int[v];
        for(int v2 = 0; v2 < v; ++v2) {
            int v3 = (int)d.l(byteArrayInputStream0, 2);
            arr_v[v2] = (int)d.l(byteArrayInputStream0, 2);
            arr_s[v2] = new String(d.e(byteArrayInputStream0, v3), StandardCharsets.UTF_8);
        }
        for(int v1 = 0; v1 < v; ++v1) {
            a a0 = arr_a[v1];
            if(!a0.b.equals(arr_s[v1])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int v4 = arr_v[v1];
            a0.e = v4;
            a0.h = d.f(byteArrayInputStream0, v4);
        }
        return arr_a;
    }

    public static a[] j(ByteArrayInputStream byteArrayInputStream0, byte[] arr_b, int v, a[] arr_a) {
        if(byteArrayInputStream0.available() == 0) {
            return new a[0];
        }
        if(v != arr_a.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for(int v1 = 0; v1 < v; ++v1) {
            d.l(byteArrayInputStream0, 2);
            String s = new String(d.e(byteArrayInputStream0, ((int)d.l(byteArrayInputStream0, 2))), StandardCharsets.UTF_8);
            long v2 = d.l(byteArrayInputStream0, 4);
            int v3 = (int)d.l(byteArrayInputStream0, 2);
            a a0 = null;
            if(arr_a.length > 0) {
                int v4 = s.indexOf("!") >= 0 ? s.indexOf("!") : s.indexOf(":");
                String s1 = v4 <= 0 ? s : s.substring(v4 + 1);
                for(int v5 = 0; v5 < arr_a.length; ++v5) {
                    if(arr_a[v5].b.equals(s1)) {
                        a0 = arr_a[v5];
                        break;
                    }
                }
            }
            if(a0 == null) {
                throw new IllegalStateException("Missing profile key: " + s);
            }
            a0.d = v2;
            int[] arr_v = d.f(byteArrayInputStream0, v3);
            if(Arrays.equals(arr_b, ProfileVersion.e)) {
                a0.e = v3;
                a0.h = arr_v;
            }
        }
        return arr_a;
    }

    public static a[] k(FileInputStream fileInputStream0, byte[] arr_b, String s) {
        if(!Arrays.equals(arr_b, ProfileVersion.b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int v = (int)d.l(fileInputStream0, 1);
        long v1 = d.l(fileInputStream0, 4);
        byte[] arr_b1 = d.g(fileInputStream0, ((int)d.l(fileInputStream0, 4)), ((int)v1));
        if(fileInputStream0.read() <= 0) {
            try(ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b1)) {
                return d.m(byteArrayInputStream0, s, v);
            }
        }
        throw new IllegalStateException("Content found after the end of file");
    }

    public static long l(InputStream inputStream0, int v) {
        byte[] arr_b = d.e(inputStream0, v);
        long v1 = 0L;
        for(int v2 = 0; v2 < v; ++v2) {
            v1 += ((long)(arr_b[v2] & 0xFF)) << v2 * 8;
        }
        return v1;
    }

    public static a[] m(ByteArrayInputStream byteArrayInputStream0, String s, int v) {
        TreeMap treeMap1;
        if(byteArrayInputStream0.available() == 0) {
            return new a[0];
        }
        a[] arr_a = new a[v];
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = (int)d.l(byteArrayInputStream0, 2);
            int v3 = (int)d.l(byteArrayInputStream0, 2);
            long v4 = d.l(byteArrayInputStream0, 4);
            long v5 = d.l(byteArrayInputStream0, 4);
            long v6 = d.l(byteArrayInputStream0, 4);
            String s1 = new String(d.e(byteArrayInputStream0, v2), StandardCharsets.UTF_8);
            TreeMap treeMap0 = new TreeMap();
            arr_a[v1] = new a(s, s1, v5, v3, ((int)v4), ((int)v6), new int[v3], treeMap0);
        }
        for(int v7 = 0; v7 < v; ++v7) {
            a a0 = arr_a[v7];
            int v8 = byteArrayInputStream0.available() - a0.f;
            int v9 = 0;
            while(true) {
                int v10 = byteArrayInputStream0.available();
                treeMap1 = a0.i;
                if(v10 <= v8) {
                    break;
                }
                v9 += (int)d.l(byteArrayInputStream0, 2);
                treeMap1.put(v9, 1);
                for(int v11 = (int)d.l(byteArrayInputStream0, 2); v11 > 0; --v11) {
                    d.l(byteArrayInputStream0, 2);
                    int v12 = (int)d.l(byteArrayInputStream0, 1);
                    if(v12 != 6 && v12 != 7) {
                        while(v12 > 0) {
                            d.l(byteArrayInputStream0, 1);
                            for(int v13 = (int)d.l(byteArrayInputStream0, 1); v13 > 0; --v13) {
                                d.l(byteArrayInputStream0, 2);
                            }
                            --v12;
                        }
                    }
                }
            }
            if(byteArrayInputStream0.available() != v8) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            a0.h = d.f(byteArrayInputStream0, a0.e);
            int v14 = a0.g;
            BitSet bitSet0 = BitSet.valueOf(d.e(byteArrayInputStream0, (v14 * 2 + 7 & -8) / 8));
            for(int v15 = 0; v15 < v14; ++v15) {
                int v16 = bitSet0.get(v15) ? 2 : 0;
                if(bitSet0.get(v15 + v14)) {
                    v16 |= 4;
                }
                if(v16 != 0) {
                    Integer integer0 = (Integer)treeMap1.get(v15);
                    if(integer0 == null) {
                        integer0 = 0;
                    }
                    treeMap1.put(v15, ((int)(v16 | ((int)integer0))));
                }
            }
        }
        return arr_a;
    }

    public static boolean n(ByteArrayOutputStream byteArrayOutputStream0, byte[] arr_b, a[] arr_a) {
        int v14;
        ArrayList arrayList3;
        long v13;
        g g2;
        ArrayList arrayList2;
        byte[] arr_b6;
        byte[] arr_b5;
        g g1;
        g g0;
        ArrayList arrayList1;
        ArrayList arrayList0;
        byte[] arr_b1 = ProfileVersion.a;
        if(Arrays.equals(arr_b, arr_b1)) {
            arrayList0 = new ArrayList(3);
            arrayList1 = new ArrayList(3);
            try(ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream()) {
                d.s(byteArrayOutputStream1, arr_a.length);
                int v2 = 2;
                for(int v1 = 0; true; ++v1) {
                    if(v1 >= arr_a.length) {
                        break;
                    }
                    a a0 = arr_a[v1];
                    d.r(byteArrayOutputStream1, a0.c, 4);
                    d.r(byteArrayOutputStream1, a0.d, 4);
                    d.r(byteArrayOutputStream1, ((long)a0.g), 4);
                    String s = d.d(arr_b1, a0.a, a0.b);
                    Charset charset0 = StandardCharsets.UTF_8;
                    byte[] arr_b2 = s.getBytes(charset0);
                    d.s(byteArrayOutputStream1, arr_b2.length);
                    v2 = v2 + 14 + arr_b2.length;
                    byteArrayOutputStream1.write(s.getBytes(charset0));
                }
                byte[] arr_b3 = byteArrayOutputStream1.toByteArray();
                if(v2 != arr_b3.length) {
                    throw new IllegalStateException("Expected size " + v2 + ", does not match actual size " + arr_b3.length);
                }
                g0 = new g(1, arr_b3, false);
            }
            arrayList0.add(g0);
            try(ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream()) {
                int v3 = 0;
                int v4 = 0;
                for(int v = 0; true; v = 0) {
                    if(v3 >= arr_a.length) {
                        break;
                    }
                    a a1 = arr_a[v3];
                    d.s(byteArrayOutputStream2, v3);
                    d.s(byteArrayOutputStream2, a1.e);
                    v4 = v4 + 4 + a1.e * 2;
                    int[] arr_v = a1.h;
                    for(int v5 = 0; true; v5 = v6) {
                        if(v >= arr_v.length) {
                            break;
                        }
                        int v6 = arr_v[v];
                        d.s(byteArrayOutputStream2, v6 - v5);
                        ++v;
                    }
                    ++v3;
                }
                byte[] arr_b4 = byteArrayOutputStream2.toByteArray();
                if(v4 != arr_b4.length) {
                    throw new IllegalStateException("Expected size " + v4 + ", does not match actual size " + arr_b4.length);
                }
                g1 = new g(3, arr_b4, true);
            }
            arrayList0.add(g1);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int v8 = 0;
            try {
                for(int v7 = 0; v7 < arr_a.length; ++v7) {
                    a a2 = arr_a[v7];
                    int v9 = 0;
                    for(Object object0: a2.i.entrySet()) {
                        v9 |= (int)(((Integer)((Map.Entry)object0).getValue()));
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        d.p(byteArrayOutputStream4, a2);
                        arr_b5 = byteArrayOutputStream4.toByteArray();
                    }
                    catch(Throwable throwable3) {
                        TWR.safeClose$NT(byteArrayOutputStream4, throwable3);
                        throw throwable3;
                    }
                    byteArrayOutputStream4.close();
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        d.q(byteArrayOutputStream5, a2);
                        arr_b6 = byteArrayOutputStream5.toByteArray();
                    }
                    catch(Throwable throwable4) {
                        TWR.safeClose$NT(byteArrayOutputStream5, throwable4);
                        throw throwable4;
                    }
                    byteArrayOutputStream5.close();
                    d.s(byteArrayOutputStream3, v7);
                    int v10 = arr_b5.length + 2 + arr_b6.length;
                    d.r(byteArrayOutputStream3, ((long)v10), 4);
                    d.s(byteArrayOutputStream3, v9);
                    byteArrayOutputStream3.write(arr_b5);
                    byteArrayOutputStream3.write(arr_b6);
                    v8 = v8 + 6 + v10;
                }
                arrayList2 = arrayList1;
                byte[] arr_b7 = byteArrayOutputStream3.toByteArray();
                if(v8 != arr_b7.length) {
                    throw new IllegalStateException("Expected size " + v8 + ", does not match actual size " + arr_b7.length);
                }
                g2 = new g(4, arr_b7, true);
            }
            catch(Throwable throwable2) {
                TWR.safeClose$NT(byteArrayOutputStream3, throwable2);
                throw throwable2;
            }
            byteArrayOutputStream3.close();
            arrayList0.add(g2);
            long v11 = 12L + ((long)(arrayList0.size() * 16));
            d.r(byteArrayOutputStream0, ((long)arrayList0.size()), 4);
            int v12 = 0;
            while(v12 < arrayList0.size()) {
                g g3 = (g)arrayList0.get(v12);
                switch(g3.a) {
                    case 1: {
                        v13 = 0L;
                        break;
                    }
                    case 2: {
                        v13 = 1L;
                        break;
                    }
                    case 3: {
                        v13 = 2L;
                        break;
                    }
                    case 4: {
                        v13 = 3L;
                        break;
                    }
                    case 5: {
                        v13 = 4L;
                        break;
                    }
                    default: {
                        throw null;
                    }
                }
                d.r(byteArrayOutputStream0, v13, 4);
                d.r(byteArrayOutputStream0, v11, 4);
                byte[] arr_b8 = g3.b;
                if(g3.c) {
                    byte[] arr_b9 = d.a(arr_b8);
                    arrayList3 = arrayList2;
                    arrayList3.add(arr_b9);
                    d.r(byteArrayOutputStream0, ((long)arr_b9.length), 4);
                    d.r(byteArrayOutputStream0, ((long)arr_b8.length), 4);
                    v14 = arr_b9.length;
                }
                else {
                    arrayList3 = arrayList2;
                    arrayList3.add(arr_b8);
                    d.r(byteArrayOutputStream0, ((long)arr_b8.length), 4);
                    d.r(byteArrayOutputStream0, 0L, 4);
                    v14 = arr_b8.length;
                }
                v11 += (long)v14;
                ++v12;
                arrayList2 = arrayList3;
            }
            for(int v15 = 0; v15 < arrayList2.size(); ++v15) {
                byteArrayOutputStream0.write(((byte[])arrayList2.get(v15)));
            }
            return true;
        }
        byte[] arr_b10 = ProfileVersion.b;
        if(Arrays.equals(arr_b, arr_b10)) {
            byte[] arr_b11 = d.b(arr_a, arr_b10);
            d.r(byteArrayOutputStream0, ((long)arr_a.length), 1);
            d.r(byteArrayOutputStream0, ((long)arr_b11.length), 4);
            byte[] arr_b12 = d.a(arr_b11);
            d.r(byteArrayOutputStream0, ((long)arr_b12.length), 4);
            byteArrayOutputStream0.write(arr_b12);
            return true;
        }
        byte[] arr_b13 = ProfileVersion.d;
        if(Arrays.equals(arr_b, arr_b13)) {
            d.r(byteArrayOutputStream0, ((long)arr_a.length), 1);
            for(int v16 = 0; v16 < arr_a.length; ++v16) {
                a a3 = arr_a[v16];
                String s1 = d.d(arr_b13, a3.a, a3.b);
                Charset charset1 = StandardCharsets.UTF_8;
                d.s(byteArrayOutputStream0, s1.getBytes(charset1).length);
                d.s(byteArrayOutputStream0, a3.h.length);
                d.r(byteArrayOutputStream0, ((long)(a3.i.size() * 4)), 4);
                d.r(byteArrayOutputStream0, a3.c, 4);
                byteArrayOutputStream0.write(s1.getBytes(charset1));
                for(Object object1: a3.i.keySet()) {
                    d.s(byteArrayOutputStream0, ((int)(((Integer)object1))));
                    d.s(byteArrayOutputStream0, 0);
                }
                int[] arr_v1 = a3.h;
                for(int v17 = 0; v17 < arr_v1.length; ++v17) {
                    d.s(byteArrayOutputStream0, arr_v1[v17]);
                }
            }
            return true;
        }
        byte[] arr_b14 = ProfileVersion.c;
        if(Arrays.equals(arr_b, arr_b14)) {
            byte[] arr_b15 = d.b(arr_a, arr_b14);
            d.r(byteArrayOutputStream0, ((long)arr_a.length), 1);
            d.r(byteArrayOutputStream0, ((long)arr_b15.length), 4);
            byte[] arr_b16 = d.a(arr_b15);
            d.r(byteArrayOutputStream0, ((long)arr_b16.length), 4);
            byteArrayOutputStream0.write(arr_b16);
            return true;
        }
        byte[] arr_b17 = ProfileVersion.e;
        if(Arrays.equals(arr_b, arr_b17)) {
            d.s(byteArrayOutputStream0, arr_a.length);
            for(int v18 = 0; v18 < arr_a.length; ++v18) {
                a a4 = arr_a[v18];
                String s2 = d.d(arr_b17, a4.a, a4.b);
                Charset charset2 = StandardCharsets.UTF_8;
                d.s(byteArrayOutputStream0, s2.getBytes(charset2).length);
                d.s(byteArrayOutputStream0, a4.i.size());
                d.s(byteArrayOutputStream0, a4.h.length);
                d.r(byteArrayOutputStream0, a4.c, 4);
                byteArrayOutputStream0.write(s2.getBytes(charset2));
                for(Object object2: a4.i.keySet()) {
                    d.s(byteArrayOutputStream0, ((int)(((Integer)object2))));
                }
                int[] arr_v2 = a4.h;
                for(int v19 = 0; v19 < arr_v2.length; ++v19) {
                    d.s(byteArrayOutputStream0, arr_v2[v19]);
                }
            }
            return true;
        }
        return false;
    }

    public static void o(ByteArrayOutputStream byteArrayOutputStream0, a a0, String s) {
        Charset charset0 = StandardCharsets.UTF_8;
        d.s(byteArrayOutputStream0, s.getBytes(charset0).length);
        d.s(byteArrayOutputStream0, a0.e);
        d.r(byteArrayOutputStream0, ((long)a0.f), 4);
        d.r(byteArrayOutputStream0, a0.c, 4);
        d.r(byteArrayOutputStream0, ((long)a0.g), 4);
        byteArrayOutputStream0.write(s.getBytes(charset0));
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream0, a a0) {
        byte[] arr_b = new byte[(a0.g * 2 + 7 & -8) / 8];
        for(Object object0: a0.i.entrySet()) {
            int v = (int)(((Integer)((Map.Entry)object0).getKey()));
            int v1 = (int)(((Integer)((Map.Entry)object0).getValue()));
            if((v1 & 2) != 0) {
                arr_b[v / 8] = (byte)(arr_b[v / 8] | 1 << v % 8);
            }
            if((v1 & 4) != 0) {
                int v2 = v + a0.g;
                arr_b[v2 / 8] = (byte)(1 << v2 % 8 | arr_b[v2 / 8]);
            }
        }
        byteArrayOutputStream0.write(arr_b);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream0, a a0) {
        int v = 0;
        for(Object object0: a0.i.entrySet()) {
            int v1 = (int)(((Integer)((Map.Entry)object0).getKey()));
            if((((int)(((Integer)((Map.Entry)object0).getValue()))) & 1) != 0) {
                d.s(byteArrayOutputStream0, v1 - v);
                d.s(byteArrayOutputStream0, 0);
                v = v1;
            }
        }
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream0, long v, int v1) {
        byte[] arr_b = new byte[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_b[v2] = (byte)(((int)(v >> v2 * 8 & 0xFFL)));
        }
        byteArrayOutputStream0.write(arr_b);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream0, int v) {
        d.r(byteArrayOutputStream0, ((long)v), 2);
    }
}

