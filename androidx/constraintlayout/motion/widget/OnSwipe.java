package androidx.constraintlayout.motion.widget;

public class OnSwipe {
    public static final int COMPLETE_MODE_CONTINUOUS_VELOCITY = 0;
    public static final int COMPLETE_MODE_SPRING = 1;
    public static final int DRAG_ANTICLOCKWISE = 7;
    public static final int DRAG_CLOCKWISE = 6;
    public static final int DRAG_DOWN = 1;
    public static final int DRAG_END = 5;
    public static final int DRAG_LEFT = 2;
    public static final int DRAG_RIGHT = 3;
    public static final int DRAG_START = 4;
    public static final int DRAG_UP = 0;
    public static final int FLAG_DISABLE_POST_SCROLL = 1;
    public static final int FLAG_DISABLE_SCROLL = 2;
    public static final int ON_UP_AUTOCOMPLETE = 0;
    public static final int ON_UP_AUTOCOMPLETE_TO_END = 2;
    public static final int ON_UP_AUTOCOMPLETE_TO_START = 1;
    public static final int ON_UP_DECELERATE = 4;
    public static final int ON_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int ON_UP_NEVER_TO_END = 7;
    public static final int ON_UP_NEVER_TO_START = 6;
    public static final int ON_UP_STOP = 3;
    public static final int SIDE_BOTTOM = 3;
    public static final int SIDE_END = 6;
    public static final int SIDE_LEFT = 1;
    public static final int SIDE_MIDDLE = 4;
    public static final int SIDE_RIGHT = 2;
    public static final int SIDE_START = 5;
    public static final int SIDE_TOP = 0;
    public static final int SPRING_BOUNDARY_BOUNCEBOTH = 3;
    public static final int SPRING_BOUNDARY_BOUNCEEND = 2;
    public static final int SPRING_BOUNDARY_BOUNCESTART = 1;
    public static final int SPRING_BOUNDARY_OVERSHOOT;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public float h;
    public float i;
    public boolean j;
    public float k;
    public int l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public int r;
    public int s;

    public OnSwipe() {
        this.a = 0;
        this.b = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = 0;
        this.g = -1;
        this.h = 4.0f;
        this.i = 1.2f;
        this.j = true;
        this.k = 1.0f;
        this.l = 0;
        this.m = 10.0f;
        this.n = NaNf;
        this.o = 1.0f;
        this.p = NaNf;
        this.q = NaNf;
        this.r = 0;
        this.s = 0;
    }

    public int getAutoCompleteMode() {
        return this.s;
    }

    public int getDragDirection() {
        return this.a;
    }

    public float getDragScale() {
        return this.k;
    }

    public float getDragThreshold() {
        return this.m;
    }

    public int getLimitBoundsTo() {
        return this.e;
    }

    public float getMaxAcceleration() {
        return this.i;
    }

    public float getMaxVelocity() {
        return this.h;
    }

    public boolean getMoveWhenScrollAtTop() {
        return this.j;
    }

    public int getNestedScrollFlags() {
        return this.l;
    }

    public int getOnTouchUp() {
        return this.f;
    }

    public int getRotationCenterId() {
        return this.g;
    }

    public int getSpringBoundary() {
        return this.r;
    }

    public float getSpringDamping() {
        return this.n;
    }

    public float getSpringMass() {
        return this.o;
    }

    public float getSpringStiffness() {
        return this.p;
    }

    public float getSpringStopThreshold() {
        return this.q;
    }

    public int getTouchAnchorId() {
        return this.c;
    }

    public int getTouchAnchorSide() {
        return this.b;
    }

    public int getTouchRegionId() {
        return this.d;
    }

    public void setAutoCompleteMode(int v) {
        this.s = v;
    }

    public OnSwipe setDragDirection(int v) {
        this.a = v;
        return this;
    }

    public OnSwipe setDragScale(int v) {
        this.k = (float)v;
        return this;
    }

    public OnSwipe setDragThreshold(int v) {
        this.m = (float)v;
        return this;
    }

    public OnSwipe setLimitBoundsTo(int v) {
        this.e = v;
        return this;
    }

    public OnSwipe setMaxAcceleration(int v) {
        this.i = (float)v;
        return this;
    }

    public OnSwipe setMaxVelocity(int v) {
        this.h = (float)v;
        return this;
    }

    public OnSwipe setMoveWhenScrollAtTop(boolean z) {
        this.j = z;
        return this;
    }

    public OnSwipe setNestedScrollFlags(int v) {
        this.l = v;
        return this;
    }

    public OnSwipe setOnTouchUp(int v) {
        this.f = v;
        return this;
    }

    public OnSwipe setRotateCenter(int v) {
        this.g = v;
        return this;
    }

    public OnSwipe setSpringBoundary(int v) {
        this.r = v;
        return this;
    }

    public OnSwipe setSpringDamping(float f) {
        this.n = f;
        return this;
    }

    public OnSwipe setSpringMass(float f) {
        this.o = f;
        return this;
    }

    public OnSwipe setSpringStiffness(float f) {
        this.p = f;
        return this;
    }

    public OnSwipe setSpringStopThreshold(float f) {
        this.q = f;
        return this;
    }

    public OnSwipe setTouchAnchorId(int v) {
        this.c = v;
        return this;
    }

    public OnSwipe setTouchAnchorSide(int v) {
        this.b = v;
        return this;
    }

    public OnSwipe setTouchRegionId(int v) {
        this.d = v;
        return this;
    }
}

