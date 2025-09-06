package com.kakao.tistory.domain.entity.common;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000B\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001B\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\f\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u001F\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u00032\b\u0010\u000F\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/domain/entity/common/CheckModel;", "", "enable", "", "message", "", "(ZLjava/lang/String;)V", "getEnable", "()Z", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CheckModel {
    @SerializedName(alternate = {"available", "valid", "success"}, value = "enable")
    private final boolean enable;
    @Nullable
    private final String message;

    public CheckModel() {
        this(false, null, 3, null);
    }

    public CheckModel(boolean z, @Nullable String s) {
        this.enable = z;
        this.message = s;
    }

    public CheckModel(boolean z, String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            s = null;
        }
        this(z, s);
    }

    public final boolean component1() {
        return this.enable;
    }

    @Nullable
    public final String component2() {
        return this.message;
    }

    @NotNull
    public final CheckModel copy(boolean z, @Nullable String s) {
        return new CheckModel(z, s);
    }

    public static CheckModel copy$default(CheckModel checkModel0, boolean z, String s, int v, Object object0) {
        if((v & 1) != 0) {
            z = checkModel0.enable;
        }
        if((v & 2) != 0) {
            s = checkModel0.message;
        }
        return checkModel0.copy(z, s);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CheckModel)) {
            return false;
        }
        return this.enable == ((CheckModel)object0).enable ? Intrinsics.areEqual(this.message, ((CheckModel)object0).message) : false;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Override
    public int hashCode() {
        int v = Boolean.hashCode(this.enable);
        return this.message == null ? v * 0x1F : v * 0x1F + this.message.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "CheckModel(enable=" + this.enable + ", message=" + this.message + ")";
    }
}

