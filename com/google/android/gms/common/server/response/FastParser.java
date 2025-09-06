package com.google.android.gms.common.server.response;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Stack;
import jeb.synthetic.FIN;

@KeepForSdk
@ShowFirstParty
public class FastParser {
    @KeepForSdk
    @ShowFirstParty
    public static class ParseException extends Exception {
        public ParseException(@NonNull String s) {
            super(s);
        }

        public ParseException(@NonNull String s, @NonNull Throwable throwable0) {
            super("Error instantiating inner object", throwable0);
        }

        public ParseException(@NonNull Throwable throwable0) {
            super(throwable0);
        }
    }

    public final char[] a;
    public final char[] b;
    public final char[] c;
    public final StringBuilder d;
    public final StringBuilder e;
    public final Stack f;
    public static final char[] g;
    public static final char[] h;
    public static final char[] i;
    public static final char[] j;
    public static final char[] k;
    public static final char[] l;
    public static final a m;
    public static final b n;
    public static final c o;
    public static final d p;
    public static final e q;
    public static final f r;
    public static final g s;
    public static final h t;

    static {
        FastParser.g = new char[]{'u', 'l', 'l'};
        FastParser.h = new char[]{'r', 'u', 'e'};
        FastParser.i = new char[]{'r', 'u', 'e', '\"'};
        FastParser.j = new char[]{'a', 'l', 's', 'e'};
        FastParser.k = new char[]{'a', 'l', 's', 'e', '\"'};
        FastParser.l = new char[]{'\n'};
        FastParser.m = (FastParser this, BufferedReader bufferedReader0) -> {
            int v5;
            int v3;
            char[] arr_c = this.c;
            int v = this.d(bufferedReader0, arr_c);
            if(v == 0) {
                return 0;
            }
            if(v <= 0) {
                throw new ParseException("No number to parse");
            }
            int v1 = arr_c[0];
            int v2 = v1 == 45 ? 1 : 0;
            if(v2 < v) {
                v3 = v2 + 1;
                int v4 = Character.digit(arr_c[v2], 10);
                if(v4 < 0) {
                    throw new ParseException("Unexpected non-digit character");
                }
                v5 = -v4;
            }
            else {
                v5 = 0;
                v3 = v2;
            }
            while(v3 < v) {
                int v6 = Character.digit(arr_c[v3], 10);
                if(v6 < 0) {
                    throw new ParseException("Unexpected non-digit character");
                }
                if(v5 < 0xF3333334 || v5 * 10 < (v1 == 45 ? 0x80000000 : 0x80000001) + v6) {
                    throw new ParseException("Number too large");
                }
                v5 = v5 * 10 - v6;
                ++v3;
            }
            if(v2 != 0) {
                if(v3 <= 1) {
                    throw new ParseException("No digits to parse");
                }
                return v5;
            }
            return -v5;
        };
        FastParser.n = (FastParser this, BufferedReader bufferedReader0) -> {
            long v5;
            int v3;
            char[] arr_c = this.c;
            int v = this.d(bufferedReader0, arr_c);
            if(v == 0) {
                return 0L;
            }
            if(v <= 0) {
                throw new ParseException("No number to parse");
            }
            int v1 = 0;
            int v2 = arr_c[0];
            if(v2 == 45) {
                v1 = 1;
            }
            if(v1 < v) {
                v3 = v1 + 1;
                int v4 = Character.digit(arr_c[v1], 10);
                if(v4 < 0) {
                    throw new ParseException("Unexpected non-digit character");
                }
                v5 = (long)(-v4);
            }
            else {
                v5 = 0L;
                v3 = v1;
            }
            while(v3 < v) {
                int v6 = Character.digit(arr_c[v3], 10);
                if(v6 < 0) {
                    throw new ParseException("Unexpected non-digit character");
                }
                if(Long.compare(v5, -922337203685477580L) < 0 || v5 * 10L < (v2 == 45 ? 0x8000000000000000L : 0x8000000000000001L) + ((long)v6)) {
                    throw new ParseException("Number too large");
                }
                v5 = v5 * 10L - ((long)v6);
                ++v3;
            }
            if(v1 != 0) {
                if(v3 <= 1) {
                    throw new ParseException("No digits to parse");
                }
                return v5;
            }
            return -v5;
        };
        FastParser.o = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
        FastParser.p = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        FastParser.q = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
        FastParser.r = (FastParser this, BufferedReader bufferedReader0) -> switch(this.b(bufferedReader0)) {
            case 34: {
                return FastParser.a(bufferedReader0, fastParser0.b, fastParser0.d, null);
            }
            case 110: {
                this.l(bufferedReader0, FastParser.g);
                return null;
            }
            default: {
                throw new ParseException("Expected string");
            }
        };
        FastParser.s = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
        FastParser.t = new h();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public FastParser() {
        this.a = new char[1];
        this.b = new char[0x20];
        this.c = new char[0x400];
        this.d = new StringBuilder(0x20);
        this.e = new StringBuilder(0x400);
        this.f = new Stack();
    }

    public static final String a(BufferedReader bufferedReader0, char[] arr_c, StringBuilder stringBuilder0, char[] arr_c1) {
        stringBuilder0.setLength(0);
        bufferedReader0.mark(arr_c.length);
        boolean z = false;
        int v = 0;
        int v1;
        while((v1 = bufferedReader0.read(arr_c)) != -1) {
            int v2 = 0;
            while(v2 < v1) {
                int v3 = arr_c[v2];
                if(Character.isISOControl(((char)v3))) {
                    if(arr_c1 != null) {
                        int v4 = 0;
                        while(v4 <= 0) {
                            if(arr_c1[v4] == v3) {
                                goto label_17;
                            }
                            ++v4;
                        }
                    }
                    throw new ParseException("Unexpected control character while reading string");
                }
            label_17:
                switch(v3) {
                    case 34: {
                        if(v == 0) {
                            stringBuilder0.append(arr_c, 0, v2);
                            bufferedReader0.reset();
                            bufferedReader0.skip(((long)(v2 + 1)));
                            return z ? JsonUtils.unescapeString(stringBuilder0.toString()) : stringBuilder0.toString();
                        }
                        v = 0;
                        break;
                    }
                    case 92: {
                        v ^= 1;
                        z = true;
                        break;
                    }
                    default: {
                        v = 0;
                    }
                }
                ++v2;
            }
            stringBuilder0.append(arr_c, 0, v1);
            bufferedReader0.mark(arr_c.length);
        }
        throw new ParseException("Unexpected EOF while parsing string");
    }

    public final char b(BufferedReader bufferedReader0) {
        char[] arr_c = this.a;
        if(bufferedReader0.read(arr_c) != -1) {
            while(Character.isWhitespace(arr_c[0])) {
                if(bufferedReader0.read(arr_c) == -1) {
                    return '\u0000';
                }
                if(false) {
                    break;
                }
            }
            return arr_c[0];
        }
        return '\u0000';
    }

    // 检测为 Lambda 实现
    public final int c(BufferedReader bufferedReader0) [...]

    public final int d(BufferedReader bufferedReader0, char[] arr_c) {
        int v;
        char c = this.b(bufferedReader0);
        switch(c) {
            case 0: {
                throw new ParseException("Unexpected EOF");
            }
            case 44: {
                throw new ParseException("Missing value");
            }
            case 110: {
                this.l(bufferedReader0, FastParser.g);
                return 0;
            }
            default: {
                bufferedReader0.mark(0x400);
                if(c == 34) {
                    v = 0;
                    int v1 = 0;
                    while(v < 0x400 && bufferedReader0.read(arr_c, v, 1) != -1) {
                        int v2 = arr_c[v];
                        if(Character.isISOControl(((char)v2))) {
                            throw new ParseException("Unexpected control character while reading string");
                        }
                        if(v2 == 34) {
                            if(v1 == 0) {
                                bufferedReader0.reset();
                                bufferedReader0.skip(((long)(v + 1)));
                                return v;
                            }
                        }
                        else if(v2 == 92) {
                            v1 ^= 1;
                        }
                        else {
                            v1 = 0;
                        }
                        ++v;
                    }
                }
                else {
                    arr_c[0] = c;
                    v = 1;
                    while(v < 0x400 && bufferedReader0.read(arr_c, v, 1) != -1) {
                        int v3 = arr_c[v];
                        if(v3 != 44 && v3 != 0x7D && !Character.isWhitespace(((char)v3)) && arr_c[v] != 93) {
                            ++v;
                            continue;
                        }
                        bufferedReader0.reset();
                        bufferedReader0.skip(((long)(v - 1)));
                        arr_c[v] = '\u0000';
                        return v;
                    }
                }
                throw v == 0x400 ? new ParseException("Absurdly long value") : new ParseException("Unexpected EOF");
            }
        }
    }

    // 检测为 Lambda 实现
    public final long e(BufferedReader bufferedReader0) [...]

    // 检测为 Lambda 实现
    public final String f(BufferedReader bufferedReader0, char[] arr_c, StringBuilder stringBuilder0, char[] arr_c1) [...]

    public final String g(BufferedReader bufferedReader0) {
        Stack stack0 = this.f;
        stack0.push(2);
        int v = this.b(bufferedReader0);
        switch(v) {
            case 34: {
                stack0.push(3);
                String s = FastParser.a(bufferedReader0, this.b, this.d, null);
                this.k(3);
                if(this.b(bufferedReader0) != 58) {
                    throw new ParseException("Expected key/value separator");
                }
                return s;
            }
            case 93: {
                this.k(2);
                this.k(1);
                this.k(5);
                return null;
            }
            case 0x7D: {
                this.k(2);
                return null;
            }
            default: {
                throw new ParseException("Unexpected token: " + ((char)v));
            }
        }
    }

    public final String h(BufferedReader bufferedReader0) {
        bufferedReader0.mark(0x400);
        int v = this.b(bufferedReader0);
        int v1 = 1;
        switch(v) {
            case 34: {
                char[] arr_c = this.a;
                if(bufferedReader0.read(arr_c) == -1) {
                    throw new ParseException("Unexpected EOF while parsing string");
                }
                int v6 = arr_c[0];
                int v7 = 0;
                while(true) {
                    if(v6 == 34) {
                        if(v7 != 0) {
                            v7 = 1;
                            v6 = 34;
                            goto label_72;
                        }
                    label_65:
                        int v8 = this.b(bufferedReader0);
                        switch(v8) {
                            case 44: {
                                this.k(2);
                                return this.g(bufferedReader0);
                            }
                            case 0x7D: {
                                this.k(2);
                                return null;
                            }
                            default: {
                                throw new ParseException("Unexpected token " + ((char)v8));
                            }
                        }
                    }
                label_72:
                    v7 = v6 == 92 ? v7 ^ 1 : 0;
                    if(bufferedReader0.read(arr_c) == -1) {
                        break;
                    }
                    v6 = arr_c[0];
                    if(Character.isISOControl(((char)v6))) {
                        throw new ParseException("Unexpected control character while reading string");
                    }
                }
                throw new ParseException("Unexpected EOF while parsing string");
            }
            case 44: {
                throw new ParseException("Missing value");
            label_6:
                Stack stack0 = this.f;
                switch(v) {
                    case 91: {
                        stack0.push(5);
                        bufferedReader0.mark(0x20);
                        if(this.b(bufferedReader0) == 93) {
                            this.k(5);
                            goto label_65;
                        }
                        bufferedReader0.reset();
                        int v2 = 0;
                        int v3 = 0;
                        while(v1 > 0) {
                            int v4 = this.b(bufferedReader0);
                            if(v4 == 0) {
                                throw new ParseException("Unexpected EOF while parsing array");
                            }
                            if(Character.isISOControl(((char)v4))) {
                                throw new ParseException("Unexpected control character while reading array");
                            }
                            if(v4 == 34) {
                                if(v3 == 0) {
                                    v2 ^= 1;
                                }
                                v4 = 34;
                            }
                            if(v4 == 91) {
                                if(v2 == 0) {
                                    ++v1;
                                }
                                v4 = 91;
                            }
                            if(v4 == 93 && v2 == 0) {
                                --v1;
                            }
                            if(v4 == 92 && v2 != 0) {
                                v3 ^= 1;
                            }
                            else {
                                v3 = 0;
                            }
                        }
                        this.k(5);
                        goto label_65;
                    }
                    case 0x7B: {
                        stack0.push(1);
                        bufferedReader0.mark(0x20);
                        int v5 = this.b(bufferedReader0);
                        if(v5 == 0x7D) {
                            this.k(1);
                            goto label_65;
                        }
                        if(v5 != 34) {
                            throw new ParseException("Unexpected token " + ((char)v5));
                        }
                        bufferedReader0.reset();
                        this.g(bufferedReader0);
                        while(this.h(bufferedReader0) != null) {
                        }
                        this.k(1);
                        goto label_65;
                    }
                    default: {
                        bufferedReader0.reset();
                        this.d(bufferedReader0, this.c);
                        goto label_65;
                    }
                }
            }
            default: {
                goto label_6;
            }
        }
    }

    public final ArrayList i(BufferedReader bufferedReader0, zai zai0) {
        int v = this.b(bufferedReader0);
        if(v == 110) {
            this.l(bufferedReader0, FastParser.g);
            return null;
        }
        if(v == 91) {
            this.f.push(5);
            ArrayList arrayList0 = new ArrayList();
            while(true) {
                bufferedReader0.mark(0x400);
                switch(this.b(bufferedReader0)) {
                    case 0: {
                        throw new ParseException("Unexpected EOF");
                    }
                    case 44: {
                        break;
                    }
                    case 93: {
                        this.k(5);
                        return arrayList0;
                    }
                    default: {
                        bufferedReader0.reset();
                        arrayList0.add(zai0.zaa(this, bufferedReader0));
                        break;
                    }
                }
            }
        }
        throw new ParseException("Expected start of array");
    }

    public final ArrayList j(BufferedReader bufferedReader0, Field fastJsonResponse$Field0) {
        ArrayList arrayList0 = new ArrayList();
        int v = this.b(bufferedReader0);
        switch(v) {
            case 93: {
                this.k(5);
                return arrayList0;
            }
            case 110: {
                this.l(bufferedReader0, FastParser.g);
                this.k(5);
                return null;
            }
            case 0x7B: {
                Stack stack0 = this.f;
                stack0.push(1);
            alab1:
                while(true) {
                    try {
                        FastJsonResponse fastJsonResponse0 = fastJsonResponse$Field0.zad();
                        if(!this.n(bufferedReader0, fastJsonResponse0)) {
                            return arrayList0;
                        }
                        arrayList0.add(fastJsonResponse0);
                    }
                    catch(InstantiationException instantiationException0) {
                        throw new ParseException("Error instantiating inner object", instantiationException0);
                    }
                    catch(IllegalAccessException illegalAccessException0) {
                        throw new ParseException("Error instantiating inner object", illegalAccessException0);
                    }
                    int v1 = this.b(bufferedReader0);
                    switch(v1) {
                        case 44: {
                            if(this.b(bufferedReader0) == 0x7B) {
                                break;
                            }
                            break alab1;
                        }
                        case 93: {
                            this.k(5);
                            return arrayList0;
                        }
                        default: {
                            throw new ParseException("Unexpected token: " + ((char)v1));
                        }
                    }
                    stack0.push(1);
                }
                throw new ParseException("Expected start of next object in array");
            }
            default: {
                throw new ParseException("Unexpected token: " + ((char)v));
            }
        }
    }

    public final void k(int v) {
        Stack stack0 = this.f;
        if(stack0.isEmpty()) {
            throw new ParseException("Expected state " + v + " but had empty stack");
        }
        int v1 = (int)(((Integer)stack0.pop()));
        if(v1 != v) {
            throw new ParseException("Expected state " + v + " but had " + v1);
        }
    }

    public final void l(BufferedReader bufferedReader0, char[] arr_c) {
        for(int v = 0; v < arr_c.length; v += v1) {
            char[] arr_c1 = this.b;
            int v1 = bufferedReader0.read(arr_c1, 0, arr_c.length - v);
            if(v1 == -1) {
                throw new ParseException("Unexpected EOF");
            }
            for(int v2 = 0; v2 < v1; ++v2) {
                if(arr_c[v2 + v] != arr_c1[v2]) {
                    throw new ParseException("Unexpected character");
                }
            }
        }
    }

    public final boolean m(BufferedReader bufferedReader0, boolean z) {
        int v = this.b(bufferedReader0);
        switch(v) {
            case 34: {
                if(z) {
                    throw new ParseException("No boolean value found in string");
                }
                return this.m(bufferedReader0, true);
            }
            case 102: {
                this.l(bufferedReader0, (z ? FastParser.k : FastParser.j));
                return false;
            }
            case 110: {
                this.l(bufferedReader0, FastParser.g);
                return false;
            }
            case 0x74: {
                this.l(bufferedReader0, (z ? FastParser.i : FastParser.h));
                return true;
            }
            default: {
                throw new ParseException("Unexpected token: " + ((char)v));
            }
        }
    }

    public final boolean n(BufferedReader bufferedReader0, FastJsonResponse fastJsonResponse0) {
        int v6;
        Map map0 = fastJsonResponse0.getFieldMappings();
        String s = this.g(bufferedReader0);
        if(s != null) {
            while(s != null) {
                Field fastJsonResponse$Field0 = (Field)map0.get(s);
                if(fastJsonResponse$Field0 == null) {
                    s = this.h(bufferedReader0);
                }
                else {
                    Stack stack0 = this.f;
                    stack0.push(4);
                    int v = fastJsonResponse$Field0.zaa;
                    char[] arr_c = FastParser.l;
                    StringBuilder stringBuilder0 = this.e;
                    char[] arr_c1 = this.c;
                    StringBuilder stringBuilder1 = this.d;
                    char[] arr_c2 = this.b;
                    char[] arr_c3 = FastParser.g;
                    switch(v) {
                        case 0: {
                            if(fastJsonResponse$Field0.zab) {
                                fastJsonResponse0.zav(fastJsonResponse$Field0, this.i(bufferedReader0, FastParser.m));
                            }
                            else {
                                fastJsonResponse0.zau(fastJsonResponse$Field0, this.c(bufferedReader0));
                            }
                            break;
                        }
                        case 1: {
                            if(fastJsonResponse$Field0.zab) {
                                fastJsonResponse0.zag(fastJsonResponse$Field0, this.i(bufferedReader0, FastParser.s));
                            }
                            else {
                                int v1 = this.d(bufferedReader0, arr_c1);
                                fastJsonResponse0.zae(fastJsonResponse$Field0, (v1 == 0 ? null : new BigInteger(new String(arr_c1, 0, v1))));
                            }
                            break;
                        }
                        case 2: {
                            if(fastJsonResponse$Field0.zab) {
                                fastJsonResponse0.zay(fastJsonResponse$Field0, this.i(bufferedReader0, FastParser.n));
                            }
                            else {
                                fastJsonResponse0.zax(fastJsonResponse$Field0, this.e(bufferedReader0));
                            }
                            break;
                        }
                        case 3: {
                            if(fastJsonResponse$Field0.zab) {
                                fastJsonResponse0.zas(fastJsonResponse$Field0, this.i(bufferedReader0, FastParser.o));
                            }
                            else {
                                int v2 = this.d(bufferedReader0, arr_c1);
                                fastJsonResponse0.zaq(fastJsonResponse$Field0, (v2 == 0 ? 0.0f : Float.parseFloat(new String(arr_c1, 0, v2))));
                            }
                            break;
                        }
                        case 4: {
                            if(fastJsonResponse$Field0.zab) {
                                fastJsonResponse0.zao(fastJsonResponse$Field0, this.i(bufferedReader0, FastParser.p));
                            }
                            else {
                                int v3 = this.d(bufferedReader0, arr_c1);
                                fastJsonResponse0.zam(fastJsonResponse$Field0, (v3 == 0 ? 0.0 : Double.parseDouble(new String(arr_c1, 0, v3))));
                            }
                            break;
                        }
                        case 5: {
                            if(fastJsonResponse$Field0.zab) {
                                fastJsonResponse0.zac(fastJsonResponse$Field0, this.i(bufferedReader0, FastParser.t));
                            }
                            else {
                                int v4 = this.d(bufferedReader0, arr_c1);
                                fastJsonResponse0.zaa(fastJsonResponse$Field0, (v4 == 0 ? null : new BigDecimal(new String(arr_c1, 0, v4))));
                            }
                            break;
                        }
                        case 6: {
                            if(fastJsonResponse$Field0.zab) {
                                fastJsonResponse0.zaj(fastJsonResponse$Field0, this.i(bufferedReader0, FastParser.q));
                            }
                            else {
                                fastJsonResponse0.zai(fastJsonResponse$Field0, this.m(bufferedReader0, false));
                            }
                            break;
                        }
                        case 7: {
                            if(fastJsonResponse$Field0.zab) {
                                fastJsonResponse0.zaC(fastJsonResponse$Field0, this.i(bufferedReader0, FastParser.r));
                            }
                            else {
                                fastJsonResponse0.zaA(fastJsonResponse$Field0, this.f(bufferedReader0, arr_c2, stringBuilder1, null));
                            }
                            break;
                        }
                        case 8: {
                            fastJsonResponse0.zal(fastJsonResponse$Field0, Base64Utils.decode(this.f(bufferedReader0, arr_c1, stringBuilder0, arr_c)));
                            break;
                        }
                        case 9: {
                            fastJsonResponse0.zal(fastJsonResponse$Field0, Base64Utils.decodeUrlSafe(this.f(bufferedReader0, arr_c1, stringBuilder0, arr_c)));
                            break;
                        }
                        case 10: {
                            int v5 = this.b(bufferedReader0);
                            if(v5 == 110) {
                                this.l(bufferedReader0, arr_c3);
                                fastJsonResponse0.zaB(fastJsonResponse$Field0, null);
                            }
                            else {
                                if(v5 != 0x7B) {
                                    throw new ParseException("Expected start of a map object");
                                }
                                stack0.push(1);
                                Map map1 = new HashMap();
                            alab1:
                                while(true) {
                                    switch(this.b(bufferedReader0)) {
                                        case 0: {
                                            throw new ParseException("Unexpected EOF");
                                        }
                                        case 34: {
                                            String s1 = FastParser.a(bufferedReader0, arr_c2, stringBuilder1, null);
                                            if(this.b(bufferedReader0) != 58) {
                                                String s2 = String.valueOf(s1);
                                                throw new ParseException((s2.length() == 0 ? new String("No map value found for key ") : "No map value found for key " + s2));
                                            }
                                            if(this.b(bufferedReader0) != 34) {
                                                String s3 = String.valueOf(s1);
                                                throw new ParseException((s3.length() == 0 ? new String("Expected String value for key ") : "Expected String value for key " + s3));
                                            }
                                            ((HashMap)map1).put(s1, FastParser.a(bufferedReader0, arr_c2, stringBuilder1, null));
                                            v6 = this.b(bufferedReader0);
                                            if(v6 == 44) {
                                                break;
                                            }
                                            break alab1;
                                        }
                                        case 0x7D: {
                                            goto label_92;
                                        }
                                    }
                                }
                                if(v6 != 0x7D) {
                                    throw new ParseException("Unexpected character while parsing string map: " + ((char)v6));
                                }
                            label_92:
                                this.k(1);
                                fastJsonResponse0.zaB(fastJsonResponse$Field0, map1);
                            }
                            break;
                        }
                        case 11: {
                            if(fastJsonResponse$Field0.zab) {
                                int v7 = this.b(bufferedReader0);
                                if(v7 == 110) {
                                    this.l(bufferedReader0, arr_c3);
                                    fastJsonResponse0.addConcreteTypeArrayInternal(fastJsonResponse$Field0, fastJsonResponse$Field0.zae, null);
                                }
                                else {
                                    stack0.push(5);
                                    if(v7 != 91) {
                                        throw new ParseException("Expected array start");
                                    }
                                    ArrayList arrayList0 = this.j(bufferedReader0, fastJsonResponse$Field0);
                                    fastJsonResponse0.addConcreteTypeArrayInternal(fastJsonResponse$Field0, fastJsonResponse$Field0.zae, arrayList0);
                                }
                                break;
                            }
                            else {
                                int v8 = this.b(bufferedReader0);
                                if(v8 == 110) {
                                    this.l(bufferedReader0, arr_c3);
                                    fastJsonResponse0.addConcreteTypeInternal(fastJsonResponse$Field0, fastJsonResponse$Field0.zae, null);
                                }
                                else {
                                    stack0.push(1);
                                    if(v8 != 0x7B) {
                                        throw new ParseException("Expected start of object");
                                    }
                                    try {
                                        FastJsonResponse fastJsonResponse1 = fastJsonResponse$Field0.zad();
                                        this.n(bufferedReader0, fastJsonResponse1);
                                        fastJsonResponse0.addConcreteTypeInternal(fastJsonResponse$Field0, fastJsonResponse$Field0.zae, fastJsonResponse1);
                                    }
                                    catch(InstantiationException instantiationException0) {
                                        throw new ParseException("Error instantiating inner object", instantiationException0);
                                    }
                                    catch(IllegalAccessException illegalAccessException0) {
                                        throw new ParseException("Error instantiating inner object", illegalAccessException0);
                                    }
                                }
                            }
                            break;
                        }
                        default: {
                            throw new ParseException("Invalid field type " + v);
                        }
                    }
                    this.k(4);
                    this.k(2);
                    int v9 = this.b(bufferedReader0);
                    switch(v9) {
                        case 44: {
                            s = this.g(bufferedReader0);
                            continue;
                        }
                        case 0x7D: {
                            s = null;
                            continue;
                        }
                        default: {
                            throw new ParseException("Expected end of object or field separator, but found: " + ((char)v9));
                        }
                    }
                }
            }
            this.k(1);
            return true;
        }
        this.k(1);
        return false;
    }

    @KeepForSdk
    public void parse(@NonNull InputStream inputStream0, @NonNull FastJsonResponse fastJsonResponse0) throws ParseException {
        int v;
        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream0), 0x400);
        Stack stack0 = this.f;
        try {
            v = FIN.finallyOpen$NT();
            stack0.push(0);
            int v1 = this.b(bufferedReader0);
            switch(v1) {
                case 0: {
                    FIN.finallyExec$NT(v);
                    throw new ParseException("No data to parse");
                }
                case 91: {
                    stack0.push(5);
                    Map map0 = fastJsonResponse0.getFieldMappings();
                    if(map0.size() != 1) {
                        FIN.finallyExec$NT(v);
                        throw new ParseException("Object array response class must have a single Field");
                    }
                    Object object0 = map0.entrySet().iterator().next();
                    Field fastJsonResponse$Field0 = (Field)((Map.Entry)object0).getValue();
                    ArrayList arrayList0 = this.j(bufferedReader0, fastJsonResponse$Field0);
                    fastJsonResponse0.addConcreteTypeArrayInternal(fastJsonResponse$Field0, fastJsonResponse$Field0.zae, arrayList0);
                    break;
                }
                case 0x7B: {
                    stack0.push(1);
                    this.n(bufferedReader0, fastJsonResponse0);
                    break;
                }
                default: {
                    FIN.finallyExec$NT(v);
                    throw new ParseException("Unexpected token: " + ((char)v1));
                }
            }
            this.k(0);
            goto label_27;
        }
        catch(IOException iOException0) {
        }
        FIN.finallyExec$NT(v);
        throw new ParseException(iOException0);
        try {
        label_27:
            FIN.finallyCodeBegin$NT(v);
            bufferedReader0.close();
        }
        catch(IOException unused_ex) {
            Log.w("FastParser", "Failed to close reader while parsing.");
            FIN.finallyCodeEnd$NT(v);
        }
    }
}

