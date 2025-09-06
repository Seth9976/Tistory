package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.f;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.text.q;

public final class DefaultImageHeaderParser implements ImageHeaderParser {
    interface Reader {
        public static final class EndOfFileException extends IOException {
            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int getUInt16() throws IOException;

        short getUInt8() throws IOException;

        int read(byte[] arg1, int arg2) throws IOException;

        long skip(long arg1) throws IOException;
    }

    public static final byte[] a;
    public static final int[] b;

    static {
        DefaultImageHeaderParser.a = new byte[]{69, 120, 105, 102, 0, 0};
        DefaultImageHeaderParser.b = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    }

    public static int a(Reader defaultImageHeaderParser$Reader0, ArrayPool arrayPool0) {
        try {
            int v = defaultImageHeaderParser$Reader0.getUInt16();
            boolean z = (v & 0xFFD8) == 0xFFD8 || (v == 0x4949 || v == 0x4D4D);
            if(!z) {
                if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn\'t handle magic number: " + v);
                }
                return -1;
            }
            int v1 = DefaultImageHeaderParser.c(defaultImageHeaderParser$Reader0);
            if(v1 == -1) {
                if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] arr_b = (byte[])arrayPool0.get(v1, byte[].class);
            try {
                return DefaultImageHeaderParser.d(defaultImageHeaderParser$Reader0, arr_b, v1);
            }
            finally {
                arrayPool0.put(arr_b);
            }
        }
        catch(EndOfFileException unused_ex) {
            return -1;
        }
    }

    public static ImageType b(Reader defaultImageHeaderParser$Reader0) {
        try {
            int v = defaultImageHeaderParser$Reader0.getUInt16();
            if(v == 0xFFD8) {
                return ImageType.JPEG;
            }
            int v1 = v << 8 | defaultImageHeaderParser$Reader0.getUInt8();
            if(v1 == 0x474946) {
                return ImageType.GIF;
            }
            int v2 = v1 << 8 | defaultImageHeaderParser$Reader0.getUInt8();
            switch(v2) {
                case 0x89504E47: {
                    defaultImageHeaderParser$Reader0.skip(21L);
                    try {
                        return defaultImageHeaderParser$Reader0.getUInt8() < 3 ? ImageType.PNG : ImageType.PNG_A;
                    }
                    catch(EndOfFileException unused_ex) {
                        return ImageType.PNG;
                    }
                }
                case 1380533830: {
                    defaultImageHeaderParser$Reader0.skip(4L);
                    if((defaultImageHeaderParser$Reader0.getUInt16() << 16 | defaultImageHeaderParser$Reader0.getUInt16()) != 0x57454250) {
                        return ImageType.UNKNOWN;
                    }
                    int v7 = defaultImageHeaderParser$Reader0.getUInt16() << 16 | defaultImageHeaderParser$Reader0.getUInt16();
                    if((v7 & 0xFFFFFF00) != 0x56503800) {
                        return ImageType.UNKNOWN;
                    }
                    switch(v7 & 0xFF) {
                        case 76: {
                            defaultImageHeaderParser$Reader0.skip(4L);
                            return (defaultImageHeaderParser$Reader0.getUInt8() & 8) == 0 ? ImageType.WEBP : ImageType.WEBP_A;
                        }
                        case 88: {
                            defaultImageHeaderParser$Reader0.skip(4L);
                            int v8 = defaultImageHeaderParser$Reader0.getUInt8();
                            if((v8 & 2) != 0) {
                                return ImageType.ANIMATED_WEBP;
                            }
                            return (v8 & 16) == 0 ? ImageType.WEBP : ImageType.WEBP_A;
                        }
                        default: {
                            return ImageType.WEBP;
                        }
                    }
                }
                default: {
                    if((defaultImageHeaderParser$Reader0.getUInt16() << 16 | defaultImageHeaderParser$Reader0.getUInt16()) != 0x66747970) {
                        return ImageType.UNKNOWN;
                    }
                    int v3 = 0;
                    int v4 = defaultImageHeaderParser$Reader0.getUInt16() << 16 | defaultImageHeaderParser$Reader0.getUInt16();
                    if(v4 == 1635150195) {
                        return ImageType.ANIMATED_AVIF;
                    }
                    boolean z = v4 == 1635150182;
                    defaultImageHeaderParser$Reader0.skip(4L);
                    int v5 = v2 - 16;
                    if(v5 % 4 == 0) {
                        while(v3 < 5 && v5 > 0) {
                            int v6 = defaultImageHeaderParser$Reader0.getUInt16() << 16 | defaultImageHeaderParser$Reader0.getUInt16();
                            if(v6 == 1635150195) {
                                return ImageType.ANIMATED_AVIF;
                            }
                            if(v6 == 1635150182) {
                                z = true;
                            }
                            ++v3;
                            v5 -= 4;
                        }
                    }
                    return z ? ImageType.AVIF : ImageType.UNKNOWN;
                }
            }
        }
        catch(EndOfFileException unused_ex) {
            return ImageType.UNKNOWN;
        }
    }

    public static int c(Reader defaultImageHeaderParser$Reader0) {
        int v2;
        while(true) {
            int v = defaultImageHeaderParser$Reader0.getUInt8();
            if(v != 0xFF) {
                if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + v);
                }
                return -1;
            }
            int v1 = defaultImageHeaderParser$Reader0.getUInt8();
            if(v1 == 0xDA) {
                return -1;
            }
            if(v1 == 0xD9) {
                if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            v2 = defaultImageHeaderParser$Reader0.getUInt16() - 2;
            if(v1 == 0xE1) {
                break;
            }
            long v3 = defaultImageHeaderParser$Reader0.skip(((long)v2));
            if(v3 != ((long)v2)) {
                if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder stringBuilder0 = q.u("Unable to skip enough data, type: ", v1, ", wanted to skip: ", v2, ", but actually skipped: ");
                    stringBuilder0.append(v3);
                    Log.d("DfltImageHeaderParser", stringBuilder0.toString());
                }
                return -1;
            }
        }
        return v2;
    }

    public static int d(Reader defaultImageHeaderParser$Reader0, byte[] arr_b, int v) {
        ByteOrder byteOrder0;
        int v1 = defaultImageHeaderParser$Reader0.read(arr_b, v);
        if(v1 != v) {
            if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + v + ", actually read: " + v1);
            }
            return -1;
        }
        byte[] arr_b1 = DefaultImageHeaderParser.a;
        boolean z = arr_b != null && v > arr_b1.length;
        if(z) {
            for(int v3 = 0; v3 < arr_b1.length; ++v3) {
                if(arr_b[v3] != arr_b1[v3]) {
                    z = false;
                    break;
                }
            }
        }
        if(z) {
            f f0 = new f(arr_b, v);
            int v4 = f0.d(6);
            switch(v4) {
                case 0x4949: {
                    byteOrder0 = ByteOrder.LITTLE_ENDIAN;
                    break;
                }
                case 0x4D4D: {
                    byteOrder0 = ByteOrder.BIG_ENDIAN;
                    break;
                }
                default: {
                    if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Unknown endianness = " + v4);
                    }
                    byteOrder0 = ByteOrder.BIG_ENDIAN;
                }
            }
            ByteBuffer byteBuffer0 = (ByteBuffer)f0.b;
            byteBuffer0.order(byteOrder0);
            int v5 = byteBuffer0.remaining() - 10 < 4 ? -1 : byteBuffer0.getInt(10);
            int v6 = f0.d(v5 + 6);
            for(int v2 = 0; v2 < v6; ++v2) {
                int v7 = v2 * 12 + (v5 + 8);
                if(f0.d(v7) == 274) {
                    int v8 = f0.d(v7 + 2);
                    if(v8 >= 1 && v8 <= 12) {
                        int v9 = byteBuffer0.remaining() - (v7 + 4) < 4 ? -1 : byteBuffer0.getInt(v7 + 4);
                        if(v9 >= 0) {
                            if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder stringBuilder0 = q.u("Got tagIndex=", v2, " tagType=", 274, " formatCode=");
                                stringBuilder0.append(v8);
                                stringBuilder0.append(" componentCount=");
                                stringBuilder0.append(v9);
                                Log.d("DfltImageHeaderParser", stringBuilder0.toString());
                            }
                            int v10 = v9 + DefaultImageHeaderParser.b[v8];
                            if(v10 <= 4) {
                                if(v7 + 8 >= 0 && v7 + 8 <= byteBuffer0.remaining()) {
                                    if(v10 >= 0 && v10 + (v7 + 8) <= byteBuffer0.remaining()) {
                                        return f0.d(v7 + 8);
                                    }
                                    if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + 274);
                                    }
                                }
                                else if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + (v7 + 8) + " tagType=" + 274);
                                }
                            }
                            else if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + v8);
                            }
                        }
                        else if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    }
                    else if(Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + v8);
                    }
                }
            }
            return -1;
        }
        if(Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    @Override  // com.bumptech.glide.load.ImageHeaderParser
    public int getOrientation(@NonNull InputStream inputStream0, @NonNull ArrayPool arrayPool0) throws IOException {
        return DefaultImageHeaderParser.a(new b(((InputStream)Preconditions.checkNotNull(inputStream0))), ((ArrayPool)Preconditions.checkNotNull(arrayPool0)));
    }

    @Override  // com.bumptech.glide.load.ImageHeaderParser
    public int getOrientation(@NonNull ByteBuffer byteBuffer0, @NonNull ArrayPool arrayPool0) throws IOException {
        return DefaultImageHeaderParser.a(new a(((ByteBuffer)Preconditions.checkNotNull(byteBuffer0))), ((ArrayPool)Preconditions.checkNotNull(arrayPool0)));
    }

    @Override  // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageType getType(@NonNull InputStream inputStream0) throws IOException {
        return DefaultImageHeaderParser.b(new b(((InputStream)Preconditions.checkNotNull(inputStream0))));
    }

    @Override  // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageType getType(@NonNull ByteBuffer byteBuffer0) throws IOException {
        return DefaultImageHeaderParser.b(new a(((ByteBuffer)Preconditions.checkNotNull(byteBuffer0))));
    }
}

