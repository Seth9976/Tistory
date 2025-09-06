package com.futuremind.fastscroll.viewprovider;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.futuremind.fastscroll.FastScroller;

public abstract class ScrollerViewProvider {
    public FastScroller a;
    public ViewBehavior b;
    public ViewBehavior c;

    public ViewBehavior getBubbleBehavior() {
        if(this.c == null) {
            this.c = this.provideBubbleBehavior();
        }
        return this.c;
    }

    public abstract int getBubbleOffset();

    public Context getContext() {
        return this.a.getContext();
    }

    public ViewBehavior getHandleBehavior() {
        if(this.b == null) {
            this.b = this.provideHandleBehavior();
        }
        return this.b;
    }

    public FastScroller getScroller() {
        return this.a;
    }

    public void onHandleGrabbed() {
        if(this.getHandleBehavior() != null) {
            this.getHandleBehavior().onHandleGrabbed();
        }
        if(this.getBubbleBehavior() != null) {
            this.getBubbleBehavior().onHandleGrabbed();
        }
    }

    public void onHandleReleased() {
        if(this.getHandleBehavior() != null) {
            this.getHandleBehavior().onHandleReleased();
        }
        if(this.getBubbleBehavior() != null) {
            this.getBubbleBehavior().onHandleReleased();
        }
    }

    public void onScrollFinished() {
        if(this.getHandleBehavior() != null) {
            this.getHandleBehavior().onScrollFinished();
        }
        if(this.getBubbleBehavior() != null) {
            this.getBubbleBehavior().onScrollFinished();
        }
    }

    public void onScrollStarted() {
        if(this.getHandleBehavior() != null) {
            this.getHandleBehavior().onScrollStarted();
        }
        if(this.getBubbleBehavior() != null) {
            this.getBubbleBehavior().onScrollStarted();
        }
    }

    @Nullable
    public abstract ViewBehavior provideBubbleBehavior();

    public abstract TextView provideBubbleTextView();

    public abstract View provideBubbleView(ViewGroup arg1);

    @Nullable
    public abstract ViewBehavior provideHandleBehavior();

    public abstract View provideHandleView(ViewGroup arg1);

    public void setFastScroller(FastScroller fastScroller0) {
        this.a = fastScroller0;
    }
}

