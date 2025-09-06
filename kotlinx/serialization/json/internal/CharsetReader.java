package kotlinx.serialization.json.internal;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import jeb.synthetic.FIN;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\n¢\u0006\u0004\b\r\u0010\u000EJ\r\u0010\u0010\u001A\u00020\u000F¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlinx/serialization/json/internal/CharsetReader;", "", "Ljava/io/InputStream;", "inputStream", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V", "", "array", "", "offset", "length", "read", "([CII)I", "", "release", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CharsetReader {
    public final InputStream a;
    public final CharsetDecoder b;
    public final ByteBuffer c;
    public boolean d;
    public char e;

    public CharsetReader(@NotNull InputStream inputStream0, @NotNull Charset charset0) {
        Intrinsics.checkNotNullParameter(inputStream0, "inputStream");
        Intrinsics.checkNotNullParameter(charset0, "charset");
        super();
        this.a = inputStream0;
        CharsetDecoder charsetDecoder0 = charset0.newDecoder();
        CodingErrorAction codingErrorAction0 = CodingErrorAction.REPLACE;
        CharsetDecoder charsetDecoder1 = charsetDecoder0.onMalformedInput(codingErrorAction0).onUnmappableCharacter(codingErrorAction0);
        Intrinsics.checkNotNullExpressionValue(charsetDecoder1, "onUnmappableCharacter(...)");
        this.b = charsetDecoder1;
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(ByteArrayPool8k.INSTANCE.take());
        Intrinsics.checkNotNullExpressionValue(byteBuffer0, "wrap(...)");
        this.c = byteBuffer0;
        byteBuffer0.flip();
    }

    public final int read(@NotNull char[] arr_c, int v, int v1) {
        int v4;
        int v2;
        boolean z = true;
        Intrinsics.checkNotNullParameter(arr_c, "array");
        if(v1 == 0) {
            return 0;
        }
        if(v >= 0 && v < arr_c.length && v1 >= 0 && v + v1 <= arr_c.length) {
            if(this.d) {
                arr_c[v] = this.e;
                ++v;
                --v1;
                this.d = false;
                if(v1 == 0) {
                    return 1;
                }
                v2 = 1;
            }
            else {
                v2 = 0;
            }
            int v3 = -1;
            if(v1 == 1) {
                if(this.d) {
                    this.d = false;
                    v4 = this.e;
                }
                else {
                    char[] arr_c1 = new char[2];
                    int v5 = this.read(arr_c1, 0, 2);
                    switch(v5) {
                        case -1: {
                            v4 = -1;
                            break;
                        }
                        case 1: {
                            v4 = arr_c1[0];
                            break;
                        }
                        case 2: {
                            this.e = arr_c1[1];
                            this.d = true;
                            v4 = arr_c1[0];
                            break;
                        }
                        default: {
                            throw new IllegalStateException(("Unreachable state: " + v5).toString());
                        }
                    }
                }
                if(v4 == -1) {
                    return v2 == 0 ? -1 : v2;
                }
                arr_c[v] = (char)v4;
                return v2 + 1;
            }
            CharBuffer charBuffer0 = CharBuffer.wrap(arr_c, v, v1);
            if(charBuffer0.position() != 0) {
                charBuffer0 = charBuffer0.slice();
            }
            boolean z1 = false;
            while(true) {
                CharsetDecoder charsetDecoder0 = this.b;
                ByteBuffer byteBuffer0 = this.c;
                CoderResult coderResult0 = charsetDecoder0.decode(byteBuffer0, charBuffer0, z1);
                if(!coderResult0.isUnderflow()) {
                    if(coderResult0.isOverflow()) {
                        charBuffer0.position();
                        z = z1;
                    }
                    else {
                        goto label_76;
                    }
                }
                else if(!z1 && charBuffer0.hasRemaining()) {
                    byteBuffer0.compact();
                    int v6 = FIN.finallyOpen$NT();
                    int v7 = byteBuffer0.limit();
                    int v8 = byteBuffer0.position();
                    byte[] arr_b = byteBuffer0.array();
                    int v9 = byteBuffer0.arrayOffset();
                    int v10 = this.a.read(arr_b, v9 + v8, (v8 > v7 ? 0 : v7 - v8));
                    if(v10 < 0) {
                        FIN.finallyCodeBegin$NT(v6);
                        byteBuffer0.flip();
                        FIN.finallyCodeEnd$NT(v6);
                    }
                    else {
                        Intrinsics.checkNotNull(byteBuffer0, "null cannot be cast to non-null type java.nio.Buffer");
                        byteBuffer0.position(v8 + v10);
                        FIN.finallyExec$NT(v6);
                        v10 = byteBuffer0.remaining();
                    }
                    if(v10 >= 0) {
                        continue;
                    }
                    if(charBuffer0.position() != 0 || byteBuffer0.hasRemaining()) {
                        charsetDecoder0.reset();
                        z1 = true;
                        continue;
                    }
                }
                else {
                    z = z1;
                }
                if(z) {
                    charsetDecoder0.reset();
                }
                if(charBuffer0.position() != 0) {
                    v3 = charBuffer0.position();
                }
                return v3 + v2;
            label_76:
                coderResult0.throwException();
            }
        }
        StringBuilder stringBuilder0 = q.u("Unexpected arguments: ", v, ", ", v1, ", ");
        stringBuilder0.append(arr_c.length);
        throw new IllegalArgumentException(stringBuilder0.toString().toString());
    }

    public final void release() {
        byte[] arr_b = this.c.array();
        Intrinsics.checkNotNullExpressionValue(arr_b, "array(...)");
        ByteArrayPool8k.INSTANCE.release(arr_b);
    }
}

