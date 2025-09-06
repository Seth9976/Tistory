package e;

import androidx.room.SharedSQLiteStatement;
import com.kakao.kandinsky.history.HistoryDatabase;

public final class j extends SharedSQLiteStatement {
    public j(HistoryDatabase historyDatabase0) {
        super(historyDatabase0);
    }

    @Override  // androidx.room.SharedSQLiteStatement
    public final String createQuery() {
        return "DELETE FROM history WHERE uri = ? AND id = ? AND step > ?";
    }
}

