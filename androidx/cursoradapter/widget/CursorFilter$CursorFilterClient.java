package androidx.cursoradapter.widget;

import android.database.Cursor;

interface CursorFilter.CursorFilterClient {
    void changeCursor(Cursor arg1);

    CharSequence convertToString(Cursor arg1);

    Cursor getCursor();

    Cursor runQueryOnBackgroundThread(CharSequence arg1);
}

