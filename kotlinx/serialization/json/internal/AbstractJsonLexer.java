package kotlinx.serialization.json.internal;

import a5.b;
import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.o;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\n\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u00002\u00020\u0001B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J\u000F\u0010\u0005\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\tH&\u00A2\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0006H&\u00A2\u0006\u0004\b\r\u0010\bJ\u000F\u0010\u000E\u001A\u00020\u0006H&\u00A2\u0006\u0004\b\u000E\u0010\bJ\u000F\u0010\u0010\u001A\u00020\u000FH&\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00020\u0012H\u0004\u00A2\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0016\u0010\u0003J\u0015\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0017\u001A\u00020\u000F\u00A2\u0006\u0004\b\u0010\u0010\u0018J\u0017\u0010\u0010\u001A\u00020\u00042\u0006\u0010\u0017\u001A\u00020\u0012H\u0016\u00A2\u0006\u0004\b\u0010\u0010\u0019J\u0017\u0010\u001A\u001A\u00020\u00042\u0006\u0010\u0017\u001A\u00020\u0012H\u0004\u00A2\u0006\u0004\b\u001A\u0010\u0019J!\u0010 \u001A\u00020\u001D2\u0006\u0010\u001B\u001A\u00020\u000F2\b\b\u0002\u0010\u001C\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\r\u0010!\u001A\u00020\u000F\u00A2\u0006\u0004\b!\u0010\u0011J\u0017\u0010#\u001A\u00020\u00062\b\b\u0002\u0010\"\u001A\u00020\u0006\u00A2\u0006\u0004\b#\u0010$J\u000F\u0010%\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b%\u0010&J!\u0010*\u001A\u0004\u0018\u00010\'2\u0006\u0010(\u001A\u00020\'2\u0006\u0010)\u001A\u00020\u0006H&\u00A2\u0006\u0004\b*\u0010+J\u0017\u0010,\u001A\u0004\u0018\u00010\'2\u0006\u0010)\u001A\u00020\u0006\u00A2\u0006\u0004\b,\u0010-J\r\u0010.\u001A\u00020\u0004\u00A2\u0006\u0004\b.\u0010\u0003J\u001F\u00101\u001A\u00020\t2\u0006\u0010/\u001A\u00020\u00122\u0006\u00100\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b1\u00102J\u001F\u00104\u001A\u00020\'2\u0006\u00100\u001A\u00020\t2\u0006\u00103\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b4\u00105J\u000F\u00106\u001A\u00020\'H&\u00A2\u0006\u0004\b6\u00107J:\u0010=\u001A\u00020\u00042\u0006\u0010)\u001A\u00020\u00062!\u0010<\u001A\u001D\u0012\u0013\u0012\u00110\'\u00A2\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\u0004\u0012\u00020\u000408H\u0016\u00A2\u0006\u0004\b=\u0010>J\r\u0010?\u001A\u00020\'\u00A2\u0006\u0004\b?\u00107J\'\u0010?\u001A\u00020\'2\u0006\u0010A\u001A\u00020@2\u0006\u0010B\u001A\u00020\t2\u0006\u0010C\u001A\u00020\tH\u0005\u00A2\u0006\u0004\b?\u0010DJ\r\u0010E\u001A\u00020\'\u00A2\u0006\u0004\bE\u00107J\r\u0010F\u001A\u00020\'\u00A2\u0006\u0004\bF\u00107J\u001F\u0010I\u001A\u00020\u00042\u0006\u0010G\u001A\u00020\t2\u0006\u0010H\u001A\u00020\tH\u0014\u00A2\u0006\u0004\bI\u0010JJ3\u0010P\u001A\u00020\u00042\u0006\u0010K\u001A\u00020\u00062\b\b\u0002\u0010\n\u001A\u00020\t2\f\u0010M\u001A\b\u0012\u0004\u0012\u00020\'0LH\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\bN\u0010OJ\u0015\u0010R\u001A\u00020\u00042\u0006\u0010Q\u001A\u00020\u0006\u00A2\u0006\u0004\bR\u0010SJ\u000F\u0010T\u001A\u00020\'H\u0016\u00A2\u0006\u0004\bT\u00107J\u0015\u0010V\u001A\u00020\u00042\u0006\u0010U\u001A\u00020\'\u00A2\u0006\u0004\bV\u0010WJ)\u0010 \u001A\u00020\u001D2\u0006\u0010M\u001A\u00020\'2\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010X\u001A\u00020\'\u00A2\u0006\u0004\b \u0010YJ\r\u0010[\u001A\u00020Z\u00A2\u0006\u0004\b[\u0010\\J\r\u0010]\u001A\u00020\u0006\u00A2\u0006\u0004\b]\u0010\bJ\r\u0010^\u001A\u00020\u0006\u00A2\u0006\u0004\b^\u0010\bR\u0016\u0010_\u001A\u00020\t8\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010b\u001A\u00020a8\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\bb\u0010cR&\u0010l\u001A\u00060dj\u0002`e8\u0004@\u0004X\u0084\u000E\u00A2\u0006\u0012\n\u0004\bf\u0010g\u001A\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0014\u0010A\u001A\u00020@8$X\u00A4\u0004\u00A2\u0006\u0006\u001A\u0004\bm\u0010n\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006o"}, d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "", "<init>", "()V", "", "ensureHaveChars", "", "isNotEof", "()Z", "", "position", "prefetchOrEof", "(I)I", "tryConsumeComma", "canConsumeValue", "", "consumeNextToken", "()B", "", "c", "isValidValueStart", "(C)Z", "expectEof", "expected", "(B)B", "(C)V", "unexpectedToken", "expectedToken", "wasConsumed", "", "fail$kotlinx_serialization_json", "(BZ)Ljava/lang/Void;", "fail", "peekNextToken", "doConsume", "tryConsumeNull", "(Z)Z", "skipWhitespaces", "()I", "", "keyToMatch", "isLenient", "peekLeadingMatchingValue", "(Ljava/lang/String;Z)Ljava/lang/String;", "peekString", "(Z)Ljava/lang/String;", "discardPeeked", "char", "startPos", "indexOf", "(CI)I", "endPos", "substring", "(II)Ljava/lang/String;", "consumeKeyString", "()Ljava/lang/String;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "stringChunk", "consumeChunk", "consumeStringChunked", "(ZLkotlin/jvm/functions/Function1;)V", "consumeString", "", "source", "startPosition", "current", "(Ljava/lang/CharSequence;II)Ljava/lang/String;", "consumeStringLenientNotNull", "consumeStringLenient", "fromIndex", "toIndex", "appendRange", "(II)V", "condition", "Lkotlin/Function0;", "message", "require$kotlinx_serialization_json", "(ZILkotlin/jvm/functions/Function0;)V", "require", "allowLenientStrings", "skipElement", "(Z)V", "toString", "key", "failOnUnknownKey", "(Ljava/lang/String;)V", "hint", "(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/Void;", "", "consumeNumericLiteral", "()J", "consumeBoolean", "consumeBooleanLenient", "currentPosition", "I", "Lkotlinx/serialization/json/internal/JsonPath;", "path", "Lkotlinx/serialization/json/internal/JsonPath;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "b", "Ljava/lang/StringBuilder;", "getEscapedString", "()Ljava/lang/StringBuilder;", "setEscapedString", "(Ljava/lang/StringBuilder;)V", "escapedString", "getSource", "()Ljava/lang/CharSequence;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAbstractJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,765:1\n757#1,5:766\n1#2:771\n*S KotlinDebug\n*F\n+ 1 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n218#1:766,5\n*E\n"})
public abstract class AbstractJsonLexer {
    public String a;
    public StringBuilder b;
    @JvmField
    public int currentPosition;
    @JvmField
    @NotNull
    public final JsonPath path;

    public AbstractJsonLexer() {
        this.path = new JsonPath();
        this.b = new StringBuilder();
    }

    public final int a(int v, int v1) {
        this.appendRange(v, v1);
        int v2 = this.prefetchOrEof(v1 + 1);
        if(v2 != -1) {
            int v3 = this.getSource().charAt(v2);
            if(v3 == 0x75) {
                return this.b(this.getSource(), v2 + 1);
            }
            int v4 = AbstractJsonLexerKt.escapeToChar(v3);
            if(v4 != 0) {
                this.b.append(((char)v4));
                return v2 + 1;
            }
            AbstractJsonLexer.fail$default(this, "Invalid escaped char \'" + ((char)v3) + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        AbstractJsonLexer.fail$default(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public void appendRange(int v, int v1) {
        this.b.append(this.getSource(), v, v1);
    }

    public final int b(CharSequence charSequence0, int v) {
        if(v + 4 >= charSequence0.length()) {
            this.currentPosition = v;
            this.ensureHaveChars();
            if(this.currentPosition + 4 < charSequence0.length()) {
                return this.b(charSequence0, this.currentPosition);
            }
            AbstractJsonLexer.fail$default(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        StringBuilder stringBuilder0 = this.b;
        int v1 = this.f(charSequence0, v);
        int v2 = this.f(charSequence0, v + 1);
        int v3 = this.f(charSequence0, v + 2);
        stringBuilder0.append(((char)(this.f(charSequence0, v + 3) + ((v1 << 12) + (v2 << 8) + (v3 << 4)))));
        return v + 4;
    }

    public final boolean c(int v) {
        int v1 = this.prefetchOrEof(v);
        if(v1 < this.getSource().length() && v1 != -1) {
            switch(this.getSource().charAt(v1) | 0x20) {
                case 102: {
                    this.d(v1 + 1, "alse");
                    return false;
                }
                case 0x74: {
                    this.d(v1 + 1, "rue");
                    return true;
                }
                default: {
                    AbstractJsonLexer.fail$default(this, "Expected valid boolean literal prefix, but had \'" + this.consumeStringLenient() + '\'', 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        AbstractJsonLexer.fail$default(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public abstract boolean canConsumeValue();

    public final boolean consumeBoolean() {
        return this.c(this.skipWhitespaces());
    }

    public final boolean consumeBooleanLenient() {
        boolean z;
        int v = this.skipWhitespaces();
        if(v != this.getSource().length()) {
            if(this.getSource().charAt(v) == 34) {
                ++v;
                z = true;
            }
            else {
                z = false;
            }
            boolean z1 = this.c(v);
            if(z) {
                if(this.currentPosition != this.getSource().length()) {
                    if(this.getSource().charAt(this.currentPosition) == 34) {
                        ++this.currentPosition;
                        return z1;
                    }
                    AbstractJsonLexer.fail$default(this, "Expected closing quotation mark", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                AbstractJsonLexer.fail$default(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            return z1;
        }
        AbstractJsonLexer.fail$default(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public abstract String consumeKeyString();

    public abstract byte consumeNextToken();

    public final byte consumeNextToken(byte b) {
        byte b1 = this.consumeNextToken();
        if(b1 == b) {
            return b1;
        }
        AbstractJsonLexer.fail$kotlinx_serialization_json$default(this, b, false, 2, null);
        throw new KotlinNothingValueException();
    }

    public void consumeNextToken(char c) {
        this.ensureHaveChars();
        CharSequence charSequence0 = this.getSource();
        int v = this.currentPosition;
        int v1;
        while((v1 = this.prefetchOrEof(v)) != -1) {
            int v2 = charSequence0.charAt(v1);
            if(v2 != 9 && v2 != 10 && v2 != 13 && v2 != 0x20) {
                this.currentPosition = v1 + 1;
                if(v2 == c) {
                    return;
                }
                this.unexpectedToken(c);
            }
            v = v1 + 1;
        }
        this.currentPosition = -1;
        this.unexpectedToken(c);
    }

    public final long consumeNumericLiteral() {
        double f;
        int v5;
        int v4;
        boolean z;
        int v = this.prefetchOrEof(this.skipWhitespaces());
        if(v < this.getSource().length() && v != -1) {
            if(this.getSource().charAt(v) == 34) {
                ++v;
                if(v != this.getSource().length()) {
                    z = true;
                    goto label_10;
                }
                AbstractJsonLexer.fail$default(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            else {
                z = false;
            }
        label_10:
            int v1 = v;
            long v2 = 0L;
            long v3 = 0L;
            boolean z1 = false;
            boolean z2 = false;
            while(true) {
                v4 = 0;
            label_16:
                if(v1 == this.getSource().length()) {
                    goto label_58;
                }
                v5 = this.getSource().charAt(v1);
                if((v5 == 69 || v5 == 101) && !z1) {
                    if(v1 != v) {
                        ++v1;
                        z1 = true;
                        v4 = 1;
                        goto label_16;
                    }
                    AbstractJsonLexer.fail$default(this, "Unexpected symbol " + ((char)v5) + " in numeric literal", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                if(v5 != 45 || !z1) {
                    goto label_32;
                }
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
            AbstractJsonLexer.fail$default(this, "Unexpected symbol \'-\' in numeric literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        label_32:
            if(v5 == 43 && z1) {
                if(v1 != v) {
                    ++v1;
                    v4 = 1;
                    goto label_16;
                }
                AbstractJsonLexer.fail$default(this, "Unexpected symbol \'+\' in numeric literal", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            else if(v5 == 45) {
                if(v1 == v) {
                    ++v1;
                    z2 = true;
                    goto label_16;
                }
                AbstractJsonLexer.fail$default(this, "Unexpected symbol \'-\' in numeric literal", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            else if(AbstractJsonLexerKt.charToTokenClass(((char)v5)) == 0) {
                ++v1;
                if(v5 - 0x30 >= 0 && v5 - 0x30 < 10) {
                    if(z1) {
                        v3 = v3 * 10L + ((long)(v5 - 0x30));
                        goto label_16;
                    }
                    else {
                        v2 = v2 * 10L - ((long)(v5 - 0x30));
                        if(v2 <= 0L) {
                            goto label_16;
                        }
                        AbstractJsonLexer.fail$default(this, "Numeric value overflow", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                }
                AbstractJsonLexer.fail$default(this, "Unexpected symbol \'" + ((char)v5) + "\' in numeric literal", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        label_58:
            if(v != v1 && (!z2 || v != v1 - 1)) {
                if(z) {
                    if(v1 != v) {
                        if(this.getSource().charAt(v1) == 34) {
                            ++v1;
                            goto label_68;
                        }
                        AbstractJsonLexer.fail$default(this, "Expected closing quotation mark", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    AbstractJsonLexer.fail$default(this, "EOF", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            label_68:
                this.currentPosition = v1;
                if(z1) {
                    switch(v4) {
                        case 0: {
                            f = Math.pow(10.0, -((double)v3));
                            break;
                        }
                        case 1: {
                            f = Math.pow(10.0, v3);
                            break;
                        }
                        default: {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    double f1 = ((double)v2) * f;
                    if(f1 <= 9223372036854776000.0 && f1 >= -9223372036854776000.0) {
                        if(Math.floor(f1) == f1) {
                            v2 = (long)f1;
                            goto label_84;
                        }
                        AbstractJsonLexer.fail$default(this, "Can\'t convert " + f1 + " to Long", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    AbstractJsonLexer.fail$default(this, "Numeric value overflow", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            label_84:
                if(!z2) {
                    if(v2 != 0x8000000000000000L) {
                        return -v2;
                    }
                    AbstractJsonLexer.fail$default(this, "Numeric value overflow", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                return v2;
            }
            AbstractJsonLexer.fail$default(this, "Expected numeric literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        AbstractJsonLexer.fail$default(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public final String consumeString() {
        String s = this.a;
        if(s != null) {
            Intrinsics.checkNotNull(s);
            this.a = null;
            return s;
        }
        return this.consumeKeyString();
    }

    @NotNull
    public final String consumeString(@NotNull CharSequence charSequence0, int v, int v1) {
        int v3;
        Intrinsics.checkNotNullParameter(charSequence0, "source");
        int v2 = charSequence0.charAt(v1);
        boolean z = false;
    alab1:
        while(true) {
            switch(v2) {
                case 34: {
                    String s = z ? this.e(v, v1) : this.substring(v, v1);
                    this.currentPosition = v1 + 1;
                    return s;
                label_8:
                    ++v1;
                    if(v1 >= charSequence0.length()) {
                        this.appendRange(v, v1);
                        v3 = this.prefetchOrEof(v1);
                        if(v3 == -1) {
                            AbstractJsonLexer.fail$default(this, "Unexpected EOF", -1, null, 4, null);
                            throw new KotlinNothingValueException();
                        }
                        z = true;
                        v = v3;
                        v1 = v;
                        break;
                    }
                    break;
                }
                case 92: {
                    v3 = this.prefetchOrEof(this.a(v, v1));
                    if(v3 == -1) {
                        break alab1;
                    }
                    z = true;
                    v = v3;
                    v1 = v;
                    break;
                }
                default: {
                    goto label_8;
                }
            }
            v2 = charSequence0.charAt(v1);
        }
        AbstractJsonLexer.fail$default(this, "Unexpected EOF", -1, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public void consumeStringChunked(boolean z, @NotNull Function1 function10) {
        int v4;
        int v3;
        Intrinsics.checkNotNullParameter(function10, "consumeChunk");
        if(z && this.peekNextToken() != 0) {
            return;
        }
        if(!z) {
            this.consumeNextToken('\"');
        }
        int v = this.currentPosition;
        int v1 = this.getSource().charAt(v);
        boolean z1 = false;
        int v2 = v;
        while(true) {
            if(!z) {
                if(v1 != 34) {
                    goto label_13;
                }
                break;
            }
            else if(AbstractJsonLexerKt.charToTokenClass(((char)v1)) != 0) {
                break;
            }
        label_13:
            if(z || v1 != 92) {
                v4 = v;
                v3 = v2 + 1;
            }
            else {
                v3 = this.prefetchOrEof(this.a(v, v2));
                z1 = true;
                v4 = v3;
            }
            if(v3 >= this.getSource().length()) {
                if(z1) {
                    function10.invoke(this.e(v4, v3));
                }
                else {
                    function10.invoke(this.substring(v4, v3));
                }
                int v5 = this.prefetchOrEof(v3);
                if(v5 != -1) {
                    z1 = false;
                    v = v5;
                    v2 = v;
                    goto label_35;
                }
                AbstractJsonLexer.fail$default(this, "EOF", -1, null, 4, null);
                throw new KotlinNothingValueException();
            }
            else {
                v2 = v3;
                v = v4;
            }
        label_35:
            v1 = this.getSource().charAt(v2);
        }
        if(z1) {
            function10.invoke(this.e(v, v2));
        }
        else {
            function10.invoke(this.substring(v, v2));
        }
        this.currentPosition = v2;
        if(!z) {
            this.consumeNextToken('\"');
        }
    }

    @NotNull
    public final String consumeStringLenient() {
        String s = this.a;
        if(s != null) {
            Intrinsics.checkNotNull(s);
            this.a = null;
            return s;
        }
        int v = this.skipWhitespaces();
        if(v < this.getSource().length() && v != -1) {
            int v1 = AbstractJsonLexerKt.charToTokenClass(this.getSource().charAt(v));
            if(v1 == 1) {
                return this.consumeString();
            }
            if(v1 == 0) {
                boolean z = false;
                while(AbstractJsonLexerKt.charToTokenClass(this.getSource().charAt(v)) == 0) {
                    ++v;
                    if(v >= this.getSource().length()) {
                        this.appendRange(this.currentPosition, v);
                        int v2 = this.prefetchOrEof(v);
                        if(v2 == -1) {
                            this.currentPosition = v;
                            return this.e(0, 0);
                        }
                        v = v2;
                        z = true;
                    }
                }
                String s1 = z ? this.e(this.currentPosition, v) : this.substring(this.currentPosition, v);
                this.currentPosition = v;
                return s1;
            }
            AbstractJsonLexer.fail$default(this, "Expected beginning of the string, but got " + this.getSource().charAt(v), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        AbstractJsonLexer.fail$default(this, "EOF", v, null, 4, null);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public final String consumeStringLenientNotNull() {
        String s = this.consumeStringLenient();
        if(Intrinsics.areEqual(s, "null") && this.getSource().charAt(this.currentPosition - 1) != 34) {
            AbstractJsonLexer.fail$default(this, "Unexpected \'null\' value instead of string literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return s;
    }

    public final void d(int v, String s) {
        if(this.getSource().length() - v >= s.length()) {
            int v1 = s.length();
            int v2 = 0;
            while(v2 < v1) {
                if(s.charAt(v2) == (this.getSource().charAt(v + v2) | 0x20)) {
                    ++v2;
                    continue;
                }
                AbstractJsonLexer.fail$default(this, "Expected valid boolean literal prefix, but had \'" + this.consumeStringLenient() + '\'', 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            this.currentPosition = s.length() + v;
            return;
        }
        AbstractJsonLexer.fail$default(this, "Unexpected end of boolean literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final void discardPeeked() {
        this.a = null;
    }

    public final String e(int v, int v1) {
        this.appendRange(v, v1);
        String s = this.b.toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        this.b.setLength(0);
        return s;
    }

    public void ensureHaveChars() {
    }

    public final void expectEof() {
        if(this.consumeNextToken() == 10) {
            return;
        }
        AbstractJsonLexer.fail$default(this, "Expected EOF after parsing, but had " + this.getSource().charAt(this.currentPosition - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final int f(CharSequence charSequence0, int v) {
        int v1 = charSequence0.charAt(v);
        if(0x30 <= v1 && v1 < 58) {
            return v1 - 0x30;
        }
        if(97 <= v1 && v1 < 103) {
            return v1 - 87;
        }
        if(65 <= v1 && v1 < 71) {
            return v1 - 55;
        }
        AbstractJsonLexer.fail$default(this, "Invalid toHexChar char \'" + ((char)v1) + "\' in unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public final Void fail(@NotNull String s, int v, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "message");
        Intrinsics.checkNotNullParameter(s1, "hint");
        String s2 = s1.length() == 0 ? "" : "\n" + s1;
        StringBuilder stringBuilder0 = b.u(s, " at path: ");
        stringBuilder0.append("$");
        stringBuilder0.append(s2);
        throw JsonExceptionsKt.JsonDecodingException(v, stringBuilder0.toString(), this.getSource());
    }

    public static Void fail$default(AbstractJsonLexer abstractJsonLexer0, String s, int v, String s1, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if((v1 & 2) != 0) {
            v = abstractJsonLexer0.currentPosition;
        }
        if((v1 & 4) != 0) {
            s1 = "";
        }
        return abstractJsonLexer0.fail(s, v, s1);
    }

    @NotNull
    public final Void fail$kotlinx_serialization_json(byte b, boolean z) {
        int v = z ? this.currentPosition - 1 : this.currentPosition;
        AbstractJsonLexer.fail$default(this, "Expected " + AbstractJsonLexerKt.tokenDescription(b) + ", but had \'" + (this.currentPosition == this.getSource().length() || v < 0 ? "EOF" : String.valueOf(this.getSource().charAt(v))) + "\' instead", v, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public static Void fail$kotlinx_serialization_json$default(AbstractJsonLexer abstractJsonLexer0, byte b, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if((v & 2) != 0) {
            z = true;
        }
        return abstractJsonLexer0.fail$kotlinx_serialization_json(b, z);
    }

    public final void failOnUnknownKey(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        this.fail("Encountered an unknown key \'" + s + '\'', StringsKt__StringsKt.lastIndexOf$default(this.substring(0, this.currentPosition), s, 0, false, 6, null), "Use \'ignoreUnknownKeys = true\' in \'Json {}\' builder to ignore unknown keys.");
        throw new KotlinNothingValueException();
    }

    @NotNull
    public final StringBuilder getEscapedString() {
        return this.b;
    }

    @NotNull
    public abstract CharSequence getSource();

    public int indexOf(char c, int v) {
        return StringsKt__StringsKt.indexOf$default(this.getSource(), c, v, false, 4, null);
    }

    public final boolean isNotEof() {
        return this.peekNextToken() != 10;
    }

    public final boolean isValidValueStart(char c) {
        return c != 44 && c != 58 && c != 93 && c != 0x7D ? 1 : 0;
    }

    @Nullable
    public abstract String peekLeadingMatchingValue(@NotNull String arg1, boolean arg2);

    public final byte peekNextToken() {
        CharSequence charSequence0 = this.getSource();
        int v = this.currentPosition;
        int v1;
        while((v1 = this.prefetchOrEof(v)) != -1) {
            int v2 = charSequence0.charAt(v1);
            if(v2 != 10 && v2 != 0x20 && v2 != 13 && v2 != 9) {
                this.currentPosition = v1;
                return AbstractJsonLexerKt.charToTokenClass(((char)v2));
            }
            v = v1 + 1;
        }
        this.currentPosition = -1;
        return 10;
    }

    @Nullable
    public final String peekString(boolean z) {
        String s;
        int v = this.peekNextToken();
        if(z) {
            if(v != 0 && v != 1) {
                return null;
            }
            s = this.consumeStringLenient();
        }
        else {
            if(v != 1) {
                return null;
            }
            s = this.consumeString();
        }
        this.a = s;
        return s;
    }

    public abstract int prefetchOrEof(int arg1);

    public final void require$kotlinx_serialization_json(boolean z, int v, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "message");
        if(z) {
            return;
        }
        AbstractJsonLexer.fail$default(this, ((String)function00.invoke()), v, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public static void require$kotlinx_serialization_json$default(AbstractJsonLexer abstractJsonLexer0, boolean z, int v, Function0 function00, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: require");
        }
        if((v1 & 2) != 0) {
            v = abstractJsonLexer0.currentPosition;
        }
        Intrinsics.checkNotNullParameter(function00, "message");
        if(z) {
            return;
        }
        AbstractJsonLexer.fail$default(abstractJsonLexer0, ((String)function00.invoke()), v, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final void setEscapedString(@NotNull StringBuilder stringBuilder0) {
        Intrinsics.checkNotNullParameter(stringBuilder0, "<set-?>");
        this.b = stringBuilder0;
    }

    public final void skipElement(boolean z) {
        ArrayList arrayList0 = new ArrayList();
        int v = this.peekNextToken();
        if(v != 8 && v != 6) {
            this.consumeStringLenient();
            return;
        }
    alab1:
        while(true) {
            int v1 = this.peekNextToken();
            switch(v1) {
                case 7: {
                    if(((Number)CollectionsKt___CollectionsKt.last(arrayList0)).byteValue() != 6) {
                        throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found } instead of ] at path: " + this.path, this.getSource());
                    }
                    o.removeLast(arrayList0);
                    break;
                }
                case 6: 
                case 8: {
                    arrayList0.add(((byte)v1));
                    break;
                }
                case 9: {
                    if(((Number)CollectionsKt___CollectionsKt.last(arrayList0)).byteValue() != 8) {
                        break alab1;
                    }
                    o.removeLast(arrayList0);
                    break;
                }
                case 10: {
                    AbstractJsonLexer.fail$default(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
            this.consumeNextToken();
            if(arrayList0.size() == 0) {
                return;
            }
        }
        throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found ] instead of } at path: " + this.path, this.getSource());
    }

    public int skipWhitespaces() {
        int v = this.currentPosition;
    alab1:
        int v1;
        while((v1 = this.prefetchOrEof(v)) != -1) {
            switch(this.getSource().charAt(v1)) {
                case 9: 
                case 10: 
                case 13: 
                case 0x20: {
                    v = v1 + 1;
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        this.currentPosition = v1;
        return v1;
    }

    @NotNull
    public String substring(int v, int v1) {
        return this.getSource().subSequence(v, v1).toString();
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("JsonReader(source=\'");
        stringBuilder0.append(this.getSource());
        stringBuilder0.append("\', currentPosition=");
        return b.p(stringBuilder0, this.currentPosition, ')');
    }

    public abstract boolean tryConsumeComma();

    public final boolean tryConsumeNull(boolean z) {
        int v = this.prefetchOrEof(this.skipWhitespaces());
        int v1 = this.getSource().length() - v;
        if(v1 >= 4 && v != -1) {
            for(int v2 = 0; v2 < 4; ++v2) {
                if("null".charAt(v2) != this.getSource().charAt(v + v2)) {
                    return false;
                }
            }
            if(v1 > 4 && AbstractJsonLexerKt.charToTokenClass(this.getSource().charAt(v + 4)) == 0) {
                return false;
            }
            if(z) {
                this.currentPosition = v + 4;
            }
            return true;
        }
        return false;
    }

    public static boolean tryConsumeNull$default(AbstractJsonLexer abstractJsonLexer0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if((v & 1) != 0) {
            z = true;
        }
        return abstractJsonLexer0.tryConsumeNull(z);
    }

    public final void unexpectedToken(char c) {
        int v = this.currentPosition;
        if(v > 0 && c == 34) {
            try {
                this.currentPosition = v - 1;
                String s = this.consumeStringLenient();
            }
            finally {
                this.currentPosition = v;
            }
            if(Intrinsics.areEqual(s, "null")) {
                this.fail("Expected string literal but \'null\' literal was found", this.currentPosition - 1, "Use \'coerceInputValues = true\' in \'Json {}\' builder to coerce nulls if property has a default value.");
                throw new KotlinNothingValueException();
            }
        }
        AbstractJsonLexer.fail$kotlinx_serialization_json$default(this, AbstractJsonLexerKt.charToTokenClass(c), false, 2, null);
        throw new KotlinNothingValueException();
    }
}

