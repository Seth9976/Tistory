package com.kakao.tistory.presentation.screen.item;

import a5.b;
import androidx.compose.runtime.Immutable;
import com.kakao.tistory.presentation.common.graph.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000E\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000BJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000BJ\u0010\u0010\u000E\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000BJ\u0012\u0010\u000F\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u000BJD\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000BJ\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u000BR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001B\u001A\u0004\b\u001E\u0010\u000BR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001F\u0010\u001B\u001A\u0004\b \u0010\u000BR\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001B\u001A\u0004\b\"\u0010\u000BR\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001B\u001A\u0004\b$\u0010\u000B¨\u0006%"}, d2 = {"Lcom/kakao/tistory/presentation/screen/item/BlogSettingItem;", "", "", "blogName", "blogTitle", "description", "nickname", "logoImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/item/BlogSettingItem;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "b", "getBlogTitle", "c", "getDescription", "d", "getNickname", "e", "getLogoImageUrl", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogSettingItem {
    public static final int $stable;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public BlogSettingItem(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, @Nullable String s4) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(s1, "blogTitle");
        Intrinsics.checkNotNullParameter(s2, "description");
        Intrinsics.checkNotNullParameter(s3, "nickname");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    @NotNull
    public final String component3() {
        return this.c;
    }

    @NotNull
    public final String component4() {
        return this.d;
    }

    @Nullable
    public final String component5() {
        return this.e;
    }

    @NotNull
    public final BlogSettingItem copy(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, @Nullable String s4) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(s1, "blogTitle");
        Intrinsics.checkNotNullParameter(s2, "description");
        Intrinsics.checkNotNullParameter(s3, "nickname");
        return new BlogSettingItem(s, s1, s2, s3, s4);
    }

    public static BlogSettingItem copy$default(BlogSettingItem blogSettingItem0, String s, String s1, String s2, String s3, String s4, int v, Object object0) {
        if((v & 1) != 0) {
            s = blogSettingItem0.a;
        }
        if((v & 2) != 0) {
            s1 = blogSettingItem0.b;
        }
        if((v & 4) != 0) {
            s2 = blogSettingItem0.c;
        }
        if((v & 8) != 0) {
            s3 = blogSettingItem0.d;
        }
        if((v & 16) != 0) {
            s4 = blogSettingItem0.e;
        }
        return blogSettingItem0.copy(s, s1, s2, s3, s4);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BlogSettingItem)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((BlogSettingItem)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((BlogSettingItem)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((BlogSettingItem)object0).c)) {
            return false;
        }
        return Intrinsics.areEqual(this.d, ((BlogSettingItem)object0).d) ? Intrinsics.areEqual(this.e, ((BlogSettingItem)object0).e) : false;
    }

    @NotNull
    public final String getBlogName() {
        return this.a;
    }

    @NotNull
    public final String getBlogTitle() {
        return this.b;
    }

    @NotNull
    public final String getDescription() {
        return this.c;
    }

    @Nullable
    public final String getLogoImageUrl() {
        return this.e;
    }

    @NotNull
    public final String getNickname() {
        return this.d;
    }

    @Override
    public int hashCode() {
        int v = a.a(this.d, a.a(this.c, a.a(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F), 0x1F);
        return this.e == null ? v : v + this.e.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = b.w("BlogSettingItem(blogName=", this.a, ", blogTitle=", this.b, ", description=");
        androidx.room.a.w(stringBuilder0, this.c, ", nickname=", this.d, ", logoImageUrl=");
        return r0.a.o(stringBuilder0, this.e, ")");
    }
}

