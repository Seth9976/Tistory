package com.kakao.tistory.domain.entity.entry;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.kakao.tistory.domain.blog.entity.a;
import com.kakao.tistory.domain.blog.entity.b;
import com.kakao.tistory.domain.blog.entity.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u001C\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\b\u0012\u0006\u0010\t\u001A\u00020\u0003\u0012\u0006\u0010\n\u001A\u00020\u0003\u0012\u0006\u0010\u000B\u001A\u00020\u0003\u0012\u0006\u0010\f\u001A\u00020\u0003\u00A2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001A\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001B\u001A\u00020\u0006H\u00C6\u0003J\t\u0010\u001C\u001A\u00020\bH\u00C6\u0003J\t\u0010\u001D\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001E\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001F\u001A\u00020\u0003H\u00C6\u0003J\t\u0010 \u001A\u00020\u0003H\u00C6\u0003JY\u0010!\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\u00032\b\b\u0002\u0010\n\u001A\u00020\u00032\b\b\u0002\u0010\u000B\u001A\u00020\u00032\b\b\u0002\u0010\f\u001A\u00020\u0003H\u00C6\u0001J\t\u0010\"\u001A\u00020\u0006H\u00D6\u0001J\u0013\u0010#\u001A\u00020\b2\b\u0010$\u001A\u0004\u0018\u00010%H\u00D6\u0003J\t\u0010&\u001A\u00020\u0006H\u00D6\u0001J\t\u0010\'\u001A\u00020\u0003H\u00D6\u0001J\u0019\u0010(\u001A\u00020)2\u0006\u0010*\u001A\u00020+2\u0006\u0010,\u001A\u00020\u0006H\u00D6\u0001R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0011\u0010\u000B\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000FR\u0011\u0010\u0007\u001A\u00020\b\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u000FR\u0011\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u000FR\u0011\u0010\u0005\u001A\u00020\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0017\u0010\u000FR\u0011\u0010\n\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u000F\u00A8\u0006-"}, d2 = {"Lcom/kakao/tistory/domain/entity/entry/ChallengeResult;", "Landroid/os/Parcelable;", "challengeCode", "", "linkURL", "score", "", "displayAgeAuth", "", "status", "title", "description", "imageURL", "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChallengeCode", "()Ljava/lang/String;", "getDescription", "getDisplayAgeAuth", "()Z", "getImageURL", "getLinkURL", "getScore", "()I", "getStatus", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Parcelize
public final class ChallengeResult implements Parcelable {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class Creator implements Parcelable.Creator {
        @NotNull
        public final ChallengeResult createFromParcel(@NotNull Parcel parcel0) {
            Intrinsics.checkNotNullParameter(parcel0, "parcel");
            String s = parcel0.readString();
            String s1 = parcel0.readString();
            int v = parcel0.readInt();
            return parcel0.readInt() == 0 ? new ChallengeResult(s, s1, v, false, parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString()) : new ChallengeResult(s, s1, v, true, parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString());
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.createFromParcel(parcel0);
        }

        @NotNull
        public final ChallengeResult[] newArray(int v) {
            return new ChallengeResult[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.newArray(v);
        }
    }

    @NotNull
    public static final Parcelable.Creator CREATOR;
    @NotNull
    private final String challengeCode;
    @NotNull
    private final String description;
    private final boolean displayAgeAuth;
    @NotNull
    private final String imageURL;
    @NotNull
    private final String linkURL;
    private final int score;
    @NotNull
    private final String status;
    @NotNull
    private final String title;

    static {
        ChallengeResult.CREATOR = new Creator();
    }

    public ChallengeResult(@NotNull String s, @NotNull String s1, int v, boolean z, @NotNull String s2, @NotNull String s3, @NotNull String s4, @NotNull String s5) {
        Intrinsics.checkNotNullParameter(s, "challengeCode");
        Intrinsics.checkNotNullParameter(s1, "linkURL");
        Intrinsics.checkNotNullParameter(s2, "status");
        Intrinsics.checkNotNullParameter(s3, "title");
        Intrinsics.checkNotNullParameter(s4, "description");
        Intrinsics.checkNotNullParameter(s5, "imageURL");
        super();
        this.challengeCode = s;
        this.linkURL = s1;
        this.score = v;
        this.displayAgeAuth = z;
        this.status = s2;
        this.title = s3;
        this.description = s4;
        this.imageURL = s5;
    }

    @NotNull
    public final String component1() {
        return this.challengeCode;
    }

    @NotNull
    public final String component2() {
        return this.linkURL;
    }

    public final int component3() {
        return this.score;
    }

    public final boolean component4() {
        return this.displayAgeAuth;
    }

    @NotNull
    public final String component5() {
        return this.status;
    }

    @NotNull
    public final String component6() {
        return this.title;
    }

    @NotNull
    public final String component7() {
        return this.description;
    }

    @NotNull
    public final String component8() {
        return this.imageURL;
    }

    @NotNull
    public final ChallengeResult copy(@NotNull String s, @NotNull String s1, int v, boolean z, @NotNull String s2, @NotNull String s3, @NotNull String s4, @NotNull String s5) {
        Intrinsics.checkNotNullParameter(s, "challengeCode");
        Intrinsics.checkNotNullParameter(s1, "linkURL");
        Intrinsics.checkNotNullParameter(s2, "status");
        Intrinsics.checkNotNullParameter(s3, "title");
        Intrinsics.checkNotNullParameter(s4, "description");
        Intrinsics.checkNotNullParameter(s5, "imageURL");
        return new ChallengeResult(s, s1, v, z, s2, s3, s4, s5);
    }

    public static ChallengeResult copy$default(ChallengeResult challengeResult0, String s, String s1, int v, boolean z, String s2, String s3, String s4, String s5, int v1, Object object0) {
        String s6 = (v1 & 1) == 0 ? s : challengeResult0.challengeCode;
        String s7 = (v1 & 2) == 0 ? s1 : challengeResult0.linkURL;
        int v2 = (v1 & 4) == 0 ? v : challengeResult0.score;
        boolean z1 = (v1 & 8) == 0 ? z : challengeResult0.displayAgeAuth;
        String s8 = (v1 & 16) == 0 ? s2 : challengeResult0.status;
        String s9 = (v1 & 0x20) == 0 ? s3 : challengeResult0.title;
        String s10 = (v1 & 0x40) == 0 ? s4 : challengeResult0.description;
        return (v1 & 0x80) == 0 ? challengeResult0.copy(s6, s7, v2, z1, s8, s9, s10, s5) : challengeResult0.copy(s6, s7, v2, z1, s8, s9, s10, challengeResult0.imageURL);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ChallengeResult)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.challengeCode, ((ChallengeResult)object0).challengeCode)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.linkURL, ((ChallengeResult)object0).linkURL)) {
            return false;
        }
        if(this.score != ((ChallengeResult)object0).score) {
            return false;
        }
        if(this.displayAgeAuth != ((ChallengeResult)object0).displayAgeAuth) {
            return false;
        }
        if(!Intrinsics.areEqual(this.status, ((ChallengeResult)object0).status)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.title, ((ChallengeResult)object0).title)) {
            return false;
        }
        return Intrinsics.areEqual(this.description, ((ChallengeResult)object0).description) ? Intrinsics.areEqual(this.imageURL, ((ChallengeResult)object0).imageURL) : false;
    }

    @NotNull
    public final String getChallengeCode() {
        return this.challengeCode;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final boolean getDisplayAgeAuth() {
        return this.displayAgeAuth;
    }

    @NotNull
    public final String getImageURL() {
        return this.imageURL;
    }

    @NotNull
    public final String getLinkURL() {
        return this.linkURL;
    }

    public final int getScore() {
        return this.score;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override
    public int hashCode() {
        return this.imageURL.hashCode() + b.a(this.description, b.a(this.title, b.a(this.status, c.a(this.displayAgeAuth, a.a(this.score, b.a(this.linkURL, this.challengeCode.hashCode() * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = a5.b.w("ChallengeResult(challengeCode=", this.challengeCode, ", linkURL=", this.linkURL, ", score=");
        stringBuilder0.append(this.score);
        stringBuilder0.append(", displayAgeAuth=");
        stringBuilder0.append(this.displayAgeAuth);
        stringBuilder0.append(", status=");
        androidx.room.a.w(stringBuilder0, this.status, ", title=", this.title, ", description=");
        return a5.b.r(stringBuilder0, this.description, ", imageURL=", this.imageURL, ")");
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel0, int v) {
        Intrinsics.checkNotNullParameter(parcel0, "out");
        parcel0.writeString(this.challengeCode);
        parcel0.writeString(this.linkURL);
        parcel0.writeInt(this.score);
        parcel0.writeInt(((int)this.displayAgeAuth));
        parcel0.writeString(this.status);
        parcel0.writeString(this.title);
        parcel0.writeString(this.description);
        parcel0.writeString(this.imageURL);
    }
}

