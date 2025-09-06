package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public abstract class CursorAdapter extends BaseAdapter implements Filterable, CursorFilter.CursorFilterClient {
    @Deprecated
    public static final int FLAG_AUTO_REQUERY = 1;
    public static final int FLAG_REGISTER_CONTENT_OBSERVER = 2;
    @RestrictTo({Scope.LIBRARY_GROUP})
    protected boolean mAutoRequery;
    @RestrictTo({Scope.LIBRARY_GROUP})
    protected a mChangeObserver;
    @RestrictTo({Scope.LIBRARY_GROUP})
    protected Context mContext;
    @RestrictTo({Scope.LIBRARY_GROUP})
    protected Cursor mCursor;
    @RestrictTo({Scope.LIBRARY_GROUP})
    protected c mCursorFilter;
    @RestrictTo({Scope.LIBRARY_GROUP})
    protected DataSetObserver mDataSetObserver;
    @RestrictTo({Scope.LIBRARY_GROUP})
    protected boolean mDataValid;
    @RestrictTo({Scope.LIBRARY_GROUP})
    protected FilterQueryProvider mFilterQueryProvider;
    @RestrictTo({Scope.LIBRARY_GROUP})
    protected int mRowIDColumn;

    @Deprecated
    public CursorAdapter(Context context0, Cursor cursor0) {
        this.a(context0, cursor0, 1);
    }

    public CursorAdapter(Context context0, Cursor cursor0, int v) {
        this.a(context0, cursor0, v);
    }

    public CursorAdapter(Context context0, Cursor cursor0, boolean z) {
        this.a(context0, cursor0, (z ? 1 : 2));
    }

    public final void a(Context context0, Cursor cursor0, int v) {
        boolean z = false;
        if((v & 1) == 1) {
            v |= 2;
            this.mAutoRequery = true;
        }
        else {
            this.mAutoRequery = false;
        }
        if(cursor0 != null) {
            z = true;
        }
        this.mCursor = cursor0;
        this.mDataValid = z;
        this.mContext = context0;
        this.mRowIDColumn = z ? cursor0.getColumnIndexOrThrow("_id") : -1;
        if((v & 2) == 2) {
            this.mChangeObserver = new a(this);
            this.mDataSetObserver = new b(this);
        }
        else {
            this.mChangeObserver = null;
            this.mDataSetObserver = null;
        }
        if(z) {
            a a0 = this.mChangeObserver;
            if(a0 != null) {
                cursor0.registerContentObserver(a0);
            }
            DataSetObserver dataSetObserver0 = this.mDataSetObserver;
            if(dataSetObserver0 != null) {
                cursor0.registerDataSetObserver(dataSetObserver0);
            }
        }
    }

    public abstract void bindView(View arg1, Context arg2, Cursor arg3);

    @Override  // androidx.cursoradapter.widget.CursorFilter$CursorFilterClient
    public void changeCursor(Cursor cursor0) {
        Cursor cursor1 = this.swapCursor(cursor0);
        if(cursor1 != null) {
            cursor1.close();
        }
    }

    @Override  // androidx.cursoradapter.widget.CursorFilter$CursorFilterClient
    public CharSequence convertToString(Cursor cursor0) {
        return cursor0 == null ? "" : cursor0.toString();
    }

    @Override  // android.widget.Adapter
    public int getCount() {
        if(this.mDataValid) {
            return this.mCursor == null ? 0 : this.mCursor.getCount();
        }
        return 0;
    }

    @Override  // androidx.cursoradapter.widget.CursorFilter$CursorFilterClient
    public Cursor getCursor() {
        return this.mCursor;
    }

    @Override  // android.widget.BaseAdapter
    public View getDropDownView(int v, View view0, ViewGroup viewGroup0) {
        if(this.mDataValid) {
            this.mCursor.moveToPosition(v);
            if(view0 == null) {
                view0 = this.newDropDownView(this.mContext, this.mCursor, viewGroup0);
            }
            this.bindView(view0, this.mContext, this.mCursor);
            return view0;
        }
        return null;
    }

    @Override  // android.widget.Filterable
    public Filter getFilter() {
        if(this.mCursorFilter == null) {
            c c0 = new c();  // 初始化器: Landroid/widget/Filter;-><init>()V
            c0.a = this;
            this.mCursorFilter = c0;
        }
        return this.mCursorFilter;
    }

    public FilterQueryProvider getFilterQueryProvider() {
        return this.mFilterQueryProvider;
    }

    @Override  // android.widget.Adapter
    public Object getItem(int v) {
        if(this.mDataValid) {
            Cursor cursor0 = this.mCursor;
            if(cursor0 != null) {
                cursor0.moveToPosition(v);
                return this.mCursor;
            }
        }
        return null;
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.Adapter
    public long getItemId(int v) {
        return !this.mDataValid || (this.mCursor == null || !this.mCursor.moveToPosition(v)) ? 0L : this.mCursor.getLong(this.mRowIDColumn);
    }

    @Override  // android.widget.Adapter
    public View getView(int v, View view0, ViewGroup viewGroup0) {
        if(!this.mDataValid) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if(!this.mCursor.moveToPosition(v)) {
            throw new IllegalStateException("couldn\'t move cursor to position " + v);
        }
        if(view0 == null) {
            view0 = this.newView(this.mContext, this.mCursor, viewGroup0);
        }
        this.bindView(view0, this.mContext, this.mCursor);
        return view0;
    }

    @Override  // android.widget.BaseAdapter
    public boolean hasStableIds() {
        return true;
    }

    @Deprecated
    public void init(Context context0, Cursor cursor0, boolean z) {
        this.a(context0, cursor0, (z ? 1 : 2));
    }

    public View newDropDownView(Context context0, Cursor cursor0, ViewGroup viewGroup0) {
        return this.newView(context0, cursor0, viewGroup0);
    }

    public abstract View newView(Context arg1, Cursor arg2, ViewGroup arg3);

    public void onContentChanged() {
        if(this.mAutoRequery && (this.mCursor != null && !this.mCursor.isClosed())) {
            this.mDataValid = this.mCursor.requery();
        }
    }

    @Override  // androidx.cursoradapter.widget.CursorFilter$CursorFilterClient
    public Cursor runQueryOnBackgroundThread(CharSequence charSequence0) {
        return this.mFilterQueryProvider == null ? this.mCursor : this.mFilterQueryProvider.runQuery(charSequence0);
    }

    public void setFilterQueryProvider(FilterQueryProvider filterQueryProvider0) {
        this.mFilterQueryProvider = filterQueryProvider0;
    }

    public Cursor swapCursor(Cursor cursor0) {
        Cursor cursor1 = this.mCursor;
        if(cursor0 == cursor1) {
            return null;
        }
        if(cursor1 != null) {
            a a0 = this.mChangeObserver;
            if(a0 != null) {
                cursor1.unregisterContentObserver(a0);
            }
            DataSetObserver dataSetObserver0 = this.mDataSetObserver;
            if(dataSetObserver0 != null) {
                cursor1.unregisterDataSetObserver(dataSetObserver0);
            }
        }
        this.mCursor = cursor0;
        if(cursor0 != null) {
            a a1 = this.mChangeObserver;
            if(a1 != null) {
                cursor0.registerContentObserver(a1);
            }
            DataSetObserver dataSetObserver1 = this.mDataSetObserver;
            if(dataSetObserver1 != null) {
                cursor0.registerDataSetObserver(dataSetObserver1);
            }
            this.mRowIDColumn = cursor0.getColumnIndexOrThrow("_id");
            this.mDataValid = true;
            this.notifyDataSetChanged();
            return cursor1;
        }
        this.mRowIDColumn = -1;
        this.mDataValid = false;
        this.notifyDataSetInvalidated();
        return cursor1;
    }
}

