package androidx.compose.foundation.text.selection;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSize;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.framework.FrameworkSQLiteProgram;
import com.kakao.kandinsky.gesture.GestureInteraction;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a1 extends Lambda implements Function4 {
    public final int w;
    public final Object x;

    public a1(Object object0, int v) {
        this.w = v;
        this.x = object0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        switch(this.w) {
            case 0: {
                boolean z = ((Boolean)object0).booleanValue();
                long v2 = ((Offset)object2).unbox-impl();
                long v3 = ((LayoutCoordinates)object1).getSize-YbymL2g();
                Rect rect0 = new Rect(0.0f, 0.0f, ((float)IntSize.getWidth-impl(v3)), ((float)IntSize.getHeight-impl(v3)));
                if(!SelectionManagerKt.containsInclusive-Uv8p0NA(rect0, v2)) {
                    v2 = TextLayoutStateKt.coerceIn-3MmeM6k(v2, rect0);
                }
                SelectionManager selectionManager0 = (SelectionManager)this.x;
                long v4 = SelectionManager.access$convertToContainerCoordinates-R5De75A(selectionManager0, ((LayoutCoordinates)object1), v2);
                if(OffsetKt.isSpecified-k-4lQ0M(v4)) {
                    selectionManager0.setInTouchMode(z);
                    SelectionManager.access$startSelection-9KIMszo(selectionManager0, v4, false, ((SelectionAdjustment)object3));
                    selectionManager0.getFocusRequester().requestFocus();
                    selectionManager0.setShowToolbar$foundation_release(false);
                }
                return Unit.INSTANCE;
            }
            case 1: {
                SQLiteDatabase sQLiteDatabase0 = (SQLiteDatabase)object0;
                Intrinsics.checkNotNull(((SQLiteQuery)object3));
                FrameworkSQLiteProgram frameworkSQLiteProgram0 = new FrameworkSQLiteProgram(((SQLiteQuery)object3));
                ((SupportSQLiteQuery)this.x).bindTo(frameworkSQLiteProgram0);
                return new SQLiteCursor(((SQLiteCursorDriver)object1), ((String)object2), ((SQLiteQuery)object3));
            }
            default: {
                long v = ((Offset)object0).unbox-impl();
                long v1 = ((Offset)object1).unbox-impl();
                float f = ((Number)object2).floatValue();
                ((Number)object3).floatValue();
                GestureInteraction gestureInteraction0 = (GestureInteraction)this.x;
                if(Float.compare(f, 1.0f) == 0) {
                    gestureInteraction0.onDrag-k-4lQ0M(v1);
                    return Unit.INSTANCE;
                }
                gestureInteraction0.onZoom-3MmeM6k(v, f);
                return Unit.INSTANCE;
            }
        }
    }
}

