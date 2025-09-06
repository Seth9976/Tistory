package com.kakao.tistory.data.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.kakao.tistory.data.database.entity.SearchKeyword;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Dao
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\'J\u0010\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0006H\'J\u000E\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\t0\bH\'J\u001E\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u0006H\'J\u0017\u0010\u000E\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u000B\u001A\u00020\fH\'¢\u0006\u0002\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u00032\u0006\u0010\u0011\u001A\u00020\tH\'J\u0010\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\fH\'J\u0010\u0010\u0013\u001A\u00020\u00032\u0006\u0010\u0011\u001A\u00020\tH\'¨\u0006\u0014"}, d2 = {"Lcom/kakao/tistory/data/database/dao/SearchDao;", "", "clearAll", "", "clearOldKeywords", "from", "", "getAll", "", "Lcom/kakao/tistory/data/database/entity/SearchKeyword;", "getItems", "keyword", "", "limit", "getTargetId", "(Ljava/lang/String;)Ljava/lang/Integer;", "insertKeyword", "item", "removeKeyword", "updateKeyword", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface SearchDao {
    @Query("DELETE FROM searchkeyword")
    void clearAll();

    @Query("DELETE FROM searchkeyword where date <= (SELECT date FROM searchkeyword Order by date DESC  limit :from,1)")
    void clearOldKeywords(int arg1);

    @Query("SELECT * FROM searchkeyword Order by date DESC")
    @NotNull
    List getAll();

    @Query("SELECT * FROM searchkeyword where keyword LIKE \'%\'||:keyword||\'%\' Order by date DESC limit :limit")
    @NotNull
    List getItems(@NotNull String arg1, int arg2);

    @Query("SELECT id FROM searchkeyword where keyword=:keyword")
    @Nullable
    Integer getTargetId(@NotNull String arg1);

    @Insert(onConflict = 5)
    void insertKeyword(@NotNull SearchKeyword arg1);

    @Query("DELETE FROM searchkeyword where keyword=:keyword")
    void removeKeyword(@NotNull String arg1);

    @Update(onConflict = 5)
    void updateKeyword(@NotNull SearchKeyword arg1);
}

