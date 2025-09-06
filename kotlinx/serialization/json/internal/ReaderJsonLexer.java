package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\nJ\u0017\u0010\u000E\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001F\u0010\u001C\u001A\u00020\f2\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u001B\u001A\u00020\fH\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ\u001F\u0010\u001F\u001A\u00020\u00162\u0006\u0010\u001B\u001A\u00020\f2\u0006\u0010\u001E\u001A\u00020\fH\u0016¢\u0006\u0004\b\u001F\u0010 J\u001F\u0010#\u001A\u00020\u00132\u0006\u0010!\u001A\u00020\f2\u0006\u0010\"\u001A\u00020\fH\u0014¢\u0006\u0004\b#\u0010$J!\u0010\'\u001A\u0004\u0018\u00010\u00162\u0006\u0010%\u001A\u00020\u00162\u0006\u0010&\u001A\u00020\bH\u0016¢\u0006\u0004\b\'\u0010(J\r\u0010)\u001A\u00020\u0013¢\u0006\u0004\b)\u0010\u0015R\u001A\u0010/\u001A\u00020*8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.¨\u00060"}, d2 = {"Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "Lkotlinx/serialization/json/internal/InternalJsonReader;", "reader", "", "buffer", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonReader;[C)V", "", "tryConsumeComma", "()Z", "canConsumeValue", "", "position", "prefetchOrEof", "(I)I", "", "consumeNextToken", "()B", "", "ensureHaveChars", "()V", "", "consumeKeyString", "()Ljava/lang/String;", "", "char", "startPos", "indexOf", "(CI)I", "endPos", "substring", "(II)Ljava/lang/String;", "fromIndex", "toIndex", "appendRange", "(II)V", "keyToMatch", "isLenient", "peekLeadingMatchingValue", "(Ljava/lang/String;Z)Ljava/lang/String;", "release", "Lkotlinx/serialization/json/internal/ArrayAsSequence;", "f", "Lkotlinx/serialization/json/internal/ArrayAsSequence;", "getSource", "()Lkotlinx/serialization/json/internal/ArrayAsSequence;", "source", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ReaderJsonLexer extends AbstractJsonLexer {
    public final InternalJsonReader c;
    public final char[] d;
    public int e;
    public final ArrayAsSequence f;

    public ReaderJsonLexer(@NotNull InternalJsonReader internalJsonReader0, @NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(internalJsonReader0, "reader");
        Intrinsics.checkNotNullParameter(arr_c, "buffer");
        super();
        this.c = internalJsonReader0;
        this.d = arr_c;
        this.e = 0x80;
        this.f = new ArrayAsSequence(arr_c);
        this.g(0);
    }

    public ReaderJsonLexer(InternalJsonReader internalJsonReader0, char[] arr_c, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            arr_c = CharArrayPoolBatchSize.INSTANCE.take();
        }
        this(internalJsonReader0, arr_c);
    }

    @Override  // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void appendRange(int v, int v1) {
        StringBuilder stringBuilder0 = this.getEscapedString();
        stringBuilder0.append(this.getSource().getBuffer$kotlinx_serialization_json(), v, v1 - v);
        Intrinsics.checkNotNullExpressionValue(stringBuilder0, "append(...)");
    }

    @Override  // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean canConsumeValue() {
        this.ensureHaveChars();
        int v = this.currentPosition;
        int v1;
        while((v1 = this.prefetchOrEof(v)) != -1) {
            int v2 = this.getSource().charAt(v1);
            if(v2 != 9 && v2 != 10 && v2 != 13 && v2 != 0x20) {
                this.currentPosition = v1;
                return this.isValidValueStart(((char)v2));
            }
            v = v1 + 1;
        }
        this.currentPosition = -1;
        return false;
    }

    @Override  // kotlinx.serialization.json.internal.AbstractJsonLexer
    @NotNull
    public String consumeKeyString() {
        this.consumeNextToken('\"');
        int v = this.currentPosition;
        int v1 = this.indexOf('\"', v);
        if(v1 == -1) {
            int v2 = this.prefetchOrEof(v);
            if(v2 != -1) {
                return this.consumeString(this.getSource(), this.currentPosition, v2);
            }
            AbstractJsonLexer.fail$kotlinx_serialization_json$default(this, 1, false, 2, null);
            throw new KotlinNothingValueException();
        }
        for(int v3 = v; v3 < v1; ++v3) {
            if(this.getSource().charAt(v3) == 92) {
                return this.consumeString(this.getSource(), this.currentPosition, v3);
            }
        }
        this.currentPosition = v1 + 1;
        return this.substring(v, v1);
    }

    @Override  // kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte consumeNextToken() {
        this.ensureHaveChars();
        ArrayAsSequence arrayAsSequence0 = this.getSource();
        int v = this.currentPosition;
        int v1;
        while((v1 = this.prefetchOrEof(v)) != -1) {
            byte b = AbstractJsonLexerKt.charToTokenClass(arrayAsSequence0.charAt(v1));
            if(b != 3) {
                this.currentPosition = v1 + 1;
                return b;
            }
            v = v1 + 1;
        }
        this.currentPosition = -1;
        return 10;
    }

    @Override  // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void ensureHaveChars() {
        int v = this.getSource().length() - this.currentPosition;
        if(v > this.e) {
            return;
        }
        this.g(v);
    }

    public final void g(int v) {
        char[] arr_c = this.getSource().getBuffer$kotlinx_serialization_json();
        if(v != 0) {
            ArraysKt___ArraysJvmKt.copyInto(arr_c, arr_c, 0, this.currentPosition, this.currentPosition + v);
        }
        int v1 = this.getSource().length();
        while(v != v1) {
            int v2 = this.c.read(arr_c, v, v1 - v);
            if(v2 == -1) {
                this.getSource().trim(v);
                this.e = -1;
                break;
            }
            v += v2;
        }
        this.currentPosition = 0;
    }

    @Override  // kotlinx.serialization.json.internal.AbstractJsonLexer
    public CharSequence getSource() {
        return this.getSource();
    }

    @NotNull
    public ArrayAsSequence getSource() {
        return this.f;
    }

    @Override  // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int indexOf(char c, int v) {
        ArrayAsSequence arrayAsSequence0 = this.getSource();
        int v1 = arrayAsSequence0.length();
        while(v < v1) {
            if(arrayAsSequence0.charAt(v) == c) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    @Override  // kotlinx.serialization.json.internal.AbstractJsonLexer
    @Nullable
    public String peekLeadingMatchingValue(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "keyToMatch");
        return null;
    }

    @Override  // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int prefetchOrEof(int v) {
        if(v < this.getSource().length()) {
            return v;
        }
        this.currentPosition = v;
        this.ensureHaveChars();
        return this.currentPosition != 0 || this.getSource().length() == 0 ? -1 : 0;
    }

    public final void release() {
        CharArrayPoolBatchSize.INSTANCE.release(this.d);
    }

    @Override  // kotlinx.serialization.json.internal.AbstractJsonLexer
    @NotNull
    public String substring(int v, int v1) {
        return this.getSource().substring(v, v1);
    }

    @Override  // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean tryConsumeComma() {
        int v = this.skipWhitespaces();
        if(v < this.getSource().length() && v != -1 && this.getSource().charAt(v) == 44) {
            ++this.currentPosition;
            return true;
        }
        return false;
    }
}

