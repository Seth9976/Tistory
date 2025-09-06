package com.kakao.tistory.domain.entity;

import a5.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\f\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/kakao/tistory/domain/entity/CategoryInfo;", "", "listStyle", "", "image", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getImage", "getListStyle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CategoryInfo {
    @Nullable
    private final String description;
    @Nullable
    private final String image;
    @NotNull
    private final String listStyle;

    public CategoryInfo(@NotNull String s, @Nullable String s1, @Nullable String s2) {
        Intrinsics.checkNotNullParameter(s, "listStyle");
        super();
        this.listStyle = s;
        this.image = s1;
        this.description = s2;
    }

    @NotNull
    public final String component1() {
        return this.listStyle;
    }

    @Nullable
    public final String component2() {
        return this.image;
    }

    @Nullable
    public final String component3() {
        return this.description;
    }

    @NotNull
    public final CategoryInfo copy(@NotNull String s, @Nullable String s1, @Nullable String s2) {
        Intrinsics.checkNotNullParameter(s, "listStyle");
        return new CategoryInfo(s, s1, s2);
    }

    public static CategoryInfo copy$default(CategoryInfo categoryInfo0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = categoryInfo0.listStyle;
        }
        if((v & 2) != 0) {
            s1 = categoryInfo0.image;
        }
        if((v & 4) != 0) {
            s2 = categoryInfo0.description;
        }
        return categoryInfo0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CategoryInfo)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.listStyle, ((CategoryInfo)object0).listStyle)) {
            return false;
        }
        return Intrinsics.areEqual(this.image, ((CategoryInfo)object0).image) ? Intrinsics.areEqual(this.description, ((CategoryInfo)object0).description) : false;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getListStyle() {
        return this.listStyle;
    }

    @Override
    public int hashCode() {
        int v = this.listStyle.hashCode();
        int v1 = 0;
        int v2 = this.image == null ? 0 : this.image.hashCode();
        String s = this.description;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    @NotNull
    public String toString() {
        return a.o(b.w("CategoryInfo(listStyle=", this.listStyle, ", image=", this.image, ", description="), this.description, ")");
    }
}

