package com.kakao.tistory.domain.entity.autosave;

import com.kakao.tistory.domain.blog.entity.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000B\u0010\u000B\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000E\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/kakao/tistory/domain/entity/autosave/EntryEntity;", "", "title", "", "postJson", "thumbnail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPostJson", "()Ljava/lang/String;", "getThumbnail", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EntryEntity {
    @NotNull
    private final String postJson;
    @Nullable
    private final String thumbnail;
    @Nullable
    private final String title;

    public EntryEntity(@Nullable String s, @NotNull String s1, @Nullable String s2) {
        Intrinsics.checkNotNullParameter(s1, "postJson");
        super();
        this.title = s;
        this.postJson = s1;
        this.thumbnail = s2;
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final String component2() {
        return this.postJson;
    }

    @Nullable
    public final String component3() {
        return this.thumbnail;
    }

    @NotNull
    public final EntryEntity copy(@Nullable String s, @NotNull String s1, @Nullable String s2) {
        Intrinsics.checkNotNullParameter(s1, "postJson");
        return new EntryEntity(s, s1, s2);
    }

    public static EntryEntity copy$default(EntryEntity entryEntity0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = entryEntity0.title;
        }
        if((v & 2) != 0) {
            s1 = entryEntity0.postJson;
        }
        if((v & 4) != 0) {
            s2 = entryEntity0.thumbnail;
        }
        return entryEntity0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof EntryEntity)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.title, ((EntryEntity)object0).title)) {
            return false;
        }
        return Intrinsics.areEqual(this.postJson, ((EntryEntity)object0).postJson) ? Intrinsics.areEqual(this.thumbnail, ((EntryEntity)object0).thumbnail) : false;
    }

    @NotNull
    public final String getPostJson() {
        return this.postJson;
    }

    @Nullable
    public final String getThumbnail() {
        return this.thumbnail;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = b.a(this.postJson, (this.title == null ? 0 : this.title.hashCode()) * 0x1F, 0x1F);
        String s = this.thumbnail;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 + v;
    }

    @Override
    @NotNull
    public String toString() {
        return a.o(a5.b.w("EntryEntity(title=", this.title, ", postJson=", this.postJson, ", thumbnail="), this.thumbnail, ")");
    }
}

