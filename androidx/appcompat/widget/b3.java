package androidx.appcompat.widget;

import a5.b;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.id;
import androidx.core.content.ContextCompat;
import androidx.cursoradapter.widget.ResourceCursorAdapter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

public final class b3 extends ResourceCursorAdapter implements View.OnClickListener {
    public final SearchView d;
    public final SearchableInfo e;
    public final Context f;
    public final WeakHashMap g;
    public final int h;
    public int i;
    public ColorStateList j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public static final int q;

    public b3(Context context0, SearchView searchView0, SearchableInfo searchableInfo0, WeakHashMap weakHashMap0) {
        super(context0, searchView0.getSuggestionRowLayout(), null, true);
        this.i = 1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.d = searchView0;
        this.e = searchableInfo0;
        this.h = searchView0.getSuggestionCommitIconResId();
        this.f = context0;
        this.g = weakHashMap0;
    }

    public final Drawable b(Uri uri0) {
        int v1;
        Resources resources0;
        String s = uri0.getAuthority();
        if(TextUtils.isEmpty(s)) {
            throw new FileNotFoundException("No authority: " + uri0);
        }
        try {
            resources0 = this.f.getPackageManager().getResourcesForApplication(s);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            throw new FileNotFoundException("No package found for authority: " + uri0);
        }
        List list0 = uri0.getPathSegments();
        if(list0 == null) {
            throw new FileNotFoundException("No path: " + uri0);
        }
        int v = list0.size();
        if(v == 1) {
            try {
                v1 = Integer.parseInt(((String)list0.get(0)));
            }
            catch(NumberFormatException unused_ex) {
                throw new FileNotFoundException("Single path segment is not a resource ID: " + uri0);
            }
        }
        else {
            if(v != 2) {
                throw new FileNotFoundException("More than two path segments: " + uri0);
            }
            v1 = resources0.getIdentifier(((String)list0.get(1)), ((String)list0.get(0)), s);
        }
        if(v1 == 0) {
            throw new FileNotFoundException("No resource found for: " + uri0);
        }
        return resources0.getDrawable(v1);
    }

    @Override  // androidx.cursoradapter.widget.CursorAdapter
    public final void bindView(View view0, Context context0, Cursor cursor0) {
        ActivityInfo activityInfo0;
        Drawable drawable0;
        String s2;
        Object object0 = view0.getTag();
        int v = this.p == -1 ? 0 : cursor0.getInt(this.p);
        TextView textView0 = ((a3)object0).a;
        if(textView0 != null) {
            String s = b3.e(cursor0, this.k);
            textView0.setText(s);
            if(TextUtils.isEmpty(s)) {
                textView0.setVisibility(8);
            }
            else {
                textView0.setVisibility(0);
            }
        }
        Context context1 = this.f;
        TextView textView1 = ((a3)object0).b;
        if(textView1 != null) {
            String s1 = b3.e(cursor0, this.m);
            if(s1 == null) {
                s2 = b3.e(cursor0, this.l);
            }
            else {
                if(this.j == null) {
                    TypedValue typedValue0 = new TypedValue();
                    context1.getTheme().resolveAttribute(attr.textColorSearchUrl, typedValue0, true);
                    this.j = context1.getResources().getColorStateList(typedValue0.resourceId);
                }
                s2 = new SpannableString(s1);
                ((SpannableString)s2).setSpan(new TextAppearanceSpan(null, 0, 0, this.j, null), 0, s1.length(), 33);
            }
            if(!TextUtils.isEmpty(s2)) {
                if(textView0 != null) {
                    textView0.setSingleLine(true);
                    textView0.setMaxLines(1);
                }
            }
            else if(textView0 != null) {
                textView0.setSingleLine(false);
                textView0.setMaxLines(2);
            }
            textView1.setText(s2);
            if(TextUtils.isEmpty(s2)) {
                textView1.setVisibility(8);
            }
            else {
                textView1.setVisibility(0);
            }
        }
        ImageView imageView0 = ((a3)object0).c;
        if(imageView0 != null) {
            int v1 = this.n;
            if(v1 == -1) {
                drawable0 = null;
            }
            else {
                drawable0 = this.c(cursor0.getString(v1));
                if(drawable0 == null) {
                    ComponentName componentName0 = this.e.getSearchActivity();
                    String s3 = componentName0.flattenToShortString();
                    WeakHashMap weakHashMap0 = this.g;
                    if(weakHashMap0.containsKey(s3)) {
                        Drawable.ConstantState drawable$ConstantState0 = (Drawable.ConstantState)weakHashMap0.get(s3);
                        drawable0 = drawable$ConstantState0 == null ? null : drawable$ConstantState0.newDrawable(context1.getResources());
                    }
                    else {
                        PackageManager packageManager0 = context1.getPackageManager();
                        try {
                            activityInfo0 = packageManager0.getActivityInfo(componentName0, 0x80);
                        }
                        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                            Log.w("SuggestionsAdapter", packageManager$NameNotFoundException0.toString());
                            drawable0 = null;
                            goto label_73;
                        }
                        int v2 = activityInfo0.getIconResource();
                        if(v2 == 0) {
                            drawable0 = null;
                        }
                        else {
                            Drawable drawable1 = packageManager0.getDrawable(componentName0.getPackageName(), v2, activityInfo0.applicationInfo);
                            if(drawable1 == null) {
                                StringBuilder stringBuilder0 = b.s(v2, "Invalid icon resource ", " for ");
                                stringBuilder0.append(componentName0.flattenToShortString());
                                Log.w("SuggestionsAdapter", stringBuilder0.toString());
                                drawable0 = null;
                            }
                            else {
                                drawable0 = drawable1;
                            }
                        }
                    label_73:
                        weakHashMap0.put(s3, (drawable0 == null ? null : drawable0.getConstantState()));
                    }
                    if(drawable0 == null) {
                        drawable0 = context1.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView0.setImageDrawable(drawable0);
            if(drawable0 == null) {
                imageView0.setVisibility(4);
            }
            else {
                imageView0.setVisibility(0);
                drawable0.setVisible(false, false);
                drawable0.setVisible(true, false);
            }
        }
        ImageView imageView1 = ((a3)object0).d;
        if(imageView1 != null) {
            Drawable drawable2 = this.o == -1 ? null : this.c(cursor0.getString(this.o));
            imageView1.setImageDrawable(drawable2);
            if(drawable2 == null) {
                imageView1.setVisibility(8);
            }
            else {
                imageView1.setVisibility(0);
                drawable2.setVisible(false, false);
                drawable2.setVisible(true, false);
            }
        }
        int v3 = this.i;
        ImageView imageView2 = ((a3)object0).e;
        if(v3 != 2 && (v3 != 1 || (v & 1) == 0)) {
            imageView2.setVisibility(8);
            return;
        }
        imageView2.setVisibility(0);
        imageView2.setTag(textView0.getText());
        imageView2.setOnClickListener(this);
    }

    public final Drawable c(String s) {
        Drawable drawable4;
        WeakHashMap weakHashMap0 = this.g;
        Context context0 = this.f;
        Drawable drawable0 = null;
        if(s != null && !s.isEmpty() && !"0".equals(s)) {
            try {
                int v = Integer.parseInt(s);
                Drawable.ConstantState drawable$ConstantState0 = (Drawable.ConstantState)weakHashMap0.get("android.resource://net.daum.android.tistoryapp/" + v);
                Drawable drawable1 = drawable$ConstantState0 == null ? null : drawable$ConstantState0.newDrawable();
                if(drawable1 != null) {
                    return drawable1;
                }
                Drawable drawable2 = ContextCompat.getDrawable(context0, v);
                if(drawable2 != null) {
                    weakHashMap0.put("android.resource://net.daum.android.tistoryapp/" + v, drawable2.getConstantState());
                }
                return drawable2;
            }
            catch(NumberFormatException unused_ex) {
                Drawable.ConstantState drawable$ConstantState1 = (Drawable.ConstantState)weakHashMap0.get(s);
                Drawable drawable3 = drawable$ConstantState1 == null ? null : drawable$ConstantState1.newDrawable();
                if(drawable3 != null) {
                    return drawable3;
                }
                Uri uri0 = Uri.parse(s);
                try {
                    if("android.resource".equals(uri0.getScheme())) {
                        try {
                            drawable0 = this.b(uri0);
                        }
                        catch(Resources.NotFoundException unused_ex) {
                            throw new FileNotFoundException("Resource does not exist: " + uri0);
                        }
                    }
                    else {
                        InputStream inputStream0 = context0.getContentResolver().openInputStream(uri0);
                        if(inputStream0 == null) {
                            throw new FileNotFoundException("Failed to open " + uri0);
                        }
                        try {
                            drawable4 = Drawable.createFromStream(inputStream0, null);
                        }
                        finally {
                            try {
                                inputStream0.close();
                            }
                            catch(IOException iOException0) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri0, iOException0);
                            }
                        }
                        drawable0 = drawable4;
                    }
                }
                catch(FileNotFoundException fileNotFoundException0) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + uri0 + ", " + fileNotFoundException0.getMessage());
                }
                if(drawable0 != null) {
                    weakHashMap0.put(s, drawable0.getConstantState());
                    return drawable0;
                }
            }
            catch(Resources.NotFoundException unused_ex) {
                Log.w("SuggestionsAdapter", "Icon resource not found: " + s);
                return null;
            }
        }
        return null;
    }

    @Override  // androidx.cursoradapter.widget.CursorAdapter
    public final void changeCursor(Cursor cursor0) {
        try {
            super.changeCursor(cursor0);
            if(cursor0 != null) {
                this.k = cursor0.getColumnIndex("suggest_text_1");
                this.l = cursor0.getColumnIndex("suggest_text_2");
                this.m = cursor0.getColumnIndex("suggest_text_2_url");
                this.n = cursor0.getColumnIndex("suggest_icon_1");
                this.o = cursor0.getColumnIndex("suggest_icon_2");
                this.p = cursor0.getColumnIndex("suggest_flags");
            }
        }
        catch(Exception exception0) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", exception0);
        }
    }

    @Override  // androidx.cursoradapter.widget.CursorAdapter
    public final CharSequence convertToString(Cursor cursor0) {
        if(cursor0 == null) {
            return null;
        }
        CharSequence charSequence0 = b3.e(cursor0, cursor0.getColumnIndex("suggest_intent_query"));
        if(charSequence0 != null) {
            return charSequence0;
        }
        SearchableInfo searchableInfo0 = this.e;
        if(searchableInfo0.shouldRewriteQueryFromData()) {
            CharSequence charSequence1 = b3.e(cursor0, cursor0.getColumnIndex("suggest_intent_data"));
            if(charSequence1 != null) {
                return charSequence1;
            }
        }
        if(searchableInfo0.shouldRewriteQueryFromText()) {
            CharSequence charSequence2 = b3.e(cursor0, cursor0.getColumnIndex("suggest_text_1"));
            return charSequence2 == null ? null : charSequence2;
        }
        return null;
    }

    public final Cursor d(SearchableInfo searchableInfo0, String s) {
        String[] arr_s = null;
        if(searchableInfo0 == null) {
            return null;
        }
        String s1 = searchableInfo0.getSuggestAuthority();
        if(s1 == null) {
            return null;
        }
        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("content").authority(s1).query("").fragment("");
        String s2 = searchableInfo0.getSuggestPath();
        if(s2 != null) {
            uri$Builder0.appendEncodedPath(s2);
        }
        uri$Builder0.appendPath("search_suggest_query");
        String s3 = searchableInfo0.getSuggestSelection();
        if(s3 == null) {
            uri$Builder0.appendPath(s);
        }
        else {
            arr_s = new String[]{s};
        }
        uri$Builder0.appendQueryParameter("limit", "50");
        Uri uri0 = uri$Builder0.build();
        return this.f.getContentResolver().query(uri0, null, s3, arr_s, null);
    }

    public static String e(Cursor cursor0, int v) {
        if(v == -1) {
            return null;
        }
        try {
            return cursor0.getString(v);
        }
        catch(Exception exception0) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", exception0);
            return null;
        }
    }

    @Override  // androidx.cursoradapter.widget.CursorAdapter
    public final View getDropDownView(int v, View view0, ViewGroup viewGroup0) {
        try {
            return super.getDropDownView(v, view0, viewGroup0);
        }
        catch(RuntimeException runtimeException0) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", runtimeException0);
            View view1 = this.newDropDownView(this.f, this.getCursor(), viewGroup0);
            if(view1 != null) {
                ((a3)view1.getTag()).a.setText(runtimeException0.toString());
            }
            return view1;
        }
    }

    @Override  // androidx.cursoradapter.widget.CursorAdapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        try {
            return super.getView(v, view0, viewGroup0);
        }
        catch(RuntimeException runtimeException0) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", runtimeException0);
            View view1 = this.newView(this.f, this.getCursor(), viewGroup0);
            ((a3)view1.getTag()).a.setText(runtimeException0.toString());
            return view1;
        }
    }

    @Override  // androidx.cursoradapter.widget.CursorAdapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override  // androidx.cursoradapter.widget.ResourceCursorAdapter
    public final View newView(Context context0, Cursor cursor0, ViewGroup viewGroup0) {
        View view0 = super.newView(context0, cursor0, viewGroup0);
        view0.setTag(new a3(view0));
        ((ImageView)view0.findViewById(id.edit_query)).setImageResource(this.h);
        return view0;
    }

    @Override  // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor0 = this.getCursor();
        Bundle bundle0 = cursor0 == null ? null : cursor0.getExtras();
        if(bundle0 != null) {
            bundle0.getBoolean("in_progress");
        }
    }

    @Override  // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor0 = this.getCursor();
        Bundle bundle0 = cursor0 == null ? null : cursor0.getExtras();
        if(bundle0 != null) {
            bundle0.getBoolean("in_progress");
        }
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        Object object0 = view0.getTag();
        if(object0 instanceof CharSequence) {
            this.d.onQueryRefine(((CharSequence)object0));
        }
    }

    @Override  // androidx.cursoradapter.widget.CursorAdapter
    public final Cursor runQueryOnBackgroundThread(CharSequence charSequence0) {
        String s = charSequence0 == null ? "" : charSequence0.toString();
        if(this.d.getVisibility() == 0 && this.d.getWindowVisibility() == 0) {
            try {
                Cursor cursor0 = this.d(this.e, s);
                if(cursor0 != null) {
                    cursor0.getCount();
                    return cursor0;
                }
            }
            catch(RuntimeException runtimeException0) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", runtimeException0);
            }
        }
        return null;
    }
}

