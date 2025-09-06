package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter.FilterResults;
import android.widget.Filter;

public final class c extends Filter {
    public CursorAdapter a;

    @Override  // android.widget.Filter
    public final CharSequence convertResultToString(Object object0) {
        return this.a.convertToString(((Cursor)object0));
    }

    @Override  // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence0) {
        Cursor cursor0 = this.a.runQueryOnBackgroundThread(charSequence0);
        Filter.FilterResults filter$FilterResults0 = new Filter.FilterResults();
        if(cursor0 != null) {
            filter$FilterResults0.count = cursor0.getCount();
            filter$FilterResults0.values = cursor0;
            return filter$FilterResults0;
        }
        filter$FilterResults0.count = 0;
        filter$FilterResults0.values = null;
        return filter$FilterResults0;
    }

    @Override  // android.widget.Filter
    public final void publishResults(CharSequence charSequence0, Filter.FilterResults filter$FilterResults0) {
        CursorAdapter cursorAdapter0 = this.a;
        Cursor cursor0 = cursorAdapter0.getCursor();
        Object object0 = filter$FilterResults0.values;
        if(object0 != null && object0 != cursor0) {
            cursorAdapter0.changeCursor(((Cursor)object0));
        }
    }
}

