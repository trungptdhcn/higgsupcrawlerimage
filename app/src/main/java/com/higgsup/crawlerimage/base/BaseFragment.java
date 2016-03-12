package com.higgsup.crawlerimage.base;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import org.greenrobot.eventbus.EventBus;

/**
 * Created by trung on 03/12/2016.
 */
public abstract class BaseFragment extends Fragment
{
    private View rootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(getLayout(), container, false);
        ButterKnife.bind(this, rootView);
        setDataToView(savedInstanceState);
//        if (!EventBus.getDefault().isRegistered(this))
//        {
//            EventBus.getDefault().register(this);
//        }
        return rootView;
    }

    protected abstract int getLayout();

    protected abstract void setDataToView(Bundle savedInstanceState);
}
