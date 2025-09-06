package com.kakao.kandinsky.signature.database;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Database(entities = {SignatureEntity.class}, version = 3)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001A\u00020\u0004H&¨\u0006\u0005"}, d2 = {"Lcom/kakao/kandinsky/signature/database/SignatureDatabase;", "Landroidx/room/RoomDatabase;", "()V", "signatureDao", "Lcom/kakao/kandinsky/signature/database/SignatureDao;", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class SignatureDatabase extends RoomDatabase {
    public static final int $stable;

    @NotNull
    public abstract SignatureDao signatureDao();
}

