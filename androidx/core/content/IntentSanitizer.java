package androidx.core.content;

import a5.b;
import android.annotation.SuppressLint;
import android.content.ClipData.Item;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import androidx.core.util.Predicate;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import m3.d;

public class IntentSanitizer {
    public static final class Builder {
        public int a;
        public Predicate b;
        public Predicate c;
        public Predicate d;
        public Predicate e;
        public Predicate f;
        public Predicate g;
        public boolean h;
        public boolean i;
        public final HashMap j;
        public boolean k;
        public Predicate l;
        public Predicate m;
        public boolean n;
        public boolean o;
        public boolean p;

        public Builder() {
            this.b = new p(2);
            this.c = new p(3);
            this.d = new p(2);
            this.e = new p(2);
            this.f = new p(2);
            this.g = new p(4);
            this.j = new HashMap();
            this.k = false;
            this.l = new p(3);
            this.m = new p(5);
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowAction(@NonNull Predicate predicate0) {
            Preconditions.checkNotNull(predicate0);
            this.b = this.b.or(predicate0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowAction(@NonNull String s) {
            Preconditions.checkNotNull(s);
            Objects.requireNonNull(s);
            this.allowAction(new n(s, 3));
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowAnyComponent() {
            this.h = true;
            this.g = new p(0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowCategory(@NonNull Predicate predicate0) {
            Preconditions.checkNotNull(predicate0);
            this.e = this.e.or(predicate0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowCategory(@NonNull String s) {
            Preconditions.checkNotNull(s);
            Objects.requireNonNull(s);
            return this.allowCategory(new n(s, 3));
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowClipData(@NonNull Predicate predicate0) {
            Preconditions.checkNotNull(predicate0);
            this.m = this.m.or(predicate0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowClipDataText() {
            this.k = true;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowClipDataUri(@NonNull Predicate predicate0) {
            Preconditions.checkNotNull(predicate0);
            this.l = this.l.or(predicate0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowClipDataUriWithAuthority(@NonNull String s) {
            Preconditions.checkNotNull(s);
            return this.allowClipDataUri(new n(s, 1));
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowComponent(@NonNull ComponentName componentName0) {
            Preconditions.checkNotNull(componentName0);
            Objects.requireNonNull(componentName0);
            return this.allowComponent(new o(componentName0, 0));
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowComponent(@NonNull Predicate predicate0) {
            Preconditions.checkNotNull(predicate0);
            this.i = true;
            this.g = this.g.or(predicate0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowComponentWithPackage(@NonNull String s) {
            Preconditions.checkNotNull(s);
            return this.allowComponent(new n(s, 4));
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowData(@NonNull Predicate predicate0) {
            Preconditions.checkNotNull(predicate0);
            this.c = this.c.or(predicate0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowDataWithAuthority(@NonNull String s) {
            Preconditions.checkNotNull(s);
            this.allowData(new n(s, 5));
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowExtra(@NonNull String s, @NonNull Predicate predicate0) {
            Preconditions.checkNotNull(s);
            Preconditions.checkNotNull(predicate0);
            HashMap hashMap0 = this.j;
            Predicate predicate1 = (Predicate)hashMap0.get(s);
            if(predicate1 == null) {
                predicate1 = new p(1);
            }
            hashMap0.put(s, predicate1.or(predicate0));
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowExtra(@NonNull String s, @NonNull Class class0) {
            return this.allowExtra(s, class0, new p(6));
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowExtra(@NonNull String s, @NonNull Class class0, @NonNull Predicate predicate0) {
            Preconditions.checkNotNull(s);
            Preconditions.checkNotNull(class0);
            Preconditions.checkNotNull(predicate0);
            return this.allowExtra(s, new d(class0, predicate0));
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowExtraOutput(@NonNull Predicate predicate0) {
            this.allowExtra("output", Uri.class, predicate0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowExtraOutput(@NonNull String s) {
            n n0 = new n(s, 0);
            this.allowExtra("output", Uri.class, n0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowExtraStream(@NonNull Predicate predicate0) {
            this.allowExtra("android.intent.extra.STREAM", Uri.class, predicate0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowExtraStreamUriWithAuthority(@NonNull String s) {
            Preconditions.checkNotNull(s);
            n n0 = new n(s, 2);
            this.allowExtra("android.intent.extra.STREAM", Uri.class, n0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowFlags(int v) {
            this.a |= v;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowHistoryStackFlags() {
            this.a |= 0x7DEBF000;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowIdentifier() {
            this.n = true;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowPackage(@NonNull Predicate predicate0) {
            Preconditions.checkNotNull(predicate0);
            this.f = this.f.or(predicate0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowPackage(@NonNull String s) {
            Preconditions.checkNotNull(s);
            Objects.requireNonNull(s);
            return this.allowPackage(new n(s, 3));
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowReceiverFlags() {
            this.a |= 0x78200000;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowSelector() {
            this.o = true;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowSourceBounds() {
            this.p = true;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowType(@NonNull Predicate predicate0) {
            Preconditions.checkNotNull(predicate0);
            this.d = this.d.or(predicate0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NonNull
        public Builder allowType(@NonNull String s) {
            Preconditions.checkNotNull(s);
            Objects.requireNonNull(s);
            return this.allowType(new n(s, 3));
        }

        @NonNull
        public IntentSanitizer build() {
            boolean z = this.h;
            if(z && this.i || !z && !this.i) {
                throw new SecurityException("You must call either allowAnyComponent or one or more of the allowComponent methods; but not both.");
            }
            IntentSanitizer intentSanitizer0 = new IntentSanitizer();  // 初始化器: Ljava/lang/Object;-><init>()V
            intentSanitizer0.a = this.a;
            intentSanitizer0.b = this.b;
            intentSanitizer0.c = this.c;
            intentSanitizer0.d = this.d;
            intentSanitizer0.e = this.e;
            intentSanitizer0.f = this.f;
            intentSanitizer0.h = z;
            intentSanitizer0.g = this.g;
            intentSanitizer0.i = this.j;
            intentSanitizer0.j = this.k;
            intentSanitizer0.k = this.l;
            intentSanitizer0.l = this.m;
            intentSanitizer0.m = this.n;
            intentSanitizer0.n = this.o;
            intentSanitizer0.o = this.p;
            return intentSanitizer0;
        }
    }

    public int a;
    public Predicate b;
    public Predicate c;
    public Predicate d;
    public Predicate e;
    public Predicate f;
    public Predicate g;
    public boolean h;
    public HashMap i;
    public boolean j;
    public Predicate k;
    public Predicate l;
    public boolean m;
    public boolean n;
    public boolean o;

    @NonNull
    public Intent sanitize(@NonNull Intent intent0, @NonNull Consumer consumer0) {
        Uri uri1;
        CharSequence charSequence0;
        Intent intent1 = new Intent();
        ComponentName componentName0 = intent0.getComponent();
        if((!this.h || componentName0 != null) && !this.g.test(componentName0)) {
            consumer0.accept("Component is not allowed: " + componentName0);
            intent1.setComponent(new ComponentName("android", "java.lang.Void"));
        }
        else {
            intent1.setComponent(componentName0);
        }
        String s = intent0.getPackage();
        if(s == null || this.f.test(s)) {
            intent1.setPackage(s);
        }
        else {
            consumer0.accept("Package is not allowed: " + s);
        }
        int v = this.a;
        int v1 = intent0.getFlags();
        int v2 = this.a;
        if((v | v1) == v2) {
            intent1.setFlags(intent0.getFlags());
        }
        else {
            intent1.setFlags(intent0.getFlags() & v2);
            consumer0.accept("The intent contains flags that are not allowed: 0x" + Integer.toHexString(intent0.getFlags() & ~this.a));
        }
        String s1 = intent0.getAction();
        if(s1 == null || this.b.test(s1)) {
            intent1.setAction(s1);
        }
        else {
            consumer0.accept("Action is not allowed: " + s1);
        }
        Uri uri0 = intent0.getData();
        if(uri0 == null || this.c.test(uri0)) {
            intent1.setData(uri0);
        }
        else {
            consumer0.accept("Data is not allowed: " + uri0);
        }
        String s2 = intent0.getType();
        if(s2 == null || this.d.test(s2)) {
            intent1.setDataAndType(intent1.getData(), s2);
        }
        else {
            consumer0.accept("Type is not allowed: " + s2);
        }
        Set set0 = intent0.getCategories();
        if(set0 != null) {
            for(Object object0: set0) {
                String s3 = (String)object0;
                if(this.e.test(s3)) {
                    intent1.addCategory(s3);
                }
                else {
                    consumer0.accept("Category is not allowed: " + s3);
                }
            }
        }
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 != null) {
            for(Object object1: bundle0.keySet()) {
                String s4 = (String)object1;
                if(s4.equals("android.intent.extra.STREAM") && (this.a & 1) == 0) {
                    consumer0.accept("Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.");
                }
                else if(s4.equals("output") && (~this.a & 3) != 0) {
                    consumer0.accept("Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.");
                }
                else {
                    Object object2 = bundle0.get(s4);
                    Predicate predicate0 = (Predicate)this.i.get(s4);
                    if(predicate0 != null && predicate0.test(object2)) {
                        if(object2 == null) {
                            intent1.getExtras().putString(s4, null);
                        }
                        else if(object2 instanceof Parcelable) {
                            intent1.putExtra(s4, ((Parcelable)object2));
                        }
                        else if(object2 instanceof Parcelable[]) {
                            intent1.putExtra(s4, ((Parcelable[])object2));
                        }
                        else {
                            if(!(object2 instanceof Serializable)) {
                                throw new IllegalArgumentException("Unsupported type " + object2.getClass());
                            }
                            intent1.putExtra(s4, ((Serializable)object2));
                        }
                        continue;
                    }
                    consumer0.accept("Extra is not allowed. Key: " + s4 + ". Value: " + object2);
                }
            }
        }
        Predicate predicate1 = this.l;
        boolean z = this.j;
        Predicate predicate2 = this.k;
        ClipData clipData0 = intent0.getClipData();
        if(clipData0 != null) {
            if(predicate1 == null || !predicate1.test(clipData0)) {
                ClipData clipData1 = null;
                for(int v3 = 0; v3 < clipData0.getItemCount(); ++v3) {
                    ClipData.Item clipData$Item0 = clipData0.getItemAt(v3);
                    if(Build.VERSION.SDK_INT >= 0x1F) {
                        m.a(v3, clipData$Item0, consumer0);
                    }
                    else if(clipData$Item0.getHtmlText() != null || clipData$Item0.getIntent() != null) {
                        consumer0.accept("ClipData item at position " + v3 + " contains htmlText, textLinks or intent: " + clipData$Item0);
                    }
                    if(z) {
                        charSequence0 = clipData$Item0.getText();
                    }
                    else {
                        if(clipData$Item0.getText() != null) {
                            StringBuilder stringBuilder0 = b.s(v3, "Item text cannot contain value. Item position: ", ". Text: ");
                            stringBuilder0.append(clipData$Item0.getText());
                            consumer0.accept(stringBuilder0.toString());
                        }
                        charSequence0 = null;
                    }
                    if(predicate2 == null) {
                        if(clipData$Item0.getUri() != null) {
                            StringBuilder stringBuilder1 = b.s(v3, "Item URI is not allowed. Item position: ", ". URI: ");
                            stringBuilder1.append(clipData$Item0.getUri());
                            consumer0.accept(stringBuilder1.toString());
                        }
                        uri1 = null;
                    }
                    else if(clipData$Item0.getUri() == null || predicate2.test(clipData$Item0.getUri())) {
                        uri1 = clipData$Item0.getUri();
                    }
                    else {
                        StringBuilder stringBuilder2 = b.s(v3, "Item URI is not allowed. Item position: ", ". URI: ");
                        stringBuilder2.append(clipData$Item0.getUri());
                        consumer0.accept(stringBuilder2.toString());
                        uri1 = null;
                    }
                    if(charSequence0 != null || uri1 != null) {
                        if(clipData1 == null) {
                            clipData1 = new ClipData(clipData0.getDescription(), new ClipData.Item(charSequence0, null, uri1));
                        }
                        else {
                            clipData1.addItem(new ClipData.Item(charSequence0, null, uri1));
                        }
                    }
                }
                if(clipData1 != null) {
                    intent1.setClipData(clipData1);
                }
            }
            else {
                intent1.setClipData(clipData0);
            }
        }
        if(Build.VERSION.SDK_INT >= 29) {
            if(this.m) {
                l.b(intent1, l.a(intent0));
            }
            else if(l.a(intent0) != null) {
                consumer0.accept("Identifier is not allowed: " + l.a(intent0));
            }
        }
        if(this.n) {
            intent1.setSelector(intent0.getSelector());
        }
        else if(intent0.getSelector() != null) {
            consumer0.accept("Selector is not allowed: " + intent0.getSelector());
        }
        if(this.o) {
            intent1.setSourceBounds(intent0.getSourceBounds());
            return intent1;
        }
        if(intent0.getSourceBounds() != null) {
            consumer0.accept("SourceBounds is not allowed: " + intent0.getSourceBounds());
        }
        return intent1;
    }

    @NonNull
    public Intent sanitizeByFiltering(@NonNull Intent intent0) {
        return this.sanitize(intent0, new k(1));
    }

    @NonNull
    public Intent sanitizeByThrowing(@NonNull Intent intent0) {
        return this.sanitize(intent0, new k(0));
    }
}

