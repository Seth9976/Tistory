package com.kakao.tistory.domain.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\u0005\u0012\b\b\u0002\u0010\t\u001A\u00020\u0005\u0012\b\b\u0002\u0010\n\u001A\u00020\u000B¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001A\u00020\u0005HÆ\u0003J\t\u0010\u001A\u001A\u00020\u0005HÆ\u0003J\t\u0010\u001B\u001A\u00020\u0005HÆ\u0003J\t\u0010\u001C\u001A\u00020\u0005HÆ\u0003J\t\u0010\u001D\u001A\u00020\u000BHÆ\u0003JO\u0010\u001E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u000BHÆ\u0001J\u0013\u0010\u001F\u001A\u00020\u00032\b\u0010 \u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001A\u00020\"HÖ\u0001J\t\u0010#\u001A\u00020$HÖ\u0001R\u0011\u0010\t\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000ER\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001A\u00020\u000B¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u000ER\u0011\u0010\b\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u000ER\u0011\u0010\u0007\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u000E¨\u0006%"}, d2 = {"Lcom/kakao/tistory/domain/entity/PushSetting;", "", "enable", "", "comment", "Lcom/kakao/tistory/domain/entity/PushSettingItem;", "invite", "subscription", "newEntry", "challenge", "etiquette", "Lcom/kakao/tistory/domain/entity/Etiquette;", "(ZLcom/kakao/tistory/domain/entity/PushSettingItem;Lcom/kakao/tistory/domain/entity/PushSettingItem;Lcom/kakao/tistory/domain/entity/PushSettingItem;Lcom/kakao/tistory/domain/entity/PushSettingItem;Lcom/kakao/tistory/domain/entity/PushSettingItem;Lcom/kakao/tistory/domain/entity/Etiquette;)V", "getChallenge", "()Lcom/kakao/tistory/domain/entity/PushSettingItem;", "getComment", "getEnable", "()Z", "getEtiquette", "()Lcom/kakao/tistory/domain/entity/Etiquette;", "getInvite", "getNewEntry", "getSubscription", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PushSetting {
    @NotNull
    private final PushSettingItem challenge;
    @NotNull
    private final PushSettingItem comment;
    private final boolean enable;
    @NotNull
    private final Etiquette etiquette;
    @NotNull
    private final PushSettingItem invite;
    @NotNull
    private final PushSettingItem newEntry;
    @NotNull
    private final PushSettingItem subscription;

    public PushSetting() {
        this(false, null, null, null, null, null, null, 0x7F, null);
    }

    public PushSetting(boolean z, @NotNull PushSettingItem pushSettingItem0, @NotNull PushSettingItem pushSettingItem1, @NotNull PushSettingItem pushSettingItem2, @NotNull PushSettingItem pushSettingItem3, @NotNull PushSettingItem pushSettingItem4, @NotNull Etiquette etiquette0) {
        Intrinsics.checkNotNullParameter(pushSettingItem0, "comment");
        Intrinsics.checkNotNullParameter(pushSettingItem1, "invite");
        Intrinsics.checkNotNullParameter(pushSettingItem2, "subscription");
        Intrinsics.checkNotNullParameter(pushSettingItem3, "newEntry");
        Intrinsics.checkNotNullParameter(pushSettingItem4, "challenge");
        Intrinsics.checkNotNullParameter(etiquette0, "etiquette");
        super();
        this.enable = z;
        this.comment = pushSettingItem0;
        this.invite = pushSettingItem1;
        this.subscription = pushSettingItem2;
        this.newEntry = pushSettingItem3;
        this.challenge = pushSettingItem4;
        this.etiquette = etiquette0;
    }

    public PushSetting(boolean z, PushSettingItem pushSettingItem0, PushSettingItem pushSettingItem1, PushSettingItem pushSettingItem2, PushSettingItem pushSettingItem3, PushSettingItem pushSettingItem4, Etiquette etiquette0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v & 1) == 0 ? z : true), ((v & 2) == 0 ? pushSettingItem0 : new PushSettingItem(false, 1, null)), ((v & 4) == 0 ? pushSettingItem1 : new PushSettingItem(false, 1, null)), ((v & 8) == 0 ? pushSettingItem2 : new PushSettingItem(false, 1, null)), ((v & 16) == 0 ? pushSettingItem3 : new PushSettingItem(false, 1, null)), ((v & 0x20) == 0 ? pushSettingItem4 : new PushSettingItem(false, 1, null)), ((v & 0x40) == 0 ? etiquette0 : new Etiquette(false, null, null, 7, null)));
    }

    public final boolean component1() {
        return this.enable;
    }

    @NotNull
    public final PushSettingItem component2() {
        return this.comment;
    }

    @NotNull
    public final PushSettingItem component3() {
        return this.invite;
    }

    @NotNull
    public final PushSettingItem component4() {
        return this.subscription;
    }

    @NotNull
    public final PushSettingItem component5() {
        return this.newEntry;
    }

    @NotNull
    public final PushSettingItem component6() {
        return this.challenge;
    }

    @NotNull
    public final Etiquette component7() {
        return this.etiquette;
    }

    @NotNull
    public final PushSetting copy(boolean z, @NotNull PushSettingItem pushSettingItem0, @NotNull PushSettingItem pushSettingItem1, @NotNull PushSettingItem pushSettingItem2, @NotNull PushSettingItem pushSettingItem3, @NotNull PushSettingItem pushSettingItem4, @NotNull Etiquette etiquette0) {
        Intrinsics.checkNotNullParameter(pushSettingItem0, "comment");
        Intrinsics.checkNotNullParameter(pushSettingItem1, "invite");
        Intrinsics.checkNotNullParameter(pushSettingItem2, "subscription");
        Intrinsics.checkNotNullParameter(pushSettingItem3, "newEntry");
        Intrinsics.checkNotNullParameter(pushSettingItem4, "challenge");
        Intrinsics.checkNotNullParameter(etiquette0, "etiquette");
        return new PushSetting(z, pushSettingItem0, pushSettingItem1, pushSettingItem2, pushSettingItem3, pushSettingItem4, etiquette0);
    }

    public static PushSetting copy$default(PushSetting pushSetting0, boolean z, PushSettingItem pushSettingItem0, PushSettingItem pushSettingItem1, PushSettingItem pushSettingItem2, PushSettingItem pushSettingItem3, PushSettingItem pushSettingItem4, Etiquette etiquette0, int v, Object object0) {
        if((v & 1) != 0) {
            z = pushSetting0.enable;
        }
        if((v & 2) != 0) {
            pushSettingItem0 = pushSetting0.comment;
        }
        if((v & 4) != 0) {
            pushSettingItem1 = pushSetting0.invite;
        }
        if((v & 8) != 0) {
            pushSettingItem2 = pushSetting0.subscription;
        }
        if((v & 16) != 0) {
            pushSettingItem3 = pushSetting0.newEntry;
        }
        if((v & 0x20) != 0) {
            pushSettingItem4 = pushSetting0.challenge;
        }
        if((v & 0x40) != 0) {
            etiquette0 = pushSetting0.etiquette;
        }
        return pushSetting0.copy(z, pushSettingItem0, pushSettingItem1, pushSettingItem2, pushSettingItem3, pushSettingItem4, etiquette0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PushSetting)) {
            return false;
        }
        if(this.enable != ((PushSetting)object0).enable) {
            return false;
        }
        if(!Intrinsics.areEqual(this.comment, ((PushSetting)object0).comment)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.invite, ((PushSetting)object0).invite)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.subscription, ((PushSetting)object0).subscription)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.newEntry, ((PushSetting)object0).newEntry)) {
            return false;
        }
        return Intrinsics.areEqual(this.challenge, ((PushSetting)object0).challenge) ? Intrinsics.areEqual(this.etiquette, ((PushSetting)object0).etiquette) : false;
    }

    @NotNull
    public final PushSettingItem getChallenge() {
        return this.challenge;
    }

    @NotNull
    public final PushSettingItem getComment() {
        return this.comment;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    public final Etiquette getEtiquette() {
        return this.etiquette;
    }

    @NotNull
    public final PushSettingItem getInvite() {
        return this.invite;
    }

    @NotNull
    public final PushSettingItem getNewEntry() {
        return this.newEntry;
    }

    @NotNull
    public final PushSettingItem getSubscription() {
        return this.subscription;
    }

    @Override
    public int hashCode() {
        return this.etiquette.hashCode() + (this.challenge.hashCode() + (this.newEntry.hashCode() + (this.subscription.hashCode() + (this.invite.hashCode() + (this.comment.hashCode() + Boolean.hashCode(this.enable) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "PushSetting(enable=" + this.enable + ", comment=" + this.comment + ", invite=" + this.invite + ", subscription=" + this.subscription + ", newEntry=" + this.newEntry + ", challenge=" + this.challenge + ", etiquette=" + this.etiquette + ")";
    }
}

