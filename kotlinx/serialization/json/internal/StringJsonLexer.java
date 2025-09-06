package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u000B\u001A\u00020\u00152\u0006\u0010\u0014\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u000B\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J:\u0010\u001F\u001A\u00020\u00152\u0006\u0010\u0019\u001A\u00020\r2!\u0010\u001E\u001A\u001D\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001B\u0012\b\b\u001C\u0012\u0004\b\b(\u001D\u0012\u0004\u0012\u00020\u00150\u001AH\u0016¢\u0006\u0004\b\u001F\u0010 J!\u0010\"\u001A\u0004\u0018\u00010\u00022\u0006\u0010!\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\rH\u0016¢\u0006\u0004\b\"\u0010#R\u001A\u0010\u0003\u001A\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\u0018¨\u0006\'"}, d2 = {"Lkotlinx/serialization/json/internal/StringJsonLexer;", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "", "source", "<init>", "(Ljava/lang/String;)V", "", "position", "prefetchOrEof", "(I)I", "", "consumeNextToken", "()B", "", "tryConsumeComma", "()Z", "canConsumeValue", "skipWhitespaces", "()I", "", "expected", "", "(C)V", "consumeKeyString", "()Ljava/lang/String;", "isLenient", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "stringChunk", "consumeChunk", "consumeStringChunked", "(ZLkotlin/jvm/functions/Function1;)V", "keyToMatch", "peekLeadingMatchingValue", "(Ljava/lang/String;Z)Ljava/lang/String;", "c", "Ljava/lang/String;", "getSource", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStringJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringJsonLexer.kt\nkotlinx/serialization/json/internal/StringJsonLexer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n1855#2,2:128\n*S KotlinDebug\n*F\n+ 1 StringJsonLexer.kt\nkotlinx/serialization/json/internal/StringJsonLexer\n*L\n107#1:128,2\n*E\n"})
public final class StringJsonLexer extends AbstractJsonLexer {
    public final String c;

    public StringJsonLexer(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "source");
        super();
        this.c = s;
    }

    @Override  // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean canConsumeValue() {
        int v = this.currentPosition;
        if(v == -1) {
            return false;
        }
        while(v < this.getSource().length()) {
            int v1 = this.getSource().charAt(v);
            if(v1 != 9 && v1 != 10 && v1 != 13 && v1 != 0x20) {
                this.currentPosition = v;
                return this.isValidValueStart(((char)v1));
            }
            ++v;
        }
        this.currentPosition = v;
        return false;
    }

    @Override  // kotlinx.serialization.json.internal.AbstractJsonLexer
    @NotNull
    public String consumeKeyString() {
        this.consumeNextToken('\"');
        int v = this.currentPosition;
        int v1 = StringsKt__StringsKt.indexOf$default(this.getSource(), '\"', v, false, 4, null);
        if(v1 != -1) {
            for(int v2 = v; v2 < v1; ++v2) {
                if(this.getSource().charAt(v2) == 92) {
                    return this.consumeString(this.getSource(), this.currentPosition, v2);
                }
            }
            this.currentPosition = v1 + 1;
            String s = this.getSource().substring(v, v1);
            Intrinsics.checkNotNullExpressionValue(s, "substring(...)");
            return s;
        }
        this.consumeStringLenient();
        this.fail$kotlinx_serialization_json(1, false);
        throw new KotlinNothingValueException();
    }

    @Override  // kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte consumeNextToken() {
        String s = this.getSource();
        while(this.currentPosition != -1 && this.currentPosition < s.length()) {
            int v = this.currentPosition;
            this.currentPosition = v + 1;
            byte b = AbstractJsonLexerKt.charToTokenClass(s.charAt(v));
            if(b != 3) {
                return b;
            }
            if(false) {
                break;
            }
        }
        return 10;
    }

    @Override  // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeNextToken(char c) {
        if(this.currentPosition == -1) {
            this.unexpectedToken(c);
        }
        String s = this.getSource();
        while(this.currentPosition < s.length()) {
            int v = this.currentPosition;
            this.currentPosition = v + 1;
            int v1 = s.charAt(v);
            if(v1 != 9 && v1 != 10 && v1 != 13 && v1 != 0x20) {
                if(v1 == c) {
                    return;
                }
                this.unexpectedToken(c);
            }
        }
        this.currentPosition = -1;
        this.unexpectedToken(c);
    }

    @Override  // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeStringChunked(boolean z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "consumeChunk");
        for(Object object0: StringsKt___StringsKt.chunked((z ? this.consumeStringLenient() : this.consumeString()), 0x4000)) {
            function10.invoke(object0);
        }
    }

    @Override  // kotlinx.serialization.json.internal.AbstractJsonLexer
    public CharSequence getSource() {
        return this.getSource();
    }

    @NotNull
    public String getSource() {
        return this.c;
    }

    @Override  // kotlinx.serialization.json.internal.AbstractJsonLexer
    @Nullable
    public String peekLeadingMatchingValue(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "keyToMatch");
        int v = this.currentPosition;
        try {
            if(this.consumeNextToken() == 6 && Intrinsics.areEqual(this.peekString(z), s)) {
                this.discardPeeked();
                if(this.consumeNextToken() == 5) {
                    return this.peekString(z);
                }
            }
            return null;
        }
        finally {
            this.currentPosition = v;
            this.discardPeeked();
        }
    }

    @Override  // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int prefetchOrEof(int v) {
        return v < this.getSource().length() ? v : -1;
    }

    @Override  // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int skipWhitespaces() {
        int v = this.currentPosition;
        if(v == -1) {
            return -1;
        }
    label_3:
        while(v < this.getSource().length()) {
            switch(this.getSource().charAt(v)) {
                case 9: 
                case 10: 
                case 13: 
                case 0x20: {
                    ++v;
                    continue;
                }
                default: {
                    break label_3;
                }
            }
        }
        this.currentPosition = v;
        return v;
    }

    @Override  // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean tryConsumeComma() {
        int v = this.skipWhitespaces();
        if(v != this.getSource().length() && v != -1 && this.getSource().charAt(v) == 44) {
            ++this.currentPosition;
            return true;
        }
        return false;
    }
}

