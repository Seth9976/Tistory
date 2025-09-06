package androidx.room;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000B\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000B\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/room/RoomMasterTable;", "", "", "hash", "createInsertQuery", "(Ljava/lang/String;)Ljava/lang/String;", "TABLE_NAME", "Ljava/lang/String;", "NAME", "DEFAULT_ID", "CREATE_QUERY", "READ_QUERY", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RoomMasterTable {
    @NotNull
    public static final String CREATE_QUERY = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)";
    @NotNull
    public static final String DEFAULT_ID = "42";
    @NotNull
    public static final RoomMasterTable INSTANCE = null;
    @NotNull
    public static final String NAME = "room_master_table";
    @NotNull
    public static final String READ_QUERY = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";
    @NotNull
    public static final String TABLE_NAME = "room_master_table";

    static {
        RoomMasterTable.INSTANCE = new RoomMasterTable();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @JvmStatic
    @NotNull
    public static final String createInsertQuery(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'" + s + "\')";
    }
}

