package com.kakao.tistory.domain.entity;

import com.kakao.tistory.domain.blog.entity.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\'\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/kakao/tistory/domain/entity/SingleGrammarCheck;", "", "input", "", "output", "etype", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEtype", "()Ljava/lang/String;", "getInput", "getOutput", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SingleGrammarCheck {
    @NotNull
    private final String etype;
    @NotNull
    private final String input;
    @NotNull
    private final String output;

    public SingleGrammarCheck(@NotNull String s, @NotNull String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(s, "input");
        Intrinsics.checkNotNullParameter(s1, "output");
        Intrinsics.checkNotNullParameter(s2, "etype");
        super();
        this.input = s;
        this.output = s1;
        this.etype = s2;
    }

    @NotNull
    public final String component1() {
        return this.input;
    }

    @NotNull
    public final String component2() {
        return this.output;
    }

    @NotNull
    public final String component3() {
        return this.etype;
    }

    @NotNull
    public final SingleGrammarCheck copy(@NotNull String s, @NotNull String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(s, "input");
        Intrinsics.checkNotNullParameter(s1, "output");
        Intrinsics.checkNotNullParameter(s2, "etype");
        return new SingleGrammarCheck(s, s1, s2);
    }

    public static SingleGrammarCheck copy$default(SingleGrammarCheck singleGrammarCheck0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = singleGrammarCheck0.input;
        }
        if((v & 2) != 0) {
            s1 = singleGrammarCheck0.output;
        }
        if((v & 4) != 0) {
            s2 = singleGrammarCheck0.etype;
        }
        return singleGrammarCheck0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SingleGrammarCheck)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.input, ((SingleGrammarCheck)object0).input)) {
            return false;
        }
        return Intrinsics.areEqual(this.output, ((SingleGrammarCheck)object0).output) ? Intrinsics.areEqual(this.etype, ((SingleGrammarCheck)object0).etype) : false;
    }

    @NotNull
    public final String getEtype() {
        return this.etype;
    }

    @NotNull
    public final String getInput() {
        return this.input;
    }

    @NotNull
    public final String getOutput() {
        return this.output;
    }

    @Override
    public int hashCode() {
        return this.etype.hashCode() + b.a(this.output, this.input.hashCode() * 0x1F, 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        return a.o(a5.b.w("SingleGrammarCheck(input=", this.input, ", output=", this.output, ", etype="), this.etype, ")");
    }
}

