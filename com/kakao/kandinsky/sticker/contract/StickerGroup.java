package com.kakao.kandinsky.sticker.contract;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u000E\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001A\u00020\u0004\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0003\u0010\u0005\u001A\u00020\u00042\b\b\u0003\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000EJ\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\fR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\u000ER\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001E\u001A\u0004\b!\u0010\u000ER\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u0011¨\u0006%"}, d2 = {"Lcom/kakao/kandinsky/sticker/contract/StickerGroup;", "", "", "name", "", "menuIcon", "menuIconOn", "Lcom/kakao/kandinsky/sticker/contract/StickerSizeType;", "sizeType", "<init>", "(Ljava/lang/String;IILcom/kakao/kandinsky/sticker/contract/StickerSizeType;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()Lcom/kakao/kandinsky/sticker/contract/StickerSizeType;", "copy", "(Ljava/lang/String;IILcom/kakao/kandinsky/sticker/contract/StickerSizeType;)Lcom/kakao/kandinsky/sticker/contract/StickerGroup;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "I", "getMenuIcon", "c", "getMenuIconOn", "d", "Lcom/kakao/kandinsky/sticker/contract/StickerSizeType;", "getSizeType", "sticker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class StickerGroup {
    public static final int $stable;
    public final String a;
    public final int b;
    public final int c;
    public final StickerSizeType d;

    public StickerGroup(@NotNull String s, @DrawableRes int v, @DrawableRes int v1, @NotNull StickerSizeType stickerSizeType0) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(stickerSizeType0, "sizeType");
        super();
        this.a = s;
        this.b = v;
        this.c = v1;
        this.d = stickerSizeType0;
    }

    public StickerGroup(String s, int v, int v1, StickerSizeType stickerSizeType0, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 8) != 0) {
            stickerSizeType0 = StickerSizeType.Large;
        }
        this(s, v, v1, stickerSizeType0);
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    @NotNull
    public final StickerSizeType component4() {
        return this.d;
    }

    @NotNull
    public final StickerGroup copy(@NotNull String s, @DrawableRes int v, @DrawableRes int v1, @NotNull StickerSizeType stickerSizeType0) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(stickerSizeType0, "sizeType");
        return new StickerGroup(s, v, v1, stickerSizeType0);
    }

    public static StickerGroup copy$default(StickerGroup stickerGroup0, String s, int v, int v1, StickerSizeType stickerSizeType0, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = stickerGroup0.a;
        }
        if((v2 & 2) != 0) {
            v = stickerGroup0.b;
        }
        if((v2 & 4) != 0) {
            v1 = stickerGroup0.c;
        }
        if((v2 & 8) != 0) {
            stickerSizeType0 = stickerGroup0.d;
        }
        return stickerGroup0.copy(s, v, v1, stickerSizeType0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof StickerGroup)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((StickerGroup)object0).a)) {
            return false;
        }
        if(this.b != ((StickerGroup)object0).b) {
            return false;
        }
        return this.c == ((StickerGroup)object0).c ? this.d == ((StickerGroup)object0).d : false;
    }

    public final int getMenuIcon() {
        return this.b;
    }

    public final int getMenuIconOn() {
        return this.c;
    }

    @NotNull
    public final String getName() {
        return this.a;
    }

    @NotNull
    public final StickerSizeType getSizeType() {
        return this.d;
    }

    @Override
    public int hashCode() {
        return this.d.hashCode() + a.c(this.c, a.c(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        return "StickerGroup(name=" + this.a + ", menuIcon=" + this.b + ", menuIconOn=" + this.c + ", sizeType=" + this.d + ")";
    }
}

