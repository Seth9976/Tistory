package com.kakao.kandinsky.textedit.contract;

import androidx.annotation.FontRes;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\n\b\u0087\b\u0018\u0000 \u001B2\u00020\u0001:\u0001\u001BB\u001B\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001A\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ&\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0003\u0010\u0005\u001A\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000E\u0010\tJ\u0010\u0010\u000F\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\tR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u000B¨\u0006\u001C"}, d2 = {"Lcom/kakao/kandinsky/textedit/contract/FontData;", "", "", "alias", "", "resource", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/kakao/kandinsky/textedit/contract/FontData;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAlias", "b", "Ljava/lang/Integer;", "getResource", "Companion", "textedit_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FontData {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/kandinsky/textedit/contract/FontData$Companion;", "", "Lcom/kakao/kandinsky/textedit/contract/FontData;", "SYSTEM_FONT", "Lcom/kakao/kandinsky/textedit/contract/FontData;", "getSYSTEM_FONT", "()Lcom/kakao/kandinsky/textedit/contract/FontData;", "textedit_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final FontData getSYSTEM_FONT() {
            return FontData.c;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final String a;
    public final Integer b;
    public static final FontData c;

    static {
        FontData.Companion = new Companion(null);
        FontData.c = new FontData("기본서체", null);
    }

    public FontData(@NotNull String s, @FontRes @Nullable Integer integer0) {
        Intrinsics.checkNotNullParameter(s, "alias");
        super();
        this.a = s;
        this.b = integer0;
    }

    public FontData(String s, Integer integer0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            integer0 = null;
        }
        this(s, integer0);
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @Nullable
    public final Integer component2() {
        return this.b;
    }

    @NotNull
    public final FontData copy(@NotNull String s, @FontRes @Nullable Integer integer0) {
        Intrinsics.checkNotNullParameter(s, "alias");
        return new FontData(s, integer0);
    }

    public static FontData copy$default(FontData fontData0, String s, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            s = fontData0.a;
        }
        if((v & 2) != 0) {
            integer0 = fontData0.b;
        }
        return fontData0.copy(s, integer0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FontData)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((FontData)object0).a) ? Intrinsics.areEqual(this.b, ((FontData)object0).b) : false;
    }

    @NotNull
    public final String getAlias() {
        return this.a;
    }

    @Nullable
    public final Integer getResource() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "FontData(alias=" + this.a + ", resource=" + this.b + ")";
    }
}

