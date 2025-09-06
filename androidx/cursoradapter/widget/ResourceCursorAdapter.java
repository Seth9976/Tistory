package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class ResourceCursorAdapter extends CursorAdapter {
    public int a;
    public int b;
    public final LayoutInflater c;

    @Deprecated
    public ResourceCursorAdapter(Context context0, int v, Cursor cursor0) {
        super(context0, cursor0);
        this.b = v;
        this.a = v;
        this.c = (LayoutInflater)context0.getSystemService("layout_inflater");
    }

    public ResourceCursorAdapter(Context context0, int v, Cursor cursor0, int v1) {
        super(context0, cursor0, v1);
        this.b = v;
        this.a = v;
        this.c = (LayoutInflater)context0.getSystemService("layout_inflater");
    }

    @Deprecated
    public ResourceCursorAdapter(Context context0, int v, Cursor cursor0, boolean z) {
        super(context0, cursor0, z);
        this.b = v;
        this.a = v;
        this.c = (LayoutInflater)context0.getSystemService("layout_inflater");
    }

    @Override  // androidx.cursoradapter.widget.CursorAdapter
    public View newDropDownView(Context context0, Cursor cursor0, ViewGroup viewGroup0) {
        return this.c.inflate(this.b, viewGroup0, false);
    }

    @Override  // androidx.cursoradapter.widget.CursorAdapter
    public View newView(Context context0, Cursor cursor0, ViewGroup viewGroup0) {
        return this.c.inflate(this.a, viewGroup0, false);
    }

    public void setDropDownViewResource(int v) {
        this.b = v;
    }

    public void setViewResource(int v) {
        this.a = v;
    }
}

