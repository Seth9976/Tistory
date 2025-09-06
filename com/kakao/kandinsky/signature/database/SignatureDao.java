package com.kakao.kandinsky.signature.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

@Dao
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\'J\b\u0010\u0006\u001A\u00020\u0003H\'J\u000E\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\t0\bH\'J\u0014\u0010\n\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000BH\'J\u0010\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\tH\'J\u0010\u0010\u000F\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\tH\u0017¨\u0006\u0010"}, d2 = {"Lcom/kakao/kandinsky/signature/database/SignatureDao;", "", "delete", "", "id", "", "deleteOldData", "getAll", "", "Lcom/kakao/kandinsky/signature/database/SignatureEntity;", "getAllFlow", "Lkotlinx/coroutines/flow/Flow;", "insert", "", "signature", "insertOrUpdate", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface SignatureDao {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Transaction
        public static int insertOrUpdate(@NotNull SignatureDao signatureDao0, @NotNull SignatureEntity signatureEntity0) {
            Intrinsics.checkNotNullParameter(signatureEntity0, "signature");
            long v = signatureDao0.getAll().contains(signatureEntity0) ? signatureDao0.insert(signatureEntity0) : signatureDao0.insert(SignatureEntity.copy$default(signatureEntity0, 0, null, 0L, null, 0.0f, 0.0f, 0.0f, 0.0f, null, 0.0f, 0.0f, 0, 0.0f, 0, 0.0f, null, null, false, false, false, 0, null, false, 0x7FFFFE, null));
            signatureDao0.deleteOldData();
            return (int)v;
        }
    }

    @Query("DELETE FROM signature WHERE uid = :id")
    void delete(int arg1);

    @Query("DELETE FROM signature where updatedTime NOT IN (SELECT updatedTime FROM signature ORDER BY updatedTime DESC LIMIT 100)")
    void deleteOldData();

    @Query("SELECT * FROM signature ORDER BY updatedTime DESC")
    @NotNull
    List getAll();

    @Query("SELECT * FROM signature ORDER BY updatedTime DESC")
    @NotNull
    Flow getAllFlow();

    @Insert(onConflict = 1)
    long insert(@NotNull SignatureEntity arg1);

    @Transaction
    int insertOrUpdate(@NotNull SignatureEntity arg1);
}

