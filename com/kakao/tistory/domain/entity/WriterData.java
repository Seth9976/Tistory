package com.kakao.tistory.domain.entity;

import androidx.room.a;
import com.kakao.tistory.domain.blog.entity.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0005HÆ\u0003J\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0005HÆ\u0003J3\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001A\u00020\u0005HÖ\u0001R\u0011\u0010\u0007\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u001A"}, d2 = {"Lcom/kakao/tistory/domain/entity/WriterData;", "", "userId", "", "writerName", "", "profileImageUrl", "defaultBlogName", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDefaultBlogName", "()Ljava/lang/String;", "getProfileImageUrl", "getUserId", "()J", "getWriterName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class WriterData {
    @NotNull
    private final String defaultBlogName;
    @Nullable
    private final String profileImageUrl;
    private final long userId;
    @NotNull
    private final String writerName;

    public WriterData() {
        this(0L, null, null, null, 15, null);
    }

    public WriterData(long v, @NotNull String s, @Nullable String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(s, "writerName");
        Intrinsics.checkNotNullParameter(s2, "defaultBlogName");
        super();
        this.userId = v;
        this.writerName = s;
        this.profileImageUrl = s1;
        this.defaultBlogName = s2;
    }

    public WriterData(long v, String s, String s1, String s2, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 0L;
        }
        if((v1 & 4) != 0) {
            s1 = null;
        }
        this(v, ((v1 & 2) == 0 ? s : ""), s1, ((v1 & 8) == 0 ? s2 : ""));
    }

    public final long component1() {
        return this.userId;
    }

    @NotNull
    public final String component2() {
        return this.writerName;
    }

    @Nullable
    public final String component3() {
        return this.profileImageUrl;
    }

    @NotNull
    public final String component4() {
        return this.defaultBlogName;
    }

    @NotNull
    public final WriterData copy(long v, @NotNull String s, @Nullable String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(s, "writerName");
        Intrinsics.checkNotNullParameter(s2, "defaultBlogName");
        return new WriterData(v, s, s1, s2);
    }

    public static WriterData copy$default(WriterData writerData0, long v, String s, String s1, String s2, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = writerData0.userId;
        }
        if((v1 & 2) != 0) {
            s = writerData0.writerName;
        }
        if((v1 & 4) != 0) {
            s1 = writerData0.profileImageUrl;
        }
        if((v1 & 8) != 0) {
            s2 = writerData0.defaultBlogName;
        }
        return writerData0.copy(v, s, s1, s2);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof WriterData)) {
            return false;
        }
        if(this.userId != ((WriterData)object0).userId) {
            return false;
        }
        if(!Intrinsics.areEqual(this.writerName, ((WriterData)object0).writerName)) {
            return false;
        }
        return Intrinsics.areEqual(this.profileImageUrl, ((WriterData)object0).profileImageUrl) ? Intrinsics.areEqual(this.defaultBlogName, ((WriterData)object0).defaultBlogName) : false;
    }

    @NotNull
    public final String getDefaultBlogName() {
        return this.defaultBlogName;
    }

    @Nullable
    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public final long getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getWriterName() {
        return this.writerName;
    }

    @Override
    public int hashCode() {
        int v = b.a(this.writerName, Long.hashCode(this.userId) * 0x1F, 0x1F);
        return this.profileImageUrl == null ? this.defaultBlogName.hashCode() + v * 0x1F : this.defaultBlogName.hashCode() + (v + this.profileImageUrl.hashCode()) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("WriterData(userId=");
        stringBuilder0.append(this.userId);
        stringBuilder0.append(", writerName=");
        stringBuilder0.append(this.writerName);
        a.w(stringBuilder0, ", profileImageUrl=", this.profileImageUrl, ", defaultBlogName=", this.defaultBlogName);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

