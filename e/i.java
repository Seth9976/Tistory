package e;

import androidx.room.SharedSQLiteStatement;
import com.kakao.kandinsky.history.HistoryDatabase;

public final class i extends SharedSQLiteStatement {
    public i(HistoryDatabase historyDatabase0) {
        super(historyDatabase0);
    }

    @Override  // androidx.room.SharedSQLiteStatement
    public final String createQuery() {
        return "DELETE FROM history WHERE lastUpdatedTime < ?";
    }
}

