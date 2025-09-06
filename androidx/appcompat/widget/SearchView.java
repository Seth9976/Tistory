package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent.DispatcherState;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.dimen;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.string;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.core.view.ViewCompat;
import androidx.cursoradapter.widget.CursorAdapter;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat implements CollapsibleActionView {
    public interface OnCloseListener {
        boolean onClose();
    }

    public interface OnQueryTextListener {
        boolean onQueryTextChange(String arg1);

        boolean onQueryTextSubmit(String arg1);
    }

    public interface OnSuggestionListener {
        boolean onSuggestionClick(int arg1);

        boolean onSuggestionSelect(int arg1);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {
        public int e;
        public SearchView f;
        public boolean g;
        public final w2 h;

        public SearchAutoComplete(Context context0) {
            this(context0, null);
        }

        public SearchAutoComplete(Context context0, AttributeSet attributeSet0) {
            this(context0, attributeSet0, attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context0, AttributeSet attributeSet0, int v) {
            super(context0, attributeSet0, v);
            this.h = new w2(this);
            this.e = this.getThreshold();
        }

        public final void a() {
            if(Build.VERSION.SDK_INT >= 29) {
                t2.b(this, 1);
                if(this.enoughToFilter()) {
                    this.showDropDown();
                }
            }
            else {
                SearchView.k0.getClass();
                u2.a();
                Method method0 = SearchView.k0.c;
                if(method0 != null) {
                    try {
                        method0.invoke(this, Boolean.TRUE);
                    }
                    catch(Exception unused_ex) {
                    }
                }
            }
        }

        @Override  // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.e <= 0 || super.enoughToFilter();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration0 = this.getResources().getConfiguration();
            int v = configuration0.screenWidthDp;
            int v1 = configuration0.screenHeightDp;
            if(v >= 960 && v1 >= 720 && configuration0.orientation == 2) {
                return 0x100;
            }
            return v >= 600 || v >= 640 && v1 >= 480 ? 0xC0 : 0xA0;
        }

        @Override  // androidx.appcompat.widget.AppCompatAutoCompleteTextView
        public InputConnection onCreateInputConnection(EditorInfo editorInfo0) {
            InputConnection inputConnection0 = super.onCreateInputConnection(editorInfo0);
            if(this.g) {
                this.removeCallbacks(this.h);
                this.post(this.h);
            }
            return inputConnection0;
        }

        @Override  // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
            this.setMinWidth(((int)TypedValue.applyDimension(1, ((float)this.getSearchViewTextMinWidthDp()), displayMetrics0)));
        }

        @Override  // android.widget.AutoCompleteTextView
        public void onFocusChanged(boolean z, int v, Rect rect0) {
            super.onFocusChanged(z, v, rect0);
            SearchView searchView0 = this.f;
            searchView0.o(searchView0.isIconified());
            searchView0.post(searchView0.h0);
            if(searchView0.p.hasFocus()) {
                searchView0.e();
            }
        }

        @Override  // android.widget.AutoCompleteTextView
        public boolean onKeyPreIme(int v, KeyEvent keyEvent0) {
            if(v == 4) {
                if(keyEvent0.getAction() == 0 && keyEvent0.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyEvent$DispatcherState0 = this.getKeyDispatcherState();
                    if(keyEvent$DispatcherState0 != null) {
                        keyEvent$DispatcherState0.startTracking(keyEvent0, this);
                    }
                    return true;
                }
                if(keyEvent0.getAction() == 1) {
                    KeyEvent.DispatcherState keyEvent$DispatcherState1 = this.getKeyDispatcherState();
                    if(keyEvent$DispatcherState1 != null) {
                        keyEvent$DispatcherState1.handleUpEvent(keyEvent0);
                    }
                    if(keyEvent0.isTracking() && !keyEvent0.isCanceled()) {
                        this.f.clearFocus();
                        this.setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(v, keyEvent0);
        }

        @Override  // android.widget.AutoCompleteTextView
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if(z && this.f.hasFocus() && this.getVisibility() == 0) {
                this.g = true;
                if(this.getContext().getResources().getConfiguration().orientation == 2) {
                    this.a();
                }
            }
        }

        @Override  // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override  // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence0) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager0 = (InputMethodManager)this.getContext().getSystemService("input_method");
            w2 w20 = this.h;
            if(!z) {
                this.g = false;
                this.removeCallbacks(w20);
                inputMethodManager0.hideSoftInputFromWindow(this.getWindowToken(), 0);
                return;
            }
            if(inputMethodManager0.isActive(this)) {
                this.g = false;
                this.removeCallbacks(w20);
                inputMethodManager0.showSoftInput(this, 0);
                return;
            }
            this.g = true;
        }

        public void setSearchView(SearchView searchView0) {
            this.f = searchView0;
        }

        @Override  // android.widget.AutoCompleteTextView
        public void setThreshold(int v) {
            super.setThreshold(v);
            this.e = v;
        }
    }

    public final Rect A;
    public final int[] B;
    public final int[] C;
    public final ImageView D;
    public final Drawable E;
    public final int F;
    public final int G;
    public final Intent H;
    public final Intent I;
    public final CharSequence J;
    public OnQueryTextListener K;
    public OnCloseListener L;
    public View.OnFocusChangeListener M;
    public OnSuggestionListener N;
    public View.OnClickListener O;
    public boolean P;
    public boolean Q;
    public CursorAdapter R;
    public boolean S;
    public CharSequence T;
    public boolean U;
    public boolean V;
    public int W;
    public boolean a0;
    public String b0;
    public CharSequence c0;
    public boolean d0;
    public int e0;
    public SearchableInfo f0;
    public Bundle g0;
    public final n2 h0;
    public final n2 i0;
    public final WeakHashMap j0;
    public static final u2 k0;
    public final SearchAutoComplete p;
    public final View q;
    public final View r;
    public final View s;
    public final ImageView t;
    public final ImageView u;
    public final ImageView v;
    public final ImageView w;
    public final View x;
    public x2 y;
    public final Rect z;

    static {
        u2 u20 = null;
        if(Build.VERSION.SDK_INT < 29) {
            Class class0 = AutoCompleteTextView.class;
            u2 u21 = new u2();  // 初始化器: Ljava/lang/Object;-><init>()V
            u21.a = null;
            u21.b = null;
            u21.c = null;
            u2.a();
            try {
                Method method0 = class0.getDeclaredMethod("doBeforeTextChanged", null);
                u21.a = method0;
                method0.setAccessible(true);
            }
            catch(NoSuchMethodException unused_ex) {
            }
            try {
                Method method1 = class0.getDeclaredMethod("doAfterTextChanged", null);
                u21.b = method1;
                method1.setAccessible(true);
            }
            catch(NoSuchMethodException unused_ex) {
            }
            try {
                Method method2 = class0.getMethod("ensureImeVisible", Boolean.TYPE);
                u21.c = method2;
                method2.setAccessible(true);
            }
            catch(NoSuchMethodException unused_ex) {
            }
            u20 = u21;
        }
        SearchView.k0 = u20;
    }

    public SearchView(@NonNull Context context0) {
        this(context0, null);
    }

    public SearchView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.searchViewStyle);
    }

    public SearchView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.h0 = new n2(this, 0);
        this.i0 = new n2(this, 1);
        this.j0 = new WeakHashMap();
        q2 q20 = new q2(this);
        r2 r20 = new r2(this);
        s2 s20 = new s2(this);
        p0 p00 = new p0(this, 1);
        v1 v10 = new v1(this, 1);
        m2 m20 = new m2(this, 0);
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(context0, attributeSet0, styleable.SearchView, v, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context0, styleable.SearchView, attributeSet0, tintTypedArray0.getWrappedTypeArray(), v, 0);
        LayoutInflater.from(context0).inflate(tintTypedArray0.getResourceId(styleable.SearchView_layout, layout.abc_search_view), this, true);
        SearchAutoComplete searchView$SearchAutoComplete0 = (SearchAutoComplete)this.findViewById(id.search_src_text);
        this.p = searchView$SearchAutoComplete0;
        searchView$SearchAutoComplete0.setSearchView(this);
        this.q = this.findViewById(id.search_edit_frame);
        View view0 = this.findViewById(id.search_plate);
        this.r = view0;
        View view1 = this.findViewById(id.submit_area);
        this.s = view1;
        ImageView imageView0 = (ImageView)this.findViewById(id.search_button);
        this.t = imageView0;
        ImageView imageView1 = (ImageView)this.findViewById(id.search_go_btn);
        this.u = imageView1;
        ImageView imageView2 = (ImageView)this.findViewById(id.search_close_btn);
        this.v = imageView2;
        ImageView imageView3 = (ImageView)this.findViewById(id.search_voice_btn);
        this.w = imageView3;
        ImageView imageView4 = (ImageView)this.findViewById(id.search_mag_icon);
        this.D = imageView4;
        ViewCompat.setBackground(view0, tintTypedArray0.getDrawable(styleable.SearchView_queryBackground));
        ViewCompat.setBackground(view1, tintTypedArray0.getDrawable(styleable.SearchView_submitBackground));
        imageView0.setImageDrawable(tintTypedArray0.getDrawable(styleable.SearchView_searchIcon));
        imageView1.setImageDrawable(tintTypedArray0.getDrawable(styleable.SearchView_goIcon));
        imageView2.setImageDrawable(tintTypedArray0.getDrawable(styleable.SearchView_closeIcon));
        imageView3.setImageDrawable(tintTypedArray0.getDrawable(styleable.SearchView_voiceIcon));
        imageView4.setImageDrawable(tintTypedArray0.getDrawable(styleable.SearchView_searchIcon));
        this.E = tintTypedArray0.getDrawable(styleable.SearchView_searchHintIcon);
        TooltipCompat.setTooltipText(imageView0, this.getResources().getString(string.abc_searchview_description_search));
        this.F = tintTypedArray0.getResourceId(styleable.SearchView_suggestionRowLayout, layout.abc_search_dropdown_item_icons_2line);
        this.G = tintTypedArray0.getResourceId(styleable.SearchView_commitIcon, 0);
        imageView0.setOnClickListener(q20);
        imageView2.setOnClickListener(q20);
        imageView1.setOnClickListener(q20);
        imageView3.setOnClickListener(q20);
        searchView$SearchAutoComplete0.setOnClickListener(q20);
        searchView$SearchAutoComplete0.addTextChangedListener(m20);
        searchView$SearchAutoComplete0.setOnEditorActionListener(s20);
        searchView$SearchAutoComplete0.setOnItemClickListener(p00);
        searchView$SearchAutoComplete0.setOnItemSelectedListener(v10);
        searchView$SearchAutoComplete0.setOnKeyListener(r20);
        searchView$SearchAutoComplete0.setOnFocusChangeListener(new o2(this));
        this.setIconifiedByDefault(tintTypedArray0.getBoolean(styleable.SearchView_iconifiedByDefault, true));
        int v1 = tintTypedArray0.getDimensionPixelSize(styleable.SearchView_android_maxWidth, -1);
        if(v1 != -1) {
            this.setMaxWidth(v1);
        }
        this.J = tintTypedArray0.getText(styleable.SearchView_defaultQueryHint);
        this.T = tintTypedArray0.getText(styleable.SearchView_queryHint);
        int v2 = tintTypedArray0.getInt(styleable.SearchView_android_imeOptions, -1);
        if(v2 != -1) {
            this.setImeOptions(v2);
        }
        int v3 = tintTypedArray0.getInt(styleable.SearchView_android_inputType, -1);
        if(v3 != -1) {
            this.setInputType(v3);
        }
        this.setFocusable(tintTypedArray0.getBoolean(styleable.SearchView_android_focusable, true));
        tintTypedArray0.recycle();
        Intent intent0 = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent0;
        intent0.addFlags(0x10000000);
        intent0.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent1 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent1;
        intent1.addFlags(0x10000000);
        View view2 = this.findViewById(searchView$SearchAutoComplete0.getDropDownAnchor());
        this.x = view2;
        if(view2 != null) {
            view2.addOnLayoutChangeListener(new p2(this, 0));
        }
        this.o(this.P);
        this.l();
    }

    public final Intent c(Uri uri0, String s, String s1, String s2) {
        Intent intent0 = new Intent(s);
        intent0.addFlags(0x10000000);
        if(uri0 != null) {
            intent0.setData(uri0);
        }
        intent0.putExtra("user_query", this.c0);
        if(s2 != null) {
            intent0.putExtra("query", s2);
        }
        if(s1 != null) {
            intent0.putExtra("intent_extra_data_key", s1);
        }
        Bundle bundle0 = this.g0;
        if(bundle0 != null) {
            intent0.putExtra("app_data", bundle0);
        }
        intent0.setComponent(this.f0.getSearchActivity());
        return intent0;
    }

    @Override  // android.view.ViewGroup
    public void clearFocus() {
        this.V = true;
        super.clearFocus();
        this.p.clearFocus();
        this.p.setImeVisibility(false);
        this.V = false;
    }

    public final Intent d(Intent intent0, SearchableInfo searchableInfo0) {
        ComponentName componentName0 = searchableInfo0.getSearchActivity();
        Intent intent1 = new Intent("android.intent.action.SEARCH");
        intent1.setComponent(componentName0);
        PendingIntent pendingIntent0 = PendingIntent.getActivity(this.getContext(), 0, intent1, 0x42000000);
        Bundle bundle0 = new Bundle();
        Bundle bundle1 = this.g0;
        if(bundle1 != null) {
            bundle0.putParcelable("app_data", bundle1);
        }
        Intent intent2 = new Intent(intent0);
        Resources resources0 = this.getResources();
        String s = searchableInfo0.getVoiceLanguageModeId() == 0 ? "free_form" : resources0.getString(searchableInfo0.getVoiceLanguageModeId());
        String s1 = null;
        String s2 = searchableInfo0.getVoicePromptTextId() == 0 ? null : resources0.getString(searchableInfo0.getVoicePromptTextId());
        String s3 = searchableInfo0.getVoiceLanguageId() == 0 ? null : resources0.getString(searchableInfo0.getVoiceLanguageId());
        int v = searchableInfo0.getVoiceMaxResults() == 0 ? 1 : searchableInfo0.getVoiceMaxResults();
        intent2.putExtra("android.speech.extra.LANGUAGE_MODEL", s);
        intent2.putExtra("android.speech.extra.PROMPT", s2);
        intent2.putExtra("android.speech.extra.LANGUAGE", s3);
        intent2.putExtra("android.speech.extra.MAX_RESULTS", v);
        if(componentName0 != null) {
            s1 = componentName0.flattenToShortString();
        }
        intent2.putExtra("calling_package", s1);
        intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", pendingIntent0);
        intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle0);
        return intent2;
    }

    public final void e() {
        SearchAutoComplete searchView$SearchAutoComplete0 = this.p;
        if(Build.VERSION.SDK_INT >= 29) {
            t2.a(searchView$SearchAutoComplete0);
            return;
        }
        u2 u20 = SearchView.k0;
        u20.getClass();
        u2.a();
        Method method0 = u20.a;
        if(method0 != null) {
            try {
                method0.invoke(searchView$SearchAutoComplete0, null);
            }
            catch(Exception unused_ex) {
            }
        }
        u20.getClass();
        u2.a();
        Method method1 = u20.b;
        if(method1 != null) {
            try {
                method1.invoke(searchView$SearchAutoComplete0, null);
            }
            catch(Exception unused_ex) {
            }
        }
    }

    public final void f() {
        SearchAutoComplete searchView$SearchAutoComplete0 = this.p;
        if(!TextUtils.isEmpty(searchView$SearchAutoComplete0.getText())) {
            searchView$SearchAutoComplete0.setText("");
            searchView$SearchAutoComplete0.requestFocus();
            searchView$SearchAutoComplete0.setImeVisibility(true);
        }
        else if(this.P && (this.L == null || !this.L.onClose())) {
            this.clearFocus();
            this.o(true);
        }
    }

    public final boolean g(int v) {
        int v1;
        Intent intent0;
        if(this.N != null && this.N.onSuggestionClick(v)) {
            return false;
        }
        Cursor cursor0 = this.R.getCursor();
        if(cursor0 != null && cursor0.moveToPosition(v)) {
            try {
                intent0 = null;
                String s = b3.e(cursor0, cursor0.getColumnIndex("suggest_intent_action"));
                if(s == null) {
                    s = this.f0.getSuggestIntentAction();
                }
                if(s == null) {
                    s = "android.intent.action.SEARCH";
                }
                String s1 = b3.e(cursor0, cursor0.getColumnIndex("suggest_intent_data"));
                if(s1 == null) {
                    s1 = this.f0.getSuggestIntentData();
                }
                if(s1 != null) {
                    String s2 = b3.e(cursor0, cursor0.getColumnIndex("suggest_intent_data_id"));
                    if(s2 != null) {
                        s1 = s1 + "/" + Uri.encode(s2);
                    }
                }
                Uri uri0 = s1 == null ? null : Uri.parse(s1);
                String s3 = b3.e(cursor0, cursor0.getColumnIndex("suggest_intent_query"));
                intent0 = this.c(uri0, s, b3.e(cursor0, cursor0.getColumnIndex("suggest_intent_extra_data")), s3);
                goto label_25;
            }
            catch(RuntimeException runtimeException0) {
            }
            try {
                v1 = -1;
                v1 = cursor0.getPosition();
            }
            catch(RuntimeException unused_ex) {
            }
            Log.w("SearchView", "Search suggestions cursor at row " + v1 + " returned exception.", runtimeException0);
        label_25:
            if(intent0 != null) {
                try {
                    this.getContext().startActivity(intent0);
                }
                catch(RuntimeException runtimeException1) {
                    Log.e("SearchView", "Failed launch activity: " + intent0, runtimeException1);
                }
            }
        }
        this.p.setImeVisibility(false);
        this.p.dismissDropDown();
        return true;
    }

    public int getImeOptions() {
        return this.p.getImeOptions();
    }

    public int getInputType() {
        return this.p.getInputType();
    }

    public int getMaxWidth() {
        return this.W;
    }

    private int getPreferredHeight() {
        return this.getContext().getResources().getDimensionPixelSize(dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return this.getContext().getResources().getDimensionPixelSize(dimen.abc_search_view_preferred_width);
    }

    public CharSequence getQuery() {
        return this.p.getText();
    }

    @Nullable
    public CharSequence getQueryHint() {
        CharSequence charSequence0 = this.T;
        if(charSequence0 == null) {
            return this.f0 == null || this.f0.getHintId() == 0 ? this.J : this.getContext().getText(this.f0.getHintId());
        }
        return charSequence0;
    }

    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    public int getSuggestionRowLayout() {
        return this.F;
    }

    public CursorAdapter getSuggestionsAdapter() {
        return this.R;
    }

    public final void h(int v) {
        if(this.N != null && this.N.onSuggestionSelect(v)) {
            return;
        }
        Editable editable0 = this.p.getText();
        Cursor cursor0 = this.R.getCursor();
        if(cursor0 != null) {
            if(cursor0.moveToPosition(v)) {
                CharSequence charSequence0 = this.R.convertToString(cursor0);
                if(charSequence0 != null) {
                    this.setQuery(charSequence0);
                    return;
                }
                this.setQuery(editable0);
                return;
            }
            this.setQuery(editable0);
        }
    }

    public final void i() {
        SearchAutoComplete searchView$SearchAutoComplete0 = this.p;
        Editable editable0 = searchView$SearchAutoComplete0.getText();
        if(editable0 != null && TextUtils.getTrimmedLength(editable0) > 0 && (this.K == null || !this.K.onQueryTextSubmit(editable0.toString()))) {
            if(this.f0 != null) {
                Intent intent0 = this.c(null, "android.intent.action.SEARCH", null, editable0.toString());
                this.getContext().startActivity(intent0);
            }
            searchView$SearchAutoComplete0.setImeVisibility(false);
            searchView$SearchAutoComplete0.dismissDropDown();
        }
    }

    public boolean isIconfiedByDefault() {
        return this.P;
    }

    public boolean isIconified() {
        return this.Q;
    }

    public boolean isQueryRefinementEnabled() {
        return this.U;
    }

    public boolean isSubmitButtonEnabled() {
        return this.S;
    }

    public final void j() {
        boolean z = TextUtils.isEmpty(this.p.getText());
        this.v.setVisibility((!z || this.P && !this.d0 ? 0 : 8));
        Drawable drawable0 = this.v.getDrawable();
        if(drawable0 != null) {
            drawable0.setState((z ? ViewGroup.EMPTY_STATE_SET : ViewGroup.ENABLED_STATE_SET));
        }
    }

    public final void k() {
        int[] arr_v = this.p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable drawable0 = this.r.getBackground();
        if(drawable0 != null) {
            drawable0.setState(arr_v);
        }
        Drawable drawable1 = this.s.getBackground();
        if(drawable1 != null) {
            drawable1.setState(arr_v);
        }
        this.invalidate();
    }

    public final void l() {
        CharSequence charSequence0 = this.getQueryHint();
        if(charSequence0 == null) {
            charSequence0 = "";
        }
        SearchAutoComplete searchView$SearchAutoComplete0 = this.p;
        if(this.P) {
            Drawable drawable0 = this.E;
            if(drawable0 != null) {
                int v = (int)(((double)searchView$SearchAutoComplete0.getTextSize()) * 1.25);
                drawable0.setBounds(0, 0, v, v);
                SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder("   ");
                spannableStringBuilder0.setSpan(new ImageSpan(drawable0), 1, 2, 33);
                spannableStringBuilder0.append(charSequence0);
                charSequence0 = spannableStringBuilder0;
            }
        }
        searchView$SearchAutoComplete0.setHint(charSequence0);
    }

    public final void m() {
        int v = !this.S && !this.a0 || this.isIconified() || this.u.getVisibility() != 0 && this.w.getVisibility() != 0 ? 8 : 0;
        this.s.setVisibility(v);
    }

    // 去混淆评级： 低(23)
    public final void n(boolean z) {
        int v = !this.S || this.isIconified() || !this.hasFocus() || !z && this.a0 ? 8 : 0;
        this.u.setVisibility(v);
    }

    public final void o(boolean z) {
        this.Q = z;
        int v = 8;
        boolean z1 = TextUtils.isEmpty(this.p.getText());
        this.t.setVisibility((z ? 0 : 8));
        this.n(!z1);
        this.q.setVisibility((z ? 8 : 0));
        ImageView imageView0 = this.D;
        if(imageView0.getDrawable() != null && !this.P) {
            v = 0;
        }
        imageView0.setVisibility(v);
        this.j();
        this.p(z1);
        this.m();
    }

    @Override  // androidx.appcompat.view.CollapsibleActionView
    public void onActionViewCollapsed() {
        this.setQuery("", false);
        this.clearFocus();
        this.o(true);
        this.p.setImeOptions(this.e0);
        this.d0 = false;
    }

    @Override  // androidx.appcompat.view.CollapsibleActionView
    public void onActionViewExpanded() {
        if(this.d0) {
            return;
        }
        this.d0 = true;
        int v = this.p.getImeOptions();
        this.e0 = v;
        this.p.setImeOptions(v | 0x2000000);
        this.p.setText("");
        this.setIconified(false);
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        this.removeCallbacks(this.h0);
        this.post(this.i0);
        super.onDetachedFromWindow();
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(z) {
            SearchAutoComplete searchView$SearchAutoComplete0 = this.p;
            searchView$SearchAutoComplete0.getLocationInWindow(this.B);
            this.getLocationInWindow(this.C);
            int v4 = this.B[1] - this.C[1];
            int v5 = this.B[0] - this.C[0];
            int v6 = searchView$SearchAutoComplete0.getWidth();
            int v7 = searchView$SearchAutoComplete0.getHeight();
            Rect rect0 = this.z;
            rect0.set(v5, v4, v6 + v5, v7 + v4);
            Rect rect1 = this.A;
            rect1.set(rect0.left, 0, rect0.right, v3 - v1);
            x2 x20 = this.y;
            if(x20 == null) {
                x2 x21 = new x2(searchView$SearchAutoComplete0, rect1, rect0);
                this.y = x21;
                this.setTouchDelegate(x21);
                return;
            }
            x20.b.set(rect1);
            x20.d.set(rect1);
            int v8 = -x20.e;
            x20.d.inset(v8, v8);
            x20.c.set(rect0);
        }
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public void onMeasure(int v, int v1) {
        if(this.isIconified()) {
            super.onMeasure(v, v1);
            return;
        }
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getSize(v);
        switch(v2) {
            case 0x80000000: {
                int v4 = this.W;
                v3 = v4 <= 0 ? Math.min(this.getPreferredWidth(), v3) : Math.min(v4, v3);
                break;
            }
            case 0: {
                v3 = this.W;
                if(v3 <= 0) {
                    v3 = this.getPreferredWidth();
                }
                break;
            }
            case 0x40000000: {
                int v5 = this.W;
                if(v5 > 0) {
                    v3 = Math.min(v5, v3);
                }
            }
        }
        int v6 = View.MeasureSpec.getMode(v1);
        int v7 = View.MeasureSpec.getSize(v1);
        switch(v6) {
            case 0x80000000: {
                v7 = Math.min(this.getPreferredHeight(), v7);
                break;
            }
            case 0: {
                v7 = this.getPreferredHeight();
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(v3, 0x40000000), View.MeasureSpec.makeMeasureSpec(v7, 0x40000000));
    }

    public void onQueryRefine(@Nullable CharSequence charSequence0) {
        this.setQuery(charSequence0);
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof v2)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((v2)parcelable0).getSuperState());
        this.o(((v2)parcelable0).b);
        this.requestLayout();
    }

    @Override  // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new v2(super.onSaveInstanceState());  // 初始化器: Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V
        parcelable0.b = this.isIconified();
        return parcelable0;
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.post(this.h0);
    }

    public final void p(boolean z) {
        int v = 8;
        if(this.a0 && !this.isIconified() && z) {
            this.u.setVisibility(8);
            v = 0;
        }
        this.w.setVisibility(v);
    }

    @Override  // android.view.ViewGroup
    public boolean requestFocus(int v, Rect rect0) {
        if(this.V) {
            return false;
        }
        if(!this.isFocusable()) {
            return false;
        }
        if(!this.isIconified()) {
            boolean z = this.p.requestFocus(v, rect0);
            if(z) {
                this.o(false);
            }
            return z;
        }
        return super.requestFocus(v, rect0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setAppSearchData(Bundle bundle0) {
        this.g0 = bundle0;
    }

    public void setIconified(boolean z) {
        if(z) {
            this.f();
            return;
        }
        this.o(false);
        this.p.requestFocus();
        this.p.setImeVisibility(true);
        View.OnClickListener view$OnClickListener0 = this.O;
        if(view$OnClickListener0 != null) {
            view$OnClickListener0.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if(this.P == z) {
            return;
        }
        this.P = z;
        this.o(z);
        this.l();
    }

    public void setImeOptions(int v) {
        this.p.setImeOptions(v);
    }

    public void setInputType(int v) {
        this.p.setInputType(v);
    }

    public void setMaxWidth(int v) {
        this.W = v;
        this.requestLayout();
    }

    public void setOnCloseListener(OnCloseListener searchView$OnCloseListener0) {
        this.L = searchView$OnCloseListener0;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener view$OnFocusChangeListener0) {
        this.M = view$OnFocusChangeListener0;
    }

    public void setOnQueryTextListener(OnQueryTextListener searchView$OnQueryTextListener0) {
        this.K = searchView$OnQueryTextListener0;
    }

    public void setOnSearchClickListener(View.OnClickListener view$OnClickListener0) {
        this.O = view$OnClickListener0;
    }

    public void setOnSuggestionListener(OnSuggestionListener searchView$OnSuggestionListener0) {
        this.N = searchView$OnSuggestionListener0;
    }

    private void setQuery(CharSequence charSequence0) {
        this.p.setText(charSequence0);
        int v = TextUtils.isEmpty(charSequence0) ? 0 : charSequence0.length();
        this.p.setSelection(v);
    }

    public void setQuery(CharSequence charSequence0, boolean z) {
        SearchAutoComplete searchView$SearchAutoComplete0 = this.p;
        searchView$SearchAutoComplete0.setText(charSequence0);
        if(charSequence0 != null) {
            searchView$SearchAutoComplete0.setSelection(searchView$SearchAutoComplete0.length());
            this.c0 = charSequence0;
        }
        if(z && !TextUtils.isEmpty(charSequence0)) {
            this.i();
        }
    }

    public void setQueryHint(@Nullable CharSequence charSequence0) {
        this.T = charSequence0;
        this.l();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.U = z;
        CursorAdapter cursorAdapter0 = this.R;
        if(cursorAdapter0 instanceof b3) {
            ((b3)cursorAdapter0).i = z ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo0) {
        this.f0 = searchableInfo0;
        Intent intent0 = null;
        boolean z = true;
        SearchAutoComplete searchView$SearchAutoComplete0 = this.p;
        if(searchableInfo0 != null) {
            searchView$SearchAutoComplete0.setThreshold(searchableInfo0.getSuggestThreshold());
            searchView$SearchAutoComplete0.setImeOptions(this.f0.getImeOptions());
            int v = this.f0.getInputType();
            if((v & 15) == 1) {
                v &= 0xFFFEFFFF;
                if(this.f0.getSuggestAuthority() != null) {
                    v |= 0x90000;
                }
            }
            searchView$SearchAutoComplete0.setInputType(v);
            CursorAdapter cursorAdapter0 = this.R;
            if(cursorAdapter0 != null) {
                cursorAdapter0.changeCursor(null);
            }
            if(this.f0.getSuggestAuthority() != null) {
                b3 b30 = new b3(this.getContext(), this, this.f0, this.j0);
                this.R = b30;
                searchView$SearchAutoComplete0.setAdapter(b30);
                ((b3)this.R).i = this.U ? 2 : 1;
            }
            this.l();
        }
        boolean z1 = false;
        if(this.f0 != null && this.f0.getVoiceSearchEnabled()) {
            if(this.f0.getVoiceSearchLaunchWebSearch()) {
                intent0 = this.H;
            }
            else if(this.f0.getVoiceSearchLaunchRecognizer()) {
                intent0 = this.I;
            }
            if(intent0 != null) {
                if(this.getContext().getPackageManager().resolveActivity(intent0, 0x10000) == null) {
                    z = false;
                }
                z1 = z;
            }
        }
        this.a0 = z1;
        if(z1) {
            searchView$SearchAutoComplete0.setPrivateImeOptions("nm");
        }
        this.o(this.isIconified());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.S = z;
        this.o(this.isIconified());
    }

    public void setSuggestionsAdapter(CursorAdapter cursorAdapter0) {
        this.R = cursorAdapter0;
        this.p.setAdapter(cursorAdapter0);
    }
}

