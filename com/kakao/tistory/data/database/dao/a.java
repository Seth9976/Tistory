package com.kakao.tistory.data.database.dao;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.kakao.tistory.data.database.entity.AutoSavedModel;

public final class a extends EntityInsertionAdapter {
    public final AutoSaveDao_Impl a;

    public a(AutoSaveDao_Impl autoSaveDao_Impl0, RoomDatabase roomDatabase0) {
        this.a = autoSaveDao_Impl0;
        super(roomDatabase0);
    }

    @Override  // androidx.room.EntityInsertionAdapter
    public final void bind(SupportSQLiteStatement supportSQLiteStatement0, Object object0) {
        AutoSavedModel autoSavedModel0 = (AutoSavedModel)object0;
        supportSQLiteStatement0.bindString(1, autoSavedModel0.getBlogName());
        supportSQLiteStatement0.bindLong(2, autoSavedModel0.getEntryId());
        supportSQLiteStatement0.bindLong(3, autoSavedModel0.getDraftSequence());
        if(autoSavedModel0.getTitle() == null) {
            supportSQLiteStatement0.bindNull(4);
        }
        else {
            supportSQLiteStatement0.bindString(4, autoSavedModel0.getTitle());
        }
        supportSQLiteStatement0.bindString(5, autoSavedModel0.getPostJson());
        if(autoSavedModel0.getThumbnail() == null) {
            supportSQLiteStatement0.bindNull(6);
        }
        else {
            supportSQLiteStatement0.bindString(6, autoSavedModel0.getThumbnail());
        }
        if(autoSavedModel0.getCategoryId() == null) {
            supportSQLiteStatement0.bindNull(7);
        }
        else {
            supportSQLiteStatement0.bindLong(7, ((long)(((int)autoSavedModel0.getCategoryId()))));
        }
        if(autoSavedModel0.getCategoryName() == null) {
            supportSQLiteStatement0.bindNull(8);
        }
        else {
            supportSQLiteStatement0.bindString(8, autoSavedModel0.getCategoryName());
        }
        String s = this.a.c.fromList(autoSavedModel0.getTags());
        if(s == null) {
            supportSQLiteStatement0.bindNull(9);
        }
        else {
            supportSQLiteStatement0.bindString(9, s);
        }
        if(autoSavedModel0.getDaumLikeId() == null) {
            supportSQLiteStatement0.bindNull(10);
        }
        else {
            supportSQLiteStatement0.bindLong(10, ((long)(((int)autoSavedModel0.getDaumLikeId()))));
        }
        if(autoSavedModel0.getDaumLikeName() == null) {
            supportSQLiteStatement0.bindNull(11);
        }
        else {
            supportSQLiteStatement0.bindString(11, autoSavedModel0.getDaumLikeName());
        }
        if(autoSavedModel0.getVisibility() == null) {
            supportSQLiteStatement0.bindNull(12);
        }
        else {
            supportSQLiteStatement0.bindString(12, autoSavedModel0.getVisibility());
        }
        supportSQLiteStatement0.bindLong(13, ((long)autoSavedModel0.getCommentPermit()));
        if(autoSavedModel0.getReserveType() == null) {
            supportSQLiteStatement0.bindNull(14);
        }
        else {
            supportSQLiteStatement0.bindString(14, autoSavedModel0.getReserveType());
        }
        if(autoSavedModel0.getReserveTime() == null) {
            supportSQLiteStatement0.bindNull(15);
        }
        else {
            supportSQLiteStatement0.bindLong(15, ((long)autoSavedModel0.getReserveTime()));
        }
        if(autoSavedModel0.getPasswordString() == null) {
            supportSQLiteStatement0.bindNull(16);
        }
        else {
            supportSQLiteStatement0.bindString(16, autoSavedModel0.getPasswordString());
        }
        if(autoSavedModel0.getPublished() == null) {
            supportSQLiteStatement0.bindNull(17);
        }
        else {
            supportSQLiteStatement0.bindLong(17, ((long)autoSavedModel0.getPublished()));
        }
        if(autoSavedModel0.getUpdatedAt() == null) {
            supportSQLiteStatement0.bindNull(18);
            return;
        }
        supportSQLiteStatement0.bindLong(18, ((long)autoSavedModel0.getUpdatedAt()));
    }

    @Override  // androidx.room.SharedSQLiteStatement
    public final String createQuery() {
        return "INSERT OR REPLACE INTO `auto_save_table` (`blogName`,`entryId`,`draftSequence`,`title`,`postJson`,`thumbnail`,`categoryId`,`categoryName`,`tags`,`daumLikeId`,`daumLikeName`,`visibility`,`commentPermit`,`reserveType`,`reserveTime`,`passwordString`,`published`,`updatedAt`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}

