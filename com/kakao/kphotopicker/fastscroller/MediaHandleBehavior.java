package com.kakao.kphotopicker.fastscroller;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.view.View;
import androidx.annotation.AnimatorRes;
import com.futuremind.fastscroll.viewprovider.ViewBehavior;
import com.futuremind.fastscroll.viewprovider.VisibilityAnimationManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000EB\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\nJ\u000F\u0010\f\u001A\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000F\u0010\r\u001A\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\n¨\u0006\u000F"}, d2 = {"Lcom/kakao/kphotopicker/fastscroller/MediaHandleBehavior;", "Lcom/futuremind/fastscroll/viewprovider/ViewBehavior;", "Lcom/futuremind/fastscroll/viewprovider/VisibilityAnimationManager;", "visibilityManager", "Lcom/kakao/kphotopicker/fastscroller/MediaHandleBehavior$HandleAnimationManager;", "grabManager", "<init>", "(Lcom/futuremind/fastscroll/viewprovider/VisibilityAnimationManager;Lcom/kakao/kphotopicker/fastscroller/MediaHandleBehavior$HandleAnimationManager;)V", "", "onHandleGrabbed", "()V", "onHandleReleased", "onScrollStarted", "onScrollFinished", "HandleAnimationManager", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MediaHandleBehavior implements ViewBehavior {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/kakao/kphotopicker/fastscroller/MediaHandleBehavior$HandleAnimationManager;", "", "", "onGrab", "()V", "onRelease", "Builder", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class HandleAnimationManager {
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001A\u00020\u00002\b\b\u0001\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000B\u001A\u00020\u00002\b\b\u0001\u0010\n\u001A\u00020\u0006¢\u0006\u0004\b\u000B\u0010\tJ\r\u0010\r\u001A\u00020\f¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lcom/kakao/kphotopicker/fastscroller/MediaHandleBehavior$HandleAnimationManager$Builder;", "", "Landroid/view/View;", "handle", "<init>", "(Landroid/view/View;)V", "", "grabAnimator", "withGrabAnimator", "(I)Lcom/kakao/kphotopicker/fastscroller/MediaHandleBehavior$HandleAnimationManager$Builder;", "releaseAnimator", "withReleaseAnimator", "Lcom/kakao/kphotopicker/fastscroller/MediaHandleBehavior$HandleAnimationManager;", "build", "()Lcom/kakao/kphotopicker/fastscroller/MediaHandleBehavior$HandleAnimationManager;", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class Builder {
            public final View a;
            public int b;
            public int c;

            public Builder(@NotNull View view0) {
                Intrinsics.checkNotNullParameter(view0, "handle");
                super();
                this.a = view0;
                this.b = -1;
                this.c = -1;
            }

            @NotNull
            public final HandleAnimationManager build() {
                return new HandleAnimationManager(this.a, this.b, this.c, null);
            }

            @NotNull
            public final Builder withGrabAnimator(@AnimatorRes int v) {
                this.b = v;
                return this;
            }

            @NotNull
            public final Builder withReleaseAnimator(@AnimatorRes int v) {
                this.c = v;
                return this;
            }
        }

        public final AnimatorSet a;
        public final AnimatorSet b;

        public HandleAnimationManager(View view0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if(v != -1) {
                Animator animator0 = AnimatorInflater.loadAnimator(view0.getContext(), v);
                Intrinsics.checkNotNull(animator0, "null cannot be cast to non-null type android.animation.AnimatorSet");
                this.a = (AnimatorSet)animator0;
                Intrinsics.checkNotNull(((AnimatorSet)animator0));
                ((AnimatorSet)animator0).setTarget(view0);
            }
            if(v1 != -1) {
                Animator animator1 = AnimatorInflater.loadAnimator(view0.getContext(), v1);
                Intrinsics.checkNotNull(animator1, "null cannot be cast to non-null type android.animation.AnimatorSet");
                this.b = (AnimatorSet)animator1;
                Intrinsics.checkNotNull(((AnimatorSet)animator1));
                ((AnimatorSet)animator1).setTarget(view0);
            }
        }

        public final void onGrab() {
            AnimatorSet animatorSet0 = this.b;
            if(animatorSet0 != null) {
                animatorSet0.cancel();
            }
            AnimatorSet animatorSet1 = this.a;
            if(animatorSet1 != null) {
                animatorSet1.start();
            }
        }

        public final void onRelease() {
            AnimatorSet animatorSet0 = this.a;
            if(animatorSet0 != null) {
                animatorSet0.cancel();
            }
            AnimatorSet animatorSet1 = this.b;
            if(animatorSet1 != null) {
                animatorSet1.start();
            }
        }
    }

    public final VisibilityAnimationManager a;
    public final HandleAnimationManager b;
    public boolean c;

    public MediaHandleBehavior(@NotNull VisibilityAnimationManager visibilityAnimationManager0, @NotNull HandleAnimationManager mediaHandleBehavior$HandleAnimationManager0) {
        Intrinsics.checkNotNullParameter(visibilityAnimationManager0, "visibilityManager");
        Intrinsics.checkNotNullParameter(mediaHandleBehavior$HandleAnimationManager0, "grabManager");
        super();
        this.a = visibilityAnimationManager0;
        this.b = mediaHandleBehavior$HandleAnimationManager0;
    }

    @Override  // com.futuremind.fastscroll.viewprovider.ViewBehavior
    public void onHandleGrabbed() {
        this.c = true;
        this.a.show();
        this.b.onGrab();
    }

    @Override  // com.futuremind.fastscroll.viewprovider.ViewBehavior
    public void onHandleReleased() {
        this.c = false;
        this.a.hide();
        this.b.onRelease();
    }

    @Override  // com.futuremind.fastscroll.viewprovider.ViewBehavior
    public void onScrollFinished() {
        if(!this.c) {
            this.a.hide();
        }
    }

    @Override  // com.futuremind.fastscroll.viewprovider.ViewBehavior
    public void onScrollStarted() {
        this.a.show();
    }
}

