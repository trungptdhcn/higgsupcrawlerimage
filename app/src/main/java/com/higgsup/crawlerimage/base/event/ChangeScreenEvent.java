package com.higgsup.crawlerimage.base.event;

import com.higgsup.crawlerimage.base.BaseFragment;

/**
 * Created by trung on 03/12/2016.
 */
public class ChangeScreenEvent
{
    private BaseFragment fragment;

    public ChangeScreenEvent(BaseFragment fragment)
    {
        this.fragment = fragment;
    }

    public BaseFragment getFragment()
    {
        return fragment;
    }
}
