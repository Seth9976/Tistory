package com.kakao.tistory.domain.entity.autosave;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\b\b\u0002\u0010\b\u001A\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001A\u00020\tHÆ\u0003J1\u0010\u0019\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\tHÆ\u0001J\u0013\u0010\u001A\u001A\u00020\t2\b\u0010\u001B\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001C\u001A\u00020\u001DHÖ\u0001J\t\u0010\u001E\u001A\u00020\u001FHÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u001A\u0010\b\u001A\u00020\tX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/kakao/tistory/domain/entity/autosave/EditEntryEntity;", "", "key", "Lcom/kakao/tistory/domain/entity/autosave/EntryKeyEntity;", "entry", "Lcom/kakao/tistory/domain/entity/autosave/EntryEntity;", "setting", "Lcom/kakao/tistory/domain/entity/autosave/EntrySettingEntity;", "fromLocal", "", "(Lcom/kakao/tistory/domain/entity/autosave/EntryKeyEntity;Lcom/kakao/tistory/domain/entity/autosave/EntryEntity;Lcom/kakao/tistory/domain/entity/autosave/EntrySettingEntity;Z)V", "getEntry", "()Lcom/kakao/tistory/domain/entity/autosave/EntryEntity;", "getFromLocal", "()Z", "setFromLocal", "(Z)V", "getKey", "()Lcom/kakao/tistory/domain/entity/autosave/EntryKeyEntity;", "getSetting", "()Lcom/kakao/tistory/domain/entity/autosave/EntrySettingEntity;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EditEntryEntity {
    @NotNull
    private final EntryEntity entry;
    private boolean fromLocal;
    @NotNull
    private final EntryKeyEntity key;
    @NotNull
    private final EntrySettingEntity setting;

    public EditEntryEntity(@NotNull EntryKeyEntity entryKeyEntity0, @NotNull EntryEntity entryEntity0, @NotNull EntrySettingEntity entrySettingEntity0, boolean z) {
        Intrinsics.checkNotNullParameter(entryKeyEntity0, "key");
        Intrinsics.checkNotNullParameter(entryEntity0, "entry");
        Intrinsics.checkNotNullParameter(entrySettingEntity0, "setting");
        super();
        this.key = entryKeyEntity0;
        this.entry = entryEntity0;
        this.setting = entrySettingEntity0;
        this.fromLocal = z;
    }

    public EditEntryEntity(EntryKeyEntity entryKeyEntity0, EntryEntity entryEntity0, EntrySettingEntity entrySettingEntity0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 8) != 0) {
            z = false;
        }
        this(entryKeyEntity0, entryEntity0, entrySettingEntity0, z);
    }

    @NotNull
    public final EntryKeyEntity component1() {
        return this.key;
    }

    @NotNull
    public final EntryEntity component2() {
        return this.entry;
    }

    @NotNull
    public final EntrySettingEntity component3() {
        return this.setting;
    }

    public final boolean component4() {
        return this.fromLocal;
    }

    @NotNull
    public final EditEntryEntity copy(@NotNull EntryKeyEntity entryKeyEntity0, @NotNull EntryEntity entryEntity0, @NotNull EntrySettingEntity entrySettingEntity0, boolean z) {
        Intrinsics.checkNotNullParameter(entryKeyEntity0, "key");
        Intrinsics.checkNotNullParameter(entryEntity0, "entry");
        Intrinsics.checkNotNullParameter(entrySettingEntity0, "setting");
        return new EditEntryEntity(entryKeyEntity0, entryEntity0, entrySettingEntity0, z);
    }

    public static EditEntryEntity copy$default(EditEntryEntity editEntryEntity0, EntryKeyEntity entryKeyEntity0, EntryEntity entryEntity0, EntrySettingEntity entrySettingEntity0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            entryKeyEntity0 = editEntryEntity0.key;
        }
        if((v & 2) != 0) {
            entryEntity0 = editEntryEntity0.entry;
        }
        if((v & 4) != 0) {
            entrySettingEntity0 = editEntryEntity0.setting;
        }
        if((v & 8) != 0) {
            z = editEntryEntity0.fromLocal;
        }
        return editEntryEntity0.copy(entryKeyEntity0, entryEntity0, entrySettingEntity0, z);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof EditEntryEntity)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.key, ((EditEntryEntity)object0).key)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.entry, ((EditEntryEntity)object0).entry)) {
            return false;
        }
        return Intrinsics.areEqual(this.setting, ((EditEntryEntity)object0).setting) ? this.fromLocal == ((EditEntryEntity)object0).fromLocal : false;
    }

    @NotNull
    public final EntryEntity getEntry() {
        return this.entry;
    }

    public final boolean getFromLocal() {
        return this.fromLocal;
    }

    @NotNull
    public final EntryKeyEntity getKey() {
        return this.key;
    }

    @NotNull
    public final EntrySettingEntity getSetting() {
        return this.setting;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.fromLocal) + (this.setting.hashCode() + (this.entry.hashCode() + this.key.hashCode() * 0x1F) * 0x1F) * 0x1F;
    }

    public final void setFromLocal(boolean z) {
        this.fromLocal = z;
    }

    @Override
    @NotNull
    public String toString() {
        return "EditEntryEntity(key=" + this.key + ", entry=" + this.entry + ", setting=" + this.setting + ", fromLocal=" + this.fromLocal + ")";
    }
}

