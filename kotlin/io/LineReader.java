package kotlin.io;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import jeb.synthetic.FIN;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\u001F\u0010\u0007\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/io/LineReader;", "", "Ljava/io/InputStream;", "inputStream", "Ljava/nio/charset/Charset;", "charset", "", "readLine", "(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nConsole.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Console.kt\nkotlin/io/LineReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n1#2:300\n*E\n"})
public final class LineReader {
    @NotNull
    public static final LineReader INSTANCE;
    public static CharsetDecoder a;
    public static boolean b;
    public static final byte[] c;
    public static final char[] d;
    public static final ByteBuffer e;
    public static final CharBuffer f;
    public static final StringBuilder g;

    static {
        LineReader.INSTANCE = new LineReader();  // 初始化器: Ljava/lang/Object;-><init>()V
        byte[] arr_b = new byte[0x20];
        LineReader.c = arr_b;
        char[] arr_c = new char[0x20];
        LineReader.d = arr_c;
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
        Intrinsics.checkNotNullExpressionValue(byteBuffer0, "wrap(...)");
        LineReader.e = byteBuffer0;
        CharBuffer charBuffer0 = CharBuffer.wrap(arr_c);
        Intrinsics.checkNotNullExpressionValue(charBuffer0, "wrap(...)");
        LineReader.f = charBuffer0;
        LineReader.g = new StringBuilder();
    }

    public static int a(boolean z) {
        int v;
        while(true) {
            CharsetDecoder charsetDecoder0 = LineReader.a;
            CharsetDecoder charsetDecoder1 = null;
            if(charsetDecoder0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("decoder");
                charsetDecoder0 = null;
            }
            ByteBuffer byteBuffer0 = LineReader.e;
            CharBuffer charBuffer0 = LineReader.f;
            CoderResult coderResult0 = charsetDecoder0.decode(byteBuffer0, charBuffer0, z);
            Intrinsics.checkNotNullExpressionValue(coderResult0, "decode(...)");
            boolean z1 = coderResult0.isError();
            StringBuilder stringBuilder0 = LineReader.g;
            if(z1) {
                CharsetDecoder charsetDecoder2 = LineReader.a;
                if(charsetDecoder2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("decoder");
                }
                else {
                    charsetDecoder1 = charsetDecoder2;
                }
                charsetDecoder1.reset();
                byteBuffer0.position(0);
                stringBuilder0.setLength(0);
                coderResult0.throwException();
            }
            v = charBuffer0.position();
            if(!coderResult0.isOverflow()) {
                break;
            }
            stringBuilder0.append(LineReader.d, 0, v - 1);
            charBuffer0.position(0);
            charBuffer0.limit(0x20);
            charBuffer0.put(LineReader.d[v - 1]);
        }
        return v;
    }

    public static void b(Charset charset0) {
        CharsetDecoder charsetDecoder0 = charset0.newDecoder();
        Intrinsics.checkNotNullExpressionValue(charsetDecoder0, "newDecoder(...)");
        LineReader.a = charsetDecoder0;
        ByteBuffer byteBuffer0 = LineReader.e;
        byteBuffer0.clear();
        CharBuffer charBuffer0 = LineReader.f;
        charBuffer0.clear();
        byteBuffer0.put(10);
        byteBuffer0.flip();
        CharsetDecoder charsetDecoder1 = LineReader.a;
        CharsetDecoder charsetDecoder2 = null;
        if(charsetDecoder1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder1 = null;
        }
        charsetDecoder1.decode(byteBuffer0, charBuffer0, false);
        LineReader.b = charBuffer0.position() == 1 && charBuffer0.get(0) == 10;
        CharsetDecoder charsetDecoder3 = LineReader.a;
        if(charsetDecoder3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
        }
        else {
            charsetDecoder2 = charsetDecoder3;
        }
        charsetDecoder2.reset();
        byteBuffer0.position(0);
        LineReader.g.setLength(0);
    }

    @Nullable
    public final String readLine(@NotNull InputStream inputStream0, @NotNull Charset charset0) {
        ByteBuffer byteBuffer1;
        int v4;
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        Intrinsics.checkNotNullParameter(inputStream0, "inputStream");
        Intrinsics.checkNotNullParameter(charset0, "charset");
        if(LineReader.a == null || !Intrinsics.areEqual(LineReader.a.charset(), charset0)) {
            LineReader.b(charset0);
        }
        int v1 = 0;
        int v2 = 0;
        while(true) {
            CharsetDecoder charsetDecoder0 = null;
            int v3 = inputStream0.read();
            if(v3 == -1) {
                if(LineReader.g.length() == 0 && v1 == 0 && v2 == 0) {
                    FIN.finallyCodeBegin$NT(v);
                    __monitor_exit(this);
                    FIN.finallyCodeEnd$NT(v);
                    return null;
                }
                ByteBuffer byteBuffer0 = LineReader.e;
                byteBuffer0.limit(v1);
                LineReader.f.position(v2);
                v4 = LineReader.a(true);
                CharsetDecoder charsetDecoder1 = LineReader.a;
                if(charsetDecoder1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("decoder");
                }
                else {
                    charsetDecoder0 = charsetDecoder1;
                }
                charsetDecoder0.reset();
                byteBuffer0.position(0);
            }
            else {
                LineReader.c[v1] = (byte)v3;
                if(v3 == 10 || v1 + 1 == 0x20 || !LineReader.b) {
                    byteBuffer1 = LineReader.e;
                    byteBuffer1.limit(v1 + 1);
                    LineReader.f.position(v2);
                    v2 = LineReader.a(false);
                    if(v2 <= 0 || LineReader.d[v2 - 1] != 10) {
                        goto label_63;
                    }
                    else {
                        byteBuffer1.position(0);
                        v4 = v2;
                    }
                }
                else {
                    ++v1;
                    continue;
                }
            }
            if(v4 > 0) {
                char[] arr_c = LineReader.d;
                if(arr_c[v4 - 1] == 10) {
                    int v5 = v4 - 1;
                    if(v5 > 0) {
                        v4 -= 2;
                        if(arr_c[v4] != 13) {
                            v4 = v5;
                        }
                    }
                    else {
                        v4 = v5;
                    }
                }
            }
            StringBuilder stringBuilder0 = LineReader.g;
            if(stringBuilder0.length() == 0) {
                String s = new String(LineReader.d, 0, v4);
                FIN.finallyExec$NT(v);
                return s;
            }
            stringBuilder0.append(LineReader.d, 0, v4);
            String s1 = stringBuilder0.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "toString(...)");
            if(stringBuilder0.length() > 0x20) {
                stringBuilder0.setLength(0x20);
                stringBuilder0.trimToSize();
            }
            stringBuilder0.setLength(0);
            FIN.finallyExec$NT(v);
            return s1;
        label_63:
            byteBuffer1.compact();
            byteBuffer1.position(0);
            v1 = byteBuffer1.position();
        }
    }
}

