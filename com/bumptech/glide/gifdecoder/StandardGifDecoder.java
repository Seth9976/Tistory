package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b6.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class StandardGifDecoder implements GifDecoder {
    public int[] a;
    public final int[] b;
    public final BitmapProvider c;
    public ByteBuffer d;
    public byte[] e;
    public GifHeaderParser f;
    public short[] g;
    public byte[] h;
    public byte[] i;
    public byte[] j;
    public int[] k;
    public int l;
    public GifHeader m;
    public Bitmap n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public int s;
    public Boolean t;
    public Bitmap.Config u;

    public StandardGifDecoder(@NonNull BitmapProvider gifDecoder$BitmapProvider0) {
        this.b = new int[0x100];
        this.u = Bitmap.Config.ARGB_8888;
        this.c = gifDecoder$BitmapProvider0;
        this.m = new GifHeader();
    }

    public StandardGifDecoder(@NonNull BitmapProvider gifDecoder$BitmapProvider0, GifHeader gifHeader0, ByteBuffer byteBuffer0) {
        this(gifDecoder$BitmapProvider0, gifHeader0, byteBuffer0, 1);
    }

    public StandardGifDecoder(@NonNull BitmapProvider gifDecoder$BitmapProvider0, GifHeader gifHeader0, ByteBuffer byteBuffer0, int v) {
        this(gifDecoder$BitmapProvider0);
        this.setData(gifHeader0, byteBuffer0, v);
    }

    public final Bitmap a() {
        Bitmap bitmap0 = this.c.obtain(this.s, this.r, (this.t == null || this.t.booleanValue() ? Bitmap.Config.ARGB_8888 : this.u));
        bitmap0.setHasAlpha(true);
        return bitmap0;
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder
    public void advance() {
        this.l = (this.l + 1) % this.m.c;
    }

    public final Bitmap b(a a0, a a1) {
        int v97;
        int v96;
        int v95;
        int v89;
        int v79;
        int v75;
        int v72;
        int v68;
        int v67;
        int v39;
        int v32;
        int v31;
        int v30;
        int v1;
        int[] arr_v = this.k;
        BitmapProvider gifDecoder$BitmapProvider0 = this.c;
        if(a1 == null) {
            Bitmap bitmap0 = this.n;
            if(bitmap0 != null) {
                gifDecoder$BitmapProvider0.release(bitmap0);
            }
            this.n = null;
            Arrays.fill(arr_v, 0);
        }
        if(a1 != null && a1.g == 3 && this.n == null) {
            Arrays.fill(arr_v, 0);
        }
        if(a1 != null) {
            int v = a1.g;
            if(v > 0) {
                if(v == 2) {
                    if(a0.f) {
                        v1 = 0;
                    }
                    else {
                        v1 = this.m.k;
                        if(a0.k != null && this.m.j == a0.h) {
                            v1 = 0;
                        }
                    }
                    int v2 = this.q;
                    int v3 = a1.d / v2;
                    int v4 = a1.b / v2;
                    int v5 = a1.c / v2;
                    int v6 = this.s;
                    int v7 = v4 * v6 + a1.a / v2;
                    int v8 = v3 * v6 + v7;
                    while(v7 < v8) {
                        int v9 = v7 + v5;
                        for(int v10 = v7; v10 < v9; ++v10) {
                            arr_v[v10] = v1;
                        }
                        v7 += this.s;
                    }
                }
                else if(v == 3) {
                    Bitmap bitmap1 = this.n;
                    if(bitmap1 != null) {
                        bitmap1.getPixels(arr_v, 0, this.s, 0, 0, this.s, this.r);
                    }
                }
            }
        }
        this.d.position(a0.j);
        int v11 = a0.c * a0.d;
        if(this.j == null || this.j.length < v11) {
            this.j = gifDecoder$BitmapProvider0.obtainByteArray(v11);
        }
        byte[] arr_b = this.j;
        if(this.g == null) {
            this.g = new short[0x1000];
        }
        short[] arr_v1 = this.g;
        if(this.h == null) {
            this.h = new byte[0x1000];
        }
        byte[] arr_b1 = this.h;
        if(this.i == null) {
            this.i = new byte[0x1001];
        }
        byte[] arr_b2 = this.i;
        int v12 = this.d.get();
        int v13 = 1 << (v12 & 0xFF);
        int v14 = (v12 & 0xFF) + 1;
        int v15 = (1 << v14) - 1;
        for(int v16 = 0; v16 < v13; ++v16) {
            arr_v1[v16] = 0;
            arr_b1[v16] = (byte)v16;
        }
        byte[] arr_b3 = this.e;
        int v17 = v14;
        int v18 = 0;
        int v19 = 0;
        int v20 = 0;
        int v21 = 0;
        int v22 = 0;
        int v23 = 0;
        int v24 = 0;
        int v25 = 0;
        int v26 = v13 + 2;
        int v27 = v15;
        int v28 = -1;
    alab1:
        while(true) {
            if(v18 >= v11) {
                v32 = v23;
                break;
            }
            if(v19 == 0) {
                int v29 = this.d.get() & 0xFF;
                if(v29 <= 0) {
                    v30 = v14;
                    v31 = v18;
                }
                else {
                    v30 = v14;
                    v31 = v18;
                    this.d.get(this.e, 0, Math.min(v29, this.d.remaining()));
                }
                if(v29 <= 0) {
                    this.p = 3;
                    v32 = v23;
                    break;
                }
                v19 = v29;
                v20 = 0;
            }
            else {
                v30 = v14;
                v31 = v18;
            }
            v22 += (arr_b3[v20] & 0xFF) << v21;
            ++v20;
            --v19;
            int v33 = v28;
            int v34 = v21 + 8;
            int v35 = v26;
            int v36 = v17;
            v18 = v31;
            int v37 = v24;
            while(v34 >= v36) {
                int v38 = v22 & v27;
                v22 >>= v36;
                v34 -= v36;
                if(v38 == v13) {
                    v35 = v13 + 2;
                    v27 = v15;
                    v36 = v30;
                    v33 = -1;
                }
                else {
                    if(v38 == v13 + 1) {
                        v24 = v37;
                        v17 = v36;
                        v26 = v35;
                        v14 = v30;
                        v28 = v33;
                        v21 = v34;
                        continue alab1;
                    }
                    if(v33 == -1) {
                        arr_b[v23] = arr_b1[v38];
                        ++v23;
                        ++v18;
                        v37 = v38;
                        v33 = v37;
                    }
                    else {
                        if(v38 >= v35) {
                            arr_b2[v25] = (byte)v37;
                            ++v25;
                            v39 = v33;
                        }
                        else {
                            v39 = v38;
                        }
                        while(v39 >= v13) {
                            arr_b2[v25] = arr_b1[v39];
                            ++v25;
                            v39 = arr_v1[v39];
                        }
                        int v40 = arr_b1[v39] & 0xFF;
                        byte b = (byte)v40;
                        arr_b[v23] = b;
                        while(true) {
                            ++v23;
                            ++v18;
                            if(v25 <= 0) {
                                break;
                            }
                            --v25;
                            arr_b[v23] = arr_b2[v25];
                        }
                        if(v35 < 0x1000) {
                            arr_v1[v35] = (short)v33;
                            arr_b1[v35] = b;
                            ++v35;
                            if((v35 & v27) == 0 && v35 < 0x1000) {
                                ++v36;
                                v27 += v35;
                            }
                        }
                        v33 = v38;
                        v37 = v40;
                    }
                }
            }
            v24 = v37;
            v17 = v36;
            v21 = v34;
            v26 = v35;
            v14 = v30;
            v28 = v33;
        }
        Arrays.fill(arr_b, v32, v11, 0);
        if(a0.e || this.q != 1) {
            int[] arr_v4 = this.k;
            int v56 = this.q;
            int v57 = a0.d / v56;
            int v58 = a0.b / v56;
            int v59 = a0.c / v56;
            int v60 = a0.a / v56;
            boolean z1 = this.l == 0;
            int v61 = this.s;
            int v62 = this.r;
            byte[] arr_b5 = this.j;
            int[] arr_v5 = this.a;
            Boolean boolean0 = this.t;
            int v63 = 8;
            int v64 = 0;
            int v65 = 0;
            int v66 = 1;
            while(v64 < v57) {
                if(a0.e) {
                    if(v65 >= v57) {
                        v67 = v57;
                        switch(v66 + 1) {
                            case 2: {
                                v65 = 4;
                                v66 = 2;
                                break;
                            }
                            case 3: {
                                v63 = 4;
                                v66 = 3;
                                v65 = 2;
                                break;
                            }
                            case 4: {
                                v66 = 4;
                                v65 = 1;
                                v63 = 2;
                                break;
                            }
                            default: {
                                ++v66;
                            }
                        }
                    }
                    else {
                        v67 = v57;
                    }
                    v68 = v65 + v63;
                }
                else {
                    v67 = v57;
                    v68 = v65;
                    v65 = v64;
                }
                int v69 = v65 + v58;
                if(v69 < v62) {
                    int v70 = v69 * v61;
                    int v71 = v70 + v60;
                    v72 = v68;
                    int v73 = v71 + v59;
                    int v74 = v70 + v61;
                    if(v74 < v73) {
                        v73 = v74;
                    }
                    v75 = v58;
                    int v76 = v64 * v56 * a0.c;
                    if(v56 == 1) {
                        for(int v77 = v71; v77 < v73; ++v77) {
                            int v78 = arr_v5[arr_b5[v76] & 0xFF];
                            if(v78 != 0) {
                                arr_v4[v77] = v78;
                            }
                            else if(z1 && boolean0 == null) {
                                boolean0 = Boolean.TRUE;
                            }
                            ++v76;
                        }
                        v79 = v59;
                    }
                    else {
                        v79 = v59;
                        int v80 = (v73 - v71) * v56 + v76;
                        int v81 = v71;
                        while(v81 < v73) {
                            int v82 = a0.c;
                            int v83 = v76;
                            int v84 = 0;
                            int v85 = 0;
                            int v86 = 0;
                            int v87 = 0;
                            int v88 = 0;
                            while(true) {
                                if(v83 < this.q + v76) {
                                    byte[] arr_b6 = this.j;
                                    v89 = v62;
                                    if(v83 >= arr_b6.length || v83 >= v80) {
                                        break;
                                    }
                                    else {
                                        int v90 = this.a[arr_b6[v83] & 0xFF];
                                        if(v90 != 0) {
                                            v84 += v90 >> 24 & 0xFF;
                                            v85 += v90 >> 16 & 0xFF;
                                            v86 += v90 >> 8 & 0xFF;
                                            v87 += v90 & 0xFF;
                                            ++v88;
                                        }
                                        ++v83;
                                        v62 = v89;
                                        continue;
                                    }
                                }
                                v89 = v62;
                                break;
                            }
                            int v91 = v82 + v76;
                            for(int v92 = v91; v92 < this.q + v91; ++v92) {
                                byte[] arr_b7 = this.j;
                                if(v92 >= arr_b7.length || v92 >= v80) {
                                    break;
                                }
                                int v93 = this.a[arr_b7[v92] & 0xFF];
                                if(v93 != 0) {
                                    v84 += v93 >> 24 & 0xFF;
                                    v85 += v93 >> 16 & 0xFF;
                                    v86 += v93 >> 8 & 0xFF;
                                    v87 += v93 & 0xFF;
                                    ++v88;
                                }
                            }
                            int v94 = v88 == 0 ? 0 : v84 / v88 << 24 | v85 / v88 << 16 | v86 / v88 << 8 | v87 / v88;
                            if(v94 != 0) {
                                arr_v4[v81] = v94;
                            }
                            else if(z1 && boolean0 == null) {
                                boolean0 = Boolean.TRUE;
                            }
                            v76 += v56;
                            ++v81;
                            v62 = v89;
                        }
                    }
                }
                else {
                    v72 = v68;
                    v75 = v58;
                    v79 = v59;
                }
                v95 = v60;
                v96 = v61;
                v97 = v62;
                ++v64;
                v57 = v67;
                v65 = v72;
                v58 = v75;
                v59 = v79;
                v60 = v95;
                v61 = v96;
                v62 = v97;
            }
            if(this.t == null) {
                this.t = Boolean.valueOf((boolean0 == null ? false : boolean0.booleanValue()));
            }
        }
        else {
            int[] arr_v2 = this.k;
            int v41 = a0.d;
            int v42 = a0.b;
            int v43 = a0.c;
            int v44 = a0.a;
            boolean z = this.l == 0;
            int v45 = this.s;
            byte[] arr_b4 = this.j;
            int[] arr_v3 = this.a;
            int v47 = -1;
            for(int v46 = 0; v46 < v41; ++v46) {
                int v48 = (v46 + v42) * v45;
                int v49 = v48 + v44;
                int v50 = v49 + v43;
                int v51 = v48 + v45;
                if(v51 < v50) {
                    v50 = v51;
                }
                int v52 = a0.c * v46;
                while(v49 < v50) {
                    int v53 = arr_b4[v52];
                    int v54 = v53 & 0xFF;
                    if(v54 != v47) {
                        int v55 = arr_v3[v54];
                        if(v55 == 0) {
                            v47 = v53;
                        }
                        else {
                            arr_v2[v49] = v55;
                        }
                    }
                    ++v52;
                    ++v49;
                }
            }
            this.t = Boolean.valueOf(this.t != null && this.t.booleanValue() || this.t == null && z && v47 != -1);
        }
        if(this.o && (a0.g == 0 || a0.g == 1)) {
            if(this.n == null) {
                this.n = this.a();
            }
            this.n.setPixels(arr_v, 0, this.s, 0, 0, this.s, this.r);
        }
        Bitmap bitmap2 = this.a();
        bitmap2.setPixels(arr_v, 0, this.s, 0, 0, this.s, this.r);
        return bitmap2;
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder
    public void clear() {
        this.m = null;
        byte[] arr_b = this.j;
        BitmapProvider gifDecoder$BitmapProvider0 = this.c;
        if(arr_b != null) {
            gifDecoder$BitmapProvider0.release(arr_b);
        }
        int[] arr_v = this.k;
        if(arr_v != null) {
            gifDecoder$BitmapProvider0.release(arr_v);
        }
        Bitmap bitmap0 = this.n;
        if(bitmap0 != null) {
            gifDecoder$BitmapProvider0.release(bitmap0);
        }
        this.n = null;
        this.d = null;
        this.t = null;
        byte[] arr_b1 = this.e;
        if(arr_b1 != null) {
            gifDecoder$BitmapProvider0.release(arr_b1);
        }
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder
    public int getByteSize() {
        return this.k.length * 4 + (this.d.limit() + this.j.length);
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder
    public int getCurrentFrameIndex() {
        return this.l;
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder
    @NonNull
    public ByteBuffer getData() {
        return this.d;
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder
    public int getDelay(int v) {
        if(v >= 0) {
            return v >= this.m.c ? -1 : ((a)this.m.e.get(v)).i;
        }
        return -1;
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder
    public int getFrameCount() {
        return this.m.c;
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder
    public int getHeight() {
        return this.m.g;
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder
    @Deprecated
    public int getLoopCount() {
        int v = this.m.l;
        return v == -1 ? 1 : v;
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder
    public int getNetscapeLoopCount() {
        return this.m.l;
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder
    public int getNextDelay() {
        if(this.m.c > 0) {
            return this.l < 0 ? 0 : this.getDelay(this.l);
        }
        return 0;
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder
    @Nullable
    public Bitmap getNextFrame() {
        synchronized(this) {
            if(this.m.c <= 0 || this.l < 0) {
                if(Log.isLoggable("StandardGifDecoder", 3)) {
                    Log.d("StandardGifDecoder", "Unable to decode frame, frameCount=" + this.m.c + ", framePointer=" + this.l);
                }
                this.p = 1;
            }
            if(this.p != 1 && this.p != 2) {
                this.p = 0;
                if(this.e == null) {
                    this.e = this.c.obtainByteArray(0xFF);
                }
                a a0 = (a)this.m.e.get(this.l);
                int v1 = this.l - 1;
                a a1 = v1 < 0 ? null : ((a)this.m.e.get(v1));
                int[] arr_v = a0.k == null ? this.m.a : a0.k;
                this.a = arr_v;
                if(arr_v == null) {
                    if(Log.isLoggable("StandardGifDecoder", 3)) {
                        Log.d("StandardGifDecoder", "No valid color table found for frame #" + this.l);
                    }
                    this.p = 1;
                    return null;
                }
                if(a0.f) {
                    System.arraycopy(arr_v, 0, this.b, 0, arr_v.length);
                    this.a = this.b;
                    this.b[a0.h] = 0;
                    if(a0.g == 2 && this.l == 0) {
                        this.t = Boolean.TRUE;
                    }
                }
                return this.b(a0, a1);
            }
            if(Log.isLoggable("StandardGifDecoder", 3)) {
                Log.d("StandardGifDecoder", "Unable to decode frame, status=" + this.p);
            }
            return null;
        }
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder
    public int getStatus() {
        return this.p;
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder
    public int getTotalIterationCount() {
        int v = this.m.l;
        if(v == -1) {
            return 1;
        }
        return v == 0 ? 0 : v + 1;
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder
    public int getWidth() {
        return this.m.f;
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder
    public int read(@Nullable InputStream inputStream0, int v) {
        if(inputStream0 == null) {
            this.p = 2;
        }
        else {
            try {
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((v <= 0 ? 0x4000 : v + 0x1000));
                byte[] arr_b = new byte[0x4000];
                int v1;
                while((v1 = inputStream0.read(arr_b, 0, 0x4000)) != -1) {
                    byteArrayOutputStream0.write(arr_b, 0, v1);
                }
                byteArrayOutputStream0.flush();
                this.read(byteArrayOutputStream0.toByteArray());
                goto label_14;
            }
            catch(IOException iOException0) {
            }
            Log.w("StandardGifDecoder", "Error reading data from stream", iOException0);
        }
    label_14:
        if(inputStream0 != null) {
            try {
                inputStream0.close();
                return this.p;
            }
            catch(IOException iOException1) {
                Log.w("StandardGifDecoder", "Error closing stream", iOException1);
            }
        }
        return this.p;
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder
    public int read(@Nullable byte[] arr_b) {
        synchronized(this) {
            if(this.f == null) {
                this.f = new GifHeaderParser();
            }
            GifHeader gifHeader0 = this.f.setData(arr_b).parseHeader();
            this.m = gifHeader0;
            if(arr_b != null) {
                this.setData(gifHeader0, arr_b);
            }
            return this.p;
        }
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder
    public void resetFrameIndex() {
        this.l = -1;
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder
    public void setData(@NonNull GifHeader gifHeader0, @NonNull ByteBuffer byteBuffer0) {
        synchronized(this) {
            this.setData(gifHeader0, byteBuffer0, 1);
        }
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder
    public void setData(@NonNull GifHeader gifHeader0, @NonNull ByteBuffer byteBuffer0, int v) {
        synchronized(this) {
            if(v > 0) {
                int v2 = Integer.highestOneBit(v);
                this.p = 0;
                this.m = gifHeader0;
                this.l = -1;
                ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
                this.d = byteBuffer1;
                byteBuffer1.position(0);
                this.d.order(ByteOrder.LITTLE_ENDIAN);
                this.o = false;
                for(Object object0: gifHeader0.e) {
                    if(((a)object0).g == 3) {
                        this.o = true;
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
                this.q = v2;
                int v3 = gifHeader0.f;
                this.s = v3 / v2;
                int v4 = gifHeader0.g;
                this.r = v4 / v2;
                this.j = this.c.obtainByteArray(v3 * v4);
                this.k = this.c.obtainIntArray(this.s * this.r);
                return;
            }
        }
        throw new IllegalArgumentException("Sample size must be >=0, not: " + v);
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder
    public void setData(@NonNull GifHeader gifHeader0, @NonNull byte[] arr_b) {
        synchronized(this) {
            this.setData(gifHeader0, ByteBuffer.wrap(arr_b));
        }
    }

    @Override  // com.bumptech.glide.gifdecoder.GifDecoder
    public void setDefaultBitmapConfig(@NonNull Bitmap.Config bitmap$Config0) {
        Bitmap.Config bitmap$Config1 = Bitmap.Config.ARGB_8888;
        if(bitmap$Config0 != bitmap$Config1) {
            Bitmap.Config bitmap$Config2 = Bitmap.Config.RGB_565;
            if(bitmap$Config0 != bitmap$Config2) {
                throw new IllegalArgumentException("Unsupported format: " + bitmap$Config0 + ", must be one of " + bitmap$Config1 + " or " + bitmap$Config2);
            }
        }
        this.u = bitmap$Config0;
    }
}

