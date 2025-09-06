package com.squareup.moshi;

import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;

public final class a0 implements Source {
    public final BufferedSource a;
    public final Buffer b;
    public final Buffer c;
    public ByteString d;
    public int e;
    public long f;
    public boolean g;
    public static final ByteString h;
    public static final ByteString i;
    public static final ByteString j;
    public static final ByteString k;
    public static final ByteString l;
    public static final ByteString m;

    static {
        a0.h = ByteString.encodeUtf8("[]{}\"\'/#");
        a0.i = ByteString.encodeUtf8("\'\\");
        a0.j = ByteString.encodeUtf8("\"\\");
        a0.k = ByteString.encodeUtf8("\r\n");
        a0.l = ByteString.encodeUtf8("*");
        a0.m = ByteString.EMPTY;
    }

    public a0(BufferedSource bufferedSource0, Buffer buffer0, ByteString byteString0, int v) {
        this.f = 0L;
        this.g = false;
        this.a = bufferedSource0;
        this.b = bufferedSource0.getBuffer();
        this.c = buffer0;
        this.d = byteString0;
        this.e = v;
    }

    public final void a(long v) {
        long v1;
        while((v1 = this.f) < v) {
            ByteString byteString0 = a0.m;
            if(this.d == byteString0) {
                return;
            }
            Buffer buffer0 = this.b;
            BufferedSource bufferedSource0 = this.a;
            if(Long.compare(v1, buffer0.size()) == 0) {
                if(this.f > 0L) {
                    return;
                }
                bufferedSource0.require(1L);
            }
            long v2 = buffer0.indexOfElement(this.d, this.f);
            if(v2 == -1L) {
                this.f = buffer0.size();
            }
            else {
                int v3 = buffer0.getByte(v2);
                ByteString byteString1 = this.d;
                ByteString byteString2 = a0.j;
                ByteString byteString3 = a0.i;
                ByteString byteString4 = a0.l;
                ByteString byteString5 = a0.k;
                ByteString byteString6 = a0.h;
                if(byteString1 == byteString6) {
                    switch(v3) {
                        case 34: {
                            this.d = byteString2;
                            this.f = v2 + 1L;
                            break;
                        }
                        case 35: {
                            this.d = byteString5;
                            this.f = v2 + 1L;
                            break;
                        }
                        case 39: {
                            this.d = byteString3;
                            this.f = v2 + 1L;
                            break;
                        }
                        case 0x2F: {
                            bufferedSource0.require(v2 + 2L);
                            int v4 = buffer0.getByte(v2 + 1L);
                            if(v4 == 0x2F) {
                                this.d = byteString5;
                                this.f = v2 + 2L;
                            }
                            else if(v4 == 42) {
                                this.d = byteString4;
                                this.f = v2 + 2L;
                            }
                            else {
                                this.f = v2 + 1L;
                            }
                            break;
                        }
                        case 91: 
                        case 0x7B: {
                            ++this.e;
                            this.f = v2 + 1L;
                            break;
                        }
                        case 93: 
                        case 0x7D: {
                            int v5 = this.e - 1;
                            this.e = v5;
                            if(v5 == 0) {
                                this.d = byteString0;
                            }
                            this.f = v2 + 1L;
                        }
                    }
                }
                else {
                    if(byteString1 != byteString3 && byteString1 != byteString2) {
                        if(byteString1 == byteString4) {
                            bufferedSource0.require(v2 + 2L);
                            if(buffer0.getByte(v2 + 1L) == 0x2F) {
                                this.f = v2 + 2L;
                                this.d = byteString6;
                            }
                            else {
                                this.f = v2 + 1L;
                            }
                        }
                        else {
                            if(byteString1 != byteString5) {
                                throw new AssertionError();
                            }
                            this.f = v2 + 1L;
                            this.d = byteString6;
                        }
                        continue;
                    }
                    if(v3 == 92) {
                        bufferedSource0.require(v2 + 2L);
                        this.f = v2 + 2L;
                    }
                    else {
                        if(this.e > 0) {
                            byteString0 = byteString6;
                        }
                        this.d = byteString0;
                        this.f = v2 + 1L;
                    }
                }
            }
        }
    }

    @Override  // okio.Source
    public final void close() {
        this.g = true;
    }

    @Override  // okio.Source
    public final long read(Buffer buffer0, long v) {
        if(this.g) {
            throw new IllegalStateException("closed");
        }
        if(v == 0L) {
            return 0L;
        }
        Buffer buffer1 = this.c;
        Buffer buffer2 = this.b;
        if(!buffer1.exhausted()) {
            long v1 = buffer1.read(buffer0, v);
            if(buffer2.exhausted()) {
                return v1;
            }
            long v2 = this.read(buffer0, v - v1);
            return v2 == -1L ? v1 : v1 + v2;
        }
        this.a(v);
        long v3 = this.f;
        if(v3 == 0L) {
            if(this.d != a0.m) {
                throw new AssertionError();
            }
            return -1L;
        }
        long v4 = Math.min(v, v3);
        buffer0.write(buffer2, v4);
        this.f -= v4;
        return v4;
    }

    @Override  // okio.Source
    public final Timeout timeout() {
        return this.a.timeout();
    }
}

