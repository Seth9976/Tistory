package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import i6.a;
import i6.b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel.MapMode;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.concurrent.atomic.AtomicReference;

public final class ByteBufferUtil {
    public static final AtomicReference a;

    static {
        ByteBufferUtil.a = new AtomicReference();
    }

    @NonNull
    public static ByteBuffer fromFile(@NonNull File file0) throws IOException {
        ByteBuffer byteBuffer0;
        RandomAccessFile randomAccessFile0;
        long v;
        AbstractInterruptibleChannel abstractInterruptibleChannel0 = null;
        try {
            v = file0.length();
            if(v > 0x7FFFFFFFL) {
                throw new IOException("File too large to map into memory");
            }
            if(v == 0L) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile0 = new RandomAccessFile(file0, "r");
        }
        catch(Throwable throwable0) {
            randomAccessFile0 = null;
            goto label_15;
        }
        try {
            abstractInterruptibleChannel0 = randomAccessFile0.getChannel();
            byteBuffer0 = ((FileChannel)abstractInterruptibleChannel0).map(FileChannel.MapMode.READ_ONLY, 0L, v).load();
            goto label_20;
        }
        catch(Throwable throwable0) {
        }
    label_15:
        if(abstractInterruptibleChannel0 != null) {
            try {
                abstractInterruptibleChannel0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        if(randomAccessFile0 != null) {
            try {
                randomAccessFile0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        throw throwable0;
        try {
        label_20:
            abstractInterruptibleChannel0.close();
        }
        catch(IOException unused_ex) {
        }
        try {
            randomAccessFile0.close();
        }
        catch(IOException unused_ex) {
        }
        return byteBuffer0;
    }

    @NonNull
    public static ByteBuffer fromStream(@NonNull InputStream inputStream0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0x4000);
        AtomicReference atomicReference0 = ByteBufferUtil.a;
        byte[] arr_b = (byte[])atomicReference0.getAndSet(null);
        if(arr_b == null) {
            arr_b = new byte[0x4000];
        }
        int v;
        while((v = inputStream0.read(arr_b)) >= 0) {
            byteArrayOutputStream0.write(arr_b, 0, v);
        }
        atomicReference0.set(arr_b);
        byte[] arr_b1 = byteArrayOutputStream0.toByteArray();
        return ByteBufferUtil.rewind(ByteBuffer.allocateDirect(arr_b1.length).put(arr_b1));
    }

    public static ByteBuffer rewind(ByteBuffer byteBuffer0) {
        return (ByteBuffer)byteBuffer0.position(0);
    }

    @NonNull
    public static byte[] toBytes(@NonNull ByteBuffer byteBuffer0) {
        b b0 = byteBuffer0.isReadOnly() || !byteBuffer0.hasArray() ? null : new b(byteBuffer0.array(), byteBuffer0.arrayOffset(), byteBuffer0.limit());
        if(b0 != null && b0.a == 0 && b0.b == ((byte[])b0.c).length) {
            return byteBuffer0.array();
        }
        ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
        byte[] arr_b = new byte[byteBuffer1.limit()];
        ByteBufferUtil.rewind(byteBuffer1);
        byteBuffer1.get(arr_b);
        return arr_b;
    }

    public static void toFile(@NonNull ByteBuffer byteBuffer0, @NonNull File file0) throws IOException {
        RandomAccessFile randomAccessFile0;
        ByteBufferUtil.rewind(byteBuffer0);
        FileChannel fileChannel0 = null;
        try {
            randomAccessFile0 = null;
            randomAccessFile0 = new RandomAccessFile(file0, "rw");
            fileChannel0 = randomAccessFile0.getChannel();
            fileChannel0.write(byteBuffer0);
            fileChannel0.force(false);
            fileChannel0.close();
            randomAccessFile0.close();
        }
        catch(Throwable throwable0) {
            if(fileChannel0 != null) {
                try {
                    fileChannel0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            if(randomAccessFile0 != null) {
                try {
                    randomAccessFile0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            throw throwable0;
        }
        try {
            fileChannel0.close();
        }
        catch(IOException unused_ex) {
        }
        try {
            randomAccessFile0.close();
        }
        catch(IOException unused_ex) {
        }
    }

    @NonNull
    public static InputStream toStream(@NonNull ByteBuffer byteBuffer0) {
        return new a(byteBuffer0);
    }

    public static void toStream(@NonNull ByteBuffer byteBuffer0, @NonNull OutputStream outputStream0) throws IOException {
        b b0 = byteBuffer0.isReadOnly() || !byteBuffer0.hasArray() ? null : new b(byteBuffer0.array(), byteBuffer0.arrayOffset(), byteBuffer0.limit());
        if(b0 != null) {
            outputStream0.write(((byte[])b0.c), b0.a, b0.b + b0.a);
            return;
        }
        AtomicReference atomicReference0 = ByteBufferUtil.a;
        byte[] arr_b = (byte[])atomicReference0.getAndSet(null);
        if(arr_b == null) {
            arr_b = new byte[0x4000];
        }
        while(byteBuffer0.remaining() > 0) {
            int v = Math.min(byteBuffer0.remaining(), arr_b.length);
            byteBuffer0.get(arr_b, 0, v);
            outputStream0.write(arr_b, 0, v);
        }
        atomicReference0.set(arr_b);
    }
}

