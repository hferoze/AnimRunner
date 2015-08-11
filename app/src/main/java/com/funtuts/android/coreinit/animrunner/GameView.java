package com.funtuts.android.coreinit.animrunner;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class GameView extends SurfaceView{

    private final static String LOG_TAG = GameView.class.getSimpleName();
    private SurfaceHolder surfaceHolder;
    private Context mContext;

    public GameView(Context context) {
        super(context);
        init(context);
    }

    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public GameView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    protected void init(Context ctx) {
        mContext = ctx;
        surfaceHolder = getHolder();
        surfaceHolder.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(SurfaceHolder holder) {
                Log.d(LOG_TAG, " surfaceCreated " + " screen width: " + getWidth() + " screen height: " + getHeight());
            }
            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
                Log.d(LOG_TAG, " surfaceChanged " + " screen width: " + getWidth() + " screen height: " + getHeight());
            }
            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {
                Log.d(LOG_TAG, " surfaceDestroyed ");
            }
        });
    }
}
