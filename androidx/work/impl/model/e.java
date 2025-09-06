package androidx.work.impl.model;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;

public final class e extends SharedSQLiteStatement {
    public final int e;

    public e(RoomDatabase roomDatabase0, int v) {
        this.e = v;
        super(roomDatabase0);
    }

    @Override  // androidx.room.SharedSQLiteStatement
    public final String createQuery() {
        switch(this.e) {
            case 0: {
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            }
            case 1: {
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            }
            case 2: {
                return "DELETE from WorkProgress where work_spec_id=?";
            }
            case 3: {
                return "DELETE FROM WorkProgress";
            }
            case 4: {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
            case 5: {
                return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
            }
            case 6: {
                return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
            }
            case 7: {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
            case 8: {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
            case 9: {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
            case 10: {
                return "UPDATE workspec SET generation=generation+1 WHERE id=?";
            }
            case 11: {
                return "UPDATE workspec SET stop_reason=? WHERE id=?";
            }
            case 12: {
                return "DELETE FROM workspec WHERE id=?";
            }
            case 13: {
                return "UPDATE workspec SET state=? WHERE id=?";
            }
            case 14: {
                return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
            }
            case 15: {
                return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
            }
            case 16: {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
            case 17: {
                return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
            }
            case 18: {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
            case 19: {
                return "DELETE FROM worktag WHERE work_spec_id=?";
            }
            case 20: {
                return "DELETE FROM signature WHERE uid = ?";
            }
            default: {
                return "DELETE FROM signature where updatedTime NOT IN (SELECT updatedTime FROM signature ORDER BY updatedTime DESC LIMIT 100)";
            }
        }
    }
}

