package com.bumptech.glide.gifdecoder;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b6.a;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.text.q;

public class GifHeaderParser {
    public final byte[] a;
    public ByteBuffer b;
    public GifHeader c;
    public int d;

    public GifHeaderParser() {
        this.a = new byte[0x100];
        this.d = 0;
    }

    public final boolean a() {
        return this.c.b != 0;
    }

    public final int b() {
        try {
            return this.b.get() & 0xFF;
        }
        catch(Exception unused_ex) {
            this.c.b = 1;
            return 0;
        }
    }

    public final void c() {
        int v3;
        int v = this.b();
        this.d = v;
        if(v > 0) {
            for(int v1 = 0; true; v1 += v3) {
                int v2 = this.d;
                if(v1 >= v2) {
                    break;
                }
                try {
                    v3 = v2 - v1;
                    this.b.get(this.a, v1, v3);
                }
                catch(Exception exception0) {
                    if(Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder stringBuilder0 = q.u("Error Reading Block n: ", v1, " count: ", v3, " blockSize: ");
                        stringBuilder0.append(this.d);
                        Log.d("GifHeaderParser", stringBuilder0.toString(), exception0);
                    }
                    this.c.b = 1;
                    break;
                }
            }
        }
    }

    public void clear() {
        this.b = null;
        this.c = null;
    }

    public final int[] d(int v) {
        byte[] arr_b = new byte[v * 3];
        int[] arr_v = null;
        try {
            this.b.get(arr_b);
            arr_v = new int[0x100];
            int v2 = 0;
        label_6:
            for(int v1 = 0; v1 < v; ++v1) {
                int v3 = arr_b[v2] & 0xFF;
                int v4 = v2 + 2;
                int v5 = arr_b[v2 + 1] & 0xFF;
                v2 += 3;
                arr_v[v1] = v5 << 8 | (v3 << 16 | 0xFF000000) | arr_b[v4] & 0xFF;
            }
        }
        catch(BufferUnderflowException bufferUnderflowException0) {
            if(Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", bufferUnderflowException0);
            }
            this.c.b = 1;
            if(true) {
                return arr_v;
            }
            goto label_6;
        }
        return arr_v;
    }

    public final void e(int v) {
        byte[] arr_b;
        boolean z = false;
        while(!z && !this.a() && this.c.c <= v) {
            boolean z1 = true;
            switch(this.b()) {
                case 33: {
                    switch(this.b()) {
                        case 1: {
                            this.g();
                            break;
                        }
                        case 0xF9: {
                            GifHeader gifHeader0 = this.c;
                            gifHeader0.d = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
                            this.b();
                            int v1 = this.b();
                            a a0 = this.c.d;
                            int v2 = (v1 & 28) >> 2;
                            a0.g = v2;
                            if(v2 == 0) {
                                a0.g = 1;
                            }
                            if((v1 & 1) == 0) {
                                z1 = false;
                            }
                            a0.f = z1;
                            int v3 = this.b.getShort();
                            if(v3 < 2) {
                                v3 = 10;
                            }
                            a a1 = this.c.d;
                            a1.i = v3 * 10;
                            a1.h = this.b();
                            this.b();
                            break;
                        }
                        case 0xFE: {
                            this.g();
                            break;
                        }
                        case 0xFF: {
                            this.c();
                            StringBuilder stringBuilder0 = new StringBuilder();
                            for(int v4 = 0; true; ++v4) {
                                arr_b = this.a;
                                if(v4 >= 11) {
                                    break;
                                }
                                stringBuilder0.append(((char)arr_b[v4]));
                            }
                            if(stringBuilder0.toString().equals("NETSCAPE2.0")) {
                                do {
                                    this.c();
                                    if(arr_b[0] == 1) {
                                        this.c.l = arr_b[1] & 0xFF | (arr_b[2] & 0xFF) << 8;
                                    }
                                }
                                while(this.d > 0 && !this.a());
                            }
                            else {
                                this.g();
                            }
                            break;
                        }
                        default: {
                            this.g();
                        }
                    }
                    break;
                }
                case 44: {
                    GifHeader gifHeader1 = this.c;
                    if(gifHeader1.d == null) {
                        gifHeader1.d = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
                    }
                    a a2 = gifHeader1.d;
                    a2.a = this.b.getShort();
                    a a3 = this.c.d;
                    a3.b = this.b.getShort();
                    a a4 = this.c.d;
                    a4.c = this.b.getShort();
                    a a5 = this.c.d;
                    a5.d = this.b.getShort();
                    int v5 = this.b();
                    int v6 = (int)Math.pow(2.0, (v5 & 7) + 1);
                    a a6 = this.c.d;
                    a6.e = (v5 & 0x40) != 0;
                    a6.k = (v5 & 0x80) == 0 ? null : this.d(v6);
                    this.c.d.j = this.b.position();
                    this.b();
                    this.g();
                    if(this.a()) {
                        continue;
                    }
                    GifHeader gifHeader2 = this.c;
                    ++gifHeader2.c;
                    gifHeader2.e.add(gifHeader2.d);
                    break;
                }
                case 59: {
                    z = true;
                    break;
                }
                default: {
                    this.c.b = 1;
                }
            }
        }
    }

    public final void f() {
        StringBuilder stringBuilder0 = new StringBuilder();
        boolean z = false;
        for(int v = 0; v < 6; ++v) {
            stringBuilder0.append(((char)this.b()));
        }
        if(!stringBuilder0.toString().startsWith("GIF")) {
            this.c.b = 1;
            return;
        }
        GifHeader gifHeader0 = this.c;
        gifHeader0.f = this.b.getShort();
        GifHeader gifHeader1 = this.c;
        gifHeader1.g = this.b.getShort();
        int v1 = this.b();
        GifHeader gifHeader2 = this.c;
        if((v1 & 0x80) != 0) {
            z = true;
        }
        gifHeader2.h = z;
        gifHeader2.i = (int)Math.pow(2.0, (v1 & 7) + 1);
        GifHeader gifHeader3 = this.c;
        gifHeader3.j = this.b();
        GifHeader gifHeader4 = this.c;
        this.b();
        gifHeader4.getClass();
        if(this.c.h && !this.a()) {
            GifHeader gifHeader5 = this.c;
            gifHeader5.a = this.d(gifHeader5.i);
            this.c.k = this.c.a[this.c.j];
        }
    }

    public final void g() {
        do {
            int v = this.b();
            this.b.position(Math.min(this.b.position() + v, this.b.limit()));
        }
        while(v > 0);
    }

    public boolean isAnimated() {
        this.f();
        if(!this.a()) {
            this.e(2);
        }
        return this.c.c > 1;
    }

    @NonNull
    public GifHeader parseHeader() {
        if(this.b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if(this.a()) {
            return this.c;
        }
        this.f();
        if(!this.a()) {
            this.e(0x7FFFFFFF);
            GifHeader gifHeader0 = this.c;
            if(gifHeader0.c < 0) {
                gifHeader0.b = 1;
            }
        }
        return this.c;
    }

    public GifHeaderParser setData(@NonNull ByteBuffer byteBuffer0) {
        this.b = null;
        Arrays.fill(this.a, 0);
        this.c = new GifHeader();
        this.d = 0;
        ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
        this.b = byteBuffer1;
        byteBuffer1.position(0);
        this.b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public GifHeaderParser setData(@Nullable byte[] arr_b) {
        if(arr_b != null) {
            this.setData(ByteBuffer.wrap(arr_b));
            return this;
        }
        this.b = null;
        this.c.b = 2;
        return this;
    }
}

