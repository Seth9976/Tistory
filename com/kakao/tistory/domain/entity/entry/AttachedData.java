package com.kakao.tistory.domain.entity.entry;

import com.kakao.tistory.domain.blog.entity.a;
import com.kakao.tistory.domain.blog.entity.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0007HÆ\u0003J\u000B\u0010\u0017\u001A\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0018\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00072\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001A\u00020\u001A2\b\u0010\u001B\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001C\u001A\u00020\u0007HÖ\u0001J\t\u0010\u001D\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0013\u0010\b\u001A\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\f¨\u0006\u001E"}, d2 = {"Lcom/kakao/tistory/domain/entity/entry/AttachedData;", "", "url", "", "mimeType", "fileName", "fileSize", "", "imageInfo", "Lcom/kakao/tistory/domain/entity/entry/AttachedImageInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/kakao/tistory/domain/entity/entry/AttachedImageInfo;)V", "getFileName", "()Ljava/lang/String;", "getFileSize", "()I", "getImageInfo", "()Lcom/kakao/tistory/domain/entity/entry/AttachedImageInfo;", "getMimeType", "getUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class AttachedData {
    @NotNull
    private final String fileName;
    private final int fileSize;
    @Nullable
    private final AttachedImageInfo imageInfo;
    @NotNull
    private final String mimeType;
    @NotNull
    private final String url;

    public AttachedData(@NotNull String s, @NotNull String s1, @NotNull String s2, int v, @Nullable AttachedImageInfo attachedImageInfo0) {
        Intrinsics.checkNotNullParameter(s, "url");
        Intrinsics.checkNotNullParameter(s1, "mimeType");
        Intrinsics.checkNotNullParameter(s2, "fileName");
        super();
        this.url = s;
        this.mimeType = s1;
        this.fileName = s2;
        this.fileSize = v;
        this.imageInfo = attachedImageInfo0;
    }

    public AttachedData(String s, String s1, String s2, int v, AttachedImageInfo attachedImageInfo0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 16) != 0) {
            attachedImageInfo0 = null;
        }
        this(s, s1, s2, v, attachedImageInfo0);
    }

    @NotNull
    public final String component1() {
        return this.url;
    }

    @NotNull
    public final String component2() {
        return this.mimeType;
    }

    @NotNull
    public final String component3() {
        return this.fileName;
    }

    public final int component4() {
        return this.fileSize;
    }

    @Nullable
    public final AttachedImageInfo component5() {
        return this.imageInfo;
    }

    @NotNull
    public final AttachedData copy(@NotNull String s, @NotNull String s1, @NotNull String s2, int v, @Nullable AttachedImageInfo attachedImageInfo0) {
        Intrinsics.checkNotNullParameter(s, "url");
        Intrinsics.checkNotNullParameter(s1, "mimeType");
        Intrinsics.checkNotNullParameter(s2, "fileName");
        return new AttachedData(s, s1, s2, v, attachedImageInfo0);
    }

    public static AttachedData copy$default(AttachedData attachedData0, String s, String s1, String s2, int v, AttachedImageInfo attachedImageInfo0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = attachedData0.url;
        }
        if((v1 & 2) != 0) {
            s1 = attachedData0.mimeType;
        }
        if((v1 & 4) != 0) {
            s2 = attachedData0.fileName;
        }
        if((v1 & 8) != 0) {
            v = attachedData0.fileSize;
        }
        if((v1 & 16) != 0) {
            attachedImageInfo0 = attachedData0.imageInfo;
        }
        return attachedData0.copy(s, s1, s2, v, attachedImageInfo0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AttachedData)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.url, ((AttachedData)object0).url)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.mimeType, ((AttachedData)object0).mimeType)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.fileName, ((AttachedData)object0).fileName)) {
            return false;
        }
        return this.fileSize == ((AttachedData)object0).fileSize ? Intrinsics.areEqual(this.imageInfo, ((AttachedData)object0).imageInfo) : false;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    public final int getFileSize() {
        return this.fileSize;
    }

    @Nullable
    public final AttachedImageInfo getImageInfo() {
        return this.imageInfo;
    }

    @NotNull
    public final String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @Override
    public int hashCode() {
        int v = a.a(this.fileSize, b.a(this.fileName, b.a(this.mimeType, this.url.hashCode() * 0x1F, 0x1F), 0x1F), 0x1F);
        return this.imageInfo == null ? v : v + this.imageInfo.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = a5.b.w("AttachedData(url=", this.url, ", mimeType=", this.mimeType, ", fileName=");
        stringBuilder0.append(this.fileName);
        stringBuilder0.append(", fileSize=");
        stringBuilder0.append(this.fileSize);
        stringBuilder0.append(", imageInfo=");
        stringBuilder0.append(this.imageInfo);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

