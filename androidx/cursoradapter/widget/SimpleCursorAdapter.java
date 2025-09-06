package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public class SimpleCursorAdapter extends ResourceCursorAdapter {
    public interface CursorToStringConverter {
        CharSequence convertToString(Cursor arg1);
    }

    public interface ViewBinder {
        boolean setViewValue(View arg1, Cursor arg2, int arg3);
    }

    public int d;
    public CursorToStringConverter e;
    public ViewBinder f;
    public String[] g;
    @RestrictTo({Scope.LIBRARY_GROUP})
    protected int[] mFrom;
    @RestrictTo({Scope.LIBRARY_GROUP})
    protected int[] mTo;

    @Deprecated
    public SimpleCursorAdapter(Context context0, int v, Cursor cursor0, String[] arr_s, int[] arr_v) {
        super(context0, v, cursor0);
        this.d = -1;
        this.mTo = arr_v;
        this.g = arr_s;
        this.b(cursor0, arr_s);
    }

    public SimpleCursorAdapter(Context context0, int v, Cursor cursor0, String[] arr_s, int[] arr_v, int v1) {
        super(context0, v, cursor0, v1);
        this.d = -1;
        this.mTo = arr_v;
        this.g = arr_s;
        this.b(cursor0, arr_s);
    }

    public final void b(Cursor cursor0, String[] arr_s) {
        if(cursor0 != null) {
            if(this.mFrom == null || this.mFrom.length != arr_s.length) {
                this.mFrom = new int[arr_s.length];
            }
            for(int v = 0; v < arr_s.length; ++v) {
                int[] arr_v = this.mFrom;
                arr_v[v] = cursor0.getColumnIndexOrThrow(arr_s[v]);
            }
            return;
        }
        this.mFrom = null;
    }

    @Override  // androidx.cursoradapter.widget.CursorAdapter
    public void bindView(View view0, Context context0, Cursor cursor0) {
        ViewBinder simpleCursorAdapter$ViewBinder0 = this.f;
        int[] arr_v = this.mTo;
        int[] arr_v1 = this.mFrom;
        for(int v = 0; v < arr_v.length; ++v) {
            View view1 = view0.findViewById(arr_v[v]);
            if(view1 != null && !(simpleCursorAdapter$ViewBinder0 == null ? false : simpleCursorAdapter$ViewBinder0.setViewValue(view1, cursor0, arr_v1[v]))) {
                String s = cursor0.getString(arr_v1[v]);
                if(s == null) {
                    s = "";
                }
                if(view1 instanceof TextView) {
                    this.setViewText(((TextView)view1), s);
                }
                else {
                    if(!(view1 instanceof ImageView)) {
                        throw new IllegalStateException(view1.getClass().getName() + " is not a  view that can be bounds by this SimpleCursorAdapter");
                    }
                    this.setViewImage(((ImageView)view1), s);
                    continue;
                }
            }
        }
    }

    public void changeCursorAndColumns(Cursor cursor0, String[] arr_s, int[] arr_v) {
        this.g = arr_s;
        this.mTo = arr_v;
        this.b(cursor0, arr_s);
        super.changeCursor(cursor0);
    }

    @Override  // androidx.cursoradapter.widget.CursorAdapter
    public CharSequence convertToString(Cursor cursor0) {
        CursorToStringConverter simpleCursorAdapter$CursorToStringConverter0 = this.e;
        if(simpleCursorAdapter$CursorToStringConverter0 != null) {
            return simpleCursorAdapter$CursorToStringConverter0.convertToString(cursor0);
        }
        int v = this.d;
        return v > -1 ? cursor0.getString(v) : super.convertToString(cursor0);
    }

    public CursorToStringConverter getCursorToStringConverter() {
        return this.e;
    }

    public int getStringConversionColumn() {
        return this.d;
    }

    public ViewBinder getViewBinder() {
        return this.f;
    }

    public void setCursorToStringConverter(CursorToStringConverter simpleCursorAdapter$CursorToStringConverter0) {
        this.e = simpleCursorAdapter$CursorToStringConverter0;
    }

    public void setStringConversionColumn(int v) {
        this.d = v;
    }

    public void setViewBinder(ViewBinder simpleCursorAdapter$ViewBinder0) {
        this.f = simpleCursorAdapter$ViewBinder0;
    }

    public void setViewImage(ImageView imageView0, String s) {
        try {
            imageView0.setImageResource(Integer.parseInt(s));
        }
        catch(NumberFormatException unused_ex) {
            imageView0.setImageURI(Uri.parse(s));
        }
    }

    public void setViewText(TextView textView0, String s) {
        textView0.setText(s);
    }

    @Override  // androidx.cursoradapter.widget.CursorAdapter
    public Cursor swapCursor(Cursor cursor0) {
        this.b(cursor0, this.g);
        return super.swapCursor(cursor0);
    }
}

