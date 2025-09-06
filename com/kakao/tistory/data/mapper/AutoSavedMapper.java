package com.kakao.tistory.data.mapper;

import com.kakao.tistory.data.database.entity.AutoSavedModel;
import com.kakao.tistory.domain.entity.autosave.EditEntryEntity;
import com.kakao.tistory.domain.entity.autosave.EntryEntity;
import com.kakao.tistory.domain.entity.autosave.EntryKeyEntity;
import com.kakao.tistory.domain.entity.autosave.EntrySettingEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000E\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006J\u000E\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/kakao/tistory/data/mapper/AutoSavedMapper;", "", "()V", "mapToEntity", "Lcom/kakao/tistory/domain/entity/autosave/EditEntryEntity;", "model", "Lcom/kakao/tistory/data/database/entity/AutoSavedModel;", "mapToModel", "entity", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class AutoSavedMapper {
    @NotNull
    public final EditEntryEntity mapToEntity(@NotNull AutoSavedModel autoSavedModel0) {
        Intrinsics.checkNotNullParameter(autoSavedModel0, "model");
        return new EditEntryEntity(new EntryKeyEntity(autoSavedModel0.getBlogName(), autoSavedModel0.getEntryId(), autoSavedModel0.getDraftSequence()), new EntryEntity(autoSavedModel0.getTitle(), autoSavedModel0.getPostJson(), autoSavedModel0.getThumbnail()), new EntrySettingEntity(autoSavedModel0.getVisibility(), autoSavedModel0.getTags(), autoSavedModel0.getCommentPermit(), autoSavedModel0.getReserveType(), autoSavedModel0.getReserveTime(), autoSavedModel0.getCategoryId(), autoSavedModel0.getCategoryName(), autoSavedModel0.getDaumLikeId(), autoSavedModel0.getDaumLikeName(), autoSavedModel0.getPasswordString(), autoSavedModel0.getPublished(), autoSavedModel0.getUpdatedAt()), false, 8, null);
    }

    @NotNull
    public final AutoSavedModel mapToModel(@NotNull EditEntryEntity editEntryEntity0) {
        Intrinsics.checkNotNullParameter(editEntryEntity0, "entity");
        String s = editEntryEntity0.getKey().getBlogName();
        long v = editEntryEntity0.getKey().getEntryId();
        Long long0 = editEntryEntity0.getKey().getDraftSequence();
        return long0 == null ? new AutoSavedModel(s, v, 0L, editEntryEntity0.getEntry().getTitle(), editEntryEntity0.getEntry().getPostJson(), editEntryEntity0.getEntry().getThumbnail(), editEntryEntity0.getSetting().getCategoryId(), editEntryEntity0.getSetting().getCategoryName(), editEntryEntity0.getSetting().getTags(), editEntryEntity0.getSetting().getDaumLikeId(), editEntryEntity0.getSetting().getDaumLikeName(), editEntryEntity0.getSetting().getVisibility(), editEntryEntity0.getSetting().getCommentPermit(), editEntryEntity0.getSetting().getReserveType(), editEntryEntity0.getSetting().getReserveTime(), editEntryEntity0.getSetting().getPasswordString(), editEntryEntity0.getSetting().getPublished(), editEntryEntity0.getSetting().getUpdatedAt()) : new AutoSavedModel(s, v, ((long)long0), editEntryEntity0.getEntry().getTitle(), editEntryEntity0.getEntry().getPostJson(), editEntryEntity0.getEntry().getThumbnail(), editEntryEntity0.getSetting().getCategoryId(), editEntryEntity0.getSetting().getCategoryName(), editEntryEntity0.getSetting().getTags(), editEntryEntity0.getSetting().getDaumLikeId(), editEntryEntity0.getSetting().getDaumLikeName(), editEntryEntity0.getSetting().getVisibility(), editEntryEntity0.getSetting().getCommentPermit(), editEntryEntity0.getSetting().getReserveType(), editEntryEntity0.getSetting().getReserveTime(), editEntryEntity0.getSetting().getPasswordString(), editEntryEntity0.getSetting().getPublished(), editEntryEntity0.getSetting().getUpdatedAt());
    }
}

