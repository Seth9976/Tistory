package m0;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

public abstract class v {
    public static boolean A(Object object0) {
        return object0 instanceof JoinOrSplitGesture;
    }

    public static boolean B(Object object0) {
        return object0 instanceof SelectGesture;
    }

    public static int a(DeleteGesture deleteGesture0) {
        return deleteGesture0.getGranularity();
    }

    public static int b(DeleteRangeGesture deleteRangeGesture0) {
        return deleteRangeGesture0.getGranularity();
    }

    public static int c(SelectGesture selectGesture0) {
        return selectGesture0.getGranularity();
    }

    public static int d(SelectRangeGesture selectRangeGesture0) {
        return selectRangeGesture0.getGranularity();
    }

    public static PointF e(InsertGesture insertGesture0) {
        return insertGesture0.getInsertionPoint();
    }

    public static PointF f(JoinOrSplitGesture joinOrSplitGesture0) {
        return joinOrSplitGesture0.getJoinOrSplitPoint();
    }

    public static PointF g(RemoveSpaceGesture removeSpaceGesture0) {
        return removeSpaceGesture0.getStartPoint();
    }

    public static RectF h(DeleteGesture deleteGesture0) {
        return deleteGesture0.getDeletionArea();
    }

    public static RectF i(DeleteRangeGesture deleteRangeGesture0) {
        return deleteRangeGesture0.getDeletionStartArea();
    }

    public static RectF j(SelectGesture selectGesture0) {
        return selectGesture0.getSelectionArea();
    }

    public static RectF k(SelectRangeGesture selectRangeGesture0) {
        return selectRangeGesture0.getSelectionEndArea();
    }

    public static DeleteRangeGesture l(Object object0) [...] // Inlined contents

    public static HandwritingGesture m(Object object0) [...] // Inlined contents

    public static InsertGesture n(Object object0) [...] // Inlined contents

    public static JoinOrSplitGesture o(Object object0) [...] // Inlined contents

    public static RemoveSpaceGesture p(Object object0) [...] // Inlined contents

    public static SelectGesture q(Object object0) [...] // Inlined contents

    public static SelectRangeGesture r(Object object0) [...] // Inlined contents

    public static String t(HandwritingGesture handwritingGesture0) {
        return handwritingGesture0.getFallbackText();
    }

    public static String u(InsertGesture insertGesture0) {
        return insertGesture0.getTextToInsert();
    }

    public static boolean v(Object object0) {
        return object0 instanceof DeleteRangeGesture;
    }

    public static PointF w(RemoveSpaceGesture removeSpaceGesture0) {
        return removeSpaceGesture0.getEndPoint();
    }

    public static RectF x(DeleteRangeGesture deleteRangeGesture0) {
        return deleteRangeGesture0.getDeletionEndArea();
    }

    public static boolean y(Object object0) {
        return object0 instanceof InsertGesture;
    }

    public static boolean z(Object object0) {
        return object0 instanceof RemoveSpaceGesture;
    }
}

