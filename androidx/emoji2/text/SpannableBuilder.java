package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class SpannableBuilder extends SpannableStringBuilder {
    public final Class a;
    public final ArrayList b;

    public SpannableBuilder(Class class0, SpannableBuilder spannableBuilder0, int v, int v1) {
        super(spannableBuilder0, v, v1);
        this.b = new ArrayList();
        Preconditions.checkNotNull(class0, "watcherClass cannot be null");
        this.a = class0;
    }

    public SpannableBuilder(Class class0, CharSequence charSequence0) {
        super(charSequence0);
        this.b = new ArrayList();
        Preconditions.checkNotNull(class0, "watcherClass cannot be null");
        this.a = class0;
    }

    public final void a() {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.b;
            if(v >= arrayList0.size()) {
                break;
            }
            ((b0)arrayList0.get(v)).b.incrementAndGet();
        }
    }

    @Override  // android.text.SpannableStringBuilder
    @NonNull
    public Editable append(char c) {
        return this.append(c);
    }

    @Override  // android.text.SpannableStringBuilder
    @NonNull
    public Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence0) {
        return this.append(charSequence0);
    }

    @Override  // android.text.SpannableStringBuilder
    @NonNull
    public Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence0, int v, int v1) {
        return this.append(charSequence0, v, v1);
    }

    @Override  // android.text.SpannableStringBuilder
    @NonNull
    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    @NonNull
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence0) {
        super.append(charSequence0);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    @NonNull
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence0, int v, int v1) {
        super.append(charSequence0, v, v1);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence0, Object object0, int v) {
        super.append(charSequence0, object0, v);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    @NonNull
    public Appendable append(char c) throws IOException {
        return this.append(c);
    }

    @Override  // android.text.SpannableStringBuilder
    @NonNull
    public Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence0) throws IOException {
        return this.append(charSequence0);
    }

    @Override  // android.text.SpannableStringBuilder
    @NonNull
    public Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence0, int v, int v1) throws IOException {
        return this.append(charSequence0, v, v1);
    }

    public final b0 b(Object object0) {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.b;
            if(v >= arrayList0.size()) {
                break;
            }
            b0 b00 = (b0)arrayList0.get(v);
            if(b00.a == object0) {
                return b00;
            }
        }
        return null;
    }

    @RestrictTo({Scope.LIBRARY})
    public void beginBatchEdit() {
        this.a();
    }

    public final boolean c(Object object0) {
        if(object0 != null) {
            Class class0 = object0.getClass();
            return this.a == class0;
        }
        return false;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static SpannableBuilder create(@NonNull Class class0, @NonNull CharSequence charSequence0) {
        return new SpannableBuilder(class0, charSequence0);
    }

    public final void d() {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.b;
            if(v >= arrayList0.size()) {
                break;
            }
            ((b0)arrayList0.get(v)).b.decrementAndGet();
        }
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public Editable delete(int v, int v1) {
        return this.delete(v, v1);
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int v, int v1) {
        super.delete(v, v1);
        return this;
    }

    @RestrictTo({Scope.LIBRARY})
    public void endBatchEdit() {
        this.d();
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.b;
            if(v >= arrayList0.size()) {
                break;
            }
            ((b0)arrayList0.get(v)).onTextChanged(this, 0, this.length(), this.length());
        }
    }

    @Override  // android.text.SpannableStringBuilder
    public int getSpanEnd(@Nullable Object object0) {
        if(this.c(object0)) {
            b0 b00 = this.b(object0);
            if(b00 != null) {
                object0 = b00;
            }
        }
        return super.getSpanEnd(object0);
    }

    @Override  // android.text.SpannableStringBuilder
    public int getSpanFlags(@Nullable Object object0) {
        if(this.c(object0)) {
            b0 b00 = this.b(object0);
            if(b00 != null) {
                object0 = b00;
            }
        }
        return super.getSpanFlags(object0);
    }

    @Override  // android.text.SpannableStringBuilder
    public int getSpanStart(@Nullable Object object0) {
        if(this.c(object0)) {
            b0 b00 = this.b(object0);
            if(b00 != null) {
                object0 = b00;
            }
        }
        return super.getSpanStart(object0);
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public Object[] getSpans(int v, int v1, @NonNull Class class0) {
        if(this.a == class0) {
            b0[] arr_b0 = (b0[])super.getSpans(v, v1, b0.class);
            Object[] arr_object = (Object[])Array.newInstance(class0, arr_b0.length);
            for(int v2 = 0; v2 < arr_b0.length; ++v2) {
                arr_object[v2] = arr_b0[v2].a;
            }
            return arr_object;
        }
        return super.getSpans(v, v1, class0);
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public Editable insert(int v, CharSequence charSequence0) {
        return this.insert(v, charSequence0);
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public Editable insert(int v, CharSequence charSequence0, int v1, int v2) {
        return this.insert(v, charSequence0, v1, v2);
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int v, CharSequence charSequence0) {
        super.insert(v, charSequence0);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int v, CharSequence charSequence0, int v1, int v2) {
        super.insert(v, charSequence0, v1, v2);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    public int nextSpanTransition(int v, int v1, @Nullable Class class0) {
        if(class0 == null || this.a == class0) {
            class0 = b0.class;
        }
        return super.nextSpanTransition(v, v1, class0);
    }

    @Override  // android.text.SpannableStringBuilder
    public void removeSpan(@Nullable Object object0) {
        b0 b00;
        if(this.c(object0)) {
            b00 = this.b(object0);
            if(b00 != null) {
                object0 = b00;
            }
        }
        else {
            b00 = null;
        }
        super.removeSpan(object0);
        if(b00 != null) {
            this.b.remove(b00);
        }
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public Editable replace(int v, int v1, CharSequence charSequence0) {
        return this.replace(v, v1, charSequence0);
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public Editable replace(int v, int v1, CharSequence charSequence0, int v2, int v3) {
        return this.replace(v, v1, charSequence0, v2, v3);
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int v, int v1, CharSequence charSequence0) {
        this.a();
        super.replace(v, v1, charSequence0);
        this.d();
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int v, int v1, CharSequence charSequence0, int v2, int v3) {
        this.a();
        super.replace(v, v1, charSequence0, v2, v3);
        this.d();
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    public void setSpan(@Nullable Object object0, int v, int v1, int v2) {
        if(this.c(object0)) {
            b0 b00 = new b0(object0);
            this.b.add(b00);
            object0 = b00;
        }
        super.setSpan(object0, v, v1, v2);
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int v, int v1) {
        return new SpannableBuilder(this.a, this, v, v1);
    }
}

