package com.google.firebase.crashlytics.internal.common;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

public final class c {
    public static final AtomicLong a;
    public static String b;

    static {
        c.a = new AtomicLong(0L);
    }

    public c(IdManager idManager0) {
        long v = new Date().getTime();
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(4);
        byteBuffer0.putInt(((int)(v / 1000L)));
        byteBuffer0.order(ByteOrder.BIG_ENDIAN);
        byteBuffer0.position(0);
        byte[] arr_b = byteBuffer0.array();
        byte b = arr_b[0];
        byte b1 = arr_b[1];
        byte b2 = arr_b[2];
        byte b3 = arr_b[3];
        byte[] arr_b1 = c.a(v % 1000L);
        byte[] arr_b2 = {b, b1, b2, b3, arr_b1[0], arr_b1[1], 0, 1, 6, 16};
        String s = CommonUtils.sha1(idManager0.getCrashlyticsInstallId());
        String s1 = CommonUtils.hexify(arr_b2);
        c.b = String.format(Locale.US, "%s%s%s%s", s1.substring(0, 12), s1.substring(12, 16), s1.subSequence(16, 20), s.substring(0, 12)).toUpperCase(Locale.US);
    }

    public static byte[] a(long v) [...] // 潜在的解密器

    @Override
    public final String toString() {
        return c.b;
    }
}

