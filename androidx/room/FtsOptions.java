package androidx.room;

import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\b\tR\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Landroidx/room/FtsOptions;", "", "", "TOKENIZER_SIMPLE", "Ljava/lang/String;", "TOKENIZER_PORTER", "TOKENIZER_ICU", "TOKENIZER_UNICODE61", "MatchInfo", "Order", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FtsOptions {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/FtsOptions$MatchInfo;", "", "FTS3", "FTS4", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum MatchInfo {
        FTS3,
        FTS4;

    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/FtsOptions$Order;", "", "ASC", "DESC", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum Order {
        ASC,
        DESC;

    }

    @NotNull
    public static final FtsOptions INSTANCE = null;
    @NotNull
    public static final String TOKENIZER_ICU = "icu";
    @NotNull
    public static final String TOKENIZER_PORTER = "porter";
    @NotNull
    public static final String TOKENIZER_SIMPLE = "simple";
    @RequiresApi(21)
    @NotNull
    public static final String TOKENIZER_UNICODE61 = "unicode61";

    static {
        FtsOptions.INSTANCE = new FtsOptions();  // 初始化器: Ljava/lang/Object;-><init>()V
    }
}

