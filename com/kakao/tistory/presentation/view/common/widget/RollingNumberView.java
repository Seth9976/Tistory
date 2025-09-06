package com.kakao.tistory.presentation.view.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import com.kakao.tistory.presentation.R.anim;
import com.kakao.tistory.presentation.R.styleable;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.JobKt;
import lc.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0016\n\u0002\u0010\u000B\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u00015B\u0013\b\u0016\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001D\b\u0016\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u0004\u0010\u000BJ\u001F\u0010\u0011\u001A\u00020\u00102\u0006\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001A\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0015\u001A\u00020\u0010H\u0014¢\u0006\u0004\b\u0015\u0010\u0014R$\u0010\u001D\u001A\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001CR\"\u0010$\u001A\u00020\t8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010(\u001A\u00020\t8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b%\u0010\u001F\u001A\u0004\b&\u0010!\"\u0004\b\'\u0010#R\"\u0010,\u001A\u00020\t8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b)\u0010\u001F\u001A\u0004\b*\u0010!\"\u0004\b+\u0010#R\"\u00104\u001A\u00020-8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b.\u0010/\u001A\u0004\b0\u00101\"\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/widget/RollingNumberView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "count", "Lcom/kakao/tistory/presentation/view/common/widget/RollingNumberView$AnimateMode;", "animateMode", "", "setCount", "(JLcom/kakao/tistory/presentation/view/common/widget/RollingNumberView$AnimateMode;)V", "start", "()V", "onDetachedFromWindow", "", "e", "Ljava/lang/String;", "getInitValue", "()Ljava/lang/String;", "setInitValue", "(Ljava/lang/String;)V", "initValue", "f", "I", "getTextColor", "()I", "setTextColor", "(I)V", "textColor", "g", "getTextSizePX", "setTextSizePX", "textSizePX", "h", "getTextFontFamily", "setTextFontFamily", "textFontFamily", "", "i", "Z", "getTextBoldEnabled", "()Z", "setTextBoldEnabled", "(Z)V", "textBoldEnabled", "AnimateMode", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRollingNumberView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RollingNumberView.kt\ncom/kakao/tistory/presentation/view/common/widget/RollingNumberView\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,169:1\n970#2:170\n1041#2,3:171\n*S KotlinDebug\n*F\n+ 1 RollingNumberView.kt\ncom/kakao/tistory/presentation/view/common/widget/RollingNumberView\n*L\n91#1:170\n91#1:171,3\n*E\n"})
public final class RollingNumberView extends LinearLayout {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/widget/RollingNumberView$AnimateMode;", "", "IMMEDIATE", "ON_CALL", "NONE", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum AnimateMode {
        IMMEDIATE,
        ON_CALL,
        NONE;

        public static final AnimateMode[] a;
        public static final EnumEntries b;

        static {
            AnimateMode.a = arr_rollingNumberView$AnimateMode;
            Intrinsics.checkNotNullParameter(arr_rollingNumberView$AnimateMode, "entries");
            AnimateMode.b = new a(arr_rollingNumberView$AnimateMode);
        }

        @NotNull
        public static EnumEntries getEntries() {
            return AnimateMode.b;
        }
    }

    public static final int $stable = 8;
    public final int a;
    public final String b;
    public final long c;
    public final long d;
    public String e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public final ArrayList j;
    public List k;
    public int l;
    public final CompletableJob m;
    public final CoroutineScope n;

    public RollingNumberView(@Nullable Context context0) {
        this(context0, null);
    }

    public RollingNumberView(@Nullable Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public RollingNumberView(@Nullable Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = 100000;
        this.b = ",";
        this.c = 100L;
        this.d = 10L;
        this.f = 0xFF000000;
        this.g = 21;
        this.h = -1;
        this.j = new ArrayList();
        this.k = new ArrayList();
        CompletableJob completableJob0 = JobKt.Job$default(null, 1, null);
        this.m = completableJob0;
        this.n = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(completableJob0));
        if(context0 != null) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.RollingNumberView);
            if(typedArray0 != null) {
                this.f = typedArray0.getColor(styleable.RollingNumberView_numberColor, this.f);
                this.g = typedArray0.getDimensionPixelSize(styleable.RollingNumberView_numberSize, this.g);
                this.h = typedArray0.getResourceId(styleable.RollingNumberView_numberFontFamily, -1);
                this.i = typedArray0.getBoolean(styleable.RollingNumberView_numberBoldEnabled, false);
                typedArray0.getBoolean(styleable.RollingNumberView_commaEnabled, false);
                this.e = typedArray0.getString(styleable.RollingNumberView_initValue);
                typedArray0.recycle();
            }
        }
    }

    public static final View a(RollingNumberView rollingNumberView0) {
        Intrinsics.checkNotNullParameter(rollingNumberView0, "this$0");
        rollingNumberView0.getClass();
        View view0 = new TextView(rollingNumberView0.getContext());
        ((TextView)view0).setTextColor(rollingNumberView0.f);
        ((TextView)view0).setTextSize(0, ((float)rollingNumberView0.g));
        if(rollingNumberView0.h > -1) {
            ((TextView)view0).setTypeface(ResourcesCompat.getFont(view0.getContext(), rollingNumberView0.h));
        }
        if(rollingNumberView0.i) {
            ((TextView)view0).setTypeface(((TextView)view0).getTypeface(), 1);
        }
        return view0;
    }

    public final TextSwitcher a(String s) {
        TextSwitcher textSwitcher0 = new TextSwitcher(this.getContext());
        textSwitcher0.setFactory(new b(this));
        textSwitcher0.setTag(s);
        if(!Intrinsics.areEqual(s, this.b)) {
            String s1 = this.e;
            if(s1 != null) {
                s = s1;
            }
        }
        textSwitcher0.setCurrentText(s);
        Animation animation0 = AnimationUtils.loadAnimation(textSwitcher0.getContext(), anim.slide_in_up);
        animation0.setDuration(this.c * 2L);
        animation0.setInterpolator(new DecelerateInterpolator());
        textSwitcher0.setInAnimation(animation0);
        Animation animation1 = AnimationUtils.loadAnimation(textSwitcher0.getContext(), anim.slide_out_up);
        animation1.setDuration(this.c);
        animation1.setInterpolator(new AccelerateInterpolator());
        textSwitcher0.setOutAnimation(animation1);
        return textSwitcher0;
    }

    public final Object a(String s, Continuation continuation0) {
        RollingNumberView rollingNumberView1;
        int v4;
        int v3;
        int v2;
        RollingNumberView rollingNumberView0;
        int v1;
        com.kakao.tistory.presentation.view.common.widget.a a0;
        if(continuation0 instanceof com.kakao.tistory.presentation.view.common.widget.a) {
            a0 = (com.kakao.tistory.presentation.view.common.widget.a)continuation0;
            int v = a0.f;
            if((v & 0x80000000) == 0) {
                a0 = new com.kakao.tistory.presentation.view.common.widget.a(this, continuation0);
            }
            else {
                a0.f = v ^ 0x80000000;
            }
        }
        else {
            a0 = new com.kakao.tistory.presentation.view.common.widget.a(this, continuation0);
        }
        Object object0 = a0.d;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(a0.f) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(!new Regex("[0-9]").matches(s)) {
                    a0.f = 1;
                    return this.a(a0) == object1 ? object1 : Unit.INSTANCE;
                }
                v1 = Integer.parseInt(s);
                rollingNumberView0 = this;
                v2 = 1;
                goto label_37;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            case 2: {
                v3 = a0.c;
                v4 = a0.b;
                rollingNumberView1 = a0.a;
                ResultKt.throwOnFailure(object0);
                goto label_52;
            }
            case 3: {
                v3 = a0.c;
                v4 = a0.b;
                rollingNumberView1 = a0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            v2 = v3 + 1;
            v1 = v4;
            rollingNumberView0 = rollingNumberView1;
        label_37:
            if(v2 >= 11) {
                break;
            }
            int v5 = rollingNumberView0.l;
            if(v5 < 0) {
                break;
            }
            int v6 = (v1 + v2) % 10;
            ((TextSwitcher)rollingNumberView0.j.get(v5)).setText(String.valueOf(v6));
            if(v6 == v1) {
                a0.a = rollingNumberView0;
                a0.b = v1;
                a0.c = v2;
                a0.f = 2;
                if(rollingNumberView0.a(a0) == object1) {
                    return object1;
                }
            }
            rollingNumberView1 = rollingNumberView0;
            v4 = v1;
            v3 = v2;
        label_52:
            a0.a = rollingNumberView1;
            a0.b = v4;
            a0.c = v3;
            a0.f = 3;
            if(DelayKt.delay(rollingNumberView1.d, a0) != object1) {
                continue;
            }
            return object1;
        }
        return Unit.INSTANCE;
    }

    public final Object a(Continuation continuation0) {
        int v = this.l - 1;
        this.l = v;
        Logger.INSTANCE.log("startNext() currentIndex=" + v);
        int v1 = this.l;
        if(v1 >= 0) {
            Object object0 = this.a(((String)this.k.get(v1)), continuation0);
            return object0 == qd.a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final Object access$startNext(RollingNumberView rollingNumberView0, Continuation continuation0) {
        return rollingNumberView0.a(continuation0);
    }

    @Nullable
    public final String getInitValue() {
        return this.e;
    }

    public final boolean getTextBoldEnabled() {
        return this.i;
    }

    public final int getTextColor() {
        return this.f;
    }

    public final int getTextFontFamily() {
        return this.h;
    }

    public final int getTextSizePX() {
        return this.g;
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        Logger.INSTANCE.log("onDetachedFromWindow()");
        DefaultImpls.cancel$default(this.m, null, 1, null);
        super.onDetachedFromWindow();
    }

    public final void setCount(long v, @NotNull AnimateMode rollingNumberView$AnimateMode0) {
        Intrinsics.checkNotNullParameter(rollingNumberView$AnimateMode0, "animateMode");
        Logger.INSTANCE.log("setCount() count=" + v + ", animateMode=" + rollingNumberView$AnimateMode0);
        this.removeAllViews();
        this.j.clear();
        if(rollingNumberView$AnimateMode0 == AnimateMode.NONE) {
            TextView textView0 = new TextView(this.getContext());
            textView0.setTextColor(this.f);
            textView0.setTextSize(0, ((float)this.g));
            if(this.h > -1) {
                textView0.setTypeface(ResourcesCompat.getFont(textView0.getContext(), this.h));
            }
            if(this.i) {
                textView0.setTypeface(textView0.getTypeface(), 1);
            }
            textView0.setText((v <= ((long)this.a) ? new DecimalFormat("###,###").format(v) : StringUtils.INSTANCE.getEllipsisNumber(v, this.a)));
            this.addView(textView0);
            return;
        }
        if(v > ((long)this.a)) {
            TextSwitcher textSwitcher0 = this.a(String.valueOf(v));
            textSwitcher0.setText(StringUtils.INSTANCE.getEllipsisNumber(v, this.a));
            this.addView(textSwitcher0);
            return;
        }
        String s = new DecimalFormat("###,###").format(v);
        Intrinsics.checkNotNullExpressionValue(s, "format(...)");
        ArrayList arrayList0 = new ArrayList(s.length());
        for(int v1 = 0; v1 < s.length(); ++v1) {
            arrayList0.add(String.valueOf(s.charAt(v1)));
        }
        List list0 = CollectionsKt___CollectionsKt.toMutableList(arrayList0);
        this.k = list0;
        for(Object object0: list0) {
            TextSwitcher textSwitcher1 = this.a(((String)object0));
            this.j.add(textSwitcher1);
            this.addView(textSwitcher1);
        }
        if(rollingNumberView$AnimateMode0 == AnimateMode.IMMEDIATE) {
            this.start();
        }
    }

    public static void setCount$default(RollingNumberView rollingNumberView0, long v, AnimateMode rollingNumberView$AnimateMode0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            rollingNumberView$AnimateMode0 = AnimateMode.IMMEDIATE;
        }
        rollingNumberView0.setCount(v, rollingNumberView$AnimateMode0);
    }

    public final void setInitValue(@Nullable String s) {
        this.e = s;
    }

    public final void setTextBoldEnabled(boolean z) {
        this.i = z;
    }

    public final void setTextColor(int v) {
        this.f = v;
    }

    public final void setTextFontFamily(int v) {
        this.h = v;
    }

    public final void setTextSizePX(int v) {
        this.g = v;
    }

    public final void start() {
        if(!this.k.isEmpty() && !this.j.isEmpty()) {
            this.l = this.k.size() - 1;
            com.kakao.tistory.presentation.view.common.widget.b b0 = new com.kakao.tistory.presentation.view.common.widget.b(this, null);
            BuildersKt.launch$default(this.n, null, null, b0, 3, null);
        }
    }
}

