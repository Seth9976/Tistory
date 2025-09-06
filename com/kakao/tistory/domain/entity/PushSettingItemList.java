package com.kakao.tistory.domain.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J1\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/domain/entity/PushSettingItemList;", "", "comment", "Lcom/kakao/tistory/domain/entity/PushSettingItem;", "invite", "subscription", "newEntry", "(Lcom/kakao/tistory/domain/entity/PushSettingItem;Lcom/kakao/tistory/domain/entity/PushSettingItem;Lcom/kakao/tistory/domain/entity/PushSettingItem;Lcom/kakao/tistory/domain/entity/PushSettingItem;)V", "getComment", "()Lcom/kakao/tistory/domain/entity/PushSettingItem;", "getInvite", "getNewEntry", "getSubscription", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PushSettingItemList {
    @NotNull
    private final PushSettingItem comment;
    @NotNull
    private final PushSettingItem invite;
    @NotNull
    private final PushSettingItem newEntry;
    @NotNull
    private final PushSettingItem subscription;

    public PushSettingItemList() {
        this(null, null, null, null, 15, null);
    }

    public PushSettingItemList(@NotNull PushSettingItem pushSettingItem0, @NotNull PushSettingItem pushSettingItem1, @NotNull PushSettingItem pushSettingItem2, @NotNull PushSettingItem pushSettingItem3) {
        Intrinsics.checkNotNullParameter(pushSettingItem0, "comment");
        Intrinsics.checkNotNullParameter(pushSettingItem1, "invite");
        Intrinsics.checkNotNullParameter(pushSettingItem2, "subscription");
        Intrinsics.checkNotNullParameter(pushSettingItem3, "newEntry");
        super();
        this.comment = pushSettingItem0;
        this.invite = pushSettingItem1;
        this.subscription = pushSettingItem2;
        this.newEntry = pushSettingItem3;
    }

    public PushSettingItemList(PushSettingItem pushSettingItem0, PushSettingItem pushSettingItem1, PushSettingItem pushSettingItem2, PushSettingItem pushSettingItem3, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            pushSettingItem0 = new PushSettingItem(false, 1, null);
        }
        if((v & 2) != 0) {
            pushSettingItem1 = new PushSettingItem(false, 1, null);
        }
        if((v & 4) != 0) {
            pushSettingItem2 = new PushSettingItem(false, 1, null);
        }
        if((v & 8) != 0) {
            pushSettingItem3 = new PushSettingItem(false, 1, null);
        }
        this(pushSettingItem0, pushSettingItem1, pushSettingItem2, pushSettingItem3);
    }

    @NotNull
    public final PushSettingItem component1() {
        return this.comment;
    }

    @NotNull
    public final PushSettingItem component2() {
        return this.invite;
    }

    @NotNull
    public final PushSettingItem component3() {
        return this.subscription;
    }

    @NotNull
    public final PushSettingItem component4() {
        return this.newEntry;
    }

    @NotNull
    public final PushSettingItemList copy(@NotNull PushSettingItem pushSettingItem0, @NotNull PushSettingItem pushSettingItem1, @NotNull PushSettingItem pushSettingItem2, @NotNull PushSettingItem pushSettingItem3) {
        Intrinsics.checkNotNullParameter(pushSettingItem0, "comment");
        Intrinsics.checkNotNullParameter(pushSettingItem1, "invite");
        Intrinsics.checkNotNullParameter(pushSettingItem2, "subscription");
        Intrinsics.checkNotNullParameter(pushSettingItem3, "newEntry");
        return new PushSettingItemList(pushSettingItem0, pushSettingItem1, pushSettingItem2, pushSettingItem3);
    }

    public static PushSettingItemList copy$default(PushSettingItemList pushSettingItemList0, PushSettingItem pushSettingItem0, PushSettingItem pushSettingItem1, PushSettingItem pushSettingItem2, PushSettingItem pushSettingItem3, int v, Object object0) {
        if((v & 1) != 0) {
            pushSettingItem0 = pushSettingItemList0.comment;
        }
        if((v & 2) != 0) {
            pushSettingItem1 = pushSettingItemList0.invite;
        }
        if((v & 4) != 0) {
            pushSettingItem2 = pushSettingItemList0.subscription;
        }
        if((v & 8) != 0) {
            pushSettingItem3 = pushSettingItemList0.newEntry;
        }
        return pushSettingItemList0.copy(pushSettingItem0, pushSettingItem1, pushSettingItem2, pushSettingItem3);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PushSettingItemList)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.comment, ((PushSettingItemList)object0).comment)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.invite, ((PushSettingItemList)object0).invite)) {
            return false;
        }
        return Intrinsics.areEqual(this.subscription, ((PushSettingItemList)object0).subscription) ? Intrinsics.areEqual(this.newEntry, ((PushSettingItemList)object0).newEntry) : false;
    }

    @NotNull
    public final PushSettingItem getComment() {
        return this.comment;
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
        return this.newEntry.hashCode() + (this.subscription.hashCode() + (this.invite.hashCode() + this.comment.hashCode() * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "PushSettingItemList(comment=" + this.comment + ", invite=" + this.invite + ", subscription=" + this.subscription + ", newEntry=" + this.newEntry + ")";
    }
}

