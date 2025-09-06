package com.google.gson.stream;

import a5.b;
import com.google.gson.internal.JsonReaderInternalAccess;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import kotlin.text.q;

public class JsonReader implements Closeable {
    public final Reader a;
    public boolean b;
    public final char[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public long i;
    public int j;
    public String k;
    public int[] l;
    public int m;
    public String[] n;
    public int[] o;

    static {
        JsonReaderInternalAccess.INSTANCE = new a();  // 初始化器: Lcom/google/gson/internal/JsonReaderInternalAccess;-><init>()V
    }

    public JsonReader(Reader reader0) {
        this.b = false;
        this.c = new char[0x400];
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        int[] arr_v = new int[0x20];
        this.l = arr_v;
        this.m = 1;
        arr_v[0] = 6;
        this.n = new String[0x20];
        this.o = new int[0x20];
        Objects.requireNonNull(reader0, "in == null");
        this.a = reader0;
    }

    public final void a() {
        if(this.b) {
            return;
        }
        this.o("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final int b() {
        int v20;
        int v23;
        int v9;
        String s1;
        String s;
        int[] arr_v = this.l;
        int v = this.m - 1;
        int v1 = arr_v[v];
        char[] arr_c = this.c;
        if(v1 == 1) {
            arr_v[v] = 2;
        }
        else if(v1 == 2) {
            switch(this.g(true)) {
                case 44: {
                    break;
                }
                case 59: {
                    this.a();
                    break;
                }
                case 93: {
                    this.h = 4;
                    return 4;
                }
                default: {
                    this.o("Unterminated array");
                    throw null;
                }
            }
        }
        else {
            switch(v1) {
                case 4: {
                    arr_v[v] = 5;
                    int v3 = this.g(true);
                    if(v3 != 58) {
                        if(v3 != 61) {
                            this.o("Expected \':\'");
                            throw null;
                        }
                        this.a();
                        if(this.d < this.e || this.c(1)) {
                            int v4 = this.d;
                            if(arr_c[v4] == 62) {
                                this.d = v4 + 1;
                                break;
                            }
                        }
                    }
                    break;
                }
                case 3: 
                case 5: {
                    arr_v[v] = 4;
                    if(v1 == 5) {
                        switch(this.g(true)) {
                            case 44: {
                                break;
                            }
                            case 59: {
                                this.a();
                                break;
                            }
                            case 0x7D: {
                                this.h = 2;
                                return 2;
                            }
                            default: {
                                this.o("Unterminated object");
                                throw null;
                            }
                        }
                    }
                    int v2 = this.g(true);
                    switch(v2) {
                        case 34: {
                            this.h = 13;
                            return 13;
                        }
                        case 39: {
                            this.a();
                            this.h = 12;
                            return 12;
                        }
                        default: {
                            if(v2 != 0x7D) {
                                this.a();
                                --this.d;
                                if(this.e(((char)v2))) {
                                    this.h = 14;
                                    return 14;
                                }
                                this.o("Expected name");
                                throw null;
                            }
                            if(v1 != 5) {
                                this.h = 2;
                                return 2;
                            }
                            this.o("Expected name");
                            throw null;
                        }
                    }
                }
                case 6: {
                    if(this.b) {
                        this.g(true);
                        int v5 = this.d;
                        this.d = v5 - 1;
                        if(v5 + 4 <= this.e || this.c(5)) {
                            int v6 = this.d;
                            if(arr_c[v6] == 41 && arr_c[v6 + 1] == 93 && arr_c[v6 + 2] == 0x7D && arr_c[v6 + 3] == 39 && arr_c[v6 + 4] == 10) {
                                this.d = v6 + 5;
                            }
                        }
                    }
                    this.l[this.m - 1] = 7;
                    break;
                }
                case 7: {
                    if(this.g(false) == -1) {
                        this.h = 17;
                        return 17;
                    }
                    this.a();
                    --this.d;
                    break;
                }
                case 8: {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int v7 = this.g(true);
        switch(v7) {
            case 34: {
                this.h = 9;
                return 9;
            }
            case 39: {
                this.a();
                this.h = 8;
                return 8;
            }
            case 44: 
            case 59: {
                break;
            }
            case 91: {
                this.h = 3;
                return 3;
            }
            case 93: {
                if(v1 == 1) {
                    this.h = 4;
                    return 4;
                }
                break;
            }
            default: {
                if(v7 != 0x7B) {
                    int v8 = this.d - 1;
                    this.d = v8;
                    switch(arr_c[v8]) {
                        case 70: 
                        case 102: {
                            s = "false";
                            s1 = "FALSE";
                            v9 = 6;
                            break;
                        }
                        case 78: 
                        case 110: {
                            s = "null";
                            s1 = "NULL";
                            v9 = 7;
                            break;
                        }
                        case 84: 
                        case 0x74: {
                            s = "true";
                            s1 = "TRUE";
                            v9 = 5;
                            break;
                        }
                        default: {
                            v9 = 0;
                            goto label_106;
                        }
                    }
                    int v10 = s.length();
                    int v11 = 1;
                    while(v11 < v10) {
                        if(this.d + v11 < this.e || this.c(v11 + 1)) {
                            int v12 = arr_c[this.d + v11];
                            if(v12 != s.charAt(v11) && v12 != s1.charAt(v11)) {
                                v9 = 0;
                                goto label_106;
                            }
                            ++v11;
                            continue;
                        }
                        v9 = 0;
                        goto label_106;
                    }
                    if((this.d + v10 < this.e || this.c(v10 + 1)) && this.e(arr_c[this.d + v10])) {
                        v9 = 0;
                    }
                    else {
                        this.d += v10;
                        this.h = v9;
                    }
                label_106:
                    if(v9 != 0) {
                        return v9;
                    }
                    int v13 = this.d;
                    int v14 = this.e;
                    int v15 = 0;
                    int v16 = 0;
                    boolean z = false;
                    int v17 = 1;
                    long v18 = 0L;
                alab1:
                    while(true) {
                        if(v13 + v16 != v14) {
                        label_120:
                            int v19 = arr_c[v13 + v16];
                            switch(v19) {
                                case 43: {
                                    v20 = v14;
                                    if(v15 == 5) {
                                        v15 = 6;
                                        ++v16;
                                        v14 = v20;
                                        continue;
                                    }
                                    break;
                                }
                                case 45: {
                                    v20 = v14;
                                    if(v15 == 0) {
                                        v15 = 1;
                                        z = true;
                                        ++v16;
                                        v14 = v20;
                                        continue;
                                    }
                                    else if(v15 == 5) {
                                        v15 = 6;
                                        ++v16;
                                        v14 = v20;
                                        continue;
                                    }
                                    break;
                                }
                                case 46: {
                                    v20 = v14;
                                    if(v15 == 2) {
                                        v15 = 3;
                                        ++v16;
                                        v14 = v20;
                                        continue;
                                    }
                                    break;
                                }
                                case 69: 
                                case 101: {
                                    if(v15 == 2 || v15 == 4) {
                                        v15 = 5;
                                        ++v16;
                                        continue;
                                    }
                                    break;
                                }
                                default: {
                                    if(v19 < 0x30 || v19 > 57) {
                                        if(!this.e(((char)v19))) {
                                        label_144:
                                            if(v15 == 2 && v17 != 0 && (v18 != 0x8000000000000000L || z) && (v18 != 0L || !z)) {
                                                if(!z) {
                                                    v18 = -v18;
                                                }
                                                this.i = v18;
                                                this.d += v16;
                                                v23 = 15;
                                                this.h = 15;
                                                break alab1;
                                            }
                                            if(v15 == 2 || v15 == 4 || v15 == 7) {
                                                this.j = v16;
                                                v23 = 16;
                                                this.h = 16;
                                                break alab1;
                                            }
                                        }
                                    }
                                    else if(v15 == 0 || v15 == 1) {
                                        v20 = v14;
                                        v18 = (long)(-(v19 - 0x30));
                                        v15 = 2;
                                        ++v16;
                                        v14 = v20;
                                        continue;
                                    }
                                    else if(v15 != 2) {
                                        v20 = v14;
                                        if(v15 == 3) {
                                            v15 = 4;
                                        }
                                        else if(v15 == 5 || v15 == 6) {
                                            v15 = 7;
                                        }
                                        ++v16;
                                        v14 = v20;
                                        continue;
                                    }
                                    else if(v18 != 0L) {
                                        v20 = v14;
                                        long v21 = 10L * v18 - ((long)(v19 - 0x30));
                                        int v22 = Long.compare(v18, -922337203685477580L);
                                        v17 &= (v22 > 0 || v22 == 0 && v21 < v18 ? 1 : 0);
                                        v18 = v21;
                                        ++v16;
                                        v14 = v20;
                                        continue;
                                    }
                                }
                            }
                        }
                        else if(v16 != arr_c.length) {
                            if(this.c(v16 + 1)) {
                                v14 = this.e;
                                v13 = this.d;
                            }
                            else {
                                goto label_144;
                            }
                            goto label_120;
                        }
                        v23 = 0;
                        break;
                    }
                    if(v23 != 0) {
                        return v23;
                    }
                    if(this.e(arr_c[this.d])) {
                        this.a();
                        this.h = 10;
                        return 10;
                    }
                    this.o("Expected value");
                    throw null;
                }
                this.h = 1;
                return 1;
            }
        }
        if(v1 != 1 && v1 != 2) {
            this.o("Unexpected value");
            throw null;
        }
        this.a();
        --this.d;
        this.h = 7;
        return 7;
    }

    public void beginArray() throws IOException {
        if((this.h == 0 ? this.b() : this.h) != 3) {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + this.peek() + this.f());
        }
        this.j(1);
        this.o[this.m - 1] = 0;
        this.h = 0;
    }

    public void beginObject() throws IOException {
        if((this.h == 0 ? this.b() : this.h) != 1) {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + this.peek() + this.f());
        }
        this.j(3);
        this.h = 0;
    }

    public final boolean c(int v) {
        int v1 = this.d;
        this.g -= v1;
        int v2 = this.e;
        char[] arr_c = this.c;
        if(v2 == v1) {
            this.e = 0;
        }
        else {
            int v3 = v2 - v1;
            this.e = v3;
            System.arraycopy(arr_c, v1, arr_c, 0, v3);
        }
        this.d = 0;
        int v4;
        while((v4 = this.a.read(arr_c, this.e, arr_c.length - this.e)) != -1) {
            int v5 = this.e + v4;
            this.e = v5;
            if(this.f == 0 && this.g == 0 && v5 > 0 && arr_c[0] == 0xFEFF) {
                ++this.d;
                this.g = 1;
                ++v;
            }
            if(v5 >= v) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void close() throws IOException {
        this.h = 0;
        this.l[0] = 8;
        this.m = 1;
        this.a.close();
    }

    public final String d(boolean z) {
        StringBuilder stringBuilder0 = new StringBuilder("$");
        for(int v = 0; true; ++v) {
            int v1 = this.m;
            if(v >= v1) {
                break;
            }
            switch(this.l[v]) {
                case 1: 
                case 2: {
                    int v2 = this.o[v];
                    if(z && v2 > 0 && v == v1 - 1) {
                        --v2;
                    }
                    stringBuilder0.append('[');
                    stringBuilder0.append(v2);
                    stringBuilder0.append(']');
                    break;
                }
                case 3: 
                case 4: 
                case 5: {
                    stringBuilder0.append('.');
                    String s = this.n[v];
                    if(s != null) {
                        stringBuilder0.append(s);
                    }
                }
            }
        }
        return stringBuilder0.toString();
    }

    public final boolean e(char c) {
        switch(c) {
            case 35: 
            case 0x2F: 
            case 59: 
            case 61: 
            case 92: {
                this.a();
                break;
            }
            case 9: 
            case 10: 
            case 12: 
            case 13: 
            case 0x20: 
            case 44: 
            case 58: 
            case 91: 
            case 93: 
            case 0x7B: 
            case 0x7D: {
                break;
            }
            default: {
                return true;
            }
        }
        return false;
    }

    public void endArray() throws IOException {
        if((this.h == 0 ? this.b() : this.h) != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + this.peek() + this.f());
        }
        int v = this.m;
        this.m = v - 1;
        ++this.o[v - 2];
        this.h = 0;
    }

    public void endObject() throws IOException {
        if((this.h == 0 ? this.b() : this.h) != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + this.peek() + this.f());
        }
        int v = this.m;
        this.m = v - 1;
        this.n[v - 1] = null;
        ++this.o[v - 2];
        this.h = 0;
    }

    final String f() {
        StringBuilder stringBuilder0 = q.u(" at line ", this.f + 1, " column ", this.d - this.g + 1, " path ");
        stringBuilder0.append(this.getPath());
        return stringBuilder0.toString();
    }

    public final int g(boolean z) {
        int v = this.d;
        int v1 = this.e;
        while(true) {
            if(v == v1) {
                this.d = v;
                if(!this.c(1)) {
                    if(z) {
                        throw new EOFException("End of input" + this.f());
                    }
                    return -1;
                }
                v = this.d;
                v1 = this.e;
            }
            char[] arr_c = this.c;
            int v2 = arr_c[v];
            switch(v2) {
                case 10: {
                    ++this.f;
                    this.g = v + 1;
                    break;
                }
                case 9: 
                case 13: 
                case 0x20: {
                    break;
                }
                case 35: {
                    this.d = v + 1;
                    this.a();
                    this.m();
                    v = this.d;
                    v1 = this.e;
                    continue;
                }
                case 0x2F: {
                    this.d = v + 1;
                    if(v + 1 == v1) {
                        this.d = v;
                        boolean z1 = this.c(2);
                        ++this.d;
                        if(!z1) {
                            return 0x2F;
                        }
                    }
                    this.a();
                    int v3 = this.d;
                    switch(arr_c[v3]) {
                        case 42: {
                            this.d = v3 + 1;
                        alab1:
                            while(true) {
                                if(this.d + 2 > this.e && !this.c(2)) {
                                    this.o("Unterminated comment");
                                    throw null;
                                }
                                int v4 = this.d;
                                if(arr_c[v4] == 10) {
                                    ++this.f;
                                    this.g = v4 + 1;
                                }
                                else {
                                    for(int v5 = 0; true; ++v5) {
                                        if(v5 >= 2) {
                                            break alab1;
                                        }
                                        if(arr_c[this.d + v5] != "*/".charAt(v5)) {
                                            break;
                                        }
                                    }
                                }
                                ++this.d;
                            }
                            v = this.d + 2;
                            v1 = this.e;
                            break;
                        }
                        case 0x2F: {
                            this.d = v3 + 1;
                            this.m();
                            v = this.d;
                            v1 = this.e;
                            break;
                        }
                        default: {
                            return 0x2F;
                        }
                    }
                    continue;
                }
                default: {
                    this.d = v + 1;
                    return v2;
                }
            }
            ++v;
        }
    }

    public String getPath() {
        return this.d(false);
    }

    public String getPreviousPath() {
        return this.d(true);
    }

    public final String h(char c) {
        char[] arr_c;
        int v3;
        StringBuilder stringBuilder0 = null;
        do {
            int v = this.d;
            int v1 = this.e;
        alab1:
            while(true) {
                int v2 = v1;
                v3 = v;
                while(true) {
                    arr_c = this.c;
                    if(v >= v2) {
                        break alab1;
                    }
                    int v4 = arr_c[v];
                    if(v4 == c) {
                        this.d = v + 1;
                        int v5 = v + 1 - v3 - 1;
                        if(stringBuilder0 == null) {
                            return new String(arr_c, v3, v5);
                        }
                        stringBuilder0.append(arr_c, v3, v5);
                        return stringBuilder0.toString();
                    }
                    switch(v4) {
                        case 10: {
                            ++this.f;
                            this.g = v + 1;
                            ++v;
                            continue;
                        }
                        case 92: {
                            break;
                        }
                        default: {
                            ++v;
                            continue;
                        }
                    }
                    this.d = v + 1;
                    int v6 = v + 1 - v3;
                    if(stringBuilder0 == null) {
                        stringBuilder0 = new StringBuilder(Math.max(v6 * 2, 16));
                    }
                    stringBuilder0.append(arr_c, v3, v6 - 1);
                    stringBuilder0.append(this.k());
                    v = this.d;
                    v1 = this.e;
                    break;
                }
            }
            if(stringBuilder0 == null) {
                stringBuilder0 = new StringBuilder(Math.max((v - v3) * 2, 16));
            }
            stringBuilder0.append(arr_c, v3, v - v3);
            this.d = v;
        }
        while(this.c(1));
        this.o("Unterminated string");
        throw null;
    }

    public boolean hasNext() throws IOException {
        int v = this.h == 0 ? this.b() : this.h;
        return v != 2 && v != 4 && v != 17;
    }

    public final String i() {
        String s;
        char[] arr_c;
        StringBuilder stringBuilder0 = null;
        int v = 0;
        do {
            int v1 = 0;
        alab1:
            while(true) {
                int v2 = this.d;
                arr_c = this.c;
                if(v2 + v1 < this.e) {
                    switch(arr_c[v2 + v1]) {
                        case 35: 
                        case 0x2F: 
                        case 59: 
                        case 61: 
                        case 92: {
                            this.a();
                            break alab1;
                        }
                        case 9: 
                        case 10: 
                        case 12: 
                        case 13: 
                        case 0x20: 
                        case 44: 
                        case 58: 
                        case 91: 
                        case 93: 
                        case 0x7B: 
                        case 0x7D: {
                            break alab1;
                        }
                        default: {
                            ++v1;
                            continue;
                        }
                    }
                }
                if(v1 >= arr_c.length) {
                    goto label_15;
                }
                if(!this.c(v1 + 1)) {
                    break;
                }
            }
            v = v1;
            break;
        label_15:
            if(stringBuilder0 == null) {
                stringBuilder0 = new StringBuilder(Math.max(v1, 16));
            }
            stringBuilder0.append(arr_c, this.d, v1);
            this.d += v1;
        }
        while(this.c(1));
        if(stringBuilder0 == null) {
            s = new String(arr_c, this.d, v);
        }
        else {
            stringBuilder0.append(arr_c, this.d, v);
            s = stringBuilder0.toString();
        }
        this.d += v;
        return s;
    }

    public final boolean isLenient() {
        return this.b;
    }

    public final void j(int v) {
        int v1 = this.m;
        int[] arr_v = this.l;
        if(v1 == arr_v.length) {
            this.l = Arrays.copyOf(arr_v, v1 * 2);
            this.o = Arrays.copyOf(this.o, v1 * 2);
            this.n = (String[])Arrays.copyOf(this.n, v1 * 2);
        }
        int v2 = this.m;
        this.m = v2 + 1;
        this.l[v2] = v;
    }

    public final char k() {
        int v4;
        if(this.d == this.e && !this.c(1)) {
            this.o("Unterminated escape sequence");
            throw null;
        }
        int v = this.d;
        this.d = v + 1;
        char[] arr_c = this.c;
        char c = arr_c[v];
        switch(c) {
            case 10: {
                ++this.f;
                this.g = v + 1;
                break;
            }
            case 34: 
            case 39: 
            case 0x2F: 
            case 92: {
                break;
            }
            case 98: {
                return '\b';
            }
            case 102: {
                return '\f';
            }
            case 110: {
                return '\n';
            }
            case 0x72: {
                return '\r';
            }
            case 0x74: {
                return '\t';
            }
            case 0x75: {
                if(v + 5 > this.e && !this.c(4)) {
                    this.o("Unterminated escape sequence");
                    throw null;
                }
                int v1 = this.d;
                int v2 = v1 + 4;
                char c1 = '\u0000';
                while(v1 < v2) {
                    int v3 = arr_c[v1];
                    if(v3 >= 0x30 && v3 <= 57) {
                        v4 = v3 - 0x30;
                    }
                    else if(v3 < 97 || v3 > 102) {
                        if(v3 < 65 || v3 > 70) {
                            throw new NumberFormatException("\\u" + new String(arr_c, this.d, 4));
                        }
                        v4 = v3 - 55;
                    }
                    else {
                        v4 = v3 - 87;
                    }
                    c1 = (char)(v4 + ((char)(c1 << 4)));
                    ++v1;
                }
                this.d += 4;
                return c1;
            }
            default: {
                this.o("Invalid escape sequence");
                throw null;
            }
        }
        return c;
    }

    public final void l(char c) {
        do {
            int v = this.d;
            int v1 = this.e;
            while(v < v1) {
                int v2 = this.c[v];
                if(v2 == c) {
                    this.d = v + 1;
                    return;
                }
                switch(v2) {
                    case 10: {
                        ++this.f;
                        this.g = v + 1;
                        ++v;
                        continue;
                    }
                    case 92: {
                        break;
                    }
                    default: {
                        ++v;
                        continue;
                    }
                }
                this.d = v + 1;
                this.k();
                v = this.d;
                v1 = this.e;
            }
            this.d = v;
        }
        while(this.c(1));
        this.o("Unterminated string");
        throw null;
    }

    public final void m() {
        while(this.d < this.e || this.c(1)) {
            int v = this.d;
            int v1 = v + 1;
            this.d = v1;
            int v2 = this.c[v];
            if(v2 == 10) {
                ++this.f;
                this.g = v1;
                return;
            }
            if(v2 == 13) {
                break;
            }
        }
    }

    public final void n() {
        int v1;
        do {
            int v = 0;
        alab1:
            while(true) {
                v1 = this.d;
                if(v1 + v >= this.e) {
                    goto label_9;
                }
                switch(this.c[v1 + v]) {
                    case 35: 
                    case 0x2F: 
                    case 59: 
                    case 61: 
                    case 92: {
                        break alab1;
                    }
                    case 9: 
                    case 10: 
                    case 12: 
                    case 13: 
                    case 0x20: 
                    case 44: 
                    case 58: 
                    case 91: 
                    case 93: 
                    case 0x7B: 
                    case 0x7D: {
                        this.d += v;
                        return;
                    }
                    default: {
                        ++v;
                    }
                }
            }
            this.a();
            this.d += v;
            return;
        label_9:
            this.d = v1 + v;
        }
        while(this.c(1));
    }

    public boolean nextBoolean() throws IOException {
        switch((this.h == 0 ? this.b() : this.h)) {
            case 5: {
                this.h = 0;
                int v = this.m - 1;
                ++this.o[v];
                return true;
            }
            case 6: {
                this.h = 0;
                int v1 = this.m - 1;
                ++this.o[v1];
                return false;
            }
            default: {
                throw new IllegalStateException("Expected a boolean but was " + this.peek() + this.f());
            }
        }
    }

    public double nextDouble() throws IOException {
        int v = this.h == 0 ? this.b() : this.h;
        switch(v) {
            case 8: 
            case 9: {
                this.k = this.h(((char)(v == 8 ? 39 : 34)));
                break;
            }
            case 10: {
                this.k = this.i();
                break;
            }
            case 11: {
                break;
            }
            case 15: {
                this.h = 0;
                int v1 = this.m - 1;
                ++this.o[v1];
                return (double)this.i;
            }
            case 16: {
                this.k = new String(this.c, this.d, this.j);
                this.d += this.j;
                break;
            }
            default: {
                throw new IllegalStateException("Expected a double but was " + this.peek() + this.f());
            }
        }
        this.h = 11;
        double f = Double.parseDouble(this.k);
        if(!this.b && (Double.isNaN(f) || Double.isInfinite(f))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + f + this.f());
        }
        this.k = null;
        this.h = 0;
        int v2 = this.m - 1;
        ++this.o[v2];
        return f;
    }

    public int nextInt() throws IOException {
        int v = this.h == 0 ? this.b() : this.h;
        switch(v) {
            case 8: {
            label_12:
                this.k = v == 10 ? this.i() : this.h(((char)(v == 8 ? 39 : 34)));
                try {
                    int v3 = Integer.parseInt(this.k);
                    this.h = 0;
                    int v4 = this.m - 1;
                    ++this.o[v4];
                    return v3;
                }
                catch(NumberFormatException unused_ex) {
                    goto label_23;
                }
            }
            case 15: {
                int v1 = (int)this.i;
                if(this.i != ((long)v1)) {
                    throw new NumberFormatException("Expected an int but was " + this.i + this.f());
                }
                this.h = 0;
                int v2 = this.m - 1;
                ++this.o[v2];
                return v1;
            label_10:
                if(v != 9 && v != 10) {
                    throw new IllegalStateException("Expected an int but was " + this.peek() + this.f());
                }
                goto label_12;
            }
            case 16: {
                break;
            }
            default: {
                goto label_10;
            }
        }
        this.k = new String(this.c, this.d, this.j);
        this.d += this.j;
    label_23:
        this.h = 11;
        double f = Double.parseDouble(this.k);
        if(((double)(((int)f))) != f) {
            throw new NumberFormatException("Expected an int but was " + this.k + this.f());
        }
        this.k = null;
        this.h = 0;
        int v5 = this.m - 1;
        ++this.o[v5];
        return (int)f;
    }

    public long nextLong() throws IOException {
        int v = this.h == 0 ? this.b() : this.h;
        switch(v) {
            case 8: {
            label_9:
                this.k = v == 10 ? this.i() : this.h(((char)(v == 8 ? 39 : 34)));
                try {
                    long v2 = Long.parseLong(this.k);
                    this.h = 0;
                    int v3 = this.m - 1;
                    ++this.o[v3];
                    return v2;
                }
                catch(NumberFormatException unused_ex) {
                    goto label_20;
                }
            }
            case 15: {
                this.h = 0;
                int v1 = this.m - 1;
                ++this.o[v1];
                return this.i;
            label_7:
                if(v != 9 && v != 10) {
                    throw new IllegalStateException("Expected a long but was " + this.peek() + this.f());
                }
                goto label_9;
            }
            case 16: {
                break;
            }
            default: {
                goto label_7;
            }
        }
        this.k = new String(this.c, this.d, this.j);
        this.d += this.j;
    label_20:
        this.h = 11;
        double f = Double.parseDouble(this.k);
        if(((double)(((long)f))) != f) {
            throw new NumberFormatException("Expected a long but was " + this.k + this.f());
        }
        this.k = null;
        this.h = 0;
        int v4 = this.m - 1;
        ++this.o[v4];
        return (long)f;
    }

    public String nextName() throws IOException {
        String s;
        switch((this.h == 0 ? this.b() : this.h)) {
            case 12: {
                s = this.h('\'');
                break;
            }
            case 13: {
                s = this.h('\"');
                break;
            }
            case 14: {
                s = this.i();
                break;
            }
            default: {
                throw new IllegalStateException("Expected a name but was " + this.peek() + this.f());
            }
        }
        this.h = 0;
        this.n[this.m - 1] = s;
        return s;
    }

    public void nextNull() throws IOException {
        if((this.h == 0 ? this.b() : this.h) != 7) {
            throw new IllegalStateException("Expected null but was " + this.peek() + this.f());
        }
        this.h = 0;
        int v = this.m - 1;
        ++this.o[v];
    }

    public String nextString() throws IOException {
        String s;
    alab1:
        switch(this.h) {
            case 0: {
                switch(this.b()) {
                    case 8: {
                        s = this.h('\'');
                        break alab1;
                    }
                    case 9: {
                        s = this.h('\"');
                        break alab1;
                    }
                    case 10: {
                        s = this.i();
                        break alab1;
                    }
                    case 11: {
                        s = this.k;
                        this.k = null;
                        break alab1;
                    }
                    case 15: {
                        s = Long.toString(this.i);
                        break alab1;
                    }
                    case 16: {
                        s = new String(this.c, this.d, this.j);
                        this.d += this.j;
                        break alab1;
                    }
                    default: {
                        throw new IllegalStateException("Expected a string but was " + this.peek() + this.f());
                    }
                }
            }
            case 8: {
                s = this.h('\'');
                break;
            }
            case 9: {
                s = this.h('\"');
                break;
            }
            case 10: {
                s = this.i();
                break;
            }
            case 11: {
                s = this.k;
                this.k = null;
                break;
            }
            case 15: {
                s = Long.toString(this.i);
                break;
            }
            case 16: {
                s = new String(this.c, this.d, this.j);
                this.d += this.j;
                break;
            }
            default: {
                throw new IllegalStateException("Expected a string but was " + this.peek() + this.f());
            }
        }
        this.h = 0;
        int v = this.m - 1;
        ++this.o[v];
        return s;
    }

    public final void o(String s) {
        StringBuilder stringBuilder0 = b.t(s);
        stringBuilder0.append(this.f());
        throw new MalformedJsonException(stringBuilder0.toString());
    }

    public JsonToken peek() throws IOException {
        switch((this.h == 0 ? this.b() : this.h)) {
            case 1: {
                return JsonToken.BEGIN_OBJECT;
            }
            case 2: {
                return JsonToken.END_OBJECT;
            }
            case 3: {
                return JsonToken.BEGIN_ARRAY;
            }
            case 4: {
                return JsonToken.END_ARRAY;
            }
            case 5: 
            case 6: {
                return JsonToken.BOOLEAN;
            }
            case 7: {
                return JsonToken.NULL;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                return JsonToken.STRING;
            }
            case 12: 
            case 13: 
            case 14: {
                return JsonToken.NAME;
            }
            case 15: 
            case 16: {
                return JsonToken.NUMBER;
            }
            case 17: {
                return JsonToken.END_DOCUMENT;
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    public final void setLenient(boolean z) {
        this.b = z;
    }

    public void skipValue() throws IOException {
        int v = 0;
        do {
            switch((this.h == 0 ? this.b() : this.h)) {
                case 1: {
                    this.j(3);
                    ++v;
                    break;
                }
                case 2: {
                    if(v == 0) {
                        this.n[this.m - 1] = null;
                    }
                    --this.m;
                    --v;
                    break;
                }
                case 3: {
                    this.j(1);
                    ++v;
                    break;
                }
                case 4: {
                    --this.m;
                    --v;
                    break;
                }
                case 8: {
                    this.l('\'');
                    break;
                }
                case 9: {
                    this.l('\"');
                    break;
                }
                case 10: {
                    this.n();
                    break;
                }
                case 12: {
                    this.l('\'');
                    if(v == 0) {
                        this.n[this.m - 1] = "<skipped>";
                    }
                    break;
                }
                case 13: {
                    this.l('\"');
                    if(v == 0) {
                        this.n[this.m - 1] = "<skipped>";
                    }
                    break;
                }
                case 14: {
                    this.n();
                    if(v == 0) {
                        this.n[this.m - 1] = "<skipped>";
                    }
                    break;
                }
                case 16: {
                    this.d += this.j;
                    break;
                }
                case 17: {
                    return;
                }
            }
            this.h = 0;
        }
        while(v > 0);
        int v1 = this.m - 1;
        ++this.o[v1];
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + this.f();
    }
}

