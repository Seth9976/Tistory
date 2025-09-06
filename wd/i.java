package wd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import s4.u1;

public abstract class i extends h {
    public static final void appendBytes(@NotNull File file0, @NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(arr_b, "array");
        FileOutputStream fileOutputStream0 = new FileOutputStream(file0, true);
        try {
            fileOutputStream0.write(arr_b);
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(fileOutputStream0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(fileOutputStream0, null);
    }

    public static final void appendText(@NotNull File file0, @NotNull String s, @NotNull Charset charset0) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(s, "text");
        Intrinsics.checkNotNullParameter(charset0, "charset");
        byte[] arr_b = s.getBytes(charset0);
        Intrinsics.checkNotNullExpressionValue(arr_b, "getBytes(...)");
        i.appendBytes(file0, arr_b);
    }

    public static void appendText$default(File file0, String s, Charset charset0, int v, Object object0) {
        if((v & 2) != 0) {
            charset0 = Charsets.UTF_8;
        }
        i.appendText(file0, s, charset0);
    }

    public static final void forEachBlock(@NotNull File file0, int v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "action");
        byte[] arr_b = new byte[c.coerceAtLeast(v, 0x200)];
        FileInputStream fileInputStream0 = new FileInputStream(file0);
        try {
            int v1;
            while((v1 = fileInputStream0.read(arr_b)) > 0) {
                function20.invoke(arr_b, v1);
            }
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(fileInputStream0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(fileInputStream0, null);
    }

    public static final void forEachBlock(@NotNull File file0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "action");
        i.forEachBlock(file0, 0x1000, function20);
    }

    public static final void forEachLine(@NotNull File file0, @NotNull Charset charset0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(charset0, "charset");
        Intrinsics.checkNotNullParameter(function10, "action");
        TextStreamsKt.forEachLine(new BufferedReader(new InputStreamReader(new FileInputStream(file0), charset0)), function10);
    }

    public static void forEachLine$default(File file0, Charset charset0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            charset0 = Charsets.UTF_8;
        }
        i.forEachLine(file0, charset0, function10);
    }

    @NotNull
    public static byte[] readBytes(@NotNull File file0) {
        byte[] arr_b;
        Intrinsics.checkNotNullParameter(file0, "<this>");
        FileInputStream fileInputStream0 = new FileInputStream(file0);
        try {
            long v = file0.length();
            if(Long.compare(v, 0x7FFFFFFFL) > 0) {
                throw new OutOfMemoryError("File " + file0 + " is too big (" + v + " bytes) to fit in memory.");
            }
            arr_b = new byte[((int)v)];
            int v1 = (int)v;
            int v2;
            for(v2 = 0; v1 > 0; v2 += v3) {
                int v3 = fileInputStream0.read(arr_b, v2, v1);
                if(v3 < 0) {
                    break;
                }
                v1 -= v3;
            }
            if(v1 > 0) {
                arr_b = Arrays.copyOf(arr_b, v2);
                Intrinsics.checkNotNullExpressionValue(arr_b, "copyOf(...)");
            }
            else {
                int v4 = fileInputStream0.read();
                if(v4 != -1) {
                    a a0 = new a(0x2001);  // 初始化器: Ljava/io/ByteArrayOutputStream;-><init>(I)V
                    a0.write(v4);
                    ByteStreamsKt.copyTo$default(fileInputStream0, a0, 0, 2, null);
                    int v5 = a0.size() + ((int)v);
                    if(v5 < 0) {
                        throw new OutOfMemoryError("File " + file0 + " is too big to fit in memory.");
                    }
                    byte[] arr_b1 = a0.a();
                    byte[] arr_b2 = Arrays.copyOf(arr_b, v5);
                    Intrinsics.checkNotNullExpressionValue(arr_b2, "copyOf(...)");
                    arr_b = ArraysKt___ArraysJvmKt.copyInto(arr_b1, arr_b2, ((int)v), 0, a0.size());
                }
            }
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(fileInputStream0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(fileInputStream0, null);
        return arr_b;
    }

    @NotNull
    public static final List readLines(@NotNull File file0, @NotNull Charset charset0) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(charset0, "charset");
        List list0 = new ArrayList();
        i.forEachLine(file0, charset0, new u1(((ArrayList)list0), 1));
        return list0;
    }

    public static List readLines$default(File file0, Charset charset0, int v, Object object0) {
        if((v & 1) != 0) {
            charset0 = Charsets.UTF_8;
        }
        return i.readLines(file0, charset0);
    }

    @NotNull
    public static final String readText(@NotNull File file0, @NotNull Charset charset0) {
        String s;
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(charset0, "charset");
        InputStreamReader inputStreamReader0 = new InputStreamReader(new FileInputStream(file0), charset0);
        try {
            s = TextStreamsKt.readText(inputStreamReader0);
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(inputStreamReader0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(inputStreamReader0, null);
        return s;
    }

    public static String readText$default(File file0, Charset charset0, int v, Object object0) {
        if((v & 1) != 0) {
            charset0 = Charsets.UTF_8;
        }
        return i.readText(file0, charset0);
    }

    public static final Object useLines(@NotNull File file0, @NotNull Charset charset0, @NotNull Function1 function10) {
        Object object0;
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(charset0, "charset");
        Intrinsics.checkNotNullParameter(function10, "block");
        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(new FileInputStream(file0), charset0), 0x2000);
        try {
            object0 = function10.invoke(TextStreamsKt.lineSequence(bufferedReader0));
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(bufferedReader0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(bufferedReader0, null);
        return object0;
    }

    public static Object useLines$default(File file0, Charset charset0, Function1 function10, int v, Object object0) {
        Object object1;
        if((v & 1) != 0) {
            charset0 = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(charset0, "charset");
        Intrinsics.checkNotNullParameter(function10, "block");
        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(new FileInputStream(file0), charset0), 0x2000);
        try {
            object1 = function10.invoke(TextStreamsKt.lineSequence(bufferedReader0));
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(bufferedReader0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(bufferedReader0, null);
        return object1;
    }

    public static final void writeBytes(@NotNull File file0, @NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(arr_b, "array");
        FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
        try {
            fileOutputStream0.write(arr_b);
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(fileOutputStream0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(fileOutputStream0, null);
    }

    public static final void writeText(@NotNull File file0, @NotNull String s, @NotNull Charset charset0) {
        Intrinsics.checkNotNullParameter(file0, "<this>");
        Intrinsics.checkNotNullParameter(s, "text");
        Intrinsics.checkNotNullParameter(charset0, "charset");
        byte[] arr_b = s.getBytes(charset0);
        Intrinsics.checkNotNullExpressionValue(arr_b, "getBytes(...)");
        i.writeBytes(file0, arr_b);
    }

    public static void writeText$default(File file0, String s, Charset charset0, int v, Object object0) {
        if((v & 2) != 0) {
            charset0 = Charsets.UTF_8;
        }
        i.writeText(file0, s, charset0);
    }
}

