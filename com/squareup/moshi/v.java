package com.squareup.moshi;

import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;

public final class v extends JsonReader {
    public final BufferedSource h;
    public final Buffer i;
    public int j;
    public long k;
    public int l;
    public String m;
    public a0 n;
    public static final ByteString o;
    public static final ByteString p;
    public static final ByteString q;
    public static final ByteString r;
    public static final ByteString s;

    static {
        v.o = ByteString.encodeUtf8("\'\\");
        v.p = ByteString.encodeUtf8("\"\\");
        v.q = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");
        v.r = ByteString.encodeUtf8("\n\r");
        v.s = ByteString.encodeUtf8("*/");
    }

    public v(v v0) {
        super(v0);
        this.j = 0;
        BufferedSource bufferedSource0 = v0.h.peek();
        this.h = bufferedSource0;
        this.i = bufferedSource0.getBuffer();
        this.j = v0.j;
        this.k = v0.k;
        this.l = v0.l;
        this.m = v0.m;
        try {
            bufferedSource0.require(v0.i.size());
        }
        catch(IOException unused_ex) {
            throw new AssertionError();
        }
    }

    public v(BufferedSource bufferedSource0) {
        this.j = 0;
        if(bufferedSource0 == null) {
            throw new NullPointerException("source == null");
        }
        this.h = bufferedSource0;
        this.i = bufferedSource0.getBuffer();
        this.a(6);
    }

    @Override  // com.squareup.moshi.JsonReader
    public final void beginArray() {
        if((this.j == 0 ? this.e() : this.j) != 3) {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + this.peek() + " at path " + "$");
        }
        this.a(1);
        this.d[this.a - 1] = 0;
        this.j = 0;
    }

    @Override  // com.squareup.moshi.JsonReader
    public final void beginObject() {
        if((this.j == 0 ? this.e() : this.j) != 1) {
            throw new JsonDataException("Expected BEGIN_OBJECT but was " + this.peek() + " at path " + "$");
        }
        this.a(3);
        this.j = 0;
    }

    @Override
    public final void close() {
        this.j = 0;
        this.b[0] = 8;
        this.a = 1;
        this.i.clear();
        this.h.close();
    }

    public final void d() {
        if(this.e) {
            return;
        }
        this.b("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final int e() {
        int v18;
        long v17;
        int v7;
        String s1;
        String s;
        int[] arr_v = this.b;
        int v = this.a - 1;
        int v1 = arr_v[v];
        BufferedSource bufferedSource0 = this.h;
        Buffer buffer0 = this.i;
    alab1:
        switch(v1) {
            case 1: {
                arr_v[v] = 2;
                break;
            }
            case 2: {
                int v4 = this.i(true);
                buffer0.readByte();
                switch(v4) {
                    case 44: {
                        break alab1;
                    }
                    case 59: {
                        this.d();
                        break alab1;
                    }
                    case 93: {
                        this.j = 4;
                        return 4;
                    }
                    default: {
                        this.b("Unterminated array");
                        throw null;
                    }
                }
            }
            case 4: {
                arr_v[v] = 5;
                int v5 = this.i(true);
                buffer0.readByte();
                if(v5 != 58) {
                    if(v5 != 61) {
                        this.b("Expected \':\'");
                        throw null;
                    }
                    this.d();
                    if(bufferedSource0.request(1L) && buffer0.getByte(0L) == 62) {
                        buffer0.readByte();
                        break;
                    }
                }
                break;
            }
            case 3: 
            case 5: {
                arr_v[v] = 4;
                if(v1 == 5) {
                    int v2 = this.i(true);
                    buffer0.readByte();
                    switch(v2) {
                        case 44: {
                            break;
                        }
                        case 59: {
                            this.d();
                            break;
                        }
                        case 0x7D: {
                            this.j = 2;
                            return 2;
                        }
                        default: {
                            this.b("Unterminated object");
                            throw null;
                        }
                    }
                }
                int v3 = this.i(true);
                switch(v3) {
                    case 34: {
                        buffer0.readByte();
                        this.j = 13;
                        return 13;
                    }
                    case 39: {
                        buffer0.readByte();
                        this.d();
                        this.j = 12;
                        return 12;
                    }
                    case 0x7D: {
                        if(v1 != 5) {
                            buffer0.readByte();
                            this.j = 2;
                            return 2;
                        }
                        this.b("Expected name");
                        throw null;
                    }
                    default: {
                        this.d();
                        if(this.h(((int)(((char)v3))))) {
                            this.j = 14;
                            return 14;
                        }
                        this.b("Expected name");
                        throw null;
                    }
                }
            }
            case 6: {
                arr_v[v] = 7;
                break;
            }
            case 7: {
                if(this.i(false) == -1) {
                    this.j = 18;
                    return 18;
                }
                this.d();
                break;
            }
            case 8: {
                throw new IllegalStateException("JsonReader is closed");
            }
            case 9: {
                a0 a00 = this.n;
                a00.g = true;
                while(a00.d != a0.m) {
                    a00.a(0x2000L);
                    a00.a.skip(a00.f);
                }
                this.n = null;
                --this.a;
                return this.e();
            }
        }
        int v6 = this.i(true);
        if(v6 != 34) {
            switch(v6) {
                case 39: {
                    this.d();
                    buffer0.readByte();
                    this.j = 8;
                    return 8;
                }
                case 44: 
                case 59: {
                    break;
                }
                case 91: {
                    buffer0.readByte();
                    this.j = 3;
                    return 3;
                }
                case 93: {
                    if(v1 == 1) {
                        buffer0.readByte();
                        this.j = 4;
                        return 4;
                    }
                    break;
                }
                default: {
                    if(v6 != 0x7B) {
                        switch(buffer0.getByte(0L)) {
                            case 70: 
                            case 102: {
                                s = "false";
                                s1 = "FALSE";
                                v7 = 6;
                                break;
                            }
                            case 78: 
                            case 110: {
                                s = "null";
                                s1 = "NULL";
                                v7 = 7;
                                break;
                            }
                            case 84: 
                            case 0x74: {
                                s = "true";
                                s1 = "TRUE";
                                v7 = 5;
                                break;
                            }
                            default: {
                                v7 = 0;
                                goto label_108;
                            }
                        }
                        int v8 = s.length();
                        int v9 = 1;
                        while(v9 < v8) {
                            if(bufferedSource0.request(((long)(v9 + 1)))) {
                                int v10 = buffer0.getByte(((long)v9));
                                if(v10 != s.charAt(v9) && v10 != s1.charAt(v9)) {
                                    v7 = 0;
                                    goto label_108;
                                }
                                ++v9;
                                continue;
                            }
                            v7 = 0;
                            goto label_108;
                        }
                        if(bufferedSource0.request(((long)(v8 + 1))) && this.h(buffer0.getByte(((long)v8)))) {
                            v7 = 0;
                        }
                        else {
                            buffer0.skip(((long)v8));
                            this.j = v7;
                        }
                    label_108:
                        if(v7 != 0) {
                            return v7;
                        }
                        int v11 = 0;
                        int v12 = 0;
                        boolean z = false;
                        int v13 = 1;
                        long v14 = 0L;
                    alab2:
                        while(true) {
                            long v15 = v14;
                            if(!bufferedSource0.request(((long)(v11 + 1)))) {
                                goto label_160;
                            }
                            int v16 = buffer0.getByte(((long)v11));
                            switch(v16) {
                                case 43: {
                                    v17 = v14;
                                    if(v12 != 5) {
                                        break alab2;
                                    }
                                    v12 = 6;
                                    v14 = v17;
                                    break;
                                }
                                case 45: {
                                    v17 = v14;
                                    if(v12 == 0) {
                                        v12 = 1;
                                        z = true;
                                    }
                                    else {
                                        if(v12 != 5) {
                                            break alab2;
                                        }
                                        v12 = 6;
                                    }
                                    v14 = v17;
                                    break;
                                }
                                case 46: {
                                    if(v12 != 2) {
                                        break alab2;
                                    }
                                    v12 = 3;
                                    break;
                                }
                                case 69: 
                                case 101: {
                                    if(v12 != 2 && v12 != 4) {
                                        break alab2;
                                    }
                                    v12 = 5;
                                    break;
                                }
                                default: {
                                    if(v16 < 0x30 || v16 > 57) {
                                        goto label_136;
                                    }
                                    switch(v12) {
                                        case 0: 
                                        case 1: {
                                            v17 = (long)(-(v16 - 0x30));
                                            v12 = 2;
                                            v14 = v17;
                                            break;
                                        }
                                        case 2: {
                                            if(v14 == 0L) {
                                                v18 = 0;
                                                goto label_172;
                                            }
                                            v14 = 10L * v14 - ((long)(v16 - 0x30));
                                            int v19 = Long.compare(v15, -922337203685477580L);
                                            v13 &= (v19 > 0 || v19 == 0 && v14 < v15 ? 1 : 0);
                                            break;
                                        }
                                        case 3: {
                                            v12 = 4;
                                            break;
                                        label_136:
                                            if(this.h(v16)) {
                                                break alab2;
                                            }
                                            goto label_160;
                                        }
                                        default: {
                                            if(v12 == 5 || v12 == 6) {
                                                v12 = 7;
                                            }
                                        }
                                    }
                                }
                            }
                            ++v11;
                        }
                        v18 = 0;
                        goto label_172;
                    label_160:
                        if(v12 == 2 && v13 != 0 && (v14 != 0x8000000000000000L || z) && (v14 != 0L || !z)) {
                            this.k = z ? v14 : -v14;
                            buffer0.skip(((long)v11));
                            v18 = 16;
                            this.j = 16;
                        }
                        else if(v12 == 2 || v12 == 4 || v12 == 7) {
                            this.l = v11;
                            this.j = 17;
                            v18 = 17;
                        }
                        else {
                            v18 = 0;
                        }
                    label_172:
                        if(v18 != 0) {
                            return v18;
                        }
                        if(this.h(buffer0.getByte(0L))) {
                            this.d();
                            this.j = 10;
                            return 10;
                        }
                        this.b("Expected value");
                        throw null;
                    }
                    buffer0.readByte();
                    this.j = 1;
                    return 1;
                }
            }
            if(v1 != 1 && v1 != 2) {
                this.b("Unexpected value");
                throw null;
            }
            this.d();
            this.j = 7;
            return 7;
        }
        buffer0.readByte();
        this.j = 9;
        return 9;
    }

    @Override  // com.squareup.moshi.JsonReader
    public final void endArray() {
        if((this.j == 0 ? this.e() : this.j) != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + this.peek() + " at path " + "$");
        }
        int v = this.a;
        this.a = v - 1;
        ++this.d[v - 2];
        this.j = 0;
    }

    @Override  // com.squareup.moshi.JsonReader
    public final void endObject() {
        if((this.j == 0 ? this.e() : this.j) != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + this.peek() + " at path " + "$");
        }
        int v = this.a;
        this.a = v - 1;
        this.c[v - 1] = null;
        ++this.d[v - 2];
        this.j = 0;
    }

    public final int f(String s, Options jsonReader$Options0) {
        for(int v = 0; v < jsonReader$Options0.a.length; ++v) {
            if(s.equals(jsonReader$Options0.a[v])) {
                this.j = 0;
                this.c[this.a - 1] = s;
                return v;
            }
        }
        return -1;
    }

    public final int g(String s, Options jsonReader$Options0) {
        for(int v = 0; v < jsonReader$Options0.a.length; ++v) {
            if(s.equals(jsonReader$Options0.a[v])) {
                this.j = 0;
                int v1 = this.a - 1;
                ++this.d[v1];
                return v;
            }
        }
        return -1;
    }

    public final boolean h(int v) {
        switch(v) {
            case 35: 
            case 0x2F: 
            case 59: 
            case 61: 
            case 92: {
                this.d();
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

    @Override  // com.squareup.moshi.JsonReader
    public final boolean hasNext() {
        int v = this.j == 0 ? this.e() : this.j;
        return v != 2 && v != 4 && v != 18;
    }

    public final int i(boolean z) {
    alab1:
        while(true) {
            int v = 0;
        alab2:
            while(true) {
                BufferedSource bufferedSource0 = this.h;
                if(!bufferedSource0.request(((long)(v + 1)))) {
                    break alab1;
                }
                Buffer buffer0 = this.i;
                int v1 = buffer0.getByte(((long)v));
                if(v1 == 9 || v1 == 10 || v1 == 13 || v1 == 0x20) {
                    ++v;
                    continue;
                }
                buffer0.skip(((long)v));
                ByteString byteString0 = v.r;
                if(v1 == 0x2F) {
                    if(!bufferedSource0.request(2L)) {
                        return 0x2F;
                    }
                    this.d();
                    switch(buffer0.getByte(1L)) {
                        case 42: {
                            buffer0.readByte();
                            buffer0.readByte();
                            long v2 = bufferedSource0.indexOf(v.s);
                            buffer0.skip((v2 == -1L ? v2 + ((long)v.s.size()) : buffer0.size()));
                            if(v2 != -1L) {
                                break alab2;
                            }
                            this.b("Unterminated comment");
                            throw null;
                        }
                        case 0x2F: {
                            buffer0.readByte();
                            buffer0.readByte();
                            long v3 = bufferedSource0.indexOfElement(byteString0);
                            buffer0.skip((v3 == -1L ? buffer0.size() : v3 + 1L));
                            break alab2;
                        }
                        default: {
                            return 0x2F;
                        }
                    }
                }
                else {
                    if(v1 == 35) {
                        this.d();
                        long v4 = bufferedSource0.indexOfElement(byteString0);
                        buffer0.skip((v4 == -1L ? buffer0.size() : v4 + 1L));
                        break;
                    }
                    return v1;
                }
                break alab1;
            }
        }
        if(z) {
            throw new EOFException("End of input");
        }
        return -1;
    }

    public final String j(ByteString byteString0) {
        StringBuilder stringBuilder0 = null;
        long v;
        while((v = this.h.indexOfElement(byteString0)) != -1L) {
            Buffer buffer0 = this.i;
            if(buffer0.getByte(v) == 92) {
                if(stringBuilder0 == null) {
                    stringBuilder0 = new StringBuilder();
                }
                stringBuilder0.append(buffer0.readUtf8(v));
                buffer0.readByte();
                stringBuilder0.append(this.l());
                continue;
            }
            if(stringBuilder0 == null) {
                String s = buffer0.readUtf8(v);
                buffer0.readByte();
                return s;
            }
            stringBuilder0.append(buffer0.readUtf8(v));
            buffer0.readByte();
            return stringBuilder0.toString();
        }
        this.b("Unterminated string");
        throw null;
    }

    public final String k() {
        long v = this.h.indexOfElement(v.q);
        return Long.compare(v, -1L) == 0 ? "" : this.i.readUtf8(v);
    }

    public final char l() {
        int v3;
        BufferedSource bufferedSource0 = this.h;
        if(bufferedSource0.request(1L)) {
            Buffer buffer0 = this.i;
            int v = buffer0.readByte();
            switch(v) {
                case 10: 
                case 34: 
                case 39: 
                case 0x2F: 
                case 92: {
                    return (char)v;
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
                    if(!bufferedSource0.request(4L)) {
                        throw new EOFException("Unterminated escape sequence at path $");
                    }
                    char c = '\u0000';
                    for(int v1 = 0; v1 < 4; ++v1) {
                        int v2 = buffer0.getByte(((long)v1));
                        if(v2 >= 0x30 && v2 <= 57) {
                            v3 = v2 - 0x30;
                        }
                        else if(v2 < 97 || v2 > 102) {
                            if(v2 < 65 || v2 > 70) {
                                this.b("\\u" + buffer0.readUtf8(4L));
                                throw null;
                            }
                            v3 = v2 - 55;
                        }
                        else {
                            v3 = v2 - 87;
                        }
                        c = (char)(v3 + ((char)(c << 4)));
                    }
                    buffer0.skip(4L);
                    return c;
                }
                default: {
                    if(this.e) {
                        return (char)v;
                    }
                    this.b("Invalid escape sequence: \\" + ((char)v));
                    throw null;
                }
            }
        }
        this.b("Unterminated escape sequence");
        throw null;
    }

    public final void m(ByteString byteString0) {
        long v;
        while((v = this.h.indexOfElement(byteString0)) != -1L) {
            Buffer buffer0 = this.i;
            if(buffer0.getByte(v) == 92) {
                buffer0.skip(v + 1L);
                this.l();
                continue;
            }
            buffer0.skip(v + 1L);
            return;
        }
        this.b("Unterminated string");
        throw null;
    }

    @Override  // com.squareup.moshi.JsonReader
    public final boolean nextBoolean() {
        switch((this.j == 0 ? this.e() : this.j)) {
            case 5: {
                this.j = 0;
                int v = this.a - 1;
                ++this.d[v];
                return true;
            }
            case 6: {
                this.j = 0;
                int v1 = this.a - 1;
                ++this.d[v1];
                return false;
            }
            default: {
                throw new JsonDataException("Expected a boolean but was " + this.peek() + " at path " + "$");
            }
        }
    }

    @Override  // com.squareup.moshi.JsonReader
    public final double nextDouble() {
        double f;
    alab1:
        switch(this.j) {
            case 0: {
                switch(this.e()) {
                    case 8: {
                        goto label_13;
                    }
                    case 9: {
                        goto label_11;
                    }
                    case 10: {
                        goto label_15;
                    }
                    case 11: {
                        break alab1;
                    }
                    case 16: {
                        goto label_4;
                    }
                    case 17: {
                        goto label_9;
                    }
                    default: {
                        throw new JsonDataException("Expected a double but was " + this.peek() + " at path " + "$");
                    }
                }
            }
            case 8: {
                this.m = this.j(v.o);
                break;
            }
            case 9: {
                this.m = this.j(v.p);
                break;
            }
            case 10: {
                this.m = this.k();
                break;
            }
            case 11: {
                break;
            }
            case 16: {
            label_4:
                this.j = 0;
                int v = this.a - 1;
                ++this.d[v];
                return (double)this.k;
            label_9:
                this.m = this.i.readUtf8(((long)this.l));
                break;
            label_11:
                this.m = this.j(v.p);
                break;
            label_13:
                this.m = this.j(v.o);
                break;
            label_15:
                this.m = this.k();
                break;
            }
            case 17: {
                this.m = this.i.readUtf8(((long)this.l));
                break;
            }
            default: {
                throw new JsonDataException("Expected a double but was " + this.peek() + " at path " + "$");
            }
        }
        try {
            this.j = 11;
            f = Double.parseDouble(this.m);
        }
        catch(NumberFormatException unused_ex) {
            throw new JsonDataException("Expected a double but was " + this.m + " at path " + "$");
        }
        if(!this.e && (Double.isNaN(f) || Double.isInfinite(f))) {
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + f + " at path " + "$");
        }
        this.m = null;
        this.j = 0;
        int v1 = this.a - 1;
        ++this.d[v1];
        return f;
    }

    @Override  // com.squareup.moshi.JsonReader
    public final int nextInt() {
        double f;
        int v = this.j == 0 ? this.e() : this.j;
        switch(v) {
            case 8: 
            case 9: {
                String s = v == 9 ? this.j(v.p) : this.j(v.o);
                try {
                    this.m = s;
                    int v1 = Integer.parseInt(s);
                    this.j = 0;
                    int v2 = this.a - 1;
                    ++this.d[v2];
                    return v1;
                }
                catch(NumberFormatException unused_ex) {
                    break;
                }
            }
            case 11: {
                break;
            }
            case 16: {
                int v3 = (int)this.k;
                if(this.k != ((long)v3)) {
                    throw new JsonDataException("Expected an int but was " + this.k + " at path " + "$");
                }
                this.j = 0;
                int v4 = this.a - 1;
                ++this.d[v4];
                return v3;
            }
            case 17: {
                this.m = this.i.readUtf8(((long)this.l));
                break;
            }
            default: {
                throw new JsonDataException("Expected an int but was " + this.peek() + " at path " + "$");
            }
        }
        try {
            this.j = 11;
            f = Double.parseDouble(this.m);
        }
        catch(NumberFormatException unused_ex) {
            throw new JsonDataException("Expected an int but was " + this.m + " at path " + "$");
        }
        if(((double)(((int)f))) != f) {
            throw new JsonDataException("Expected an int but was " + this.m + " at path " + "$");
        }
        this.m = null;
        this.j = 0;
        int v5 = this.a - 1;
        ++this.d[v5];
        return (int)f;
    }

    @Override  // com.squareup.moshi.JsonReader
    public final long nextLong() {
        long v4;
        int v = this.j == 0 ? this.e() : this.j;
        switch(v) {
            case 8: 
            case 9: {
                String s = v == 9 ? this.j(v.p) : this.j(v.o);
                try {
                    this.m = s;
                    long v1 = Long.parseLong(s);
                    this.j = 0;
                    int v2 = this.a - 1;
                    ++this.d[v2];
                    return v1;
                }
                catch(NumberFormatException unused_ex) {
                    break;
                }
            }
            case 11: {
                break;
            }
            case 16: {
                this.j = 0;
                int v3 = this.a - 1;
                ++this.d[v3];
                return this.k;
            }
            case 17: {
                this.m = this.i.readUtf8(((long)this.l));
                break;
            }
            default: {
                throw new JsonDataException("Expected a long but was " + this.peek() + " at path " + "$");
            }
        }
        try {
            this.j = 11;
            v4 = new BigDecimal(this.m).longValueExact();
        }
        catch(NumberFormatException | ArithmeticException unused_ex) {
            throw new JsonDataException("Expected a long but was " + this.m + " at path " + "$");
        }
        this.m = null;
        this.j = 0;
        int v5 = this.a - 1;
        ++this.d[v5];
        return v4;
    }

    @Override  // com.squareup.moshi.JsonReader
    public final String nextName() {
        String s;
    alab1:
        switch(this.j) {
            case 0: {
                switch(this.e()) {
                    case 12: {
                        s = this.j(v.o);
                        break alab1;
                    }
                    case 13: {
                        s = this.j(v.p);
                        break alab1;
                    }
                    case 14: {
                        s = this.k();
                        break alab1;
                    }
                    case 15: {
                        s = this.m;
                        this.m = null;
                        break alab1;
                    }
                    default: {
                        throw new JsonDataException("Expected a name but was " + this.peek() + " at path " + "$");
                    }
                }
            }
            case 12: {
                s = this.j(v.o);
                break;
            }
            case 13: {
                s = this.j(v.p);
                break;
            }
            case 14: {
                s = this.k();
                break;
            }
            case 15: {
                s = this.m;
                this.m = null;
                break;
            }
            default: {
                throw new JsonDataException("Expected a name but was " + this.peek() + " at path " + "$");
            }
        }
        this.j = 0;
        this.c[this.a - 1] = s;
        return s;
    }

    @Override  // com.squareup.moshi.JsonReader
    public final Object nextNull() {
        if((this.j == 0 ? this.e() : this.j) != 7) {
            throw new JsonDataException("Expected null but was " + this.peek() + " at path " + "$");
        }
        this.j = 0;
        int v = this.a - 1;
        ++this.d[v];
        return null;
    }

    @Override  // com.squareup.moshi.JsonReader
    public final BufferedSource nextSource() {
        int v1;
        int v = this.j == 0 ? this.e() : this.j;
        Buffer buffer0 = new Buffer();
        ByteString byteString0 = a0.m;
        switch(v) {
            case 1: {
                buffer0.writeUtf8("{");
                byteString0 = a0.h;
                v1 = 1;
                break;
            }
            case 3: {
                buffer0.writeUtf8("[");
                byteString0 = a0.h;
                v1 = 1;
                break;
            }
            case 5: {
                buffer0.writeUtf8("true");
                v1 = 0;
                break;
            }
            case 6: {
                buffer0.writeUtf8("false");
                v1 = 0;
                break;
            }
            case 7: {
                buffer0.writeUtf8("null");
                v1 = 0;
                break;
            }
            case 8: {
                buffer0.writeUtf8("\'");
                byteString0 = a0.i;
                v1 = 0;
                break;
            }
            case 9: {
                buffer0.writeUtf8("\"");
                byteString0 = a0.j;
                v1 = 0;
                break;
            }
            case 11: {
                String s = this.nextString();
                try(JsonWriter jsonWriter0 = JsonWriter.of(buffer0)) {
                    jsonWriter0.value(s);
                }
                v1 = 0;
                break;
            }
            case 10: 
            case 16: 
            case 17: {
                buffer0.writeUtf8(this.nextString());
                v1 = 0;
                break;
            }
            default: {
                throw new JsonDataException("Expected a value but was " + this.peek() + " at path " + "$");
            }
        }
        if(this.j != 0) {
            int v2 = this.a - 1;
            ++this.d[v2];
            this.j = 0;
        }
        this.n = new a0(this.h, buffer0, byteString0, v1);
        this.a(9);
        return Okio.buffer(this.n);
    }

    @Override  // com.squareup.moshi.JsonReader
    public final String nextString() {
        String s;
    alab1:
        switch(this.j) {
            case 0: {
                switch(this.e()) {
                    case 8: {
                        s = this.j(v.o);
                        break alab1;
                    }
                    case 9: {
                        s = this.j(v.p);
                        break alab1;
                    }
                    case 10: {
                        s = this.k();
                        break alab1;
                    }
                    case 11: {
                        s = this.m;
                        this.m = null;
                        break alab1;
                    }
                    case 16: {
                        s = Long.toString(this.k);
                        break alab1;
                    }
                    case 17: {
                        s = this.i.readUtf8(((long)this.l));
                        break alab1;
                    }
                    default: {
                        throw new JsonDataException("Expected a string but was " + this.peek() + " at path " + "$");
                    }
                }
            }
            case 8: {
                s = this.j(v.o);
                break;
            }
            case 9: {
                s = this.j(v.p);
                break;
            }
            case 10: {
                s = this.k();
                break;
            }
            case 11: {
                s = this.m;
                this.m = null;
                break;
            }
            case 16: {
                s = Long.toString(this.k);
                break;
            }
            case 17: {
                s = this.i.readUtf8(((long)this.l));
                break;
            }
            default: {
                throw new JsonDataException("Expected a string but was " + this.peek() + " at path " + "$");
            }
        }
        this.j = 0;
        int v = this.a - 1;
        ++this.d[v];
        return s;
    }

    @Override  // com.squareup.moshi.JsonReader
    public final Token peek() {
        switch((this.j == 0 ? this.e() : this.j)) {
            case 1: {
                return Token.BEGIN_OBJECT;
            }
            case 2: {
                return Token.END_OBJECT;
            }
            case 3: {
                return Token.BEGIN_ARRAY;
            }
            case 4: {
                return Token.END_ARRAY;
            }
            case 5: 
            case 6: {
                return Token.BOOLEAN;
            }
            case 7: {
                return Token.NULL;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                return Token.STRING;
            }
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                return Token.NAME;
            }
            case 16: 
            case 17: {
                return Token.NUMBER;
            }
            case 18: {
                return Token.END_DOCUMENT;
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    @Override  // com.squareup.moshi.JsonReader
    public final JsonReader peekJson() {
        return new v(this);
    }

    @Override  // com.squareup.moshi.JsonReader
    public final void promoteNameToValue() {
        if(this.hasNext()) {
            this.m = this.nextName();
            this.j = 11;
        }
    }

    @Override  // com.squareup.moshi.JsonReader
    public final int selectName(Options jsonReader$Options0) {
        int v = this.j == 0 ? this.e() : this.j;
        if(v >= 12 && v <= 15) {
            if(v == 15) {
                return this.f(this.m, jsonReader$Options0);
            }
            int v1 = this.h.select(jsonReader$Options0.b);
            if(v1 != -1) {
                this.j = 0;
                this.c[this.a - 1] = jsonReader$Options0.a[v1];
                return v1;
            }
            String s = this.c[this.a - 1];
            String s1 = this.nextName();
            int v2 = this.f(s1, jsonReader$Options0);
            if(v2 == -1) {
                this.j = 15;
                this.m = s1;
                this.c[this.a - 1] = s;
            }
            return v2;
        }
        return -1;
    }

    @Override  // com.squareup.moshi.JsonReader
    public final int selectString(Options jsonReader$Options0) {
        int v = this.j == 0 ? this.e() : this.j;
        if(v >= 8 && v <= 11) {
            if(v == 11) {
                return this.g(this.m, jsonReader$Options0);
            }
            int v1 = this.h.select(jsonReader$Options0.b);
            if(v1 != -1) {
                this.j = 0;
                int v2 = this.a - 1;
                ++this.d[v2];
                return v1;
            }
            String s = this.nextString();
            int v3 = this.g(s, jsonReader$Options0);
            if(v3 == -1) {
                this.j = 11;
                this.m = s;
                int v4 = this.a - 1;
                --this.d[v4];
            }
            return v3;
        }
        return -1;
    }

    @Override  // com.squareup.moshi.JsonReader
    public final void skipName() {
        if(!this.f) {
        alab1:
            switch(this.j) {
                case 0: {
                    switch(this.e()) {
                        case 12: {
                            this.m(v.o);
                            break alab1;
                        }
                        case 13: {
                            this.m(v.p);
                            break alab1;
                        }
                        case 14: {
                            goto label_9;
                        }
                        case 15: {
                            break alab1;
                        }
                        default: {
                            throw new JsonDataException("Expected a name but was " + this.peek() + " at path " + "$");
                        }
                    }
                }
                case 12: {
                    this.m(v.o);
                    break;
                }
                case 13: {
                    this.m(v.p);
                    break;
                }
                case 14: {
                label_9:
                    long v = this.h.indexOfElement(v.q);
                    Buffer buffer0 = this.i;
                    if(Long.compare(v, -1L) == 0) {
                        v = buffer0.size();
                    }
                    buffer0.skip(v);
                    break;
                }
                case 15: {
                    break;
                }
                default: {
                    throw new JsonDataException("Expected a name but was " + this.peek() + " at path " + "$");
                }
            }
            this.j = 0;
            this.c[this.a - 1] = "null";
            return;
        }
        Token jsonReader$Token0 = this.peek();
        this.nextName();
        throw new JsonDataException("Cannot skip unexpected " + jsonReader$Token0 + " at " + "$");
    }

    @Override  // com.squareup.moshi.JsonReader
    public final void skipValue() {
        if(this.f) {
            throw new JsonDataException("Cannot skip unexpected " + this.peek() + " at " + "$");
        }
        int v = 0;
        while(true) {
            int v1 = this.j;
        alab1:
            switch(v1) {
                case 0: {
                    v1 = this.e();
                    switch(v1) {
                        case 1: {
                            this.a(3);
                            ++v;
                            goto label_44;
                        }
                        case 2: {
                            break alab1;
                        }
                        case 3: {
                            this.a(1);
                            ++v;
                            goto label_44;
                        }
                        case 4: {
                            goto label_36;
                        }
                        default: {
                        label_7:
                            Buffer buffer0 = this.i;
                            switch(v1) {
                                case 8: 
                                case 12: {
                                    this.m(v.o);
                                    break;
                                }
                                case 9: 
                                case 13: {
                                    this.m(v.p);
                                    break;
                                }
                                case 10: 
                                case 14: {
                                    long v2 = this.h.indexOfElement(v.q);
                                    if(v2 == -1L) {
                                        v2 = buffer0.size();
                                    }
                                    buffer0.skip(v2);
                                    break;
                                }
                                case 17: {
                                    buffer0.skip(((long)this.l));
                                    break;
                                }
                                case 18: {
                                    throw new JsonDataException("Expected a value but was " + this.peek() + " at path " + "$");
                                }
                            }
                            goto label_44;
                        }
                    }
                }
                case 1: {
                    this.a(3);
                    ++v;
                    goto label_44;
                }
                case 2: {
                    break;
                }
                case 3: {
                    this.a(1);
                    ++v;
                    goto label_44;
                }
                case 4: {
                label_36:
                    --v;
                    if(v < 0) {
                        throw new JsonDataException("Expected a value but was " + this.peek() + " at path " + "$");
                    }
                    --this.a;
                    goto label_44;
                }
                default: {
                    goto label_7;
                }
            }
            --v;
            if(v < 0) {
                break;
            }
            --this.a;
        label_44:
            this.j = 0;
            if(v == 0) {
                int v3 = this.a - 1;
                ++this.d[v3];
                this.c[v3] = "null";
                return;
            }
        }
        throw new JsonDataException("Expected a value but was " + this.peek() + " at path " + "$");
    }

    @Override
    public final String toString() {
        return "JsonReader(" + this.h + ")";
    }
}

