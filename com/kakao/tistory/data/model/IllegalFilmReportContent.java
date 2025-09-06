package com.kakao.tistory.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b,\b\u0086\b\u0018\u00002\u00020\u0001B\u00A9\u0001\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\u0006\u0010\b\u001A\u00020\t\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001A\u00020\u0003\u0012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u0014\u00A2\u0006\u0002\u0010\u0015J\t\u0010+\u001A\u00020\u0003H\u00C6\u0003J\u000B\u0010,\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010-\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010.\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010/\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u00100\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u0010\u00101\u001A\u0004\u0018\u00010\u0014H\u00C6\u0003\u00A2\u0006\u0002\u0010\u001EJ\t\u00102\u001A\u00020\u0005H\u00C6\u0003J\t\u00103\u001A\u00020\u0003H\u00C6\u0003J\t\u00104\u001A\u00020\u0003H\u00C6\u0003J\t\u00105\u001A\u00020\tH\u00C6\u0003J\u0010\u00106\u001A\u0004\u0018\u00010\tH\u00C6\u0003\u00A2\u0006\u0002\u0010\u0017J\u0010\u00107\u001A\u0004\u0018\u00010\tH\u00C6\u0003\u00A2\u0006\u0002\u0010\u0017J\t\u00108\u001A\u00020\u0003H\u00C6\u0003J\u000B\u00109\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u00B6\u0001\u0010:\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001A\u00020\u00032\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u0014H\u00C6\u0001\u00A2\u0006\u0002\u0010;J\u0013\u0010<\u001A\u00020\u00142\b\u0010=\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010>\u001A\u00020\u0005H\u00D6\u0001J\t\u0010?\u001A\u00020\u0003H\u00D6\u0001R\u0015\u0010\n\u001A\u0004\u0018\u00010\t\u00A2\u0006\n\n\u0002\u0010\u0018\u001A\u0004\b\u0016\u0010\u0017R\u0015\u0010\u000B\u001A\u0004\u0018\u00010\t\u00A2\u0006\n\n\u0002\u0010\u0018\u001A\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0007\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001A\u0010\u001BR\u0013\u0010\u0010\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001C\u0010\u001BR\u0013\u0010\u0011\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001D\u0010\u001BR\u0015\u0010\u0013\u001A\u0004\u0018\u00010\u0014\u00A2\u0006\n\n\u0002\u0010\u001F\u001A\u0004\b\u0013\u0010\u001ER\u0013\u0010\u000F\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b \u0010\u001BR\u0011\u0010\u0006\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b!\u0010\u001BR\u0011\u0010\u0004\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\"\u0010#R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b$\u0010\u001BR\u0011\u0010\b\u001A\u00020\t\u00A2\u0006\b\n\u0000\u001A\u0004\b%\u0010&R\u0013\u0010\r\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\'\u0010\u001BR\u0011\u0010\f\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b(\u0010\u001BR\u0013\u0010\u000E\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b)\u0010\u001BR\u0013\u0010\u0012\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b*\u0010\u001B\u00A8\u0006@"}, d2 = {"Lcom/kakao/tistory/data/model/IllegalFilmReportContent;", "", "serviceType", "", "serviceCode", "", "platformCode", "contentType", "siteId", "", "articleId", "commentId", "userKeyType", "userKey", "userName", "nickname", "description", "imageUrl", "viewUrl", "isFlash", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getArticleId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCommentId", "getContentType", "()Ljava/lang/String;", "getDescription", "getImageUrl", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNickname", "getPlatformCode", "getServiceCode", "()I", "getServiceType", "getSiteId", "()J", "getUserKey", "getUserKeyType", "getUserName", "getViewUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kakao/tistory/data/model/IllegalFilmReportContent;", "equals", "other", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class IllegalFilmReportContent {
    @Nullable
    private final Long articleId;
    @Nullable
    private final Long commentId;
    @NotNull
    private final String contentType;
    @Nullable
    private final String description;
    @Nullable
    private final String imageUrl;
    @Nullable
    private final Boolean isFlash;
    @Nullable
    private final String nickname;
    @NotNull
    private final String platformCode;
    private final int serviceCode;
    @NotNull
    private final String serviceType;
    private final long siteId;
    @Nullable
    private final String userKey;
    @NotNull
    private final String userKeyType;
    @Nullable
    private final String userName;
    @Nullable
    private final String viewUrl;

    public IllegalFilmReportContent(@NotNull String s, int v, @NotNull String s1, @NotNull String s2, long v1, @Nullable Long long0, @Nullable Long long1, @NotNull String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6, @Nullable String s7, @Nullable String s8, @Nullable String s9, @Nullable Boolean boolean0) {
        Intrinsics.checkNotNullParameter(s, "serviceType");
        Intrinsics.checkNotNullParameter(s1, "platformCode");
        Intrinsics.checkNotNullParameter(s2, "contentType");
        Intrinsics.checkNotNullParameter(s3, "userKeyType");
        super();
        this.serviceType = s;
        this.serviceCode = v;
        this.platformCode = s1;
        this.contentType = s2;
        this.siteId = v1;
        this.articleId = long0;
        this.commentId = long1;
        this.userKeyType = s3;
        this.userKey = s4;
        this.userName = s5;
        this.nickname = s6;
        this.description = s7;
        this.imageUrl = s8;
        this.viewUrl = s9;
        this.isFlash = boolean0;
    }

    public IllegalFilmReportContent(String s, int v, String s1, String s2, long v1, Long long0, Long long1, String s3, String s4, String s5, String s6, String s7, String s8, String s9, Boolean boolean0, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v2 & 1) == 0 ? s : "KAKAO"), ((v2 & 2) == 0 ? v : 35), ((v2 & 4) == 0 ? s1 : "TISTORY"), s2, v1, ((v2 & 0x20) == 0 ? long0 : null), ((v2 & 0x40) == 0 ? long1 : null), ((v2 & 0x80) == 0 ? s3 : "TISTORY"), ((v2 & 0x100) == 0 ? s4 : null), ((v2 & 0x200) == 0 ? s5 : null), ((v2 & 0x400) == 0 ? s6 : null), ((v2 & 0x800) == 0 ? s7 : null), ((v2 & 0x1000) == 0 ? s8 : null), ((v2 & 0x2000) == 0 ? s9 : null), ((v2 & 0x4000) == 0 ? boolean0 : null));
    }

    @NotNull
    public final String component1() {
        return this.serviceType;
    }

    @Nullable
    public final String component10() {
        return this.userName;
    }

    @Nullable
    public final String component11() {
        return this.nickname;
    }

    @Nullable
    public final String component12() {
        return this.description;
    }

    @Nullable
    public final String component13() {
        return this.imageUrl;
    }

    @Nullable
    public final String component14() {
        return this.viewUrl;
    }

    @Nullable
    public final Boolean component15() {
        return this.isFlash;
    }

    public final int component2() {
        return this.serviceCode;
    }

    @NotNull
    public final String component3() {
        return this.platformCode;
    }

    @NotNull
    public final String component4() {
        return this.contentType;
    }

    public final long component5() {
        return this.siteId;
    }

    @Nullable
    public final Long component6() {
        return this.articleId;
    }

    @Nullable
    public final Long component7() {
        return this.commentId;
    }

    @NotNull
    public final String component8() {
        return this.userKeyType;
    }

    @Nullable
    public final String component9() {
        return this.userKey;
    }

    @NotNull
    public final IllegalFilmReportContent copy(@NotNull String s, int v, @NotNull String s1, @NotNull String s2, long v1, @Nullable Long long0, @Nullable Long long1, @NotNull String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6, @Nullable String s7, @Nullable String s8, @Nullable String s9, @Nullable Boolean boolean0) {
        Intrinsics.checkNotNullParameter(s, "serviceType");
        Intrinsics.checkNotNullParameter(s1, "platformCode");
        Intrinsics.checkNotNullParameter(s2, "contentType");
        Intrinsics.checkNotNullParameter(s3, "userKeyType");
        return new IllegalFilmReportContent(s, v, s1, s2, v1, long0, long1, s3, s4, s5, s6, s7, s8, s9, boolean0);
    }

    public static IllegalFilmReportContent copy$default(IllegalFilmReportContent illegalFilmReportContent0, String s, int v, String s1, String s2, long v1, Long long0, Long long1, String s3, String s4, String s5, String s6, String s7, String s8, String s9, Boolean boolean0, int v2, Object object0) {
        String s10 = (v2 & 1) == 0 ? s : illegalFilmReportContent0.serviceType;
        int v3 = (v2 & 2) == 0 ? v : illegalFilmReportContent0.serviceCode;
        String s11 = (v2 & 4) == 0 ? s1 : illegalFilmReportContent0.platformCode;
        String s12 = (v2 & 8) == 0 ? s2 : illegalFilmReportContent0.contentType;
        long v4 = (v2 & 16) == 0 ? v1 : illegalFilmReportContent0.siteId;
        Long long2 = (v2 & 0x20) == 0 ? long0 : illegalFilmReportContent0.articleId;
        Long long3 = (v2 & 0x40) == 0 ? long1 : illegalFilmReportContent0.commentId;
        String s13 = (v2 & 0x80) == 0 ? s3 : illegalFilmReportContent0.userKeyType;
        String s14 = (v2 & 0x100) == 0 ? s4 : illegalFilmReportContent0.userKey;
        String s15 = (v2 & 0x200) == 0 ? s5 : illegalFilmReportContent0.userName;
        String s16 = (v2 & 0x400) == 0 ? s6 : illegalFilmReportContent0.nickname;
        String s17 = (v2 & 0x800) == 0 ? s7 : illegalFilmReportContent0.description;
        String s18 = (v2 & 0x1000) == 0 ? s8 : illegalFilmReportContent0.imageUrl;
        String s19 = (v2 & 0x2000) == 0 ? s9 : illegalFilmReportContent0.viewUrl;
        return (v2 & 0x4000) == 0 ? illegalFilmReportContent0.copy(s10, v3, s11, s12, v4, long2, long3, s13, s14, s15, s16, s17, s18, s19, boolean0) : illegalFilmReportContent0.copy(s10, v3, s11, s12, v4, long2, long3, s13, s14, s15, s16, s17, s18, s19, illegalFilmReportContent0.isFlash);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof IllegalFilmReportContent)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.serviceType, ((IllegalFilmReportContent)object0).serviceType)) {
            return false;
        }
        if(this.serviceCode != ((IllegalFilmReportContent)object0).serviceCode) {
            return false;
        }
        if(!Intrinsics.areEqual(this.platformCode, ((IllegalFilmReportContent)object0).platformCode)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.contentType, ((IllegalFilmReportContent)object0).contentType)) {
            return false;
        }
        if(this.siteId != ((IllegalFilmReportContent)object0).siteId) {
            return false;
        }
        if(!Intrinsics.areEqual(this.articleId, ((IllegalFilmReportContent)object0).articleId)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.commentId, ((IllegalFilmReportContent)object0).commentId)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.userKeyType, ((IllegalFilmReportContent)object0).userKeyType)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.userKey, ((IllegalFilmReportContent)object0).userKey)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.userName, ((IllegalFilmReportContent)object0).userName)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.nickname, ((IllegalFilmReportContent)object0).nickname)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.description, ((IllegalFilmReportContent)object0).description)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.imageUrl, ((IllegalFilmReportContent)object0).imageUrl)) {
            return false;
        }
        return Intrinsics.areEqual(this.viewUrl, ((IllegalFilmReportContent)object0).viewUrl) ? Intrinsics.areEqual(this.isFlash, ((IllegalFilmReportContent)object0).isFlash) : false;
    }

    @Nullable
    public final Long getArticleId() {
        return this.articleId;
    }

    @Nullable
    public final Long getCommentId() {
        return this.commentId;
    }

    @NotNull
    public final String getContentType() {
        return this.contentType;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    @NotNull
    public final String getPlatformCode() {
        return this.platformCode;
    }

    public final int getServiceCode() {
        return this.serviceCode;
    }

    @NotNull
    public final String getServiceType() {
        return this.serviceType;
    }

    public final long getSiteId() {
        return this.siteId;
    }

    @Nullable
    public final String getUserKey() {
        return this.userKey;
    }

    @NotNull
    public final String getUserKeyType() {
        return this.userKeyType;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
    }

    @Nullable
    public final String getViewUrl() {
        return this.viewUrl;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = q.c(((a.k(this.siteId, q.c(q.c(r0.a.c(this.serviceCode, this.serviceType.hashCode() * 0x1F, 0x1F), 0x1F, this.platformCode), 0x1F, this.contentType), 0x1F) + (this.articleId == null ? 0 : this.articleId.hashCode())) * 0x1F + (this.commentId == null ? 0 : this.commentId.hashCode())) * 0x1F, 0x1F, this.userKeyType);
        int v2 = this.userKey == null ? 0 : this.userKey.hashCode();
        int v3 = this.userName == null ? 0 : this.userName.hashCode();
        int v4 = this.nickname == null ? 0 : this.nickname.hashCode();
        int v5 = this.description == null ? 0 : this.description.hashCode();
        int v6 = this.imageUrl == null ? 0 : this.imageUrl.hashCode();
        int v7 = this.viewUrl == null ? 0 : this.viewUrl.hashCode();
        Boolean boolean0 = this.isFlash;
        if(boolean0 != null) {
            v = boolean0.hashCode();
        }
        return ((((((v1 + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v;
    }

    @Nullable
    public final Boolean isFlash() {
        return this.isFlash;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("IllegalFilmReportContent(serviceType=");
        stringBuilder0.append(this.serviceType);
        stringBuilder0.append(", serviceCode=");
        stringBuilder0.append(this.serviceCode);
        stringBuilder0.append(", platformCode=");
        androidx.room.a.w(stringBuilder0, this.platformCode, ", contentType=", this.contentType, ", siteId=");
        stringBuilder0.append(this.siteId);
        stringBuilder0.append(", articleId=");
        stringBuilder0.append(this.articleId);
        stringBuilder0.append(", commentId=");
        stringBuilder0.append(this.commentId);
        stringBuilder0.append(", userKeyType=");
        stringBuilder0.append(this.userKeyType);
        androidx.room.a.w(stringBuilder0, ", userKey=", this.userKey, ", userName=", this.userName);
        androidx.room.a.w(stringBuilder0, ", nickname=", this.nickname, ", description=", this.description);
        androidx.room.a.w(stringBuilder0, ", imageUrl=", this.imageUrl, ", viewUrl=", this.viewUrl);
        stringBuilder0.append(", isFlash=");
        stringBuilder0.append(this.isFlash);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

